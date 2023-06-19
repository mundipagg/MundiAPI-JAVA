/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mundipagg.api.models.*;
import com.mundipagg.api.exceptions.*;
import com.mundipagg.api.APIHelper;
import com.mundipagg.api.DateTimeHelper;
import com.mundipagg.api.Configuration;
import com.mundipagg.api.testing.TestHelper;
import com.mundipagg.api.controllers.CustomersController;

import com.fasterxml.jackson.core.type.TypeReference;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class CustomersControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static CustomersController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getCustomers();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Get all Customers
     * @throws Throwable
     */
    @Test
    public void testTestGetCustomers() throws Throwable {
        // Parameters for the API call
        String name = null;
        String document = null;
        Integer page = 1;
        Integer size = 10;
        String email = null;
        String code = null;

        // Set callback and perform API call
        CustomersResponse3 result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getCustomers(name, document, page, size, email, code);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

}