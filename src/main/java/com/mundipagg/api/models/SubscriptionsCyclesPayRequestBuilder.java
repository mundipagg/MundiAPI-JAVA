/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class SubscriptionsCyclesPayRequestBuilder {
    //the instance to build
    private SubscriptionsCyclesPayRequest subscriptionsCyclesPayRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsCyclesPayRequestBuilder() {
        subscriptionsCyclesPayRequest = new SubscriptionsCyclesPayRequest();
    }

    /**
     * Metadata
     */
    public SubscriptionsCyclesPayRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        subscriptionsCyclesPayRequest.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsCyclesPayRequest build() {
        return subscriptionsCyclesPayRequest;
    }
}