/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mundipagg.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonInclude(Include.ALWAYS)
public class Recipient 
        implements java.io.Serializable {
    private static final long serialVersionUID = 7659430694187745145L;
    private String id;
    private String name;
    private String email;
    private String document;
    private String description;
    private String type;
    private String status;
    private DateTime createdAt;
    private DateTime updatedAt;
    private DateTime deletedAt;
    private DefaultBankAccount defaultBankAccount;
    private List<GetGatewayRecipientResponse> gatewayRecipients;
    private LinkedHashMap<String, String> metadata;
    private CreateAutomaticAnticipationSettingsRequest automaticAnticipationSettings;
    private GetTransferSettingsResponse transferSettings;
    private String code;
    private String paymentMode;
    /** GETTER
     * Id
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Id
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Email
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * Document
     */
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * Document
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Creation date
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Creation date
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Last update date
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Last update date
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt (DateTime value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * Deletion date
     */
    @JsonGetter("deleted_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDeletedAt ( ) { 
        return this.deletedAt;
    }
    
    /** SETTER
     * Deletion date
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt (DateTime value) { 
        this.deletedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("default_bank_account")
    public DefaultBankAccount getDefaultBankAccount ( ) { 
        return this.defaultBankAccount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("default_bank_account")
    public void setDefaultBankAccount (DefaultBankAccount value) { 
        this.defaultBankAccount = value;
    }
 
    /** GETTER
     * Info about the recipient on the gateway
     */
    @JsonGetter("gateway_recipients")
    public List<GetGatewayRecipientResponse> getGatewayRecipients ( ) { 
        return this.gatewayRecipients;
    }
    
    /** SETTER
     * Info about the recipient on the gateway
     */
    @JsonSetter("gateway_recipients")
    public void setGatewayRecipients (List<GetGatewayRecipientResponse> value) { 
        this.gatewayRecipients = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("automatic_anticipation_settings")
    public CreateAutomaticAnticipationSettingsRequest getAutomaticAnticipationSettings ( ) { 
        return this.automaticAnticipationSettings;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("automatic_anticipation_settings")
    public void setAutomaticAnticipationSettings (CreateAutomaticAnticipationSettingsRequest value) { 
        this.automaticAnticipationSettings = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transfer_settings")
    public GetTransferSettingsResponse getTransferSettings ( ) { 
        return this.transferSettings;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transfer_settings")
    public void setTransferSettings (GetTransferSettingsResponse value) { 
        this.transferSettings = value;
    }
 
    /** GETTER
     * Recipient code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Recipient code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * Payment mode
     */
    @JsonGetter("payment_mode")
    public String getPaymentMode ( ) { 
        return this.paymentMode;
    }
    
    /** SETTER
     * Payment mode
     */
    @JsonSetter("payment_mode")
    public void setPaymentMode (String value) { 
        this.paymentMode = value;
    }
 
}
