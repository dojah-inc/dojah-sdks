# MlApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**verifyPhotoIdWithSelfie**](MlApi.md#verifyPhotoIdWithSelfie) | **POST** /api/v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification |


<a name="verifyPhotoIdWithSelfie"></a>
# **verifyPhotoIdWithSelfie**
> Object verifyPhotoIdWithSelfie(mlVerifyPhotoIdWithSelfieRequest).appId(appId).execute();

KYC - Selfie Photo ID Verification

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.MlApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";
    

    Dojah client = new Dojah(configuration);
    String selfieImage = "selfieImage_example";
    String photoidImage = "photoidImage_example";
    String appId = "{{app_id}}";
    try {
      Object result = client
              .ml
              .verifyPhotoIdWithSelfie()
              .selfieImage(selfieImage)
              .photoidImage(photoidImage)
              .appId(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#verifyPhotoIdWithSelfie");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .ml
              .verifyPhotoIdWithSelfie()
              .selfieImage(selfieImage)
              .photoidImage(photoidImage)
              .appId(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MlApi#verifyPhotoIdWithSelfie");
      System.err.println("Status code: " + e.getStatusCode());
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
| **mlVerifyPhotoIdWithSelfieRequest** | [**MlVerifyPhotoIdWithSelfieRequest**](MlVerifyPhotoIdWithSelfieRequest.md)|  | |
| **appId** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

