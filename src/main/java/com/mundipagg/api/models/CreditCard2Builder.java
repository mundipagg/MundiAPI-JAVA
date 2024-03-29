/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreditCard2Builder {
    //the instance to build
    private CreditCard2 creditCard2;

    /**
     * Default constructor to initialize the instance
     */
    public CreditCard2Builder() {
        creditCard2 = new CreditCard2();
    }

    /**
     * Card invoice text descriptor
     */
    public CreditCard2Builder statementDescriptor(String statementDescriptor) {
        creditCard2.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Payment installment options
     */
    public CreditCard2Builder installments(List<CreateCheckoutCardInstallmentOptionRequest> installments) {
        creditCard2.setInstallments(installments);
        return this;
    }

    public CreditCard2Builder authentication(Authentication2 authentication) {
        creditCard2.setAuthentication(authentication);
        return this;
    }

    /**
     * Authorize and capture?
     */
    public CreditCard2Builder capture(Boolean capture) {
        creditCard2.setCapture(capture);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreditCard2 build() {
        return creditCard2;
    }
}