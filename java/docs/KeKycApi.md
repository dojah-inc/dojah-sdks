# KeKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNationalId**](KeKycApi.md#getNationalId) | **GET** /api/v1/ke/kyc/id | KYC - National ID |


<a name="getNationalId"></a>
# **getNationalId**
> GetNationalIdResponse getNationalId().id(id).firstName(firstName).lastName(lastName).middleName(middleName).dateOfBirth(dateOfBirth).gender(gender).execute();

KYC - National ID

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KeKycApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://api.dojah.io");
    
    // Configure API key authorization: apikeyAuth
    apiClient.setApikeyAuth("YOUR API KEY");

    // Configure API key authorization: appIdAuth
    apiClient.setAppIdAuth("YOUR API KEY");

    KeKycApi api = new KeKycApi(apiClient);
    Integer id = 24798402;
    String firstName = "ZEDEKIAH";
    String lastName = "ANDENGA";
    String middleName = "middleName_example";
    String dateOfBirth = "1985-12-29";
    String gender = "M";
    try {
      GetNationalIdResponse result = api
              .getNationalId()
              .id(id)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .dateOfBirth(dateOfBirth)
              .gender(gender)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling KeKycApi#getNationalId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<GetNationalIdResponse> response = api
              .getNationalId()
              .id(id)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .dateOfBirth(dateOfBirth)
              .gender(gender)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
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

