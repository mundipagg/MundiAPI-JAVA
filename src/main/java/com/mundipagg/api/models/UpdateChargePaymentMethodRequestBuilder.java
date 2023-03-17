/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class UpdateChargePaymentMethodRequestBuilder {
    //the instance to build
    private UpdateChargePaymentMethodRequest updateChargePaymentMethodRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateChargePaymentMethodRequestBuilder() {
        updateChargePaymentMethodRequest = new UpdateChargePaymentMethodRequest();
    }

    /**
     * Indicates if the payment method from the subscription must also be updated
     */
    public UpdateChargePaymentMethodRequestBuilder updateSubscription(boolean updateSubscription) {
        updateChargePaymentMethodRequest.setUpdateSubscription(updateSubscription);
        return this;
    }

    /**
     * The new payment method
     */
    public UpdateChargePaymentMethodRequestBuilder paymentMethod(String paymentMethod) {
        updateChargePaymentMethodRequest.setPaymentMethod(paymentMethod);
        return this;
    }

    public UpdateChargePaymentMethodRequestBuilder creditCard(CreditCard1 creditCard) {
        updateChargePaymentMethodRequest.setCreditCard(creditCard);
        return this;
    }

    public UpdateChargePaymentMethodRequestBuilder debitCard(DebitCard1 debitCard) {
        updateChargePaymentMethodRequest.setDebitCard(debitCard);
        return this;
    }

    public UpdateChargePaymentMethodRequestBuilder boleto(Boleto1 boleto) {
        updateChargePaymentMethodRequest.setBoleto(boleto);
        return this;
    }

    public UpdateChargePaymentMethodRequestBuilder voucher(Voucher voucher) {
        updateChargePaymentMethodRequest.setVoucher(voucher);
        return this;
    }

    public UpdateChargePaymentMethodRequestBuilder cash(CreateCashPaymentRequest cash) {
        updateChargePaymentMethodRequest.setCash(cash);
        return this;
    }

    public UpdateChargePaymentMethodRequestBuilder bankTransfer(BankTransfer1 bankTransfer) {
        updateChargePaymentMethodRequest.setBankTransfer(bankTransfer);
        return this;
    }

    public UpdateChargePaymentMethodRequestBuilder privateLabel(PrivateLabel privateLabel) {
        updateChargePaymentMethodRequest.setPrivateLabel(privateLabel);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateChargePaymentMethodRequest build() {
        return updateChargePaymentMethodRequest;
    }
}