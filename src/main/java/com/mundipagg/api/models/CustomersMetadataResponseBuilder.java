/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class CustomersMetadataResponseBuilder {
    //the instance to build
    private CustomersMetadataResponse customersMetadataResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CustomersMetadataResponseBuilder() {
        customersMetadataResponse = new CustomersMetadataResponse();
    }

    public CustomersMetadataResponseBuilder id(String id) {
        customersMetadataResponse.setId(id);
        return this;
    }

    public CustomersMetadataResponseBuilder name(String name) {
        customersMetadataResponse.setName(name);
        return this;
    }

    public CustomersMetadataResponseBuilder email(String email) {
        customersMetadataResponse.setEmail(email);
        return this;
    }

    public CustomersMetadataResponseBuilder delinquent(boolean delinquent) {
        customersMetadataResponse.setDelinquent(delinquent);
        return this;
    }

    public CustomersMetadataResponseBuilder createdAt(DateTime createdAt) {
        customersMetadataResponse.setCreatedAt(createdAt);
        return this;
    }

    public CustomersMetadataResponseBuilder updatedAt(DateTime updatedAt) {
        customersMetadataResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public CustomersMetadataResponseBuilder document(String document) {
        customersMetadataResponse.setDocument(document);
        return this;
    }

    public CustomersMetadataResponseBuilder type(String type) {
        customersMetadataResponse.setType(type);
        return this;
    }

    public CustomersMetadataResponseBuilder fbAccessToken(String fbAccessToken) {
        customersMetadataResponse.setFbAccessToken(fbAccessToken);
        return this;
    }

    public CustomersMetadataResponseBuilder address(Address address) {
        customersMetadataResponse.setAddress(address);
        return this;
    }

    public CustomersMetadataResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        customersMetadataResponse.setMetadata(metadata);
        return this;
    }

    public CustomersMetadataResponseBuilder phones(GetPhonesResponse phones) {
        customersMetadataResponse.setPhones(phones);
        return this;
    }

    public CustomersMetadataResponseBuilder fbId(Long fbId) {
        customersMetadataResponse.setFbId(fbId);
        return this;
    }

    /**
     * Código de referência do cliente no sistema da loja. Max: 52 caracteres
     */
    public CustomersMetadataResponseBuilder code(String code) {
        customersMetadataResponse.setCode(code);
        return this;
    }

    public CustomersMetadataResponseBuilder documentType(String documentType) {
        customersMetadataResponse.setDocumentType(documentType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CustomersMetadataResponse build() {
        return customersMetadataResponse;
    }
}