package cn.com.augmentum.backend.enums;

import lombok.Getter;

@Getter
public enum ResultEnum implements CodeEnum{

    SUCCESS(0, "Successful!"),

    PARAM_ERROR(1, "Incorrect parameter!"),

    STATUS_ERROR(2, "Incorrect status!"),

    UPDATE_FAIL(3, "Update failed!"),

    ERROR(4,"ERROR!"),

    DEPT_NOT_EXIST(5,"The department does not exist!")
    ;



    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
