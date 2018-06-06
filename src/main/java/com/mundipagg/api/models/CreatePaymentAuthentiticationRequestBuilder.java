/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreatePaymentAuthentiticationRequestBuilder {
    //the instance to build
    private CreatePaymentAuthentiticationRequest createPaymentAuthentiticationRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreatePaymentAuthentiticationRequestBuilder() {
        createPaymentAuthentiticationRequest = new CreatePaymentAuthentiticationRequest();
    }

    /**
     * The Authentication type
     */
    public CreatePaymentAuthentiticationRequestBuilder type(String type) {
        createPaymentAuthentiticationRequest.setType(type);
        return this;
    }

    /**
     * The 3D-S authentication object
     */
    public CreatePaymentAuthentiticationRequestBuilder threedSecure(Create3DSAuthentiticationRequest threedSecure) {
        createPaymentAuthentiticationRequest.setThreedSecure(threedSecure);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreatePaymentAuthentiticationRequest build() {
        return createPaymentAuthentiticationRequest;
    }
}