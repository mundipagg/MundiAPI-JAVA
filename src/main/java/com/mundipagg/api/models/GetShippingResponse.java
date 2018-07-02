/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetShippingResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5409402277897967422L;
    private int amount;
    private String description;
    private String recipientName;
    private String recipientPhone;
    private GetAddressResponse address;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recipient_name")
    public String getRecipientName ( ) { 
        return this.recipientName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recipient_name")
    public void setRecipientName (String value) { 
        this.recipientName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recipient_phone")
    public String getRecipientPhone ( ) { 
        return this.recipientPhone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recipient_phone")
    public void setRecipientPhone (String value) { 
        this.recipientPhone = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public GetAddressResponse getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (GetAddressResponse value) { 
        this.address = value;
    }
 
}
 