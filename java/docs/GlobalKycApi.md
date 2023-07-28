# GlobalKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**caEkyc**](GlobalKycApi.md#caEkyc) | **GET** /api/v1/ca/kyc | Canada Ekyc |
| [**getUsSsn**](GlobalKycApi.md#getUsSsn) | **GET** /api/v1/us/kyc | US SSN |
| [**ukTwoPlusTwo**](GlobalKycApi.md#ukTwoPlusTwo) | **GET** /api/v1/uk/kyc | UK 2+2 |


<a name="caEkyc"></a>
# **caEkyc**
> Object caEkyc().country(country).firstName(firstName).lastName(lastName).streetName(streetName).dateOfBirth(dateOfBirth).houseNumber(houseNumber).postCode(postCode).execute();

Canada Ekyc

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GlobalKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";
    
    // Configure API key authorization: apikeyAuth
    configuration.Authorization  = "YOUR API KEY";

    // Configure API key authorization: appIdAuth
    configuration.AppId  = "YOUR API KEY";

    Dojah client = new Dojah(configuration);
    String country = "GBR";
    String firstName = "Tobi";
    String lastName = "Ololade";
    String streetName = "Street 1";
    String dateOfBirth = "1992-05-18";
    Integer houseNumber = 25;
    Integer postCode = 1234;
    try {
      Object result = client
              .globalKyc
              .caEkyc()
              .country(country)
              .firstName(firstName)
              .lastName(lastName)
              .streetName(streetName)
              .dateOfBirth(dateOfBirth)
              .houseNumber(houseNumber)
              .postCode(postCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalKycApi#caEkyc");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .globalKyc
              .caEkyc()
              .country(country)
              .firstName(firstName)
              .lastName(lastName)
              .streetName(streetName)
              .dateOfBirth(dateOfBirth)
              .houseNumber(houseNumber)
              .postCode(postCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalKycApi#caEkyc");
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
| **country** | **String**|  | [optional] |
| **firstName** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **streetName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |
| **houseNumber** | **Integer**|  | [optional] |
| **postCode** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getUsSsn"></a>
# **getUsSsn**
> Object getUsSsn().country(country).firstName(firstName).lastName(lastName).streetName(streetName).dateOfBirth(dateOfBirth).houseNumber(houseNumber).postCode(postCode).execute();

US SSN

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GlobalKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";
    
    // Configure API key authorization: apikeyAuth
    configuration.Authorization  = "YOUR API KEY";

    // Configure API key authorization: appIdAuth
    configuration.AppId  = "YOUR API KEY";

    Dojah client = new Dojah(configuration);
    String country = "GBR";
    String firstName = "Tobi";
    String lastName = "Ololade";
    String streetName = "Street 1";
    String dateOfBirth = "1992-05-18";
    Integer houseNumber = 25;
    Integer postCode = 1234;
    try {
      Object result = client
              .globalKyc
              .getUsSsn()
              .country(country)
              .firstName(firstName)
              .lastName(lastName)
              .streetName(streetName)
              .dateOfBirth(dateOfBirth)
              .houseNumber(houseNumber)
              .postCode(postCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalKycApi#getUsSsn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .globalKyc
              .getUsSsn()
              .country(country)
              .firstName(firstName)
              .lastName(lastName)
              .streetName(streetName)
              .dateOfBirth(dateOfBirth)
              .houseNumber(houseNumber)
              .postCode(postCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalKycApi#getUsSsn");
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
| **country** | **String**|  | [optional] |
| **firstName** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **streetName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |
| **houseNumber** | **Integer**|  | [optional] |
| **postCode** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ukTwoPlusTwo"></a>
# **ukTwoPlusTwo**
> Object ukTwoPlusTwo().country(country).firstName(firstName).lastName(lastName).streetName(streetName).dateOfBirth(dateOfBirth).houseNumber(houseNumber).postCode(postCode).execute();

UK 2+2

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GlobalKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";
    
    // Configure API key authorization: apikeyAuth
    configuration.Authorization  = "YOUR API KEY";

    // Configure API key authorization: appIdAuth
    configuration.AppId  = "YOUR API KEY";

    Dojah client = new Dojah(configuration);
    String country = "GBR";
    String firstName = "Tobi";
    String lastName = "Ololade";
    String streetName = "Street 1";
    String dateOfBirth = "1992-05-18";
    Integer houseNumber = 25;
    Integer postCode = 1234;
    try {
      Object result = client
              .globalKyc
              .ukTwoPlusTwo()
              .country(country)
              .firstName(firstName)
              .lastName(lastName)
              .streetName(streetName)
              .dateOfBirth(dateOfBirth)
              .houseNumber(houseNumber)
              .postCode(postCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalKycApi#ukTwoPlusTwo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .globalKyc
              .ukTwoPlusTwo()
              .country(country)
              .firstName(firstName)
              .lastName(lastName)
              .streetName(streetName)
              .dateOfBirth(dateOfBirth)
              .houseNumber(houseNumber)
              .postCode(postCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalKycApi#ukTwoPlusTwo");
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
| **country** | **String**|  | [optional] |
| **firstName** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **streetName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |
| **houseNumber** | **Integer**|  | [optional] |
| **postCode** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

