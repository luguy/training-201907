package cn.com.augmentum.backend.service;

import java.util.Set;

/**
 * @author luguy
 * @date 2019/7/28 - 1:31
 * @Description:
 * @Version:
 */
public interface DeptService {

    public Integer findNumById(String deptId);

    public Set<String> findAllName();

}
