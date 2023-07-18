# GhKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDriversLicense**](GhKycApi.md#getDriversLicense) | **GET** /api/v1/gh/kyc/dl | Driver&#39;s License |
| [**getPassport**](GhKycApi.md#getPassport) | **GET** /api/v1/gh/kyc/passport | Passport |
| [**getSsnit**](GhKycApi.md#getSsnit) | **GET** /api/v1/gh/kyc/ssnit | SSNIT |
| [**getVoter**](GhKycApi.md#getVoter) | **GET** /api/v1/gh/kyc/voter | Voter ID Lookup |


<a name="getDriversLicense"></a>
# **getDriversLicense**
> GetDriversLicenseResponse getDriversLicense().appId(appId).id(id).fullName(fullName).dateOfBirth(dateOfBirth).execute();

Driver&#39;s License

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GhKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    String id = "V0000000";
    String fullName = "John Doe";
    String dateOfBirth = "1988-09-01";
    try {
      GetDriversLicenseResponse result = client
              .ghKyc
              .getDriversLicense()
              .appId(appId)
              .id(id)
              .fullName(fullName)
              .dateOfBirth(dateOfBirth)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getDriversLicense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetDriversLicenseResponse> response = client
              .ghKyc
              .getDriversLicense()
              .appId(appId)
              .id(id)
              .fullName(fullName)
              .dateOfBirth(dateOfBirth)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getDriversLicense");
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
| **appId** | **String**|  | [optional] |
| **id** | **String**|  | [optional] |
| **fullName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |

### Return type

[**GetDriversLicenseResponse**](GetDriversLicenseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

<a name="getPassport"></a>
# **getPassport**
> GetPassportResponse getPassport().appId(appId).id(id).firstName(firstName).lastName(lastName).middleName(middleName).dateOfBirth(dateOfBirth).execute();

Passport

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GhKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    String id = "G111235468";
    String firstName = "John";
    String lastName = "Doe";
    String middleName = "Jack";
    String dateOfBirth = "1990-04-05";
    try {
      GetPassportResponse result = client
              .ghKyc
              .getPassport()
              .appId(appId)
              .id(id)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .dateOfBirth(dateOfBirth)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getPassport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPassportResponse> response = client
              .ghKyc
              .getPassport()
              .appId(appId)
              .id(id)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .dateOfBirth(dateOfBirth)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getPassport");
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
| **appId** | **String**|  | [optional] |
| **id** | **String**|  | [optional] |
| **firstName** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **middleName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |

### Return type

[**GetPassportResponse**](GetPassportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

<a name="getSsnit"></a>
# **getSsnit**
> GetSsnitResponse getSsnit().appId(appId).id(id).fullName(fullName).dateOfBirth(dateOfBirth).execute();

SSNIT

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GhKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    String id = "G0000000";
    String fullName = "John Doe";
    String dateOfBirth = "1990-04-05";
    try {
      GetSsnitResponse result = client
              .ghKyc
              .getSsnit()
              .appId(appId)
              .id(id)
              .fullName(fullName)
              .dateOfBirth(dateOfBirth)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getSsnit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetSsnitResponse> response = client
              .ghKyc
              .getSsnit()
              .appId(appId)
              .id(id)
              .fullName(fullName)
              .dateOfBirth(dateOfBirth)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getSsnit");
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
| **appId** | **String**|  | [optional] |
| **id** | **String**|  | [optional] |
| **fullName** | **String**|  | [optional] |
| **dateOfBirth** | **String**|  | [optional] |

### Return type

[**GetSsnitResponse**](GetSsnitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

<a name="getVoter"></a>
# **getVoter**
> Object getVoter().appId(appId).id(id).fullName(fullName).isNewId(isNewId).execute();

Voter ID Lookup

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.GhKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    Integer id = 6423007613;
    String fullName = "John Doe";
    Boolean isNewId = true;
    try {
      Object result = client
              .ghKyc
              .getVoter()
              .appId(appId)
              .id(id)
              .fullName(fullName)
              .isNewId(isNewId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getVoter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .ghKyc
              .getVoter()
              .appId(appId)
              .id(id)
              .fullName(fullName)
              .isNewId(isNewId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GhKycApi#getVoter");
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
| **appId** | **String**|  | [optional] |
| **id** | **Integer**|  | [optional] |
| **fullName** | **String**|  | [optional] |
| **isNewId** | **Boolean**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

