/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class Options1Builder {
    //the instance to build
    private Options1 options1;

    /**
     * Default constructor to initialize the instance
     */
    public Options1Builder() {
        options1 = new Options1();
    }

    /**
     * Indicates if the card should be verified before creation. If true, executes an authorization before saving the card.
     */
    public Options1Builder verifyCard(boolean verifyCard) {
        options1.setVerifyCard(verifyCard);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Options1 build() {
        return options1;
    }
}