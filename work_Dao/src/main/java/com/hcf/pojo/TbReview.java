package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbReview implements Serializable {
    private Integer reviewid;

    private Integer reviewpost;

    private String reviewer;

    private String reviewcontext;

    private Date reviewtime;

    private String reviewpic;

    private Integer reviewthumb;

    private static final long serialVersionUID = 1L;

    public Integer getReviewid() {
        return reviewid;
    }

    public void setReviewid(Integer reviewid) {
        this.reviewid = reviewid;
    }

    public Integer getReviewpost() {
        return reviewpost;
    }

    public void setReviewpost(Integer reviewpost) {
        this.reviewpost = reviewpost;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer == null ? null : reviewer.trim();
    }

    public String getReviewcontext() {
        return reviewcontext;
    }

    public void setReviewcontext(String reviewcontext) {
        this.reviewcontext = reviewcontext == null ? null : reviewcontext.trim();
    }

    public Date getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(Date reviewtime) {
        this.reviewtime = reviewtime;
    }

    public String getReviewpic() {
        return reviewpic;
    }

    public void setReviewpic(String reviewpic) {
        this.reviewpic = reviewpic == null ? null : reviewpic.trim();
    }

    public Integer getReviewthumb() {
        return reviewthumb;
    }

    public void setReviewthumb(Integer reviewthumb) {
        this.reviewthumb = reviewthumb;
    }
}