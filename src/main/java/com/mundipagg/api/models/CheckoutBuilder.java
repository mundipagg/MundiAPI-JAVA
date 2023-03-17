/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CheckoutBuilder {
    //the instance to build
    private Checkout checkout;

    /**
     * Default constructor to initialize the instance
     */
    public CheckoutBuilder() {
        checkout = new Checkout();
    }

    /**
     * Accepted Payment Methods
     */
    public CheckoutBuilder acceptedPaymentMethods(List<String> acceptedPaymentMethods) {
        checkout.setAcceptedPaymentMethods(acceptedPaymentMethods);
        return this;
    }

    /**
     * Accepted Multi Payment Methods
     */
    public CheckoutBuilder acceptedMultiPaymentMethods(List<Object> acceptedMultiPaymentMethods) {
        checkout.setAcceptedMultiPaymentMethods(acceptedMultiPaymentMethods);
        return this;
    }

    /**
     * Success url
     */
    public CheckoutBuilder successUrl(String successUrl) {
        checkout.setSuccessUrl(successUrl);
        return this;
    }

    /**
     * Default payment method
     */
    public CheckoutBuilder defaultPaymentMethod(String defaultPaymentMethod) {
        checkout.setDefaultPaymentMethod(defaultPaymentMethod);
        return this;
    }

    /**
     * Gateway Affiliation Id
     */
    public CheckoutBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        checkout.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    public CheckoutBuilder creditCard(CreditCard2 creditCard) {
        checkout.setCreditCard(creditCard);
        return this;
    }

    public CheckoutBuilder debitCard(DebitCard2 debitCard) {
        checkout.setDebitCard(debitCard);
        return this;
    }

    public CheckoutBuilder boleto(CreateCheckoutBoletoPaymentRequest boleto) {
        checkout.setBoleto(boleto);
        return this;
    }

    /**
     * Customer is editable?
     */
    public CheckoutBuilder customerEditable(Boolean customerEditable) {
        checkout.setCustomerEditable(customerEditable);
        return this;
    }

    /**
     * Time in minutes for expiration
     */
    public CheckoutBuilder expiresIn(Integer expiresIn) {
        checkout.setExpiresIn(expiresIn);
        return this;
    }

    /**
     * Skip postpay success screen?
     */
    public CheckoutBuilder skipCheckoutSuccessPage(boolean skipCheckoutSuccessPage) {
        checkout.setSkipCheckoutSuccessPage(skipCheckoutSuccessPage);
        return this;
    }

    /**
     * Billing Address is editable?
     */
    public CheckoutBuilder billingAddressEditable(boolean billingAddressEditable) {
        checkout.setBillingAddressEditable(billingAddressEditable);
        return this;
    }

    public CheckoutBuilder billingAddress(BillingAddress1 billingAddress) {
        checkout.setBillingAddress(billingAddress);
        return this;
    }

    public CheckoutBuilder bankTransfer(BankTransfer2 bankTransfer) {
        checkout.setBankTransfer(bankTransfer);
        return this;
    }

    /**
     * Accepted Brands
     */
    public CheckoutBuilder acceptedBrands(List<String> acceptedBrands) {
        checkout.setAcceptedBrands(acceptedBrands);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Checkout build() {
        return checkout;
    }
}