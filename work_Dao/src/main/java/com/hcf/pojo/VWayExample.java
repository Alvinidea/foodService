package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VWayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VWayExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeliverIsNull() {
            addCriterion("deliver is null");
            return (Criteria) this;
        }

        public Criteria andDeliverIsNotNull() {
            addCriterion("deliver is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverEqualTo(String value) {
            addCriterion("deliver =", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverNotEqualTo(String value) {
            addCriterion("deliver <>", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverGreaterThan(String value) {
            addCriterion("deliver >", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverGreaterThanOrEqualTo(String value) {
            addCriterion("deliver >=", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverLessThan(String value) {
            addCriterion("deliver <", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverLessThanOrEqualTo(String value) {
            addCriterion("deliver <=", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverLike(String value) {
            addCriterion("deliver like", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverNotLike(String value) {
            addCriterion("deliver not like", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverIn(List<String> values) {
            addCriterion("deliver in", values, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverNotIn(List<String> values) {
            addCriterion("deliver not in", values, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverBetween(String value1, String value2) {
            addCriterion("deliver between", value1, value2, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverNotBetween(String value1, String value2) {
            addCriterion("deliver not between", value1, value2, "deliver");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("overtime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("overtime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Date value) {
            addCriterion("overtime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Date value) {
            addCriterion("overtime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Date value) {
            addCriterion("overtime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("overtime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Date value) {
            addCriterion("overtime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Date value) {
            addCriterion("overtime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Date> values) {
            addCriterion("overtime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Date> values) {
            addCriterion("overtime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Date value1, Date value2) {
            addCriterion("overtime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Date value1, Date value2) {
            addCriterion("overtime not between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("begintime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("begintime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("begintime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("begintime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("begintime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begintime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("begintime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("begintime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("begintime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("begintime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("begintime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("begintime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPayercmtIsNull() {
            addCriterion("payerCmt is null");
            return (Criteria) this;
        }

        public Criteria andPayercmtIsNotNull() {
            addCriterion("payerCmt is not null");
            return (Criteria) this;
        }

        public Criteria andPayercmtEqualTo(String value) {
            addCriterion("payerCmt =", value, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtNotEqualTo(String value) {
            addCriterion("payerCmt <>", value, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtGreaterThan(String value) {
            addCriterion("payerCmt >", value, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtGreaterThanOrEqualTo(String value) {
            addCriterion("payerCmt >=", value, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtLessThan(String value) {
            addCriterion("payerCmt <", value, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtLessThanOrEqualTo(String value) {
            addCriterion("payerCmt <=", value, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtLike(String value) {
            addCriterion("payerCmt like", value, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtNotLike(String value) {
            addCriterion("payerCmt not like", value, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtIn(List<String> values) {
            addCriterion("payerCmt in", values, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtNotIn(List<String> values) {
            addCriterion("payerCmt not in", values, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtBetween(String value1, String value2) {
            addCriterion("payerCmt between", value1, value2, "payercmt");
            return (Criteria) this;
        }

        public Criteria andPayercmtNotBetween(String value1, String value2) {
            addCriterion("payerCmt not between", value1, value2, "payercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtIsNull() {
            addCriterion("sellerCmt is null");
            return (Criteria) this;
        }

        public Criteria andSellercmtIsNotNull() {
            addCriterion("sellerCmt is not null");
            return (Criteria) this;
        }

        public Criteria andSellercmtEqualTo(String value) {
            addCriterion("sellerCmt =", value, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtNotEqualTo(String value) {
            addCriterion("sellerCmt <>", value, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtGreaterThan(String value) {
            addCriterion("sellerCmt >", value, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtGreaterThanOrEqualTo(String value) {
            addCriterion("sellerCmt >=", value, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtLessThan(String value) {
            addCriterion("sellerCmt <", value, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtLessThanOrEqualTo(String value) {
            addCriterion("sellerCmt <=", value, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtLike(String value) {
            addCriterion("sellerCmt like", value, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtNotLike(String value) {
            addCriterion("sellerCmt not like", value, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtIn(List<String> values) {
            addCriterion("sellerCmt in", values, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtNotIn(List<String> values) {
            addCriterion("sellerCmt not in", values, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtBetween(String value1, String value2) {
            addCriterion("sellerCmt between", value1, value2, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andSellercmtNotBetween(String value1, String value2) {
            addCriterion("sellerCmt not between", value1, value2, "sellercmt");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Integer value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Integer value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Integer value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Integer value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Integer value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Integer> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Integer> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Integer value1, Integer value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Integer value1, Integer value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressIsNull() {
            addCriterion("orderSAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressIsNotNull() {
            addCriterion("orderSAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressEqualTo(String value) {
            addCriterion("orderSAddress =", value, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressNotEqualTo(String value) {
            addCriterion("orderSAddress <>", value, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressGreaterThan(String value) {
            addCriterion("orderSAddress >", value, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressGreaterThanOrEqualTo(String value) {
            addCriterion("orderSAddress >=", value, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressLessThan(String value) {
            addCriterion("orderSAddress <", value, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressLessThanOrEqualTo(String value) {
            addCriterion("orderSAddress <=", value, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressLike(String value) {
            addCriterion("orderSAddress like", value, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressNotLike(String value) {
            addCriterion("orderSAddress not like", value, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressIn(List<String> values) {
            addCriterion("orderSAddress in", values, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressNotIn(List<String> values) {
            addCriterion("orderSAddress not in", values, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressBetween(String value1, String value2) {
            addCriterion("orderSAddress between", value1, value2, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrdersaddressNotBetween(String value1, String value2) {
            addCriterion("orderSAddress not between", value1, value2, "ordersaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressIsNull() {
            addCriterion("orderPAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressIsNotNull() {
            addCriterion("orderPAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressEqualTo(String value) {
            addCriterion("orderPAddress =", value, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressNotEqualTo(String value) {
            addCriterion("orderPAddress <>", value, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressGreaterThan(String value) {
            addCriterion("orderPAddress >", value, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("orderPAddress >=", value, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressLessThan(String value) {
            addCriterion("orderPAddress <", value, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressLessThanOrEqualTo(String value) {
            addCriterion("orderPAddress <=", value, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressLike(String value) {
            addCriterion("orderPAddress like", value, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressNotLike(String value) {
            addCriterion("orderPAddress not like", value, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressIn(List<String> values) {
            addCriterion("orderPAddress in", values, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressNotIn(List<String> values) {
            addCriterion("orderPAddress not in", values, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressBetween(String value1, String value2) {
            addCriterion("orderPAddress between", value1, value2, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderpaddressNotBetween(String value1, String value2) {
            addCriterion("orderPAddress not between", value1, value2, "orderpaddress");
            return (Criteria) this;
        }

        public Criteria andOrderotherIsNull() {
            addCriterion("orderOther is null");
            return (Criteria) this;
        }

        public Criteria andOrderotherIsNotNull() {
            addCriterion("orderOther is not null");
            return (Criteria) this;
        }

        public Criteria andOrderotherEqualTo(String value) {
            addCriterion("orderOther =", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherNotEqualTo(String value) {
            addCriterion("orderOther <>", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherGreaterThan(String value) {
            addCriterion("orderOther >", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherGreaterThanOrEqualTo(String value) {
            addCriterion("orderOther >=", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherLessThan(String value) {
            addCriterion("orderOther <", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherLessThanOrEqualTo(String value) {
            addCriterion("orderOther <=", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherLike(String value) {
            addCriterion("orderOther like", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherNotLike(String value) {
            addCriterion("orderOther not like", value, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherIn(List<String> values) {
            addCriterion("orderOther in", values, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherNotIn(List<String> values) {
            addCriterion("orderOther not in", values, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherBetween(String value1, String value2) {
            addCriterion("orderOther between", value1, value2, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderotherNotBetween(String value1, String value2) {
            addCriterion("orderOther not between", value1, value2, "orderother");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeIsNull() {
            addCriterion("orderBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeIsNotNull() {
            addCriterion("orderBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeEqualTo(Date value) {
            addCriterionForJDBCDate("orderBeginTime =", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("orderBeginTime <>", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("orderBeginTime >", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderBeginTime >=", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeLessThan(Date value) {
            addCriterionForJDBCDate("orderBeginTime <", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderBeginTime <=", value, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeIn(List<Date> values) {
            addCriterionForJDBCDate("orderBeginTime in", values, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("orderBeginTime not in", values, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderBeginTime between", value1, value2, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderbegintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderBeginTime not between", value1, value2, "orderbegintime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeIsNull() {
            addCriterion("orderOverTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeIsNotNull() {
            addCriterion("orderOverTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeEqualTo(Date value) {
            addCriterionForJDBCDate("orderOverTime =", value, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("orderOverTime <>", value, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("orderOverTime >", value, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderOverTime >=", value, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeLessThan(Date value) {
            addCriterionForJDBCDate("orderOverTime <", value, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderOverTime <=", value, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeIn(List<Date> values) {
            addCriterionForJDBCDate("orderOverTime in", values, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("orderOverTime not in", values, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderOverTime between", value1, value2, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andOrderovertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderOverTime not between", value1, value2, "orderovertime");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIsNull() {
            addCriterion("storeAddress is null");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIsNotNull() {
            addCriterion("storeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStoreaddressEqualTo(String value) {
            addCriterion("storeAddress =", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotEqualTo(String value) {
            addCriterion("storeAddress <>", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressGreaterThan(String value) {
            addCriterion("storeAddress >", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressGreaterThanOrEqualTo(String value) {
            addCriterion("storeAddress >=", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLessThan(String value) {
            addCriterion("storeAddress <", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLessThanOrEqualTo(String value) {
            addCriterion("storeAddress <=", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressLike(String value) {
            addCriterion("storeAddress like", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotLike(String value) {
            addCriterion("storeAddress not like", value, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressIn(List<String> values) {
            addCriterion("storeAddress in", values, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotIn(List<String> values) {
            addCriterion("storeAddress not in", values, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressBetween(String value1, String value2) {
            addCriterion("storeAddress between", value1, value2, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStoreaddressNotBetween(String value1, String value2) {
            addCriterion("storeAddress not between", value1, value2, "storeaddress");
            return (Criteria) this;
        }

        public Criteria andStorephoneIsNull() {
            addCriterion("storePhone is null");
            return (Criteria) this;
        }

        public Criteria andStorephoneIsNotNull() {
            addCriterion("storePhone is not null");
            return (Criteria) this;
        }

        public Criteria andStorephoneEqualTo(String value) {
            addCriterion("storePhone =", value, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneNotEqualTo(String value) {
            addCriterion("storePhone <>", value, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneGreaterThan(String value) {
            addCriterion("storePhone >", value, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneGreaterThanOrEqualTo(String value) {
            addCriterion("storePhone >=", value, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneLessThan(String value) {
            addCriterion("storePhone <", value, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneLessThanOrEqualTo(String value) {
            addCriterion("storePhone <=", value, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneLike(String value) {
            addCriterion("storePhone like", value, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneNotLike(String value) {
            addCriterion("storePhone not like", value, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneIn(List<String> values) {
            addCriterion("storePhone in", values, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneNotIn(List<String> values) {
            addCriterion("storePhone not in", values, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneBetween(String value1, String value2) {
            addCriterion("storePhone between", value1, value2, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorephoneNotBetween(String value1, String value2) {
            addCriterion("storePhone not between", value1, value2, "storephone");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNull() {
            addCriterion("storeName is null");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNotNull() {
            addCriterion("storeName is not null");
            return (Criteria) this;
        }

        public Criteria andStorenameEqualTo(String value) {
            addCriterion("storeName =", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotEqualTo(String value) {
            addCriterion("storeName <>", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThan(String value) {
            addCriterion("storeName >", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("storeName >=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThan(String value) {
            addCriterion("storeName <", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThanOrEqualTo(String value) {
            addCriterion("storeName <=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLike(String value) {
            addCriterion("storeName like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotLike(String value) {
            addCriterion("storeName not like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameIn(List<String> values) {
            addCriterion("storeName in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotIn(List<String> values) {
            addCriterion("storeName not in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameBetween(String value1, String value2) {
            addCriterion("storeName between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotBetween(String value1, String value2) {
            addCriterion("storeName not between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andStoretypeIsNull() {
            addCriterion("storetype is null");
            return (Criteria) this;
        }

        public Criteria andStoretypeIsNotNull() {
            addCriterion("storetype is not null");
            return (Criteria) this;
        }

        public Criteria andStoretypeEqualTo(Integer value) {
            addCriterion("storetype =", value, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeNotEqualTo(Integer value) {
            addCriterion("storetype <>", value, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeGreaterThan(Integer value) {
            addCriterion("storetype >", value, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("storetype >=", value, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeLessThan(Integer value) {
            addCriterion("storetype <", value, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeLessThanOrEqualTo(Integer value) {
            addCriterion("storetype <=", value, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeIn(List<Integer> values) {
            addCriterion("storetype in", values, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeNotIn(List<Integer> values) {
            addCriterion("storetype not in", values, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeBetween(Integer value1, Integer value2) {
            addCriterion("storetype between", value1, value2, "storetype");
            return (Criteria) this;
        }

        public Criteria andStoretypeNotBetween(Integer value1, Integer value2) {
            addCriterion("storetype not between", value1, value2, "storetype");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOrderpayerIsNull() {
            addCriterion("orderPayer is null");
            return (Criteria) this;
        }

        public Criteria andOrderpayerIsNotNull() {
            addCriterion("orderPayer is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpayerEqualTo(String value) {
            addCriterion("orderPayer =", value, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerNotEqualTo(String value) {
            addCriterion("orderPayer <>", value, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerGreaterThan(String value) {
            addCriterion("orderPayer >", value, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerGreaterThanOrEqualTo(String value) {
            addCriterion("orderPayer >=", value, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerLessThan(String value) {
            addCriterion("orderPayer <", value, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerLessThanOrEqualTo(String value) {
            addCriterion("orderPayer <=", value, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerLike(String value) {
            addCriterion("orderPayer like", value, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerNotLike(String value) {
            addCriterion("orderPayer not like", value, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerIn(List<String> values) {
            addCriterion("orderPayer in", values, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerNotIn(List<String> values) {
            addCriterion("orderPayer not in", values, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerBetween(String value1, String value2) {
            addCriterion("orderPayer between", value1, value2, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrderpayerNotBetween(String value1, String value2) {
            addCriterion("orderPayer not between", value1, value2, "orderpayer");
            return (Criteria) this;
        }

        public Criteria andOrdersellerIsNull() {
            addCriterion("orderSeller is null");
            return (Criteria) this;
        }

        public Criteria andOrdersellerIsNotNull() {
            addCriterion("orderSeller is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersellerEqualTo(String value) {
            addCriterion("orderSeller =", value, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerNotEqualTo(String value) {
            addCriterion("orderSeller <>", value, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerGreaterThan(String value) {
            addCriterion("orderSeller >", value, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerGreaterThanOrEqualTo(String value) {
            addCriterion("orderSeller >=", value, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerLessThan(String value) {
            addCriterion("orderSeller <", value, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerLessThanOrEqualTo(String value) {
            addCriterion("orderSeller <=", value, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerLike(String value) {
            addCriterion("orderSeller like", value, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerNotLike(String value) {
            addCriterion("orderSeller not like", value, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerIn(List<String> values) {
            addCriterion("orderSeller in", values, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerNotIn(List<String> values) {
            addCriterion("orderSeller not in", values, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerBetween(String value1, String value2) {
            addCriterion("orderSeller between", value1, value2, "orderseller");
            return (Criteria) this;
        }

        public Criteria andOrdersellerNotBetween(String value1, String value2) {
            addCriterion("orderSeller not between", value1, value2, "orderseller");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
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