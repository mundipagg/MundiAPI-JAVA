/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetPlanItemResponseBuilder {
    //the instance to build
    private GetPlanItemResponse getPlanItemResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetPlanItemResponseBuilder() {
        getPlanItemResponse = new GetPlanItemResponse();
    }

    public GetPlanItemResponseBuilder id(String id) {
        getPlanItemResponse.setId(id);
        return this;
    }

    public GetPlanItemResponseBuilder name(String name) {
        getPlanItemResponse.setName(name);
        return this;
    }

    public GetPlanItemResponseBuilder status(String status) {
        getPlanItemResponse.setStatus(status);
        return this;
    }

    public GetPlanItemResponseBuilder createdAt(DateTime createdAt) {
        getPlanItemResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetPlanItemResponseBuilder updatedAt(DateTime updatedAt) {
        getPlanItemResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public GetPlanItemResponseBuilder pricingScheme(PricingScheme pricingScheme) {
        getPlanItemResponse.setPricingScheme(pricingScheme);
        return this;
    }

    public GetPlanItemResponseBuilder description(String description) {
        getPlanItemResponse.setDescription(description);
        return this;
    }

    public GetPlanItemResponseBuilder plan(Plan plan) {
        getPlanItemResponse.setPlan(plan);
        return this;
    }

    public GetPlanItemResponseBuilder quantity(Integer quantity) {
        getPlanItemResponse.setQuantity(quantity);
        return this;
    }

    public GetPlanItemResponseBuilder cycles(Integer cycles) {
        getPlanItemResponse.setCycles(cycles);
        return this;
    }

    public GetPlanItemResponseBuilder deletedAt(DateTime deletedAt) {
        getPlanItemResponse.setDeletedAt(deletedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPlanItemResponse build() {
        return getPlanItemResponse;
    }
}