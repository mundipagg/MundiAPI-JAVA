/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CustomersRequest1Builder {
    //the instance to build
    private CustomersRequest1 customersRequest1;

    /**
     * Default constructor to initialize the instance
     */
    public CustomersRequest1Builder() {
        customersRequest1 = new CustomersRequest1();
    }

    /**
     * Name
     */
    public CustomersRequest1Builder name(String name) {
        customersRequest1.setName(name);
        return this;
    }

    /**
     * Email
     */
    public CustomersRequest1Builder email(String email) {
        customersRequest1.setEmail(email);
        return this;
    }

    /**
     * Document number. Only numbers, no special characters.
     */
    public CustomersRequest1Builder document(String document) {
        customersRequest1.setDocument(document);
        return this;
    }

    /**
     * Person type. Can be either 'individual' or 'company'
     */
    public CustomersRequest1Builder type(String type) {
        customersRequest1.setType(type);
        return this;
    }

    public CustomersRequest1Builder address(Address1 address) {
        customersRequest1.setAddress(address);
        return this;
    }

    /**
     * Metadata
     */
    public CustomersRequest1Builder metadata(LinkedHashMap<String, String> metadata) {
        customersRequest1.setMetadata(metadata);
        return this;
    }

    public CustomersRequest1Builder phones(CreatePhonesRequest phones) {
        customersRequest1.setPhones(phones);
        return this;
    }

    /**
     * Customer code
     */
    public CustomersRequest1Builder code(String code) {
        customersRequest1.setCode(code);
        return this;
    }

    /**
     * Customer Gender
     */
    public CustomersRequest1Builder gender(String gender) {
        customersRequest1.setGender(gender);
        return this;
    }

    public CustomersRequest1Builder documentType(String documentType) {
        customersRequest1.setDocumentType(documentType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CustomersRequest1 build() {
        return customersRequest1;
    }
}