/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class TokensRequestBuilder {
    //the instance to build
    private TokensRequest tokensRequest;

    /**
     * Default constructor to initialize the instance
     */
    public TokensRequestBuilder() {
        tokensRequest = new TokensRequest();
    }

    /**
     * Token type
     */
    public TokensRequestBuilder type(String type) {
        tokensRequest.setType(type);
        return this;
    }

    public TokensRequestBuilder card(Card11 card) {
        tokensRequest.setCard(card);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TokensRequest build() {
        return tokensRequest;
    }
}