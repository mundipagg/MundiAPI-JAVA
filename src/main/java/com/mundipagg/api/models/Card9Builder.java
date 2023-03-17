/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class Card9Builder {
    //the instance to build
    private Card9 card9;

    /**
     * Default constructor to initialize the instance
     */
    public Card9Builder() {
        card9 = new Card9();
    }

    public Card9Builder lastFourDigits(String lastFourDigits) {
        card9.setLastFourDigits(lastFourDigits);
        return this;
    }

    public Card9Builder holderName(String holderName) {
        card9.setHolderName(holderName);
        return this;
    }

    public Card9Builder holderDocument(String holderDocument) {
        card9.setHolderDocument(holderDocument);
        return this;
    }

    public Card9Builder expMonth(String expMonth) {
        card9.setExpMonth(expMonth);
        return this;
    }

    public Card9Builder expYear(String expYear) {
        card9.setExpYear(expYear);
        return this;
    }

    public Card9Builder brand(String brand) {
        card9.setBrand(brand);
        return this;
    }

    public Card9Builder type(String type) {
        card9.setType(type);
        return this;
    }

    public Card9Builder label(String label) {
        card9.setLabel(label);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Card9 build() {
        return card9;
    }
}