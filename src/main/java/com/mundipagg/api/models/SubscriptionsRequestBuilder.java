/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class SubscriptionsRequestBuilder {
    //the instance to build
    private SubscriptionsRequest subscriptionsRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsRequestBuilder() {
        subscriptionsRequest = new SubscriptionsRequest();
    }

    /**
     * Indicates if the pending invoices must also be canceled.
     */
    public SubscriptionsRequestBuilder cancelPendingInvoices(boolean cancelPendingInvoices) {
        subscriptionsRequest.setCancelPendingInvoices(cancelPendingInvoices);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsRequest build() {
        return subscriptionsRequest;
    }
}