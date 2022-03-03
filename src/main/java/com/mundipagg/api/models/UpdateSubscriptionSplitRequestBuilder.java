/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class UpdateSubscriptionSplitRequestBuilder {
    //the instance to build
    private UpdateSubscriptionSplitRequest updateSubscriptionSplitRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateSubscriptionSplitRequestBuilder() {
        updateSubscriptionSplitRequest = new UpdateSubscriptionSplitRequest();
    }

    /**
     * Defines if the split is enabled
     */
    public UpdateSubscriptionSplitRequestBuilder enabled(boolean enabled) {
        updateSubscriptionSplitRequest.setEnabled(enabled);
        return this;
    }

    /**
     * Split
     */
    public UpdateSubscriptionSplitRequestBuilder rules(List<CreateSplitRequest> rules) {
        updateSubscriptionSplitRequest.setRules(rules);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateSubscriptionSplitRequest build() {
        return updateSubscriptionSplitRequest;
    }
}