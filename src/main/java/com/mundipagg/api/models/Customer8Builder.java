/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class Customer8Builder {
    //the instance to build
    private Customer8 customer8;

    /**
     * Default constructor to initialize the instance
     */
    public Customer8Builder() {
        customer8 = new Customer8();
    }

    /**
     * Name
     */
    public Customer8Builder name(String name) {
        customer8.setName(name);
        return this;
    }

    /**
     * Email
     */
    public Customer8Builder email(String email) {
        customer8.setEmail(email);
        return this;
    }

    /**
     * Document number. Only numbers, no special characters.
     */
    public Customer8Builder document(String document) {
        customer8.setDocument(document);
        return this;
    }

    /**
     * Person type. Can be either 'individual' or 'company'
     */
    public Customer8Builder type(String type) {
        customer8.setType(type);
        return this;
    }

    public Customer8Builder address(Address1 address) {
        customer8.setAddress(address);
        return this;
    }

    /**
     * Metadata
     */
    public Customer8Builder metadata(LinkedHashMap<String, String> metadata) {
        customer8.setMetadata(metadata);
        return this;
    }

    public Customer8Builder phones(CreatePhonesRequest phones) {
        customer8.setPhones(phones);
        return this;
    }

    /**
     * Customer code
     */
    public Customer8Builder code(String code) {
        customer8.setCode(code);
        return this;
    }

    /**
     * Customer Gender
     */
    public Customer8Builder gender(String gender) {
        customer8.setGender(gender);
        return this;
    }

    public Customer8Builder documentType(String documentType) {
        customer8.setDocumentType(documentType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Customer8 build() {
        return customer8;
    }
}