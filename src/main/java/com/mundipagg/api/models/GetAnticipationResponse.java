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
 * This is a model class for GetAnticipationResponse type.
 */
public class GetAnticipationResponse {
    private String id;
    private int requestedAmount;
    private int approvedAmount;
    private GetRecipientResponse recipient;
    private String pgid;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime paymentDate;
    private String status;
    private String timeframe;

    /**
     * Default constructor.
     */
    public GetAnticipationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  requestedAmount  int value for requestedAmount.
     * @param  approvedAmount  int value for approvedAmount.
     * @param  pgid  String value for pgid.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  paymentDate  LocalDateTime value for paymentDate.
     * @param  status  String value for status.
     * @param  timeframe  String value for timeframe.
     * @param  recipient  GetRecipientResponse value for recipient.
     */
    public GetAnticipationResponse(
            String id,
            int requestedAmount,
            int approvedAmount,
            String pgid,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime paymentDate,
            String status,
            String timeframe,
            GetRecipientResponse recipient) {
        this.id = id;
        this.requestedAmount = requestedAmount;
        this.approvedAmount = approvedAmount;
        this.recipient = recipient;
        this.pgid = pgid;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.paymentDate = paymentDate;
        this.status = status;
        this.timeframe = timeframe;
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
     * Getter for RequestedAmount.
     * Requested amount
     * @return Returns the int
     */
    @JsonGetter("requested_amount")
    public int getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Setter for RequestedAmount.
     * Requested amount
     * @param requestedAmount Value for int
     */
    @JsonSetter("requested_amount")
    public void setRequestedAmount(int requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    /**
     * Getter for ApprovedAmount.
     * Approved amount
     * @return Returns the int
     */
    @JsonGetter("approved_amount")
    public int getApprovedAmount() {
        return approvedAmount;
    }

    /**
     * Setter for ApprovedAmount.
     * Approved amount
     * @param approvedAmount Value for int
     */
    @JsonSetter("approved_amount")
    public void setApprovedAmount(int approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    /**
     * Getter for Recipient.
     * Recipient
     * @return Returns the GetRecipientResponse
     */
    @JsonGetter("recipient")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetRecipientResponse getRecipient() {
        return recipient;
    }

    /**
     * Setter for Recipient.
     * Recipient
     * @param recipient Value for GetRecipientResponse
     */
    @JsonSetter("recipient")
    public void setRecipient(GetRecipientResponse recipient) {
        this.recipient = recipient;
    }

    /**
     * Getter for Pgid.
     * Anticipation id on the gateway
     * @return Returns the String
     */
    @JsonGetter("pgid")
    public String getPgid() {
        return pgid;
    }

    /**
     * Setter for Pgid.
     * Anticipation id on the gateway
     * @param pgid Value for String
     */
    @JsonSetter("pgid")
    public void setPgid(String pgid) {
        this.pgid = pgid;
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
     * Getter for UpdatedAt.
     * Last update date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * Last update date
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for PaymentDate.
     * Payment date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("payment_date")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    /**
     * Setter for PaymentDate.
     * Payment date
     * @param paymentDate Value for LocalDateTime
     */
    @JsonSetter("payment_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
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
     * Getter for Timeframe.
     * Timeframe
     * @return Returns the String
     */
    @JsonGetter("timeframe")
    public String getTimeframe() {
        return timeframe;
    }

    /**
     * Setter for Timeframe.
     * Timeframe
     * @param timeframe Value for String
     */
    @JsonSetter("timeframe")
    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    /**
     * Converts this GetAnticipationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAnticipationResponse [" + "id=" + id + ", requestedAmount=" + requestedAmount
                + ", approvedAmount=" + approvedAmount + ", pgid=" + pgid + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + ", paymentDate=" + paymentDate
                + ", status=" + status + ", timeframe=" + timeframe + ", recipient=" + recipient
                + "]";
    }

    /**
     * Builds a new {@link GetAnticipationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAnticipationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, requestedAmount, approvedAmount, pgid, createdAt,
                updatedAt, paymentDate, status, timeframe)
                .recipient(getRecipient());
        return builder;
    }

    /**
     * Class to build instances of {@link GetAnticipationResponse}.
     */
    public static class Builder {
        private String id;
        private int requestedAmount;
        private int approvedAmount;
        private String pgid;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private LocalDateTime paymentDate;
        private String status;
        private String timeframe;
        private GetRecipientResponse recipient;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  requestedAmount  int value for requestedAmount.
         * @param  approvedAmount  int value for approvedAmount.
         * @param  pgid  String value for pgid.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  paymentDate  LocalDateTime value for paymentDate.
         * @param  status  String value for status.
         * @param  timeframe  String value for timeframe.
         */
        public Builder(String id, int requestedAmount, int approvedAmount, String pgid,
                LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime paymentDate,
                String status, String timeframe) {
            this.id = id;
            this.requestedAmount = requestedAmount;
            this.approvedAmount = approvedAmount;
            this.pgid = pgid;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.paymentDate = paymentDate;
            this.status = status;
            this.timeframe = timeframe;
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
         * Setter for requestedAmount.
         * @param  requestedAmount  int value for requestedAmount.
         * @return Builder
         */
        public Builder requestedAmount(int requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        /**
         * Setter for approvedAmount.
         * @param  approvedAmount  int value for approvedAmount.
         * @return Builder
         */
        public Builder approvedAmount(int approvedAmount) {
            this.approvedAmount = approvedAmount;
            return this;
        }

        /**
         * Setter for pgid.
         * @param  pgid  String value for pgid.
         * @return Builder
         */
        public Builder pgid(String pgid) {
            this.pgid = pgid;
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
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for paymentDate.
         * @param  paymentDate  LocalDateTime value for paymentDate.
         * @return Builder
         */
        public Builder paymentDate(LocalDateTime paymentDate) {
            this.paymentDate = paymentDate;
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
         * Setter for timeframe.
         * @param  timeframe  String value for timeframe.
         * @return Builder
         */
        public Builder timeframe(String timeframe) {
            this.timeframe = timeframe;
            return this;
        }

        /**
         * Setter for recipient.
         * @param  recipient  GetRecipientResponse value for recipient.
         * @return Builder
         */
        public Builder recipient(GetRecipientResponse recipient) {
            this.recipient = recipient;
            return this;
        }

        /**
         * Builds a new {@link GetAnticipationResponse} object using the set fields.
         * @return {@link GetAnticipationResponse}
         */
        public GetAnticipationResponse build() {
            return new GetAnticipationResponse(id, requestedAmount, approvedAmount, pgid, createdAt,
                    updatedAt, paymentDate, status, timeframe, recipient);
        }
    }
}
