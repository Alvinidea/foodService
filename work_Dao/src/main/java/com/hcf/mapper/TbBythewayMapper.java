package com.hcf.mapper;

import com.hcf.pojo.TbBytheway;
import com.hcf.pojo.TbBythewayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBythewayMapper {
    int countByExample(TbBythewayExample example);

    int deleteByExample(TbBythewayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBytheway record);

    int insertSelective(TbBytheway record);

    List<TbBytheway> selectByExample(TbBythewayExample example);

    TbBytheway selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBytheway record, @Param("example") TbBythewayExample example);

    int updateByExample(@Param("record") TbBytheway record, @Param("example") TbBythewayExample example);

    int updateByPrimaryKeySelective(TbBytheway record);

    int updateByPrimaryKey(TbBytheway record);
}