package cn.com.augmentum.backend.enums;

import lombok.Getter;

/**
 * @author tim
 * @version #
 * @date Created in 19-7-25
 * @description #
 */
@Getter
public enum RegisterStatusEnum implements CodeEnum{

    UNPAID(0,"Unpaid"),
    START(1,"Waiting to see a doctor"),
    INVALIDATED(2,"Has been invalidated"),
    END(3,"Have seen a doctor");

    private Integer code;

    private String message;

    RegisterStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
