/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class BankTransferBuilder {
    //the instance to build
    private BankTransfer bankTransfer;

    /**
     * Default constructor to initialize the instance
     */
    public BankTransferBuilder() {
        bankTransfer = new BankTransfer();
    }

    /**
     * bank list response
     */
    public BankTransferBuilder bank(List<String> bank) {
        bankTransfer.setBank(bank);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BankTransfer build() {
        return bankTransfer;
    }
}