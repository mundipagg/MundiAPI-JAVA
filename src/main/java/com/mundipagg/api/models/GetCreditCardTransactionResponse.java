/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonTypeInfo(
          use = JsonTypeInfo.Id.NAME,
          include = JsonTypeInfo.As.EXISTING_PROPERTY,
          property = "transaction_type",
          defaultImpl = GetCreditCardTransactionResponse.class,
          visible = true)
@JsonInclude(Include.ALWAYS)
public class GetCreditCardTransactionResponse 
        extends GetTransactionResponse {
    private static final long serialVersionUID = -154512467923565832L;
    private String statementDescriptor;
    private String acquirerName;
    private String acquirerAffiliationCode;
    private String acquirerTid;
    private String acquirerNsu;
    private String acquirerAuthCode;
    private String operationType;
    private Card card;
    private String acquirerMessage;
    private String acquirerReturnCode;
    private Integer installments;
    private String threedAuthenticationUrl;
    private String fundingSource;
    /** GETTER
     * Text that will appear on the credit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Text that will appear on the credit card's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Acquirer name
     */
    @JsonGetter("acquirer_name")
    public String getAcquirerName ( ) { 
        return this.acquirerName;
    }
    
    /** SETTER
     * Acquirer name
     */
    @JsonSetter("acquirer_name")
    public void setAcquirerName (String value) { 
        this.acquirerName = value;
    }
 
    /** GETTER
     * Aquirer affiliation code
     */
    @JsonGetter("acquirer_affiliation_code")
    public String getAcquirerAffiliationCode ( ) { 
        return this.acquirerAffiliationCode;
    }
    
    /** SETTER
     * Aquirer affiliation code
     */
    @JsonSetter("acquirer_affiliation_code")
    public void setAcquirerAffiliationCode (String value) { 
        this.acquirerAffiliationCode = value;
    }
 
    /** GETTER
     * Acquirer TID
     */
    @JsonGetter("acquirer_tid")
    public String getAcquirerTid ( ) { 
        return this.acquirerTid;
    }
    
    /** SETTER
     * Acquirer TID
     */
    @JsonSetter("acquirer_tid")
    public void setAcquirerTid (String value) { 
        this.acquirerTid = value;
    }
 
    /** GETTER
     * Acquirer NSU
     */
    @JsonGetter("acquirer_nsu")
    public String getAcquirerNsu ( ) { 
        return this.acquirerNsu;
    }
    
    /** SETTER
     * Acquirer NSU
     */
    @JsonSetter("acquirer_nsu")
    public void setAcquirerNsu (String value) { 
        this.acquirerNsu = value;
    }
 
    /** GETTER
     * Acquirer authorization code
     */
    @JsonGetter("acquirer_auth_code")
    public String getAcquirerAuthCode ( ) { 
        return this.acquirerAuthCode;
    }
    
    /** SETTER
     * Acquirer authorization code
     */
    @JsonSetter("acquirer_auth_code")
    public void setAcquirerAuthCode (String value) { 
        this.acquirerAuthCode = value;
    }
 
    /** GETTER
     * Operation type
     */
    @JsonGetter("operation_type")
    public String getOperationType ( ) { 
        return this.operationType;
    }
    
    /** SETTER
     * Operation type
     */
    @JsonSetter("operation_type")
    public void setOperationType (String value) { 
        this.operationType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("card")
    public Card getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("card")
    public void setCard (Card value) { 
        this.card = value;
    }
 
    /** GETTER
     * Acquirer message
     */
    @JsonGetter("acquirer_message")
    public String getAcquirerMessage ( ) { 
        return this.acquirerMessage;
    }
    
    /** SETTER
     * Acquirer message
     */
    @JsonSetter("acquirer_message")
    public void setAcquirerMessage (String value) { 
        this.acquirerMessage = value;
    }
 
    /** GETTER
     * Acquirer Return Code
     */
    @JsonGetter("acquirer_return_code")
    public String getAcquirerReturnCode ( ) { 
        return this.acquirerReturnCode;
    }
    
    /** SETTER
     * Acquirer Return Code
     */
    @JsonSetter("acquirer_return_code")
    public void setAcquirerReturnCode (String value) { 
        this.acquirerReturnCode = value;
    }
 
    /** GETTER
     * Number of installments
     */
    @JsonGetter("installments")
    public Integer getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Number of installments
     */
    @JsonSetter("installments")
    public void setInstallments (Integer value) { 
        this.installments = value;
    }
 
    /** GETTER
     * 3D-S authentication Url
     */
    @JsonGetter("threed_authentication_url")
    public String getThreedAuthenticationUrl ( ) { 
        return this.threedAuthenticationUrl;
    }
    
    /** SETTER
     * 3D-S authentication Url
     */
    @JsonSetter("threed_authentication_url")
    public void setThreedAuthenticationUrl (String value) { 
        this.threedAuthenticationUrl = value;
    }
 
    /** GETTER
     * Identify when a card is prepaid, credit or debit.
     */
    @JsonGetter("funding_source")
    public String getFundingSource ( ) { 
        return this.fundingSource;
    }
    
    /** SETTER
     * Identify when a card is prepaid, credit or debit.
     */
    @JsonSetter("funding_source")
    public void setFundingSource (String value) { 
        this.fundingSource = value;
    }
 
}
