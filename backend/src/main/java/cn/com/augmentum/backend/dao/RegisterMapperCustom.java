package cn.com.augmentum.backend.dao;

import cn.com.augmentum.backend.model.Register;

import java.util.HashMap;
import java.util.List;

public interface RegisterMapperCustom {

    List<Register> selectByCondition(HashMap<Object, Object> hashMap);

    Integer selectStatusByPrimaryKey(String id);

    Register selectMaxNumByDeptId(String deptId);

    List<Integer> selectAllStatus();

}
