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
public class CreditCard2 
        implements java.io.Serializable {
    private static final long serialVersionUID = -8434176390918516274L;
    private String statementDescriptor;
    private List<CreateCheckoutCardInstallmentOptionRequest> installments;
    private Authentication2 authentication;
    private Boolean capture;
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
     * Payment installment options
     */
    @JsonGetter("installments")
    public List<CreateCheckoutCardInstallmentOptionRequest> getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Payment installment options
     */
    @JsonSetter("installments")
    public void setInstallments (List<CreateCheckoutCardInstallmentOptionRequest> value) { 
        this.installments = value;
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
 
    /** GETTER
     * Authorize and capture?
     */
    @JsonGetter("capture")
    public Boolean getCapture ( ) { 
        return this.capture;
    }
    
    /** SETTER
     * Authorize and capture?
     */
    @JsonSetter("capture")
    public void setCapture (Boolean value) { 
        this.capture = value;
    }
 
}