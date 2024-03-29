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

@JsonInclude(Include.ALWAYS)
public class RecipientsRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4383183590646524009L;
    private String name;
    private String email;
    private String description;
    private String document;
    private String type;
    private DefaultBankAccount1 defaultBankAccount;
    private LinkedHashMap<String, String> metadata;
    private GetTransferSettingsResponse transferSettings;
    private String code;
    private String paymentMode;
    /** GETTER
     * Recipient name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Recipient name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Recipient email
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Recipient email
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * Recipient description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Recipient description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Recipient document number
     */
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * Recipient document number
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
    }
 
    /** GETTER
     * Recipient type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Recipient type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("default_bank_account")
    public DefaultBankAccount1 getDefaultBankAccount ( ) { 
        return this.defaultBankAccount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("default_bank_account")
    public void setDefaultBankAccount (DefaultBankAccount1 value) { 
        this.defaultBankAccount = value;
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
