package com.sbs.barcode.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketRecordExample() {
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

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNull() {
            addCriterion("enter_date is null");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNotNull() {
            addCriterion("enter_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnterDateEqualTo(Date value) {
            addCriterion("enter_date =", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotEqualTo(Date value) {
            addCriterion("enter_date <>", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThan(Date value) {
            addCriterion("enter_date >", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_date >=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThan(Date value) {
            addCriterion("enter_date <", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThanOrEqualTo(Date value) {
            addCriterion("enter_date <=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateIn(List<Date> values) {
            addCriterion("enter_date in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotIn(List<Date> values) {
            addCriterion("enter_date not in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateBetween(Date value1, Date value2) {
            addCriterion("enter_date between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotBetween(Date value1, Date value2) {
            addCriterion("enter_date not between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterAddressIsNull() {
            addCriterion("enter_address is null");
            return (Criteria) this;
        }

        public Criteria andEnterAddressIsNotNull() {
            addCriterion("enter_address is not null");
            return (Criteria) this;
        }

        public Criteria andEnterAddressEqualTo(String value) {
            addCriterion("enter_address =", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressNotEqualTo(String value) {
            addCriterion("enter_address <>", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressGreaterThan(String value) {
            addCriterion("enter_address >", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("enter_address >=", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressLessThan(String value) {
            addCriterion("enter_address <", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressLessThanOrEqualTo(String value) {
            addCriterion("enter_address <=", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressLike(String value) {
            addCriterion("enter_address like", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressNotLike(String value) {
            addCriterion("enter_address not like", value, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressIn(List<String> values) {
            addCriterion("enter_address in", values, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressNotIn(List<String> values) {
            addCriterion("enter_address not in", values, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressBetween(String value1, String value2) {
            addCriterion("enter_address between", value1, value2, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andEnterAddressNotBetween(String value1, String value2) {
            addCriterion("enter_address not between", value1, value2, "enterAddress");
            return (Criteria) this;
        }

        public Criteria andExitDateIsNull() {
            addCriterion("exit_date is null");
            return (Criteria) this;
        }

        public Criteria andExitDateIsNotNull() {
            addCriterion("exit_date is not null");
            return (Criteria) this;
        }

        public Criteria andExitDateEqualTo(Date value) {
            addCriterion("exit_date =", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotEqualTo(Date value) {
            addCriterion("exit_date <>", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateGreaterThan(Date value) {
            addCriterion("exit_date >", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exit_date >=", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateLessThan(Date value) {
            addCriterion("exit_date <", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateLessThanOrEqualTo(Date value) {
            addCriterion("exit_date <=", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateIn(List<Date> values) {
            addCriterion("exit_date in", values, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotIn(List<Date> values) {
            addCriterion("exit_date not in", values, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateBetween(Date value1, Date value2) {
            addCriterion("exit_date between", value1, value2, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotBetween(Date value1, Date value2) {
            addCriterion("exit_date not between", value1, value2, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitAddressIsNull() {
            addCriterion("exit_address is null");
            return (Criteria) this;
        }

        public Criteria andExitAddressIsNotNull() {
            addCriterion("exit_address is not null");
            return (Criteria) this;
        }

        public Criteria andExitAddressEqualTo(String value) {
            addCriterion("exit_address =", value, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressNotEqualTo(String value) {
            addCriterion("exit_address <>", value, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressGreaterThan(String value) {
            addCriterion("exit_address >", value, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressGreaterThanOrEqualTo(String value) {
            addCriterion("exit_address >=", value, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressLessThan(String value) {
            addCriterion("exit_address <", value, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressLessThanOrEqualTo(String value) {
            addCriterion("exit_address <=", value, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressLike(String value) {
            addCriterion("exit_address like", value, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressNotLike(String value) {
            addCriterion("exit_address not like", value, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressIn(List<String> values) {
            addCriterion("exit_address in", values, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressNotIn(List<String> values) {
            addCriterion("exit_address not in", values, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressBetween(String value1, String value2) {
            addCriterion("exit_address between", value1, value2, "exitAddress");
            return (Criteria) this;
        }

        public Criteria andExitAddressNotBetween(String value1, String value2) {
            addCriterion("exit_address not between", value1, value2, "exitAddress");
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