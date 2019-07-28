package cn.com.augmentum.backend.service.impl;

import cn.com.augmentum.backend.dao.DeptMapperCustom;
import cn.com.augmentum.backend.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return deptMapperCustom.selectNumByPrimaryKey(deptId);
    }


}
