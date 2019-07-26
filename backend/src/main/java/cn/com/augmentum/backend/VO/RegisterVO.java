package cn.com.augmentum.backend.VO;

import lombok.Data;

/**
 * @author tim
 * @version #
 * @date Created in 19-7-26
 * @description #
 */
@Data
public class RegisterVO {

    private String registerDoctor;

    private String registerDept;

    private String registerPatient;

    private Integer registerCost;

    private String registerOperator;

    private String registerType;

    private String registerStatus;

    private String registerTime;
}
