package cn.com.augmentum.backend.dao;

import cn.com.augmentum.backend.pojo.Luguy;

import java.util.List;

public interface LuguyMapper {
    int insert(Luguy record);

    int insertSelective(Luguy record);

    List<Luguy> selectAll();
}