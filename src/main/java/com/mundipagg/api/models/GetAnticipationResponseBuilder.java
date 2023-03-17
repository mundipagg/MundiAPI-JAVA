/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetAnticipationResponseBuilder {
    //the instance to build
    private GetAnticipationResponse getAnticipationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetAnticipationResponseBuilder() {
        getAnticipationResponse = new GetAnticipationResponse();
    }

    /**
     * Id
     */
    public GetAnticipationResponseBuilder id(String id) {
        getAnticipationResponse.setId(id);
        return this;
    }

    /**
     * Requested amount
     */
    public GetAnticipationResponseBuilder requestedAmount(int requestedAmount) {
        getAnticipationResponse.setRequestedAmount(requestedAmount);
        return this;
    }

    /**
     * Approved amount
     */
    public GetAnticipationResponseBuilder approvedAmount(int approvedAmount) {
        getAnticipationResponse.setApprovedAmount(approvedAmount);
        return this;
    }

    public GetAnticipationResponseBuilder recipient(Recipient recipient) {
        getAnticipationResponse.setRecipient(recipient);
        return this;
    }

    /**
     * Anticipation id on the gateway
     */
    public GetAnticipationResponseBuilder pgid(String pgid) {
        getAnticipationResponse.setPgid(pgid);
        return this;
    }

    /**
     * Creation date
     */
    public GetAnticipationResponseBuilder createdAt(DateTime createdAt) {
        getAnticipationResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last update date
     */
    public GetAnticipationResponseBuilder updatedAt(DateTime updatedAt) {
        getAnticipationResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Payment date
     */
    public GetAnticipationResponseBuilder paymentDate(DateTime paymentDate) {
        getAnticipationResponse.setPaymentDate(paymentDate);
        return this;
    }

    /**
     * Status
     */
    public GetAnticipationResponseBuilder status(String status) {
        getAnticipationResponse.setStatus(status);
        return this;
    }

    /**
     * Timeframe
     */
    public GetAnticipationResponseBuilder timeframe(String timeframe) {
        getAnticipationResponse.setTimeframe(timeframe);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAnticipationResponse build() {
        return getAnticipationResponse;
    }
}