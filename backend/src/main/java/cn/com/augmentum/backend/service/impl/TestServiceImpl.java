package cn.com.augmentum.backend.service.impl;

import cn.com.augmentum.backend.dao.LuguyMapper;
import cn.com.augmentum.backend.pageUtil.PageRequest;
import cn.com.augmentum.backend.pageUtil.PageResult;
import cn.com.augmentum.backend.pageUtil.PageUtils;
import cn.com.augmentum.backend.pojo.Luguy;
import cn.com.augmentum.backend.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tim
 * @version #
 * @date Created in 19-7-24 下午2:38
 * @description #
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    LuguyMapper luguyMapper;

    @Override
    public PageResult findAll(PageRequest pageRequest) {
        PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
        List<Luguy> list=luguyMapper.selectAll();
        PageResult pageResult= PageUtils.getPageResult(new PageInfo<>(list));
        System.out.println(pageResult.getContent().get(1));
        return pageResult;
    }
}
