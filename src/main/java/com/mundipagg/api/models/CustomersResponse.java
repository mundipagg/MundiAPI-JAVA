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
public class CustomersResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8982087080681079025L;
    private String id;
    private String name;
    private String email;
    private boolean delinquent;
    private DateTime createdAt;
    private DateTime updatedAt;
    private String document;
    private String type;
    private String fbAccessToken;
    private Address address;
    private LinkedHashMap<String, String> metadata;
    private GetPhonesResponse phones;
    private Long fbId;
    private String code;
    private String documentType;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("delinquent")
    public boolean getDelinquent ( ) { 
        return this.delinquent;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("delinquent")
    public void setDelinquent (boolean value) { 
        this.delinquent = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt (DateTime value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fb_access_token")
    public String getFbAccessToken ( ) { 
        return this.fbAccessToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fb_access_token")
    public void setFbAccessToken (String value) { 
        this.fbAccessToken = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public Address getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (Address value) { 
        this.address = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("phones")
    public GetPhonesResponse getPhones ( ) { 
        return this.phones;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("phones")
    public void setPhones (GetPhonesResponse value) { 
        this.phones = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fb_id")
    public Long getFbId ( ) { 
        return this.fbId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fb_id")
    public void setFbId (Long value) { 
        this.fbId = value;
    }
 
    /** GETTER
     * Código de referência do cliente no sistema da loja. Max: 52 caracteres
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Código de referência do cliente no sistema da loja. Max: 52 caracteres
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("document_type")
    public String getDocumentType ( ) { 
        return this.documentType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("document_type")
    public void setDocumentType (String value) { 
        this.documentType = value;
    }
 
}
