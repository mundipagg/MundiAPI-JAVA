/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class PlanBuilder {
    //the instance to build
    private Plan plan;

    /**
     * Default constructor to initialize the instance
     */
    public PlanBuilder() {
        plan = new Plan();
    }

    public PlanBuilder id(String id) {
        plan.setId(id);
        return this;
    }

    public PlanBuilder name(String name) {
        plan.setName(name);
        return this;
    }

    public PlanBuilder description(String description) {
        plan.setDescription(description);
        return this;
    }

    public PlanBuilder url(String url) {
        plan.setUrl(url);
        return this;
    }

    public PlanBuilder statementDescriptor(String statementDescriptor) {
        plan.setStatementDescriptor(statementDescriptor);
        return this;
    }

    public PlanBuilder interval(String interval) {
        plan.setInterval(interval);
        return this;
    }

    public PlanBuilder intervalCount(int intervalCount) {
        plan.setIntervalCount(intervalCount);
        return this;
    }

    public PlanBuilder billingType(String billingType) {
        plan.setBillingType(billingType);
        return this;
    }

    public PlanBuilder paymentMethods(List<String> paymentMethods) {
        plan.setPaymentMethods(paymentMethods);
        return this;
    }

    public PlanBuilder installments(List<Integer> installments) {
        plan.setInstallments(installments);
        return this;
    }

    public PlanBuilder status(String status) {
        plan.setStatus(status);
        return this;
    }

    public PlanBuilder currency(String currency) {
        plan.setCurrency(currency);
        return this;
    }

    public PlanBuilder createdAt(DateTime createdAt) {
        plan.setCreatedAt(createdAt);
        return this;
    }

    public PlanBuilder updatedAt(DateTime updatedAt) {
        plan.setUpdatedAt(updatedAt);
        return this;
    }

    public PlanBuilder items(List<GetPlanItemResponse> items) {
        plan.setItems(items);
        return this;
    }

    public PlanBuilder billingDays(List<Integer> billingDays) {
        plan.setBillingDays(billingDays);
        return this;
    }

    public PlanBuilder shippable(boolean shippable) {
        plan.setShippable(shippable);
        return this;
    }

    public PlanBuilder metadata(LinkedHashMap<String, String> metadata) {
        plan.setMetadata(metadata);
        return this;
    }

    public PlanBuilder trialPeriodDays(Integer trialPeriodDays) {
        plan.setTrialPeriodDays(trialPeriodDays);
        return this;
    }

    public PlanBuilder minimumPrice(Integer minimumPrice) {
        plan.setMinimumPrice(minimumPrice);
        return this;
    }

    public PlanBuilder deletedAt(DateTime deletedAt) {
        plan.setDeletedAt(deletedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Plan build() {
        return plan;
    }
}