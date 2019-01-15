/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetTransactionReportFileResponseBuilder {
    //the instance to build
    private GetTransactionReportFileResponse getTransactionReportFileResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetTransactionReportFileResponseBuilder() {
        getTransactionReportFileResponse = new GetTransactionReportFileResponse();
    }

    public GetTransactionReportFileResponseBuilder name(String name) {
        getTransactionReportFileResponse.setName(name);
        return this;
    }

    public GetTransactionReportFileResponseBuilder date(DateTime date) {
        getTransactionReportFileResponse.setDate(date);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTransactionReportFileResponse build() {
        return getTransactionReportFileResponse;
    }
}