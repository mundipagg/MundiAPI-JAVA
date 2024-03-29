/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class LocationBuilder {
    //the instance to build
    private Location location;

    /**
     * Default constructor to initialize the instance
     */
    public LocationBuilder() {
        location = new Location();
    }

    /**
     * Latitude
     */
    public LocationBuilder latitude(String latitude) {
        location.setLatitude(latitude);
        return this;
    }

    /**
     * Longitude
     */
    public LocationBuilder longitude(String longitude) {
        location.setLongitude(longitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Location build() {
        return location;
    }
}