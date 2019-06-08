package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VCmtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VCmtExample() {
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

        public Criteria andCmtorderIsNull() {
            addCriterion("cmtOrder is null");
            return (Criteria) this;
        }

        public Criteria andCmtorderIsNotNull() {
            addCriterion("cmtOrder is not null");
            return (Criteria) this;
        }

        public Criteria andCmtorderEqualTo(Integer value) {
            addCriterion("cmtOrder =", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderNotEqualTo(Integer value) {
            addCriterion("cmtOrder <>", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderGreaterThan(Integer value) {
            addCriterion("cmtOrder >", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmtOrder >=", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderLessThan(Integer value) {
            addCriterion("cmtOrder <", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderLessThanOrEqualTo(Integer value) {
            addCriterion("cmtOrder <=", value, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderIn(List<Integer> values) {
            addCriterion("cmtOrder in", values, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderNotIn(List<Integer> values) {
            addCriterion("cmtOrder not in", values, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderBetween(Integer value1, Integer value2) {
            addCriterion("cmtOrder between", value1, value2, "cmtorder");
            return (Criteria) this;
        }

        public Criteria andCmtorderNotBetween(Integer value1, Integer value2) {
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