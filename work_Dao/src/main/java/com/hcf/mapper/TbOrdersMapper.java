package com.hcf.mapper;

import com.hcf.pojo.TbOrders;
import com.hcf.pojo.TbOrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrdersMapper {
    int countByExample(TbOrdersExample example);

    int deleteByExample(TbOrdersExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(TbOrders record);

    int insertSelective(TbOrders record);

    List<TbOrders> selectByExample(TbOrdersExample example);

    TbOrders selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByExample(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByPrimaryKeySelective(TbOrders record);

    int updateByPrimaryKey(TbOrders record);
}