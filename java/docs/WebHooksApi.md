# WebHooksApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWebhook**](WebHooksApi.md#deleteWebhook) | **DELETE** /api/v1/webhook/delete | Delete Webhook |
| [**getWebhooks**](WebHooksApi.md#getWebhooks) | **GET** /api/v1/webhook/fetch | Fetch All Webhooks |
| [**notifyWebhook**](WebHooksApi.md#notifyWebhook) | **POST** /api/v1/webhook/notify | Post Hook |
| [**subscribeService**](WebHooksApi.md#subscribeService) | **POST** /api/v1/webhook/subscribe | Subscribe to service |


<a name="deleteWebhook"></a>
# **deleteWebhook**
> DeleteWebhookResponse deleteWebhook()

Delete Webhook

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.WebHooksApi;

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

    WebHooksApi apiInstance = new WebHooksApi(defaultClient);
    try {
      DeleteWebhookResponse result = apiInstance.deleteWebhook();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebHooksApi#deleteWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeleteWebhookResponse**](DeleteWebhookResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getWebhooks"></a>
# **getWebhooks**
> GetWebhooksResponse getWebhooks()

Fetch All Webhooks

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.WebHooksApi;

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

    WebHooksApi apiInstance = new WebHooksApi(defaultClient);
    try {
      GetWebhooksResponse result = apiInstance.getWebhooks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebHooksApi#getWebhooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetWebhooksResponse**](GetWebhooksResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

<a name="notifyWebhook"></a>
# **notifyWebhook**
> NotifyWebhookResponse notifyWebhook(body)

Post Hook

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.WebHooksApi;

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

    WebHooksApi apiInstance = new WebHooksApi(defaultClient);
    Object body = null; // Object | 
    try {
      NotifyWebhookResponse result = apiInstance.notifyWebhook(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebHooksApi#notifyWebhook");
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

[**NotifyWebhookResponse**](NotifyWebhookResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

<a name="subscribeService"></a>
# **subscribeService**
> SubscribeServiceResponse subscribeService(body)

Subscribe to service

### Example
```java
// Import classes:
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.WebHooksApi;

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

    WebHooksApi apiInstance = new WebHooksApi(defaultClient);
    Object body = null; // Object | 
    try {
      SubscribeServiceResponse result = apiInstance.subscribeService(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebHooksApi#subscribeService");
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

[**SubscribeServiceResponse**](SubscribeServiceResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

