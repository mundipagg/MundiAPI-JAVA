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
public class CreateDebitCardPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2937390167710173373L;
    private String statementDescriptor;
    private Card1 card;
    private String cardId;
    private String cardToken;
    private Boolean recurrence;
    private Authentication2 authentication;
    private Token token;
    private String recurrencyCycle;
    /** GETTER
     * The text that will be shown on the debit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * The text that will be shown on the debit card's statement
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
     * The debit card id
     */
    @JsonGetter("card_id")
    public String getCardId ( ) { 
        return this.cardId;
    }
    
    /** SETTER
     * The debit card id
     */
    @JsonSetter("card_id")
    public void setCardId (String value) { 
        this.cardId = value;
    }
 
    /** GETTER
     * The debit card token
     */
    @JsonGetter("card_token")
    public String getCardToken ( ) { 
        return this.cardToken;
    }
    
    /** SETTER
     * The debit card token
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
    @JsonGetter("token")
    public Token getToken ( ) { 
        return this.token;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("token")
    public void setToken (Token value) { 
        this.token = value;
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
