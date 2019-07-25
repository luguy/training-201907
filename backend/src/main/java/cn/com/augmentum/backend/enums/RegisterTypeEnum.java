package cn.com.augmentum.backend.enums;

import lombok.Getter;

/**
 * @author tim
 * @version #
 * @date Created in 19-7-25
 * @description #
 */
@Getter
public enum RegisterTypeEnum implements CodeEnum {

    OUTPATIENT(0,"Outpatient"),
    DRUG(1,"Drug"),
    ECG_EXAMINATION(2,"ECG examination");

    private Integer code;

    private String message;

    RegisterTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
