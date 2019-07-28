package cn.com.augmentum.backend.exception;


import cn.com.augmentum.backend.enums.ResultEnum;
import lombok.Getter;

@Getter
public class TrainingException extends RuntimeException{

    private Integer code;

    public TrainingException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public TrainingException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
