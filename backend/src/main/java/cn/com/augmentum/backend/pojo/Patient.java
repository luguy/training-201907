package cn.com.augmentum.backend.pojo;

public class Patient {
    private String patientId;

    private String patientName;

    private Short patientGender;

    private String patientSickAge;

    private String patientBirthday;

    private Integer patientBmi;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public Short getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(Short patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientSickAge() {
        return patientSickAge;
    }

    public void setPatientSickAge(String patientSickAge) {
        this.patientSickAge = patientSickAge == null ? null : patientSickAge.trim();
    }

    public String getPatientBirthday() {
        return patientBirthday;
    }

    public void setPatientBirthday(String patientBirthday) {
        this.patientBirthday = patientBirthday == null ? null : patientBirthday.trim();
    }

    public Integer getPatientBmi() {
        return patientBmi;
    }

    public void setPatientBmi(Integer patientBmi) {
        this.patientBmi = patientBmi;
    }
}