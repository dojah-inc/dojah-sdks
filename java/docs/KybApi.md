# KybApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdvancedCac**](KybApi.md#getAdvancedCac) | **GET** /v1/kyc/cac/advance | KYC - Get CAC Advanced |
| [**getBasicCac**](KybApi.md#getBasicCac) | **GET** /v1/kyc/cac/basic | KYB - Get CAC 2 |
| [**getCac**](KybApi.md#getCac) | **GET** /v1/kyc/cac | KYC - Get CAC  |
| [**getTin**](KybApi.md#getTin) | **GET** /v1/kyc/tin | KYC - Fetch Tin |


<a name="getAdvancedCac"></a>
# **getAdvancedCac**
> GetAdvancedCacResponse getAdvancedCac(rc, type, propertyClass)

KYC - Get CAC Advanced

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KybApi;

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

    KybApi apiInstance = new KybApi(defaultClient);
    Integer rc = 1432074; // Integer | 
    String type = "co"; // String | 
    String propertyClass = "advance"; // String | 
    try {
      GetAdvancedCacResponse result = apiInstance.getAdvancedCac(rc, type, propertyClass);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#getAdvancedCac");
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
| **rc** | **Integer**|  | [optional] |
| **type** | **String**|  | [optional] |
| **propertyClass** | **String**|  | [optional] |

### Return type

[**GetAdvancedCacResponse**](GetAdvancedCacResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getBasicCac"></a>
# **getBasicCac**
> GetBasicCacResponse getBasicCac(rc, type)

KYB - Get CAC 2

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KybApi;

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

    KybApi apiInstance = new KybApi(defaultClient);
    Integer rc = 3330883; // Integer | 
    String type = "bn"; // String | 
    try {
      GetBasicCacResponse result = apiInstance.getBasicCac(rc, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#getBasicCac");
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
| **rc** | **Integer**|  | [optional] |
| **type** | **String**|  | [optional] |

### Return type

[**GetBasicCacResponse**](GetBasicCacResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getCac"></a>
# **getCac**
> GetCacResponse getCac(rcNumber, companyName)

KYC - Get CAC 

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KybApi;

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

    KybApi apiInstance = new KybApi(defaultClient);
    Integer rcNumber = 1432074; // Integer | 
    String companyName = "ELTA SOLUTIONS LIMITED"; // String | 
    try {
      GetCacResponse result = apiInstance.getCac(rcNumber, companyName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#getCac");
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
| **rcNumber** | **Integer**|  | [optional] |
| **companyName** | **String**|  | [optional] |

### Return type

[**GetCacResponse**](GetCacResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

<a name="getTin"></a>
# **getTin**
> GetTinResponse getTin(tin)

KYC - Fetch Tin

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KybApi;

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

    KybApi apiInstance = new KybApi(defaultClient);
    String tin = "21148119-0001"; // String | 
    try {
      GetTinResponse result = apiInstance.getTin(tin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#getTin");
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
| **tin** | **String**|  | [optional] |

### Return type

[**GetTinResponse**](GetTinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

