/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class SubscriptionsDiscountsRequestBuilder {
    //the instance to build
    private SubscriptionsDiscountsRequest subscriptionsDiscountsRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsDiscountsRequestBuilder() {
        subscriptionsDiscountsRequest = new SubscriptionsDiscountsRequest();
    }

    /**
     * The discount value
     */
    public SubscriptionsDiscountsRequestBuilder value(double value) {
        subscriptionsDiscountsRequest.setValue(value);
        return this;
    }

    /**
     * Discount type. Can be either flat or percentage.
     */
    public SubscriptionsDiscountsRequestBuilder discountType(String discountType) {
        subscriptionsDiscountsRequest.setDiscountType(discountType);
        return this;
    }

    /**
     * The item where the discount will be applied
     */
    public SubscriptionsDiscountsRequestBuilder itemId(String itemId) {
        subscriptionsDiscountsRequest.setItemId(itemId);
        return this;
    }

    /**
     * Number of cycles that the discount will be applied
     */
    public SubscriptionsDiscountsRequestBuilder cycles(Integer cycles) {
        subscriptionsDiscountsRequest.setCycles(cycles);
        return this;
    }

    /**
     * Description
     */
    public SubscriptionsDiscountsRequestBuilder description(String description) {
        subscriptionsDiscountsRequest.setDescription(description);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsDiscountsRequest build() {
        return subscriptionsDiscountsRequest;
    }
}