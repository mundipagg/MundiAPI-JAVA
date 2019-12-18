/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetCardTokenResponseBuilder {
    //the instance to build
    private GetCardTokenResponse getCardTokenResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetCardTokenResponseBuilder() {
        getCardTokenResponse = new GetCardTokenResponse();
    }

    public GetCardTokenResponseBuilder lastFourDigits(String lastFourDigits) {
        getCardTokenResponse.setLastFourDigits(lastFourDigits);
        return this;
    }

    public GetCardTokenResponseBuilder holderName(String holderName) {
        getCardTokenResponse.setHolderName(holderName);
        return this;
    }

    public GetCardTokenResponseBuilder holderDocument(String holderDocument) {
        getCardTokenResponse.setHolderDocument(holderDocument);
        return this;
    }

    public GetCardTokenResponseBuilder expMonth(String expMonth) {
        getCardTokenResponse.setExpMonth(expMonth);
        return this;
    }

    public GetCardTokenResponseBuilder expYear(String expYear) {
        getCardTokenResponse.setExpYear(expYear);
        return this;
    }

    public GetCardTokenResponseBuilder brand(String brand) {
        getCardTokenResponse.setBrand(brand);
        return this;
    }

    public GetCardTokenResponseBuilder type(String type) {
        getCardTokenResponse.setType(type);
        return this;
    }

    public GetCardTokenResponseBuilder label(String label) {
        getCardTokenResponse.setLabel(label);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCardTokenResponse build() {
        return getCardTokenResponse;
    }
}