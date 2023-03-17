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
public class SubscriptionsPaymentMethodRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8098120569270331541L;
    private String paymentMethod;
    private String cardId;
    private Card1 card;
    private String cardToken;
    /** GETTER
     * The new payment method
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod ( ) { 
        return this.paymentMethod;
    }
    
    /** SETTER
     * The new payment method
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod (String value) { 
        this.paymentMethod = value;
    }
 
    /** GETTER
     * Card id
     */
    @JsonGetter("card_id")
    public String getCardId ( ) { 
        return this.cardId;
    }
    
    /** SETTER
     * Card id
     */
    @JsonSetter("card_id")
    public void setCardId (String value) { 
        this.cardId = value;
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
     * The Card Token
     */
    @JsonGetter("card_token")
    public String getCardToken ( ) { 
        return this.cardToken;
    }
    
    /** SETTER
     * The Card Token
     */
    @JsonSetter("card_token")
    public void setCardToken (String value) { 
        this.cardToken = value;
    }
 
}
