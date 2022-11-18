/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetTransactionResponseBuilder {
    //the instance to build
    private GetTransactionResponse getTransactionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetTransactionResponseBuilder() {
        getTransactionResponse = new GetTransactionResponse();
    }

    /**
     * Gateway transaction id
     */
    public GetTransactionResponseBuilder gatewayId(String gatewayId) {
        getTransactionResponse.setGatewayId(gatewayId);
        return this;
    }

    /**
     * Amount in cents
     */
    public GetTransactionResponseBuilder amount(int amount) {
        getTransactionResponse.setAmount(amount);
        return this;
    }

    /**
     * Transaction status
     */
    public GetTransactionResponseBuilder status(String status) {
        getTransactionResponse.setStatus(status);
        return this;
    }

    /**
     * Indicates if the transaction ocurred successfuly
     */
    public GetTransactionResponseBuilder success(boolean success) {
        getTransactionResponse.setSuccess(success);
        return this;
    }

    /**
     * Creation date
     */
    public GetTransactionResponseBuilder createdAt(DateTime createdAt) {
        getTransactionResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last update date
     */
    public GetTransactionResponseBuilder updatedAt(DateTime updatedAt) {
        getTransactionResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Number of attempts tried
     */
    public GetTransactionResponseBuilder attemptCount(int attemptCount) {
        getTransactionResponse.setAttemptCount(attemptCount);
        return this;
    }

    /**
     * Max attempts
     */
    public GetTransactionResponseBuilder maxAttempts(int maxAttempts) {
        getTransactionResponse.setMaxAttempts(maxAttempts);
        return this;
    }

    /**
     * Splits
     */
    public GetTransactionResponseBuilder splits(List<GetSplitResponse> splits) {
        getTransactionResponse.setSplits(splits);
        return this;
    }

    /**
     * Date and time of the next attempt
     */
    public GetTransactionResponseBuilder nextAttempt(DateTime nextAttempt) {
        getTransactionResponse.setNextAttempt(nextAttempt);
        return this;
    }

    public GetTransactionResponseBuilder transactionType(String transactionType) {
        getTransactionResponse.setTransactionType(transactionType);
        return this;
    }

    /**
     * Código da transação
     */
    public GetTransactionResponseBuilder id(String id) {
        getTransactionResponse.setId(id);
        return this;
    }

    /**
     * The Gateway Response
     */
    public GetTransactionResponseBuilder gatewayResponse(GetGatewayResponseResponse gatewayResponse) {
        getTransactionResponse.setGatewayResponse(gatewayResponse);
        return this;
    }

    public GetTransactionResponseBuilder antifraudResponse(GetAntifraudResponse antifraudResponse) {
        getTransactionResponse.setAntifraudResponse(antifraudResponse);
        return this;
    }

    public GetTransactionResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getTransactionResponse.setMetadata(metadata);
        return this;
    }

    public GetTransactionResponseBuilder split(List<GetSplitResponse> split) {
        getTransactionResponse.setSplit(split);
        return this;
    }

    public GetTransactionResponseBuilder interest(GetInterestResponse interest) {
        getTransactionResponse.setInterest(interest);
        return this;
    }

    public GetTransactionResponseBuilder fine(GetFineResponse fine) {
        getTransactionResponse.setFine(fine);
        return this;
    }

    public GetTransactionResponseBuilder maxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
        getTransactionResponse.setMaxDaysToPayPastDue(maxDaysToPayPastDue);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTransactionResponse build() {
        return getTransactionResponse;
    }
}