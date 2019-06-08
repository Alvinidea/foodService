package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStoreExample() {
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

        public Criteria andStoreidIsNull() {
            addCriterion("storeId is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeId is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(String value) {
            addCriterion("storeId =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(String value) {
            addCriterion("storeId <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(String value) {
            addCriterion("storeId >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(String value) {
            addCriterion("storeId >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(String value) {
            addCriterion("storeId <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(String value) {
            addCriterion("storeId <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLike(String value) {
            addCriterion("storeId like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotLike(String value) {
            addCriterion("storeId not like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<String> values) {
            addCriterion("storeId in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<String> values) {
            addCriterion("storeId not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(String value1, String value2) {
            addCriterion("storeId between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(String value1, String value2) {
            addCriterion("storeId not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridIsNull() {
            addCriterion("storeOwnerId is null");
            return (Criteria) this;
        }

        public Criteria andStoreowneridIsNotNull() {
            addCriterion("storeOwnerId is not null");
            return (Criteria) this;
        }

        public Criteria andStoreowneridEqualTo(String value) {
            addCriterion("storeOwnerId =", value, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridNotEqualTo(String value) {
            addCriterion("storeOwnerId <>", value, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridGreaterThan(String value) {
            addCriterion("storeOwnerId >", value, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridGreaterThanOrEqualTo(String value) {
            addCriterion("storeOwnerId >=", value, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridLessThan(String value) {
            addCriterion("storeOwnerId <", value, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridLessThanOrEqualTo(String value) {
            addCriterion("storeOwnerId <=", value, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridLike(String value) {
            addCriterion("storeOwnerId like", value, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridNotLike(String value) {
            addCriterion("storeOwnerId not like", value, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridIn(List<String> values) {
            addCriterion("storeOwnerId in", values, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridNotIn(List<String> values) {
            addCriterion("storeOwnerId not in", values, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridBetween(String value1, String value2) {
            addCriterion("storeOwnerId between", value1, value2, "storeownerid");
            return (Criteria) this;
        }

        public Criteria andStoreowneridNotBetween(String value1, String value2) {
            addCriterion("storeOwnerId not between", value1, value2, "storeownerid");
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

        public Criteria andStorepictureIsNull() {
            addCriterion("storePicture is null");
            return (Criteria) this;
        }

        public Criteria andStorepictureIsNotNull() {
            addCriterion("storePicture is not null");
            return (Criteria) this;
        }

        public Criteria andStorepictureEqualTo(String value) {
            addCriterion("storePicture =", value, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureNotEqualTo(String value) {
            addCriterion("storePicture <>", value, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureGreaterThan(String value) {
            addCriterion("storePicture >", value, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureGreaterThanOrEqualTo(String value) {
            addCriterion("storePicture >=", value, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureLessThan(String value) {
            addCriterion("storePicture <", value, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureLessThanOrEqualTo(String value) {
            addCriterion("storePicture <=", value, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureLike(String value) {
            addCriterion("storePicture like", value, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureNotLike(String value) {
            addCriterion("storePicture not like", value, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureIn(List<String> values) {
            addCriterion("storePicture in", values, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureNotIn(List<String> values) {
            addCriterion("storePicture not in", values, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureBetween(String value1, String value2) {
            addCriterion("storePicture between", value1, value2, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorepictureNotBetween(String value1, String value2) {
            addCriterion("storePicture not between", value1, value2, "storepicture");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumIsNull() {
            addCriterion("storeCmtNum is null");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumIsNotNull() {
            addCriterion("storeCmtNum is not null");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumEqualTo(Integer value) {
            addCriterion("storeCmtNum =", value, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumNotEqualTo(Integer value) {
            addCriterion("storeCmtNum <>", value, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumGreaterThan(Integer value) {
            addCriterion("storeCmtNum >", value, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeCmtNum >=", value, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumLessThan(Integer value) {
            addCriterion("storeCmtNum <", value, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumLessThanOrEqualTo(Integer value) {
            addCriterion("storeCmtNum <=", value, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumIn(List<Integer> values) {
            addCriterion("storeCmtNum in", values, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumNotIn(List<Integer> values) {
            addCriterion("storeCmtNum not in", values, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumBetween(Integer value1, Integer value2) {
            addCriterion("storeCmtNum between", value1, value2, "storecmtnum");
            return (Criteria) this;
        }

        public Criteria andStorecmtnumNotBetween(Integer value1, Integer value2) {
            addCriterion("storeCmtNum not between", value1, value2, "storecmtnum");
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

        public Criteria andStoreaverpriceIsNull() {
            addCriterion("storeAverPrice is null");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceIsNotNull() {
            addCriterion("storeAverPrice is not null");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceEqualTo(Integer value) {
            addCriterion("storeAverPrice =", value, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceNotEqualTo(Integer value) {
            addCriterion("storeAverPrice <>", value, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceGreaterThan(Integer value) {
            addCriterion("storeAverPrice >", value, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeAverPrice >=", value, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceLessThan(Integer value) {
            addCriterion("storeAverPrice <", value, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceLessThanOrEqualTo(Integer value) {
            addCriterion("storeAverPrice <=", value, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceIn(List<Integer> values) {
            addCriterion("storeAverPrice in", values, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceNotIn(List<Integer> values) {
            addCriterion("storeAverPrice not in", values, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceBetween(Integer value1, Integer value2) {
            addCriterion("storeAverPrice between", value1, value2, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStoreaverpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("storeAverPrice not between", value1, value2, "storeaverprice");
            return (Criteria) this;
        }

        public Criteria andStorelevelIsNull() {
            addCriterion("storeLevel is null");
            return (Criteria) this;
        }

        public Criteria andStorelevelIsNotNull() {
            addCriterion("storeLevel is not null");
            return (Criteria) this;
        }

        public Criteria andStorelevelEqualTo(Integer value) {
            addCriterion("storeLevel =", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelNotEqualTo(Integer value) {
            addCriterion("storeLevel <>", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelGreaterThan(Integer value) {
            addCriterion("storeLevel >", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeLevel >=", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelLessThan(Integer value) {
            addCriterion("storeLevel <", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelLessThanOrEqualTo(Integer value) {
            addCriterion("storeLevel <=", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelIn(List<Integer> values) {
            addCriterion("storeLevel in", values, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelNotIn(List<Integer> values) {
            addCriterion("storeLevel not in", values, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelBetween(Integer value1, Integer value2) {
            addCriterion("storeLevel between", value1, value2, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelNotBetween(Integer value1, Integer value2) {
            addCriterion("storeLevel not between", value1, value2, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeIsNull() {
            addCriterion("storeApplyTime is null");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeIsNotNull() {
            addCriterion("storeApplyTime is not null");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeEqualTo(Date value) {
            addCriterion("storeApplyTime =", value, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeNotEqualTo(Date value) {
            addCriterion("storeApplyTime <>", value, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeGreaterThan(Date value) {
            addCriterion("storeApplyTime >", value, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("storeApplyTime >=", value, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeLessThan(Date value) {
            addCriterion("storeApplyTime <", value, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeLessThanOrEqualTo(Date value) {
            addCriterion("storeApplyTime <=", value, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeIn(List<Date> values) {
            addCriterion("storeApplyTime in", values, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeNotIn(List<Date> values) {
            addCriterion("storeApplyTime not in", values, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeBetween(Date value1, Date value2) {
            addCriterion("storeApplyTime between", value1, value2, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreapplytimeNotBetween(Date value1, Date value2) {
            addCriterion("storeApplyTime not between", value1, value2, "storeapplytime");
            return (Criteria) this;
        }

        public Criteria andStoreisworkIsNull() {
            addCriterion("storeIsWork is null");
            return (Criteria) this;
        }

        public Criteria andStoreisworkIsNotNull() {
            addCriterion("storeIsWork is not null");
            return (Criteria) this;
        }

        public Criteria andStoreisworkEqualTo(Integer value) {
            addCriterion("storeIsWork =", value, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkNotEqualTo(Integer value) {
            addCriterion("storeIsWork <>", value, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkGreaterThan(Integer value) {
            addCriterion("storeIsWork >", value, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeIsWork >=", value, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkLessThan(Integer value) {
            addCriterion("storeIsWork <", value, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkLessThanOrEqualTo(Integer value) {
            addCriterion("storeIsWork <=", value, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkIn(List<Integer> values) {
            addCriterion("storeIsWork in", values, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkNotIn(List<Integer> values) {
            addCriterion("storeIsWork not in", values, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkBetween(Integer value1, Integer value2) {
            addCriterion("storeIsWork between", value1, value2, "storeiswork");
            return (Criteria) this;
        }

        public Criteria andStoreisworkNotBetween(Integer value1, Integer value2) {
            addCriterion("storeIsWork not between", value1, value2, "storeiswork");
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