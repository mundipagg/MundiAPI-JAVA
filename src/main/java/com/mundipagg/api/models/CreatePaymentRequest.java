/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for CreatePaymentRequest type.
 */
public class CreatePaymentRequest {
    private String paymentMethod;
    private CreateCreditCardPaymentRequest creditCard;
    private CreateDebitCardPaymentRequest debitCard;
    private CreateBoletoPaymentRequest boleto;
    private String currency;
    private CreateVoucherPaymentRequest voucher;
    private List<CreateSplitRequest> split;
    private CreateBankTransferPaymentRequest bankTransfer;
    private String gatewayAffiliationId;
    private Integer amount;
    private CreateCheckoutPaymentRequest checkout;
    private String customerId;
    private CreateCustomerRequest customer;
    private Map<String, String> metadata;
    private CreateCashPaymentRequest cash;
    private CreatePrivateLabelPaymentRequest privateLabel;
    private CreatePixPaymentRequest pix;

    /**
     * Default constructor.
     */
    public CreatePaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentMethod  String value for paymentMethod.
     * @param  privateLabel  CreatePrivateLabelPaymentRequest value for privateLabel.
     * @param  creditCard  CreateCreditCardPaymentRequest value for creditCard.
     * @param  debitCard  CreateDebitCardPaymentRequest value for debitCard.
     * @param  boleto  CreateBoletoPaymentRequest value for boleto.
     * @param  currency  String value for currency.
     * @param  voucher  CreateVoucherPaymentRequest value for voucher.
     * @param  split  List of CreateSplitRequest value for split.
     * @param  bankTransfer  CreateBankTransferPaymentRequest value for bankTransfer.
     * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
     * @param  amount  Integer value for amount.
     * @param  checkout  CreateCheckoutPaymentRequest value for checkout.
     * @param  customerId  String value for customerId.
     * @param  customer  CreateCustomerRequest value for customer.
     * @param  metadata  Map of String, value for metadata.
     * @param  cash  CreateCashPaymentRequest value for cash.
     * @param  pix  CreatePixPaymentRequest value for pix.
     */
    public CreatePaymentRequest(
            String paymentMethod,
            CreatePrivateLabelPaymentRequest privateLabel,
            CreateCreditCardPaymentRequest creditCard,
            CreateDebitCardPaymentRequest debitCard,
            CreateBoletoPaymentRequest boleto,
            String currency,
            CreateVoucherPaymentRequest voucher,
            List<CreateSplitRequest> split,
            CreateBankTransferPaymentRequest bankTransfer,
            String gatewayAffiliationId,
            Integer amount,
            CreateCheckoutPaymentRequest checkout,
            String customerId,
            CreateCustomerRequest customer,
            Map<String, String> metadata,
            CreateCashPaymentRequest cash,
            CreatePixPaymentRequest pix) {
        this.paymentMethod = paymentMethod;
        this.creditCard = creditCard;
        this.debitCard = debitCard;
        this.boleto = boleto;
        this.currency = currency;
        this.voucher = voucher;
        this.split = split;
        this.bankTransfer = bankTransfer;
        this.gatewayAffiliationId = gatewayAffiliationId;
        this.amount = amount;
        this.checkout = checkout;
        this.customerId = customerId;
        this.customer = customer;
        this.metadata = metadata;
        this.cash = cash;
        this.privateLabel = privateLabel;
        this.pix = pix;
    }

    /**
     * Getter for PaymentMethod.
     * Payment method
     * @return Returns the String
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * Payment method
     * @param paymentMethod Value for String
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for CreditCard.
     * Settings for credit card payment
     * @return Returns the CreateCreditCardPaymentRequest
     */
    @JsonGetter("credit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateCreditCardPaymentRequest getCreditCard() {
        return creditCard;
    }

