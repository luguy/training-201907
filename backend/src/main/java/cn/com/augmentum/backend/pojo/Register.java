package cn.com.augmentum.backend.pojo;

public class Register {
    private String registerId;

    private Integer registerNum;

    private String registerDoctor;

    private String registerDept;

    private String registerPatient;

    private Integer registerCost;

    private String registerOperator;

    private Short registerType;

    private Short registerStatus;

    private String registerTime;

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId == null ? null : registerId.trim();
    }

    public Integer getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(Integer registerNum) {
        this.registerNum = registerNum;
    }

    public String getRegisterDoctor() {
        return registerDoctor;
    }

    public void setRegisterDoctor(String registerDoctor) {
        this.registerDoctor = registerDoctor == null ? null : registerDoctor.trim();
    }

    public String getRegisterDept() {
        return registerDept;
    }

    public void setRegisterDept(String registerDept) {
        this.registerDept = registerDept == null ? null : registerDept.trim();
    }

    public String getRegisterPatient() {
        return registerPatient;
    }

    public void setRegisterPatient(String registerPatient) {
        this.registerPatient = registerPatient == null ? null : registerPatient.trim();
    }

    public Integer getRegisterCost() {
        return registerCost;
    }

    public void setRegisterCost(Integer registerCost) {
        this.registerCost = registerCost;
    }

    public String getRegisterOperator() {
        return registerOperator;
    }

    public void setRegisterOperator(String registerOperator) {
        this.registerOperator = registerOperator == null ? null : registerOperator.trim();
    }

    public Short getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Short registerType) {
        this.registerType = registerType;
    }

    public Short getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(Short registerStatus) {
        this.registerStatus = registerStatus;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }
}