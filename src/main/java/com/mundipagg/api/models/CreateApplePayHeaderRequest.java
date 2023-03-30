/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateApplePayHeaderRequest type.
 */
public class CreateApplePayHeaderRequest {
    private String publicKeyHash;
    private String ephemeralPublicKey;
    private String transactionId;

    /**
     * Default constructor.
     */
    public CreateApplePayHeaderRequest() {
    }

    /**
     * Initialization constructor.
     * @param  ephemeralPublicKey  String value for ephemeralPublicKey.
     * @param  publicKeyHash  String value for publicKeyHash.
     * @param  transactionId  String value for transactionId.
     */
    public CreateApplePayHeaderRequest(
            String ephemeralPublicKey,
            String publicKeyHash,
            String transactionId) {
        this.publicKeyHash = publicKeyHash;
        this.ephemeralPublicKey = ephemeralPublicKey;
        this.transactionId = transactionId;
    }

    /**
     * Getter for PublicKeyHash.
     * SHA–256 hash, Base64 string codified
     * @return Returns the String
     */
    @JsonGetter("public_key_hash")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPublicKeyHash() {
        return publicKeyHash;
    }

    /**
     * Setter for PublicKeyHash.
     * SHA–256 hash, Base64 string codified
     * @param publicKeyHash Value for String
     */
    @JsonSetter("public_key_hash")
    public void setPublicKeyHash(String publicKeyHash) {
        this.publicKeyHash = publicKeyHash;
    }

    /**
     * Getter for EphemeralPublicKey.
     * X.509 encoded key bytes, Base64 encoded as a string
     * @return Returns the String
     */
    @JsonGetter("ephemeral_public_key")
    public String getEphemeralPublicKey() {
        return ephemeralPublicKey;
    }

    /**
     * Setter for EphemeralPublicKey.
     * X.509 encoded key bytes, Base64 encoded as a string
     * @param ephemeralPublicKey Value for String
     */
    @JsonSetter("ephemeral_public_key")
    public void setEphemeralPublicKey(String ephemeralPublicKey) {
        this.ephemeralPublicKey = ephemeralPublicKey;
    }

    /**
     * Getter for TransactionId.
     * Transaction identifier, generated on Device
     * @return Returns the String
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * Transaction identifier, generated on Device
     * @param transactionId Value for String
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Converts this CreateApplePayHeaderRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateApplePayHeaderRequest [" + "ephemeralPublicKey=" + ephemeralPublicKey
                + ", publicKeyHash=" + publicKeyHash + ", transactionId=" + transactionId + "]";
    }

    /**
     * Builds a new {@link CreateApplePayHeaderRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateApplePayHeaderRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ephemeralPublicKey)
                .publicKeyHash(getPublicKeyHash())
                .transactionId(getTransactionId());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateApplePayHeaderRequest}.
     */
    public static class Builder {
        private String ephemeralPublicKey;
        private String publicKeyHash;
        private String transactionId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ephemeralPublicKey  String value for ephemeralPublicKey.
         */
        public Builder(String ephemeralPublicKey) {
            this.ephemeralPublicKey = ephemeralPublicKey;
        }

        /**
         * Setter for ephemeralPublicKey.
         * @param  ephemeralPublicKey  String value for ephemeralPublicKey.
         * @return Builder
         */
        public Builder ephemeralPublicKey(String ephemeralPublicKey) {
            this.ephemeralPublicKey = ephemeralPublicKey;
            return this;
        }

        /**
         * Setter for publicKeyHash.
         * @param  publicKeyHash  String value for publicKeyHash.
         * @return Builder
         */
        public Builder publicKeyHash(String publicKeyHash) {
            this.publicKeyHash = publicKeyHash;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  String value for transactionId.
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Builds a new {@link CreateApplePayHeaderRequest} object using the set fields.
         * @return {@link CreateApplePayHeaderRequest}
         */
        public CreateApplePayHeaderRequest build() {
            return new CreateApplePayHeaderRequest(ephemeralPublicKey, publicKeyHash,
                    transactionId);
        }
    }
}
