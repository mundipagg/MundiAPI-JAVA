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
 * This is a model class for CreateCheckoutDebitCardPaymentRequest type.
 */
public class CreateCheckoutDebitCardPaymentRequest {
    private String statementDescriptor;
    private CreatePaymentAuthenticationRequest authentication;

    /**
     * Default constructor.
     */
    public CreateCheckoutDebitCardPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  authentication  CreatePaymentAuthenticationRequest value for authentication.
     * @param  statementDescriptor  String value for statementDescriptor.
     */
    public CreateCheckoutDebitCardPaymentRequest(
            CreatePaymentAuthenticationRequest authentication,
            String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        this.authentication = authentication;
    }

    /**
     * Getter for StatementDescriptor.
     * Card invoice text descriptor
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Card invoice text descriptor
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Authentication.
     * Creates payment authentication
     * @return Returns the CreatePaymentAuthenticationRequest
     */
    @JsonGetter("authentication")
    public CreatePaymentAuthenticationRequest getAuthentication() {
        return authentication;
    }

    /**
     * Setter for Authentication.
     * Creates payment authentication
     * @param authentication Value for CreatePaymentAuthenticationRequest
     */
    @JsonSetter("authentication")
    public void setAuthentication(CreatePaymentAuthenticationRequest authentication) {
        this.authentication = authentication;
    }

    /**
     * Converts this CreateCheckoutDebitCardPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCheckoutDebitCardPaymentRequest [" + "authentication=" + authentication
                + ", statementDescriptor=" + statementDescriptor + "]";
    }

    /**
     * Builds a new {@link CreateCheckoutDebitCardPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCheckoutDebitCardPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(authentication)
                .statementDescriptor(getStatementDescriptor());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCheckoutDebitCardPaymentRequest}.
     */
    public static class Builder {
        private CreatePaymentAuthenticationRequest authentication;
        private String statementDescriptor;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  authentication  CreatePaymentAuthenticationRequest value for authentication.
         */
        public Builder(CreatePaymentAuthenticationRequest authentication) {
            this.authentication = authentication;
        }

        /**
         * Setter for authentication.
         * @param  authentication  CreatePaymentAuthenticationRequest value for authentication.
         * @return Builder
         */
        public Builder authentication(CreatePaymentAuthenticationRequest authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
         * Builds a new {@link CreateCheckoutDebitCardPaymentRequest} object using the set fields.
         * @return {@link CreateCheckoutDebitCardPaymentRequest}
         */
        public CreateCheckoutDebitCardPaymentRequest build() {
            return new CreateCheckoutDebitCardPaymentRequest(authentication, statementDescriptor);
        }
    }
}
