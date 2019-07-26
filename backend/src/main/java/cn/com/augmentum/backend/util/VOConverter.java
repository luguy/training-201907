//package cn.com.augmentum.backend.util;
//
//import cn.com.augmentum.backend.VO.RegisterVO;
//import cn.com.augmentum.backend.enums.RegisterStatusEnum;
//import org.springframework.beans.BeanUtils;
//
//
//public class VOConverter {
//
//    public static void registerToVO(Register register, RegisterVO registerVO){
//        BeanUtils.copyProperties(register,registerVO);
//        registerVO.setRegisterStatus(EnumUtil.getByCode(register.getRegisterStatus(), RegisterStatusEnum.class).getMessage());
//        registerVO.setRegisterType(EnumUtil.getByCode(register.getRegisterType(), RegisterStatusEnum.class).getMessage());
//    }
//
//    /*public static void VOT0Register(RegisterVO registerVO,Register register){
//        BeanUtils.copyProperties(registerVO,register);
//        register.setRegisterStatus(EnumUtil.getByMessage(registerVO.getRegisterStatus(), RegisterStatusEnum.class).getCode());
//        register.setRegisterType(EnumUtil.getByMessage(registerVO.getRegisterType(), RegisterStatusEnum.class).getCode());
//
//    }*/
//
//
//}
