package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRespExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRespExample() {
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

        public Criteria andRespidIsNull() {
            addCriterion("respId is null");
            return (Criteria) this;
        }

        public Criteria andRespidIsNotNull() {
            addCriterion("respId is not null");
            return (Criteria) this;
        }

        public Criteria andRespidEqualTo(Integer value) {
            addCriterion("respId =", value, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidNotEqualTo(Integer value) {
            addCriterion("respId <>", value, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidGreaterThan(Integer value) {
            addCriterion("respId >", value, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidGreaterThanOrEqualTo(Integer value) {
            addCriterion("respId >=", value, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidLessThan(Integer value) {
            addCriterion("respId <", value, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidLessThanOrEqualTo(Integer value) {
            addCriterion("respId <=", value, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidIn(List<Integer> values) {
            addCriterion("respId in", values, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidNotIn(List<Integer> values) {
            addCriterion("respId not in", values, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidBetween(Integer value1, Integer value2) {
            addCriterion("respId between", value1, value2, "respid");
            return (Criteria) this;
        }

        public Criteria andRespidNotBetween(Integer value1, Integer value2) {
            addCriterion("respId not between", value1, value2, "respid");
            return (Criteria) this;
        }

        public Criteria andRespreviewIsNull() {
            addCriterion("respReview is null");
            return (Criteria) this;
        }

        public Criteria andRespreviewIsNotNull() {
            addCriterion("respReview is not null");
            return (Criteria) this;
        }

        public Criteria andRespreviewEqualTo(Integer value) {
            addCriterion("respReview =", value, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewNotEqualTo(Integer value) {
            addCriterion("respReview <>", value, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewGreaterThan(Integer value) {
            addCriterion("respReview >", value, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("respReview >=", value, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewLessThan(Integer value) {
            addCriterion("respReview <", value, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewLessThanOrEqualTo(Integer value) {
            addCriterion("respReview <=", value, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewIn(List<Integer> values) {
            addCriterion("respReview in", values, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewNotIn(List<Integer> values) {
            addCriterion("respReview not in", values, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewBetween(Integer value1, Integer value2) {
            addCriterion("respReview between", value1, value2, "respreview");
            return (Criteria) this;
        }

        public Criteria andRespreviewNotBetween(Integer value1, Integer value2) {
            addCriterion("respReview not between", value1, value2, "respreview");
            return (Criteria) this;
        }

        public Criteria andResppostIsNull() {
            addCriterion("respPost is null");
            return (Criteria) this;
        }

        public Criteria andResppostIsNotNull() {
            addCriterion("respPost is not null");
            return (Criteria) this;
        }

        public Criteria andResppostEqualTo(Integer value) {
            addCriterion("respPost =", value, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostNotEqualTo(Integer value) {
            addCriterion("respPost <>", value, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostGreaterThan(Integer value) {
            addCriterion("respPost >", value, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostGreaterThanOrEqualTo(Integer value) {
            addCriterion("respPost >=", value, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostLessThan(Integer value) {
            addCriterion("respPost <", value, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostLessThanOrEqualTo(Integer value) {
            addCriterion("respPost <=", value, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostIn(List<Integer> values) {
            addCriterion("respPost in", values, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostNotIn(List<Integer> values) {
            addCriterion("respPost not in", values, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostBetween(Integer value1, Integer value2) {
            addCriterion("respPost between", value1, value2, "resppost");
            return (Criteria) this;
        }

        public Criteria andResppostNotBetween(Integer value1, Integer value2) {
            addCriterion("respPost not between", value1, value2, "resppost");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoIsNull() {
            addCriterion("respFromWho is null");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoIsNotNull() {
            addCriterion("respFromWho is not null");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoEqualTo(String value) {
            addCriterion("respFromWho =", value, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoNotEqualTo(String value) {
            addCriterion("respFromWho <>", value, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoGreaterThan(String value) {
            addCriterion("respFromWho >", value, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoGreaterThanOrEqualTo(String value) {
            addCriterion("respFromWho >=", value, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoLessThan(String value) {
            addCriterion("respFromWho <", value, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoLessThanOrEqualTo(String value) {
            addCriterion("respFromWho <=", value, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoLike(String value) {
            addCriterion("respFromWho like", value, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoNotLike(String value) {
            addCriterion("respFromWho not like", value, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoIn(List<String> values) {
            addCriterion("respFromWho in", values, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoNotIn(List<String> values) {
            addCriterion("respFromWho not in", values, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoBetween(String value1, String value2) {
            addCriterion("respFromWho between", value1, value2, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andRespfromwhoNotBetween(String value1, String value2) {
            addCriterion("respFromWho not between", value1, value2, "respfromwho");
            return (Criteria) this;
        }

        public Criteria andResptowhoIsNull() {
            addCriterion("respToWho is null");
            return (Criteria) this;
        }

        public Criteria andResptowhoIsNotNull() {
            addCriterion("respToWho is not null");
            return (Criteria) this;
        }

        public Criteria andResptowhoEqualTo(String value) {
            addCriterion("respToWho =", value, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoNotEqualTo(String value) {
            addCriterion("respToWho <>", value, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoGreaterThan(String value) {
            addCriterion("respToWho >", value, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoGreaterThanOrEqualTo(String value) {
            addCriterion("respToWho >=", value, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoLessThan(String value) {
            addCriterion("respToWho <", value, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoLessThanOrEqualTo(String value) {
            addCriterion("respToWho <=", value, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoLike(String value) {
            addCriterion("respToWho like", value, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoNotLike(String value) {
            addCriterion("respToWho not like", value, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoIn(List<String> values) {
            addCriterion("respToWho in", values, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoNotIn(List<String> values) {
            addCriterion("respToWho not in", values, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoBetween(String value1, String value2) {
            addCriterion("respToWho between", value1, value2, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptowhoNotBetween(String value1, String value2) {
            addCriterion("respToWho not between", value1, value2, "resptowho");
            return (Criteria) this;
        }

        public Criteria andResptimeIsNull() {
            addCriterion("respTime is null");
            return (Criteria) this;
        }

        public Criteria andResptimeIsNotNull() {
            addCriterion("respTime is not null");
            return (Criteria) this;
        }

        public Criteria andResptimeEqualTo(Date value) {
            addCriterion("respTime =", value, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeNotEqualTo(Date value) {
            addCriterion("respTime <>", value, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeGreaterThan(Date value) {
            addCriterion("respTime >", value, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("respTime >=", value, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeLessThan(Date value) {
            addCriterion("respTime <", value, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeLessThanOrEqualTo(Date value) {
            addCriterion("respTime <=", value, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeIn(List<Date> values) {
            addCriterion("respTime in", values, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeNotIn(List<Date> values) {
            addCriterion("respTime not in", values, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeBetween(Date value1, Date value2) {
            addCriterion("respTime between", value1, value2, "resptime");
            return (Criteria) this;
        }

        public Criteria andResptimeNotBetween(Date value1, Date value2) {
            addCriterion("respTime not between", value1, value2, "resptime");
            return (Criteria) this;
        }

        public Criteria andRespcontextIsNull() {
            addCriterion("respContext is null");
            return (Criteria) this;
        }

        public Criteria andRespcontextIsNotNull() {
            addCriterion("respContext is not null");
            return (Criteria) this;
        }

        public Criteria andRespcontextEqualTo(String value) {
            addCriterion("respContext =", value, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextNotEqualTo(String value) {
            addCriterion("respContext <>", value, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextGreaterThan(String value) {
            addCriterion("respContext >", value, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextGreaterThanOrEqualTo(String value) {
            addCriterion("respContext >=", value, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextLessThan(String value) {
            addCriterion("respContext <", value, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextLessThanOrEqualTo(String value) {
            addCriterion("respContext <=", value, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextLike(String value) {
            addCriterion("respContext like", value, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextNotLike(String value) {
            addCriterion("respContext not like", value, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextIn(List<String> values) {
            addCriterion("respContext in", values, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextNotIn(List<String> values) {
            addCriterion("respContext not in", values, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextBetween(String value1, String value2) {
            addCriterion("respContext between", value1, value2, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespcontextNotBetween(String value1, String value2) {
            addCriterion("respContext not between", value1, value2, "respcontext");
            return (Criteria) this;
        }

        public Criteria andRespstatusIsNull() {
            addCriterion("respStatus is null");
            return (Criteria) this;
        }

        public Criteria andRespstatusIsNotNull() {
            addCriterion("respStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRespstatusEqualTo(Integer value) {
            addCriterion("respStatus =", value, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusNotEqualTo(Integer value) {
            addCriterion("respStatus <>", value, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusGreaterThan(Integer value) {
            addCriterion("respStatus >", value, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("respStatus >=", value, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusLessThan(Integer value) {
            addCriterion("respStatus <", value, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusLessThanOrEqualTo(Integer value) {
            addCriterion("respStatus <=", value, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusIn(List<Integer> values) {
            addCriterion("respStatus in", values, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusNotIn(List<Integer> values) {
            addCriterion("respStatus not in", values, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusBetween(Integer value1, Integer value2) {
            addCriterion("respStatus between", value1, value2, "respstatus");
            return (Criteria) this;
        }

        public Criteria andRespstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("respStatus not between", value1, value2, "respstatus");
            return (Criteria) this;
        }

        public Criteria andResppicIsNull() {
            addCriterion("respPic is null");
            return (Criteria) this;
        }

        public Criteria andResppicIsNotNull() {
            addCriterion("respPic is not null");
            return (Criteria) this;
        }

        public Criteria andResppicEqualTo(String value) {
            addCriterion("respPic =", value, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicNotEqualTo(String value) {
            addCriterion("respPic <>", value, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicGreaterThan(String value) {
            addCriterion("respPic >", value, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicGreaterThanOrEqualTo(String value) {
            addCriterion("respPic >=", value, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicLessThan(String value) {
            addCriterion("respPic <", value, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicLessThanOrEqualTo(String value) {
            addCriterion("respPic <=", value, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicLike(String value) {
            addCriterion("respPic like", value, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicNotLike(String value) {
            addCriterion("respPic not like", value, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicIn(List<String> values) {
            addCriterion("respPic in", values, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicNotIn(List<String> values) {
            addCriterion("respPic not in", values, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicBetween(String value1, String value2) {
            addCriterion("respPic between", value1, value2, "resppic");
            return (Criteria) this;
        }

        public Criteria andResppicNotBetween(String value1, String value2) {
            addCriterion("respPic not between", value1, value2, "resppic");
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