/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class SubscriptionsRequest1Builder {
    //the instance to build
    private SubscriptionsRequest1 subscriptionsRequest1;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsRequest1Builder() {
        subscriptionsRequest1 = new SubscriptionsRequest1();
    }

    public SubscriptionsRequest1Builder customer(Customer8 customer) {
        subscriptionsRequest1.setCustomer(customer);
        return this;
    }

    public SubscriptionsRequest1Builder card(Card1 card) {
        subscriptionsRequest1.setCard(card);
        return this;
    }

    /**
     * Subscription code
     */
    public SubscriptionsRequest1Builder code(String code) {
        subscriptionsRequest1.setCode(code);
        return this;
    }

    /**
     * Payment method
     */
    public SubscriptionsRequest1Builder paymentMethod(String paymentMethod) {
        subscriptionsRequest1.setPaymentMethod(paymentMethod);
        return this;
    }

    /**
     * Billing type
     */
    public SubscriptionsRequest1Builder billingType(String billingType) {
        subscriptionsRequest1.setBillingType(billingType);
        return this;
    }

    /**
     * Statement descriptor for credit card subscriptions
     */
    public SubscriptionsRequest1Builder statementDescriptor(String statementDescriptor) {
        subscriptionsRequest1.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Subscription description
     */
    public SubscriptionsRequest1Builder description(String description) {
        subscriptionsRequest1.setDescription(description);
        return this;
    }

    /**
     * Currency
     */
    public SubscriptionsRequest1Builder currency(String currency) {
        subscriptionsRequest1.setCurrency(currency);
        return this;
    }

    /**
     * Interval
     */
    public SubscriptionsRequest1Builder interval(String interval) {
        subscriptionsRequest1.setInterval(interval);
        return this;
    }

    /**
     * Interval count
     */
    public SubscriptionsRequest1Builder intervalCount(int intervalCount) {
        subscriptionsRequest1.setIntervalCount(intervalCount);
        return this;
    }

    public SubscriptionsRequest1Builder pricingScheme(PricingScheme4 pricingScheme) {
        subscriptionsRequest1.setPricingScheme(pricingScheme);
        return this;
    }

    /**
     * Subscription items
     */
    public SubscriptionsRequest1Builder items(List<CreateSubscriptionItemRequest> items) {
        subscriptionsRequest1.setItems(items);
        return this;
    }

    public SubscriptionsRequest1Builder shipping(Shipping3 shipping) {
        subscriptionsRequest1.setShipping(shipping);
        return this;
    }

    /**
     * Discounts
     */
    public SubscriptionsRequest1Builder discounts(List<CreateDiscountRequest> discounts) {
        subscriptionsRequest1.setDiscounts(discounts);
        return this;
    }

    /**
     * Metadata
     */
    public SubscriptionsRequest1Builder metadata(LinkedHashMap<String, String> metadata) {
        subscriptionsRequest1.setMetadata(metadata);
        return this;
    }

    public SubscriptionsRequest1Builder setup(Setup1 setup) {
        subscriptionsRequest1.setSetup(setup);
        return this;
    }

    /**
     * Plan id
     */
    public SubscriptionsRequest1Builder planId(String planId) {
        subscriptionsRequest1.setPlanId(planId);
        return this;
    }

    /**
     * Customer id
     */
    public SubscriptionsRequest1Builder customerId(String customerId) {
        subscriptionsRequest1.setCustomerId(customerId);
        return this;
    }

    /**
     * Card id
     */
    public SubscriptionsRequest1Builder cardId(String cardId) {
        subscriptionsRequest1.setCardId(cardId);
        return this;
    }

    /**
     * Billing day
     */
    public SubscriptionsRequest1Builder billingDay(Integer billingDay) {
        subscriptionsRequest1.setBillingDay(billingDay);
        return this;
    }

    /**
     * Number of installments
     */
    public SubscriptionsRequest1Builder installments(Integer installments) {
        subscriptionsRequest1.setInstallments(installments);
        return this;
    }

    /**
     * Subscription start date
     */
    public SubscriptionsRequest1Builder startAt(DateTime startAt) {
        subscriptionsRequest1.setStartAt(startAt);
        return this;
    }

    /**
     * Subscription minimum price
     */
    public SubscriptionsRequest1Builder minimumPrice(Integer minimumPrice) {
        subscriptionsRequest1.setMinimumPrice(minimumPrice);
        return this;
    }

    /**
     * Number of cycles
     */
    public SubscriptionsRequest1Builder cycles(Integer cycles) {
        subscriptionsRequest1.setCycles(cycles);
        return this;
    }

    /**
     * Card token
     */
    public SubscriptionsRequest1Builder cardToken(String cardToken) {
        subscriptionsRequest1.setCardToken(cardToken);
        return this;
    }

    /**
     * Gateway Affiliation code
     */
    public SubscriptionsRequest1Builder gatewayAffiliationId(String gatewayAffiliationId) {
        subscriptionsRequest1.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    /**
     * Quantity
     */
    public SubscriptionsRequest1Builder quantity(Integer quantity) {
        subscriptionsRequest1.setQuantity(quantity);
        return this;
    }

    /**
     * Days until boleto expires
     */
    public SubscriptionsRequest1Builder boletoDueDays(Integer boletoDueDays) {
        subscriptionsRequest1.setBoletoDueDays(boletoDueDays);
        return this;
    }

    /**
     * Increments
     */
    public SubscriptionsRequest1Builder increments(List<CreateIncrementRequest> increments) {
        subscriptionsRequest1.setIncrements(increments);
        return this;
    }

    public SubscriptionsRequest1Builder period(CreatePeriodRequest period) {
        subscriptionsRequest1.setPeriod(period);
        return this;
    }

    public SubscriptionsRequest1Builder submerchant(Submerchant submerchant) {
        subscriptionsRequest1.setSubmerchant(submerchant);
        return this;
    }

    public SubscriptionsRequest1Builder split(UpdateSubscriptionSplitRequest split) {
        subscriptionsRequest1.setSplit(split);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsRequest1 build() {
        return subscriptionsRequest1;
    }
}