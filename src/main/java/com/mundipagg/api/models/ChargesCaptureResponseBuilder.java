/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class ChargesCaptureResponseBuilder {
    //the instance to build
    private ChargesCaptureResponse chargesCaptureResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ChargesCaptureResponseBuilder() {
        chargesCaptureResponse = new ChargesCaptureResponse();
    }

    public ChargesCaptureResponseBuilder id(String id) {
        chargesCaptureResponse.setId(id);
        return this;
    }

    public ChargesCaptureResponseBuilder code(String code) {
        chargesCaptureResponse.setCode(code);
        return this;
    }

    public ChargesCaptureResponseBuilder gatewayId(String gatewayId) {
        chargesCaptureResponse.setGatewayId(gatewayId);
        return this;
    }

    public ChargesCaptureResponseBuilder amount(int amount) {
        chargesCaptureResponse.setAmount(amount);
        return this;
    }

    public ChargesCaptureResponseBuilder status(String status) {
        chargesCaptureResponse.setStatus(status);
        return this;
    }

    public ChargesCaptureResponseBuilder currency(String currency) {
        chargesCaptureResponse.setCurrency(currency);
        return this;
    }

    public ChargesCaptureResponseBuilder paymentMethod(String paymentMethod) {
        chargesCaptureResponse.setPaymentMethod(paymentMethod);
        return this;
    }

    public ChargesCaptureResponseBuilder dueAt(DateTime dueAt) {
        chargesCaptureResponse.setDueAt(dueAt);
        return this;
    }

    public ChargesCaptureResponseBuilder createdAt(DateTime createdAt) {
        chargesCaptureResponse.setCreatedAt(createdAt);
        return this;
    }

    public ChargesCaptureResponseBuilder updatedAt(DateTime updatedAt) {
        chargesCaptureResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public ChargesCaptureResponseBuilder lastTransaction(GetTransactionResponse lastTransaction) {
        chargesCaptureResponse.setLastTransaction(lastTransaction);
        return this;
    }

    public ChargesCaptureResponseBuilder invoice(Invoice invoice) {
        chargesCaptureResponse.setInvoice(invoice);
        return this;
    }

    public ChargesCaptureResponseBuilder order(Order order) {
        chargesCaptureResponse.setOrder(order);
        return this;
    }

    public ChargesCaptureResponseBuilder customer(Customer customer) {
        chargesCaptureResponse.setCustomer(customer);
        return this;
    }

    public ChargesCaptureResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        chargesCaptureResponse.setMetadata(metadata);
        return this;
    }

    public ChargesCaptureResponseBuilder paidAt(DateTime paidAt) {
        chargesCaptureResponse.setPaidAt(paidAt);
        return this;
    }

    public ChargesCaptureResponseBuilder canceledAt(DateTime canceledAt) {
        chargesCaptureResponse.setCanceledAt(canceledAt);
        return this;
    }

    /**
     * Canceled Amount
     */
    public ChargesCaptureResponseBuilder canceledAmount(int canceledAmount) {
        chargesCaptureResponse.setCanceledAmount(canceledAmount);
        return this;
    }

    /**
     * Paid amount
     */
    public ChargesCaptureResponseBuilder paidAmount(int paidAmount) {
        chargesCaptureResponse.setPaidAmount(paidAmount);
        return this;
    }

    /**
     * Defines whether the card has been used one or more times.
     */
    public ChargesCaptureResponseBuilder recurrencyCycle(String recurrencyCycle) {
        chargesCaptureResponse.setRecurrencyCycle(recurrencyCycle);
        return this;
    }

    /**
     * interest and fine paid
     */
    public ChargesCaptureResponseBuilder interestAndFinePaid(Integer interestAndFinePaid) {
        chargesCaptureResponse.setInterestAndFinePaid(interestAndFinePaid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ChargesCaptureResponse build() {
        return chargesCaptureResponse;
    }
}