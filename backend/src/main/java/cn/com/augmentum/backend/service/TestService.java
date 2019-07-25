package cn.com.augmentum.backend.service;

import cn.com.augmentum.backend.pageUtil.PageRequest;
import cn.com.augmentum.backend.pageUtil.PageResult;

/**
 * @author ：tim
 * @date ：Created in 19-7-24
 * @description：Test
 * @version: 0.1$
 */
public interface TestService {
     PageResult findAll(PageRequest pageRequest);
}
