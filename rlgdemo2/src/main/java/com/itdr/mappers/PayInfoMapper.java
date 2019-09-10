package com.itdr.mappers;

import com.itdr.pojo.PayInfo;

public interface PayInfoMapper {
    int insert(PayInfo record);

    int insertSelective(PayInfo record);
}