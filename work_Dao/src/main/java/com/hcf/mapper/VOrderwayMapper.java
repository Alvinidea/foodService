package com.hcf.mapper;

import com.hcf.pojo.VOrderway;
import com.hcf.pojo.VOrderwayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VOrderwayMapper {
    int countByExample(VOrderwayExample example);

    int deleteByExample(VOrderwayExample example);

    int insert(VOrderway record);

    int insertSelective(VOrderway record);

    List<VOrderway> selectByExample(VOrderwayExample example);

    int updateByExampleSelective(@Param("record") VOrderway record, @Param("example") VOrderwayExample example);

    int updateByExample(@Param("record") VOrderway record, @Param("example") VOrderwayExample example);
}