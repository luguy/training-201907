package cn.com.augmentum.backend.pojo;

import java.util.ArrayList;
import java.util.List;

public class RegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegisterExample() {
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

        public Criteria andRegisterIdIsNull() {
            addCriterion("register_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNotNull() {
            addCriterion("register_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdEqualTo(String value) {
            addCriterion("register_id =", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotEqualTo(String value) {
            addCriterion("register_id <>", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThan(String value) {
            addCriterion("register_id >", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThanOrEqualTo(String value) {
            addCriterion("register_id >=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThan(String value) {
            addCriterion("register_id <", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThanOrEqualTo(String value) {
            addCriterion("register_id <=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLike(String value) {
            addCriterion("register_id like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotLike(String value) {
            addCriterion("register_id not like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIn(List<String> values) {
            addCriterion("register_id in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotIn(List<String> values) {
            addCriterion("register_id not in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdBetween(String value1, String value2) {
            addCriterion("register_id between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotBetween(String value1, String value2) {
            addCriterion("register_id not between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIsNull() {
            addCriterion("register_num is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIsNotNull() {
            addCriterion("register_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumEqualTo(Integer value) {
            addCriterion("register_num =", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotEqualTo(Integer value) {
            addCriterion("register_num <>", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumGreaterThan(Integer value) {
            addCriterion("register_num >", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_num >=", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumLessThan(Integer value) {
            addCriterion("register_num <", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumLessThanOrEqualTo(Integer value) {
            addCriterion("register_num <=", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIn(List<Integer> values) {
            addCriterion("register_num in", values, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotIn(List<Integer> values) {
            addCriterion("register_num not in", values, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumBetween(Integer value1, Integer value2) {
            addCriterion("register_num between", value1, value2, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("register_num not between", value1, value2, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorIsNull() {
            addCriterion("register_doctor is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorIsNotNull() {
            addCriterion("register_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorEqualTo(String value) {
            addCriterion("register_doctor =", value, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorNotEqualTo(String value) {
            addCriterion("register_doctor <>", value, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorGreaterThan(String value) {
            addCriterion("register_doctor >", value, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("register_doctor >=", value, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorLessThan(String value) {
            addCriterion("register_doctor <", value, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorLessThanOrEqualTo(String value) {
            addCriterion("register_doctor <=", value, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorLike(String value) {
            addCriterion("register_doctor like", value, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorNotLike(String value) {
            addCriterion("register_doctor not like", value, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorIn(List<String> values) {
            addCriterion("register_doctor in", values, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorNotIn(List<String> values) {
            addCriterion("register_doctor not in", values, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorBetween(String value1, String value2) {
            addCriterion("register_doctor between", value1, value2, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDoctorNotBetween(String value1, String value2) {
            addCriterion("register_doctor not between", value1, value2, "registerDoctor");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptIsNull() {
            addCriterion("register_dept is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptIsNotNull() {
            addCriterion("register_dept is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptEqualTo(String value) {
            addCriterion("register_dept =", value, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptNotEqualTo(String value) {
            addCriterion("register_dept <>", value, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptGreaterThan(String value) {
            addCriterion("register_dept >", value, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptGreaterThanOrEqualTo(String value) {
            addCriterion("register_dept >=", value, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptLessThan(String value) {
            addCriterion("register_dept <", value, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptLessThanOrEqualTo(String value) {
            addCriterion("register_dept <=", value, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptLike(String value) {
            addCriterion("register_dept like", value, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptNotLike(String value) {
            addCriterion("register_dept not like", value, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptIn(List<String> values) {
            addCriterion("register_dept in", values, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptNotIn(List<String> values) {
            addCriterion("register_dept not in", values, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptBetween(String value1, String value2) {
            addCriterion("register_dept between", value1, value2, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterDeptNotBetween(String value1, String value2) {
            addCriterion("register_dept not between", value1, value2, "registerDept");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientIsNull() {
            addCriterion("register_patient is null");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientIsNotNull() {
            addCriterion("register_patient is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientEqualTo(String value) {
            addCriterion("register_patient =", value, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientNotEqualTo(String value) {
            addCriterion("register_patient <>", value, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientGreaterThan(String value) {
            addCriterion("register_patient >", value, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientGreaterThanOrEqualTo(String value) {
            addCriterion("register_patient >=", value, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientLessThan(String value) {
            addCriterion("register_patient <", value, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientLessThanOrEqualTo(String value) {
            addCriterion("register_patient <=", value, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientLike(String value) {
            addCriterion("register_patient like", value, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientNotLike(String value) {
            addCriterion("register_patient not like", value, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientIn(List<String> values) {
            addCriterion("register_patient in", values, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientNotIn(List<String> values) {
            addCriterion("register_patient not in", values, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientBetween(String value1, String value2) {
            addCriterion("register_patient between", value1, value2, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterPatientNotBetween(String value1, String value2) {
            addCriterion("register_patient not between", value1, value2, "registerPatient");
            return (Criteria) this;
        }

        public Criteria andRegisterCostIsNull() {
            addCriterion("register_cost is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCostIsNotNull() {
            addCriterion("register_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCostEqualTo(Integer value) {
            addCriterion("register_cost =", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostNotEqualTo(Integer value) {
            addCriterion("register_cost <>", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostGreaterThan(Integer value) {
            addCriterion("register_cost >", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_cost >=", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostLessThan(Integer value) {
            addCriterion("register_cost <", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostLessThanOrEqualTo(Integer value) {
            addCriterion("register_cost <=", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostIn(List<Integer> values) {
            addCriterion("register_cost in", values, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostNotIn(List<Integer> values) {
            addCriterion("register_cost not in", values, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostBetween(Integer value1, Integer value2) {
            addCriterion("register_cost between", value1, value2, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostNotBetween(Integer value1, Integer value2) {
            addCriterion("register_cost not between", value1, value2, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorIsNull() {
            addCriterion("register_operator is null");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorIsNotNull() {
            addCriterion("register_operator is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorEqualTo(String value) {
            addCriterion("register_operator =", value, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorNotEqualTo(String value) {
            addCriterion("register_operator <>", value, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorGreaterThan(String value) {
            addCriterion("register_operator >", value, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("register_operator >=", value, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorLessThan(String value) {
            addCriterion("register_operator <", value, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorLessThanOrEqualTo(String value) {
            addCriterion("register_operator <=", value, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorLike(String value) {
            addCriterion("register_operator like", value, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorNotLike(String value) {
            addCriterion("register_operator not like", value, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorIn(List<String> values) {
            addCriterion("register_operator in", values, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorNotIn(List<String> values) {
            addCriterion("register_operator not in", values, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorBetween(String value1, String value2) {
            addCriterion("register_operator between", value1, value2, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterOperatorNotBetween(String value1, String value2) {
            addCriterion("register_operator not between", value1, value2, "registerOperator");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIsNull() {
            addCriterion("register_type is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIsNotNull() {
            addCriterion("register_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeEqualTo(Short value) {
            addCriterion("register_type =", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotEqualTo(Short value) {
            addCriterion("register_type <>", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeGreaterThan(Short value) {
            addCriterion("register_type >", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("register_type >=", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLessThan(Short value) {
            addCriterion("register_type <", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLessThanOrEqualTo(Short value) {
            addCriterion("register_type <=", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIn(List<Short> values) {
            addCriterion("register_type in", values, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotIn(List<Short> values) {
            addCriterion("register_type not in", values, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeBetween(Short value1, Short value2) {
            addCriterion("register_type between", value1, value2, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotBetween(Short value1, Short value2) {
            addCriterion("register_type not between", value1, value2, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusIsNull() {
            addCriterion("register_status is null");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusIsNotNull() {
            addCriterion("register_status is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusEqualTo(Short value) {
            addCriterion("register_status =", value, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusNotEqualTo(Short value) {
            addCriterion("register_status <>", value, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusGreaterThan(Short value) {
            addCriterion("register_status >", value, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("register_status >=", value, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusLessThan(Short value) {
            addCriterion("register_status <", value, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusLessThanOrEqualTo(Short value) {
            addCriterion("register_status <=", value, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusIn(List<Short> values) {
            addCriterion("register_status in", values, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusNotIn(List<Short> values) {
            addCriterion("register_status not in", values, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusBetween(Short value1, Short value2) {
            addCriterion("register_status between", value1, value2, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterStatusNotBetween(Short value1, Short value2) {
            addCriterion("register_status not between", value1, value2, "registerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("register_time like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("register_time not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
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