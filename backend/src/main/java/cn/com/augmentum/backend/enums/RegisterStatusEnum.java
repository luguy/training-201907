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
    END(2,"Have seen a doctor"),
    INVALIDATED(3,"Has been invalidated");

    private Integer code;

    private String message;

    RegisterStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
