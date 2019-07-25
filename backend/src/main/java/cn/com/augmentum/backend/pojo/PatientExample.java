package cn.com.augmentum.backend.pojo;

import java.util.ArrayList;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("patient_id like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("patient_id not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNull() {
            addCriterion("patient_gender is null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNotNull() {
            addCriterion("patient_gender is not null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderEqualTo(Short value) {
            addCriterion("patient_gender =", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotEqualTo(Short value) {
            addCriterion("patient_gender <>", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThan(Short value) {
            addCriterion("patient_gender >", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThanOrEqualTo(Short value) {
            addCriterion("patient_gender >=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThan(Short value) {
            addCriterion("patient_gender <", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThanOrEqualTo(Short value) {
            addCriterion("patient_gender <=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIn(List<Short> values) {
            addCriterion("patient_gender in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotIn(List<Short> values) {
            addCriterion("patient_gender not in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderBetween(Short value1, Short value2) {
            addCriterion("patient_gender between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotBetween(Short value1, Short value2) {
            addCriterion("patient_gender not between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeIsNull() {
            addCriterion("patient_sick_age is null");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeIsNotNull() {
            addCriterion("patient_sick_age is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeEqualTo(String value) {
            addCriterion("patient_sick_age =", value, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeNotEqualTo(String value) {
            addCriterion("patient_sick_age <>", value, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeGreaterThan(String value) {
            addCriterion("patient_sick_age >", value, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_sick_age >=", value, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeLessThan(String value) {
            addCriterion("patient_sick_age <", value, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeLessThanOrEqualTo(String value) {
            addCriterion("patient_sick_age <=", value, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeLike(String value) {
            addCriterion("patient_sick_age like", value, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeNotLike(String value) {
            addCriterion("patient_sick_age not like", value, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeIn(List<String> values) {
            addCriterion("patient_sick_age in", values, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeNotIn(List<String> values) {
            addCriterion("patient_sick_age not in", values, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeBetween(String value1, String value2) {
            addCriterion("patient_sick_age between", value1, value2, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientSickAgeNotBetween(String value1, String value2) {
            addCriterion("patient_sick_age not between", value1, value2, "patientSickAge");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNull() {
            addCriterion("patient_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNotNull() {
            addCriterion("patient_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayEqualTo(String value) {
            addCriterion("patient_birthday =", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotEqualTo(String value) {
            addCriterion("patient_birthday <>", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThan(String value) {
            addCriterion("patient_birthday >", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("patient_birthday >=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThan(String value) {
            addCriterion("patient_birthday <", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThanOrEqualTo(String value) {
            addCriterion("patient_birthday <=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLike(String value) {
            addCriterion("patient_birthday like", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotLike(String value) {
            addCriterion("patient_birthday not like", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIn(List<String> values) {
            addCriterion("patient_birthday in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotIn(List<String> values) {
            addCriterion("patient_birthday not in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayBetween(String value1, String value2) {
            addCriterion("patient_birthday between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotBetween(String value1, String value2) {
            addCriterion("patient_birthday not between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBmiIsNull() {
            addCriterion("patient_bmi is null");
            return (Criteria) this;
        }

        public Criteria andPatientBmiIsNotNull() {
            addCriterion("patient_bmi is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBmiEqualTo(Integer value) {
            addCriterion("patient_bmi =", value, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiNotEqualTo(Integer value) {
            addCriterion("patient_bmi <>", value, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiGreaterThan(Integer value) {
            addCriterion("patient_bmi >", value, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_bmi >=", value, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiLessThan(Integer value) {
            addCriterion("patient_bmi <", value, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiLessThanOrEqualTo(Integer value) {
            addCriterion("patient_bmi <=", value, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiIn(List<Integer> values) {
            addCriterion("patient_bmi in", values, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiNotIn(List<Integer> values) {
            addCriterion("patient_bmi not in", values, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiBetween(Integer value1, Integer value2) {
            addCriterion("patient_bmi between", value1, value2, "patientBmi");
            return (Criteria) this;
        }

        public Criteria andPatientBmiNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_bmi not between", value1, value2, "patientBmi");
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