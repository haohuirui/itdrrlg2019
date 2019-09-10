package com.itdr.mappers;

import com.itdr.pojo.Cart;

public interface CartMapper {
    int insert(Cart record);

    int insertSelective(Cart record);

}