package cn.com.augmentum.backend.model;

import lombok.Data;

import java.util.Date;

@Data
public class Register {
    private String id;

    private String num;

    private String doctorId;

    private String deptId;

    private String patientId;

    private String patientName;

    private Double cost;

    private String operator;

    private Integer type;

    private Integer status;

    private Date updateTime;

    private Date createTime;

}