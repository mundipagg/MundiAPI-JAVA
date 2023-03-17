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
public class Shipping 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5674411898158944608L;
    private int amount;
    private String description;
    private String recipientName;
    private String recipientPhone;
    private Address address;
    private DateTime maxDeliveryDate;
    private DateTime estimatedDeliveryDate;
    private String type;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recipient_name")
    public String getRecipientName ( ) { 
        return this.recipientName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recipient_name")
    public void setRecipientName (String value) { 
        this.recipientName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recipient_phone")
    public String getRecipientPhone ( ) { 
        return this.recipientPhone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recipient_phone")
    public void setRecipientPhone (String value) { 
        this.recipientPhone = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public Address getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (Address value) { 
        this.address = value;
    }
 
    /** GETTER
     * Data máxima de entrega
     */
    @JsonGetter("max_delivery_date")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getMaxDeliveryDate ( ) { 
        return this.maxDeliveryDate;
    }
    
    /** SETTER
     * Data máxima de entrega
     */
    @JsonSetter("max_delivery_date")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setMaxDeliveryDate (DateTime value) { 
        this.maxDeliveryDate = value;
    }
 
    /** GETTER
     * Prazo estimado de entrega
     */
    @JsonGetter("estimated_delivery_date")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getEstimatedDeliveryDate ( ) { 
        return this.estimatedDeliveryDate;
    }
    
    /** SETTER
     * Prazo estimado de entrega
     */
    @JsonSetter("estimated_delivery_date")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEstimatedDeliveryDate (DateTime value) { 
        this.estimatedDeliveryDate = value;
    }
 
    /** GETTER
     * Shipping Type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Shipping Type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
