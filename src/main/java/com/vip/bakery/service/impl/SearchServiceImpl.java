package com.vip.bakery.service.impl;

import com.vip.bakery.domain.entity.Shop;
import com.vip.bakery.mapper.ShopMapper;
import com.vip.bakery.service.SearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("SearchService")
public class SearchServiceImpl implements SearchService {
    @Resource
    ShopMapper shopMapper;

    @Override
    public List<Shop> getDetails(String shopId) {
        return shopMapper.findByShopId(shopId);
    }
}
