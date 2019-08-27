package com.vip.bakery.controller;

import com.vip.bakery.domain.entity.Shop;
import com.vip.bakery.mapper.ShopMapper;
import com.vip.bakery.service.IndexService;
import com.vip.bakery.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bakery")
public class IndexController {
    @Resource
    IndexService indexService;

    @GetMapping("/list")
    public Result getList(){
        try {
            List<Shop> shopList = indexService.getContent();
            return Result.success(shopList);
        } catch (Exception e) {
            return Result.error();
        }
    }

}
