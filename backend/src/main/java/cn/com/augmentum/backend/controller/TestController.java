package cn.com.augmentum.backend.controller;

import cn.com.augmentum.backend.VO.ResultVO;
import cn.com.augmentum.backend.pageUtil.PageRequest;
import cn.com.augmentum.backend.pageUtil.PageResult;
import cn.com.augmentum.backend.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String test (){
        return "hello world!";
    }

    @RequestMapping("/list")
    public ResultVO testLit(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "2") Integer size){
        PageRequest pageRequest=new PageRequest(page,size);
        PageResult pageResult=testService.findAll(pageRequest);
        return ResultVO.success(pageResult);
    }
}
