/*
 * DOJAH APIs
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.dojah.client.api;

import com.konfigthis.dojah.client.ApiCallback;
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.Pair;
import com.konfigthis.dojah.client.ProgressRequestBody;
import com.konfigthis.dojah.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.dojah.client.model.GeneralGetNubanResponse;
import com.konfigthis.dojah.client.model.GeneralGetWalletBalanceResponse;
import com.konfigthis.dojah.client.model.GetBanksResponse;
import com.konfigthis.dojah.client.model.GetBinResponse;
import com.konfigthis.dojah.client.model.GetDataPlansResponse;
import com.konfigthis.dojah.client.model.GetWalletBalanceResponse;
import com.konfigthis.dojah.client.model.PurchaseAirtimeResponse;
import com.konfigthis.dojah.client.model.PurchaseDataResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GeneralApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GeneralApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GeneralApi(ApiClient apiClient) {
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

    /**
     * Build call for getBanks
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBanksCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/general/banks";

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

        String[] localVarAuthNames = new String[] { "apikeyAuth", "appIdAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBanksValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getBanksCall(_callback);

    }

    /**
     * General - Get Banks
     * 
     * @return GetBanksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetBanksResponse getBanks() throws ApiException {
        ApiResponse<GetBanksResponse> localVarResp = getBanksWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * General - Get Banks
     * 
     * @return ApiResponse&lt;GetBanksResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetBanksResponse> getBanksWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getBanksValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetBanksResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * General - Get Banks (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBanksAsync(final ApiCallback<GetBanksResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBanksValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetBanksResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBin
     * @param cardBin  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBinCall(Integer cardBin, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/general/bin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cardBin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("card_bin", cardBin));
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

        String[] localVarAuthNames = new String[] { "apikeyAuth", "appIdAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBinValidateBeforeCall(Integer cardBin, final ApiCallback _callback) throws ApiException {
        return getBinCall(cardBin, _callback);

    }

    /**
     * General Resolve BIN
     * 
     * @param cardBin  (optional)
     * @return GetBinResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetBinResponse getBin(Integer cardBin) throws ApiException {
        ApiResponse<GetBinResponse> localVarResp = getBinWithHttpInfo(cardBin);
        return localVarResp.getData();
    }

    /**
     * General Resolve BIN
     * 
     * @param cardBin  (optional)
     * @return ApiResponse&lt;GetBinResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetBinResponse> getBinWithHttpInfo(Integer cardBin) throws ApiException {
        okhttp3.Call localVarCall = getBinValidateBeforeCall(cardBin, null);
        Type localVarReturnType = new TypeToken<GetBinResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * General Resolve BIN (asynchronously)
     * 
     * @param cardBin  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBinAsync(Integer cardBin, final ApiCallback<GetBinResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBinValidateBeforeCall(cardBin, _callback);
        Type localVarReturnType = new TypeToken<GetBinResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDataPlans
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDataPlansCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/purchase/data/plans";

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

        String[] localVarAuthNames = new String[] { "apikeyAuth", "appIdAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDataPlansValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getDataPlansCall(_callback);

    }

    /**
     * Purchase - Get Data Plans
     * 
     * @return GetDataPlansResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetDataPlansResponse getDataPlans() throws ApiException {
        ApiResponse<GetDataPlansResponse> localVarResp = getDataPlansWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Purchase - Get Data Plans
     * 
     * @return ApiResponse&lt;GetDataPlansResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetDataPlansResponse> getDataPlansWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getDataPlansValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetDataPlansResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Purchase - Get Data Plans (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDataPlansAsync(final ApiCallback<GetDataPlansResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDataPlansValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetDataPlansResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNuban
     * @param bankCode  (optional)
     * @param accountNumber  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getNubanCall(Integer bankCode, Integer accountNumber, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/general/account";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (bankCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bank_code", bankCode));
        }

        if (accountNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_number", accountNumber));
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

        String[] localVarAuthNames = new String[] { "apikeyAuth", "appIdAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getNubanValidateBeforeCall(Integer bankCode, Integer accountNumber, final ApiCallback _callback) throws ApiException {
        return getNubanCall(bankCode, accountNumber, _callback);

    }

    /**
     * General Resolve NUBAN
     * 
     * @param bankCode  (optional)
     * @param accountNumber  (optional)
     * @return GeneralGetNubanResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  </td></tr>
     </table>
     */
    public GeneralGetNubanResponse getNuban(Integer bankCode, Integer accountNumber) throws ApiException {
        ApiResponse<GeneralGetNubanResponse> localVarResp = getNubanWithHttpInfo(bankCode, accountNumber);
        return localVarResp.getData();
    }

    /**
     * General Resolve NUBAN
     * 
     * @param bankCode  (optional)
     * @param accountNumber  (optional)
     * @return ApiResponse&lt;GeneralGetNubanResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<GeneralGetNubanResponse> getNubanWithHttpInfo(Integer bankCode, Integer accountNumber) throws ApiException {
        okhttp3.Call localVarCall = getNubanValidateBeforeCall(bankCode, accountNumber, null);
        Type localVarReturnType = new TypeToken<GeneralGetNubanResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * General Resolve NUBAN (asynchronously)
     * 
     * @param bankCode  (optional)
     * @param accountNumber  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getNubanAsync(Integer bankCode, Integer accountNumber, final ApiCallback<GeneralGetNubanResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNubanValidateBeforeCall(bankCode, accountNumber, _callback);
        Type localVarReturnType = new TypeToken<GeneralGetNubanResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWalletBalance
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWalletBalanceCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/balance";

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

        String[] localVarAuthNames = new String[] { "apikeyAuth", "appIdAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWalletBalanceValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getWalletBalanceCall(_callback);

    }

    /**
     * Get Dojah Wallet Balance
     * 
     * @return GetWalletBalanceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetWalletBalanceResponse getWalletBalance() throws ApiException {
        ApiResponse<GetWalletBalanceResponse> localVarResp = getWalletBalanceWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Dojah Wallet Balance
     * 
     * @return ApiResponse&lt;GetWalletBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetWalletBalanceResponse> getWalletBalanceWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getWalletBalanceValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetWalletBalanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Dojah Wallet Balance (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWalletBalanceAsync(final ApiCallback<GetWalletBalanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWalletBalanceValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetWalletBalanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for purchaseAirtime
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call purchaseAirtimeCall(Object body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/purchase/airtime";

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

        String[] localVarAuthNames = new String[] { "apikeyAuth", "appIdAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call purchaseAirtimeValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        return purchaseAirtimeCall(body, _callback);

    }

    /**
     * Purchase - Send Airtime
     * 
     * @param body  (optional)
     * @return PurchaseAirtimeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PurchaseAirtimeResponse purchaseAirtime(Object body) throws ApiException {
        ApiResponse<PurchaseAirtimeResponse> localVarResp = purchaseAirtimeWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Purchase - Send Airtime
     * 
     * @param body  (optional)
     * @return ApiResponse&lt;PurchaseAirtimeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PurchaseAirtimeResponse> purchaseAirtimeWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = purchaseAirtimeValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<PurchaseAirtimeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Purchase - Send Airtime (asynchronously)
     * 
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call purchaseAirtimeAsync(Object body, final ApiCallback<PurchaseAirtimeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = purchaseAirtimeValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<PurchaseAirtimeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for purchaseData
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call purchaseDataCall(Object body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/purchase/data";

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

        String[] localVarAuthNames = new String[] { "apikeyAuth", "appIdAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call purchaseDataValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        return purchaseDataCall(body, _callback);

    }

    /**
     * Purchase - Buy Data
     * 
     * @param body  (optional)
     * @return PurchaseDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public PurchaseDataResponse purchaseData(Object body) throws ApiException {
        ApiResponse<PurchaseDataResponse> localVarResp = purchaseDataWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Purchase - Buy Data
     * 
     * @param body  (optional)
     * @return ApiResponse&lt;PurchaseDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PurchaseDataResponse> purchaseDataWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = purchaseDataValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<PurchaseDataResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Purchase - Buy Data (asynchronously)
     * 
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call purchaseDataAsync(Object body, final ApiCallback<PurchaseDataResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = purchaseDataValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<PurchaseDataResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}