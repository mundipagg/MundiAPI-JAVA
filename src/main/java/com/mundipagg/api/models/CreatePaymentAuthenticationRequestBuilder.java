/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreatePaymentAuthenticationRequestBuilder {
    //the instance to build
    private CreatePaymentAuthenticationRequest createPaymentAuthenticationRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreatePaymentAuthenticationRequestBuilder() {
        createPaymentAuthenticationRequest = new CreatePaymentAuthenticationRequest();
    }

    /**
     * The Authentication type
     */
    public CreatePaymentAuthenticationRequestBuilder type(String type) {
        createPaymentAuthenticationRequest.setType(type);
        return this;
    }

    public CreatePaymentAuthenticationRequestBuilder threedSecure(ThreedSecure1 threedSecure) {
        createPaymentAuthenticationRequest.setThreedSecure(threedSecure);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreatePaymentAuthenticationRequest build() {
        return createPaymentAuthenticationRequest;
    }
}