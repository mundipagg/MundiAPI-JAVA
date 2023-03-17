/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GatewayResponseBuilder {
    //the instance to build
    private GatewayResponse gatewayResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GatewayResponseBuilder() {
        gatewayResponse = new GatewayResponse();
    }

    /**
     * The error code
     */
    public GatewayResponseBuilder code(String code) {
        gatewayResponse.setCode(code);
        return this;
    }

    /**
     * The gateway response errors list
     */
    public GatewayResponseBuilder errors(List<GetGatewayErrorResponse> errors) {
        gatewayResponse.setErrors(errors);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GatewayResponse build() {
        return gatewayResponse;
    }
}