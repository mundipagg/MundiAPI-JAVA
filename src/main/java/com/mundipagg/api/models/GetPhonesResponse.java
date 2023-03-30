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
 * This is a model class for GetPhonesResponse type.
 */
public class GetPhonesResponse {
    private GetPhoneResponse homePhone;
    private GetPhoneResponse mobilePhone;

    /**
     * Default constructor.
     */
    public GetPhonesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  homePhone  GetPhoneResponse value for homePhone.
     * @param  mobilePhone  GetPhoneResponse value for mobilePhone.
     */
    public GetPhonesResponse(
            GetPhoneResponse homePhone,
            GetPhoneResponse mobilePhone) {
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
    }

    /**
     * Getter for HomePhone.
     * @return Returns the GetPhoneResponse
     */
    @JsonGetter("home_phone")
    public GetPhoneResponse getHomePhone() {
        return homePhone;
    }

    /**
     * Setter for HomePhone.
     * @param homePhone Value for GetPhoneResponse
     */
    @JsonSetter("home_phone")
    public void setHomePhone(GetPhoneResponse homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * Getter for MobilePhone.
     * @return Returns the GetPhoneResponse
     */
    @JsonGetter("mobile_phone")
    public GetPhoneResponse getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Setter for MobilePhone.
     * @param mobilePhone Value for GetPhoneResponse
     */
    @JsonSetter("mobile_phone")
    public void setMobilePhone(GetPhoneResponse mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * Converts this GetPhonesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPhonesResponse [" + "homePhone=" + homePhone + ", mobilePhone=" + mobilePhone
                + "]";
    }

    /**
     * Builds a new {@link GetPhonesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPhonesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(homePhone, mobilePhone);
        return builder;
    }

    /**
     * Class to build instances of {@link GetPhonesResponse}.
     */
    public static class Builder {
        private GetPhoneResponse homePhone;
        private GetPhoneResponse mobilePhone;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  homePhone  GetPhoneResponse value for homePhone.
         * @param  mobilePhone  GetPhoneResponse value for mobilePhone.
         */
        public Builder(GetPhoneResponse homePhone, GetPhoneResponse mobilePhone) {
            this.homePhone = homePhone;
            this.mobilePhone = mobilePhone;
        }

        /**
         * Setter for homePhone.
         * @param  homePhone  GetPhoneResponse value for homePhone.
         * @return Builder
         */
        public Builder homePhone(GetPhoneResponse homePhone) {
            this.homePhone = homePhone;
            return this;
        }

        /**
         * Setter for mobilePhone.
         * @param  mobilePhone  GetPhoneResponse value for mobilePhone.
         * @return Builder
         */
        public Builder mobilePhone(GetPhoneResponse mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        /**
         * Builds a new {@link GetPhonesResponse} object using the set fields.
         * @return {@link GetPhonesResponse}
         */
        public GetPhonesResponse build() {
            return new GetPhonesResponse(homePhone, mobilePhone);
        }
    }
}
