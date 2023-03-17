/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class OrdersItemsResponse1Builder {
    //the instance to build
    private OrdersItemsResponse1 ordersItemsResponse1;

    /**
     * Default constructor to initialize the instance
     */
    public OrdersItemsResponse1Builder() {
        ordersItemsResponse1 = new OrdersItemsResponse1();
    }

    /**
     * Id
     */
    public OrdersItemsResponse1Builder id(String id) {
        ordersItemsResponse1.setId(id);
        return this;
    }

    public OrdersItemsResponse1Builder amount(int amount) {
        ordersItemsResponse1.setAmount(amount);
        return this;
    }

    public OrdersItemsResponse1Builder description(String description) {
        ordersItemsResponse1.setDescription(description);
        return this;
    }

    public OrdersItemsResponse1Builder quantity(int quantity) {
        ordersItemsResponse1.setQuantity(quantity);
        return this;
    }

    /**
     * Category
     */
    public OrdersItemsResponse1Builder category(String category) {
        ordersItemsResponse1.setCategory(category);
        return this;
    }

    /**
     * Code
     */
    public OrdersItemsResponse1Builder code(String code) {
        ordersItemsResponse1.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrdersItemsResponse1 build() {
        return ordersItemsResponse1;
    }
}