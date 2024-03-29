/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class ChargesRequest1Builder {
    //the instance to build
    private ChargesRequest1 chargesRequest1;

    /**
     * Default constructor to initialize the instance
     */
    public ChargesRequest1Builder() {
        chargesRequest1 = new ChargesRequest1();
    }

    /**
     * Code
     */
    public ChargesRequest1Builder code(String code) {
        chargesRequest1.setCode(code);
        return this;
    }

    /**
     * The amount of the charge, in cents
     */
    public ChargesRequest1Builder amount(int amount) {
        chargesRequest1.setAmount(amount);
        return this;
    }

    /**
     * The customer's id
     */
    public ChargesRequest1Builder customerId(String customerId) {
        chargesRequest1.setCustomerId(customerId);
        return this;
    }

    public ChargesRequest1Builder customer(Customer8 customer) {
        chargesRequest1.setCustomer(customer);
        return this;
    }

    public ChargesRequest1Builder payment(Payment payment) {
        chargesRequest1.setPayment(payment);
        return this;
    }

    /**
     * Metadata
     */
    public ChargesRequest1Builder metadata(LinkedHashMap<String, String> metadata) {
        chargesRequest1.setMetadata(metadata);
        return this;
    }

    /**
     * The charge due date
     */
    public ChargesRequest1Builder dueAt(DateTime dueAt) {
        chargesRequest1.setDueAt(dueAt);
        return this;
    }

    public ChargesRequest1Builder antifraud(CreateAntifraudRequest antifraud) {
        chargesRequest1.setAntifraud(antifraud);
        return this;
    }

    /**
     * Order Id
     */
    public ChargesRequest1Builder orderId(String orderId) {
        chargesRequest1.setOrderId(orderId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ChargesRequest1 build() {
        return chargesRequest1;
    }
}