/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class SubscriptionsIncrementsRequestBuilder {
    //the instance to build
    private SubscriptionsIncrementsRequest subscriptionsIncrementsRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsIncrementsRequestBuilder() {
        subscriptionsIncrementsRequest = new SubscriptionsIncrementsRequest();
    }

    /**
     * The increment value
     */
    public SubscriptionsIncrementsRequestBuilder value(double value) {
        subscriptionsIncrementsRequest.setValue(value);
        return this;
    }

    /**
     * Increment type. Can be either flat or percentage.
     */
    public SubscriptionsIncrementsRequestBuilder incrementType(String incrementType) {
        subscriptionsIncrementsRequest.setIncrementType(incrementType);
        return this;
    }

    /**
     * The item where the increment will be applied
     */
    public SubscriptionsIncrementsRequestBuilder itemId(String itemId) {
        subscriptionsIncrementsRequest.setItemId(itemId);
        return this;
    }

    /**
     * Number of cycles that the increment will be applied
     */
    public SubscriptionsIncrementsRequestBuilder cycles(Integer cycles) {
        subscriptionsIncrementsRequest.setCycles(cycles);
        return this;
    }

    /**
     * Description
     */
    public SubscriptionsIncrementsRequestBuilder description(String description) {
        subscriptionsIncrementsRequest.setDescription(description);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsIncrementsRequest build() {
        return subscriptionsIncrementsRequest;
    }
}