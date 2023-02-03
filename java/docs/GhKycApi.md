# GhKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDriversLicense**](GhKycApi.md#getDriversLicense) | **GET** /api/v1/gh/kyc/dl | Driver&#39;s License |
| [**getPassport**](GhKycApi.md#getPassport) | **GET** /api/v1/gh/kyc/passport | Passport |
| [**getSsnit**](GhKycApi.md#getSsnit) | **GET** /api/v1/gh/kyc/ssnit | SSNIT |


<a name="getDriversLicense"></a>
# **getDriversLicense**
> GetDriversLicenseResponse getDriversLicense(id, fullName, dateOfBirth)

Driver&#39;s License

### Example
```java
// Import classes:
import io.dojah.client.ApiClient;
import io.dojah.client.ApiException;
import io.dojah.client.Configuration;
import io.dojah.client.auth.*;
import io.dojah.client.model.*;
import io.dojah.client.api.GhKycApi;

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

    GhKycApi apiInstance = new GhKycApi(defaultClient);
    String id = "V0000000"; // String | 
    String fullName = "John Doe"; // String | 
    String dateOfBirth = "1988-09-01"; // String | 
    try {
      GetDriversLicenseResponse result = apiInstance.getDriversLicense(id, fullName, dateOfBirth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getDriversLicense");
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
| **id** | **String**|  | [optional] |
| **fullName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |

### Return type

[**GetDriversLicenseResponse**](GetDriversLicenseResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * Content-Type -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

<a name="getPassport"></a>
# **getPassport**
> GetPassportResponse getPassport(id, firstName, lastName, middleName, dateOfBirth)

Passport

### Example
```java
// Import classes:
import io.dojah.client.ApiClient;
import io.dojah.client.ApiException;
import io.dojah.client.Configuration;
import io.dojah.client.auth.*;
import io.dojah.client.model.*;
import io.dojah.client.api.GhKycApi;

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

    GhKycApi apiInstance = new GhKycApi(defaultClient);
    String id = "G0000000"; // String | 
    String firstName = "John"; // String | 
    String lastName = "Doe"; // String | 
    String middleName = "Jack"; // String | 
    String dateOfBirth = "1990-04-05"; // String | 
    try {
      GetPassportResponse result = apiInstance.getPassport(id, firstName, lastName, middleName, dateOfBirth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getPassport");
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
| **id** | **String**|  | [optional] |
| **firstName** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **middleName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |

### Return type

[**GetPassportResponse**](GetPassportResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * Content-Type -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

<a name="getSsnit"></a>
# **getSsnit**
> GetSsnitResponse getSsnit(id, fullName, dateOfBirth)

SSNIT

### Example
```java
// Import classes:
import io.dojah.client.ApiClient;
import io.dojah.client.ApiException;
import io.dojah.client.Configuration;
import io.dojah.client.auth.*;
import io.dojah.client.model.*;
import io.dojah.client.api.GhKycApi;

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

    GhKycApi apiInstance = new GhKycApi(defaultClient);
    String id = "G0000000"; // String | 
    String fullName = "John Doe"; // String | 
    String dateOfBirth = "1990-04-05"; // String | 
    try {
      GetSsnitResponse result = apiInstance.getSsnit(id, fullName, dateOfBirth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getSsnit");
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
| **id** | **String**|  | [optional] |
| **fullName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |

### Return type

[**GetSsnitResponse**](GetSsnitResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

