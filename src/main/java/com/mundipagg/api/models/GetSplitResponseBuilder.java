/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetSplitResponseBuilder {
    //the instance to build
    private GetSplitResponse getSplitResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetSplitResponseBuilder() {
        getSplitResponse = new GetSplitResponse();
    }

    /**
     * Type
     */
    public GetSplitResponseBuilder type(String type) {
        getSplitResponse.setType(type);
        return this;
    }

    /**
     * Amount
     */
    public GetSplitResponseBuilder amount(int amount) {
        getSplitResponse.setAmount(amount);
        return this;
    }

    /**
     * Recipient
     */
    public GetSplitResponseBuilder recipient(GetRecipientResponse recipient) {
        getSplitResponse.setRecipient(recipient);
        return this;
    }

    /**
     * The split rule gateway id
     */
    public GetSplitResponseBuilder gatewayId(String gatewayId) {
        getSplitResponse.setGatewayId(gatewayId);
        return this;
    }

    public GetSplitResponseBuilder options(GetSplitOptionsResponse options) {
        getSplitResponse.setOptions(options);
        return this;
    }

    public GetSplitResponseBuilder id(String id) {
        getSplitResponse.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSplitResponse build() {
        return getSplitResponse;
    }
}