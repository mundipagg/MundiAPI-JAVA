/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class CustomersCardsResponseBuilder {
    //the instance to build
    private CustomersCardsResponse customersCardsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CustomersCardsResponseBuilder() {
        customersCardsResponse = new CustomersCardsResponse();
    }

    public CustomersCardsResponseBuilder id(String id) {
        customersCardsResponse.setId(id);
        return this;
    }

    public CustomersCardsResponseBuilder lastFourDigits(String lastFourDigits) {
        customersCardsResponse.setLastFourDigits(lastFourDigits);
        return this;
    }

    public CustomersCardsResponseBuilder brand(String brand) {
        customersCardsResponse.setBrand(brand);
        return this;
    }

    public CustomersCardsResponseBuilder holderName(String holderName) {
        customersCardsResponse.setHolderName(holderName);
        return this;
    }

    public CustomersCardsResponseBuilder expMonth(int expMonth) {
        customersCardsResponse.setExpMonth(expMonth);
        return this;
    }

    public CustomersCardsResponseBuilder expYear(int expYear) {
        customersCardsResponse.setExpYear(expYear);
        return this;
    }

    public CustomersCardsResponseBuilder status(String status) {
        customersCardsResponse.setStatus(status);
        return this;
    }

    public CustomersCardsResponseBuilder createdAt(DateTime createdAt) {
        customersCardsResponse.setCreatedAt(createdAt);
        return this;
    }

    public CustomersCardsResponseBuilder updatedAt(DateTime updatedAt) {
        customersCardsResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public CustomersCardsResponseBuilder billingAddress(BillingAddress billingAddress) {
        customersCardsResponse.setBillingAddress(billingAddress);
        return this;
    }

    public CustomersCardsResponseBuilder customer(Customer customer) {
        customersCardsResponse.setCustomer(customer);
        return this;
    }

    public CustomersCardsResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        customersCardsResponse.setMetadata(metadata);
        return this;
    }

    /**
     * Card type
     */
    public CustomersCardsResponseBuilder type(String type) {
        customersCardsResponse.setType(type);
        return this;
    }

    /**
     * Document number for the card's holder
     */
    public CustomersCardsResponseBuilder holderDocument(String holderDocument) {
        customersCardsResponse.setHolderDocument(holderDocument);
        return this;
    }

    public CustomersCardsResponseBuilder deletedAt(DateTime deletedAt) {
        customersCardsResponse.setDeletedAt(deletedAt);
        return this;
    }

    /**
     * First six digits
     */
    public CustomersCardsResponseBuilder firstSixDigits(String firstSixDigits) {
        customersCardsResponse.setFirstSixDigits(firstSixDigits);
        return this;
    }

    public CustomersCardsResponseBuilder label(String label) {
        customersCardsResponse.setLabel(label);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CustomersCardsResponse build() {
        return customersCardsResponse;
    }
}