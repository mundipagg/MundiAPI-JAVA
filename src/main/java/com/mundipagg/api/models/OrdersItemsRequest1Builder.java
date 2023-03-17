/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class OrdersItemsRequest1Builder {
    //the instance to build
    private OrdersItemsRequest1 ordersItemsRequest1;

    /**
     * Default constructor to initialize the instance
     */
    public OrdersItemsRequest1Builder() {
        ordersItemsRequest1 = new OrdersItemsRequest1();
    }

    public OrdersItemsRequest1Builder amount(int amount) {
        ordersItemsRequest1.setAmount(amount);
        return this;
    }

    public OrdersItemsRequest1Builder description(String description) {
        ordersItemsRequest1.setDescription(description);
        return this;
    }

    public OrdersItemsRequest1Builder quantity(int quantity) {
        ordersItemsRequest1.setQuantity(quantity);
        return this;
    }

    public OrdersItemsRequest1Builder category(String category) {
        ordersItemsRequest1.setCategory(category);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrdersItemsRequest1 build() {
        return ordersItemsRequest1;
    }
}