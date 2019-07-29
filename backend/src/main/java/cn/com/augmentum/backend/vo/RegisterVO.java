package cn.com.augmentum.backend.vo;


import lombok.Data;

import java.util.Date;

@Data
public class RegisterVO {

    private String id;

    private Integer num;

    private String doctorId;

    private String deptId;

    private String patientId;

    private String patientName;

    private Double cost;

    private String operator;

    private Integer type;

    private Integer status;

    private Date createTime;
}