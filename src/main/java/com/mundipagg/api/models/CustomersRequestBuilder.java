/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CustomersRequestBuilder {
    //the instance to build
    private CustomersRequest customersRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CustomersRequestBuilder() {
        customersRequest = new CustomersRequest();
    }

    /**
     * Name
     */
    public CustomersRequestBuilder name(String name) {
        customersRequest.setName(name);
        return this;
    }

    /**
     * Email
     */
    public CustomersRequestBuilder email(String email) {
        customersRequest.setEmail(email);
        return this;
    }

    /**
     * Document number
     */
    public CustomersRequestBuilder document(String document) {
        customersRequest.setDocument(document);
        return this;
    }

    /**
     * Person type
     */
    public CustomersRequestBuilder type(String type) {
        customersRequest.setType(type);
        return this;
    }

    public CustomersRequestBuilder address(Address1 address) {
        customersRequest.setAddress(address);
        return this;
    }

    /**
     * Metadata
     */
    public CustomersRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        customersRequest.setMetadata(metadata);
        return this;
    }

    public CustomersRequestBuilder phones(CreatePhonesRequest phones) {
        customersRequest.setPhones(phones);
        return this;
    }

    /**
     * Código de referência do cliente no sistema da loja. Max: 52 caracteres
     */
    public CustomersRequestBuilder code(String code) {
        customersRequest.setCode(code);
        return this;
    }

    /**
     * Gênero do cliente
     */
    public CustomersRequestBuilder gender(String gender) {
        customersRequest.setGender(gender);
        return this;
    }

    public CustomersRequestBuilder documentType(String documentType) {
        customersRequest.setDocumentType(documentType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CustomersRequest build() {
        return customersRequest;
    }
}