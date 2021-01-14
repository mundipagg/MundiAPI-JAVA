/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetTransferSettingsResponseBuilder {
    //the instance to build
    private GetTransferSettingsResponse getTransferSettingsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetTransferSettingsResponseBuilder() {
        getTransferSettingsResponse = new GetTransferSettingsResponse();
    }

    public GetTransferSettingsResponseBuilder transferEnabled(boolean transferEnabled) {
        getTransferSettingsResponse.setTransferEnabled(transferEnabled);
        return this;
    }

    public GetTransferSettingsResponseBuilder transferInterval(String transferInterval) {
        getTransferSettingsResponse.setTransferInterval(transferInterval);
        return this;
    }

    public GetTransferSettingsResponseBuilder transferDay(int transferDay) {
        getTransferSettingsResponse.setTransferDay(transferDay);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTransferSettingsResponse build() {
        return getTransferSettingsResponse;
    }
}