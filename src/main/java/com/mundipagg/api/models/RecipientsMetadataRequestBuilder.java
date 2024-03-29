/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class RecipientsMetadataRequestBuilder {
    //the instance to build
    private RecipientsMetadataRequest recipientsMetadataRequest;

    /**
     * Default constructor to initialize the instance
     */
    public RecipientsMetadataRequestBuilder() {
        recipientsMetadataRequest = new RecipientsMetadataRequest();
    }

    /**
     * Metadata
     */
    public RecipientsMetadataRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        recipientsMetadataRequest.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RecipientsMetadataRequest build() {
        return recipientsMetadataRequest;
    }
}