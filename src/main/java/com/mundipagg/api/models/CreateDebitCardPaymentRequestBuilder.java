/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateDebitCardPaymentRequestBuilder {
    //the instance to build
    private CreateDebitCardPaymentRequest createDebitCardPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDebitCardPaymentRequestBuilder() {
        createDebitCardPaymentRequest = new CreateDebitCardPaymentRequest();
    }

    /**
     * The text that will be shown on the debit card's statement
     */
    public CreateDebitCardPaymentRequestBuilder statementDescriptor(String statementDescriptor) {
        createDebitCardPaymentRequest.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Debit card data
     */
    public CreateDebitCardPaymentRequestBuilder card(CreateCardRequest card) {
        createDebitCardPaymentRequest.setCard(card);
        return this;
    }

    /**
     * The debit card id
     */
    public CreateDebitCardPaymentRequestBuilder cardId(String cardId) {
        createDebitCardPaymentRequest.setCardId(cardId);
        return this;
    }

    /**
     * The debit card token
     */
    public CreateDebitCardPaymentRequestBuilder cardToken(String cardToken) {
        createDebitCardPaymentRequest.setCardToken(cardToken);
        return this;
    }

    /**
     * Indicates a recurrence
     */
    public CreateDebitCardPaymentRequestBuilder recurrence(Boolean recurrence) {
        createDebitCardPaymentRequest.setRecurrence(recurrence);
        return this;
    }

    /**
     * The payment authentication request
     */
    public CreateDebitCardPaymentRequestBuilder authentication(CreatePaymentAuthentiticationRequest authentication) {
        createDebitCardPaymentRequest.setAuthentication(authentication);
        return this;
    }

    /**
     * The Debit card payment token request
     */
    public CreateDebitCardPaymentRequestBuilder token(CreateCardPaymentTokenRequest token) {
        createDebitCardPaymentRequest.setToken(token);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDebitCardPaymentRequest build() {
        return createDebitCardPaymentRequest;
    }
}