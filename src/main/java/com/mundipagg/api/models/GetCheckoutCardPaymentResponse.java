/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCheckoutCardPaymentResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5175925669152338788L;
    private String statementDescriptor;
    private List<GetCheckoutCardInstallmentOptionsResponse> installments;
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
 
}
 