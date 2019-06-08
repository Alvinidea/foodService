package com.hcf.pojo;

import java.util.ArrayList;
import java.util.List;

public class VOrderdgoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VOrderdgoodsExample() {
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

        public Criteria andOrderiddIsNull() {
            addCriterion("orderIdD is null");
            return (Criteria) this;
        }

        public Criteria andOrderiddIsNotNull() {
            addCriterion("orderIdD is not null");
            return (Criteria) this;
        }

        public Criteria andOrderiddEqualTo(String value) {
            addCriterion("orderIdD =", value, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddNotEqualTo(String value) {
            addCriterion("orderIdD <>", value, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddGreaterThan(String value) {
            addCriterion("orderIdD >", value, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddGreaterThanOrEqualTo(String value) {
            addCriterion("orderIdD >=", value, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddLessThan(String value) {
            addCriterion("orderIdD <", value, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddLessThanOrEqualTo(String value) {
            addCriterion("orderIdD <=", value, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddLike(String value) {
            addCriterion("orderIdD like", value, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddNotLike(String value) {
            addCriterion("orderIdD not like", value, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddIn(List<String> values) {
            addCriterion("orderIdD in", values, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddNotIn(List<String> values) {
            addCriterion("orderIdD not in", values, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddBetween(String value1, String value2) {
            addCriterion("orderIdD between", value1, value2, "orderidd");
            return (Criteria) this;
        }

        public Criteria andOrderiddNotBetween(String value1, String value2) {
            addCriterion("orderIdD not between", value1, value2, "orderidd");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("goodsId like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("goodsId not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
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

        public Criteria andOrderpricedIsNull() {
            addCriterion("orderPriceD is null");
            return (Criteria) this;
        }

        public Criteria andOrderpricedIsNotNull() {
            addCriterion("orderPriceD is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpricedEqualTo(Double value) {
            addCriterion("orderPriceD =", value, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedNotEqualTo(Double value) {
            addCriterion("orderPriceD <>", value, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedGreaterThan(Double value) {
            addCriterion("orderPriceD >", value, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedGreaterThanOrEqualTo(Double value) {
            addCriterion("orderPriceD >=", value, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedLessThan(Double value) {
            addCriterion("orderPriceD <", value, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedLessThanOrEqualTo(Double value) {
            addCriterion("orderPriceD <=", value, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedIn(List<Double> values) {
            addCriterion("orderPriceD in", values, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedNotIn(List<Double> values) {
            addCriterion("orderPriceD not in", values, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedBetween(Double value1, Double value2) {
            addCriterion("orderPriceD between", value1, value2, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrderpricedNotBetween(Double value1, Double value2) {
            addCriterion("orderPriceD not between", value1, value2, "orderpriced");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdIsNull() {
            addCriterion("orderGNumD is null");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdIsNotNull() {
            addCriterion("orderGNumD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdEqualTo(Integer value) {
            addCriterion("orderGNumD =", value, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdNotEqualTo(Integer value) {
            addCriterion("orderGNumD <>", value, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdGreaterThan(Integer value) {
            addCriterion("orderGNumD >", value, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderGNumD >=", value, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdLessThan(Integer value) {
            addCriterion("orderGNumD <", value, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdLessThanOrEqualTo(Integer value) {
            addCriterion("orderGNumD <=", value, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdIn(List<Integer> values) {
            addCriterion("orderGNumD in", values, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdNotIn(List<Integer> values) {
            addCriterion("orderGNumD not in", values, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdBetween(Integer value1, Integer value2) {
            addCriterion("orderGNumD between", value1, value2, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrdergnumdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderGNumD not between", value1, value2, "ordergnumd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdIsNull() {
            addCriterion("orderDiscountD is null");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdIsNotNull() {
            addCriterion("orderDiscountD is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdEqualTo(Double value) {
            addCriterion("orderDiscountD =", value, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdNotEqualTo(Double value) {
            addCriterion("orderDiscountD <>", value, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdGreaterThan(Double value) {
            addCriterion("orderDiscountD >", value, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdGreaterThanOrEqualTo(Double value) {
            addCriterion("orderDiscountD >=", value, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdLessThan(Double value) {
            addCriterion("orderDiscountD <", value, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdLessThanOrEqualTo(Double value) {
            addCriterion("orderDiscountD <=", value, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdIn(List<Double> values) {
            addCriterion("orderDiscountD in", values, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdNotIn(List<Double> values) {
            addCriterion("orderDiscountD not in", values, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdBetween(Double value1, Double value2) {
            addCriterion("orderDiscountD between", value1, value2, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountdNotBetween(Double value1, Double value2) {
            addCriterion("orderDiscountD not between", value1, value2, "orderdiscountd");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedIsNull() {
            addCriterion("orderAllPriceD is null");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedIsNotNull() {
            addCriterion("orderAllPriceD is not null");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedEqualTo(Double value) {
            addCriterion("orderAllPriceD =", value, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedNotEqualTo(Double value) {
            addCriterion("orderAllPriceD <>", value, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedGreaterThan(Double value) {
            addCriterion("orderAllPriceD >", value, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedGreaterThanOrEqualTo(Double value) {
            addCriterion("orderAllPriceD >=", value, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedLessThan(Double value) {
            addCriterion("orderAllPriceD <", value, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedLessThanOrEqualTo(Double value) {
            addCriterion("orderAllPriceD <=", value, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedIn(List<Double> values) {
            addCriterion("orderAllPriceD in", values, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedNotIn(List<Double> values) {
            addCriterion("orderAllPriceD not in", values, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedBetween(Double value1, Double value2) {
            addCriterion("orderAllPriceD between", value1, value2, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderallpricedNotBetween(Double value1, Double value2) {
            addCriterion("orderAllPriceD not between", value1, value2, "orderallpriced");
            return (Criteria) this;
        }

        public Criteria andOrderdotherIsNull() {
            addCriterion("orderDOther is null");
            return (Criteria) this;
        }

        public Criteria andOrderdotherIsNotNull() {
            addCriterion("orderDOther is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdotherEqualTo(String value) {
            addCriterion("orderDOther =", value, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherNotEqualTo(String value) {
            addCriterion("orderDOther <>", value, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherGreaterThan(String value) {
            addCriterion("orderDOther >", value, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherGreaterThanOrEqualTo(String value) {
            addCriterion("orderDOther >=", value, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherLessThan(String value) {
            addCriterion("orderDOther <", value, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherLessThanOrEqualTo(String value) {
            addCriterion("orderDOther <=", value, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherLike(String value) {
            addCriterion("orderDOther like", value, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherNotLike(String value) {
            addCriterion("orderDOther not like", value, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherIn(List<String> values) {
            addCriterion("orderDOther in", values, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherNotIn(List<String> values) {
            addCriterion("orderDOther not in", values, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherBetween(String value1, String value2) {
            addCriterion("orderDOther between", value1, value2, "orderdother");
            return (Criteria) this;
        }

        public Criteria andOrderdotherNotBetween(String value1, String value2) {
            addCriterion("orderDOther not between", value1, value2, "orderdother");
            return (Criteria) this;
        }

        public Criteria andGoodssellerIsNull() {
            addCriterion("goodsSeller is null");
            return (Criteria) this;
        }

        public Criteria andGoodssellerIsNotNull() {
            addCriterion("goodsSeller is not null");
            return (Criteria) this;
        }

        public Criteria andGoodssellerEqualTo(String value) {
            addCriterion("goodsSeller =", value, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerNotEqualTo(String value) {
            addCriterion("goodsSeller <>", value, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerGreaterThan(String value) {
            addCriterion("goodsSeller >", value, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerGreaterThanOrEqualTo(String value) {
            addCriterion("goodsSeller >=", value, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerLessThan(String value) {
            addCriterion("goodsSeller <", value, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerLessThanOrEqualTo(String value) {
            addCriterion("goodsSeller <=", value, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerLike(String value) {
            addCriterion("goodsSeller like", value, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerNotLike(String value) {
            addCriterion("goodsSeller not like", value, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerIn(List<String> values) {
            addCriterion("goodsSeller in", values, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerNotIn(List<String> values) {
            addCriterion("goodsSeller not in", values, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerBetween(String value1, String value2) {
            addCriterion("goodsSeller between", value1, value2, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodssellerNotBetween(String value1, String value2) {
            addCriterion("goodsSeller not between", value1, value2, "goodsseller");
            return (Criteria) this;
        }

        public Criteria andGoodspicIsNull() {
            addCriterion("goodsPic is null");
            return (Criteria) this;
        }

        public Criteria andGoodspicIsNotNull() {
            addCriterion("goodsPic is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspicEqualTo(String value) {
            addCriterion("goodsPic =", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicNotEqualTo(String value) {
            addCriterion("goodsPic <>", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicGreaterThan(String value) {
            addCriterion("goodsPic >", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicGreaterThanOrEqualTo(String value) {
            addCriterion("goodsPic >=", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicLessThan(String value) {
            addCriterion("goodsPic <", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicLessThanOrEqualTo(String value) {
            addCriterion("goodsPic <=", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicLike(String value) {
            addCriterion("goodsPic like", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicNotLike(String value) {
            addCriterion("goodsPic not like", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicIn(List<String> values) {
            addCriterion("goodsPic in", values, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicNotIn(List<String> values) {
            addCriterion("goodsPic not in", values, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicBetween(String value1, String value2) {
            addCriterion("goodsPic between", value1, value2, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicNotBetween(String value1, String value2) {
            addCriterion("goodsPic not between", value1, value2, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsIsNull() {
            addCriterion("goodsStars is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsIsNotNull() {
            addCriterion("goodsStars is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsEqualTo(Integer value) {
            addCriterion("goodsStars =", value, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsNotEqualTo(Integer value) {
            addCriterion("goodsStars <>", value, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsGreaterThan(Integer value) {
            addCriterion("goodsStars >", value, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsStars >=", value, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsLessThan(Integer value) {
            addCriterion("goodsStars <", value, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsLessThanOrEqualTo(Integer value) {
            addCriterion("goodsStars <=", value, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsIn(List<Integer> values) {
            addCriterion("goodsStars in", values, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsNotIn(List<Integer> values) {
            addCriterion("goodsStars not in", values, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsBetween(Integer value1, Integer value2) {
            addCriterion("goodsStars between", value1, value2, "goodsstars");
            return (Criteria) this;
        }

        public Criteria andGoodsstarsNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsStars not between", value1, value2, "goodsstars");
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