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
 * This is a model class for GetSetupResponse type.
 */
public class GetSetupResponse {
    private String id;
    private String description;
    private int amount;
    private String status;

    /**
     * Default constructor.
     */
    public GetSetupResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  description  String value for description.
     * @param  amount  int value for amount.
     * @param  status  String value for status.
     */
    public GetSetupResponse(
            String id,
            String description,
            int amount,
            String status) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.status = status;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Amount.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this GetSetupResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSetupResponse [" + "id=" + id + ", description=" + description + ", amount="
                + amount + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link GetSetupResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSetupResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, description, amount, status);
        return builder;
    }

    /**
     * Class to build instances of {@link GetSetupResponse}.
     */
    public static class Builder {
        private String id;
        private String description;
        private int amount;
        private String status;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  description  String value for description.
         * @param  amount  int value for amount.
         * @param  status  String value for status.
         */
        public Builder(String id, String description, int amount, String status) {
            this.id = id;
            this.description = description;
            this.amount = amount;
            this.status = status;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link GetSetupResponse} object using the set fields.
         * @return {@link GetSetupResponse}
         */
        public GetSetupResponse build() {
            return new GetSetupResponse(id, description, amount, status);
        }
    }
}
