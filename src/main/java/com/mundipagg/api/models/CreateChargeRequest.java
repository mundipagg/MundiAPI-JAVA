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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mundipagg.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonInclude(Include.ALWAYS)
public class CreateChargeRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5041720234206082935L;
    private String code;
    private int amount;
    private String customerId;
    private Customer8 customer;
    private Payment payment;
    private LinkedHashMap<String, String> metadata;
    private DateTime dueAt;
    private CreateAntifraudRequest antifraud;
    private String orderId;
    /** GETTER
     * Code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * The amount of the charge, in cents
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * The amount of the charge, in cents
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * The customer's id
     */
    @JsonGetter("customer_id")
    public String getCustomerId ( ) { 
        return this.customerId;
    }
    
    /** SETTER
     * The customer's id
     */
    @JsonSetter("customer_id")
    public void setCustomerId (String value) { 
        this.customerId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customer")
    public Customer8 getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customer")
    public void setCustomer (Customer8 value) { 
        this.customer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("payment")
    public Payment getPayment ( ) { 
        return this.payment;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("payment")
    public void setPayment (Payment value) { 
        this.payment = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * The charge due date
     */
    @JsonGetter("due_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDueAt ( ) { 
        return this.dueAt;
    }
    
    /** SETTER
     * The charge due date
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt (DateTime value) { 
        this.dueAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("antifraud")
    public CreateAntifraudRequest getAntifraud ( ) { 
        return this.antifraud;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("antifraud")
    public void setAntifraud (CreateAntifraudRequest value) { 
        this.antifraud = value;
    }
 
    /** GETTER
     * Order Id
     */
    @JsonGetter("order_id")
    public String getOrderId ( ) { 
        return this.orderId;
    }
    
    /** SETTER
     * Order Id
     */
    @JsonSetter("order_id")
    public void setOrderId (String value) { 
        this.orderId = value;
    }
 
}
