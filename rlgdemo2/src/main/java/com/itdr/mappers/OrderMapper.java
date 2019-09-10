package com.itdr.mappers;

import com.itdr.pojo.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}