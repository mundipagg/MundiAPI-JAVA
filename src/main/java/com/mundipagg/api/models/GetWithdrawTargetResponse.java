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
public class GetWithdrawTargetResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5995179009060497945L;
    private String targetId;
    private String type;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("target_id")
    public String getTargetId ( ) { 
        return this.targetId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("target_id")
    public void setTargetId (String value) { 
        this.targetId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
