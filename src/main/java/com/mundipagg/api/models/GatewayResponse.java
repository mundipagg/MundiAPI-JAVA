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
public class GatewayResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5953688539961258223L;
    private String code;
    private List<GetGatewayErrorResponse> errors;
    /** GETTER
     * The error code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * The error code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * The gateway response errors list
     */
    @JsonGetter("errors")
    public List<GetGatewayErrorResponse> getErrors ( ) { 
        return this.errors;
    }
    
    /** SETTER
     * The gateway response errors list
     */
    @JsonSetter("errors")
    public void setErrors (List<GetGatewayErrorResponse> value) { 
        this.errors = value;
    }
 
}
