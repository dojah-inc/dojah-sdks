# AmlApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getScreeningInfo**](AmlApi.md#getScreeningInfo) | **GET** /v1/aml/screening/info | Get AML Info |
| [**screenAml**](AmlApi.md#screenAml) | **POST** /api/v1/aml/screening | AML Screening |


<a name="getScreeningInfo"></a>
# **getScreeningInfo**
> GetScreeningInfoResponse getScreeningInfo(referenceId)

Get AML Info

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.AmlApi;

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

    AmlApi apiInstance = new AmlApi(defaultClient);
    String referenceId = "c574a3c8-dc27-4013-8bbc-462e7ed87d55"; // String | 
    try {
      GetScreeningInfoResponse result = apiInstance.getScreeningInfo(referenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AmlApi#getScreeningInfo");
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
| **referenceId** | **String**|  | [optional] |

### Return type

[**GetScreeningInfoResponse**](GetScreeningInfoResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="screenAml"></a>
# **screenAml**
> ScreenAmlResponse screenAml(body)

AML Screening

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.AmlApi;

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

    AmlApi apiInstance = new AmlApi(defaultClient);
    Object body = null; // Object | 
    try {
      ScreenAmlResponse result = apiInstance.screenAml(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AmlApi#screenAml");
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
| **body** | **Object**|  | [optional] |

### Return type

[**ScreenAmlResponse**](ScreenAmlResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

