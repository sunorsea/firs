package com.rhb.first.mapper;

import com.rhb.first.entity.TProduct;

public interface TProductMapper {
    int insert(TProduct record);

    int insertSelective(TProduct record);
}