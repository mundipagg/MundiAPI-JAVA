/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class SubscriptionsItemsRequest1Builder {
    //the instance to build
    private SubscriptionsItemsRequest1 subscriptionsItemsRequest1;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsItemsRequest1Builder() {
        subscriptionsItemsRequest1 = new SubscriptionsItemsRequest1();
    }

    /**
     * Item description
     */
    public SubscriptionsItemsRequest1Builder description(String description) {
        subscriptionsItemsRequest1.setDescription(description);
        return this;
    }

    public SubscriptionsItemsRequest1Builder pricingScheme(PricingScheme4 pricingScheme) {
        subscriptionsItemsRequest1.setPricingScheme(pricingScheme);
        return this;
    }

    /**
     * Item id
     */
    public SubscriptionsItemsRequest1Builder id(String id) {
        subscriptionsItemsRequest1.setId(id);
        return this;
    }

    /**
     * Plan item id
     */
    public SubscriptionsItemsRequest1Builder planItemId(String planItemId) {
        subscriptionsItemsRequest1.setPlanItemId(planItemId);
        return this;
    }

    /**
     * Discounts for the item
     */
    public SubscriptionsItemsRequest1Builder discounts(List<CreateDiscountRequest> discounts) {
        subscriptionsItemsRequest1.setDiscounts(discounts);
        return this;
    }

    /**
     * Item name
     */
    public SubscriptionsItemsRequest1Builder name(String name) {
        subscriptionsItemsRequest1.setName(name);
        return this;
    }

    /**
     * Number of cycles which the item will be charged
     */
    public SubscriptionsItemsRequest1Builder cycles(Integer cycles) {
        subscriptionsItemsRequest1.setCycles(cycles);
        return this;
    }

    /**
     * Quantity of items
     */
    public SubscriptionsItemsRequest1Builder quantity(Integer quantity) {
        subscriptionsItemsRequest1.setQuantity(quantity);
        return this;
    }

    /**
     * Minimum price
     */
    public SubscriptionsItemsRequest1Builder minimumPrice(Integer minimumPrice) {
        subscriptionsItemsRequest1.setMinimumPrice(minimumPrice);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsItemsRequest1 build() {
        return subscriptionsItemsRequest1;
    }
}