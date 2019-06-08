package com.hcf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VPostExample() {
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

        public Criteria andPostthumbIsNull() {
            addCriterion("postthumb is null");
            return (Criteria) this;
        }

        public Criteria andPostthumbIsNotNull() {
            addCriterion("postthumb is not null");
            return (Criteria) this;
        }

        public Criteria andPostthumbEqualTo(Integer value) {
            addCriterion("postthumb =", value, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbNotEqualTo(Integer value) {
            addCriterion("postthumb <>", value, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbGreaterThan(Integer value) {
            addCriterion("postthumb >", value, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("postthumb >=", value, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbLessThan(Integer value) {
            addCriterion("postthumb <", value, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbLessThanOrEqualTo(Integer value) {
            addCriterion("postthumb <=", value, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbIn(List<Integer> values) {
            addCriterion("postthumb in", values, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbNotIn(List<Integer> values) {
            addCriterion("postthumb not in", values, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbBetween(Integer value1, Integer value2) {
            addCriterion("postthumb between", value1, value2, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostthumbNotBetween(Integer value1, Integer value2) {
            addCriterion("postthumb not between", value1, value2, "postthumb");
            return (Criteria) this;
        }

        public Criteria andPostscanIsNull() {
            addCriterion("postScan is null");
            return (Criteria) this;
        }

        public Criteria andPostscanIsNotNull() {
            addCriterion("postScan is not null");
            return (Criteria) this;
        }

        public Criteria andPostscanEqualTo(Integer value) {
            addCriterion("postScan =", value, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanNotEqualTo(Integer value) {
            addCriterion("postScan <>", value, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanGreaterThan(Integer value) {
            addCriterion("postScan >", value, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanGreaterThanOrEqualTo(Integer value) {
            addCriterion("postScan >=", value, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanLessThan(Integer value) {
            addCriterion("postScan <", value, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanLessThanOrEqualTo(Integer value) {
            addCriterion("postScan <=", value, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanIn(List<Integer> values) {
            addCriterion("postScan in", values, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanNotIn(List<Integer> values) {
            addCriterion("postScan not in", values, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanBetween(Integer value1, Integer value2) {
            addCriterion("postScan between", value1, value2, "postscan");
            return (Criteria) this;
        }

        public Criteria andPostscanNotBetween(Integer value1, Integer value2) {
            addCriterion("postScan not between", value1, value2, "postscan");
            return (Criteria) this;
        }

        public Criteria andPoststatusIsNull() {
            addCriterion("postStatus is null");
            return (Criteria) this;
        }

        public Criteria andPoststatusIsNotNull() {
            addCriterion("postStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoststatusEqualTo(Integer value) {
            addCriterion("postStatus =", value, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusNotEqualTo(Integer value) {
            addCriterion("postStatus <>", value, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusGreaterThan(Integer value) {
            addCriterion("postStatus >", value, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("postStatus >=", value, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusLessThan(Integer value) {
            addCriterion("postStatus <", value, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusLessThanOrEqualTo(Integer value) {
            addCriterion("postStatus <=", value, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusIn(List<Integer> values) {
            addCriterion("postStatus in", values, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusNotIn(List<Integer> values) {
            addCriterion("postStatus not in", values, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusBetween(Integer value1, Integer value2) {
            addCriterion("postStatus between", value1, value2, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPoststatusNotBetween(Integer value1, Integer value2) {
            addCriterion("postStatus not between", value1, value2, "poststatus");
            return (Criteria) this;
        }

        public Criteria andPosttimeIsNull() {
            addCriterion("postTime is null");
            return (Criteria) this;
        }

        public Criteria andPosttimeIsNotNull() {
            addCriterion("postTime is not null");
            return (Criteria) this;
        }

        public Criteria andPosttimeEqualTo(Date value) {
            addCriterion("postTime =", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotEqualTo(Date value) {
            addCriterion("postTime <>", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeGreaterThan(Date value) {
            addCriterion("postTime >", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("postTime >=", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeLessThan(Date value) {
            addCriterion("postTime <", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeLessThanOrEqualTo(Date value) {
            addCriterion("postTime <=", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeIn(List<Date> values) {
            addCriterion("postTime in", values, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotIn(List<Date> values) {
            addCriterion("postTime not in", values, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeBetween(Date value1, Date value2) {
            addCriterion("postTime between", value1, value2, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotBetween(Date value1, Date value2) {
            addCriterion("postTime not between", value1, value2, "posttime");
            return (Criteria) this;
        }

        public Criteria andPostpicIsNull() {
            addCriterion("postPic is null");
            return (Criteria) this;
        }

        public Criteria andPostpicIsNotNull() {
            addCriterion("postPic is not null");
            return (Criteria) this;
        }

        public Criteria andPostpicEqualTo(String value) {
            addCriterion("postPic =", value, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicNotEqualTo(String value) {
            addCriterion("postPic <>", value, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicGreaterThan(String value) {
            addCriterion("postPic >", value, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicGreaterThanOrEqualTo(String value) {
            addCriterion("postPic >=", value, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicLessThan(String value) {
            addCriterion("postPic <", value, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicLessThanOrEqualTo(String value) {
            addCriterion("postPic <=", value, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicLike(String value) {
            addCriterion("postPic like", value, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicNotLike(String value) {
            addCriterion("postPic not like", value, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicIn(List<String> values) {
            addCriterion("postPic in", values, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicNotIn(List<String> values) {
            addCriterion("postPic not in", values, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicBetween(String value1, String value2) {
            addCriterion("postPic between", value1, value2, "postpic");
            return (Criteria) this;
        }

        public Criteria andPostpicNotBetween(String value1, String value2) {
            addCriterion("postPic not between", value1, value2, "postpic");
            return (Criteria) this;
        }

        public Criteria andPosttypeIsNull() {
            addCriterion("postType is null");
            return (Criteria) this;
        }

        public Criteria andPosttypeIsNotNull() {
            addCriterion("postType is not null");
            return (Criteria) this;
        }

        public Criteria andPosttypeEqualTo(String value) {
            addCriterion("postType =", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotEqualTo(String value) {
            addCriterion("postType <>", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeGreaterThan(String value) {
            addCriterion("postType >", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeGreaterThanOrEqualTo(String value) {
            addCriterion("postType >=", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLessThan(String value) {
            addCriterion("postType <", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLessThanOrEqualTo(String value) {
            addCriterion("postType <=", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLike(String value) {
            addCriterion("postType like", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotLike(String value) {
            addCriterion("postType not like", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeIn(List<String> values) {
            addCriterion("postType in", values, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotIn(List<String> values) {
            addCriterion("postType not in", values, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeBetween(String value1, String value2) {
            addCriterion("postType between", value1, value2, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotBetween(String value1, String value2) {
            addCriterion("postType not between", value1, value2, "posttype");
            return (Criteria) this;
        }

        public Criteria andPostcontextIsNull() {
            addCriterion("postContext is null");
            return (Criteria) this;
        }

        public Criteria andPostcontextIsNotNull() {
            addCriterion("postContext is not null");
            return (Criteria) this;
        }

        public Criteria andPostcontextEqualTo(String value) {
            addCriterion("postContext =", value, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextNotEqualTo(String value) {
            addCriterion("postContext <>", value, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextGreaterThan(String value) {
            addCriterion("postContext >", value, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextGreaterThanOrEqualTo(String value) {
            addCriterion("postContext >=", value, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextLessThan(String value) {
            addCriterion("postContext <", value, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextLessThanOrEqualTo(String value) {
            addCriterion("postContext <=", value, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextLike(String value) {
            addCriterion("postContext like", value, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextNotLike(String value) {
            addCriterion("postContext not like", value, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextIn(List<String> values) {
            addCriterion("postContext in", values, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextNotIn(List<String> values) {
            addCriterion("postContext not in", values, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextBetween(String value1, String value2) {
            addCriterion("postContext between", value1, value2, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPostcontextNotBetween(String value1, String value2) {
            addCriterion("postContext not between", value1, value2, "postcontext");
            return (Criteria) this;
        }

        public Criteria andPosttitleIsNull() {
            addCriterion("postTitle is null");
            return (Criteria) this;
        }

        public Criteria andPosttitleIsNotNull() {
            addCriterion("postTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPosttitleEqualTo(String value) {
            addCriterion("postTitle =", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotEqualTo(String value) {
            addCriterion("postTitle <>", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleGreaterThan(String value) {
            addCriterion("postTitle >", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleGreaterThanOrEqualTo(String value) {
            addCriterion("postTitle >=", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLessThan(String value) {
            addCriterion("postTitle <", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLessThanOrEqualTo(String value) {
            addCriterion("postTitle <=", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleLike(String value) {
            addCriterion("postTitle like", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotLike(String value) {
            addCriterion("postTitle not like", value, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleIn(List<String> values) {
            addCriterion("postTitle in", values, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotIn(List<String> values) {
            addCriterion("postTitle not in", values, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleBetween(String value1, String value2) {
            addCriterion("postTitle between", value1, value2, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPosttitleNotBetween(String value1, String value2) {
            addCriterion("postTitle not between", value1, value2, "posttitle");
            return (Criteria) this;
        }

        public Criteria andPostuserIsNull() {
            addCriterion("postUser is null");
            return (Criteria) this;
        }

        public Criteria andPostuserIsNotNull() {
            addCriterion("postUser is not null");
            return (Criteria) this;
        }

        public Criteria andPostuserEqualTo(String value) {
            addCriterion("postUser =", value, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserNotEqualTo(String value) {
            addCriterion("postUser <>", value, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserGreaterThan(String value) {
            addCriterion("postUser >", value, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserGreaterThanOrEqualTo(String value) {
            addCriterion("postUser >=", value, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserLessThan(String value) {
            addCriterion("postUser <", value, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserLessThanOrEqualTo(String value) {
            addCriterion("postUser <=", value, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserLike(String value) {
            addCriterion("postUser like", value, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserNotLike(String value) {
            addCriterion("postUser not like", value, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserIn(List<String> values) {
            addCriterion("postUser in", values, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserNotIn(List<String> values) {
            addCriterion("postUser not in", values, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserBetween(String value1, String value2) {
            addCriterion("postUser between", value1, value2, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostuserNotBetween(String value1, String value2) {
            addCriterion("postUser not between", value1, value2, "postuser");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("postId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postId not between", value1, value2, "postid");
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