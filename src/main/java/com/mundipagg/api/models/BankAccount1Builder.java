/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class BankAccount1Builder {
    //the instance to build
    private BankAccount1 bankAccount1;

    /**
     * Default constructor to initialize the instance
     */
    public BankAccount1Builder() {
        bankAccount1 = new BankAccount1();
    }

    /**
     * Bank account holder name
     */
    public BankAccount1Builder holderName(String holderName) {
        bankAccount1.setHolderName(holderName);
        return this;
    }

    /**
     * Bank account holder type
     */
    public BankAccount1Builder holderType(String holderType) {
        bankAccount1.setHolderType(holderType);
        return this;
    }

    /**
     * Bank account holder document
     */
    public BankAccount1Builder holderDocument(String holderDocument) {
        bankAccount1.setHolderDocument(holderDocument);
        return this;
    }

    /**
     * Bank
     */
    public BankAccount1Builder bank(String bank) {
        bankAccount1.setBank(bank);
        return this;
    }

    /**
     * Branch number
     */
    public BankAccount1Builder branchNumber(String branchNumber) {
        bankAccount1.setBranchNumber(branchNumber);
        return this;
    }

    /**
     * Branch check digit
     */
    public BankAccount1Builder branchCheckDigit(String branchCheckDigit) {
        bankAccount1.setBranchCheckDigit(branchCheckDigit);
        return this;
    }

    /**
     * Account number
     */
    public BankAccount1Builder accountNumber(String accountNumber) {
        bankAccount1.setAccountNumber(accountNumber);
        return this;
    }

    /**
     * Account check digit
     */
    public BankAccount1Builder accountCheckDigit(String accountCheckDigit) {
        bankAccount1.setAccountCheckDigit(accountCheckDigit);
        return this;
    }

    /**
     * Bank account type
     */
    public BankAccount1Builder type(String type) {
        bankAccount1.setType(type);
        return this;
    }

    /**
     * Metadata
     */
    public BankAccount1Builder metadata(LinkedHashMap<String, String> metadata) {
        bankAccount1.setMetadata(metadata);
        return this;
    }

    /**
     * Pix key
     */
    public BankAccount1Builder pixKey(String pixKey) {
        bankAccount1.setPixKey(pixKey);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BankAccount1 build() {
        return bankAccount1;
    }
}