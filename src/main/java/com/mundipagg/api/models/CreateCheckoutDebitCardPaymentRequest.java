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
public class CreateCheckoutDebitCardPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 6023346448370920102L;
    private String statementDescriptor;
    private Authentication2 authentication;
    /** GETTER
     * Card invoice text descriptor
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Card invoice text descriptor
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("authentication")
    public Authentication2 getAuthentication ( ) { 
        return this.authentication;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("authentication")
    public void setAuthentication (Authentication2 value) { 
        this.authentication = value;
    }
 
}
