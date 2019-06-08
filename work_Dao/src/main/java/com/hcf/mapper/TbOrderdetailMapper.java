package com.hcf.mapper;

import com.hcf.pojo.TbOrderdetail;
import com.hcf.pojo.TbOrderdetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderdetailMapper {
    int countByExample(TbOrderdetailExample example);

    int deleteByExample(TbOrderdetailExample example);

    int deleteByPrimaryKey(String orderidd);

    int insert(TbOrderdetail record);

    int insertSelective(TbOrderdetail record);

    List<TbOrderdetail> selectByExample(TbOrderdetailExample example);

    TbOrderdetail selectByPrimaryKey(String orderidd);

    int updateByExampleSelective(@Param("record") TbOrderdetail record, @Param("example") TbOrderdetailExample example);

    int updateByExample(@Param("record") TbOrderdetail record, @Param("example") TbOrderdetailExample example);

    int updateByPrimaryKeySelective(TbOrderdetail record);

    int updateByPrimaryKey(TbOrderdetail record);
}