package com.hcf.mapper;

import com.hcf.pojo.VCmt;
import com.hcf.pojo.VCmtExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VCmtMapper {
    int countByExample(VCmtExample example);

    int deleteByExample(VCmtExample example);

    int insert(VCmt record);

    int insertSelective(VCmt record);

    List<VCmt> selectByExample(VCmtExample example);

    int updateByExampleSelective(@Param("record") VCmt record, @Param("example") VCmtExample example);

    int updateByExample(@Param("record") VCmt record, @Param("example") VCmtExample example);
}