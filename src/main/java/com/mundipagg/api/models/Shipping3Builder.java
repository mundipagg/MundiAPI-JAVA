/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class Shipping3Builder {
    //the instance to build
    private Shipping3 shipping3;

    /**
     * Default constructor to initialize the instance
     */
    public Shipping3Builder() {
        shipping3 = new Shipping3();
    }

    /**
     * Shipping amount
     */
    public Shipping3Builder amount(int amount) {
        shipping3.setAmount(amount);
        return this;
    }

    /**
     * Description
     */
    public Shipping3Builder description(String description) {
        shipping3.setDescription(description);
        return this;
    }

    /**
     * Recipient name
     */
    public Shipping3Builder recipientName(String recipientName) {
        shipping3.setRecipientName(recipientName);
        return this;
    }

    /**
     * Recipient phone number
     */
    public Shipping3Builder recipientPhone(String recipientPhone) {
        shipping3.setRecipientPhone(recipientPhone);
        return this;
    }

    /**
     * The id of the address that will be used for shipping
     */
    public Shipping3Builder addressId(String addressId) {
        shipping3.setAddressId(addressId);
        return this;
    }

    public Shipping3Builder address(Address1 address) {
        shipping3.setAddress(address);
        return this;
    }

    /**
     * Data máxima de entrega
     */
    public Shipping3Builder maxDeliveryDate(DateTime maxDeliveryDate) {
        shipping3.setMaxDeliveryDate(maxDeliveryDate);
        return this;
    }

    /**
     * Prazo estimado de entrega
     */
    public Shipping3Builder estimatedDeliveryDate(DateTime estimatedDeliveryDate) {
        shipping3.setEstimatedDeliveryDate(estimatedDeliveryDate);
        return this;
    }

    /**
     * Shipping type
     */
    public Shipping3Builder type(String type) {
        shipping3.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Shipping3 build() {
        return shipping3;
    }
}