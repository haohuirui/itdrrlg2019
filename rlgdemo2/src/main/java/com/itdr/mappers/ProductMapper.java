package com.itdr.mappers;

import com.itdr.pojo.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}