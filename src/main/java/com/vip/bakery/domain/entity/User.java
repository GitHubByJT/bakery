package com.vip.bakery.domain.entity;

import lombok.Data;

@Data
public class User {
    /**
     *
     */
    private Integer uid;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String phone;

    /**
     *
     */
    private String address;

    /**
     *
     */
    private Boolean isAdmin;

    /**
     *
     */
    private Boolean isValidate;
}

