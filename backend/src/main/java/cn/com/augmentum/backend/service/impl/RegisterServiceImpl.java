package cn.com.augmentum.backend.service.impl;

import cn.com.augmentum.backend.dao.RegisterMapperCustom;
import cn.com.augmentum.backend.enums.RegisterStatusEnum;
import cn.com.augmentum.backend.enums.ResultEnum;
import cn.com.augmentum.backend.exception.TrainingException;
import cn.com.augmentum.backend.service.DeptService;
import cn.com.augmentum.backend.util.DateUtil;
import cn.com.augmentum.backend.util.UUIDUtil;
import cn.com.augmentum.backend.dao.RegisterMapper;
import cn.com.augmentum.backend.pageUtil.PageRequest;
import cn.com.augmentum.backend.pageUtil.PageResult;
import cn.com.augmentum.backend.pageUtil.PageUtils;
import cn.com.augmentum.backend.model.Register;
import cn.com.augmentum.backend.service.RegisterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;



@Service
public class RegisterServiceImpl implements RegisterService {


    @Autowired
    private RegisterMapper registerMapper;

    @Autowired
    private RegisterMapperCustom registerMapperCustom;

    @Autowired
    private DeptService deptService;

    private final Integer number=1;

    @Override
    @Transactional
    public void saveRegister(Register register) {

        if(register.getDeptId() == null){
            throw new TrainingException(ResultEnum.PARAM_ERROR);
        }

        register.setId(UUIDUtil.getUuid());
        register.setNum(registrationGenerate(register.getDeptId()));
        register.setUpdateTime(new Date());
        register.setCreateTime(new Date());

        int status=registerMapper.insertSelective(register);

        if(status != number){
            throw new TrainingException(ResultEnum.UPDATE_FAIL);
        }

    }

    @Override
    public PageResult findRegister(Register register, PageRequest pageRequest) {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        hashMap.put("register", register);

        PageResult pageResult = selectListPage(hashMap,pageRequest);
        return pageResult;
    }

    @Override
    @Transactional
    public void updateStatus(Register register) {
        if (register.getStatus() == null || register.getId() == null) {
            throw new TrainingException(ResultEnum.PARAM_ERROR);
        }

        Integer status=registerMapperCustom.selectStatusByPrimaryKey(register.getId());

        //Illegal rollback of state
        if(register.getStatus() >= number && register.getStatus()<= status){
            throw new TrainingException(ResultEnum.STATUS_ERROR);
        }

        //Status has been invalidated or status update has exceeded its authority
        if(status == RegisterStatusEnum.INVALIDATED.getCode() || register.getStatus() > (status + number)){
            throw new TrainingException(ResultEnum.STATUS_ERROR);
        }

        registerMapper.updateByPrimaryKeySelective(register);
    }

    @Override
    @Transactional
    public void deleteRegister(String id) {
        Integer status=registerMapperCustom.selectStatusByPrimaryKey(id);

        if(status != RegisterStatusEnum.WAITING.getCode()){
            throw new TrainingException(ResultEnum.STATUS_ERROR);
        }

        registerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Integer> findAllStatus() {
        return registerMapperCustom.selectAllStatus();
    }


    private PageResult selectListPage(HashMap<Object, Object> hashMap, PageRequest pageRequest){
        PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
        List<Register> list = registerMapperCustom.selectByCondition(hashMap);
        PageResult pageResult = PageUtils.getPageResult(new PageInfo<>(list));
        return pageResult;
    }

    //Generate order number based on department
    private String registrationGenerate(String deptId){
        Integer deptNum = deptService.findNumById(deptId);

        Register register = registerMapperCustom.selectMaxNumByDeptId(deptId);
        if(register == null || DateUtil.noNewDate(register.getCreateTime())){
            return deptNum+ DateUtil.getDateNow() + number;
        }

        Integer suffixNum = Integer.parseInt(register.getNum().substring(11)) + number;
        return deptNum + DateUtil.getDateNow() + suffixNum;
    }


}
