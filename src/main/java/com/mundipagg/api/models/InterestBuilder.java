/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class InterestBuilder {
    //the instance to build
    private Interest interest;

    /**
     * Default constructor to initialize the instance
     */
    public InterestBuilder() {
        interest = new Interest();
    }

    /**
     * Days
     */
    public InterestBuilder days(int days) {
        interest.setDays(days);
        return this;
    }

    /**
     * Type
     */
    public InterestBuilder type(String type) {
        interest.setType(type);
        return this;
    }

    /**
     * Amount
     */
    public InterestBuilder amount(int amount) {
        interest.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Interest build() {
        return interest;
    }
}