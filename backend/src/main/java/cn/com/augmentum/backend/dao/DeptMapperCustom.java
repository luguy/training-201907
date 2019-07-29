package cn.com.augmentum.backend.dao;

import java.util.Set;

/**
 * @author luguy
 * @date 2019/7/27 - 22:43
 * @Description:
 * @Version:
 */
public interface DeptMapperCustom {

    Integer selectNumByPrimaryKey(String id);

    Set<String> selectAllName();

}
