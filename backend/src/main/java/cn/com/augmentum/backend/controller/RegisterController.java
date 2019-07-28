package cn.com.augmentum.backend.controller;

import cn.com.augmentum.backend.exception.TrainingException;
import cn.com.augmentum.backend.pageUtil.PageResult;
import cn.com.augmentum.backend.vo.RegisterVO;
import cn.com.augmentum.backend.vo.ResultVO;
import cn.com.augmentum.backend.pageUtil.PageRequest;
import cn.com.augmentum.backend.pojo.Register;
import cn.com.augmentum.backend.service.RegisterService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/registration")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/")
    public ResultVO register(@RequestBody RegisterVO registerVO){
        Register register = new Register();
        VOToRegister(registerVO, register);

        try {
            registerService.saveRegister(register);
        } catch (TrainingException e) {
            return ResultVO.error(e.getCode(), e.getMessage());
        }

        return ResultVO.success();
    }

    @GetMapping("/list")
    public ResultVO registerList(RegisterVO registerVO,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "2") Integer size){
        Register register = new Register();
        VOFindToRegister(registerVO, register);
        PageRequest pageRequest = new PageRequest(page,size);

        PageResult pageResult = registerService.findRegister(register, pageRequest);

        List<Register> list = (List<Register>) pageResult.getContent();
        List<RegisterVO> listVO=new ArrayList<>();

        for (Register item : list) {
            RegisterVO itemVO =new RegisterVO();
            registerToVO(item, itemVO);
            listVO.add(itemVO);
        }

        pageResult.setContent(listVO);
        return ResultVO.success(pageResult);
    }

    @PutMapping("/status")
    public ResultVO registerUpdate(
            @RequestBody RegisterVO registerVO){

        Register register = new Register();
        VOFindToRegister(registerVO, register);

        try {
            registerService.updateStatus(register);

        }catch (TrainingException e){
            return ResultVO.error(e.getCode(), e.getMessage());
        }

        return ResultVO.success();
    }


    private void registerToVO(Register register, RegisterVO registerVO){
        BeanUtils.copyProperties(register, registerVO);
    }

    private void VOFindToRegister(RegisterVO registerVO, Register register){
        BeanUtils.copyProperties(registerVO, register);

        if(registerVO.getPatientName() != null) {
            register.setPatientName("%" + registerVO.getPatientName() + "%");
        }

    }

    private void VOToRegister(RegisterVO registerVO, Register register){
        BeanUtils.copyProperties(registerVO, register);
    }

}
