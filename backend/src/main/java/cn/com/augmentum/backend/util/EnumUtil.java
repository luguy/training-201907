package cn.com.augmentum.backend.util;


import cn.com.augmentum.backend.enums.CodeEnum;

public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Short code, Class<T> enumClass) {

        for (T each : enumClass.getEnumConstants()) {

            if (code.equals(each.getCode())) {
                return each;
            }

        }

        return null;
    }


    public static <T extends CodeEnum> T getByMessage(String message, Class<T> enumClass) {

        for (T each : enumClass.getEnumConstants()) {

            if (message.equals(each.getMessage())) {
                return each;
            }

        }

        return null;
    }
}
