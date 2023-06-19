/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class ChargesRetryResponseBuilder {
    //the instance to build
    private ChargesRetryResponse chargesRetryResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ChargesRetryResponseBuilder() {
        chargesRetryResponse = new ChargesRetryResponse();
    }

    public ChargesRetryResponseBuilder id(String id) {
        chargesRetryResponse.setId(id);
        return this;
    }

    public ChargesRetryResponseBuilder code(String code) {
        chargesRetryResponse.setCode(code);
        return this;
    }

    public ChargesRetryResponseBuilder gatewayId(String gatewayId) {
        chargesRetryResponse.setGatewayId(gatewayId);
        return this;
    }

    public ChargesRetryResponseBuilder amount(int amount) {
        chargesRetryResponse.setAmount(amount);
        return this;
    }

    public ChargesRetryResponseBuilder status(String status) {
        chargesRetryResponse.setStatus(status);
        return this;
    }

    public ChargesRetryResponseBuilder currency(String currency) {
        chargesRetryResponse.setCurrency(currency);
        return this;
    }

    public ChargesRetryResponseBuilder paymentMethod(String paymentMethod) {
        chargesRetryResponse.setPaymentMethod(paymentMethod);
        return this;
    }

    public ChargesRetryResponseBuilder dueAt(DateTime dueAt) {
        chargesRetryResponse.setDueAt(dueAt);
        return this;
    }

    public ChargesRetryResponseBuilder createdAt(DateTime createdAt) {
        chargesRetryResponse.setCreatedAt(createdAt);
        return this;
    }

    public ChargesRetryResponseBuilder updatedAt(DateTime updatedAt) {
        chargesRetryResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public ChargesRetryResponseBuilder lastTransaction(GetTransactionResponse lastTransaction) {
        chargesRetryResponse.setLastTransaction(lastTransaction);
        return this;
    }

    public ChargesRetryResponseBuilder invoice(Invoice invoice) {
        chargesRetryResponse.setInvoice(invoice);
        return this;
    }

    public ChargesRetryResponseBuilder order(Order order) {
        chargesRetryResponse.setOrder(order);
        return this;
    }

    public ChargesRetryResponseBuilder customer(Customer customer) {
        chargesRetryResponse.setCustomer(customer);
        return this;
    }

    public ChargesRetryResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        chargesRetryResponse.setMetadata(metadata);
        return this;
    }

    public ChargesRetryResponseBuilder paidAt(DateTime paidAt) {
        chargesRetryResponse.setPaidAt(paidAt);
        return this;
    }

    public ChargesRetryResponseBuilder canceledAt(DateTime canceledAt) {
        chargesRetryResponse.setCanceledAt(canceledAt);
        return this;
    }

    /**
     * Canceled Amount
     */
    public ChargesRetryResponseBuilder canceledAmount(int canceledAmount) {
        chargesRetryResponse.setCanceledAmount(canceledAmount);
        return this;
    }

    /**
     * Paid amount
     */
    public ChargesRetryResponseBuilder paidAmount(int paidAmount) {
        chargesRetryResponse.setPaidAmount(paidAmount);
        return this;
    }

    /**
     * Defines whether the card has been used one or more times.
     */
    public ChargesRetryResponseBuilder recurrencyCycle(String recurrencyCycle) {
        chargesRetryResponse.setRecurrencyCycle(recurrencyCycle);
        return this;
    }

    /**
     * interest and fine paid
     */
    public ChargesRetryResponseBuilder interestAndFinePaid(Integer interestAndFinePaid) {
        chargesRetryResponse.setInterestAndFinePaid(interestAndFinePaid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ChargesRetryResponse build() {
        return chargesRetryResponse;
    }
}