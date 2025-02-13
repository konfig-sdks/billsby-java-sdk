/*
 * Billsby API
 * Billsby is a feature-rich \"Saas\" recurring payment platform, ranked as the leading subscription billing software by G2.  Billsby is designed to ensure customers can go live quickly, often within 1-2 hours.  To help facilitate this process we have a team of friendly knowledgeable advisors ready to help your business go live.      Billsby specializes in providing great customer service at an affordable price point - our technology is rated No 1 on G2 by our customers.  If you are a developer creating a solution for your customer, Billsby has a friendly well-documented API.  The Billsby team are here to provide support to developers in order to ensure a smooth migration or new system build.   Why not book a call, talk through your Billing requirements and we can let you know how we can help you transform your business..
 *
 * The version of the OpenAPI document: 1.3.5
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CustomFieldCreateNewFieldRequest;
import com.konfigthis.client.model.CustomFieldGetResponseResponseInner;
import com.konfigthis.client.model.CustomFieldListResponseInner;
import com.konfigthis.client.model.CustomFieldUpdateFieldRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CustomFieldApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CustomFieldApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CustomFieldApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getSec0() == null) {
            throw new IllegalArgumentException("\"ApiKey\" is required but no API key was provided. Please set \"ApiKey\" with ApiClient#setSec0(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createNewFieldCall(String companyDomain, CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = customFieldCreateNewFieldRequest;

        // create path and map variables
        String localVarPath = "/{companyDomain}/customfields"
            .replace("{" + "companyDomain" + "}", localVarApiClient.escapeString(companyDomain.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewFieldValidateBeforeCall(String companyDomain, CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyDomain' is set
        if (companyDomain == null) {
            throw new ApiException("Missing the required parameter 'companyDomain' when calling createNewField(Async)");
        }

        return createNewFieldCall(companyDomain, customFieldCreateNewFieldRequest, _callback);

    }


    private ApiResponse<String> createNewFieldWithHttpInfo(String companyDomain, CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest) throws ApiException {
        okhttp3.Call localVarCall = createNewFieldValidateBeforeCall(companyDomain, customFieldCreateNewFieldRequest, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewFieldAsync(String companyDomain, CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewFieldValidateBeforeCall(companyDomain, customFieldCreateNewFieldRequest, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewFieldRequestBuilder {
        private final String description;
        private final Integer type;
        private final String label;
        private final Boolean compulsory;
        private final String companyDomain;
        private String options;

        private CreateNewFieldRequestBuilder(String description, Integer type, String label, Boolean compulsory, String companyDomain) {
            this.description = description;
            this.type = type;
            this.label = label;
            this.compulsory = compulsory;
            this.companyDomain = companyDomain;
        }

        /**
         * Set options
         * @param options A comma separated list of option titles for DropdownField type (optional)
         * @return CreateNewFieldRequestBuilder
         */
        public CreateNewFieldRequestBuilder options(String options) {
            this.options = options;
            return this;
        }
        
        /**
         * Build call for createNewField
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest = buildBodyParams();
            return createNewFieldCall(companyDomain, customFieldCreateNewFieldRequest, _callback);
        }

        private CustomFieldCreateNewFieldRequest buildBodyParams() {
            CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest = new CustomFieldCreateNewFieldRequest();
            customFieldCreateNewFieldRequest.description(this.description);
            customFieldCreateNewFieldRequest.type(this.type);
            customFieldCreateNewFieldRequest.label(this.label);
            customFieldCreateNewFieldRequest.options(this.options);
            customFieldCreateNewFieldRequest.compulsory(this.compulsory);
            return customFieldCreateNewFieldRequest;
        }

        /**
         * Execute createNewField request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest = buildBodyParams();
            ApiResponse<String> localVarResp = createNewFieldWithHttpInfo(companyDomain, customFieldCreateNewFieldRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNewField request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest = buildBodyParams();
            return createNewFieldWithHttpInfo(companyDomain, customFieldCreateNewFieldRequest);
        }

        /**
         * Execute createNewField request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            CustomFieldCreateNewFieldRequest customFieldCreateNewFieldRequest = buildBodyParams();
            return createNewFieldAsync(companyDomain, customFieldCreateNewFieldRequest, _callback);
        }
    }

    /**
     * Create custom field
     * 
     * @param companyDomain Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets (required)
     * @return CreateNewFieldRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewFieldRequestBuilder createNewField(String description, Integer type, String label, Boolean compulsory, String companyDomain) throws IllegalArgumentException {
        if (description == null) throw new IllegalArgumentException("\"description\" is required but got null");
            

        if (type == null) throw new IllegalArgumentException("\"type\" is required but got null");
        if (label == null) throw new IllegalArgumentException("\"label\" is required but got null");
            

        if (compulsory == null) throw new IllegalArgumentException("\"compulsory\" is required but got null");
        if (companyDomain == null) throw new IllegalArgumentException("\"companyDomain\" is required but got null");
            

        return new CreateNewFieldRequestBuilder(description, type, label, compulsory, companyDomain);
    }
    private okhttp3.Call getResponseCall(String companyDomain, Integer productId, String customerUniqueId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{companyDomain}/customfieldResponses"
            .replace("{" + "companyDomain" + "}", localVarApiClient.escapeString(companyDomain.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (productId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("productId", productId));
        }

        if (customerUniqueId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customerUniqueId", customerUniqueId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getResponseValidateBeforeCall(String companyDomain, Integer productId, String customerUniqueId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyDomain' is set
        if (companyDomain == null) {
            throw new ApiException("Missing the required parameter 'companyDomain' when calling getResponse(Async)");
        }

        return getResponseCall(companyDomain, productId, customerUniqueId, _callback);

    }


    private ApiResponse<List<CustomFieldGetResponseResponseInner>> getResponseWithHttpInfo(String companyDomain, Integer productId, String customerUniqueId) throws ApiException {
        okhttp3.Call localVarCall = getResponseValidateBeforeCall(companyDomain, productId, customerUniqueId, null);
        Type localVarReturnType = new TypeToken<List<CustomFieldGetResponseResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getResponseAsync(String companyDomain, Integer productId, String customerUniqueId, final ApiCallback<List<CustomFieldGetResponseResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getResponseValidateBeforeCall(companyDomain, productId, customerUniqueId, _callback);
        Type localVarReturnType = new TypeToken<List<CustomFieldGetResponseResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetResponseRequestBuilder {
        private final String companyDomain;
        private Integer productId;
        private String customerUniqueId;

        private GetResponseRequestBuilder(String companyDomain) {
            this.companyDomain = companyDomain;
        }

        /**
         * Set productId
         * @param productId The unique identifier of the product in the Billsby platform (optional)
         * @return GetResponseRequestBuilder
         */
        public GetResponseRequestBuilder productId(Integer productId) {
            this.productId = productId;
            return this;
        }
        
        /**
         * Set customerUniqueId
         * @param customerUniqueId The unique identifier of the customer in the Billsby platform (optional)
         * @return GetResponseRequestBuilder
         */
        public GetResponseRequestBuilder customerUniqueId(String customerUniqueId) {
            this.customerUniqueId = customerUniqueId;
            return this;
        }
        
        /**
         * Build call for getResponse
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getResponseCall(companyDomain, productId, customerUniqueId, _callback);
        }


        /**
         * Execute getResponse request
         * @return List&lt;CustomFieldGetResponseResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public List<CustomFieldGetResponseResponseInner> execute() throws ApiException {
            ApiResponse<List<CustomFieldGetResponseResponseInner>> localVarResp = getResponseWithHttpInfo(companyDomain, productId, customerUniqueId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getResponse request with HTTP info returned
         * @return ApiResponse&lt;List&lt;CustomFieldGetResponseResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<CustomFieldGetResponseResponseInner>> executeWithHttpInfo() throws ApiException {
            return getResponseWithHttpInfo(companyDomain, productId, customerUniqueId);
        }

        /**
         * Execute getResponse request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<CustomFieldGetResponseResponseInner>> _callback) throws ApiException {
            return getResponseAsync(companyDomain, productId, customerUniqueId, _callback);
        }
    }

    /**
     * Custom fields response
     * 
     * @param companyDomain Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets (required)
     * @return GetResponseRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetResponseRequestBuilder getResponse(String companyDomain) throws IllegalArgumentException {
        if (companyDomain == null) throw new IllegalArgumentException("\"companyDomain\" is required but got null");
            

        return new GetResponseRequestBuilder(companyDomain);
    }
    private okhttp3.Call listCall(String companyDomain, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{companyDomain}/customfields"
            .replace("{" + "companyDomain" + "}", localVarApiClient.escapeString(companyDomain.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(String companyDomain, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyDomain' is set
        if (companyDomain == null) {
            throw new ApiException("Missing the required parameter 'companyDomain' when calling list(Async)");
        }

        return listCall(companyDomain, _callback);

    }


    private ApiResponse<List<CustomFieldListResponseInner>> listWithHttpInfo(String companyDomain) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(companyDomain, null);
        Type localVarReturnType = new TypeToken<List<CustomFieldListResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(String companyDomain, final ApiCallback<List<CustomFieldListResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(companyDomain, _callback);
        Type localVarReturnType = new TypeToken<List<CustomFieldListResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private final String companyDomain;

        private ListRequestBuilder(String companyDomain) {
            this.companyDomain = companyDomain;
        }

        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(companyDomain, _callback);
        }


        /**
         * Execute list request
         * @return List&lt;CustomFieldListResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public List<CustomFieldListResponseInner> execute() throws ApiException {
            ApiResponse<List<CustomFieldListResponseInner>> localVarResp = listWithHttpInfo(companyDomain);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;List&lt;CustomFieldListResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<CustomFieldListResponseInner>> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(companyDomain);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<CustomFieldListResponseInner>> _callback) throws ApiException {
            return listAsync(companyDomain, _callback);
        }
    }

    /**
     * Custom fields
     * 
     * @param companyDomain Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets (required)
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list(String companyDomain) throws IllegalArgumentException {
        if (companyDomain == null) throw new IllegalArgumentException("\"companyDomain\" is required but got null");
            

        return new ListRequestBuilder(companyDomain);
    }
    private okhttp3.Call updateFieldCall(String companyDomain, String customFieldId, CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = customFieldUpdateFieldRequest;

        // create path and map variables
        String localVarPath = "/{companyDomain}/customfields/{customFieldId}"
            .replace("{" + "companyDomain" + "}", localVarApiClient.escapeString(companyDomain.toString()))
            .replace("{" + "customFieldId" + "}", localVarApiClient.escapeString(customFieldId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateFieldValidateBeforeCall(String companyDomain, String customFieldId, CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyDomain' is set
        if (companyDomain == null) {
            throw new ApiException("Missing the required parameter 'companyDomain' when calling updateField(Async)");
        }

        // verify the required parameter 'customFieldId' is set
        if (customFieldId == null) {
            throw new ApiException("Missing the required parameter 'customFieldId' when calling updateField(Async)");
        }

        return updateFieldCall(companyDomain, customFieldId, customFieldUpdateFieldRequest, _callback);

    }


    private ApiResponse<String> updateFieldWithHttpInfo(String companyDomain, String customFieldId, CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest) throws ApiException {
        okhttp3.Call localVarCall = updateFieldValidateBeforeCall(companyDomain, customFieldId, customFieldUpdateFieldRequest, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateFieldAsync(String companyDomain, String customFieldId, CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFieldValidateBeforeCall(companyDomain, customFieldId, customFieldUpdateFieldRequest, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateFieldRequestBuilder {
        private final String companyDomain;
        private final String customFieldId;
        private String description;
        private String label;
        private String options;
        private Boolean compulsory;

        private UpdateFieldRequestBuilder(String companyDomain, String customFieldId) {
            this.companyDomain = companyDomain;
            this.customFieldId = customFieldId;
        }

        /**
         * Set description
         * @param description Description of the custom field (optional)
         * @return UpdateFieldRequestBuilder
         */
        public UpdateFieldRequestBuilder description(String description) {
            this.description = description;
            return this;
        }
        
        /**
         * Set label
         * @param label Title of the custom field (optional)
         * @return UpdateFieldRequestBuilder
         */
        public UpdateFieldRequestBuilder label(String label) {
            this.label = label;
            return this;
        }
        
        /**
         * Set options
         * @param options A comma separated list of option titles for DropdownField type (optional)
         * @return UpdateFieldRequestBuilder
         */
        public UpdateFieldRequestBuilder options(String options) {
            this.options = options;
            return this;
        }
        
        /**
         * Set compulsory
         * @param compulsory Is the custom field compulsory; true or false (optional)
         * @return UpdateFieldRequestBuilder
         */
        public UpdateFieldRequestBuilder compulsory(Boolean compulsory) {
            this.compulsory = compulsory;
            return this;
        }
        
        /**
         * Build call for updateField
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest = buildBodyParams();
            return updateFieldCall(companyDomain, customFieldId, customFieldUpdateFieldRequest, _callback);
        }

        private CustomFieldUpdateFieldRequest buildBodyParams() {
            CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest = new CustomFieldUpdateFieldRequest();
            customFieldUpdateFieldRequest.description(this.description);
            customFieldUpdateFieldRequest.label(this.label);
            customFieldUpdateFieldRequest.options(this.options);
            customFieldUpdateFieldRequest.compulsory(this.compulsory);
            return customFieldUpdateFieldRequest;
        }

        /**
         * Execute updateField request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest = buildBodyParams();
            ApiResponse<String> localVarResp = updateFieldWithHttpInfo(companyDomain, customFieldId, customFieldUpdateFieldRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateField request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest = buildBodyParams();
            return updateFieldWithHttpInfo(companyDomain, customFieldId, customFieldUpdateFieldRequest);
        }

        /**
         * Execute updateField request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            CustomFieldUpdateFieldRequest customFieldUpdateFieldRequest = buildBodyParams();
            return updateFieldAsync(companyDomain, customFieldId, customFieldUpdateFieldRequest, _callback);
        }
    }

    /**
     * Update custom field
     * Update an existing custom field
     * @param companyDomain Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets (required)
     * @param customFieldId The unique identifier of the custom field in the Billsby platform (required)
     * @return UpdateFieldRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public UpdateFieldRequestBuilder updateField(String companyDomain, String customFieldId) throws IllegalArgumentException {
        if (companyDomain == null) throw new IllegalArgumentException("\"companyDomain\" is required but got null");
            

        if (customFieldId == null) throw new IllegalArgumentException("\"customFieldId\" is required but got null");
            

        return new UpdateFieldRequestBuilder(companyDomain, customFieldId);
    }
}
