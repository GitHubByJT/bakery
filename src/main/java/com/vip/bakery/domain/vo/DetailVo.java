package com.vip.bakery.domain.vo;

import com.vip.bakery.domain.entity.Shop;
import com.vip.bakery.domain.entity.Shopcar;
import lombok.Data;

import java.util.List;

@Data
public class DetailVo extends Shopcar{
    List<Shop> shops;
    List<Shopcar> shopcars;
}
