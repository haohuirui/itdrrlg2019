package com.itdr.mappers;

import com.itdr.pojo.Category;

public interface CategoryMapper {
    int insert(Category record);

    int insertSelective(Category record);
}