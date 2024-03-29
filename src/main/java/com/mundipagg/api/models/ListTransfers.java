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
public class ListTransfers 
        implements java.io.Serializable {
    private static final long serialVersionUID = 7105525688805277021L;
    private List<GetTransfer> data;
    private Paging paging;
    /** GETTER
     * The Increments response
     */
    @JsonGetter("data")
    public List<GetTransfer> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The Increments response
     */
    @JsonSetter("data")
    public void setData (List<GetTransfer> value) { 
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
