/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ListSubscriptionItemsResponse type.
 */
public class ListSubscriptionItemsResponse {
    private List<GetSubscriptionItemResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListSubscriptionItemsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetSubscriptionItemResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListSubscriptionItemsResponse(
            List<GetSubscriptionItemResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * The subscription items
     * @return Returns the List of GetSubscriptionItemResponse
     */
    @JsonGetter("data")
    public List<GetSubscriptionItemResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The subscription items
     * @param data Value for List of GetSubscriptionItemResponse
     */
    @JsonSetter("data")
    public void setData(List<GetSubscriptionItemResponse> data) {
        this.data = data;
    }

    /**
     * Getter for Paging.
     * Paging object
     * @return Returns the PagingResponse
     */
    @JsonGetter("paging")
    public PagingResponse getPaging() {
        return paging;
    }

    /**
     * Setter for Paging.
     * Paging object
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = paging;
    }

    /**
     * Converts this ListSubscriptionItemsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionItemsResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionItemsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionItemsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionItemsResponse}.
     */
    public static class Builder {
        private List<GetSubscriptionItemResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetSubscriptionItemResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetSubscriptionItemResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetSubscriptionItemResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetSubscriptionItemResponse> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for paging.
         * @param  paging  PagingResponse value for paging.
         * @return Builder
         */
        public Builder paging(PagingResponse paging) {
            this.paging = paging;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionItemsResponse} object using the set fields.
         * @return {@link ListSubscriptionItemsResponse}
         */
        public ListSubscriptionItemsResponse build() {
            return new ListSubscriptionItemsResponse(data, paging);
        }
    }
}
