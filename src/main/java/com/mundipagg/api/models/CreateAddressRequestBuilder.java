/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateAddressRequestBuilder {
    //the instance to build
    private CreateAddressRequest createAddressRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateAddressRequestBuilder() {
        createAddressRequest = new CreateAddressRequest();
    }

    /**
     * Street
     */
    public CreateAddressRequestBuilder street(String street) {
        createAddressRequest.setStreet(street);
        return this;
    }

    /**
     * Number
     */
    public CreateAddressRequestBuilder number(String number) {
        createAddressRequest.setNumber(number);
        return this;
    }

    /**
     * The zip code containing only numbers. No special characters or spaces.
     */
    public CreateAddressRequestBuilder zipCode(String zipCode) {
        createAddressRequest.setZipCode(zipCode);
        return this;
    }

    /**
     * Neighborhood
     */
    public CreateAddressRequestBuilder neighborhood(String neighborhood) {
        createAddressRequest.setNeighborhood(neighborhood);
        return this;
    }

    /**
     * City
     */
    public CreateAddressRequestBuilder city(String city) {
        createAddressRequest.setCity(city);
        return this;
    }

    /**
     * State
     */
    public CreateAddressRequestBuilder state(String state) {
        createAddressRequest.setState(state);
        return this;
    }

    /**
     * Country. Must be entered using ISO 3166-1 alpha-2 format. See https://pt.wikipedia.org/wiki/ISO_3166-1_alfa-2
     */
    public CreateAddressRequestBuilder country(String country) {
        createAddressRequest.setCountry(country);
        return this;
    }

    /**
     * Complement
     */
    public CreateAddressRequestBuilder complement(String complement) {
        createAddressRequest.setComplement(complement);
        return this;
    }

    /**
     * Metadata
     */
    public CreateAddressRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createAddressRequest.setMetadata(metadata);
        return this;
    }

    /**
     * Line 1 for address
     */
    public CreateAddressRequestBuilder line1(String line1) {
        createAddressRequest.setLine1(line1);
        return this;
    }

    /**
     * Line 2 for address
     */
    public CreateAddressRequestBuilder line2(String line2) {
        createAddressRequest.setLine2(line2);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateAddressRequest build() {
        return createAddressRequest;
    }
}