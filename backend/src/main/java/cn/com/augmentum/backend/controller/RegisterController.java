package cn.com.augmentum.backend.controller;

import cn.com.augmentum.backend.VO.ResultVO;
import cn.com.augmentum.backend.pageUtil.PageRequest;
import cn.com.augmentum.backend.pageUtil.PageResult;
import cn.com.augmentum.backend.pojo.Register;
import cn.com.augmentum.backend.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author tim
 * @version #
 * @date Created in 19-7-25
 * @description #
 */
@RestController
@RequestMapping("/registration")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/register")
    public ResultVO register(Register register){
        return registerService.register(register);
    }

    @GetMapping("/lsit")
    public ResultVO registerList(
            @RequestParam(value = "dept", defaultValue = "all") String dept,
            @RequestParam(value = "doctor", defaultValue = "all") String doctor,
            @RequestParam(value = "patient", defaultValue = "") String patient,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "2") Integer size){
        PageRequest pageRequest=new PageRequest(page,size);
        return registerService.list(doctor,dept,patient,pageRequest);
    }
}