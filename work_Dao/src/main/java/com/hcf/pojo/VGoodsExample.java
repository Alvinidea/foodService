package com.hcf.pojo;

import java.util.ArrayList;
import java.util.List;

public class VGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VGoodsExample() {
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

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Double value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Double value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Double value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Double value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Double value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Double> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Double> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Double value1, Double value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Double value1, Double value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountIsNull() {
            addCriterion("goodsDiscount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountIsNotNull() {
            addCriterion("goodsDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountEqualTo(Double value) {
            addCriterion("goodsDiscount =", value, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountNotEqualTo(Double value) {
            addCriterion("goodsDiscount <>", value, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountGreaterThan(Double value) {
            addCriterion("goodsDiscount >", value, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsDiscount >=", value, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountLessThan(Double value) {
            addCriterion("goodsDiscount <", value, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountLessThanOrEqualTo(Double value) {
            addCriterion("goodsDiscount <=", value, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountIn(List<Double> values) {
            addCriterion("goodsDiscount in", values, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountNotIn(List<Double> values) {
            addCriterion("goodsDiscount not in", values, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountBetween(Double value1, Double value2) {
            addCriterion("goodsDiscount between", value1, value2, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsdiscountNotBetween(Double value1, Double value2) {
            addCriterion("goodsDiscount not between", value1, value2, "goodsdiscount");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumIsNull() {
            addCriterion("goodsCmtNum is null");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumIsNotNull() {
            addCriterion("goodsCmtNum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumEqualTo(Integer value) {
            addCriterion("goodsCmtNum =", value, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumNotEqualTo(Integer value) {
            addCriterion("goodsCmtNum <>", value, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumGreaterThan(Integer value) {
            addCriterion("goodsCmtNum >", value, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsCmtNum >=", value, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumLessThan(Integer value) {
            addCriterion("goodsCmtNum <", value, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumLessThanOrEqualTo(Integer value) {
            addCriterion("goodsCmtNum <=", value, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumIn(List<Integer> values) {
            addCriterion("goodsCmtNum in", values, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumNotIn(List<Integer> values) {
            addCriterion("goodsCmtNum not in", values, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumBetween(Integer value1, Integer value2) {
            addCriterion("goodsCmtNum between", value1, value2, "goodscmtnum");
            return (Criteria) this;
        }

        public Criteria andGoodscmtnumNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsCmtNum not between", value1, value2, "goodscmtnum");
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

        public Criteria andGoodsotherIsNull() {
            addCriterion("goodsOther is null");
            return (Criteria) this;
        }

        public Criteria andGoodsotherIsNotNull() {
            addCriterion("goodsOther is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsotherEqualTo(String value) {
            addCriterion("goodsOther =", value, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherNotEqualTo(String value) {
            addCriterion("goodsOther <>", value, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherGreaterThan(String value) {
            addCriterion("goodsOther >", value, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherGreaterThanOrEqualTo(String value) {
            addCriterion("goodsOther >=", value, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherLessThan(String value) {
            addCriterion("goodsOther <", value, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherLessThanOrEqualTo(String value) {
            addCriterion("goodsOther <=", value, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherLike(String value) {
            addCriterion("goodsOther like", value, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherNotLike(String value) {
            addCriterion("goodsOther not like", value, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherIn(List<String> values) {
            addCriterion("goodsOther in", values, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherNotIn(List<String> values) {
            addCriterion("goodsOther not in", values, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherBetween(String value1, String value2) {
            addCriterion("goodsOther between", value1, value2, "goodsother");
            return (Criteria) this;
        }

        public Criteria andGoodsotherNotBetween(String value1, String value2) {
            addCriterion("goodsOther not between", value1, value2, "goodsother");
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