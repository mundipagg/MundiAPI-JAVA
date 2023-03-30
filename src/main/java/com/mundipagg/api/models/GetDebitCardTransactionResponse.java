/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mundipagg.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for GetDebitCardTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetDebitCardTransactionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetDebitCardTransactionResponse
        extends GetTransactionResponse {
    private String statementDescriptor;
    private String acquirerName;
    private String acquirerAffiliationCode;
    private String acquirerTid;
    private String acquirerNsu;
    private String acquirerAuthCode;
    private String operationType;
    private GetCardResponse card;
    private String acquirerMessage;
    private String acquirerReturnCode;
    private String mpi;
    private String eci;
    private String authenticationType;
    private String threedAuthenticationUrl;

    /**
     * Default constructor.
     */
    public GetDebitCardTransactionResponse() {
        super();
        setTransactionType("debit_card");
    }

    /**
     * Initialization constructor.
     * @param  gatewayId  String value for gatewayId.
     * @param  amount  int value for amount.
     * @param  status  String value for status.
     * @param  success  boolean value for success.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  attemptCount  int value for attemptCount.
     * @param  maxAttempts  int value for maxAttempts.
     * @param  splits  List of GetSplitResponse value for splits.
     * @param  id  String value for id.
     * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
     * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
     * @param  split  List of GetSplitResponse value for split.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  acquirerName  String value for acquirerName.
     * @param  acquirerAffiliationCode  String value for acquirerAffiliationCode.
     * @param  acquirerTid  String value for acquirerTid.
     * @param  acquirerNsu  String value for acquirerNsu.
     * @param  acquirerAuthCode  String value for acquirerAuthCode.
     * @param  operationType  String value for operationType.
     * @param  card  GetCardResponse value for card.
     * @param  acquirerMessage  String value for acquirerMessage.
     * @param  acquirerReturnCode  String value for acquirerReturnCode.
     * @param  mpi  String value for mpi.
     * @param  eci  String value for eci.
     * @param  authenticationType  String value for authenticationType.
     * @param  threedAuthenticationUrl  String value for threedAuthenticationUrl.
     * @param  nextAttempt  LocalDateTime value for nextAttempt.
     * @param  transactionType  String value for transactionType.
     * @param  metadata  Map of String, value for metadata.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public GetDebitCardTransactionResponse(
            String gatewayId,
            int amount,
            String status,
            boolean success,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            int attemptCount,
            int maxAttempts,
            List<GetSplitResponse> splits,
            String id,
            GetGatewayResponseResponse gatewayResponse,
            GetAntifraudResponse antifraudResponse,
            List<GetSplitResponse> split,
            String statementDescriptor,
            String acquirerName,
            String acquirerAffiliationCode,
            String acquirerTid,
            String acquirerNsu,
            String acquirerAuthCode,
            String operationType,
            GetCardResponse card,
            String acquirerMessage,
            String acquirerReturnCode,
            String mpi,
            String eci,
            String authenticationType,
            String threedAuthenticationUrl,
            LocalDateTime nextAttempt,
            String transactionType,
            Map<String, String> metadata,
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, id, gatewayResponse, antifraudResponse, split, nextAttempt, transactionType,
                metadata, interest, fine, maxDaysToPayPastDue);
        this.statementDescriptor = statementDescriptor;
        this.acquirerName = acquirerName;
        this.acquirerAffiliationCode = acquirerAffiliationCode;
        this.acquirerTid = acquirerTid;
        this.acquirerNsu = acquirerNsu;
        this.acquirerAuthCode = acquirerAuthCode;
        this.operationType = operationType;
        this.card = card;
        this.acquirerMessage = acquirerMessage;
        this.acquirerReturnCode = acquirerReturnCode;
        this.mpi = mpi;
        this.eci = eci;
        this.authenticationType = authenticationType;
        this.threedAuthenticationUrl = threedAuthenticationUrl;
    }

    /**
     * Getter for StatementDescriptor.
     * Text that will appear on the debit card's statement
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Text that will appear on the debit card's statement
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for AcquirerName.
     * Acquirer name
     * @return Returns the String
     */
    @JsonGetter("acquirer_name")
    public String getAcquirerName() {
        return acquirerName;
    }

    /**
     * Setter for AcquirerName.
     * Acquirer name
     * @param acquirerName Value for String
     */
    @JsonSetter("acquirer_name")
    public void setAcquirerName(String acquirerName) {
        this.acquirerName = acquirerName;
    }

    /**
     * Getter for AcquirerAffiliationCode.
     * Aquirer affiliation code
     * @return Returns the String
     */
    @JsonGetter("acquirer_affiliation_code")
    public String getAcquirerAffiliationCode() {
        return acquirerAffiliationCode;
    }

    /**
     * Setter for AcquirerAffiliationCode.
     * Aquirer affiliation code
     * @param acquirerAffiliationCode Value for String
     */
    @JsonSetter("acquirer_affiliation_code")
    public void setAcquirerAffiliationCode(String acquirerAffiliationCode) {
        this.acquirerAffiliationCode = acquirerAffiliationCode;
    }

    /**
     * Getter for AcquirerTid.
     * Acquirer TID
     * @return Returns the String
     */
    @JsonGetter("acquirer_tid")
    public String getAcquirerTid() {
        return acquirerTid;
    }

    /**
     * Setter for AcquirerTid.
     * Acquirer TID
     * @param acquirerTid Value for String
     */
    @JsonSetter("acquirer_tid")
    public void setAcquirerTid(String acquirerTid) {
        this.acquirerTid = acquirerTid;
    }

    /**
     * Getter for AcquirerNsu.
     * Acquirer NSU
     * @return Returns the String
     */
    @JsonGetter("acquirer_nsu")
    public String getAcquirerNsu() {
        return acquirerNsu;
    }

    /**
     * Setter for AcquirerNsu.
     * Acquirer NSU
     * @param acquirerNsu Value for String
     */
    @JsonSetter("acquirer_nsu")
    public void setAcquirerNsu(String acquirerNsu) {
        this.acquirerNsu = acquirerNsu;
    }

    /**
     * Getter for AcquirerAuthCode.
     * Acquirer authorization code
     * @return Returns the String
     */
    @JsonGetter("acquirer_auth_code")
    public String getAcquirerAuthCode() {
        return acquirerAuthCode;
    }

    /**
     * Setter for AcquirerAuthCode.
     * Acquirer authorization code
     * @param acquirerAuthCode Value for String
     */
    @JsonSetter("acquirer_auth_code")
    public void setAcquirerAuthCode(String acquirerAuthCode) {
        this.acquirerAuthCode = acquirerAuthCode;
    }

    /**
     * Getter for OperationType.
     * Operation type
     * @return Returns the String
     */
    @JsonGetter("operation_type")
    public String getOperationType() {
        return operationType;
    }

    /**
     * Setter for OperationType.
     * Operation type
     * @param operationType Value for String
     */
    @JsonSetter("operation_type")
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * Getter for Card.
     * Card data
     * @return Returns the GetCardResponse
     */
    @JsonGetter("card")
    public GetCardResponse getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Card data
     * @param card Value for GetCardResponse
     */
    @JsonSetter("card")
    public void setCard(GetCardResponse card) {
        this.card = card;
    }

    /**
     * Getter for AcquirerMessage.
     * Acquirer message
     * @return Returns the String
     */
    @JsonGetter("acquirer_message")
    public String getAcquirerMessage() {
        return acquirerMessage;
    }

    /**
     * Setter for AcquirerMessage.
     * Acquirer message
     * @param acquirerMessage Value for String
     */
    @JsonSetter("acquirer_message")
    public void setAcquirerMessage(String acquirerMessage) {
        this.acquirerMessage = acquirerMessage;
    }

    /**
     * Getter for AcquirerReturnCode.
     * Acquirer Return Code
     * @return Returns the String
     */
    @JsonGetter("acquirer_return_code")
    public String getAcquirerReturnCode() {
        return acquirerReturnCode;
    }

    /**
     * Setter for AcquirerReturnCode.
     * Acquirer Return Code
     * @param acquirerReturnCode Value for String
     */
    @JsonSetter("acquirer_return_code")
    public void setAcquirerReturnCode(String acquirerReturnCode) {
        this.acquirerReturnCode = acquirerReturnCode;
    }

    /**
     * Getter for Mpi.
     * Merchant Plugin
     * @return Returns the String
     */
    @JsonGetter("mpi")
    public String getMpi() {
        return mpi;
    }

    /**
     * Setter for Mpi.
     * Merchant Plugin
     * @param mpi Value for String
     */
    @JsonSetter("mpi")
    public void setMpi(String mpi) {
        this.mpi = mpi;
    }

    /**
     * Getter for Eci.
     * Electronic Commerce Indicator (ECI)
     * @return Returns the String
     */
    @JsonGetter("eci")
    public String getEci() {
        return eci;
    }

    /**
     * Setter for Eci.
     * Electronic Commerce Indicator (ECI)
     * @param eci Value for String
     */
    @JsonSetter("eci")
    public void setEci(String eci) {
        this.eci = eci;
    }

    /**
     * Getter for AuthenticationType.
     * Authentication type
     * @return Returns the String
     */
    @JsonGetter("authentication_type")
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Setter for AuthenticationType.
     * Authentication type
     * @param authenticationType Value for String
     */
    @JsonSetter("authentication_type")
    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * Getter for ThreedAuthenticationUrl.
     * 3D-S Authentication Url
     * @return Returns the String
     */
    @JsonGetter("threed_authentication_url")
    public String getThreedAuthenticationUrl() {
        return threedAuthenticationUrl;
    }

    /**
     * Setter for ThreedAuthenticationUrl.
     * 3D-S Authentication Url
     * @param threedAuthenticationUrl Value for String
     */
    @JsonSetter("threed_authentication_url")
    public void setThreedAuthenticationUrl(String threedAuthenticationUrl) {
        this.threedAuthenticationUrl = threedAuthenticationUrl;
    }

    /**
     * Converts this GetDebitCardTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetDebitCardTransactionResponse [" + "statementDescriptor=" + statementDescriptor
                + ", acquirerName=" + acquirerName + ", acquirerAffiliationCode="
                + acquirerAffiliationCode + ", acquirerTid=" + acquirerTid + ", acquirerNsu="
                + acquirerNsu + ", acquirerAuthCode=" + acquirerAuthCode + ", operationType="
                + operationType + ", card=" + card + ", acquirerMessage=" + acquirerMessage
                + ", acquirerReturnCode=" + acquirerReturnCode + ", mpi=" + mpi + ", eci=" + eci
                + ", authenticationType=" + authenticationType + ", threedAuthenticationUrl="
                + threedAuthenticationUrl + ", gatewayId=" + getGatewayId() + ", amount="
                + getAmount() + ", status=" + getStatus() + ", success=" + getSuccess()
                + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt()
                + ", attemptCount=" + getAttemptCount() + ", maxAttempts=" + getMaxAttempts()
                + ", splits=" + getSplits() + ", id=" + getId() + ", gatewayResponse="
                + getGatewayResponse() + ", antifraudResponse=" + getAntifraudResponse()
                + ", split=" + getSplit() + ", nextAttempt=" + getNextAttempt()
                + ", transactionType=" + getTransactionType() + ", metadata=" + getMetadata()
                + ", interest=" + getInterest() + ", fine=" + getFine() + ", maxDaysToPayPastDue="
                + getMaxDaysToPayPastDue() + "]";
    }

    /**
     * Builds a new {@link GetDebitCardTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetDebitCardTransactionResponse.Builder} object
     */
    public Builder toGetDebitCardTransactionResponseBuilder() {
        Builder builder = new Builder(getGatewayId(), getAmount(), getStatus(), getSuccess(),
                getCreatedAt(), getUpdatedAt(), getAttemptCount(), getMaxAttempts(), getSplits(),
                getId(), getGatewayResponse(), getAntifraudResponse(), getSplit(),
                statementDescriptor, acquirerName, acquirerAffiliationCode, acquirerTid,
                acquirerNsu, acquirerAuthCode, operationType, card, acquirerMessage,
                acquirerReturnCode, mpi, eci, authenticationType, threedAuthenticationUrl)
                .nextAttempt(getNextAttempt())
                .transactionType(getTransactionType())
                .metadata(getMetadata())
                .interest(getInterest())
                .fine(getFine())
                .maxDaysToPayPastDue(getMaxDaysToPayPastDue());
        return builder;
    }

    /**
     * Class to build instances of {@link GetDebitCardTransactionResponse}.
     */
    public static class Builder {
        private String gatewayId;
        private int amount;
        private String status;
        private boolean success;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private int attemptCount;
        private int maxAttempts;
        private List<GetSplitResponse> splits;
        private String id;
        private GetGatewayResponseResponse gatewayResponse;
        private GetAntifraudResponse antifraudResponse;
        private List<GetSplitResponse> split;
        private String statementDescriptor;
        private String acquirerName;
        private String acquirerAffiliationCode;
        private String acquirerTid;
        private String acquirerNsu;
        private String acquirerAuthCode;
        private String operationType;
        private GetCardResponse card;
        private String acquirerMessage;
        private String acquirerReturnCode;
        private String mpi;
        private String eci;
        private String authenticationType;
        private String threedAuthenticationUrl;
        private LocalDateTime nextAttempt;
        private String transactionType = "debit_card";
        private Map<String, String> metadata;
        private GetInterestResponse interest;
        private GetFineResponse fine;
        private Integer maxDaysToPayPastDue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  gatewayId  String value for gatewayId.
         * @param  amount  int value for amount.
         * @param  status  String value for status.
         * @param  success  boolean value for success.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  attemptCount  int value for attemptCount.
         * @param  maxAttempts  int value for maxAttempts.
         * @param  splits  List of GetSplitResponse value for splits.
         * @param  id  String value for id.
         * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
         * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
         * @param  split  List of GetSplitResponse value for split.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @param  acquirerName  String value for acquirerName.
         * @param  acquirerAffiliationCode  String value for acquirerAffiliationCode.
         * @param  acquirerTid  String value for acquirerTid.
         * @param  acquirerNsu  String value for acquirerNsu.
         * @param  acquirerAuthCode  String value for acquirerAuthCode.
         * @param  operationType  String value for operationType.
         * @param  card  GetCardResponse value for card.
         * @param  acquirerMessage  String value for acquirerMessage.
         * @param  acquirerReturnCode  String value for acquirerReturnCode.
         * @param  mpi  String value for mpi.
         * @param  eci  String value for eci.
         * @param  authenticationType  String value for authenticationType.
         * @param  threedAuthenticationUrl  String value for threedAuthenticationUrl.
         */
        public Builder(String gatewayId, int amount, String status, boolean success,
                LocalDateTime createdAt, LocalDateTime updatedAt, int attemptCount, int maxAttempts,
                List<GetSplitResponse> splits, String id,
                GetGatewayResponseResponse gatewayResponse, GetAntifraudResponse antifraudResponse,
                List<GetSplitResponse> split, String statementDescriptor, String acquirerName,
                String acquirerAffiliationCode, String acquirerTid, String acquirerNsu,
                String acquirerAuthCode, String operationType, GetCardResponse card,
                String acquirerMessage, String acquirerReturnCode, String mpi, String eci,
                String authenticationType, String threedAuthenticationUrl) {
            this.gatewayId = gatewayId;
            this.amount = amount;
            this.status = status;
            this.success = success;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.attemptCount = attemptCount;
            this.maxAttempts = maxAttempts;
            this.splits = splits;
            this.id = id;
            this.gatewayResponse = gatewayResponse;
            this.antifraudResponse = antifraudResponse;
            this.split = split;
            this.statementDescriptor = statementDescriptor;
            this.acquirerName = acquirerName;
            this.acquirerAffiliationCode = acquirerAffiliationCode;
            this.acquirerTid = acquirerTid;
            this.acquirerNsu = acquirerNsu;
            this.acquirerAuthCode = acquirerAuthCode;
            this.operationType = operationType;
            this.card = card;
            this.acquirerMessage = acquirerMessage;
            this.acquirerReturnCode = acquirerReturnCode;
            this.mpi = mpi;
            this.eci = eci;
            this.authenticationType = authenticationType;
            this.threedAuthenticationUrl = threedAuthenticationUrl;
        }

        /**
         * Setter for gatewayId.
         * @param  gatewayId  String value for gatewayId.
         * @return Builder
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for success.
         * @param  success  boolean value for success.
         * @return Builder
         */
        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for attemptCount.
         * @param  attemptCount  int value for attemptCount.
         * @return Builder
         */
        public Builder attemptCount(int attemptCount) {
            this.attemptCount = attemptCount;
            return this;
        }

        /**
         * Setter for maxAttempts.
         * @param  maxAttempts  int value for maxAttempts.
         * @return Builder
         */
        public Builder maxAttempts(int maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * Setter for splits.
         * @param  splits  List of GetSplitResponse value for splits.
         * @return Builder
         */
        public Builder splits(List<GetSplitResponse> splits) {
            this.splits = splits;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for gatewayResponse.
         * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
         * @return Builder
         */
        public Builder gatewayResponse(GetGatewayResponseResponse gatewayResponse) {
            this.gatewayResponse = gatewayResponse;
            return this;
        }

        /**
         * Setter for antifraudResponse.
         * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
         * @return Builder
         */
        public Builder antifraudResponse(GetAntifraudResponse antifraudResponse) {
            this.antifraudResponse = antifraudResponse;
            return this;
        }

        /**
         * Setter for split.
         * @param  split  List of GetSplitResponse value for split.
         * @return Builder
         */
        public Builder split(List<GetSplitResponse> split) {
            this.split = split;
            return this;
        }

        /**
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
         * Setter for acquirerName.
         * @param  acquirerName  String value for acquirerName.
         * @return Builder
         */
        public Builder acquirerName(String acquirerName) {
            this.acquirerName = acquirerName;
            return this;
        }

        /**
         * Setter for acquirerAffiliationCode.
         * @param  acquirerAffiliationCode  String value for acquirerAffiliationCode.
         * @return Builder
         */
        public Builder acquirerAffiliationCode(String acquirerAffiliationCode) {
            this.acquirerAffiliationCode = acquirerAffiliationCode;
            return this;
        }

        /**
         * Setter for acquirerTid.
         * @param  acquirerTid  String value for acquirerTid.
         * @return Builder
         */
        public Builder acquirerTid(String acquirerTid) {
            this.acquirerTid = acquirerTid;
            return this;
        }

        /**
         * Setter for acquirerNsu.
         * @param  acquirerNsu  String value for acquirerNsu.
         * @return Builder
         */
        public Builder acquirerNsu(String acquirerNsu) {
            this.acquirerNsu = acquirerNsu;
            return this;
        }

        /**
         * Setter for acquirerAuthCode.
         * @param  acquirerAuthCode  String value for acquirerAuthCode.
         * @return Builder
         */
        public Builder acquirerAuthCode(String acquirerAuthCode) {
            this.acquirerAuthCode = acquirerAuthCode;
            return this;
        }

        /**
         * Setter for operationType.
         * @param  operationType  String value for operationType.
         * @return Builder
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  GetCardResponse value for card.
         * @return Builder
         */
        public Builder card(GetCardResponse card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for acquirerMessage.
         * @param  acquirerMessage  String value for acquirerMessage.
         * @return Builder
         */
        public Builder acquirerMessage(String acquirerMessage) {
            this.acquirerMessage = acquirerMessage;
            return this;
        }

        /**
         * Setter for acquirerReturnCode.
         * @param  acquirerReturnCode  String value for acquirerReturnCode.
         * @return Builder
         */
        public Builder acquirerReturnCode(String acquirerReturnCode) {
            this.acquirerReturnCode = acquirerReturnCode;
            return this;
        }

        /**
         * Setter for mpi.
         * @param  mpi  String value for mpi.
         * @return Builder
         */
        public Builder mpi(String mpi) {
            this.mpi = mpi;
            return this;
        }

        /**
         * Setter for eci.
         * @param  eci  String value for eci.
         * @return Builder
         */
        public Builder eci(String eci) {
            this.eci = eci;
            return this;
        }

        /**
         * Setter for authenticationType.
         * @param  authenticationType  String value for authenticationType.
         * @return Builder
         */
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * Setter for threedAuthenticationUrl.
         * @param  threedAuthenticationUrl  String value for threedAuthenticationUrl.
         * @return Builder
         */
        public Builder threedAuthenticationUrl(String threedAuthenticationUrl) {
            this.threedAuthenticationUrl = threedAuthenticationUrl;
            return this;
        }

        /**
         * Setter for nextAttempt.
         * @param  nextAttempt  LocalDateTime value for nextAttempt.
         * @return Builder
         */
        public Builder nextAttempt(LocalDateTime nextAttempt) {
            this.nextAttempt = nextAttempt;
            return this;
        }

        /**
         * Setter for transactionType.
         * @param  transactionType  String value for transactionType.
         * @return Builder
         */
        public Builder transactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for interest.
         * @param  interest  GetInterestResponse value for interest.
         * @return Builder
         */
        public Builder interest(GetInterestResponse interest) {
            this.interest = interest;
            return this;
        }

        /**
         * Setter for fine.
         * @param  fine  GetFineResponse value for fine.
         * @return Builder
         */
        public Builder fine(GetFineResponse fine) {
            this.fine = fine;
            return this;
        }

        /**
         * Setter for maxDaysToPayPastDue.
         * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder maxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
            this.maxDaysToPayPastDue = maxDaysToPayPastDue;
            return this;
        }

        /**
         * Builds a new {@link GetDebitCardTransactionResponse} object using the set fields.
         * @return {@link GetDebitCardTransactionResponse}
         */
        public GetDebitCardTransactionResponse build() {
            return new GetDebitCardTransactionResponse(gatewayId, amount, status, success,
                    createdAt, updatedAt, attemptCount, maxAttempts, splits, id, gatewayResponse,
                    antifraudResponse, split, statementDescriptor, acquirerName,
                    acquirerAffiliationCode, acquirerTid, acquirerNsu, acquirerAuthCode,
                    operationType, card, acquirerMessage, acquirerReturnCode, mpi, eci,
                    authenticationType, threedAuthenticationUrl, nextAttempt, transactionType,
                    metadata, interest, fine, maxDaysToPayPastDue);
        }
    }
}
