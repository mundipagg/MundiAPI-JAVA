/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class SubscriptionsDiscountsResponseBuilder {
    //the instance to build
    private SubscriptionsDiscountsResponse subscriptionsDiscountsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsDiscountsResponseBuilder() {
        subscriptionsDiscountsResponse = new SubscriptionsDiscountsResponse();
    }

    public SubscriptionsDiscountsResponseBuilder id(String id) {
        subscriptionsDiscountsResponse.setId(id);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder value(double value) {
        subscriptionsDiscountsResponse.setValue(value);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder discountType(String discountType) {
        subscriptionsDiscountsResponse.setDiscountType(discountType);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder status(String status) {
        subscriptionsDiscountsResponse.setStatus(status);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder createdAt(DateTime createdAt) {
        subscriptionsDiscountsResponse.setCreatedAt(createdAt);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder cycles(Integer cycles) {
        subscriptionsDiscountsResponse.setCycles(cycles);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder deletedAt(DateTime deletedAt) {
        subscriptionsDiscountsResponse.setDeletedAt(deletedAt);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder description(String description) {
        subscriptionsDiscountsResponse.setDescription(description);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder subscription(GetSubscriptionResponse subscription) {
        subscriptionsDiscountsResponse.setSubscription(subscription);
        return this;
    }

    public SubscriptionsDiscountsResponseBuilder subscriptionItem(GetSubscriptionItemResponse subscriptionItem) {
        subscriptionsDiscountsResponse.setSubscriptionItem(subscriptionItem);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsDiscountsResponse build() {
        return subscriptionsDiscountsResponse;
    }
}