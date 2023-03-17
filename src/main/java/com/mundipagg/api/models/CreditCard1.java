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
public class CreditCard1 
        implements java.io.Serializable {
    private static final long serialVersionUID = -8011961037742542688L;
    private Integer installments = 1;
    private String statementDescriptor;
    private Card1 card;
    private String cardId;
    private String cardToken;
    private Boolean recurrence;
    private Boolean capture = true;
    private Boolean extendedLimitEnabled;
    private String extendedLimitCode;
    private Long merchantCategoryCode;
    private Authentication2 authentication;
    private Contactless contactless;
    private Boolean autoRecovery;
    private String operationType;
    private String recurrencyCycle;
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
     * TODO: Write general description for this method
     */
    @JsonGetter("card")
    public Card1 getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("card")
    public void setCard (Card1 value) { 
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
     * TODO: Write general description for this method
     */
    @JsonGetter("contactless")
    public Contactless getContactless ( ) { 
        return this.contactless;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("contactless")
    public void setContactless (Contactless value) { 
        this.contactless = value;
    }
 
    /** GETTER
     * Indicates whether a particular payment will enter the offline retry flow
     */
    @JsonGetter("auto_recovery")
    public Boolean getAutoRecovery ( ) { 
        return this.autoRecovery;
    }
    
    /** SETTER
     * Indicates whether a particular payment will enter the offline retry flow
     */
    @JsonSetter("auto_recovery")
    public void setAutoRecovery (Boolean value) { 
        this.autoRecovery = value;
    }
 
    /** GETTER
     * AuthOnly, AuthAndCapture, PreAuth
     */
    @JsonGetter("operation_type")
    public String getOperationType ( ) { 
        return this.operationType;
    }
    
    /** SETTER
     * AuthOnly, AuthAndCapture, PreAuth
     */
    @JsonSetter("operation_type")
    public void setOperationType (String value) { 
        this.operationType = value;
    }
 
    /** GETTER
     * Defines whether the card has been used one or more times.
     */
    @JsonGetter("recurrency_cycle")
    public String getRecurrencyCycle ( ) { 
        return this.recurrencyCycle;
    }
    
    /** SETTER
     * Defines whether the card has been used one or more times.
     */
    @JsonSetter("recurrency_cycle")
    public void setRecurrencyCycle (String value) { 
        this.recurrencyCycle = value;
    }
 
}
