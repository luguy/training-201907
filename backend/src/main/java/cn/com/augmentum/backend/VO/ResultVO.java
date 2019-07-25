package cn.com.augmentum.backend.VO;

import lombok.Data;

/**
 *
 * outermost object returned by http request
 * Created by  tim
 * 2019-07-24 14:13
 */
@Data
public class ResultVO<T> {

    /** error code */
    private Integer code;

    /** Prompt information */
    private String msg;

    /** content */
    private T data;

    public static <T> ResultVO success(T t) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(t);
        resultVO.setCode(0);
        resultVO.setMsg("successful");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
