package cn.com.augmentum.backend.pojo;

public class Doctor {
    private String doctorId;

    private String doctorName;

    private Short doctorGender;

    private String doctorDept;

    private String doctorPosition;

    private String doctorPhone;

    private String doctorHospital;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public Short getDoctorGender() {
        return doctorGender;
    }

    public void setDoctorGender(Short doctorGender) {
        this.doctorGender = doctorGender;
    }

    public String getDoctorDept() {
        return doctorDept;
    }

    public void setDoctorDept(String doctorDept) {
        this.doctorDept = doctorDept == null ? null : doctorDept.trim();
    }

    public String getDoctorPosition() {
        return doctorPosition;
    }

    public void setDoctorPosition(String doctorPosition) {
        this.doctorPosition = doctorPosition == null ? null : doctorPosition.trim();
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone == null ? null : doctorPhone.trim();
    }

    public String getDoctorHospital() {
        return doctorHospital;
    }

    public void setDoctorHospital(String doctorHospital) {
        this.doctorHospital = doctorHospital == null ? null : doctorHospital.trim();
    }
}