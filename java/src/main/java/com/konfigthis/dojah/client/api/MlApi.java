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


import com.konfigthis.dojah.client.model.GetDocumentAnalysisRequest;
import com.konfigthis.dojah.client.model.GetDocumentAnalysisResponse;
import com.konfigthis.dojah.client.model.GetGenericOcrTextRequest;
import com.konfigthis.dojah.client.model.GetGenericOcrTextResponse;
import com.konfigthis.dojah.client.model.GetOcrTextRequest;
import com.konfigthis.dojah.client.model.GetOcrTextResponse;
import com.konfigthis.dojah.client.model.VerifyPhotoIdWithSelfieRequest;
import com.konfigthis.dojah.client.model.VerifyPhotoIdWithSelfieResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MlApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MlApi(ApiClient apiClient) {
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
     * Build call for getDocumentAnalysis
     * @param getDocumentAnalysisRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentAnalysisCall(GetDocumentAnalysisRequest getDocumentAnalysisRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getDocumentAnalysisRequest;

        // create path and map variables
        String localVarPath = "/v1/document/analysis/dl";

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
    private okhttp3.Call getDocumentAnalysisValidateBeforeCall(GetDocumentAnalysisRequest getDocumentAnalysisRequest, final ApiCallback _callback) throws ApiException {
        return getDocumentAnalysisCall(getDocumentAnalysisRequest, _callback);

    }

    /**
     * Document Analysis Drivers License
     * 
     * @param getDocumentAnalysisRequest  (optional)
     * @return GetDocumentAnalysisResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  </td></tr>
     </table>
     */
    public GetDocumentAnalysisResponse getDocumentAnalysis(GetDocumentAnalysisRequest getDocumentAnalysisRequest) throws ApiException {
        ApiResponse<GetDocumentAnalysisResponse> localVarResp = getDocumentAnalysisWithHttpInfo(getDocumentAnalysisRequest);
        return localVarResp.getData();
    }

    /**
     * Document Analysis Drivers License
     * 
     * @param getDocumentAnalysisRequest  (optional)
     * @return ApiResponse&lt;GetDocumentAnalysisResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<GetDocumentAnalysisResponse> getDocumentAnalysisWithHttpInfo(GetDocumentAnalysisRequest getDocumentAnalysisRequest) throws ApiException {
        okhttp3.Call localVarCall = getDocumentAnalysisValidateBeforeCall(getDocumentAnalysisRequest, null);
        Type localVarReturnType = new TypeToken<GetDocumentAnalysisResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Document Analysis Drivers License (asynchronously)
     * 
     * @param getDocumentAnalysisRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentAnalysisAsync(GetDocumentAnalysisRequest getDocumentAnalysisRequest, final ApiCallback<GetDocumentAnalysisResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentAnalysisValidateBeforeCall(getDocumentAnalysisRequest, _callback);
        Type localVarReturnType = new TypeToken<GetDocumentAnalysisResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGenericOcrText
     * @param getGenericOcrTextRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGenericOcrTextCall(GetGenericOcrTextRequest getGenericOcrTextRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getGenericOcrTextRequest;

        // create path and map variables
        String localVarPath = "/v1/ml/ocr/generic";

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
    private okhttp3.Call getGenericOcrTextValidateBeforeCall(GetGenericOcrTextRequest getGenericOcrTextRequest, final ApiCallback _callback) throws ApiException {
        return getGenericOcrTextCall(getGenericOcrTextRequest, _callback);

    }

    /**
     * Generic OCR Service
     * 
     * @param getGenericOcrTextRequest  (optional)
     * @return GetGenericOcrTextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public GetGenericOcrTextResponse getGenericOcrText(GetGenericOcrTextRequest getGenericOcrTextRequest) throws ApiException {
        ApiResponse<GetGenericOcrTextResponse> localVarResp = getGenericOcrTextWithHttpInfo(getGenericOcrTextRequest);
        return localVarResp.getData();
    }

    /**
     * Generic OCR Service
     * 
     * @param getGenericOcrTextRequest  (optional)
     * @return ApiResponse&lt;GetGenericOcrTextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetGenericOcrTextResponse> getGenericOcrTextWithHttpInfo(GetGenericOcrTextRequest getGenericOcrTextRequest) throws ApiException {
        okhttp3.Call localVarCall = getGenericOcrTextValidateBeforeCall(getGenericOcrTextRequest, null);
        Type localVarReturnType = new TypeToken<GetGenericOcrTextResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generic OCR Service (asynchronously)
     * 
     * @param getGenericOcrTextRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGenericOcrTextAsync(GetGenericOcrTextRequest getGenericOcrTextRequest, final ApiCallback<GetGenericOcrTextResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGenericOcrTextValidateBeforeCall(getGenericOcrTextRequest, _callback);
        Type localVarReturnType = new TypeToken<GetGenericOcrTextResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOcrText
     * @param getOcrTextRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOcrTextCall(GetOcrTextRequest getOcrTextRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getOcrTextRequest;

        // create path and map variables
        String localVarPath = "/v1/ml/ocr";

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
    private okhttp3.Call getOcrTextValidateBeforeCall(GetOcrTextRequest getOcrTextRequest, final ApiCallback _callback) throws ApiException {
        return getOcrTextCall(getOcrTextRequest, _callback);

    }

    /**
     * BVN Ocr
     * 
     * @param getOcrTextRequest  (optional)
     * @return GetOcrTextResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public GetOcrTextResponse getOcrText(GetOcrTextRequest getOcrTextRequest) throws ApiException {
        ApiResponse<GetOcrTextResponse> localVarResp = getOcrTextWithHttpInfo(getOcrTextRequest);
        return localVarResp.getData();
    }

    /**
     * BVN Ocr
     * 
     * @param getOcrTextRequest  (optional)
     * @return ApiResponse&lt;GetOcrTextResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetOcrTextResponse> getOcrTextWithHttpInfo(GetOcrTextRequest getOcrTextRequest) throws ApiException {
        okhttp3.Call localVarCall = getOcrTextValidateBeforeCall(getOcrTextRequest, null);
        Type localVarReturnType = new TypeToken<GetOcrTextResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * BVN Ocr (asynchronously)
     * 
     * @param getOcrTextRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOcrTextAsync(GetOcrTextRequest getOcrTextRequest, final ApiCallback<GetOcrTextResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOcrTextValidateBeforeCall(getOcrTextRequest, _callback);
        Type localVarReturnType = new TypeToken<GetOcrTextResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for verifyPhotoIdWithSelfie
     * @param verifyPhotoIdWithSelfieRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call verifyPhotoIdWithSelfieCall(VerifyPhotoIdWithSelfieRequest verifyPhotoIdWithSelfieRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = verifyPhotoIdWithSelfieRequest;

        // create path and map variables
        String localVarPath = "/v1/kyc/photoid/verify";

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
    private okhttp3.Call verifyPhotoIdWithSelfieValidateBeforeCall(VerifyPhotoIdWithSelfieRequest verifyPhotoIdWithSelfieRequest, final ApiCallback _callback) throws ApiException {
        return verifyPhotoIdWithSelfieCall(verifyPhotoIdWithSelfieRequest, _callback);

    }

    /**
     * KYC - Selfie Photo ID Verification
     * 
     * @param verifyPhotoIdWithSelfieRequest  (optional)
     * @return VerifyPhotoIdWithSelfieResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public VerifyPhotoIdWithSelfieResponse verifyPhotoIdWithSelfie(VerifyPhotoIdWithSelfieRequest verifyPhotoIdWithSelfieRequest) throws ApiException {
        ApiResponse<VerifyPhotoIdWithSelfieResponse> localVarResp = verifyPhotoIdWithSelfieWithHttpInfo(verifyPhotoIdWithSelfieRequest);
        return localVarResp.getData();
    }

    /**
     * KYC - Selfie Photo ID Verification
     * 
     * @param verifyPhotoIdWithSelfieRequest  (optional)
     * @return ApiResponse&lt;VerifyPhotoIdWithSelfieResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VerifyPhotoIdWithSelfieResponse> verifyPhotoIdWithSelfieWithHttpInfo(VerifyPhotoIdWithSelfieRequest verifyPhotoIdWithSelfieRequest) throws ApiException {
        okhttp3.Call localVarCall = verifyPhotoIdWithSelfieValidateBeforeCall(verifyPhotoIdWithSelfieRequest, null);
        Type localVarReturnType = new TypeToken<VerifyPhotoIdWithSelfieResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * KYC - Selfie Photo ID Verification (asynchronously)
     * 
     * @param verifyPhotoIdWithSelfieRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call verifyPhotoIdWithSelfieAsync(VerifyPhotoIdWithSelfieRequest verifyPhotoIdWithSelfieRequest, final ApiCallback<VerifyPhotoIdWithSelfieResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyPhotoIdWithSelfieValidateBeforeCall(verifyPhotoIdWithSelfieRequest, _callback);
        Type localVarReturnType = new TypeToken<VerifyPhotoIdWithSelfieResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
