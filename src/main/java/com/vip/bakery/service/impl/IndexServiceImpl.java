package com.vip.bakery.service.impl;

import com.vip.bakery.domain.entity.Shop;
import com.vip.bakery.mapper.ShopMapper;
import com.vip.bakery.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("IndexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    ShopMapper shopMapper;

    @Override
    public List<Shop> getContent() {
        return shopMapper.findAll();
    }
}
