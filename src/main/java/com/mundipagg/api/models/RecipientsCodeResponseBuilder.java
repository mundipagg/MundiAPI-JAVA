/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class RecipientsCodeResponseBuilder {
    //the instance to build
    private RecipientsCodeResponse recipientsCodeResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RecipientsCodeResponseBuilder() {
        recipientsCodeResponse = new RecipientsCodeResponse();
    }

    /**
     * Id
     */
    public RecipientsCodeResponseBuilder id(String id) {
        recipientsCodeResponse.setId(id);
        return this;
    }

    /**
     * Name
     */
    public RecipientsCodeResponseBuilder name(String name) {
        recipientsCodeResponse.setName(name);
        return this;
    }

    /**
     * Email
     */
    public RecipientsCodeResponseBuilder email(String email) {
        recipientsCodeResponse.setEmail(email);
        return this;
    }

    /**
     * Document
     */
    public RecipientsCodeResponseBuilder document(String document) {
        recipientsCodeResponse.setDocument(document);
        return this;
    }

    /**
     * Description
     */
    public RecipientsCodeResponseBuilder description(String description) {
        recipientsCodeResponse.setDescription(description);
        return this;
    }

    /**
     * Type
     */
    public RecipientsCodeResponseBuilder type(String type) {
        recipientsCodeResponse.setType(type);
        return this;
    }

    /**
     * Status
     */
    public RecipientsCodeResponseBuilder status(String status) {
        recipientsCodeResponse.setStatus(status);
        return this;
    }

    /**
     * Creation date
     */
    public RecipientsCodeResponseBuilder createdAt(DateTime createdAt) {
        recipientsCodeResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Last update date
     */
    public RecipientsCodeResponseBuilder updatedAt(DateTime updatedAt) {
        recipientsCodeResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Deletion date
     */
    public RecipientsCodeResponseBuilder deletedAt(DateTime deletedAt) {
        recipientsCodeResponse.setDeletedAt(deletedAt);
        return this;
    }

    public RecipientsCodeResponseBuilder defaultBankAccount(DefaultBankAccount defaultBankAccount) {
        recipientsCodeResponse.setDefaultBankAccount(defaultBankAccount);
        return this;
    }

    /**
     * Info about the recipient on the gateway
     */
    public RecipientsCodeResponseBuilder gatewayRecipients(List<GetGatewayRecipientResponse> gatewayRecipients) {
        recipientsCodeResponse.setGatewayRecipients(gatewayRecipients);
        return this;
    }

    /**
     * Metadata
     */
    public RecipientsCodeResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        recipientsCodeResponse.setMetadata(metadata);
        return this;
    }

    public RecipientsCodeResponseBuilder automaticAnticipationSettings(CreateAutomaticAnticipationSettingsRequest automaticAnticipationSettings) {
        recipientsCodeResponse.setAutomaticAnticipationSettings(automaticAnticipationSettings);
        return this;
    }

    public RecipientsCodeResponseBuilder transferSettings(GetTransferSettingsResponse transferSettings) {
        recipientsCodeResponse.setTransferSettings(transferSettings);
        return this;
    }

    /**
     * Recipient code
     */
    public RecipientsCodeResponseBuilder code(String code) {
        recipientsCodeResponse.setCode(code);
        return this;
    }

    /**
     * Payment mode
     */
    public RecipientsCodeResponseBuilder paymentMode(String paymentMode) {
        recipientsCodeResponse.setPaymentMode(paymentMode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RecipientsCodeResponse build() {
        return recipientsCodeResponse;
    }
}