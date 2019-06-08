package com.hcf.mapper;

import com.hcf.pojo.TbPosts;
import com.hcf.pojo.TbPostsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPostsMapper {
    int countByExample(TbPostsExample example);

    int deleteByExample(TbPostsExample example);

    int deleteByPrimaryKey(Integer postid);

    int insert(TbPosts record);

    int insertSelective(TbPosts record);

    List<TbPosts> selectByExample(TbPostsExample example);

    TbPosts selectByPrimaryKey(Integer postid);

    int updateByExampleSelective(@Param("record") TbPosts record, @Param("example") TbPostsExample example);

    int updateByExample(@Param("record") TbPosts record, @Param("example") TbPostsExample example);

    int updateByPrimaryKeySelective(TbPosts record);

    int updateByPrimaryKey(TbPosts record);
}