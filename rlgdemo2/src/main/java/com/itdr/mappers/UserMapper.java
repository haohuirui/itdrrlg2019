package com.itdr.mappers;

import com.itdr.pojo.User;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    List<User> selectAll();
}