/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class CurrentCycleBuilder {
    //the instance to build
    private CurrentCycle currentCycle;

    /**
     * Default constructor to initialize the instance
     */
    public CurrentCycleBuilder() {
        currentCycle = new CurrentCycle();
    }

    public CurrentCycleBuilder startAt(DateTime startAt) {
        currentCycle.setStartAt(startAt);
        return this;
    }

    public CurrentCycleBuilder endAt(DateTime endAt) {
        currentCycle.setEndAt(endAt);
        return this;
    }

    public CurrentCycleBuilder id(String id) {
        currentCycle.setId(id);
        return this;
    }

    public CurrentCycleBuilder billingAt(DateTime billingAt) {
        currentCycle.setBillingAt(billingAt);
        return this;
    }

    public CurrentCycleBuilder subscription(GetSubscriptionResponse subscription) {
        currentCycle.setSubscription(subscription);
        return this;
    }

    public CurrentCycleBuilder status(String status) {
        currentCycle.setStatus(status);
        return this;
    }

    public CurrentCycleBuilder duration(int duration) {
        currentCycle.setDuration(duration);
        return this;
    }

    public CurrentCycleBuilder createdAt(String createdAt) {
        currentCycle.setCreatedAt(createdAt);
        return this;
    }

    public CurrentCycleBuilder updatedAt(String updatedAt) {
        currentCycle.setUpdatedAt(updatedAt);
        return this;
    }

    public CurrentCycleBuilder cycle(int cycle) {
        currentCycle.setCycle(cycle);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CurrentCycle build() {
        return currentCycle;
    }
}