/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class Billingaddress3Builder {
    //the instance to build
    private Billingaddress3 billingaddress3;

    /**
     * Default constructor to initialize the instance
     */
    public Billingaddress3Builder() {
        billingaddress3 = new Billingaddress3();
    }

    public Billingaddress3Builder id(String id) {
        billingaddress3.setId(id);
        return this;
    }

    public Billingaddress3Builder street(String street) {
        billingaddress3.setStreet(street);
        return this;
    }

    public Billingaddress3Builder number(String number) {
        billingaddress3.setNumber(number);
        return this;
    }

    public Billingaddress3Builder complement(String complement) {
        billingaddress3.setComplement(complement);
        return this;
    }

    public Billingaddress3Builder zipCode(String zipCode) {
        billingaddress3.setZipCode(zipCode);
        return this;
    }

    public Billingaddress3Builder neighborhood(String neighborhood) {
        billingaddress3.setNeighborhood(neighborhood);
        return this;
    }

    public Billingaddress3Builder city(String city) {
        billingaddress3.setCity(city);
        return this;
    }

    public Billingaddress3Builder state(String state) {
        billingaddress3.setState(state);
        return this;
    }

    public Billingaddress3Builder country(String country) {
        billingaddress3.setCountry(country);
        return this;
    }

    public Billingaddress3Builder status(String status) {
        billingaddress3.setStatus(status);
        return this;
    }

    public Billingaddress3Builder createdAt(DateTime createdAt) {
        billingaddress3.setCreatedAt(createdAt);
        return this;
    }

    public Billingaddress3Builder updatedAt(DateTime updatedAt) {
        billingaddress3.setUpdatedAt(updatedAt);
        return this;
    }

    public Billingaddress3Builder customer(Customer customer) {
        billingaddress3.setCustomer(customer);
        return this;
    }

    public Billingaddress3Builder metadata(LinkedHashMap<String, String> metadata) {
        billingaddress3.setMetadata(metadata);
        return this;
    }

    /**
     * Line 1 for address
     */
    public Billingaddress3Builder line1(String line1) {
        billingaddress3.setLine1(line1);
        return this;
    }

    /**
     * Line 2 for address
     */
    public Billingaddress3Builder line2(String line2) {
        billingaddress3.setLine2(line2);
        return this;
    }

    public Billingaddress3Builder deletedAt(DateTime deletedAt) {
        billingaddress3.setDeletedAt(deletedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Billingaddress3 build() {
        return billingaddress3;
    }
}