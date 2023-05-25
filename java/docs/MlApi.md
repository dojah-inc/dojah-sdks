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
> GetDocumentAnalysisResponse getDocumentAnalysis().getDocumentAnalysisRequest(getDocumentAnalysisRequest).execute();

Document Analysis Drivers License

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    apiClient.setApikeyAuth("YOUR API KEY");

    // Configure API key authorization: appIdAuth
    apiClient.setAppIdAuth("YOUR API KEY");

    MlApi api = new MlApi(apiClient);
    String img = "img_example";
    try {
      GetDocumentAnalysisResponse result = api
              .getDocumentAnalysis()
              .img(img)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#getDocumentAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<GetDocumentAnalysisResponse> response = api
              .getDocumentAnalysis()
              .img(img)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
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
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

<a name="getGenericOcrText"></a>
# **getGenericOcrText**
> GetGenericOcrTextResponse getGenericOcrText().getGenericOcrTextRequest(getGenericOcrTextRequest).execute();

Generic OCR Service

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    apiClient.setApikeyAuth("YOUR API KEY");

    // Configure API key authorization: appIdAuth
    apiClient.setAppIdAuth("YOUR API KEY");

    MlApi api = new MlApi(apiClient);
    String img = "img_example";
    try {
      GetGenericOcrTextResponse result = api
              .getGenericOcrText()
              .img(img)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#getGenericOcrText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<GetGenericOcrTextResponse> response = api
              .getGenericOcrText()
              .img(img)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
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
> GetOcrTextResponse getOcrText().getOcrTextRequest(getOcrTextRequest).execute();

BVN Ocr

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    apiClient.setApikeyAuth("YOUR API KEY");

    // Configure API key authorization: appIdAuth
    apiClient.setAppIdAuth("YOUR API KEY");

    MlApi api = new MlApi(apiClient);
    String image = "image_example";
    try {
      GetOcrTextResponse result = api
              .getOcrText()
              .image(image)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#getOcrText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<GetOcrTextResponse> response = api
              .getOcrText()
              .image(image)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
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
> VerifyPhotoIdWithSelfieResponse verifyPhotoIdWithSelfie().verifyPhotoIdWithSelfieRequest(verifyPhotoIdWithSelfieRequest).execute();

KYC - Selfie Photo ID Verification

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    apiClient.setApikeyAuth("YOUR API KEY");

    // Configure API key authorization: appIdAuth
    apiClient.setAppIdAuth("YOUR API KEY");

    MlApi api = new MlApi(apiClient);
    String selfieImage = "selfieImage_example";
    String photoidImage = "photoidImage_example";
    try {
      VerifyPhotoIdWithSelfieResponse result = api
              .verifyPhotoIdWithSelfie()
              .selfieImage(selfieImage)
              .photoidImage(photoidImage)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#verifyPhotoIdWithSelfie");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<VerifyPhotoIdWithSelfieResponse> response = api
              .verifyPhotoIdWithSelfie()
              .selfieImage(selfieImage)
              .photoidImage(photoidImage)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
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

