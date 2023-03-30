/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateBankTransferPaymentRequest type.
 */
public class CreateBankTransferPaymentRequest {
    private String bank;
    private int retries;

    /**
     * Default constructor.
     */
    public CreateBankTransferPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  bank  String value for bank.
     * @param  retries  int value for retries.
     */
    public CreateBankTransferPaymentRequest(
            String bank,
            int retries) {
        this.bank = bank;
        this.retries = retries;
    }

    /**
     * Getter for Bank.
     * Bank
     * @return Returns the String
     */
    @JsonGetter("bank")
    public String getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * Bank
     * @param bank Value for String
     */
    @JsonSetter("bank")
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * Getter for Retries.
     * Number of retries
     * @return Returns the int
     */
    @JsonGetter("retries")
    public int getRetries() {
        return retries;
    }

    /**
     * Setter for Retries.
     * Number of retries
     * @param retries Value for int
     */
    @JsonSetter("retries")
    public void setRetries(int retries) {
        this.retries = retries;
    }

    /**
     * Converts this CreateBankTransferPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateBankTransferPaymentRequest [" + "bank=" + bank + ", retries=" + retries + "]";
    }

    /**
     * Builds a new {@link CreateBankTransferPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateBankTransferPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bank, retries);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateBankTransferPaymentRequest}.
     */
    public static class Builder {
        private String bank;
        private int retries;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bank  String value for bank.
         * @param  retries  int value for retries.
         */
        public Builder(String bank, int retries) {
            this.bank = bank;
            this.retries = retries;
        }

        /**
         * Setter for bank.
         * @param  bank  String value for bank.
         * @return Builder
         */
        public Builder bank(String bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Setter for retries.
         * @param  retries  int value for retries.
         * @return Builder
         */
        public Builder retries(int retries) {
            this.retries = retries;
            return this;
        }

        /**
         * Builds a new {@link CreateBankTransferPaymentRequest} object using the set fields.
         * @return {@link CreateBankTransferPaymentRequest}
         */
        public CreateBankTransferPaymentRequest build() {
            return new CreateBankTransferPaymentRequest(bank, retries);
        }
    }
}
