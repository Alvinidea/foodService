package com.hcf.mapper;

import com.hcf.pojo.VGoods;
import com.hcf.pojo.VGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VGoodsMapper {
    int countByExample(VGoodsExample example);

    int deleteByExample(VGoodsExample example);

    int insert(VGoods record);

    int insertSelective(VGoods record);

    List<VGoods> selectByExample(VGoodsExample example);

    int updateByExampleSelective(@Param("record") VGoods record, @Param("example") VGoodsExample example);

    int updateByExample(@Param("record") VGoods record, @Param("example") VGoodsExample example);
}