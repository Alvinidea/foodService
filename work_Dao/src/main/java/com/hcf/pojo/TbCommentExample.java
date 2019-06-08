package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCommentExample() {
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

        public Criteria andCmtidIsNull() {
            addCriterion("cmtId is null");
            return (Criteria) this;
        }

        public Criteria andCmtidIsNotNull() {
            addCriterion("cmtId is not null");
            return (Criteria) this;
        }

        public Criteria andCmtidEqualTo(Integer value) {
            addCriterion("cmtId =", value, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidNotEqualTo(Integer value) {
            addCriterion("cmtId <>", value, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidGreaterThan(Integer value) {
            addCriterion("cmtId >", value, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmtId >=", value, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidLessThan(Integer value) {
            addCriterion("cmtId <", value, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidLessThanOrEqualTo(Integer value) {
            addCriterion("cmtId <=", value, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidIn(List<Integer> values) {
            addCriterion("cmtId in", values, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidNotIn(List<Integer> values) {
            addCriterion("cmtId not in", values, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidBetween(Integer value1, Integer value2) {
            addCriterion("cmtId between", value1, value2, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtidNotBetween(Integer value1, Integer value2) {
            addCriterion("cmtId not between", value1, value2, "cmtid");
            return (Criteria) this;
        }

        public Criteria andCmtsellerIsNull() {
            addCriterion("cmtSeller is null");
            return (Criteria) this;
        }

        public Criteria andCmtsellerIsNotNull() {
            addCriterion("cmtSeller is not null");
            return (Criteria) this;
        }

        public Criteria andCmtsellerEqualTo(String value) {
            addCriterion("cmtSeller =", value, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerNotEqualTo(String value) {
            addCriterion("cmtSeller <>", value, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerGreaterThan(String value) {
            addCriterion("cmtSeller >", value, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerGreaterThanOrEqualTo(String value) {
            addCriterion("cmtSeller >=", value, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerLessThan(String value) {
            addCriterion("cmtSeller <", value, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerLessThanOrEqualTo(String value) {
            addCriterion("cmtSeller <=", value, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerLike(String value) {
            addCriterion("cmtSeller like", value, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerNotLike(String value) {
            addCriterion("cmtSeller not like", value, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerIn(List<String> values) {
            addCriterion("cmtSeller in", values, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerNotIn(List<String> values) {
            addCriterion("cmtSeller not in", values, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerBetween(String value1, String value2) {
            addCriterion("cmtSeller between", value1, value2, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtsellerNotBetween(String value1, String value2) {
            addCriterion("cmtSeller not between", value1, value2, "cmtseller");
            return (Criteria) this;
        }

        public Criteria andCmtpayerIsNull() {
            addCriterion("cmtPayer is null");
            return (Criteria) this;
        }

        public Criteria andCmtpayerIsNotNull() {
            addCriterion("cmtPayer is not null");
            return (Criteria) this;
        }

        public Criteria andCmtpayerEqualTo(String value) {
            addCriterion("cmtPayer =", value, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerNotEqualTo(String value) {
            addCriterion("cmtPayer <>", value, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerGreaterThan(String value) {
            addCriterion("cmtPayer >", value, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerGreaterThanOrEqualTo(String value) {
            addCriterion("cmtPayer >=", value, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerLessThan(String value) {
            addCriterion("cmtPayer <", value, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerLessThanOrEqualTo(String value) {
            addCriterion("cmtPayer <=", value, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerLike(String value) {
            addCriterion("cmtPayer like", value, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerNotLike(String value) {
            addCriterion("cmtPayer not like", value, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerIn(List<String> values) {
            addCriterion("cmtPayer in", values, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerNotIn(List<String> values) {
            addCriterion("cmtPayer not in", values, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerBetween(String value1, String value2) {
            addCriterion("cmtPayer between", value1, value2, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtpayerNotBetween(String value1, String value2) {
            addCriterion("cmtPayer not between", value1, value2, "cmtpayer");
            return (Criteria) this;
        }

        public Criteria andCmtorderdIsNull() {
            addCriterion("cmtOrderD is null");
            return (Criteria) this;
        }

        public Criteria andCmtorderdIsNotNull() {
            addCriterion("cmtOrderD is not null");
            return (Criteria) this;
        }

        public Criteria andCmtorderdEqualTo(String value) {
            addCriterion("cmtOrderD =", value, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdNotEqualTo(String value) {
            addCriterion("cmtOrderD <>", value, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdGreaterThan(String value) {
            addCriterion("cmtOrderD >", value, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdGreaterThanOrEqualTo(String value) {
            addCriterion("cmtOrderD >=", value, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdLessThan(String value) {
            addCriterion("cmtOrderD <", value, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdLessThanOrEqualTo(String value) {
            addCriterion("cmtOrderD <=", value, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdLike(String value) {
            addCriterion("cmtOrderD like", value, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdNotLike(String value) {
            addCriterion("cmtOrderD not like", value, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdIn(List<String> values) {
            addCriterion("cmtOrderD in", values, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdNotIn(List<String> values) {
            addCriterion("cmtOrderD not in", values, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdBetween(String value1, String value2) {
            addCriterion("cmtOrderD between", value1, value2, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderdNotBetween(String value1, String value2) {
            addCriterion("cmtOrderD not between", value1, value2, "cmtorderd");
            return (Criteria) this;
        }

        public Criteria andCmtorderIsNull() {
            addCriterion("cmtOrder is null");
            return (Criteria) this;
        }

        public Criteria andCmtorderIsNotNull() {
            addCriterion("cmtOrder is not null");
            return (Criteria) this;
        }

        public Criteria andCmtorderEqualTo(String value) {
            addCriterion("cmtOrder =", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderNotEqualTo(String value) {
            addCriterion("cmtOrder <>", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderGreaterThan(String value) {
            addCriterion("cmtOrder >", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderGreaterThanOrEqualTo(String value) {
            addCriterion("cmtOrder >=", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderLessThan(String value) {
            addCriterion("cmtOrder <", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderLessThanOrEqualTo(String value) {
            addCriterion("cmtOrder <=", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderLike(String value) {
            addCriterion("cmtOrder like", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderNotLike(String value) {
            addCriterion("cmtOrder not like", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderIn(List<String> values) {
            addCriterion("cmtOrder in", values, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderNotIn(List<String> values) {
            addCriterion("cmtOrder not in", values, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderBetween(String value1, String value2) {
            addCriterion("cmtOrder between", value1, value2, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderNotBetween(String value1, String value2) {
            addCriterion("cmtOrder not between", value1, value2, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsIsNull() {
            addCriterion("cmtGoods is null");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsIsNotNull() {
            addCriterion("cmtGoods is not null");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsEqualTo(String value) {
            addCriterion("cmtGoods =", value, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsNotEqualTo(String value) {
            addCriterion("cmtGoods <>", value, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsGreaterThan(String value) {
            addCriterion("cmtGoods >", value, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsGreaterThanOrEqualTo(String value) {
            addCriterion("cmtGoods >=", value, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsLessThan(String value) {
            addCriterion("cmtGoods <", value, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsLessThanOrEqualTo(String value) {
            addCriterion("cmtGoods <=", value, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsLike(String value) {
            addCriterion("cmtGoods like", value, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsNotLike(String value) {
            addCriterion("cmtGoods not like", value, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsIn(List<String> values) {
            addCriterion("cmtGoods in", values, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsNotIn(List<String> values) {
            addCriterion("cmtGoods not in", values, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsBetween(String value1, String value2) {
            addCriterion("cmtGoods between", value1, value2, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtgoodsNotBetween(String value1, String value2) {
            addCriterion("cmtGoods not between", value1, value2, "cmtgoods");
            return (Criteria) this;
        }

        public Criteria andCmtcontextIsNull() {
            addCriterion("cmtContext is null");
            return (Criteria) this;
        }

        public Criteria andCmtcontextIsNotNull() {
            addCriterion("cmtContext is not null");
            return (Criteria) this;
        }

        public Criteria andCmtcontextEqualTo(String value) {
            addCriterion("cmtContext =", value, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextNotEqualTo(String value) {
            addCriterion("cmtContext <>", value, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextGreaterThan(String value) {
            addCriterion("cmtContext >", value, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextGreaterThanOrEqualTo(String value) {
            addCriterion("cmtContext >=", value, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextLessThan(String value) {
            addCriterion("cmtContext <", value, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextLessThanOrEqualTo(String value) {
            addCriterion("cmtContext <=", value, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextLike(String value) {
            addCriterion("cmtContext like", value, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextNotLike(String value) {
            addCriterion("cmtContext not like", value, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextIn(List<String> values) {
            addCriterion("cmtContext in", values, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextNotIn(List<String> values) {
            addCriterion("cmtContext not in", values, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextBetween(String value1, String value2) {
            addCriterion("cmtContext between", value1, value2, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtcontextNotBetween(String value1, String value2) {
            addCriterion("cmtContext not between", value1, value2, "cmtcontext");
            return (Criteria) this;
        }

        public Criteria andCmtpictureIsNull() {
            addCriterion("cmtPicture is null");
            return (Criteria) this;
        }

        public Criteria andCmtpictureIsNotNull() {
            addCriterion("cmtPicture is not null");
            return (Criteria) this;
        }

        public Criteria andCmtpictureEqualTo(String value) {
            addCriterion("cmtPicture =", value, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureNotEqualTo(String value) {
            addCriterion("cmtPicture <>", value, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureGreaterThan(String value) {
            addCriterion("cmtPicture >", value, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureGreaterThanOrEqualTo(String value) {
            addCriterion("cmtPicture >=", value, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureLessThan(String value) {
            addCriterion("cmtPicture <", value, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureLessThanOrEqualTo(String value) {
            addCriterion("cmtPicture <=", value, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureLike(String value) {
            addCriterion("cmtPicture like", value, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureNotLike(String value) {
            addCriterion("cmtPicture not like", value, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureIn(List<String> values) {
            addCriterion("cmtPicture in", values, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureNotIn(List<String> values) {
            addCriterion("cmtPicture not in", values, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureBetween(String value1, String value2) {
            addCriterion("cmtPicture between", value1, value2, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtpictureNotBetween(String value1, String value2) {
            addCriterion("cmtPicture not between", value1, value2, "cmtpicture");
            return (Criteria) this;
        }

        public Criteria andCmtstarsIsNull() {
            addCriterion("cmtStars is null");
            return (Criteria) this;
        }

        public Criteria andCmtstarsIsNotNull() {
            addCriterion("cmtStars is not null");
            return (Criteria) this;
        }

        public Criteria andCmtstarsEqualTo(Integer value) {
            addCriterion("cmtStars =", value, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsNotEqualTo(Integer value) {
            addCriterion("cmtStars <>", value, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsGreaterThan(Integer value) {
            addCriterion("cmtStars >", value, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmtStars >=", value, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsLessThan(Integer value) {
            addCriterion("cmtStars <", value, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsLessThanOrEqualTo(Integer value) {
            addCriterion("cmtStars <=", value, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsIn(List<Integer> values) {
            addCriterion("cmtStars in", values, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsNotIn(List<Integer> values) {
            addCriterion("cmtStars not in", values, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsBetween(Integer value1, Integer value2) {
            addCriterion("cmtStars between", value1, value2, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmtstarsNotBetween(Integer value1, Integer value2) {
            addCriterion("cmtStars not between", value1, value2, "cmtstars");
            return (Criteria) this;
        }

        public Criteria andCmttimeIsNull() {
            addCriterion("cmtTime is null");
            return (Criteria) this;
        }

        public Criteria andCmttimeIsNotNull() {
            addCriterion("cmtTime is not null");
            return (Criteria) this;
        }

        public Criteria andCmttimeEqualTo(Date value) {
            addCriterion("cmtTime =", value, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeNotEqualTo(Date value) {
            addCriterion("cmtTime <>", value, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeGreaterThan(Date value) {
            addCriterion("cmtTime >", value, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cmtTime >=", value, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeLessThan(Date value) {
            addCriterion("cmtTime <", value, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeLessThanOrEqualTo(Date value) {
            addCriterion("cmtTime <=", value, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeIn(List<Date> values) {
            addCriterion("cmtTime in", values, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeNotIn(List<Date> values) {
            addCriterion("cmtTime not in", values, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeBetween(Date value1, Date value2) {
            addCriterion("cmtTime between", value1, value2, "cmttime");
            return (Criteria) this;
        }

        public Criteria andCmttimeNotBetween(Date value1, Date value2) {
            addCriterion("cmtTime not between", value1, value2, "cmttime");
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