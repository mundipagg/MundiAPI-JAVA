/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class ChargesResponse2Builder {
    //the instance to build
    private ChargesResponse2 chargesResponse2;

    /**
     * Default constructor to initialize the instance
     */
    public ChargesResponse2Builder() {
        chargesResponse2 = new ChargesResponse2();
    }

    /**
     * The charge objects
     */
    public ChargesResponse2Builder data(List<GetChargeResponse> data) {
        chargesResponse2.setData(data);
        return this;
    }

    public ChargesResponse2Builder paging(Paging paging) {
        chargesResponse2.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ChargesResponse2 build() {
        return chargesResponse2;
    }
}