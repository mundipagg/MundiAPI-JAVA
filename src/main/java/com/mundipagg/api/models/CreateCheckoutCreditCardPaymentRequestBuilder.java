/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCheckoutCreditCardPaymentRequestBuilder {
    //the instance to build
    private CreateCheckoutCreditCardPaymentRequest createCheckoutCreditCardPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCheckoutCreditCardPaymentRequestBuilder() {
        createCheckoutCreditCardPaymentRequest = new CreateCheckoutCreditCardPaymentRequest();
    }

    /**
     * Card invoice text descriptor
     */
    public CreateCheckoutCreditCardPaymentRequestBuilder statementDescriptor(String statementDescriptor) {
        createCheckoutCreditCardPaymentRequest.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Payment installment options
     */
    public CreateCheckoutCreditCardPaymentRequestBuilder installments(List<CreateCheckoutCardInstallmentOptionRequest> installments) {
        createCheckoutCreditCardPaymentRequest.setInstallments(installments);
        return this;
    }

    public CreateCheckoutCreditCardPaymentRequestBuilder authentication(Authentication2 authentication) {
        createCheckoutCreditCardPaymentRequest.setAuthentication(authentication);
        return this;
    }

    /**
     * Authorize and capture?
     */
    public CreateCheckoutCreditCardPaymentRequestBuilder capture(Boolean capture) {
        createCheckoutCreditCardPaymentRequest.setCapture(capture);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCheckoutCreditCardPaymentRequest build() {
        return createCheckoutCreditCardPaymentRequest;
    }
}