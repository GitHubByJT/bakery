package com.vip.bakery.controller;

import com.vip.bakery.domain.entity.Shop;
import com.vip.bakery.domain.vo.DetailVo;
import com.vip.bakery.service.SearchService;
import com.vip.bakery.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bakery")
public class SearchController {
    @Resource
    SearchService searchService;

    @GetMapping("/detail")
    public Result getDetails(String shopId){
        try {
            List<Shop> details = searchService.getDetails(shopId);
            return Result.success(details);
        } catch (Exception e) {
            return Result.error();
        }
    }
}
