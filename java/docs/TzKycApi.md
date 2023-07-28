# TzKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNin**](TzKycApi.md#getNin) | **GET** /api/v1/tz/kyc/nin | Lookup TZ NIN |


<a name="getNin"></a>
# **getNin**
> Object getNin().firstName(firstName).lastName(lastName).dateOfBirth(dateOfBirth).mothersLastName(mothersLastName).mothersFirstName(mothersFirstName).execute();

Lookup TZ NIN

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.TzKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";
    
    // Configure API key authorization: appIdAuth
    configuration.Appid  = "YOUR API KEY";

    Dojah client = new Dojah(configuration);
    String firstName = "khafsa";
    String lastName = "mohammed";
    String dateOfBirth = "1994-01-11";
    String mothersLastName = "zulekha";
    String mothersFirstName = "kassim";
    try {
      Object result = client
              .tzKyc
              .getNin()
              .firstName(firstName)
              .lastName(lastName)
              .dateOfBirth(dateOfBirth)
              .mothersLastName(mothersLastName)
              .mothersFirstName(mothersFirstName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TzKycApi#getNin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tzKyc
              .getNin()
              .firstName(firstName)
              .lastName(lastName)
              .dateOfBirth(dateOfBirth)
              .mothersLastName(mothersLastName)
              .mothersFirstName(mothersFirstName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TzKycApi#getNin");
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
| **firstName** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |
| **mothersLastName** | **String**|  | [optional] |
| **mothersFirstName** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

