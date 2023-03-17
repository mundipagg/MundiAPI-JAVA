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
public class CustomersRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6298636115422045783L;
    private String name;
    private String email;
    private String document;
    private String type;
    private Address1 address;
    private LinkedHashMap<String, String> metadata;
    private CreatePhonesRequest phones;
    private String code;
    private String gender;
    private String documentType;
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
     * Document number
     */
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * Document number
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
    }
 
    /** GETTER
     * Person type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Person type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public Address1 getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (Address1 value) { 
        this.address = value;
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
    @JsonGetter("phones")
    public CreatePhonesRequest getPhones ( ) { 
        return this.phones;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("phones")
    public void setPhones (CreatePhonesRequest value) { 
        this.phones = value;
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
     * Gênero do cliente
     */
    @JsonGetter("gender")
    public String getGender ( ) { 
        return this.gender;
    }
    
    /** SETTER
     * Gênero do cliente
     */
    @JsonSetter("gender")
    public void setGender (String value) { 
        this.gender = value;
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
