package com.hcf.mapper;

import com.hcf.pojo.TbUserdetail;
import com.hcf.pojo.TbUserdetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserdetailMapper {
    int countByExample(TbUserdetailExample example);

    int deleteByExample(TbUserdetailExample example);

    int deleteByPrimaryKey(String userdeatailid);

    int insert(TbUserdetail record);

    int insertSelective(TbUserdetail record);

    List<TbUserdetail> selectByExample(TbUserdetailExample example);

    TbUserdetail selectByPrimaryKey(String userdeatailid);

    int updateByExampleSelective(@Param("record") TbUserdetail record, @Param("example") TbUserdetailExample example);

    int updateByExample(@Param("record") TbUserdetail record, @Param("example") TbUserdetailExample example);

    int updateByPrimaryKeySelective(TbUserdetail record);

    int updateByPrimaryKey(TbUserdetail record);
}