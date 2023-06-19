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
public class SubscriptionsItemsUsagesResponse1 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7353235335620634936L;
    private List<GetUsageResponse> data;
    private Paging paging;
    /** GETTER
     * The usage objects
     */
    @JsonGetter("data")
    public List<GetUsageResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The usage objects
     */
    @JsonSetter("data")
    public void setData (List<GetUsageResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("paging")
    public Paging getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paging")
    public void setPaging (Paging value) { 
        this.paging = value;
    }
 
}