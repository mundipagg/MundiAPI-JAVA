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
 * This is a model class for GetAnticipationLimitsResponse type.
 */
public class GetAnticipationLimitsResponse {
    private GetAnticipationLimitResponse max;
    private GetAnticipationLimitResponse min;

    /**
     * Default constructor.
     */
    public GetAnticipationLimitsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  max  GetAnticipationLimitResponse value for max.
     * @param  min  GetAnticipationLimitResponse value for min.
     */
    public GetAnticipationLimitsResponse(
            GetAnticipationLimitResponse max,
            GetAnticipationLimitResponse min) {
        this.max = max;
        this.min = min;
    }

    /**
     * Getter for Max.
     * Max limit
     * @return Returns the GetAnticipationLimitResponse
     */
    @JsonGetter("max")
    public GetAnticipationLimitResponse getMax() {
        return max;
    }

    /**
     * Setter for Max.
     * Max limit
     * @param max Value for GetAnticipationLimitResponse
     */
    @JsonSetter("max")
    public void setMax(GetAnticipationLimitResponse max) {
        this.max = max;
    }

    /**
     * Getter for Min.
     * Min limit
     * @return Returns the GetAnticipationLimitResponse
     */
    @JsonGetter("min")
    public GetAnticipationLimitResponse getMin() {
        return min;
    }

    /**
     * Setter for Min.
     * Min limit
     * @param min Value for GetAnticipationLimitResponse
     */
    @JsonSetter("min")
    public void setMin(GetAnticipationLimitResponse min) {
        this.min = min;
    }

    /**
     * Converts this GetAnticipationLimitsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAnticipationLimitsResponse [" + "max=" + max + ", min=" + min + "]";
    }

    /**
     * Builds a new {@link GetAnticipationLimitsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAnticipationLimitsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(max, min);
        return builder;
    }

    /**
     * Class to build instances of {@link GetAnticipationLimitsResponse}.
     */
    public static class Builder {
        private GetAnticipationLimitResponse max;
        private GetAnticipationLimitResponse min;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  max  GetAnticipationLimitResponse value for max.
         * @param  min  GetAnticipationLimitResponse value for min.
         */
        public Builder(GetAnticipationLimitResponse max, GetAnticipationLimitResponse min) {
            this.max = max;
            this.min = min;
        }

        /**
         * Setter for max.
         * @param  max  GetAnticipationLimitResponse value for max.
         * @return Builder
         */
        public Builder max(GetAnticipationLimitResponse max) {
            this.max = max;
            return this;
        }

        /**
         * Setter for min.
         * @param  min  GetAnticipationLimitResponse value for min.
         * @return Builder
         */
        public Builder min(GetAnticipationLimitResponse min) {
            this.min = min;
            return this;
        }

        /**
         * Builds a new {@link GetAnticipationLimitsResponse} object using the set fields.
         * @return {@link GetAnticipationLimitsResponse}
         */
        public GetAnticipationLimitsResponse build() {
            return new GetAnticipationLimitsResponse(max, min);
        }
    }
}
