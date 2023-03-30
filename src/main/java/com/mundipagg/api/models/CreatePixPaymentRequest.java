/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mundipagg.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for CreatePixPaymentRequest type.
 */
public class CreatePixPaymentRequest {
    private LocalDateTime expiresAt;
    private Integer expiresIn;
    private List<PixAdditionalInformation> additionalInformation;

    /**
     * Default constructor.
     */
    public CreatePixPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  expiresAt  LocalDateTime value for expiresAt.
     * @param  expiresIn  Integer value for expiresIn.
     * @param  additionalInformation  List of PixAdditionalInformation value for
     *         additionalInformation.
     */
    public CreatePixPaymentRequest(
            LocalDateTime expiresAt,
            Integer expiresIn,
            List<PixAdditionalInformation> additionalInformation) {
        this.expiresAt = expiresAt;
        this.expiresIn = expiresIn;
        this.additionalInformation = additionalInformation;
    }

    /**
     * Getter for ExpiresAt.
     * Datetime when pix payment will expire
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * Datetime when pix payment will expire
     * @param expiresAt Value for LocalDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for ExpiresIn.
     * Seconds until pix payment expires
     * @return Returns the Integer
     */
    @JsonGetter("expires_in")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * Setter for ExpiresIn.
     * Seconds until pix payment expires
     * @param expiresIn Value for Integer
     */
    @JsonSetter("expires_in")
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * Getter for AdditionalInformation.
     * Pix additional information
     * @return Returns the List of PixAdditionalInformation
     */
    @JsonGetter("additional_information")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PixAdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Setter for AdditionalInformation.
     * Pix additional information
     * @param additionalInformation Value for List of PixAdditionalInformation
     */
    @JsonSetter("additional_information")
    public void setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * Converts this CreatePixPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePixPaymentRequest [" + "expiresAt=" + expiresAt + ", expiresIn=" + expiresIn
                + ", additionalInformation=" + additionalInformation + "]";
    }

    /**
     * Builds a new {@link CreatePixPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePixPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .expiresAt(getExpiresAt())
                .expiresIn(getExpiresIn())
                .additionalInformation(getAdditionalInformation());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePixPaymentRequest}.
     */
    public static class Builder {
        private LocalDateTime expiresAt;
        private Integer expiresIn;
        private List<PixAdditionalInformation> additionalInformation;



        /**
         * Setter for expiresAt.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for expiresIn.
         * @param  expiresIn  Integer value for expiresIn.
         * @return Builder
         */
        public Builder expiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * Setter for additionalInformation.
         * @param  additionalInformation  List of PixAdditionalInformation value for
         *         additionalInformation.
         * @return Builder
         */
        public Builder additionalInformation(
                List<PixAdditionalInformation> additionalInformation) {
            this.additionalInformation = additionalInformation;
            return this;
        }

        /**
         * Builds a new {@link CreatePixPaymentRequest} object using the set fields.
         * @return {@link CreatePixPaymentRequest}
         */
        public CreatePixPaymentRequest build() {
            return new CreatePixPaymentRequest(expiresAt, expiresIn, additionalInformation);
        }
    }
}
