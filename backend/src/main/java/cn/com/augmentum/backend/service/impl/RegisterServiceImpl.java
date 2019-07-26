//package cn.com.augmentum.backend.service.impl;
//
//import cn.com.augmentum.backend.VO.ResultVO;
//import cn.com.augmentum.backend.dao.DeptMapper;
//import cn.com.augmentum.backend.dao.RegisterMapper;
//import cn.com.augmentum.backend.pageUtil.PageRequest;
//import cn.com.augmentum.backend.pageUtil.PageResult;
//import cn.com.augmentum.backend.pageUtil.PageUtils;
//import cn.com.augmentum.backend.pojo.Register;
//import cn.com.augmentum.backend.service.RegisterService;
//import cn.com.augmentum.backend.util.DateUtil;
//import cn.com.augmentum.backend.util.TimeStampUtil;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.util.StringUtils;
//
//import java.util.HashMap;
//import java.util.List;
//
//
///**
// * @author tim
// * @version #
// * @date Created in 19-7-25
// * @description #
// */
//@Service
//public class RegisterServiceImpl implements RegisterService {
//
//    @Autowired
//    RegisterMapper registerMapper;
//
//    @Autowired
//    DeptMapper deptMapper;
//
//    @Override
//    @Transactional
//    public ResultVO register(Register register) {
//        register.setRegisterId(TimeStampUtil.timeStamp());
//        register.setRegisterNum(registrationForm(register.getRegisterDept()));
//        register.setRegisterTime(DateUtil.getDate());
//        int status=registerMapper.insert(register);
//        if(status!=1){
//           return ResultVO.error("Failed to insert data by registration!");
//        }
//        return ResultVO.success();
//    }
//
//
//    //Generate order number based on department
//    private Integer registrationForm(String dept){
//        short deptNum=deptMapper.selectNumByName(dept);
//        Integer registerNum = registerMapper.selectMaxNumByDept(dept);
//        if(registerNum==null){
//            return Integer.valueOf(String.valueOf(deptNum)+"1");
//        }
//        return registerNum+1;
//    }
//
//    public ResultVO list(String doctor, String dept,String patient,PageRequest pageRequest) {
//        StringBuffer subSql=new StringBuffer("where ");
//        int counter=0;
//        if(!"all".equals(dept)){
//            subSql.append("register_dept="+dept);
//            counter++;
//        }
//        if(!"all".equals(doctor)){
//            if(counter>0){
//                subSql.append(" and ");
//            }
//            subSql.append("register_doctor="+doctor);
//            counter++;
//        }
//        if(StringUtils.isEmpty(patient)){
//            if(counter>0){
//                subSql.append(" and ");
//            }
//            subSql.append("register_patient like '%"+patient+"%'");
//            counter++;
//        }
//        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
//        if(counter==0){
//            hashMap.put("subSql","");
//        }else {
//            hashMap.put("subSql", subSql.toString());
//        }
//        PageResult pageResult=selectListPage(hashMap,pageRequest);
//        return ResultVO.success(pageResult);
//    }
//
//    private PageResult selectListPage(HashMap<Object, Object> hashMap, PageRequest pageRequest){
//        PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
//        List<Register> list=registerMapper.selectList(hashMap);
//        PageResult pageResult= PageUtils.getPageResult(new PageInfo<>(list));
//        return pageResult;
//    }
//
//    @Override
//    public ResultVO updateStatus(String registerId,Integer registerStatus) {
//        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
//        hashMap.put("registerId",registerId);
//        hashMap.put("registerStatus",registerStatus);
//        registerMapper.updateStatusByPrimaryKey(hashMap);
//        return ResultVO.success();
//    }
//
//
//}
