package com.sbs.barcode.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketMainExample() {
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

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNull() {
            addCriterion("buy_time is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("buy_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(Date value) {
            addCriterion("buy_time =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(Date value) {
            addCriterion("buy_time <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(Date value) {
            addCriterion("buy_time >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_time >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(Date value) {
            addCriterion("buy_time <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(Date value) {
            addCriterion("buy_time <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<Date> values) {
            addCriterion("buy_time in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<Date> values) {
            addCriterion("buy_time not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(Date value1, Date value2) {
            addCriterion("buy_time between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(Date value1, Date value2) {
            addCriterion("buy_time not between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("ticket_type is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("ticket_type is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(String value) {
            addCriterion("ticket_type =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(String value) {
            addCriterion("ticket_type <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(String value) {
            addCriterion("ticket_type >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_type >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(String value) {
            addCriterion("ticket_type <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(String value) {
            addCriterion("ticket_type <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLike(String value) {
            addCriterion("ticket_type like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotLike(String value) {
            addCriterion("ticket_type not like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<String> values) {
            addCriterion("ticket_type in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<String> values) {
            addCriterion("ticket_type not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(String value1, String value2) {
            addCriterion("ticket_type between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(String value1, String value2) {
            addCriterion("ticket_type not between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNull() {
            addCriterion("ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNotNull() {
            addCriterion("ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceEqualTo(Integer value) {
            addCriterion("ticket_price =", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotEqualTo(Integer value) {
            addCriterion("ticket_price <>", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThan(Integer value) {
            addCriterion("ticket_price >", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_price >=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThan(Integer value) {
            addCriterion("ticket_price <", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_price <=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIn(List<Integer> values) {
            addCriterion("ticket_price in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotIn(List<Integer> values) {
            addCriterion("ticket_price not in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceBetween(Integer value1, Integer value2) {
            addCriterion("ticket_price between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_price not between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andTouristNameIsNull() {
            addCriterion("tourist_name is null");
            return (Criteria) this;
        }

        public Criteria andTouristNameIsNotNull() {
            addCriterion("tourist_name is not null");
            return (Criteria) this;
        }

        public Criteria andTouristNameEqualTo(String value) {
            addCriterion("tourist_name =", value, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameNotEqualTo(String value) {
            addCriterion("tourist_name <>", value, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameGreaterThan(String value) {
            addCriterion("tourist_name >", value, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameGreaterThanOrEqualTo(String value) {
            addCriterion("tourist_name >=", value, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameLessThan(String value) {
            addCriterion("tourist_name <", value, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameLessThanOrEqualTo(String value) {
            addCriterion("tourist_name <=", value, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameLike(String value) {
            addCriterion("tourist_name like", value, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameNotLike(String value) {
            addCriterion("tourist_name not like", value, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameIn(List<String> values) {
            addCriterion("tourist_name in", values, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameNotIn(List<String> values) {
            addCriterion("tourist_name not in", values, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameBetween(String value1, String value2) {
            addCriterion("tourist_name between", value1, value2, "touristName");
            return (Criteria) this;
        }

        public Criteria andTouristNameNotBetween(String value1, String value2) {
            addCriterion("tourist_name not between", value1, value2, "touristName");
            return (Criteria) this;
        }

        public Criteria andGuideNameIsNull() {
            addCriterion("guide_name is null");
            return (Criteria) this;
        }

        public Criteria andGuideNameIsNotNull() {
            addCriterion("guide_name is not null");
            return (Criteria) this;
        }

        public Criteria andGuideNameEqualTo(String value) {
            addCriterion("guide_name =", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotEqualTo(String value) {
            addCriterion("guide_name <>", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameGreaterThan(String value) {
            addCriterion("guide_name >", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameGreaterThanOrEqualTo(String value) {
            addCriterion("guide_name >=", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLessThan(String value) {
            addCriterion("guide_name <", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLessThanOrEqualTo(String value) {
            addCriterion("guide_name <=", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameLike(String value) {
            addCriterion("guide_name like", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotLike(String value) {
            addCriterion("guide_name not like", value, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameIn(List<String> values) {
            addCriterion("guide_name in", values, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotIn(List<String> values) {
            addCriterion("guide_name not in", values, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameBetween(String value1, String value2) {
            addCriterion("guide_name between", value1, value2, "guideName");
            return (Criteria) this;
        }

        public Criteria andGuideNameNotBetween(String value1, String value2) {
            addCriterion("guide_name not between", value1, value2, "guideName");
            return (Criteria) this;
        }

        public Criteria andTouristAmountIsNull() {
            addCriterion("tourist_amount is null");
            return (Criteria) this;
        }

        public Criteria andTouristAmountIsNotNull() {
            addCriterion("tourist_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTouristAmountEqualTo(Integer value) {
            addCriterion("tourist_amount =", value, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountNotEqualTo(Integer value) {
            addCriterion("tourist_amount <>", value, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountGreaterThan(Integer value) {
            addCriterion("tourist_amount >", value, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tourist_amount >=", value, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountLessThan(Integer value) {
            addCriterion("tourist_amount <", value, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountLessThanOrEqualTo(Integer value) {
            addCriterion("tourist_amount <=", value, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountIn(List<Integer> values) {
            addCriterion("tourist_amount in", values, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountNotIn(List<Integer> values) {
            addCriterion("tourist_amount not in", values, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountBetween(Integer value1, Integer value2) {
            addCriterion("tourist_amount between", value1, value2, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andTouristAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("tourist_amount not between", value1, value2, "touristAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNull() {
            addCriterion("discount_type is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNotNull() {
            addCriterion("discount_type is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeEqualTo(String value) {
            addCriterion("discount_type =", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotEqualTo(String value) {
            addCriterion("discount_type <>", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThan(String value) {
            addCriterion("discount_type >", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("discount_type >=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThan(String value) {
            addCriterion("discount_type <", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThanOrEqualTo(String value) {
            addCriterion("discount_type <=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLike(String value) {
            addCriterion("discount_type like", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotLike(String value) {
            addCriterion("discount_type not like", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIn(List<String> values) {
            addCriterion("discount_type in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotIn(List<String> values) {
            addCriterion("discount_type not in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeBetween(String value1, String value2) {
            addCriterion("discount_type between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotBetween(String value1, String value2) {
            addCriterion("discount_type not between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonIsNull() {
            addCriterion("discount_reason is null");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonIsNotNull() {
            addCriterion("discount_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonEqualTo(String value) {
            addCriterion("discount_reason =", value, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonNotEqualTo(String value) {
            addCriterion("discount_reason <>", value, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonGreaterThan(String value) {
            addCriterion("discount_reason >", value, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonGreaterThanOrEqualTo(String value) {
            addCriterion("discount_reason >=", value, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonLessThan(String value) {
            addCriterion("discount_reason <", value, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonLessThanOrEqualTo(String value) {
            addCriterion("discount_reason <=", value, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonLike(String value) {
            addCriterion("discount_reason like", value, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonNotLike(String value) {
            addCriterion("discount_reason not like", value, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonIn(List<String> values) {
            addCriterion("discount_reason in", values, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonNotIn(List<String> values) {
            addCriterion("discount_reason not in", values, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonBetween(String value1, String value2) {
            addCriterion("discount_reason between", value1, value2, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountReasonNotBetween(String value1, String value2) {
            addCriterion("discount_reason not between", value1, value2, "discountReason");
            return (Criteria) this;
        }

        public Criteria andDiscountDateIsNull() {
            addCriterion("discount_date is null");
            return (Criteria) this;
        }

        public Criteria andDiscountDateIsNotNull() {
            addCriterion("discount_date is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountDateEqualTo(Date value) {
            addCriterion("discount_date =", value, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateNotEqualTo(Date value) {
            addCriterion("discount_date <>", value, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateGreaterThan(Date value) {
            addCriterion("discount_date >", value, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateGreaterThanOrEqualTo(Date value) {
            addCriterion("discount_date >=", value, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateLessThan(Date value) {
            addCriterion("discount_date <", value, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateLessThanOrEqualTo(Date value) {
            addCriterion("discount_date <=", value, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateIn(List<Date> values) {
            addCriterion("discount_date in", values, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateNotIn(List<Date> values) {
            addCriterion("discount_date not in", values, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateBetween(Date value1, Date value2) {
            addCriterion("discount_date between", value1, value2, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountDateNotBetween(Date value1, Date value2) {
            addCriterion("discount_date not between", value1, value2, "discountDate");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerIsNull() {
            addCriterion("discount_authorizer is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerIsNotNull() {
            addCriterion("discount_authorizer is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerEqualTo(String value) {
            addCriterion("discount_authorizer =", value, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerNotEqualTo(String value) {
            addCriterion("discount_authorizer <>", value, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerGreaterThan(String value) {
            addCriterion("discount_authorizer >", value, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerGreaterThanOrEqualTo(String value) {
            addCriterion("discount_authorizer >=", value, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerLessThan(String value) {
            addCriterion("discount_authorizer <", value, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerLessThanOrEqualTo(String value) {
            addCriterion("discount_authorizer <=", value, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerLike(String value) {
            addCriterion("discount_authorizer like", value, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerNotLike(String value) {
            addCriterion("discount_authorizer not like", value, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerIn(List<String> values) {
            addCriterion("discount_authorizer in", values, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerNotIn(List<String> values) {
            addCriterion("discount_authorizer not in", values, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerBetween(String value1, String value2) {
            addCriterion("discount_authorizer between", value1, value2, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDiscountAuthorizerNotBetween(String value1, String value2) {
            addCriterion("discount_authorizer not between", value1, value2, "discountAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonIsNull() {
            addCriterion("complimentary_person is null");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonIsNotNull() {
            addCriterion("complimentary_person is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonEqualTo(String value) {
            addCriterion("complimentary_person =", value, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonNotEqualTo(String value) {
            addCriterion("complimentary_person <>", value, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonGreaterThan(String value) {
            addCriterion("complimentary_person >", value, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonGreaterThanOrEqualTo(String value) {
            addCriterion("complimentary_person >=", value, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonLessThan(String value) {
            addCriterion("complimentary_person <", value, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonLessThanOrEqualTo(String value) {
            addCriterion("complimentary_person <=", value, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonLike(String value) {
            addCriterion("complimentary_person like", value, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonNotLike(String value) {
            addCriterion("complimentary_person not like", value, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonIn(List<String> values) {
            addCriterion("complimentary_person in", values, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonNotIn(List<String> values) {
            addCriterion("complimentary_person not in", values, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonBetween(String value1, String value2) {
            addCriterion("complimentary_person between", value1, value2, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryPersonNotBetween(String value1, String value2) {
            addCriterion("complimentary_person not between", value1, value2, "complimentaryPerson");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateIsNull() {
            addCriterion("complimentary_date is null");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateIsNotNull() {
            addCriterion("complimentary_date is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateEqualTo(Date value) {
            addCriterion("complimentary_date =", value, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateNotEqualTo(Date value) {
            addCriterion("complimentary_date <>", value, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateGreaterThan(Date value) {
            addCriterion("complimentary_date >", value, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("complimentary_date >=", value, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateLessThan(Date value) {
            addCriterion("complimentary_date <", value, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateLessThanOrEqualTo(Date value) {
            addCriterion("complimentary_date <=", value, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateIn(List<Date> values) {
            addCriterion("complimentary_date in", values, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateNotIn(List<Date> values) {
            addCriterion("complimentary_date not in", values, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateBetween(Date value1, Date value2) {
            addCriterion("complimentary_date between", value1, value2, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryDateNotBetween(Date value1, Date value2) {
            addCriterion("complimentary_date not between", value1, value2, "complimentaryDate");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerIsNull() {
            addCriterion("complimentary_authorizer is null");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerIsNotNull() {
            addCriterion("complimentary_authorizer is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerEqualTo(String value) {
            addCriterion("complimentary_authorizer =", value, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerNotEqualTo(String value) {
            addCriterion("complimentary_authorizer <>", value, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerGreaterThan(String value) {
            addCriterion("complimentary_authorizer >", value, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerGreaterThanOrEqualTo(String value) {
            addCriterion("complimentary_authorizer >=", value, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerLessThan(String value) {
            addCriterion("complimentary_authorizer <", value, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerLessThanOrEqualTo(String value) {
            addCriterion("complimentary_authorizer <=", value, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerLike(String value) {
            addCriterion("complimentary_authorizer like", value, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerNotLike(String value) {
            addCriterion("complimentary_authorizer not like", value, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerIn(List<String> values) {
            addCriterion("complimentary_authorizer in", values, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerNotIn(List<String> values) {
            addCriterion("complimentary_authorizer not in", values, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerBetween(String value1, String value2) {
            addCriterion("complimentary_authorizer between", value1, value2, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andComplimentaryAuthorizerNotBetween(String value1, String value2) {
            addCriterion("complimentary_authorizer not between", value1, value2, "complimentaryAuthorizer");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("plate_number not between", value1, value2, "plateNumber");
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