package cn.com.augmentum.backend.controller;


import cn.com.augmentum.backend.service.DoctorService;
import cn.com.augmentum.backend.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/name")
    public ResultVO nameList(){
        return ResultVO.success(doctorService.findAllName());
    }

}
