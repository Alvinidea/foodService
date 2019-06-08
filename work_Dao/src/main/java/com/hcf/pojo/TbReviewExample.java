package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbReviewExample() {
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

        public Criteria andReviewidIsNull() {
            addCriterion("reviewId is null");
            return (Criteria) this;
        }

        public Criteria andReviewidIsNotNull() {
            addCriterion("reviewId is not null");
            return (Criteria) this;
        }

        public Criteria andReviewidEqualTo(Integer value) {
            addCriterion("reviewId =", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotEqualTo(Integer value) {
            addCriterion("reviewId <>", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidGreaterThan(Integer value) {
            addCriterion("reviewId >", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewId >=", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLessThan(Integer value) {
            addCriterion("reviewId <", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLessThanOrEqualTo(Integer value) {
            addCriterion("reviewId <=", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidIn(List<Integer> values) {
            addCriterion("reviewId in", values, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotIn(List<Integer> values) {
            addCriterion("reviewId not in", values, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidBetween(Integer value1, Integer value2) {
            addCriterion("reviewId between", value1, value2, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewId not between", value1, value2, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewpostIsNull() {
            addCriterion("reviewPost is null");
            return (Criteria) this;
        }

        public Criteria andReviewpostIsNotNull() {
            addCriterion("reviewPost is not null");
            return (Criteria) this;
        }

        public Criteria andReviewpostEqualTo(Integer value) {
            addCriterion("reviewPost =", value, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostNotEqualTo(Integer value) {
            addCriterion("reviewPost <>", value, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostGreaterThan(Integer value) {
            addCriterion("reviewPost >", value, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewPost >=", value, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostLessThan(Integer value) {
            addCriterion("reviewPost <", value, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostLessThanOrEqualTo(Integer value) {
            addCriterion("reviewPost <=", value, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostIn(List<Integer> values) {
            addCriterion("reviewPost in", values, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostNotIn(List<Integer> values) {
            addCriterion("reviewPost not in", values, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostBetween(Integer value1, Integer value2) {
            addCriterion("reviewPost between", value1, value2, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewpostNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewPost not between", value1, value2, "reviewpost");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("reviewer is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("reviewer =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("reviewer <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("reviewer >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("reviewer <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("reviewer <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("reviewer like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("reviewer not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("reviewer in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("reviewer not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("reviewer not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewcontextIsNull() {
            addCriterion("reviewContext is null");
            return (Criteria) this;
        }

        public Criteria andReviewcontextIsNotNull() {
            addCriterion("reviewContext is not null");
            return (Criteria) this;
        }

        public Criteria andReviewcontextEqualTo(String value) {
            addCriterion("reviewContext =", value, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextNotEqualTo(String value) {
            addCriterion("reviewContext <>", value, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextGreaterThan(String value) {
            addCriterion("reviewContext >", value, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextGreaterThanOrEqualTo(String value) {
            addCriterion("reviewContext >=", value, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextLessThan(String value) {
            addCriterion("reviewContext <", value, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextLessThanOrEqualTo(String value) {
            addCriterion("reviewContext <=", value, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextLike(String value) {
            addCriterion("reviewContext like", value, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextNotLike(String value) {
            addCriterion("reviewContext not like", value, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextIn(List<String> values) {
            addCriterion("reviewContext in", values, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextNotIn(List<String> values) {
            addCriterion("reviewContext not in", values, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextBetween(String value1, String value2) {
            addCriterion("reviewContext between", value1, value2, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewcontextNotBetween(String value1, String value2) {
            addCriterion("reviewContext not between", value1, value2, "reviewcontext");
            return (Criteria) this;
        }

        public Criteria andReviewtimeIsNull() {
            addCriterion("reviewTime is null");
            return (Criteria) this;
        }

        public Criteria andReviewtimeIsNotNull() {
            addCriterion("reviewTime is not null");
            return (Criteria) this;
        }

        public Criteria andReviewtimeEqualTo(Date value) {
            addCriterion("reviewTime =", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotEqualTo(Date value) {
            addCriterion("reviewTime <>", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeGreaterThan(Date value) {
            addCriterion("reviewTime >", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reviewTime >=", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeLessThan(Date value) {
            addCriterion("reviewTime <", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeLessThanOrEqualTo(Date value) {
            addCriterion("reviewTime <=", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeIn(List<Date> values) {
            addCriterion("reviewTime in", values, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotIn(List<Date> values) {
            addCriterion("reviewTime not in", values, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeBetween(Date value1, Date value2) {
            addCriterion("reviewTime between", value1, value2, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotBetween(Date value1, Date value2) {
            addCriterion("reviewTime not between", value1, value2, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewpicIsNull() {
            addCriterion("reviewPic is null");
            return (Criteria) this;
        }

        public Criteria andReviewpicIsNotNull() {
            addCriterion("reviewPic is not null");
            return (Criteria) this;
        }

        public Criteria andReviewpicEqualTo(String value) {
            addCriterion("reviewPic =", value, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicNotEqualTo(String value) {
            addCriterion("reviewPic <>", value, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicGreaterThan(String value) {
            addCriterion("reviewPic >", value, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicGreaterThanOrEqualTo(String value) {
            addCriterion("reviewPic >=", value, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicLessThan(String value) {
            addCriterion("reviewPic <", value, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicLessThanOrEqualTo(String value) {
            addCriterion("reviewPic <=", value, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicLike(String value) {
            addCriterion("reviewPic like", value, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicNotLike(String value) {
            addCriterion("reviewPic not like", value, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicIn(List<String> values) {
            addCriterion("reviewPic in", values, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicNotIn(List<String> values) {
            addCriterion("reviewPic not in", values, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicBetween(String value1, String value2) {
            addCriterion("reviewPic between", value1, value2, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewpicNotBetween(String value1, String value2) {
            addCriterion("reviewPic not between", value1, value2, "reviewpic");
            return (Criteria) this;
        }

        public Criteria andReviewthumbIsNull() {
            addCriterion("reviewThumb is null");
            return (Criteria) this;
        }

        public Criteria andReviewthumbIsNotNull() {
            addCriterion("reviewThumb is not null");
            return (Criteria) this;
        }

        public Criteria andReviewthumbEqualTo(Integer value) {
            addCriterion("reviewThumb =", value, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbNotEqualTo(Integer value) {
            addCriterion("reviewThumb <>", value, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbGreaterThan(Integer value) {
            addCriterion("reviewThumb >", value, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewThumb >=", value, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbLessThan(Integer value) {
            addCriterion("reviewThumb <", value, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbLessThanOrEqualTo(Integer value) {
            addCriterion("reviewThumb <=", value, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbIn(List<Integer> values) {
            addCriterion("reviewThumb in", values, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbNotIn(List<Integer> values) {
            addCriterion("reviewThumb not in", values, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbBetween(Integer value1, Integer value2) {
            addCriterion("reviewThumb between", value1, value2, "reviewthumb");
            return (Criteria) this;
        }

        public Criteria andReviewthumbNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewThumb not between", value1, value2, "reviewthumb");
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