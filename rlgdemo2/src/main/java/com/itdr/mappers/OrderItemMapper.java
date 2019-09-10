package com.itdr.mappers;

import com.itdr.pojo.OrderItem;

public interface OrderItemMapper {
    int insert(OrderItem record);

    int insertSelective(OrderItem record);
}