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
public class Boleto1 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4611349351535532674L;
    private int retries;
    private String bank;
    private String instructions;
    private DateTime dueAt;
    private BillingAddress1 billingAddress;
    private String billingAddressId;
    private String nossoNumero;
    private String documentNumber;
    private Interest interest;
    private Fine fine;
    private Integer maxDaysToPayPastDue;
    /** GETTER
     * Number of retries
     */
    @JsonGetter("retries")
    public int getRetries ( ) { 
        return this.retries;
    }
    
    /** SETTER
     * Number of retries
     */
    @JsonSetter("retries")
    public void setRetries (int value) { 
        this.retries = value;
    }
 
    /** GETTER
     * The bank code, containing three characters. The available codes are on the API specification
     */
    @JsonGetter("bank")
    public String getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * The bank code, containing three characters. The available codes are on the API specification
     */
    @JsonSetter("bank")
    public void setBank (String value) { 
        this.bank = value;
    }
 
    /** GETTER
     * The instructions field that will be printed on the boleto.
     */
    @JsonGetter("instructions")
    public String getInstructions ( ) { 
        return this.instructions;
    }
    
    /** SETTER
     * The instructions field that will be printed on the boleto.
     */
    @JsonSetter("instructions")
    public void setInstructions (String value) { 
        this.instructions = value;
    }
 
    /** GETTER
     * Boleto due date
     */
    @JsonGetter("due_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDueAt ( ) { 
        return this.dueAt;
    }
    
    /** SETTER
     * Boleto due date
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt (DateTime value) { 
        this.dueAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billing_address")
    public BillingAddress1 getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (BillingAddress1 value) { 
        this.billingAddress = value;
    }
 
    /** GETTER
     * The address id for the billing address
     */
    @JsonGetter("billing_address_id")
    public String getBillingAddressId ( ) { 
        return this.billingAddressId;
    }
    
    /** SETTER
     * The address id for the billing address
     */
    @JsonSetter("billing_address_id")
    public void setBillingAddressId (String value) { 
        this.billingAddressId = value;
    }
 
    /** GETTER
     * Customer identification number with the bank
     */
    @JsonGetter("nosso_numero")
    public String getNossoNumero ( ) { 
        return this.nossoNumero;
    }
    
    /** SETTER
     * Customer identification number with the bank
     */
    @JsonSetter("nosso_numero")
    public void setNossoNumero (String value) { 
        this.nossoNumero = value;
    }
 
    /** GETTER
     * Boleto identification
     */
    @JsonGetter("document_number")
    public String getDocumentNumber ( ) { 
        return this.documentNumber;
    }
    
    /** SETTER
     * Boleto identification
     */
    @JsonSetter("document_number")
    public void setDocumentNumber (String value) { 
        this.documentNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("interest")
    public Interest getInterest ( ) { 
        return this.interest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("interest")
    public void setInterest (Interest value) { 
        this.interest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fine")
    public Fine getFine ( ) { 
        return this.fine;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fine")
    public void setFine (Fine value) { 
        this.fine = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("max_days_to_pay_past_due")
    public Integer getMaxDaysToPayPastDue ( ) { 
        return this.maxDaysToPayPastDue;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("max_days_to_pay_past_due")
    public void setMaxDaysToPayPastDue (Integer value) { 
        this.maxDaysToPayPastDue = value;
    }
 
}
