/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class OrdersRequestBuilder {
    //the instance to build
    private OrdersRequest ordersRequest;

    /**
     * Default constructor to initialize the instance
     */
    public OrdersRequestBuilder() {
        ordersRequest = new OrdersRequest();
    }

    /**
     * Items
     */
    public OrdersRequestBuilder items(List<CreateOrderItemRequest> items) {
        ordersRequest.setItems(items);
        return this;
    }

    public OrdersRequestBuilder customer(Customer8 customer) {
        ordersRequest.setCustomer(customer);
        return this;
    }

    /**
     * Payment data
     */
    public OrdersRequestBuilder payments(List<CreatePaymentRequest> payments) {
        ordersRequest.setPayments(payments);
        return this;
    }

    /**
     * The order code
     */
    public OrdersRequestBuilder code(String code) {
        ordersRequest.setCode(code);
        return this;
    }

    /**
     * The customer id
     */
    public OrdersRequestBuilder customerId(String customerId) {
        ordersRequest.setCustomerId(customerId);
        return this;
    }

    public OrdersRequestBuilder shipping(Shipping3 shipping) {
        ordersRequest.setShipping(shipping);
        return this;
    }

    /**
     * Metadata
     */
    public OrdersRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        ordersRequest.setMetadata(metadata);
        return this;
    }

    /**
     * Defines whether the order will go through anti-fraud
     */
    public OrdersRequestBuilder antifraudEnabled(Boolean antifraudEnabled) {
        ordersRequest.setAntifraudEnabled(antifraudEnabled);
        return this;
    }

    /**
     * Ip address
     */
    public OrdersRequestBuilder ip(String ip) {
        ordersRequest.setIp(ip);
        return this;
    }

    /**
     * Session id
     */
    public OrdersRequestBuilder sessionId(String sessionId) {
        ordersRequest.setSessionId(sessionId);
        return this;
    }

    public OrdersRequestBuilder location(Location location) {
        ordersRequest.setLocation(location);
        return this;
    }

    public OrdersRequestBuilder device(Device1 device) {
        ordersRequest.setDevice(device);
        return this;
    }

    public OrdersRequestBuilder closed(boolean closed) {
        ordersRequest.setClosed(closed);
        return this;
    }

    /**
     * Currency
     */
    public OrdersRequestBuilder currency(String currency) {
        ordersRequest.setCurrency(currency);
        return this;
    }

    public OrdersRequestBuilder antifraud(CreateAntifraudRequest antifraud) {
        ordersRequest.setAntifraud(antifraud);
        return this;
    }

    public OrdersRequestBuilder submerchant(Submerchant submerchant) {
        ordersRequest.setSubmerchant(submerchant);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrdersRequest build() {
        return ordersRequest;
    }
}