/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetPixBankAccountResponseBuilder {
    //the instance to build
    private GetPixBankAccountResponse getPixBankAccountResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetPixBankAccountResponseBuilder() {
        getPixBankAccountResponse = new GetPixBankAccountResponse();
    }

    public GetPixBankAccountResponseBuilder bankName(String bankName) {
        getPixBankAccountResponse.setBankName(bankName);
        return this;
    }

    public GetPixBankAccountResponseBuilder ispb(String ispb) {
        getPixBankAccountResponse.setIspb(ispb);
        return this;
    }

    public GetPixBankAccountResponseBuilder branchCode(String branchCode) {
        getPixBankAccountResponse.setBranchCode(branchCode);
        return this;
    }

    public GetPixBankAccountResponseBuilder accountNumber(String accountNumber) {
        getPixBankAccountResponse.setAccountNumber(accountNumber);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPixBankAccountResponse build() {
        return getPixBankAccountResponse;
    }
}