/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class ListChargeTransactionsResponseBuilder {
    //the instance to build
    private ListChargeTransactionsResponse listChargeTransactionsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListChargeTransactionsResponseBuilder() {
        listChargeTransactionsResponse = new ListChargeTransactionsResponse();
    }

    /**
     * The charge transactions objects
     */
    public ListChargeTransactionsResponseBuilder data(List<GetTransactionResponse> data) {
        listChargeTransactionsResponse.setData(data);
        return this;
    }

    public ListChargeTransactionsResponseBuilder paging(Paging paging) {
        listChargeTransactionsResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListChargeTransactionsResponse build() {
        return listChargeTransactionsResponse;
    }
}