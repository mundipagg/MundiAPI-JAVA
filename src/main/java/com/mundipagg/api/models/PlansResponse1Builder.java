/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class PlansResponse1Builder {
    //the instance to build
    private PlansResponse1 plansResponse1;

    /**
     * Default constructor to initialize the instance
     */
    public PlansResponse1Builder() {
        plansResponse1 = new PlansResponse1();
    }

    public PlansResponse1Builder id(String id) {
        plansResponse1.setId(id);
        return this;
    }

    public PlansResponse1Builder name(String name) {
        plansResponse1.setName(name);
        return this;
    }

    public PlansResponse1Builder description(String description) {
        plansResponse1.setDescription(description);
        return this;
    }

    public PlansResponse1Builder url(String url) {
        plansResponse1.setUrl(url);
        return this;
    }

    public PlansResponse1Builder statementDescriptor(String statementDescriptor) {
        plansResponse1.setStatementDescriptor(statementDescriptor);
        return this;
    }

    public PlansResponse1Builder interval(String interval) {
        plansResponse1.setInterval(interval);
        return this;
    }

    public PlansResponse1Builder intervalCount(int intervalCount) {
        plansResponse1.setIntervalCount(intervalCount);
        return this;
    }

    public PlansResponse1Builder billingType(String billingType) {
        plansResponse1.setBillingType(billingType);
        return this;
    }

    public PlansResponse1Builder paymentMethods(List<String> paymentMethods) {
        plansResponse1.setPaymentMethods(paymentMethods);
        return this;
    }

    public PlansResponse1Builder installments(List<Integer> installments) {
        plansResponse1.setInstallments(installments);
        return this;
    }

    public PlansResponse1Builder status(String status) {
        plansResponse1.setStatus(status);
        return this;
    }

    public PlansResponse1Builder currency(String currency) {
        plansResponse1.setCurrency(currency);
        return this;
    }

    public PlansResponse1Builder createdAt(DateTime createdAt) {
        plansResponse1.setCreatedAt(createdAt);
        return this;
    }

    public PlansResponse1Builder updatedAt(DateTime updatedAt) {
        plansResponse1.setUpdatedAt(updatedAt);
        return this;
    }

    public PlansResponse1Builder items(List<GetPlanItemResponse> items) {
        plansResponse1.setItems(items);
        return this;
    }

    public PlansResponse1Builder billingDays(List<Integer> billingDays) {
        plansResponse1.setBillingDays(billingDays);
        return this;
    }

    public PlansResponse1Builder shippable(boolean shippable) {
        plansResponse1.setShippable(shippable);
        return this;
    }

    public PlansResponse1Builder metadata(LinkedHashMap<String, String> metadata) {
        plansResponse1.setMetadata(metadata);
        return this;
    }

    public PlansResponse1Builder trialPeriodDays(Integer trialPeriodDays) {
        plansResponse1.setTrialPeriodDays(trialPeriodDays);
        return this;
    }

    public PlansResponse1Builder minimumPrice(Integer minimumPrice) {
        plansResponse1.setMinimumPrice(minimumPrice);
        return this;
    }

    public PlansResponse1Builder deletedAt(DateTime deletedAt) {
        plansResponse1.setDeletedAt(deletedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PlansResponse1 build() {
        return plansResponse1;
    }
}