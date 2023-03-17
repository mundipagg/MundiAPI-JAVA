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
public class PlansItemsRequest1 
        implements java.io.Serializable {
    private static final long serialVersionUID = 6483993962739176342L;
    private String name;
    private PricingScheme4 pricingScheme;
    private String id;
    private String description;
    private Integer cycles;
    private Integer quantity;
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
     * TODO: Write general description for this method
     */
    @JsonGetter("pricing_scheme")
    public PricingScheme4 getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (PricingScheme4 value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * Item's id
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Item's id
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Item's description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Item's description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Number of cycles where the item will be charged
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * Number of cycles where the item will be charged
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
    /** GETTER
     * Quantity
     */
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * Quantity
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
}
