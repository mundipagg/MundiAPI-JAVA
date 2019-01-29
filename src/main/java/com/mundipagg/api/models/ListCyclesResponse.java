/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListCyclesResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8948644361410195580L;
    private GetPeriodResponse data;
    private PagingResponse paging;
    /** GETTER
     * The subscription cycles objects
     */
    @JsonGetter("data")
    public GetPeriodResponse getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The subscription cycles objects
     */
    @JsonSetter("data")
    public void setData (GetPeriodResponse value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging object
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging object
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
