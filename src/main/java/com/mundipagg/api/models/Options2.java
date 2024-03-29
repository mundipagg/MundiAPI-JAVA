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
public class Options2 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6762611228987747396L;
    private Boolean liable;
    private Boolean chargeProcessingFee;
    private Boolean chargeRemainderFee;
    /** GETTER
     * Liable options
     */
    @JsonGetter("liable")
    public Boolean getLiable ( ) { 
        return this.liable;
    }
    
    /** SETTER
     * Liable options
     */
    @JsonSetter("liable")
    public void setLiable (Boolean value) { 
        this.liable = value;
    }
 
    /** GETTER
     * Charge processing fee
     */
    @JsonGetter("charge_processing_fee")
    public Boolean getChargeProcessingFee ( ) { 
        return this.chargeProcessingFee;
    }
    
    /** SETTER
     * Charge processing fee
     */
    @JsonSetter("charge_processing_fee")
    public void setChargeProcessingFee (Boolean value) { 
        this.chargeProcessingFee = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("charge_remainder_fee")
    public Boolean getChargeRemainderFee ( ) { 
        return this.chargeRemainderFee;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("charge_remainder_fee")
    public void setChargeRemainderFee (Boolean value) { 
        this.chargeRemainderFee = value;
    }
 
}
