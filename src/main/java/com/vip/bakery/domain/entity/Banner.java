package com.vip.bakery.domain.entity;

import lombok.Data;

@Data
public class Banner {
    /**
     *
     */
    private Integer bannerId;

    /**
     *
     */
    private String imgName;

    /**
     *
     */
    private String baseUrl;

    /**
     *
     */
    private String detailUrl;

    /**
     *
     */
    private Integer order;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}

