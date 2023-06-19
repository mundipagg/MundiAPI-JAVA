/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class ChargesMetadataRequestBuilder {
    //the instance to build
    private ChargesMetadataRequest chargesMetadataRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ChargesMetadataRequestBuilder() {
        chargesMetadataRequest = new ChargesMetadataRequest();
    }

    /**
     * Metadata
     */
    public ChargesMetadataRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        chargesMetadataRequest.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ChargesMetadataRequest build() {
        return chargesMetadataRequest;
    }
}