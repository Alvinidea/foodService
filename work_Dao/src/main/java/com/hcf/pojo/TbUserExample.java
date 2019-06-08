package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
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

        public Criteria andUseremailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("userEmail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("userEmail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("userEmail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("userEmail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("userEmail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("userEmail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "useremail");
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

        public Criteria andUseraddressIsNull() {
            addCriterion("userAddress is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNotNull() {
            addCriterion("userAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressEqualTo(String value) {
            addCriterion("userAddress =", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotEqualTo(String value) {
            addCriterion("userAddress <>", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThan(String value) {
            addCriterion("userAddress >", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("userAddress >=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThan(String value) {
            addCriterion("userAddress <", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThanOrEqualTo(String value) {
            addCriterion("userAddress <=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLike(String value) {
            addCriterion("userAddress like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotLike(String value) {
            addCriterion("userAddress not like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressIn(List<String> values) {
            addCriterion("userAddress in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotIn(List<String> values) {
            addCriterion("userAddress not in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressBetween(String value1, String value2) {
            addCriterion("userAddress between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotBetween(String value1, String value2) {
            addCriterion("userAddress not between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeIsNull() {
            addCriterion("userApplyTime is null");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeIsNotNull() {
            addCriterion("userApplyTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeEqualTo(Date value) {
            addCriterion("userApplyTime =", value, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeNotEqualTo(Date value) {
            addCriterion("userApplyTime <>", value, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeGreaterThan(Date value) {
            addCriterion("userApplyTime >", value, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userApplyTime >=", value, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeLessThan(Date value) {
            addCriterion("userApplyTime <", value, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeLessThanOrEqualTo(Date value) {
            addCriterion("userApplyTime <=", value, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeIn(List<Date> values) {
            addCriterion("userApplyTime in", values, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeNotIn(List<Date> values) {
            addCriterion("userApplyTime not in", values, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeBetween(Date value1, Date value2) {
            addCriterion("userApplyTime between", value1, value2, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserapplytimeNotBetween(Date value1, Date value2) {
            addCriterion("userApplyTime not between", value1, value2, "userapplytime");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNull() {
            addCriterion("userStatus is null");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNotNull() {
            addCriterion("userStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUserstatusEqualTo(Integer value) {
            addCriterion("userStatus =", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotEqualTo(Integer value) {
            addCriterion("userStatus <>", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThan(Integer value) {
            addCriterion("userStatus >", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("userStatus >=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThan(Integer value) {
            addCriterion("userStatus <", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThanOrEqualTo(Integer value) {
            addCriterion("userStatus <=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusIn(List<Integer> values) {
            addCriterion("userStatus in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotIn(List<Integer> values) {
            addCriterion("userStatus not in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusBetween(Integer value1, Integer value2) {
            addCriterion("userStatus between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("userStatus not between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("userPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("userPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("userPwd =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("userPwd <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("userPwd >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("userPwd >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("userPwd <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("userPwd <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("userPwd like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("userPwd not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("userPwd in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("userPwd not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("userPwd between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("userPwd not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNull() {
            addCriterion("userLevel is null");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNotNull() {
            addCriterion("userLevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserlevelEqualTo(Integer value) {
            addCriterion("userLevel =", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotEqualTo(Integer value) {
            addCriterion("userLevel <>", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThan(Integer value) {
            addCriterion("userLevel >", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("userLevel >=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThan(Integer value) {
            addCriterion("userLevel <", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThanOrEqualTo(Integer value) {
            addCriterion("userLevel <=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelIn(List<Integer> values) {
            addCriterion("userLevel in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotIn(List<Integer> values) {
            addCriterion("userLevel not in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelBetween(Integer value1, Integer value2) {
            addCriterion("userLevel between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("userLevel not between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserpowerIsNull() {
            addCriterion("userPower is null");
            return (Criteria) this;
        }

        public Criteria andUserpowerIsNotNull() {
            addCriterion("userPower is not null");
            return (Criteria) this;
        }

        public Criteria andUserpowerEqualTo(Integer value) {
            addCriterion("userPower =", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerNotEqualTo(Integer value) {
            addCriterion("userPower <>", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerGreaterThan(Integer value) {
            addCriterion("userPower >", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("userPower >=", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerLessThan(Integer value) {
            addCriterion("userPower <", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerLessThanOrEqualTo(Integer value) {
            addCriterion("userPower <=", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerIn(List<Integer> values) {
            addCriterion("userPower in", values, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerNotIn(List<Integer> values) {
            addCriterion("userPower not in", values, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerBetween(Integer value1, Integer value2) {
            addCriterion("userPower between", value1, value2, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("userPower not between", value1, value2, "userpower");
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