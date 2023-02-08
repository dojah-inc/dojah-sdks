# MlApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDocumentAnalysis**](MlApi.md#getDocumentAnalysis) | **POST** /v1/document/analysis/dl | Document Analysis Drivers License |
| [**getGenericOcrText**](MlApi.md#getGenericOcrText) | **POST** /v1/ml/ocr/generic | Generic OCR Service |
| [**getOcrText**](MlApi.md#getOcrText) | **POST** /v1/ml/ocr | BVN Ocr |
| [**verifyPhotoIdWithSelfie**](MlApi.md#verifyPhotoIdWithSelfie) | **POST** /v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification |


<a name="getDocumentAnalysis"></a>
# **getDocumentAnalysis**
> GetDocumentAnalysisResponse getDocumentAnalysis(getDocumentAnalysisRequest)

Document Analysis Drivers License

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: appIdAuth
    ApiKeyAuth appIdAuth = (ApiKeyAuth) defaultClient.getAuthentication("appIdAuth");
    appIdAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //appIdAuth.setApiKeyPrefix("Token");

    MlApi apiInstance = new MlApi(defaultClient);
    GetDocumentAnalysisRequest getDocumentAnalysisRequest = new GetDocumentAnalysisRequest(); // GetDocumentAnalysisRequest | 
    try {
      GetDocumentAnalysisResponse result = apiInstance.getDocumentAnalysis(getDocumentAnalysisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#getDocumentAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDocumentAnalysisRequest** | [**GetDocumentAnalysisRequest**](GetDocumentAnalysisRequest.md)|  | [optional] |

### Return type

[**GetDocumentAnalysisResponse**](GetDocumentAnalysisResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

<a name="getGenericOcrText"></a>
# **getGenericOcrText**
> GetGenericOcrTextResponse getGenericOcrText(getGenericOcrTextRequest)

Generic OCR Service

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: appIdAuth
    ApiKeyAuth appIdAuth = (ApiKeyAuth) defaultClient.getAuthentication("appIdAuth");
    appIdAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //appIdAuth.setApiKeyPrefix("Token");

    MlApi apiInstance = new MlApi(defaultClient);
    GetGenericOcrTextRequest getGenericOcrTextRequest = new GetGenericOcrTextRequest(); // GetGenericOcrTextRequest | 
    try {
      GetGenericOcrTextResponse result = apiInstance.getGenericOcrText(getGenericOcrTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#getGenericOcrText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getGenericOcrTextRequest** | [**GetGenericOcrTextRequest**](GetGenericOcrTextRequest.md)|  | [optional] |

### Return type

[**GetGenericOcrTextResponse**](GetGenericOcrTextResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getOcrText"></a>
# **getOcrText**
> GetOcrTextResponse getOcrText(getOcrTextRequest)

BVN Ocr

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: appIdAuth
    ApiKeyAuth appIdAuth = (ApiKeyAuth) defaultClient.getAuthentication("appIdAuth");
    appIdAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //appIdAuth.setApiKeyPrefix("Token");

    MlApi apiInstance = new MlApi(defaultClient);
    GetOcrTextRequest getOcrTextRequest = new GetOcrTextRequest(); // GetOcrTextRequest | 
    try {
      GetOcrTextResponse result = apiInstance.getOcrText(getOcrTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#getOcrText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getOcrTextRequest** | [**GetOcrTextRequest**](GetOcrTextRequest.md)|  | [optional] |

### Return type

[**GetOcrTextResponse**](GetOcrTextResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="verifyPhotoIdWithSelfie"></a>
# **verifyPhotoIdWithSelfie**
> VerifyPhotoIdWithSelfieResponse verifyPhotoIdWithSelfie(verifyPhotoIdWithSelfieRequest)

KYC - Selfie Photo ID Verification

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: appIdAuth
    ApiKeyAuth appIdAuth = (ApiKeyAuth) defaultClient.getAuthentication("appIdAuth");
    appIdAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //appIdAuth.setApiKeyPrefix("Token");

    MlApi apiInstance = new MlApi(defaultClient);
    VerifyPhotoIdWithSelfieRequest verifyPhotoIdWithSelfieRequest = new VerifyPhotoIdWithSelfieRequest(); // VerifyPhotoIdWithSelfieRequest | 
    try {
      VerifyPhotoIdWithSelfieResponse result = apiInstance.verifyPhotoIdWithSelfie(verifyPhotoIdWithSelfieRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#verifyPhotoIdWithSelfie");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **verifyPhotoIdWithSelfieRequest** | [**VerifyPhotoIdWithSelfieRequest**](VerifyPhotoIdWithSelfieRequest.md)|  | [optional] |

### Return type

[**VerifyPhotoIdWithSelfieResponse**](VerifyPhotoIdWithSelfieResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

