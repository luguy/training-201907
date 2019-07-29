package cn.com.augmentum.backend.controller;


import cn.com.augmentum.backend.service.DeptService;
import cn.com.augmentum.backend.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/name")
    public ResultVO nameList(){
        return ResultVO.success(deptService.findAllName());
    }

}
