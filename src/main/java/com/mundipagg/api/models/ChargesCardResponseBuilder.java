/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class ChargesCardResponseBuilder {
    //the instance to build
    private ChargesCardResponse chargesCardResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ChargesCardResponseBuilder() {
        chargesCardResponse = new ChargesCardResponse();
    }

    public ChargesCardResponseBuilder id(String id) {
        chargesCardResponse.setId(id);
        return this;
    }

    public ChargesCardResponseBuilder code(String code) {
        chargesCardResponse.setCode(code);
        return this;
    }

    public ChargesCardResponseBuilder gatewayId(String gatewayId) {
        chargesCardResponse.setGatewayId(gatewayId);
        return this;
    }

    public ChargesCardResponseBuilder amount(int amount) {
        chargesCardResponse.setAmount(amount);
        return this;
    }

    public ChargesCardResponseBuilder status(String status) {
        chargesCardResponse.setStatus(status);
        return this;
    }

    public ChargesCardResponseBuilder currency(String currency) {
        chargesCardResponse.setCurrency(currency);
        return this;
    }

    public ChargesCardResponseBuilder paymentMethod(String paymentMethod) {
        chargesCardResponse.setPaymentMethod(paymentMethod);
        return this;
    }

    public ChargesCardResponseBuilder dueAt(DateTime dueAt) {
        chargesCardResponse.setDueAt(dueAt);
        return this;
    }

    public ChargesCardResponseBuilder createdAt(DateTime createdAt) {
        chargesCardResponse.setCreatedAt(createdAt);
        return this;
    }

    public ChargesCardResponseBuilder updatedAt(DateTime updatedAt) {
        chargesCardResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public ChargesCardResponseBuilder lastTransaction(GetTransactionResponse lastTransaction) {
        chargesCardResponse.setLastTransaction(lastTransaction);
        return this;
    }

    public ChargesCardResponseBuilder invoice(Invoice invoice) {
        chargesCardResponse.setInvoice(invoice);
        return this;
    }

    public ChargesCardResponseBuilder order(Order order) {
        chargesCardResponse.setOrder(order);
        return this;
    }

    public ChargesCardResponseBuilder customer(Customer customer) {
        chargesCardResponse.setCustomer(customer);
        return this;
    }

    public ChargesCardResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        chargesCardResponse.setMetadata(metadata);
        return this;
    }

    public ChargesCardResponseBuilder paidAt(DateTime paidAt) {
        chargesCardResponse.setPaidAt(paidAt);
        return this;
    }

    public ChargesCardResponseBuilder canceledAt(DateTime canceledAt) {
        chargesCardResponse.setCanceledAt(canceledAt);
        return this;
    }

    /**
     * Canceled Amount
     */
    public ChargesCardResponseBuilder canceledAmount(int canceledAmount) {
        chargesCardResponse.setCanceledAmount(canceledAmount);
        return this;
    }

    /**
     * Paid amount
     */
    public ChargesCardResponseBuilder paidAmount(int paidAmount) {
        chargesCardResponse.setPaidAmount(paidAmount);
        return this;
    }

    /**
     * Defines whether the card has been used one or more times.
     */
    public ChargesCardResponseBuilder recurrencyCycle(String recurrencyCycle) {
        chargesCardResponse.setRecurrencyCycle(recurrencyCycle);
        return this;
    }

    /**
     * interest and fine paid
     */
    public ChargesCardResponseBuilder interestAndFinePaid(Integer interestAndFinePaid) {
        chargesCardResponse.setInterestAndFinePaid(interestAndFinePaid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ChargesCardResponse build() {
        return chargesCardResponse;
    }
}