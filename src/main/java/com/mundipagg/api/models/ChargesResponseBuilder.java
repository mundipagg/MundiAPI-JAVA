/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class ChargesResponseBuilder {
    //the instance to build
    private ChargesResponse chargesResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ChargesResponseBuilder() {
        chargesResponse = new ChargesResponse();
    }

    public ChargesResponseBuilder id(String id) {
        chargesResponse.setId(id);
        return this;
    }

    public ChargesResponseBuilder code(String code) {
        chargesResponse.setCode(code);
        return this;
    }

    public ChargesResponseBuilder gatewayId(String gatewayId) {
        chargesResponse.setGatewayId(gatewayId);
        return this;
    }

    public ChargesResponseBuilder amount(int amount) {
        chargesResponse.setAmount(amount);
        return this;
    }

    public ChargesResponseBuilder status(String status) {
        chargesResponse.setStatus(status);
        return this;
    }

    public ChargesResponseBuilder currency(String currency) {
        chargesResponse.setCurrency(currency);
        return this;
    }

    public ChargesResponseBuilder paymentMethod(String paymentMethod) {
        chargesResponse.setPaymentMethod(paymentMethod);
        return this;
    }

    public ChargesResponseBuilder dueAt(DateTime dueAt) {
        chargesResponse.setDueAt(dueAt);
        return this;
    }

    public ChargesResponseBuilder createdAt(DateTime createdAt) {
        chargesResponse.setCreatedAt(createdAt);
        return this;
    }

    public ChargesResponseBuilder updatedAt(DateTime updatedAt) {
        chargesResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public ChargesResponseBuilder lastTransaction(GetTransactionResponse lastTransaction) {
        chargesResponse.setLastTransaction(lastTransaction);
        return this;
    }

    public ChargesResponseBuilder invoice(Invoice invoice) {
        chargesResponse.setInvoice(invoice);
        return this;
    }

    public ChargesResponseBuilder order(Order order) {
        chargesResponse.setOrder(order);
        return this;
    }

    public ChargesResponseBuilder customer(Customer customer) {
        chargesResponse.setCustomer(customer);
        return this;
    }

    public ChargesResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        chargesResponse.setMetadata(metadata);
        return this;
    }

    public ChargesResponseBuilder paidAt(DateTime paidAt) {
        chargesResponse.setPaidAt(paidAt);
        return this;
    }

    public ChargesResponseBuilder canceledAt(DateTime canceledAt) {
        chargesResponse.setCanceledAt(canceledAt);
        return this;
    }

    /**
     * Canceled Amount
     */
    public ChargesResponseBuilder canceledAmount(int canceledAmount) {
        chargesResponse.setCanceledAmount(canceledAmount);
        return this;
    }

    /**
     * Paid amount
     */
    public ChargesResponseBuilder paidAmount(int paidAmount) {
        chargesResponse.setPaidAmount(paidAmount);
        return this;
    }

    /**
     * Defines whether the card has been used one or more times.
     */
    public ChargesResponseBuilder recurrencyCycle(String recurrencyCycle) {
        chargesResponse.setRecurrencyCycle(recurrencyCycle);
        return this;
    }

    /**
     * interest and fine paid
     */
    public ChargesResponseBuilder interestAndFinePaid(Integer interestAndFinePaid) {
        chargesResponse.setInterestAndFinePaid(interestAndFinePaid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ChargesResponse build() {
        return chargesResponse;
    }
}