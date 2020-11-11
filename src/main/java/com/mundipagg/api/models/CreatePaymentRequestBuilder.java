/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreatePaymentRequestBuilder {
    //the instance to build
    private CreatePaymentRequest createPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreatePaymentRequestBuilder() {
        createPaymentRequest = new CreatePaymentRequest();
    }

    /**
     * Payment method
     */
    public CreatePaymentRequestBuilder paymentMethod(String paymentMethod) {
        createPaymentRequest.setPaymentMethod(paymentMethod);
        return this;
    }

    /**
     * Settings for credit card payment
     */
    public CreatePaymentRequestBuilder creditCard(CreateCreditCardPaymentRequest creditCard) {
        createPaymentRequest.setCreditCard(creditCard);
        return this;
    }

    /**
     * Settings for debit card payment
     */
    public CreatePaymentRequestBuilder debitCard(CreateDebitCardPaymentRequest debitCard) {
        createPaymentRequest.setDebitCard(debitCard);
        return this;
    }

    /**
     * Settings for boleto payment
     */
    public CreatePaymentRequestBuilder boleto(CreateBoletoPaymentRequest boleto) {
        createPaymentRequest.setBoleto(boleto);
        return this;
    }

    /**
     * Currency. Must be informed using 3 characters
     */
    public CreatePaymentRequestBuilder currency(String currency) {
        createPaymentRequest.setCurrency(currency);
        return this;
    }

    /**
     * Settings for voucher payment
     */
    public CreatePaymentRequestBuilder voucher(CreateVoucherPaymentRequest voucher) {
        createPaymentRequest.setVoucher(voucher);
        return this;
    }

    /**
     * Splits
     */
    public CreatePaymentRequestBuilder split(List<CreateSplitRequest> split) {
        createPaymentRequest.setSplit(split);
        return this;
    }

    /**
     * Settings for bank transfer payment
     */
    public CreatePaymentRequestBuilder bankTransfer(CreateBankTransferPaymentRequest bankTransfer) {
        createPaymentRequest.setBankTransfer(bankTransfer);
        return this;
    }

    /**
     * Gateway affiliation code
     */
    public CreatePaymentRequestBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        createPaymentRequest.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    /**
     * The amount of the payment, in cents
     */
    public CreatePaymentRequestBuilder amount(Integer amount) {
        createPaymentRequest.setAmount(amount);
        return this;
    }

    /**
     * Settings for checkout payment
     */
    public CreatePaymentRequestBuilder checkout(CreateCheckoutPaymentRequest checkout) {
        createPaymentRequest.setCheckout(checkout);
        return this;
    }

    /**
     * Customer Id
     */
    public CreatePaymentRequestBuilder customerId(String customerId) {
        createPaymentRequest.setCustomerId(customerId);
        return this;
    }

    /**
     * Customer
     */
    public CreatePaymentRequestBuilder customer(CreateCustomerRequest customer) {
        createPaymentRequest.setCustomer(customer);
        return this;
    }

    /**
     * Metadata
     */
    public CreatePaymentRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createPaymentRequest.setMetadata(metadata);
        return this;
    }

    /**
     * Settings for cash payment
     */
    public CreatePaymentRequestBuilder cash(CreateCashPaymentRequest cash) {
        createPaymentRequest.setCash(cash);
        return this;
    }

    /**
     * Settings for private label payment
     */
    public CreatePaymentRequestBuilder privateLabel(CreatePrivateLabelPaymentRequest privateLabel) {
        createPaymentRequest.setPrivateLabel(privateLabel);
        return this;
    }

    /**
     * Settings for pix payment
     */
    public CreatePaymentRequestBuilder pix(CreatePixPaymentRequest pix) {
        createPaymentRequest.setPix(pix);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreatePaymentRequest build() {
        return createPaymentRequest;
    }
}