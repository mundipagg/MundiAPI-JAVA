/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetOrderResponseBuilder {
    //the instance to build
    private GetOrderResponse getOrderResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetOrderResponseBuilder() {
        getOrderResponse = new GetOrderResponse();
    }

    public GetOrderResponseBuilder id(String id) {
        getOrderResponse.setId(id);
        return this;
    }

    public GetOrderResponseBuilder code(String code) {
        getOrderResponse.setCode(code);
        return this;
    }

    public GetOrderResponseBuilder currency(String currency) {
        getOrderResponse.setCurrency(currency);
        return this;
    }

    public GetOrderResponseBuilder items(List<GetOrderItemResponse> items) {
        getOrderResponse.setItems(items);
        return this;
    }

    public GetOrderResponseBuilder customer(Customer customer) {
        getOrderResponse.setCustomer(customer);
        return this;
    }

    public GetOrderResponseBuilder status(String status) {
        getOrderResponse.setStatus(status);
        return this;
    }

    public GetOrderResponseBuilder createdAt(DateTime createdAt) {
        getOrderResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetOrderResponseBuilder updatedAt(DateTime updatedAt) {
        getOrderResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public GetOrderResponseBuilder charges(List<GetChargeResponse> charges) {
        getOrderResponse.setCharges(charges);
        return this;
    }

    public GetOrderResponseBuilder invoiceUrl(String invoiceUrl) {
        getOrderResponse.setInvoiceUrl(invoiceUrl);
        return this;
    }

    public GetOrderResponseBuilder shipping(Shipping shipping) {
        getOrderResponse.setShipping(shipping);
        return this;
    }

    public GetOrderResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getOrderResponse.setMetadata(metadata);
        return this;
    }

    /**
     * Checkout Payment Settings Response
     */
    public GetOrderResponseBuilder checkouts(List<GetCheckoutPaymentResponse> checkouts) {
        getOrderResponse.setCheckouts(checkouts);
        return this;
    }

    /**
     * Ip address
     */
    public GetOrderResponseBuilder ip(String ip) {
        getOrderResponse.setIp(ip);
        return this;
    }

    /**
     * Session id
     */
    public GetOrderResponseBuilder sessionId(String sessionId) {
        getOrderResponse.setSessionId(sessionId);
        return this;
    }

    public GetOrderResponseBuilder location(Location location) {
        getOrderResponse.setLocation(location);
        return this;
    }

    public GetOrderResponseBuilder device(Device device) {
        getOrderResponse.setDevice(device);
        return this;
    }

    /**
     * Indicates whether the order is closed
     */
    public GetOrderResponseBuilder closed(boolean closed) {
        getOrderResponse.setClosed(closed);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetOrderResponse build() {
        return getOrderResponse;
    }
}