package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrdersExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
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

        public Criteria andOrderdetailnumIsNull() {
            addCriterion("orderDetailNum is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumIsNotNull() {
            addCriterion("orderDetailNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumEqualTo(Integer value) {
            addCriterion("orderDetailNum =", value, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumNotEqualTo(Integer value) {
            addCriterion("orderDetailNum <>", value, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumGreaterThan(Integer value) {
            addCriterion("orderDetailNum >", value, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderDetailNum >=", value, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumLessThan(Integer value) {
            addCriterion("orderDetailNum <", value, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumLessThanOrEqualTo(Integer value) {
            addCriterion("orderDetailNum <=", value, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumIn(List<Integer> values) {
            addCriterion("orderDetailNum in", values, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumNotIn(List<Integer> values) {
            addCriterion("orderDetailNum not in", values, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumBetween(Integer value1, Integer value2) {
            addCriterion("orderDetailNum between", value1, value2, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumNotBetween(Integer value1, Integer value2) {
            addCriterion("orderDetailNum not between", value1, value2, "orderdetailnum");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountIsNull() {
            addCriterion("orderDiscount is null");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountIsNotNull() {
            addCriterion("orderDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountEqualTo(Double value) {
            addCriterion("orderDiscount =", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountNotEqualTo(Double value) {
            addCriterion("orderDiscount <>", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountGreaterThan(Double value) {
            addCriterion("orderDiscount >", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("orderDiscount >=", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountLessThan(Double value) {
            addCriterion("orderDiscount <", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountLessThanOrEqualTo(Double value) {
            addCriterion("orderDiscount <=", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountIn(List<Double> values) {
            addCriterion("orderDiscount in", values, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountNotIn(List<Double> values) {
            addCriterion("orderDiscount not in", values, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountBetween(Double value1, Double value2) {
            addCriterion("orderDiscount between", value1, value2, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountNotBetween(Double value1, Double value2) {
            addCriterion("orderDiscount not between", value1, value2, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceIsNull() {
            addCriterion("orderAllPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceIsNotNull() {
            addCriterion("orderAllPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceEqualTo(Double value) {
            addCriterion("orderAllPrice =", value, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceNotEqualTo(Double value) {
            addCriterion("orderAllPrice <>", value, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceGreaterThan(Double value) {
            addCriterion("orderAllPrice >", value, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("orderAllPrice >=", value, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceLessThan(Double value) {
            addCriterion("orderAllPrice <", value, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceLessThanOrEqualTo(Double value) {
            addCriterion("orderAllPrice <=", value, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceIn(List<Double> values) {
            addCriterion("orderAllPrice in", values, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceNotIn(List<Double> values) {
            addCriterion("orderAllPrice not in", values, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceBetween(Double value1, Double value2) {
            addCriterion("orderAllPrice between", value1, value2, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderallpriceNotBetween(Double value1, Double value2) {
            addCriterion("orderAllPrice not between", value1, value2, "orderallprice");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Integer value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Integer value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Integer value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Integer value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Integer> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Integer> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodIsNull() {
            addCriterion("orderPayMethod is null");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodIsNotNull() {
            addCriterion("orderPayMethod is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodEqualTo(String value) {
            addCriterion("orderPayMethod =", value, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodNotEqualTo(String value) {
            addCriterion("orderPayMethod <>", value, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodGreaterThan(String value) {
            addCriterion("orderPayMethod >", value, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodGreaterThanOrEqualTo(String value) {
            addCriterion("orderPayMethod >=", value, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodLessThan(String value) {
            addCriterion("orderPayMethod <", value, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodLessThanOrEqualTo(String value) {
            addCriterion("orderPayMethod <=", value, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodLike(String value) {
            addCriterion("orderPayMethod like", value, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodNotLike(String value) {
            addCriterion("orderPayMethod not like", value, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodIn(List<String> values) {
            addCriterion("orderPayMethod in", values, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodNotIn(List<String> values) {
            addCriterion("orderPayMethod not in", values, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodBetween(String value1, String value2) {
            addCriterion("orderPayMethod between", value1, value2, "orderpaymethod");
            return (Criteria) this;
        }

        public Criteria andOrderpaymethodNotBetween(String value1, String value2) {
            addCriterion("orderPayMethod not between", value1, value2, "orderpaymethod");
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