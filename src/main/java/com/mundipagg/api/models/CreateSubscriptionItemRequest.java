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
public class CreateSubscriptionItemRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4236411475784090060L;
    private String description;
    private CreatePricingSchemeRequest pricingScheme;
    private String id;
    private String planItemId;
    private List<CreateDiscountRequest> discounts;
    private String name;
    private Integer cycles;
    private Integer quantity;
    private Integer minimumPrice;
    /** GETTER
     * Item description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Item description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Pricing scheme
     */
    @JsonGetter("pricing_scheme")
    public CreatePricingSchemeRequest getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * Pricing scheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (CreatePricingSchemeRequest value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * Item id
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Item id
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Plan item id
     */
    @JsonGetter("plan_item_id")
    public String getPlanItemId ( ) { 
        return this.planItemId;
    }
    
    /** SETTER
     * Plan item id
     */
    @JsonSetter("plan_item_id")
    public void setPlanItemId (String value) { 
        this.planItemId = value;
    }
 
    /** GETTER
     * Discounts for the item
     */
    @JsonGetter("discounts")
    public List<CreateDiscountRequest> getDiscounts ( ) { 
        return this.discounts;
    }
    
    /** SETTER
     * Discounts for the item
     */
    @JsonSetter("discounts")
    public void setDiscounts (List<CreateDiscountRequest> value) { 
        this.discounts = value;
    }
 
    /** GETTER
     * Item name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Item name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Number of cycles which the item will be charged
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * Number of cycles which the item will be charged
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
    /** GETTER
     * Quantity of items
     */
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * Quantity of items
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * Minimum price
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * Minimum price
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
}
