/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateSubscriptionDueDaysRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5205493048593181226L;
    private int boletoDueDays;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("boleto_due_days")
    public int getBoletoDueDays ( ) { 
        return this.boletoDueDays;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("boleto_due_days")
    public void setBoletoDueDays (int value) { 
        this.boletoDueDays = value;
    }
 
}
 