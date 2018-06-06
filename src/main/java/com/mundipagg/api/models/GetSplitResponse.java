/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetSplitResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4930315554325036550L;
    private String type;
    private int amount;
    private GetRecipientResponse recipient;
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
     * Amount
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Recipient
     */
    @JsonGetter("recipient")
    public GetRecipientResponse getRecipient ( ) { 
        return this.recipient;
    }
    
    /** SETTER
     * Recipient
     */
    @JsonSetter("recipient")
    public void setRecipient (GetRecipientResponse value) { 
        this.recipient = value;
    }
 
}
 