# GhKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDriversLicense**](GhKycApi.md#getDriversLicense) | **GET** /api/v1/gh/kyc/dl | Driver&#39;s License |
| [**getPassport**](GhKycApi.md#getPassport) | **GET** /api/v1/gh/kyc/passport | Passport |
| [**getSsnit**](GhKycApi.md#getSsnit) | **GET** /api/v1/gh/kyc/ssnit | SSNIT |


<a name="getDriversLicense"></a>
# **getDriversLicense**
> GetDriversLicenseResponse getDriversLicense().id(id).fullName(fullName).dateOfBirth(dateOfBirth).execute();

Driver&#39;s License

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GhKycApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    apiClient.setApikeyAuth("YOUR API KEY");

    // Configure API key authorization: appIdAuth
    apiClient.setAppIdAuth("YOUR API KEY");

    GhKycApi api = new GhKycApi(apiClient);
    String id = "V0000000";
    String fullName = "John Doe";
    String dateOfBirth = "1988-09-01";
    try {
      GetDriversLicenseResponse result = api
              .getDriversLicense()
              .id(id)
              .fullName(fullName)
              .dateOfBirth(dateOfBirth)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getDriversLicense");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<GetDriversLicenseResponse> response = api
              .getDriversLicense()
              .id(id)
              .fullName(fullName)
              .dateOfBirth(dateOfBirth)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
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
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

<a name="getPassport"></a>
# **getPassport**
> GetPassportResponse getPassport().id(id).firstName(firstName).lastName(lastName).middleName(middleName).dateOfBirth(dateOfBirth).execute();

Passport

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GhKycApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    apiClient.setApikeyAuth("YOUR API KEY");

    // Configure API key authorization: appIdAuth
    apiClient.setAppIdAuth("YOUR API KEY");

    GhKycApi api = new GhKycApi(apiClient);
    String id = "G0000000";
    String firstName = "John";
    String lastName = "Doe";
    String middleName = "Jack";
    String dateOfBirth = "1990-04-05";
    try {
      GetPassportResponse result = api
              .getPassport()
              .id(id)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .dateOfBirth(dateOfBirth)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getPassport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<GetPassportResponse> response = api
              .getPassport()
              .id(id)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .dateOfBirth(dateOfBirth)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
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
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

<a name="getSsnit"></a>
# **getSsnit**
> GetSsnitResponse getSsnit().id(id).fullName(fullName).dateOfBirth(dateOfBirth).execute();

SSNIT

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GhKycApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    apiClient.setApikeyAuth("YOUR API KEY");

    // Configure API key authorization: appIdAuth
    apiClient.setAppIdAuth("YOUR API KEY");

    GhKycApi api = new GhKycApi(apiClient);
    String id = "G0000000";
    String fullName = "John Doe";
    String dateOfBirth = "1990-04-05";
    try {
      GetSsnitResponse result = api
              .getSsnit()
              .id(id)
              .fullName(fullName)
              .dateOfBirth(dateOfBirth)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getSsnit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<GetSsnitResponse> response = api
              .getSsnit()
              .id(id)
              .fullName(fullName)
              .dateOfBirth(dateOfBirth)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
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

