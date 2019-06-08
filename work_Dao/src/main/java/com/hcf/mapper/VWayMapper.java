package com.hcf.mapper;

import com.hcf.pojo.VWay;
import com.hcf.pojo.VWayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VWayMapper {
    int countByExample(VWayExample example);

    int deleteByExample(VWayExample example);

    int insert(VWay record);

    int insertSelective(VWay record);

    List<VWay> selectByExample(VWayExample example);

    int updateByExampleSelective(@Param("record") VWay record, @Param("example") VWayExample example);

    int updateByExample(@Param("record") VWay record, @Param("example") VWayExample example);
}