/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class Create3DSAuthentiticationRequestBuilder {
    //the instance to build
    private Create3DSAuthentiticationRequest create3DSAuthentiticationRequest;

    /**
     * Default constructor to initialize the instance
     */
    public Create3DSAuthentiticationRequestBuilder() {
        create3DSAuthentiticationRequest = new Create3DSAuthentiticationRequest();
    }

    /**
     * The MPI Vendor (MerchantPlugin)
     */
    public Create3DSAuthentiticationRequestBuilder mpi(String mpi) {
        create3DSAuthentiticationRequest.setMpi(mpi);
        return this;
    }

    /**
     * The Cardholder Authentication Verification value
     */
    public Create3DSAuthentiticationRequestBuilder cavv(String cavv) {
        create3DSAuthentiticationRequest.setCavv(cavv);
        return this;
    }

    /**
     * The Electronic Commerce Indicator value
     */
    public Create3DSAuthentiticationRequestBuilder eci(String eci) {
        create3DSAuthentiticationRequest.setEci(eci);
        return this;
    }

    /**
     * The TransactionId value (XID)
     */
    public Create3DSAuthentiticationRequestBuilder transactionId(String transactionId) {
        create3DSAuthentiticationRequest.setTransactionId(transactionId);
        return this;
    }

    /**
     * The success URL after the authentication
     */
    public Create3DSAuthentiticationRequestBuilder successUrl(String successUrl) {
        create3DSAuthentiticationRequest.setSuccessUrl(successUrl);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Create3DSAuthentiticationRequest build() {
        return create3DSAuthentiticationRequest;
    }
}