/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class SubscriptionsItemsRequestBuilder {
    //the instance to build
    private SubscriptionsItemsRequest subscriptionsItemsRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsItemsRequestBuilder() {
        subscriptionsItemsRequest = new SubscriptionsItemsRequest();
    }

    /**
     * Description
     */
    public SubscriptionsItemsRequestBuilder description(String description) {
        subscriptionsItemsRequest.setDescription(description);
        return this;
    }

    /**
     * Status
     */
    public SubscriptionsItemsRequestBuilder status(String status) {
        subscriptionsItemsRequest.setStatus(status);
        return this;
    }

    public SubscriptionsItemsRequestBuilder pricingScheme(PricingScheme3 pricingScheme) {
        subscriptionsItemsRequest.setPricingScheme(pricingScheme);
        return this;
    }

    /**
     * Item name
     */
    public SubscriptionsItemsRequestBuilder name(String name) {
        subscriptionsItemsRequest.setName(name);
        return this;
    }

    /**
     * Number of cycles that the item will be charged
     */
    public SubscriptionsItemsRequestBuilder cycles(Integer cycles) {
        subscriptionsItemsRequest.setCycles(cycles);
        return this;
    }

    /**
     * Quantity
     */
    public SubscriptionsItemsRequestBuilder quantity(Integer quantity) {
        subscriptionsItemsRequest.setQuantity(quantity);
        return this;
    }

    /**
     * Minimum price
     */
    public SubscriptionsItemsRequestBuilder minimumPrice(Integer minimumPrice) {
        subscriptionsItemsRequest.setMinimumPrice(minimumPrice);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsItemsRequest build() {
        return subscriptionsItemsRequest;
    }
}