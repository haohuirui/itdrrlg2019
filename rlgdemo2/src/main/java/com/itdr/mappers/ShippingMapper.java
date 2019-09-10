package com.itdr.mappers;

import com.itdr.pojo.Shipping;

public interface ShippingMapper {
    int insert(Shipping record);

    int insertSelective(Shipping record);
}