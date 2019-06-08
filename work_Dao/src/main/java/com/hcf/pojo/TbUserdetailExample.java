package com.hcf.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbUserdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserdetailExample() {
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

        public Criteria andUserdeatailidIsNull() {
            addCriterion("userDeatailID is null");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidIsNotNull() {
            addCriterion("userDeatailID is not null");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidEqualTo(String value) {
            addCriterion("userDeatailID =", value, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidNotEqualTo(String value) {
            addCriterion("userDeatailID <>", value, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidGreaterThan(String value) {
            addCriterion("userDeatailID >", value, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidGreaterThanOrEqualTo(String value) {
            addCriterion("userDeatailID >=", value, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidLessThan(String value) {
            addCriterion("userDeatailID <", value, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidLessThanOrEqualTo(String value) {
            addCriterion("userDeatailID <=", value, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidLike(String value) {
            addCriterion("userDeatailID like", value, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidNotLike(String value) {
            addCriterion("userDeatailID not like", value, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidIn(List<String> values) {
            addCriterion("userDeatailID in", values, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidNotIn(List<String> values) {
            addCriterion("userDeatailID not in", values, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidBetween(String value1, String value2) {
            addCriterion("userDeatailID between", value1, value2, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUserdeatailidNotBetween(String value1, String value2) {
            addCriterion("userDeatailID not between", value1, value2, "userdeatailid");
            return (Criteria) this;
        }

        public Criteria andUseriddIsNull() {
            addCriterion("userIdD is null");
            return (Criteria) this;
        }

        public Criteria andUseriddIsNotNull() {
            addCriterion("userIdD is not null");
            return (Criteria) this;
        }

        public Criteria andUseriddEqualTo(String value) {
            addCriterion("userIdD =", value, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddNotEqualTo(String value) {
            addCriterion("userIdD <>", value, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddGreaterThan(String value) {
            addCriterion("userIdD >", value, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddGreaterThanOrEqualTo(String value) {
            addCriterion("userIdD >=", value, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddLessThan(String value) {
            addCriterion("userIdD <", value, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddLessThanOrEqualTo(String value) {
            addCriterion("userIdD <=", value, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddLike(String value) {
            addCriterion("userIdD like", value, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddNotLike(String value) {
            addCriterion("userIdD not like", value, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddIn(List<String> values) {
            addCriterion("userIdD in", values, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddNotIn(List<String> values) {
            addCriterion("userIdD not in", values, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddBetween(String value1, String value2) {
            addCriterion("userIdD between", value1, value2, "useridd");
            return (Criteria) this;
        }

        public Criteria andUseriddNotBetween(String value1, String value2) {
            addCriterion("userIdD not between", value1, value2, "useridd");
            return (Criteria) this;
        }

        public Criteria andUsernamedIsNull() {
            addCriterion("usernameD is null");
            return (Criteria) this;
        }

        public Criteria andUsernamedIsNotNull() {
            addCriterion("usernameD is not null");
            return (Criteria) this;
        }

        public Criteria andUsernamedEqualTo(String value) {
            addCriterion("usernameD =", value, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedNotEqualTo(String value) {
            addCriterion("usernameD <>", value, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedGreaterThan(String value) {
            addCriterion("usernameD >", value, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedGreaterThanOrEqualTo(String value) {
            addCriterion("usernameD >=", value, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedLessThan(String value) {
            addCriterion("usernameD <", value, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedLessThanOrEqualTo(String value) {
            addCriterion("usernameD <=", value, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedLike(String value) {
            addCriterion("usernameD like", value, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedNotLike(String value) {
            addCriterion("usernameD not like", value, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedIn(List<String> values) {
            addCriterion("usernameD in", values, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedNotIn(List<String> values) {
            addCriterion("usernameD not in", values, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedBetween(String value1, String value2) {
            addCriterion("usernameD between", value1, value2, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsernamedNotBetween(String value1, String value2) {
            addCriterion("usernameD not between", value1, value2, "usernamed");
            return (Criteria) this;
        }

        public Criteria andUsersexdIsNull() {
            addCriterion("userSexD is null");
            return (Criteria) this;
        }

        public Criteria andUsersexdIsNotNull() {
            addCriterion("userSexD is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexdEqualTo(Integer value) {
            addCriterion("userSexD =", value, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdNotEqualTo(Integer value) {
            addCriterion("userSexD <>", value, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdGreaterThan(Integer value) {
            addCriterion("userSexD >", value, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userSexD >=", value, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdLessThan(Integer value) {
            addCriterion("userSexD <", value, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdLessThanOrEqualTo(Integer value) {
            addCriterion("userSexD <=", value, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdIn(List<Integer> values) {
            addCriterion("userSexD in", values, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdNotIn(List<Integer> values) {
            addCriterion("userSexD not in", values, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdBetween(Integer value1, Integer value2) {
            addCriterion("userSexD between", value1, value2, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUsersexdNotBetween(Integer value1, Integer value2) {
            addCriterion("userSexD not between", value1, value2, "usersexd");
            return (Criteria) this;
        }

        public Criteria andUseragedIsNull() {
            addCriterion("userAgeD is null");
            return (Criteria) this;
        }

        public Criteria andUseragedIsNotNull() {
            addCriterion("userAgeD is not null");
            return (Criteria) this;
        }

        public Criteria andUseragedEqualTo(Integer value) {
            addCriterion("userAgeD =", value, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedNotEqualTo(Integer value) {
            addCriterion("userAgeD <>", value, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedGreaterThan(Integer value) {
            addCriterion("userAgeD >", value, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedGreaterThanOrEqualTo(Integer value) {
            addCriterion("userAgeD >=", value, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedLessThan(Integer value) {
            addCriterion("userAgeD <", value, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedLessThanOrEqualTo(Integer value) {
            addCriterion("userAgeD <=", value, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedIn(List<Integer> values) {
            addCriterion("userAgeD in", values, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedNotIn(List<Integer> values) {
            addCriterion("userAgeD not in", values, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedBetween(Integer value1, Integer value2) {
            addCriterion("userAgeD between", value1, value2, "useraged");
            return (Criteria) this;
        }

        public Criteria andUseragedNotBetween(Integer value1, Integer value2) {
            addCriterion("userAgeD not between", value1, value2, "useraged");
            return (Criteria) this;
        }

        public Criteria andUserinfoIsNull() {
            addCriterion("userInfo is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIsNotNull() {
            addCriterion("userInfo is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoEqualTo(String value) {
            addCriterion("userInfo =", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotEqualTo(String value) {
            addCriterion("userInfo <>", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoGreaterThan(String value) {
            addCriterion("userInfo >", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo >=", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLessThan(String value) {
            addCriterion("userInfo <", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLessThanOrEqualTo(String value) {
            addCriterion("userInfo <=", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLike(String value) {
            addCriterion("userInfo like", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotLike(String value) {
            addCriterion("userInfo not like", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoIn(List<String> values) {
            addCriterion("userInfo in", values, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotIn(List<String> values) {
            addCriterion("userInfo not in", values, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoBetween(String value1, String value2) {
            addCriterion("userInfo between", value1, value2, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotBetween(String value1, String value2) {
            addCriterion("userInfo not between", value1, value2, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserhabitdIsNull() {
            addCriterion("userHabitD is null");
            return (Criteria) this;
        }

        public Criteria andUserhabitdIsNotNull() {
            addCriterion("userHabitD is not null");
            return (Criteria) this;
        }

        public Criteria andUserhabitdEqualTo(String value) {
            addCriterion("userHabitD =", value, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdNotEqualTo(String value) {
            addCriterion("userHabitD <>", value, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdGreaterThan(String value) {
            addCriterion("userHabitD >", value, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdGreaterThanOrEqualTo(String value) {
            addCriterion("userHabitD >=", value, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdLessThan(String value) {
            addCriterion("userHabitD <", value, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdLessThanOrEqualTo(String value) {
            addCriterion("userHabitD <=", value, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdLike(String value) {
            addCriterion("userHabitD like", value, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdNotLike(String value) {
            addCriterion("userHabitD not like", value, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdIn(List<String> values) {
            addCriterion("userHabitD in", values, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdNotIn(List<String> values) {
            addCriterion("userHabitD not in", values, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdBetween(String value1, String value2) {
            addCriterion("userHabitD between", value1, value2, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserhabitdNotBetween(String value1, String value2) {
            addCriterion("userHabitD not between", value1, value2, "userhabitd");
            return (Criteria) this;
        }

        public Criteria andUserphotodIsNull() {
            addCriterion("userPhotoD is null");
            return (Criteria) this;
        }

        public Criteria andUserphotodIsNotNull() {
            addCriterion("userPhotoD is not null");
            return (Criteria) this;
        }

        public Criteria andUserphotodEqualTo(String value) {
            addCriterion("userPhotoD =", value, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodNotEqualTo(String value) {
            addCriterion("userPhotoD <>", value, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodGreaterThan(String value) {
            addCriterion("userPhotoD >", value, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodGreaterThanOrEqualTo(String value) {
            addCriterion("userPhotoD >=", value, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodLessThan(String value) {
            addCriterion("userPhotoD <", value, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodLessThanOrEqualTo(String value) {
            addCriterion("userPhotoD <=", value, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodLike(String value) {
            addCriterion("userPhotoD like", value, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodNotLike(String value) {
            addCriterion("userPhotoD not like", value, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodIn(List<String> values) {
            addCriterion("userPhotoD in", values, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodNotIn(List<String> values) {
            addCriterion("userPhotoD not in", values, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodBetween(String value1, String value2) {
            addCriterion("userPhotoD between", value1, value2, "userphotod");
            return (Criteria) this;
        }

        public Criteria andUserphotodNotBetween(String value1, String value2) {
            addCriterion("userPhotoD not between", value1, value2, "userphotod");
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