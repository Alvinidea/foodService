package com.hcf.mapper;

import com.hcf.pojo.TbReview;
import com.hcf.pojo.TbReviewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbReviewMapper {
    int countByExample(TbReviewExample example);

    int deleteByExample(TbReviewExample example);

    int deleteByPrimaryKey(Integer reviewid);

    int insert(TbReview record);

    int insertSelective(TbReview record);

    List<TbReview> selectByExample(TbReviewExample example);

    TbReview selectByPrimaryKey(Integer reviewid);

    int updateByExampleSelective(@Param("record") TbReview record, @Param("example") TbReviewExample example);

    int updateByExample(@Param("record") TbReview record, @Param("example") TbReviewExample example);

    int updateByPrimaryKeySelective(TbReview record);

    int updateByPrimaryKey(TbReview record);
}