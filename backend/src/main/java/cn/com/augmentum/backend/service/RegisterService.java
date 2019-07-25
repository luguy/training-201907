package cn.com.augmentum.backend.service;

import cn.com.augmentum.backend.VO.ResultVO;
import cn.com.augmentum.backend.pageUtil.PageRequest;
import cn.com.augmentum.backend.pojo.Register;

/**
 * @author tim
 * @version #
 * @date Created in 19-7-25
 * @description #
 */
public interface RegisterService {

     ResultVO register(Register register);
//     ResultVO registerList(PageRequest pageRequest);
     ResultVO list(String doctor, String dept,String patient,PageRequest pageRequest);
}
