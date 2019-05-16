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
public class CreateCheckoutPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2339210014952537440L;
    private List<String> acceptedPaymentMethods;
    private List<Object> acceptedMultiPaymentMethods;
    private String successUrl;
    private String defaultPaymentMethod;
    private String gatewayAffiliationId;
    private CreateCheckoutCreditCardPaymentRequest creditCard;
    private CreateCheckoutDebitCardPaymentRequest debitCard;
    private CreateCheckoutBoletoPaymentRequest boleto;
    private Boolean customerEditable;
    private Integer expiresIn;
    private boolean skipCheckoutSuccessPage;
    private boolean billingAddressEditable;
    private CreateAddressRequest billingAddress;
    private CreateCheckoutBankTransferRequest bankTransfer;
    /** GETTER
     * Accepted Payment Methods
     */
    @JsonGetter("accepted_payment_methods")
    public List<String> getAcceptedPaymentMethods ( ) { 
        return this.acceptedPaymentMethods;
    }
    
    /** SETTER
     * Accepted Payment Methods
     */
    @JsonSetter("accepted_payment_methods")
    public void setAcceptedPaymentMethods (List<String> value) { 
        this.acceptedPaymentMethods = value;
    }
 
    /** GETTER
     * Accepted Multi Payment Methods
     */
    @JsonGetter("accepted_multi_payment_methods")
    public List<Object> getAcceptedMultiPaymentMethods ( ) { 
        return this.acceptedMultiPaymentMethods;
    }
    
    /** SETTER
     * Accepted Multi Payment Methods
     */
    @JsonSetter("accepted_multi_payment_methods")
    public void setAcceptedMultiPaymentMethods (List<Object> value) { 
        this.acceptedMultiPaymentMethods = value;
    }
 
    /** GETTER
     * Success url
     */
    @JsonGetter("success_url")
    public String getSuccessUrl ( ) { 
        return this.successUrl;
    }
    
    /** SETTER
     * Success url
     */
    @JsonSetter("success_url")
    public void setSuccessUrl (String value) { 
        this.successUrl = value;
    }
 
    /** GETTER
     * Default payment method
     */
    @JsonGetter("default_payment_method")
    public String getDefaultPaymentMethod ( ) { 
        return this.defaultPaymentMethod;
    }
    
    /** SETTER
     * Default payment method
     */
    @JsonSetter("default_payment_method")
    public void setDefaultPaymentMethod (String value) { 
        this.defaultPaymentMethod = value;
    }
 
    /** GETTER
     * Gateway Affiliation Id
     */
    @JsonGetter("gateway_affiliation_id")
    public String getGatewayAffiliationId ( ) { 
        return this.gatewayAffiliationId;
    }
    
    /** SETTER
     * Gateway Affiliation Id
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId (String value) { 
        this.gatewayAffiliationId = value;
    }
 
    /** GETTER
     * Credit Card payment request
     */
    @JsonGetter("credit_card")
    public CreateCheckoutCreditCardPaymentRequest getCreditCard ( ) { 
        return this.creditCard;
    }
    
    /** SETTER
     * Credit Card payment request
     */
    @JsonSetter("credit_card")
    public void setCreditCard (CreateCheckoutCreditCardPaymentRequest value) { 
        this.creditCard = value;
    }
 
    /** GETTER
     * Debit Card payment request
     */
    @JsonGetter("debit_card")
    public CreateCheckoutDebitCardPaymentRequest getDebitCard ( ) { 
        return this.debitCard;
    }
    
    /** SETTER
     * Debit Card payment request
     */
    @JsonSetter("debit_card")
    public void setDebitCard (CreateCheckoutDebitCardPaymentRequest value) { 
        this.debitCard = value;
    }
 
    /** GETTER
     * Boleto payment request
     */
    @JsonGetter("boleto")
    public CreateCheckoutBoletoPaymentRequest getBoleto ( ) { 
        return this.boleto;
    }
    
    /** SETTER
     * Boleto payment request
     */
    @JsonSetter("boleto")
    public void setBoleto (CreateCheckoutBoletoPaymentRequest value) { 
        this.boleto = value;
    }
 
    /** GETTER
     * Customer is editable?
     */
    @JsonGetter("customer_editable")
    public Boolean getCustomerEditable ( ) { 
        return this.customerEditable;
    }
    
    /** SETTER
     * Customer is editable?
     */
    @JsonSetter("customer_editable")
    public void setCustomerEditable (Boolean value) { 
        this.customerEditable = value;
    }
 
    /** GETTER
     * Time in minutes for expiration
     */
    @JsonGetter("expires_in")
    public Integer getExpiresIn ( ) { 
        return this.expiresIn;
    }
    
    /** SETTER
     * Time in minutes for expiration
     */
    @JsonSetter("expires_in")
    public void setExpiresIn (Integer value) { 
        this.expiresIn = value;
    }
 
    /** GETTER
     * Skip postpay success screen?
     */
    @JsonGetter("skip_checkout_success_page")
    public boolean getSkipCheckoutSuccessPage ( ) { 
        return this.skipCheckoutSuccessPage;
    }
    
    /** SETTER
     * Skip postpay success screen?
     */
    @JsonSetter("skip_checkout_success_page")
    public void setSkipCheckoutSuccessPage (boolean value) { 
        this.skipCheckoutSuccessPage = value;
    }
 
    /** GETTER
     * Billing Address is editable?
     */
    @JsonGetter("billing_address_editable")
    public boolean getBillingAddressEditable ( ) { 
        return this.billingAddressEditable;
    }
    
    /** SETTER
     * Billing Address is editable?
     */
    @JsonSetter("billing_address_editable")
    public void setBillingAddressEditable (boolean value) { 
        this.billingAddressEditable = value;
    }
 
    /** GETTER
     * Billing Address
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * Billing Address
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (CreateAddressRequest value) { 
        this.billingAddress = value;
    }
 
    /** GETTER
     * Bank Transfer payment request
     */
    @JsonGetter("bank_transfer")
    public CreateCheckoutBankTransferRequest getBankTransfer ( ) { 
        return this.bankTransfer;
    }
    
    /** SETTER
     * Bank Transfer payment request
     */
    @JsonSetter("bank_transfer")
    public void setBankTransfer (CreateCheckoutBankTransferRequest value) { 
        this.bankTransfer = value;
    }
 
}
