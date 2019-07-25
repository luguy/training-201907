package cn.com.augmentum.backend.pojo;

public class Dept {
    private String deptId;

    private String deptName;

    private String deptArea;

    private Integer deptPersons;

    private Short deptNum;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptArea() {
        return deptArea;
    }

    public void setDeptArea(String deptArea) {
        this.deptArea = deptArea == null ? null : deptArea.trim();
    }

    public Integer getDeptPersons() {
        return deptPersons;
    }

    public void setDeptPersons(Integer deptPersons) {
        this.deptPersons = deptPersons;
    }

    public Short getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(Short deptNum) {
        this.deptNum = deptNum;
    }
}