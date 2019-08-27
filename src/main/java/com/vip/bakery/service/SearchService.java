package com.vip.bakery.service;


import com.vip.bakery.domain.entity.Shop;
import com.vip.bakery.domain.vo.DetailVo;


import java.util.List;

public interface SearchService {
    List<Shop> getDetails(String shopId);
}
