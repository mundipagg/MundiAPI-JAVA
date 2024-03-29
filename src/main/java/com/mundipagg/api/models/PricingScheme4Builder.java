/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class PricingScheme4Builder {
    //the instance to build
    private PricingScheme4 pricingScheme4;

    /**
     * Default constructor to initialize the instance
     */
    public PricingScheme4Builder() {
        pricingScheme4 = new PricingScheme4();
    }

    /**
     * Scheme type
     */
    public PricingScheme4Builder schemeType(String schemeType) {
        pricingScheme4.setSchemeType(schemeType);
        return this;
    }

    /**
     * Price brackets
     */
    public PricingScheme4Builder priceBrackets(List<CreatePriceBracketRequest> priceBrackets) {
        pricingScheme4.setPriceBrackets(priceBrackets);
        return this;
    }

    /**
     * Price
     */
    public PricingScheme4Builder price(Integer price) {
        pricingScheme4.setPrice(price);
        return this;
    }

    /**
     * Minimum price
     */
    public PricingScheme4Builder minimumPrice(Integer minimumPrice) {
        pricingScheme4.setMinimumPrice(minimumPrice);
        return this;
    }

    /**
     * percentual value used in pricing_scheme Percent
     */
    public PricingScheme4Builder percentage(Double percentage) {
        pricingScheme4.setPercentage(percentage);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PricingScheme4 build() {
        return pricingScheme4;
    }
}