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
public class RecipientsDefaultBankAccountRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8684083503670422258L;
    private BankAccount1 bankAccount;
    private String paymentMode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bank_account")
    public BankAccount1 getBankAccount ( ) { 
        return this.bankAccount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bank_account")
    public void setBankAccount (BankAccount1 value) { 
        this.bankAccount = value;
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
