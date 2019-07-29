package cn.com.augmentum.backend.service;

import cn.com.augmentum.backend.pageUtil.PageRequest;
import cn.com.augmentum.backend.pageUtil.PageResult;
import cn.com.augmentum.backend.model.Register;

import java.util.List;


public interface RegisterService {

     void saveRegister(Register register);

     PageResult findRegister(Register register, PageRequest pageRequest);

     void updateStatus(Register register);

     void deleteRegister(String id);

     List<Integer> findAllStatus();
}
