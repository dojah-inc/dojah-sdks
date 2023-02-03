# UgKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVoter**](UgKycApi.md#getVoter) | **GET** /api/v1/ug/kyc/voter | Voters ID |


<a name="getVoter"></a>
# **getVoter**
> GetVoterResponse getVoter(id, firstName, lastName)

Voters ID

### Example
```java
// Import classes:
import io.dojah.client.ApiClient;
import io.dojah.client.ApiException;
import io.dojah.client.Configuration;
import io.dojah.client.auth.*;
import io.dojah.client.model.*;
import io.dojah.client.api.UgKycApi;

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

    UgKycApi apiInstance = new UgKycApi(defaultClient);
    Integer id = 67335751; // Integer | 
    String firstName = "Happy"; // String | 
    String lastName = "Christmas"; // String | 
    try {
      GetVoterResponse result = apiInstance.getVoter(id, firstName, lastName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UgKycApi#getVoter");
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
| **id** | **Integer**|  | [optional] |
| **firstName** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |

### Return type

[**GetVoterResponse**](GetVoterResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

