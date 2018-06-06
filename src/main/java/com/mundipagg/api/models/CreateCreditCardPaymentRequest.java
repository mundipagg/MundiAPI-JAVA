/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCreditCardPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5357870953238913182L;
    private Integer installments = 1;
    private String statementDescriptor;
    private CreateCardRequest card;
    private String cardId;
    private String cardToken;
    private Boolean recurrence;
    private Boolean capture = true;
    private Boolean extendedLimitEnabled;
    private String extendedLimitCode;
    private Long merchantCategoryCode;
    private CreatePaymentAuthentiticationRequest authentication;
    private CreateCardPaymentTokenRequest token;
    /** GETTER
     * Number of installments
     */
    @JsonGetter("installments")
    public Integer getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Number of installments
     */
    @JsonSetter("installments")
    public void setInstallments (Integer value) { 
        this.installments = value;
    }
 
    /** GETTER
     * The text that will be shown on the credit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * The text that will be shown on the credit card's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Credit card data
     */
    @JsonGetter("card")
    public CreateCardRequest getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Credit card data
     */
    @JsonSetter("card")
    public void setCard (CreateCardRequest value) { 
        this.card = value;
    }
 
    /** GETTER
     * The credit card id
     */
    @JsonGetter("card_id")
    public String getCardId ( ) { 
        return this.cardId;
    }
    
    /** SETTER
     * The credit card id
     */
    @JsonSetter("card_id")
    public void setCardId (String value) { 
        this.cardId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("card_token")
    public String getCardToken ( ) { 
        return this.cardToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("card_token")
    public void setCardToken (String value) { 
        this.cardToken = value;
    }
 
    /** GETTER
     * Indicates a recurrence
     */
    @JsonGetter("recurrence")
    public Boolean getRecurrence ( ) { 
        return this.recurrence;
    }
    
    /** SETTER
     * Indicates a recurrence
     */
    @JsonSetter("recurrence")
    public void setRecurrence (Boolean value) { 
        this.recurrence = value;
    }
 
    /** GETTER
     * Indicates if the operation should be only authorization or auth and capture.
     */
    @JsonGetter("capture")
    public Boolean getCapture ( ) { 
        return this.capture;
    }
    
    /** SETTER
     * Indicates if the operation should be only authorization or auth and capture.
     */
    @JsonSetter("capture")
    public void setCapture (Boolean value) { 
        this.capture = value;
    }
 
    /** GETTER
     * Indicates whether the extended label (private label) is enabled
     */
    @JsonGetter("extended_limit_enabled")
    public Boolean getExtendedLimitEnabled ( ) { 
        return this.extendedLimitEnabled;
    }
    
    /** SETTER
     * Indicates whether the extended label (private label) is enabled
     */
    @JsonSetter("extended_limit_enabled")
    public void setExtendedLimitEnabled (Boolean value) { 
        this.extendedLimitEnabled = value;
    }
 
    /** GETTER
     * Extended Limit Code
     */
    @JsonGetter("extended_limit_code")
    public String getExtendedLimitCode ( ) { 
        return this.extendedLimitCode;
    }
    
    /** SETTER
     * Extended Limit Code
     */
    @JsonSetter("extended_limit_code")
    public void setExtendedLimitCode (String value) { 
        this.extendedLimitCode = value;
    }
 
    /** GETTER
     * Customer business segment code
     */
    @JsonGetter("merchant_category_code")
    public Long getMerchantCategoryCode ( ) { 
        return this.merchantCategoryCode;
    }
    
    /** SETTER
     * Customer business segment code
     */
    @JsonSetter("merchant_category_code")
    public void setMerchantCategoryCode (Long value) { 
        this.merchantCategoryCode = value;
    }
 
    /** GETTER
     * The payment authentication request
     */
    @JsonGetter("authentication")
    public CreatePaymentAuthentiticationRequest getAuthentication ( ) { 
        return this.authentication;
    }
    
    /** SETTER
     * The payment authentication request
     */
    @JsonSetter("authentication")
    public void setAuthentication (CreatePaymentAuthentiticationRequest value) { 
        this.authentication = value;
    }
 
    /** GETTER
     * The Credit card payment token request
     */
    @JsonGetter("token")
    public CreateCardPaymentTokenRequest getToken ( ) { 
        return this.token;
    }
    
    /** SETTER
     * The Credit card payment token request
     */
    @JsonSetter("token")
    public void setToken (CreateCardPaymentTokenRequest value) { 
        this.token = value;
    }
 
}
 