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
public class GetInterestResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6236468057331414034L;
    private int days;
    private String type;
    private int amount;
    /** GETTER
     * Days
     */
    @JsonGetter("days")
    public int getDays ( ) { 
        return this.days;
    }
    
    /** SETTER
     * Days
     */
    @JsonSetter("days")
    public void setDays (int value) { 
        this.days = value;
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
 
}
