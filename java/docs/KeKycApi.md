# KeKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNationalId**](KeKycApi.md#getNationalId) | **GET** /api/v1/ke/kyc/id | KYC - National ID |


<a name="getNationalId"></a>
# **getNationalId**
> GetNationalIdResponse getNationalId(id, firstName, lastName, middleName, dateOfBirth, gender)

KYC - National ID

### Example
```java
// Import classes:
import io.dojah.client.ApiClient;
import io.dojah.client.ApiException;
import io.dojah.client.Configuration;
import io.dojah.client.auth.*;
import io.dojah.client.model.*;
import io.dojah.client.api.KeKycApi;

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

    KeKycApi apiInstance = new KeKycApi(defaultClient);
    Integer id = 24798402; // Integer | 
    String firstName = "ZEDEKIAH"; // String | 
    String lastName = "ANDENGA"; // String | 
    String middleName = "middleName_example"; // String | 
    String dateOfBirth = "1985-12-29"; // String | 
    String gender = "M"; // String | 
    try {
      GetNationalIdResponse result = apiInstance.getNationalId(id, firstName, lastName, middleName, dateOfBirth, gender);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeKycApi#getNationalId");
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
| **middleName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |
| **gender** | **String**|  | [optional] |

### Return type

[**GetNationalIdResponse**](GetNationalIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

