/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mundipagg.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for GetUsageResponse type.
 */
public class GetUsageResponse {
    private String id;
    private int quantity;
    private String description;
    private LocalDateTime usedAt;
    private LocalDateTime createdAt;
    private String status;
    private LocalDateTime deletedAt;
    private GetSubscriptionItemResponse subscriptionItem;
    private String code;
    private String group;
    private Integer amount;

    /**
     * Default constructor.
     */
    public GetUsageResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  quantity  int value for quantity.
     * @param  description  String value for description.
     * @param  usedAt  LocalDateTime value for usedAt.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  status  String value for status.
     * @param  subscriptionItem  GetSubscriptionItemResponse value for subscriptionItem.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     * @param  code  String value for code.
     * @param  group  String value for group.
     * @param  amount  Integer value for amount.
     */
    public GetUsageResponse(
            String id,
            int quantity,
            String description,
            LocalDateTime usedAt,
            LocalDateTime createdAt,
            String status,
            GetSubscriptionItemResponse subscriptionItem,
            LocalDateTime deletedAt,
            String code,
            String group,
            Integer amount) {
        this.id = id;
        this.quantity = quantity;
        this.description = description;
        this.usedAt = usedAt;
        this.createdAt = createdAt;
        this.status = status;
        this.deletedAt = deletedAt;
        this.subscriptionItem = subscriptionItem;
        this.code = code;
        this.group = group;
        this.amount = amount;
    }

    /**
     * Getter for Id.
     * Id
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Id
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Quantity.
     * Quantity
     * @return Returns the int
     */
    @JsonGetter("quantity")
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * Quantity
     * @param quantity Value for int
     */
    @JsonSetter("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for Description.
     * Description
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for UsedAt.
     * Used at
     * @return Returns the LocalDateTime
     */
    @JsonGetter("used_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUsedAt() {
        return usedAt;
    }

    /**
     * Setter for UsedAt.
     * Used at
     * @param usedAt Value for LocalDateTime
     */
    @JsonSetter("used_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUsedAt(LocalDateTime usedAt) {
        this.usedAt = usedAt;
    }

    /**
     * Getter for CreatedAt.
     * Creation date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Creation date
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for Status.
     * Status
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for DeletedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("deleted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    /**
     * Setter for DeletedAt.
     * @param deletedAt Value for LocalDateTime
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * Getter for SubscriptionItem.
     * Subscription item
     * @return Returns the GetSubscriptionItemResponse
     */
    @JsonGetter("subscription_item")
    public GetSubscriptionItemResponse getSubscriptionItem() {
        return subscriptionItem;
    }

    /**
     * Setter for SubscriptionItem.
     * Subscription item
     * @param subscriptionItem Value for GetSubscriptionItemResponse
     */
    @JsonSetter("subscription_item")
    public void setSubscriptionItem(GetSubscriptionItemResponse subscriptionItem) {
        this.subscriptionItem = subscriptionItem;
    }

    /**
     * Getter for Code.
     * Identification code in the client system
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Identification code in the client system
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Group.
     * Identification group in the client system
     * @return Returns the String
     */
    @JsonGetter("group")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGroup() {
        return group;
    }

    /**
     * Setter for Group.
     * Identification group in the client system
     * @param group Value for String
     */
    @JsonSetter("group")
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Getter for Amount.
     * Field used in item scheme type 'Percent'
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Field used in item scheme type 'Percent'
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Converts this GetUsageResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetUsageResponse [" + "id=" + id + ", quantity=" + quantity + ", description="
                + description + ", usedAt=" + usedAt + ", createdAt=" + createdAt + ", status="
                + status + ", subscriptionItem=" + subscriptionItem + ", deletedAt=" + deletedAt
                + ", code=" + code + ", group=" + group + ", amount=" + amount + "]";
    }

    /**
     * Builds a new {@link GetUsageResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetUsageResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, quantity, description, usedAt, createdAt, status,
                subscriptionItem)
                .deletedAt(getDeletedAt())
                .code(getCode())
                .group(getGroup())
                .amount(getAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link GetUsageResponse}.
     */
    public static class Builder {
        private String id;
        private int quantity;
        private String description;
        private LocalDateTime usedAt;
        private LocalDateTime createdAt;
        private String status;
        private GetSubscriptionItemResponse subscriptionItem;
        private LocalDateTime deletedAt;
        private String code;
        private String group;
        private Integer amount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  quantity  int value for quantity.
         * @param  description  String value for description.
         * @param  usedAt  LocalDateTime value for usedAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  status  String value for status.
         * @param  subscriptionItem  GetSubscriptionItemResponse value for subscriptionItem.
         */
        public Builder(String id, int quantity, String description, LocalDateTime usedAt,
                LocalDateTime createdAt, String status,
                GetSubscriptionItemResponse subscriptionItem) {
            this.id = id;
            this.quantity = quantity;
            this.description = description;
            this.usedAt = usedAt;
            this.createdAt = createdAt;
            this.status = status;
            this.subscriptionItem = subscriptionItem;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  int value for quantity.
         * @return Builder
         */
        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for usedAt.
         * @param  usedAt  LocalDateTime value for usedAt.
         * @return Builder
         */
        public Builder usedAt(LocalDateTime usedAt) {
            this.usedAt = usedAt;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for subscriptionItem.
         * @param  subscriptionItem  GetSubscriptionItemResponse value for subscriptionItem.
         * @return Builder
         */
        public Builder subscriptionItem(GetSubscriptionItemResponse subscriptionItem) {
            this.subscriptionItem = subscriptionItem;
            return this;
        }

        /**
         * Setter for deletedAt.
         * @param  deletedAt  LocalDateTime value for deletedAt.
         * @return Builder
         */
        public Builder deletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for group.
         * @param  group  String value for group.
         * @return Builder
         */
        public Builder group(String group) {
            this.group = group;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link GetUsageResponse} object using the set fields.
         * @return {@link GetUsageResponse}
         */
        public GetUsageResponse build() {
            return new GetUsageResponse(id, quantity, description, usedAt, createdAt, status,
                    subscriptionItem, deletedAt, code, group, amount);
        }
    }
}
