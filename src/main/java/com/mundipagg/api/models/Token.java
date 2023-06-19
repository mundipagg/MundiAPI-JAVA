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
public class Token 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8253677115599395581L;
    private String type;
    private ApplePay applePay;
    private GooglePay googlePay;
    private CreateEmvDecryptRequest emv;
    /** GETTER
     * The authentication type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The authentication type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("apple_pay")
    public ApplePay getApplePay ( ) { 
        return this.applePay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("apple_pay")
    public void setApplePay (ApplePay value) { 
        this.applePay = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("google_pay")
    public GooglePay getGooglePay ( ) { 
        return this.googlePay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("google_pay")
    public void setGooglePay (GooglePay value) { 
        this.googlePay = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("emv")
    public CreateEmvDecryptRequest getEmv ( ) { 
        return this.emv;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("emv")
    public void setEmv (CreateEmvDecryptRequest value) { 
        this.emv = value;
    }
 
}