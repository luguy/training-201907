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

    INVALIDATED(0,"Has been invalidated"),
    UNPAID(1,"Unpaid"),
    WAITING(2,"Waiting to see a doctor"),
    FINISHED(3,"Have seen a doctor"),
    ;

    private Integer code;

    private String message;

    RegisterStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
