package cn.com.augmentum.backend.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIsNull() {
            addCriterion("dept_area is null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIsNotNull() {
            addCriterion("dept_area is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaEqualTo(String value) {
            addCriterion("dept_area =", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotEqualTo(String value) {
            addCriterion("dept_area <>", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaGreaterThan(String value) {
            addCriterion("dept_area >", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaGreaterThanOrEqualTo(String value) {
            addCriterion("dept_area >=", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaLessThan(String value) {
            addCriterion("dept_area <", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaLessThanOrEqualTo(String value) {
            addCriterion("dept_area <=", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaLike(String value) {
            addCriterion("dept_area like", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotLike(String value) {
            addCriterion("dept_area not like", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIn(List<String> values) {
            addCriterion("dept_area in", values, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotIn(List<String> values) {
            addCriterion("dept_area not in", values, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaBetween(String value1, String value2) {
            addCriterion("dept_area between", value1, value2, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotBetween(String value1, String value2) {
            addCriterion("dept_area not between", value1, value2, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsIsNull() {
            addCriterion("dept_persons is null");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsIsNotNull() {
            addCriterion("dept_persons is not null");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsEqualTo(Integer value) {
            addCriterion("dept_persons =", value, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsNotEqualTo(Integer value) {
            addCriterion("dept_persons <>", value, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsGreaterThan(Integer value) {
            addCriterion("dept_persons >", value, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_persons >=", value, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsLessThan(Integer value) {
            addCriterion("dept_persons <", value, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsLessThanOrEqualTo(Integer value) {
            addCriterion("dept_persons <=", value, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsIn(List<Integer> values) {
            addCriterion("dept_persons in", values, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsNotIn(List<Integer> values) {
            addCriterion("dept_persons not in", values, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsBetween(Integer value1, Integer value2) {
            addCriterion("dept_persons between", value1, value2, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptPersonsNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_persons not between", value1, value2, "deptPersons");
            return (Criteria) this;
        }

        public Criteria andDeptNumIsNull() {
            addCriterion("dept_num is null");
            return (Criteria) this;
        }

        public Criteria andDeptNumIsNotNull() {
            addCriterion("dept_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNumEqualTo(Short value) {
            addCriterion("dept_num =", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumNotEqualTo(Short value) {
            addCriterion("dept_num <>", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumGreaterThan(Short value) {
            addCriterion("dept_num >", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumGreaterThanOrEqualTo(Short value) {
            addCriterion("dept_num >=", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumLessThan(Short value) {
            addCriterion("dept_num <", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumLessThanOrEqualTo(Short value) {
            addCriterion("dept_num <=", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumIn(List<Short> values) {
            addCriterion("dept_num in", values, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumNotIn(List<Short> values) {
            addCriterion("dept_num not in", values, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumBetween(Short value1, Short value2) {
            addCriterion("dept_num between", value1, value2, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumNotBetween(Short value1, Short value2) {
            addCriterion("dept_num not between", value1, value2, "deptNum");
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