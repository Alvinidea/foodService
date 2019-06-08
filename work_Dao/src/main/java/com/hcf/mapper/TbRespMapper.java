package com.hcf.mapper;

import com.hcf.pojo.TbResp;
import com.hcf.pojo.TbRespExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRespMapper {
    int countByExample(TbRespExample example);

    int deleteByExample(TbRespExample example);

    int deleteByPrimaryKey(Integer respid);

    int insert(TbResp record);

    int insertSelective(TbResp record);

    List<TbResp> selectByExample(TbRespExample example);

    TbResp selectByPrimaryKey(Integer respid);

    int updateByExampleSelective(@Param("record") TbResp record, @Param("example") TbRespExample example);

    int updateByExample(@Param("record") TbResp record, @Param("example") TbRespExample example);

    int updateByPrimaryKeySelective(TbResp record);

    int updateByPrimaryKey(TbResp record);
}