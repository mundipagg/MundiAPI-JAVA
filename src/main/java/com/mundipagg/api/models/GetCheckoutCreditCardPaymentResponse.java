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
public class GetCheckoutCreditCardPaymentResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8924776173408427801L;
    private String statementDescriptor;
    private List<GetCheckoutCardInstallmentOptionsResponse> installments;
    private Authentication authentication;
    /** GETTER
     * Descrição na fatura
     */
    @JsonGetter("statementDescriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Descrição na fatura
     */
    @JsonSetter("statementDescriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Parcelas
     */
    @JsonGetter("installments")
    public List<GetCheckoutCardInstallmentOptionsResponse> getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Parcelas
     */
    @JsonSetter("installments")
    public void setInstallments (List<GetCheckoutCardInstallmentOptionsResponse> value) { 
        this.installments = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("authentication")
    public Authentication getAuthentication ( ) { 
        return this.authentication;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("authentication")
    public void setAuthentication (Authentication value) { 
        this.authentication = value;
    }
 
}
