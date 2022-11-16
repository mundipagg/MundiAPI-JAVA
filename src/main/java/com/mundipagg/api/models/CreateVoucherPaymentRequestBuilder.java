/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateVoucherPaymentRequestBuilder {
    //the instance to build
    private CreateVoucherPaymentRequest createVoucherPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateVoucherPaymentRequestBuilder() {
        createVoucherPaymentRequest = new CreateVoucherPaymentRequest();
    }

    /**
     * The text that will be shown on the voucher's statement
     */
    public CreateVoucherPaymentRequestBuilder statementDescriptor(String statementDescriptor) {
        createVoucherPaymentRequest.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Card id
     */
    public CreateVoucherPaymentRequestBuilder cardId(String cardId) {
        createVoucherPaymentRequest.setCardId(cardId);
        return this;
    }

    /**
     * Card token
     */
    public CreateVoucherPaymentRequestBuilder cardToken(String cardToken) {
        createVoucherPaymentRequest.setCardToken(cardToken);
        return this;
    }

    /**
     * Card info
     */
    public CreateVoucherPaymentRequestBuilder card(CreateCardRequest card) {
        createVoucherPaymentRequest.setCard(card);
        return this;
    }

    /**
     * Defines whether the card has been used one or more times.
     */
    public CreateVoucherPaymentRequestBuilder recurrencyCycle(String recurrencyCycle) {
        createVoucherPaymentRequest.setRecurrencyCycle(recurrencyCycle);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateVoucherPaymentRequest build() {
        return createVoucherPaymentRequest;
    }
}