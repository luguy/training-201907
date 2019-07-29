package cn.com.augmentum.backend.vo;

import cn.com.augmentum.backend.enums.ResultEnum;
import lombok.Data;

import java.util.Date;

@Data
public class ResultVO<T> {

    /**
     * error code
     */
    private Integer code;

    /**
     * Prompt information
     */
    private String msg;

    /**
     * content
     */
    private T data;

    public static <T> ResultVO success(T t) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(t);
        resultVO.setCode(ResultEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultEnum.SUCCESS.getMessage());
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
