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
 * This is a model class for GetAntifraudResponse type.
 */
public class GetAntifraudResponse {
    private String status;
    private String returnCode;
    private String returnMessage;
    private String providerName;
    private String score;

    /**
     * Default constructor.
     */
    public GetAntifraudResponse() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  returnCode  String value for returnCode.
     * @param  returnMessage  String value for returnMessage.
     * @param  providerName  String value for providerName.
     * @param  score  String value for score.
     */
    public GetAntifraudResponse(
            String status,
            String returnCode,
            String returnMessage,
            String providerName,
            String score) {
        this.status = status;
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
        this.providerName = providerName;
        this.score = score;
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
     * Getter for ReturnCode.
     * @return Returns the String
     */
    @JsonGetter("return_code")
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Setter for ReturnCode.
     * @param returnCode Value for String
     */
    @JsonSetter("return_code")
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * Getter for ReturnMessage.
     * @return Returns the String
     */
    @JsonGetter("return_message")
    public String getReturnMessage() {
        return returnMessage;
    }

    /**
     * Setter for ReturnMessage.
     * @param returnMessage Value for String
     */
    @JsonSetter("return_message")
    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    /**
     * Getter for ProviderName.
     * @return Returns the String
     */
    @JsonGetter("provider_name")
    public String getProviderName() {
        return providerName;
    }

    /**
     * Setter for ProviderName.
     * @param providerName Value for String
     */
    @JsonSetter("provider_name")
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Getter for Score.
     * @return Returns the String
     */
    @JsonGetter("score")
    public String getScore() {
        return score;
    }

    /**
     * Setter for Score.
     * @param score Value for String
     */
    @JsonSetter("score")
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * Converts this GetAntifraudResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAntifraudResponse [" + "status=" + status + ", returnCode=" + returnCode
                + ", returnMessage=" + returnMessage + ", providerName=" + providerName + ", score="
                + score + "]";
    }

    /**
     * Builds a new {@link GetAntifraudResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAntifraudResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(status, returnCode, returnMessage, providerName, score);
        return builder;
    }

    /**
     * Class to build instances of {@link GetAntifraudResponse}.
     */
    public static class Builder {
        private String status;
        private String returnCode;
        private String returnMessage;
        private String providerName;
        private String score;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  status  String value for status.
         * @param  returnCode  String value for returnCode.
         * @param  returnMessage  String value for returnMessage.
         * @param  providerName  String value for providerName.
         * @param  score  String value for score.
         */
        public Builder(String status, String returnCode, String returnMessage, String providerName,
                String score) {
            this.status = status;
            this.returnCode = returnCode;
            this.returnMessage = returnMessage;
            this.providerName = providerName;
            this.score = score;
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
         * Setter for returnCode.
         * @param  returnCode  String value for returnCode.
         * @return Builder
         */
        public Builder returnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }

        /**
         * Setter for returnMessage.
         * @param  returnMessage  String value for returnMessage.
         * @return Builder
         */
        public Builder returnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }

        /**
         * Setter for providerName.
         * @param  providerName  String value for providerName.
         * @return Builder
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            return this;
        }

        /**
         * Setter for score.
         * @param  score  String value for score.
         * @return Builder
         */
        public Builder score(String score) {
            this.score = score;
            return this;
        }

        /**
         * Builds a new {@link GetAntifraudResponse} object using the set fields.
         * @return {@link GetAntifraudResponse}
         */
        public GetAntifraudResponse build() {
            return new GetAntifraudResponse(status, returnCode, returnMessage, providerName, score);
        }
    }
}
