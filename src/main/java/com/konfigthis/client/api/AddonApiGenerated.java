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


import com.konfigthis.client.model.AddonGetDetailsResponse;
import com.konfigthis.client.model.AddonListAvailableAddonsResponseInner;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AddonApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AddonApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AddonApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAddonListCall(String companyDomain, String subscriptionUniqueId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/{companyDomain}/subscriptions/{subscriptionUniqueId}/addons"
            .replace("{" + "companyDomain" + "}", localVarApiClient.escapeString(companyDomain.toString()))
            .replace("{" + "subscriptionUniqueId" + "}", localVarApiClient.escapeString(subscriptionUniqueId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAddonListValidateBeforeCall(String companyDomain, String subscriptionUniqueId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyDomain' is set
        if (companyDomain == null) {
            throw new ApiException("Missing the required parameter 'companyDomain' when calling getAddonList(Async)");
        }

        // verify the required parameter 'subscriptionUniqueId' is set
        if (subscriptionUniqueId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionUniqueId' when calling getAddonList(Async)");
        }

        return getAddonListCall(companyDomain, subscriptionUniqueId, _callback);

    }


    private ApiResponse<String> getAddonListWithHttpInfo(String companyDomain, String subscriptionUniqueId) throws ApiException {
        okhttp3.Call localVarCall = getAddonListValidateBeforeCall(companyDomain, subscriptionUniqueId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAddonListAsync(String companyDomain, String subscriptionUniqueId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddonListValidateBeforeCall(companyDomain, subscriptionUniqueId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAddonListRequestBuilder {
        private final String companyDomain;
        private final String subscriptionUniqueId;

        private GetAddonListRequestBuilder(String companyDomain, String subscriptionUniqueId) {
            this.companyDomain = companyDomain;
            this.subscriptionUniqueId = subscriptionUniqueId;
        }

        /**
         * Build call for getAddonList
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
            return getAddonListCall(companyDomain, subscriptionUniqueId, _callback);
        }


        /**
         * Execute getAddonList request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = getAddonListWithHttpInfo(companyDomain, subscriptionUniqueId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAddonList request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return getAddonListWithHttpInfo(companyDomain, subscriptionUniqueId);
        }

        /**
         * Execute getAddonList request (asynchronously)
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
            return getAddonListAsync(companyDomain, subscriptionUniqueId, _callback);
        }
    }

    /**
     * Get add-ons for specific subscription
     * 
     * @param companyDomain Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets (required)
     * @param subscriptionUniqueId The unique identifier of the subscription in the Billsby platform (required)
     * @return GetAddonListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetAddonListRequestBuilder getAddonList(String companyDomain, String subscriptionUniqueId) throws IllegalArgumentException {
        if (companyDomain == null) throw new IllegalArgumentException("\"companyDomain\" is required but got null");
            

        if (subscriptionUniqueId == null) throw new IllegalArgumentException("\"subscriptionUniqueId\" is required but got null");
            

        return new GetAddonListRequestBuilder(companyDomain, subscriptionUniqueId);
    }
    private okhttp3.Call getDetailsCall(String companyDomain, Integer addonId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/{companyDomain}/addons/{addonId}"
            .replace("{" + "companyDomain" + "}", localVarApiClient.escapeString(companyDomain.toString()))
            .replace("{" + "addonId" + "}", localVarApiClient.escapeString(addonId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDetailsValidateBeforeCall(String companyDomain, Integer addonId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyDomain' is set
        if (companyDomain == null) {
            throw new ApiException("Missing the required parameter 'companyDomain' when calling getDetails(Async)");
        }

        // verify the required parameter 'addonId' is set
        if (addonId == null) {
            throw new ApiException("Missing the required parameter 'addonId' when calling getDetails(Async)");
        }

        return getDetailsCall(companyDomain, addonId, _callback);

    }


    private ApiResponse<AddonGetDetailsResponse> getDetailsWithHttpInfo(String companyDomain, Integer addonId) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(companyDomain, addonId, null);
        Type localVarReturnType = new TypeToken<AddonGetDetailsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(String companyDomain, Integer addonId, final ApiCallback<AddonGetDetailsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(companyDomain, addonId, _callback);
        Type localVarReturnType = new TypeToken<AddonGetDetailsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final String companyDomain;
        private final Integer addonId;

        private GetDetailsRequestBuilder(String companyDomain, Integer addonId) {
            this.companyDomain = companyDomain;
            this.addonId = addonId;
        }

        /**
         * Build call for getDetails
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
            return getDetailsCall(companyDomain, addonId, _callback);
        }


        /**
         * Execute getDetails request
         * @return AddonGetDetailsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public AddonGetDetailsResponse execute() throws ApiException {
            ApiResponse<AddonGetDetailsResponse> localVarResp = getDetailsWithHttpInfo(companyDomain, addonId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;AddonGetDetailsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AddonGetDetailsResponse> executeWithHttpInfo() throws ApiException {
            return getDetailsWithHttpInfo(companyDomain, addonId);
        }

        /**
         * Execute getDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AddonGetDetailsResponse> _callback) throws ApiException {
            return getDetailsAsync(companyDomain, addonId, _callback);
        }
    }

    /**
     * Get add-on details
     * 
     * @param companyDomain Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets (required)
     * @param addonId The unique identifier of the add-on in the Billsby platform (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(String companyDomain, Integer addonId) throws IllegalArgumentException {
        if (companyDomain == null) throw new IllegalArgumentException("\"companyDomain\" is required but got null");
            

        if (addonId == null) throw new IllegalArgumentException("\"addonId\" is required but got null");
        return new GetDetailsRequestBuilder(companyDomain, addonId);
    }
    private okhttp3.Call listAvailableAddonsCall(String companyDomain, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/{companyDomain}/addons"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAvailableAddonsValidateBeforeCall(String companyDomain, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyDomain' is set
        if (companyDomain == null) {
            throw new ApiException("Missing the required parameter 'companyDomain' when calling listAvailableAddons(Async)");
        }

        return listAvailableAddonsCall(companyDomain, _callback);

    }


    private ApiResponse<List<AddonListAvailableAddonsResponseInner>> listAvailableAddonsWithHttpInfo(String companyDomain) throws ApiException {
        okhttp3.Call localVarCall = listAvailableAddonsValidateBeforeCall(companyDomain, null);
        Type localVarReturnType = new TypeToken<List<AddonListAvailableAddonsResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAvailableAddonsAsync(String companyDomain, final ApiCallback<List<AddonListAvailableAddonsResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAvailableAddonsValidateBeforeCall(companyDomain, _callback);
        Type localVarReturnType = new TypeToken<List<AddonListAvailableAddonsResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAvailableAddonsRequestBuilder {
        private final String companyDomain;

        private ListAvailableAddonsRequestBuilder(String companyDomain) {
            this.companyDomain = companyDomain;
        }

        /**
         * Build call for listAvailableAddons
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
            return listAvailableAddonsCall(companyDomain, _callback);
        }


        /**
         * Execute listAvailableAddons request
         * @return List&lt;AddonListAvailableAddonsResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public List<AddonListAvailableAddonsResponseInner> execute() throws ApiException {
            ApiResponse<List<AddonListAvailableAddonsResponseInner>> localVarResp = listAvailableAddonsWithHttpInfo(companyDomain);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAvailableAddons request with HTTP info returned
         * @return ApiResponse&lt;List&lt;AddonListAvailableAddonsResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<AddonListAvailableAddonsResponseInner>> executeWithHttpInfo() throws ApiException {
            return listAvailableAddonsWithHttpInfo(companyDomain);
        }

        /**
         * Execute listAvailableAddons request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<AddonListAvailableAddonsResponseInner>> _callback) throws ApiException {
            return listAvailableAddonsAsync(companyDomain, _callback);
        }
    }

    /**
     * Get a list of available add-ons
     * 
     * @param companyDomain Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets (required)
     * @return ListAvailableAddonsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public ListAvailableAddonsRequestBuilder listAvailableAddons(String companyDomain) throws IllegalArgumentException {
        if (companyDomain == null) throw new IllegalArgumentException("\"companyDomain\" is required but got null");
            

        return new ListAvailableAddonsRequestBuilder(companyDomain);
    }
}
