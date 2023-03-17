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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mundipagg.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonInclude(Include.ALWAYS)
public class Pix 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4744786182217995208L;
    private DateTime expiresAt;
    private Integer expiresIn;
    private List<PixAdditionalInformation> additionalInformation;
    /** GETTER
     * Datetime when pix payment will expire
     */
    @JsonGetter("expires_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getExpiresAt ( ) { 
        return this.expiresAt;
    }
    
    /** SETTER
     * Datetime when pix payment will expire
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt (DateTime value) { 
        this.expiresAt = value;
    }
 
    /** GETTER
     * Seconds until pix payment expires
     */
    @JsonGetter("expires_in")
    public Integer getExpiresIn ( ) { 
        return this.expiresIn;
    }
    
    /** SETTER
     * Seconds until pix payment expires
     */
    @JsonSetter("expires_in")
    public void setExpiresIn (Integer value) { 
        this.expiresIn = value;
    }
 
    /** GETTER
     * Pix additional information
     */
    @JsonGetter("additional_information")
    public List<PixAdditionalInformation> getAdditionalInformation ( ) { 
        return this.additionalInformation;
    }
    
    /** SETTER
     * Pix additional information
     */
    @JsonSetter("additional_information")
    public void setAdditionalInformation (List<PixAdditionalInformation> value) { 
        this.additionalInformation = value;
    }
 
}
