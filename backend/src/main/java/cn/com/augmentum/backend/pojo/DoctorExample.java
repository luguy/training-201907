package cn.com.augmentum.backend.pojo;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(String value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(String value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(String value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(String value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLike(String value) {
            addCriterion("doctor_id like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotLike(String value) {
            addCriterion("doctor_id not like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<String> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<String> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(String value1, String value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(String value1, String value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctor_name like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderIsNull() {
            addCriterion("doctor_gender is null");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderIsNotNull() {
            addCriterion("doctor_gender is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderEqualTo(Short value) {
            addCriterion("doctor_gender =", value, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderNotEqualTo(Short value) {
            addCriterion("doctor_gender <>", value, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderGreaterThan(Short value) {
            addCriterion("doctor_gender >", value, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderGreaterThanOrEqualTo(Short value) {
            addCriterion("doctor_gender >=", value, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderLessThan(Short value) {
            addCriterion("doctor_gender <", value, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderLessThanOrEqualTo(Short value) {
            addCriterion("doctor_gender <=", value, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderIn(List<Short> values) {
            addCriterion("doctor_gender in", values, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderNotIn(List<Short> values) {
            addCriterion("doctor_gender not in", values, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderBetween(Short value1, Short value2) {
            addCriterion("doctor_gender between", value1, value2, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorGenderNotBetween(Short value1, Short value2) {
            addCriterion("doctor_gender not between", value1, value2, "doctorGender");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptIsNull() {
            addCriterion("doctor_dept is null");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptIsNotNull() {
            addCriterion("doctor_dept is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptEqualTo(String value) {
            addCriterion("doctor_dept =", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptNotEqualTo(String value) {
            addCriterion("doctor_dept <>", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptGreaterThan(String value) {
            addCriterion("doctor_dept >", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_dept >=", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptLessThan(String value) {
            addCriterion("doctor_dept <", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptLessThanOrEqualTo(String value) {
            addCriterion("doctor_dept <=", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptLike(String value) {
            addCriterion("doctor_dept like", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptNotLike(String value) {
            addCriterion("doctor_dept not like", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptIn(List<String> values) {
            addCriterion("doctor_dept in", values, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptNotIn(List<String> values) {
            addCriterion("doctor_dept not in", values, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptBetween(String value1, String value2) {
            addCriterion("doctor_dept between", value1, value2, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptNotBetween(String value1, String value2) {
            addCriterion("doctor_dept not between", value1, value2, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionIsNull() {
            addCriterion("doctor_position is null");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionIsNotNull() {
            addCriterion("doctor_position is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionEqualTo(String value) {
            addCriterion("doctor_position =", value, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionNotEqualTo(String value) {
            addCriterion("doctor_position <>", value, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionGreaterThan(String value) {
            addCriterion("doctor_position >", value, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_position >=", value, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionLessThan(String value) {
            addCriterion("doctor_position <", value, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionLessThanOrEqualTo(String value) {
            addCriterion("doctor_position <=", value, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionLike(String value) {
            addCriterion("doctor_position like", value, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionNotLike(String value) {
            addCriterion("doctor_position not like", value, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionIn(List<String> values) {
            addCriterion("doctor_position in", values, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionNotIn(List<String> values) {
            addCriterion("doctor_position not in", values, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionBetween(String value1, String value2) {
            addCriterion("doctor_position between", value1, value2, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPositionNotBetween(String value1, String value2) {
            addCriterion("doctor_position not between", value1, value2, "doctorPosition");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIsNull() {
            addCriterion("doctor_phone is null");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIsNotNull() {
            addCriterion("doctor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneEqualTo(String value) {
            addCriterion("doctor_phone =", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotEqualTo(String value) {
            addCriterion("doctor_phone <>", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneGreaterThan(String value) {
            addCriterion("doctor_phone >", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_phone >=", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLessThan(String value) {
            addCriterion("doctor_phone <", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLessThanOrEqualTo(String value) {
            addCriterion("doctor_phone <=", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLike(String value) {
            addCriterion("doctor_phone like", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotLike(String value) {
            addCriterion("doctor_phone not like", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIn(List<String> values) {
            addCriterion("doctor_phone in", values, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotIn(List<String> values) {
            addCriterion("doctor_phone not in", values, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneBetween(String value1, String value2) {
            addCriterion("doctor_phone between", value1, value2, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotBetween(String value1, String value2) {
            addCriterion("doctor_phone not between", value1, value2, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalIsNull() {
            addCriterion("doctor_hospital is null");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalIsNotNull() {
            addCriterion("doctor_hospital is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalEqualTo(String value) {
            addCriterion("doctor_hospital =", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalNotEqualTo(String value) {
            addCriterion("doctor_hospital <>", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalGreaterThan(String value) {
            addCriterion("doctor_hospital >", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_hospital >=", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalLessThan(String value) {
            addCriterion("doctor_hospital <", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalLessThanOrEqualTo(String value) {
            addCriterion("doctor_hospital <=", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalLike(String value) {
            addCriterion("doctor_hospital like", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalNotLike(String value) {
            addCriterion("doctor_hospital not like", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalIn(List<String> values) {
            addCriterion("doctor_hospital in", values, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalNotIn(List<String> values) {
            addCriterion("doctor_hospital not in", values, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalBetween(String value1, String value2) {
            addCriterion("doctor_hospital between", value1, value2, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalNotBetween(String value1, String value2) {
            addCriterion("doctor_hospital not between", value1, value2, "doctorHospital");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}