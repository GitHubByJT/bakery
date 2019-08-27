package com.vip.bakery.mapper;

import com.vip.bakery.domain.entity.Shop;
import org.apache.ibatis.annotations.Param;


import java.util.List;


public interface ShopMapper {
    List<Shop> findAll();
    List<Shop> findByShopId(@Param("shopId") String shopId);
}
