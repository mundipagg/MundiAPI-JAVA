/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetGatewayErrorResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5534337226966885389L;
    private String message;
    /** GETTER
     * The message error
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * The message error
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
}
 