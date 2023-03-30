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
import java.util.Map;

/**
 * This is a model class for GetCustomerResponse type.
 */
public class GetCustomerResponse {
    private String id;
    private String name;
    private String email;
    private boolean delinquent;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String document;
    private String type;
    private String fbAccessToken;
    private GetAddressResponse address;
    private Map<String, String> metadata;
    private GetPhonesResponse phones;
    private Long fbId;
    private String code;
    private String documentType;

    /**
     * Default constructor.
     */
    public GetCustomerResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  email  String value for email.
     * @param  delinquent  boolean value for delinquent.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  document  String value for document.
     * @param  type  String value for type.
     * @param  fbAccessToken  String value for fbAccessToken.
     * @param  address  GetAddressResponse value for address.
     * @param  metadata  Map of String, value for metadata.
     * @param  phones  GetPhonesResponse value for phones.
     * @param  code  String value for code.
     * @param  documentType  String value for documentType.
     * @param  fbId  Long value for fbId.
     */
    public GetCustomerResponse(
            String id,
            String name,
            String email,
            boolean delinquent,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            String document,
            String type,
            String fbAccessToken,
            GetAddressResponse address,
            Map<String, String> metadata,
            GetPhonesResponse phones,
            String code,
            String documentType,
            Long fbId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.delinquent = delinquent;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.document = document;
        this.type = type;
        this.fbAccessToken = fbAccessToken;
        this.address = address;
        this.metadata = metadata;
        this.phones = phones;
        this.fbId = fbId;
        this.code = code;
        this.documentType = documentType;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Delinquent.
     * @return Returns the boolean
     */
    @JsonGetter("delinquent")
    public boolean getDelinquent() {
        return delinquent;
    }

    /**
     * Setter for Delinquent.
     * @param delinquent Value for boolean
     */
    @JsonSetter("delinquent")
    public void setDelinquent(boolean delinquent) {
        this.delinquent = delinquent;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Document.
     * @return Returns the String
     */
    @JsonGetter("document")
    public String getDocument() {
        return document;
    }

    /**
     * Setter for Document.
     * @param document Value for String
     */
    @JsonSetter("document")
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for FbAccessToken.
     * @return Returns the String
     */
    @JsonGetter("fb_access_token")
    public String getFbAccessToken() {
        return fbAccessToken;
    }

    /**
     * Setter for FbAccessToken.
     * @param fbAccessToken Value for String
     */
    @JsonSetter("fb_access_token")
    public void setFbAccessToken(String fbAccessToken) {
        this.fbAccessToken = fbAccessToken;
    }

    /**
     * Getter for Address.
     * @return Returns the GetAddressResponse
     */
    @JsonGetter("address")
    public GetAddressResponse getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for GetAddressResponse
     */
    @JsonSetter("address")
    public void setAddress(GetAddressResponse address) {
        this.address = address;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Phones.
     * @return Returns the GetPhonesResponse
     */
    @JsonGetter("phones")
    public GetPhonesResponse getPhones() {
        return phones;
    }

    /**
     * Setter for Phones.
     * @param phones Value for GetPhonesResponse
     */
    @JsonSetter("phones")
    public void setPhones(GetPhonesResponse phones) {
        this.phones = phones;
    }

    /**
     * Getter for FbId.
     * @return Returns the Long
     */
    @JsonGetter("fb_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getFbId() {
        return fbId;
    }

    /**
     * Setter for FbId.
     * @param fbId Value for Long
     */
    @JsonSetter("fb_id")
    public void setFbId(Long fbId) {
        this.fbId = fbId;
    }

    /**
     * Getter for Code.
     * Código de referência do cliente no sistema da loja. Max: 52 caracteres
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Código de referência do cliente no sistema da loja. Max: 52 caracteres
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for DocumentType.
     * @return Returns the String
     */
    @JsonGetter("document_type")
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Setter for DocumentType.
     * @param documentType Value for String
     */
    @JsonSetter("document_type")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * Converts this GetCustomerResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCustomerResponse [" + "id=" + id + ", name=" + name + ", email=" + email
                + ", delinquent=" + delinquent + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", document=" + document + ", type=" + type + ", fbAccessToken="
                + fbAccessToken + ", address=" + address + ", metadata=" + metadata + ", phones="
                + phones + ", code=" + code + ", documentType=" + documentType + ", fbId=" + fbId
                + "]";
    }

    /**
     * Builds a new {@link GetCustomerResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCustomerResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name, email, delinquent, createdAt, updatedAt, document,
                type, fbAccessToken, address, metadata, phones, code, documentType)
                .fbId(getFbId());
        return builder;
    }

    /**
     * Class to build instances of {@link GetCustomerResponse}.
     */
    public static class Builder {
        private String id;
        private String name;
        private String email;
        private boolean delinquent;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String document;
        private String type;
        private String fbAccessToken;
        private GetAddressResponse address;
        private Map<String, String> metadata;
        private GetPhonesResponse phones;
        private String code;
        private String documentType;
        private Long fbId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  name  String value for name.
         * @param  email  String value for email.
         * @param  delinquent  boolean value for delinquent.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  document  String value for document.
         * @param  type  String value for type.
         * @param  fbAccessToken  String value for fbAccessToken.
         * @param  address  GetAddressResponse value for address.
         * @param  metadata  Map of String, value for metadata.
         * @param  phones  GetPhonesResponse value for phones.
         * @param  code  String value for code.
         * @param  documentType  String value for documentType.
         */
        public Builder(String id, String name, String email, boolean delinquent,
                LocalDateTime createdAt, LocalDateTime updatedAt, String document, String type,
                String fbAccessToken, GetAddressResponse address, Map<String, String> metadata,
                GetPhonesResponse phones, String code, String documentType) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.delinquent = delinquent;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.document = document;
            this.type = type;
            this.fbAccessToken = fbAccessToken;
            this.address = address;
            this.metadata = metadata;
            this.phones = phones;
            this.code = code;
            this.documentType = documentType;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for delinquent.
         * @param  delinquent  boolean value for delinquent.
         * @return Builder
         */
        public Builder delinquent(boolean delinquent) {
            this.delinquent = delinquent;
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
         * Setter for document.
         * @param  document  String value for document.
         * @return Builder
         */
        public Builder document(String document) {
            this.document = document;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for fbAccessToken.
         * @param  fbAccessToken  String value for fbAccessToken.
         * @return Builder
         */
        public Builder fbAccessToken(String fbAccessToken) {
            this.fbAccessToken = fbAccessToken;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  GetAddressResponse value for address.
         * @return Builder
         */
        public Builder address(GetAddressResponse address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for phones.
         * @param  phones  GetPhonesResponse value for phones.
         * @return Builder
         */
        public Builder phones(GetPhonesResponse phones) {
            this.phones = phones;
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
         * Setter for documentType.
         * @param  documentType  String value for documentType.
         * @return Builder
         */
        public Builder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        /**
         * Setter for fbId.
         * @param  fbId  Long value for fbId.
         * @return Builder
         */
        public Builder fbId(Long fbId) {
            this.fbId = fbId;
            return this;
        }

        /**
         * Builds a new {@link GetCustomerResponse} object using the set fields.
         * @return {@link GetCustomerResponse}
         */
        public GetCustomerResponse build() {
            return new GetCustomerResponse(id, name, email, delinquent, createdAt, updatedAt,
                    document, type, fbAccessToken, address, metadata, phones, code, documentType,
                    fbId);
        }
    }
}
