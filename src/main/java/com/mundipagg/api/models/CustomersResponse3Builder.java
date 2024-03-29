/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CustomersResponse3Builder {
    //the instance to build
    private CustomersResponse3 customersResponse3;

    /**
     * Default constructor to initialize the instance
     */
    public CustomersResponse3Builder() {
        customersResponse3 = new CustomersResponse3();
    }

    /**
     * The customer object
     */
    public CustomersResponse3Builder data(List<GetCustomerResponse> data) {
        customersResponse3.setData(data);
        return this;
    }

    public CustomersResponse3Builder paging(Paging paging) {
        customersResponse3.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CustomersResponse3 build() {
        return customersResponse3;
    }
}