/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class RecipientsAnticipationsResponseBuilder {
    //the instance to build
    private RecipientsAnticipationsResponse recipientsAnticipationsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RecipientsAnticipationsResponseBuilder() {
        recipientsAnticipationsResponse = new RecipientsAnticipationsResponse();
    }

    /**
     * Id
     */
    public RecipientsAnticipationsResponseBuilder id(String id) {
        recipientsAnticipationsResponse.setId(id);
        return this;
    }

    /**
     * Requested amount
     */
    public RecipientsAnticipationsResponseBuilder requestedAmount(int requestedAmount) {
        recipientsAnticipationsResponse.setRequestedAmount(requestedAmount);
        return this;
    }

    /**
     * Approved amount
     */
    public RecipientsAnticipationsResponseBuilder approvedAmount(int approvedAmount) {
        recipientsAnticipationsResponse.setApprovedAmount(approvedAmount);
        return this;
    }

    public RecipientsAnticipationsResponseBuilder recipient(Recipient recipient) {
        recipientsAnticipationsResponse.setRecipient(recipient);
        return this;
    }

    /**
     * Anticipation id on the gateway
     */
    public RecipientsAnticipationsResponseBuilder pgid(String pgid) {
        recipientsAnticipationsResponse.setPgid(pgid);
        return this;
    }

    /**
     * Creation date
     */
    public RecipientsAnticipationsResponseBuilder createdAt(DateTime createdAt) {
        recipientsAnticipationsResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last update date
     */
    public RecipientsAnticipationsResponseBuilder updatedAt(DateTime updatedAt) {
        recipientsAnticipationsResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Payment date
     */
    public RecipientsAnticipationsResponseBuilder paymentDate(DateTime paymentDate) {
        recipientsAnticipationsResponse.setPaymentDate(paymentDate);
        return this;
    }

    /**
     * Status
     */
    public RecipientsAnticipationsResponseBuilder status(String status) {
        recipientsAnticipationsResponse.setStatus(status);
        return this;
    }

    /**
     * Timeframe
     */
    public RecipientsAnticipationsResponseBuilder timeframe(String timeframe) {
        recipientsAnticipationsResponse.setTimeframe(timeframe);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RecipientsAnticipationsResponse build() {
        return recipientsAnticipationsResponse;
    }
}