package cn.com.augmentum.backend.dao;

import cn.com.augmentum.backend.pojo.Luguy;
import cn.com.augmentum.backend.pojo.LuguyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LuguyMapper {
    int countByExample(LuguyExample example);

    int deleteByExample(LuguyExample example);

    int insert(Luguy record);

    int insertSelective(Luguy record);

    List<Luguy> selectByExample(LuguyExample example);

    int updateByExampleSelective(@Param("record") Luguy record, @Param("example") LuguyExample example);

    int updateByExample(@Param("record") Luguy record, @Param("example") LuguyExample example);
}