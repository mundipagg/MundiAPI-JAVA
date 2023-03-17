/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class Setup1Builder {
    //the instance to build
    private Setup1 setup1;

    /**
     * Default constructor to initialize the instance
     */
    public Setup1Builder() {
        setup1 = new Setup1();
    }

    /**
     * Setup amount
     */
    public Setup1Builder amount(int amount) {
        setup1.setAmount(amount);
        return this;
    }

    /**
     * Description
     */
    public Setup1Builder description(String description) {
        setup1.setDescription(description);
        return this;
    }

    public Setup1Builder payment(Payment payment) {
        setup1.setPayment(payment);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Setup1 build() {
        return setup1;
    }
}