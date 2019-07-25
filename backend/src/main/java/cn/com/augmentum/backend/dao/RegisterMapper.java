package cn.com.augmentum.backend.dao;

import cn.com.augmentum.backend.pojo.Register;
import cn.com.augmentum.backend.pojo.RegisterExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisterMapper {
    int countByExample(RegisterExample example);

    int deleteByExample(RegisterExample example);

    int deleteByPrimaryKey(String registerId);

    int insert(Register record);

    int insertSelective(Register record);

    List<Register> selectByExample(RegisterExample example);

    Register selectByPrimaryKey(String registerId);

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);

    List<Register> selectAll();

    List<Register> selectList(HashMap<Object,Object> hashMap);

    Integer selectMaxNumByDept(String dept);

    int updateStatusByPrimaryKey(HashMap<Object,Object> hashMap);
}