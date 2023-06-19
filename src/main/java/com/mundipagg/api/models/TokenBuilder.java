/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class TokenBuilder {
    //the instance to build
    private Token token;

    /**
     * Default constructor to initialize the instance
     */
    public TokenBuilder() {
        token = new Token();
    }

    /**
     * The authentication type
     */
    public TokenBuilder type(String type) {
        token.setType(type);
        return this;
    }

    public TokenBuilder applePay(ApplePay applePay) {
        token.setApplePay(applePay);
        return this;
    }

    public TokenBuilder googlePay(GooglePay googlePay) {
        token.setGooglePay(googlePay);
        return this;
    }

    public TokenBuilder emv(CreateEmvDecryptRequest emv) {
        token.setEmv(emv);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Token build() {
        return token;
    }
}