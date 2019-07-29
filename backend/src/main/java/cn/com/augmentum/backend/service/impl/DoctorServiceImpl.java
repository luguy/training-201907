package cn.com.augmentum.backend.service.impl;

import cn.com.augmentum.backend.dao.DoctorMapperCustom;
import cn.com.augmentum.backend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapperCustom doctorMapperCustom;

    @Override
    public Set<String> findAllName() {
        return doctorMapperCustom.selectAllName();
    }
}
