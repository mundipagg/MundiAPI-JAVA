/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.mundipagg.api.*;
import com.mundipagg.api.models.*;
import com.mundipagg.api.exceptions.*;
import com.mundipagg.api.http.client.HttpClient;
import com.mundipagg.api.http.client.HttpContext;
import com.mundipagg.api.http.request.HttpRequest;
import com.mundipagg.api.http.response.HttpResponse;
import com.mundipagg.api.http.response.HttpStringResponse;
import com.mundipagg.api.http.client.APICallBack;
import com.mundipagg.api.controllers.syncwrapper.APICallBackCatcher;

public class TransfersController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static TransfersController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TransfersController class 
     */
    public static TransfersController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new TransfersController();
                }
            }
        }
        return instance;
    }

    /**
     * CreateTransfer
     * @param    body    Required parameter: Example: 
     * @return    Returns the GetTransfer response from the API call 
     */
    public GetTransfer postCreateTransfer(
                final CreateTransfer body
    ) throws Throwable {

        HttpRequest _request = _buildPostCreateTransferRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handlePostCreateTransferResponse(_context);
    }

    /**
     * CreateTransfer
     * @param    body    Required parameter: Example: 
     */
    public void postCreateTransferAsync(
                final CreateTransfer body,
                final APICallBack<GetTransfer> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildPostCreateTransferRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            GetTransfer returnValue = _handlePostCreateTransferResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for postCreateTransfer
     */
    private HttpRequest _buildPostCreateTransferRequest(
                final CreateTransfer body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/transfers/recipients");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("Content-Type", "application/json");
        _headers.put("ServiceRefererName", Configuration.serviceRefererName);

        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body),
                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for postCreateTransfer
     * @return An object of type GetTransfer
     */
    private GetTransfer _handlePostCreateTransferResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new MErrorException("Invalid request", _context);
        }
        if (_responseCode == 401) {
            throw new MErrorException("Invalid API key", _context);
        }
        if (_responseCode == 404) {
            throw new MErrorException("An informed resource was not found", _context);
        }
        if (_responseCode == 412) {
            throw new MErrorException("Business validation error", _context);
        }
        if (_responseCode == 422) {
            throw new MErrorException("Contract validation error", _context);
        }
        if (_responseCode == 500) {
            throw new MErrorException("Internal server error", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        GetTransfer _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetTransfer>(){});

        return _result;
    }

    /**
     * GetTransferById
     * @param    transferId    Required parameter: Example: 
     * @return    Returns the GetTransfer response from the API call 
     */
    public GetTransfer getTransferById(
                final String transferId
    ) throws Throwable {

        HttpRequest _request = _buildGetTransferByIdRequest(transferId);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetTransferByIdResponse(_context);
    }

    /**
     * GetTransferById
     * @param    transferId    Required parameter: Example: 
     */
    public void getTransferByIdAsync(
                final String transferId,
                final APICallBack<GetTransfer> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetTransferByIdRequest(transferId);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            GetTransfer returnValue = _handleGetTransferByIdResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getTransferById
     */
    private HttpRequest _buildGetTransferByIdRequest(
                final String transferId) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/transfers/{transfer_id}");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("transfer_id", transferId);
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("ServiceRefererName", Configuration.serviceRefererName);

        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getTransferById
     * @return An object of type GetTransfer
     */
    private GetTransfer _handleGetTransferByIdResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new MErrorException("Invalid request", _context);
        }
        if (_responseCode == 401) {
            throw new MErrorException("Invalid API key", _context);
        }
        if (_responseCode == 404) {
            throw new MErrorException("An informed resource was not found", _context);
        }
        if (_responseCode == 412) {
            throw new MErrorException("Business validation error", _context);
        }
        if (_responseCode == 422) {
            throw new MErrorException("Contract validation error", _context);
        }
        if (_responseCode == 500) {
            throw new MErrorException("Internal server error", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        GetTransfer _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetTransfer>(){});

        return _result;
    }

    /**
     * Gets all transfers
     * @return    Returns the ListTransfers response from the API call 
     */
    public ListTransfers getTransfers1(
    ) throws Throwable {

        HttpRequest _request = _buildGetTransfers1Request();
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetTransfers1Response(_context);
    }

    /**
     * Gets all transfers
     */
    public void getTransfers1Async(
                final APICallBack<ListTransfers> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetTransfers1Request();
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            ListTransfers returnValue = _handleGetTransfers1Response(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getTransfers1
     */
    private HttpRequest _buildGetTransfers1Request() throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/transfers");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("ServiceRefererName", Configuration.serviceRefererName);

        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getTransfers1
     * @return An object of type ListTransfers
     */
    private ListTransfers _handleGetTransfers1Response(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new MErrorException("Invalid request", _context);
        }
        if (_responseCode == 401) {
            throw new MErrorException("Invalid API key", _context);
        }
        if (_responseCode == 404) {
            throw new MErrorException("An informed resource was not found", _context);
        }
        if (_responseCode == 412) {
            throw new MErrorException("Business validation error", _context);
        }
        if (_responseCode == 422) {
            throw new MErrorException("Contract validation error", _context);
        }
        if (_responseCode == 500) {
            throw new MErrorException("Internal server error", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        ListTransfers _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ListTransfers>(){});

        return _result;
    }

}
