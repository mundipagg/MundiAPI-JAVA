/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class OrdersItemsResponseBuilder {
    //the instance to build
    private OrdersItemsResponse ordersItemsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public OrdersItemsResponseBuilder() {
        ordersItemsResponse = new OrdersItemsResponse();
    }

    public OrdersItemsResponseBuilder id(String id) {
        ordersItemsResponse.setId(id);
        return this;
    }

    public OrdersItemsResponseBuilder code(String code) {
        ordersItemsResponse.setCode(code);
        return this;
    }

    public OrdersItemsResponseBuilder currency(String currency) {
        ordersItemsResponse.setCurrency(currency);
        return this;
    }

    public OrdersItemsResponseBuilder items(List<GetOrderItemResponse> items) {
        ordersItemsResponse.setItems(items);
        return this;
    }

    public OrdersItemsResponseBuilder customer(Customer customer) {
        ordersItemsResponse.setCustomer(customer);
        return this;
    }

    public OrdersItemsResponseBuilder status(String status) {
        ordersItemsResponse.setStatus(status);
        return this;
    }

    public OrdersItemsResponseBuilder createdAt(DateTime createdAt) {
        ordersItemsResponse.setCreatedAt(createdAt);
        return this;
    }

    public OrdersItemsResponseBuilder updatedAt(DateTime updatedAt) {
        ordersItemsResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public OrdersItemsResponseBuilder charges(List<GetChargeResponse> charges) {
        ordersItemsResponse.setCharges(charges);
        return this;
    }

    public OrdersItemsResponseBuilder invoiceUrl(String invoiceUrl) {
        ordersItemsResponse.setInvoiceUrl(invoiceUrl);
        return this;
    }

    public OrdersItemsResponseBuilder shipping(Shipping shipping) {
        ordersItemsResponse.setShipping(shipping);
        return this;
    }

    public OrdersItemsResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        ordersItemsResponse.setMetadata(metadata);
        return this;
    }

    /**
     * Checkout Payment Settings Response
     */
    public OrdersItemsResponseBuilder checkouts(List<GetCheckoutPaymentResponse> checkouts) {
        ordersItemsResponse.setCheckouts(checkouts);
        return this;
    }

    /**
     * Ip address
     */
    public OrdersItemsResponseBuilder ip(String ip) {
        ordersItemsResponse.setIp(ip);
        return this;
    }

    /**
     * Session id
     */
    public OrdersItemsResponseBuilder sessionId(String sessionId) {
        ordersItemsResponse.setSessionId(sessionId);
        return this;
    }

    public OrdersItemsResponseBuilder location(Location location) {
        ordersItemsResponse.setLocation(location);
        return this;
    }

    public OrdersItemsResponseBuilder device(Device device) {
        ordersItemsResponse.setDevice(device);
        return this;
    }

    /**
     * Indicates whether the order is closed
     */
    public OrdersItemsResponseBuilder closed(boolean closed) {
        ordersItemsResponse.setClosed(closed);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrdersItemsResponse build() {
        return ordersItemsResponse;
    }
}