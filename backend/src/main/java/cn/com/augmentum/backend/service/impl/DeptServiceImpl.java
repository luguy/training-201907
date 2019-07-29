package cn.com.augmentum.backend.service.impl;

import cn.com.augmentum.backend.dao.DeptMapperCustom;
import cn.com.augmentum.backend.enums.ResultEnum;
import cn.com.augmentum.backend.exception.TrainingException;
import cn.com.augmentum.backend.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author luguy
 * @date 2019/7/28 - 1:31
 * @Description:
 * @Version:
 */
@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptMapperCustom deptMapperCustom;

    @Override
    public Integer findNumById(String deptId){
        Integer deptNum = deptMapperCustom.selectNumByPrimaryKey(deptId);

        if(deptNum == null){
            throw new TrainingException(ResultEnum.DEPT_NOT_EXIST);
        }

        return deptNum;
    }

    @Override
    public Set<String> findAllName() {
        return deptMapperCustom.selectAllName();
    }


}
