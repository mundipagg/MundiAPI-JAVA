/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class RecipientsDefaultBankAccountRequestBuilder {
    //the instance to build
    private RecipientsDefaultBankAccountRequest recipientsDefaultBankAccountRequest;

    /**
     * Default constructor to initialize the instance
     */
    public RecipientsDefaultBankAccountRequestBuilder() {
        recipientsDefaultBankAccountRequest = new RecipientsDefaultBankAccountRequest();
    }

    public RecipientsDefaultBankAccountRequestBuilder bankAccount(BankAccount1 bankAccount) {
        recipientsDefaultBankAccountRequest.setBankAccount(bankAccount);
        return this;
    }

    /**
     * Payment mode
     */
    public RecipientsDefaultBankAccountRequestBuilder paymentMode(String paymentMode) {
        recipientsDefaultBankAccountRequest.setPaymentMode(paymentMode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RecipientsDefaultBankAccountRequest build() {
        return recipientsDefaultBankAccountRequest;
    }
}