    /**
     * Setter for CreditCard.
     * Settings for credit card payment
     * @param creditCard Value for CreateCreditCardPaymentRequest
     */
    @JsonSetter("credit_card")
    public void setCreditCard(CreateCreditCardPaymentRequest creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Getter for DebitCard.
     * Settings for debit card payment
     * @return Returns the CreateDebitCardPaymentRequest
     */
    @JsonGetter("debit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateDebitCardPaymentRequest getDebitCard() {
        return debitCard;
    }

    /**
     * Setter for DebitCard.
     * Settings for debit card payment
     * @param debitCard Value for CreateDebitCardPaymentRequest
     */
    @JsonSetter("debit_card")
    public void setDebitCard(CreateDebitCardPaymentRequest debitCard) {
        this.debitCard = debitCard;
    }

    /**
     * Getter for Boleto.
     * Settings for boleto payment
     * @return Returns the CreateBoletoPaymentRequest
     */
    @JsonGetter("boleto")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateBoletoPaymentRequest getBoleto() {
        return boleto;
    }

    /**
     * Setter for Boleto.
     * Settings for boleto payment
     * @param boleto Value for CreateBoletoPaymentRequest
     */
    @JsonSetter("boleto")
    public void setBoleto(CreateBoletoPaymentRequest boleto) {
        this.boleto = boleto;
    }

    /**
     * Getter for Currency.
     * Currency. Must be informed using 3 characters
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Currency. Must be informed using 3 characters
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Voucher.
     * Settings for voucher payment
     * @return Returns the CreateVoucherPaymentRequest
     */
    @JsonGetter("voucher")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateVoucherPaymentRequest getVoucher() {
        return voucher;
    }

    /**
     * Setter for Voucher.
     * Settings for voucher payment
     * @param voucher Value for CreateVoucherPaymentRequest
     */
    @JsonSetter("voucher")
    public void setVoucher(CreateVoucherPaymentRequest voucher) {
        this.voucher = voucher;
    }

    /**
     * Getter for Split.
     * Splits
     * @return Returns the List of CreateSplitRequest
     */
    @JsonGetter("split")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateSplitRequest> getSplit() {
        return split;
    }

    /**
     * Setter for Split.
     * Splits
     * @param split Value for List of CreateSplitRequest
     */
    @JsonSetter("split")
    public void setSplit(List<CreateSplitRequest> split) {
        this.split = split;
    }

    /**
     * Getter for BankTransfer.
     * Settings for bank transfer payment
     * @return Returns the CreateBankTransferPaymentRequest
     */
    @JsonGetter("bank_transfer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateBankTransferPaymentRequest getBankTransfer() {
        return bankTransfer;
    }

    /**
     * Setter for BankTransfer.
     * Settings for bank transfer payment
     * @param bankTransfer Value for CreateBankTransferPaymentRequest
     */
    @JsonSetter("bank_transfer")
    public void setBankTransfer(CreateBankTransferPaymentRequest bankTransfer) {
        this.bankTransfer = bankTransfer;
    }

    /**
     * Getter for GatewayAffiliationId.
     * Gateway affiliation code
     * @return Returns the String
     */
    @JsonGetter("gateway_affiliation_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGatewayAffiliationId() {
        return gatewayAffiliationId;
    }

    /**
     * Setter for GatewayAffiliationId.
     * Gateway affiliation code
     * @param gatewayAffiliationId Value for String
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId(String gatewayAffiliationId) {
        this.gatewayAffiliationId = gatewayAffiliationId;
    }

    /**
     * Getter for Amount.
     * The amount of the payment, in cents
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The amount of the payment, in cents
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Checkout.
     * Settings for checkout payment
     * @return Returns the CreateCheckoutPaymentRequest
     */
    @JsonGetter("checkout")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateCheckoutPaymentRequest getCheckout() {
        return checkout;
    }

    /**
     * Setter for Checkout.
     * Settings for checkout payment
     * @param checkout Value for CreateCheckoutPaymentRequest
     */
    @JsonSetter("checkout")
    public void setCheckout(CreateCheckoutPaymentRequest checkout) {
        this.checkout = checkout;
    }

    /**
     * Getter for CustomerId.
     * Customer Id
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * Customer Id
     * @param customerId Value for String
     */
    @JsonSetter("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for Customer.
     * Customer
     * @return Returns the CreateCustomerRequest
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateCustomerRequest getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Customer
     * @param customer Value for CreateCustomerRequest
     */
    @JsonSetter("customer")
    public void setCustomer(CreateCustomerRequest customer) {
        this.customer = customer;
    }

    /**
     * Getter for Metadata.
     * Metadata
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Metadata
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Cash.
     * Settings for cash payment
     * @return Returns the CreateCashPaymentRequest
     */
    @JsonGetter("cash")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateCashPaymentRequest getCash() {
        return cash;
    }

    /**
     * Setter for Cash.
     * Settings for cash payment
     * @param cash Value for CreateCashPaymentRequest
     */
    @JsonSetter("cash")
    public void setCash(CreateCashPaymentRequest cash) {
        this.cash = cash;
    }

    /**
     * Getter for PrivateLabel.
     * Settings for private label payment
     * @return Returns the CreatePrivateLabelPaymentRequest
     */
    @JsonGetter("private_label")
    public CreatePrivateLabelPaymentRequest getPrivateLabel() {
        return privateLabel;
    }

    /**
     * Setter for PrivateLabel.
     * Settings for private label payment
     * @param privateLabel Value for CreatePrivateLabelPaymentRequest
     */
    @JsonSetter("private_label")
    public void setPrivateLabel(CreatePrivateLabelPaymentRequest privateLabel) {
        this.privateLabel = privateLabel;
    }

    /**
     * Getter for Pix.
     * Settings for pix payment
     * @return Returns the CreatePixPaymentRequest
     */
    @JsonGetter("pix")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatePixPaymentRequest getPix() {
        return pix;
    }

    /**
     * Setter for Pix.
     * Settings for pix payment
     * @param pix Value for CreatePixPaymentRequest
     */
    @JsonSetter("pix")
    public void setPix(CreatePixPaymentRequest pix) {
        this.pix = pix;
    }

    /**
     * Converts this CreatePaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePaymentRequest [" + "paymentMethod=" + paymentMethod + ", privateLabel="
                + privateLabel + ", creditCard=" + creditCard + ", debitCard=" + debitCard
                + ", boleto=" + boleto + ", currency=" + currency + ", voucher=" + voucher
                + ", split=" + split + ", bankTransfer=" + bankTransfer + ", gatewayAffiliationId="
                + gatewayAffiliationId + ", amount=" + amount + ", checkout=" + checkout
                + ", customerId=" + customerId + ", customer=" + customer + ", metadata=" + metadata
                + ", cash=" + cash + ", pix=" + pix + "]";
    }

    /**
     * Builds a new {@link CreatePaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentMethod, privateLabel)
                .creditCard(getCreditCard())
                .debitCard(getDebitCard())
                .boleto(getBoleto())
                .currency(getCurrency())
                .voucher(getVoucher())
                .split(getSplit())
                .bankTransfer(getBankTransfer())
                .gatewayAffiliationId(getGatewayAffiliationId())
                .amount(getAmount())
                .checkout(getCheckout())
                .customerId(getCustomerId())
                .customer(getCustomer())
                .metadata(getMetadata())
                .cash(getCash())
                .pix(getPix());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePaymentRequest}.
     */
    public static class Builder {
        private String paymentMethod;
        private CreatePrivateLabelPaymentRequest privateLabel;
        private CreateCreditCardPaymentRequest creditCard;
        private CreateDebitCardPaymentRequest debitCard;
        private CreateBoletoPaymentRequest boleto;
        private String currency;
        private CreateVoucherPaymentRequest voucher;
        private List<CreateSplitRequest> split;
        private CreateBankTransferPaymentRequest bankTransfer;
        private String gatewayAffiliationId;
        private Integer amount;
        private CreateCheckoutPaymentRequest checkout;
        private String customerId;
        private CreateCustomerRequest customer;
        private Map<String, String> metadata;
        private CreateCashPaymentRequest cash;
        private CreatePixPaymentRequest pix;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentMethod  String value for paymentMethod.
         * @param  privateLabel  CreatePrivateLabelPaymentRequest value for privateLabel.
         */
        public Builder(String paymentMethod, CreatePrivateLabelPaymentRequest privateLabel) {
            this.paymentMethod = paymentMethod;
            this.privateLabel = privateLabel;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  String value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for privateLabel.
         * @param  privateLabel  CreatePrivateLabelPaymentRequest value for privateLabel.
         * @return Builder
         */
        public Builder privateLabel(CreatePrivateLabelPaymentRequest privateLabel) {
            this.privateLabel = privateLabel;
            return this;
        }

        /**
         * Setter for creditCard.
         * @param  creditCard  CreateCreditCardPaymentRequest value for creditCard.
         * @return Builder
         */
        public Builder creditCard(CreateCreditCardPaymentRequest creditCard) {
            this.creditCard = creditCard;
            return this;
        }

        /**
         * Setter for debitCard.
         * @param  debitCard  CreateDebitCardPaymentRequest value for debitCard.
         * @return Builder
         */
        public Builder debitCard(CreateDebitCardPaymentRequest debitCard) {
            this.debitCard = debitCard;
            return this;
        }

        /**
         * Setter for boleto.
         * @param  boleto  CreateBoletoPaymentRequest value for boleto.
         * @return Builder
         */
        public Builder boleto(CreateBoletoPaymentRequest boleto) {
            this.boleto = boleto;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for voucher.
         * @param  voucher  CreateVoucherPaymentRequest value for voucher.
         * @return Builder
         */
        public Builder voucher(CreateVoucherPaymentRequest voucher) {
            this.voucher = voucher;
            return this;
        }

        /**
         * Setter for split.
         * @param  split  List of CreateSplitRequest value for split.
         * @return Builder
         */
        public Builder split(List<CreateSplitRequest> split) {
            this.split = split;
            return this;
        }

        /**
         * Setter for bankTransfer.
         * @param  bankTransfer  CreateBankTransferPaymentRequest value for bankTransfer.
         * @return Builder
         */
        public Builder bankTransfer(CreateBankTransferPaymentRequest bankTransfer) {
            this.bankTransfer = bankTransfer;
            return this;
        }

        /**
         * Setter for gatewayAffiliationId.
         * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
         * @return Builder
         */
        public Builder gatewayAffiliationId(String gatewayAffiliationId) {
            this.gatewayAffiliationId = gatewayAffiliationId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for checkout.
         * @param  checkout  CreateCheckoutPaymentRequest value for checkout.
         * @return Builder
         */
        public Builder checkout(CreateCheckoutPaymentRequest checkout) {
            this.checkout = checkout;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  CreateCustomerRequest value for customer.
         * @return Builder
         */
        public Builder customer(CreateCustomerRequest customer) {
            this.customer = customer;
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
         * Setter for cash.
         * @param  cash  CreateCashPaymentRequest value for cash.
         * @return Builder
         */
        public Builder cash(CreateCashPaymentRequest cash) {
            this.cash = cash;
            return this;
        }

        /**
         * Setter for pix.
         * @param  pix  CreatePixPaymentRequest value for pix.
         * @return Builder
         */
        public Builder pix(CreatePixPaymentRequest pix) {
            this.pix = pix;
            return this;
        }

        /**
         * Builds a new {@link CreatePaymentRequest} object using the set fields.
         * @return {@link CreatePaymentRequest}
         */
        public CreatePaymentRequest build() {
            return new CreatePaymentRequest(paymentMethod, privateLabel, creditCard, debitCard,
                    boleto, currency, voucher, split, bankTransfer, gatewayAffiliationId, amount,
                    checkout, customerId, customer, metadata, cash, pix);
        }
    }
}
