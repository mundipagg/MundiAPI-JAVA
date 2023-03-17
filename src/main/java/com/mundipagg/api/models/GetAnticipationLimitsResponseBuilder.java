/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetAnticipationLimitsResponseBuilder {
    //the instance to build
    private GetAnticipationLimitsResponse getAnticipationLimitsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetAnticipationLimitsResponseBuilder() {
        getAnticipationLimitsResponse = new GetAnticipationLimitsResponse();
    }

    public GetAnticipationLimitsResponseBuilder max(Max max) {
        getAnticipationLimitsResponse.setMax(max);
        return this;
    }

    public GetAnticipationLimitsResponseBuilder min(Min min) {
        getAnticipationLimitsResponse.setMin(min);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAnticipationLimitsResponse build() {
        return getAnticipationLimitsResponse;
    }
}