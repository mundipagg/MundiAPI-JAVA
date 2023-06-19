/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class SubscriptionsItemsUsagesResponseBuilder {
    //the instance to build
    private SubscriptionsItemsUsagesResponse subscriptionsItemsUsagesResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionsItemsUsagesResponseBuilder() {
        subscriptionsItemsUsagesResponse = new SubscriptionsItemsUsagesResponse();
    }

    /**
     * Id
     */
    public SubscriptionsItemsUsagesResponseBuilder id(String id) {
        subscriptionsItemsUsagesResponse.setId(id);
        return this;
    }

    /**
     * Quantity
     */
    public SubscriptionsItemsUsagesResponseBuilder quantity(int quantity) {
        subscriptionsItemsUsagesResponse.setQuantity(quantity);
        return this;
    }

    /**
     * Description
     */
    public SubscriptionsItemsUsagesResponseBuilder description(String description) {
        subscriptionsItemsUsagesResponse.setDescription(description);
        return this;
    }

    /**
     * Used at
     */
    public SubscriptionsItemsUsagesResponseBuilder usedAt(DateTime usedAt) {
        subscriptionsItemsUsagesResponse.setUsedAt(usedAt);
        return this;
    }

    /**
     * Creation date
     */
    public SubscriptionsItemsUsagesResponseBuilder createdAt(DateTime createdAt) {
        subscriptionsItemsUsagesResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Status
     */
    public SubscriptionsItemsUsagesResponseBuilder status(String status) {
        subscriptionsItemsUsagesResponse.setStatus(status);
        return this;
    }

    public SubscriptionsItemsUsagesResponseBuilder deletedAt(DateTime deletedAt) {
        subscriptionsItemsUsagesResponse.setDeletedAt(deletedAt);
        return this;
    }

    public SubscriptionsItemsUsagesResponseBuilder subscriptionItem(GetSubscriptionItemResponse subscriptionItem) {
        subscriptionsItemsUsagesResponse.setSubscriptionItem(subscriptionItem);
        return this;
    }

    /**
     * Identification code in the client system
     */
    public SubscriptionsItemsUsagesResponseBuilder code(String code) {
        subscriptionsItemsUsagesResponse.setCode(code);
        return this;
    }

    /**
     * Identification group in the client system
     */
    public SubscriptionsItemsUsagesResponseBuilder group(String group) {
        subscriptionsItemsUsagesResponse.setGroup(group);
        return this;
    }

    /**
     * Field used in item scheme type 'Percent'
     */
    public SubscriptionsItemsUsagesResponseBuilder amount(Integer amount) {
        subscriptionsItemsUsagesResponse.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SubscriptionsItemsUsagesResponse build() {
        return subscriptionsItemsUsagesResponse;
    }
}