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
public class ListInvoicesResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4930229781556540225L;
    private List<GetInvoiceResponse> data;
    private Paging paging;
    /** GETTER
     * The Invoice objects
     */
    @JsonGetter("data")
    public List<GetInvoiceResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The Invoice objects
     */
    @JsonSetter("data")
    public void setData (List<GetInvoiceResponse> value) { 
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
