/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GooglePayBuilder {
    //the instance to build
    private GooglePay googlePay;

    /**
     * Default constructor to initialize the instance
     */
    public GooglePayBuilder() {
        googlePay = new GooglePay();
    }

    /**
     * The token version
     */
    public GooglePayBuilder version(String version) {
        googlePay.setVersion(version);
        return this;
    }

    /**
     * The cryptography data
     */
    public GooglePayBuilder data(String data) {
        googlePay.setData(data);
        return this;
    }

    public GooglePayBuilder header(Header1 header) {
        googlePay.setHeader(header);
        return this;
    }

    /**
     * Detached PKCS #7 signature, Base64 encoded as string
     */
    public GooglePayBuilder signature(String signature) {
        googlePay.setSignature(signature);
        return this;
    }

    /**
     * GooglePay Merchant identifier
     */
    public GooglePayBuilder merchantIdentifier(String merchantIdentifier) {
        googlePay.setMerchantIdentifier(merchantIdentifier);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GooglePay build() {
        return googlePay;
    }
}