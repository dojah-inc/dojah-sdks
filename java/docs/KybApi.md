# KybApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**businessDetail**](KybApi.md#businessDetail) | **GET** /api/v1/kyb/business/detail | Business Detail |
| [**businessSearch**](KybApi.md#businessSearch) | **GET** /api/v1/kyb/business/search | Business Search |
| [**getCac**](KybApi.md#getCac) | **GET** /api/v1/kyc/cac | KYC - Get CAC  |
| [**getTin**](KybApi.md#getTin) | **GET** /api/v1/kyc/tin | KYC - Fetch Tin |


<a name="businessDetail"></a>
# **businessDetail**
> Object businessDetail().internationalNumber(internationalNumber).countryCode(countryCode).full(full).execute();

Business Detail

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KybApi;
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
    String internationalNumber = "RC-1885308";
    String countryCode = "NG";
    Boolean full = true;
    try {
      Object result = client
              .kyb
              .businessDetail()
              .internationalNumber(internationalNumber)
              .countryCode(countryCode)
              .full(full)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#businessDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .kyb
              .businessDetail()
              .internationalNumber(internationalNumber)
              .countryCode(countryCode)
              .full(full)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#businessDetail");
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
| **internationalNumber** | **String**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **full** | **Boolean**|  | [optional] |

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

<a name="businessSearch"></a>
# **businessSearch**
> Object businessSearch().countryCode(countryCode).company(company).execute();

Business Search

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KybApi;
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
    String countryCode = "NG";
    Integer company = 1885308;
    try {
      Object result = client
              .kyb
              .businessSearch()
              .countryCode(countryCode)
              .company(company)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#businessSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .kyb
              .businessSearch()
              .countryCode(countryCode)
              .company(company)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#businessSearch");
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
| **countryCode** | **String**|  | [optional] |
| **company** | **Integer**|  | [optional] |

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

<a name="getCac"></a>
# **getCac**
> KybGetCacResponse getCac().rcNumber(rcNumber).companyName(companyName).execute();

KYC - Get CAC 

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KybApi;
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
    Integer rcNumber = 1432074;
    String companyName = "ELTA SOLUTIONS LIMITED";
    try {
      KybGetCacResponse result = client
              .kyb
              .getCac()
              .rcNumber(rcNumber)
              .companyName(companyName)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#getCac");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KybGetCacResponse> response = client
              .kyb
              .getCac()
              .rcNumber(rcNumber)
              .companyName(companyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#getCac");
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
| **rcNumber** | **Integer**|  | [optional] |
| **companyName** | **String**|  | [optional] |

### Return type

[**KybGetCacResponse**](KybGetCacResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

<a name="getTin"></a>
# **getTin**
> KybGetTinResponse getTin().tin(tin).execute();

KYC - Fetch Tin

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KybApi;
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
    String tin = "24111697-0001";
    try {
      KybGetTinResponse result = client
              .kyb
              .getTin()
              .tin(tin)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#getTin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KybGetTinResponse> response = client
              .kyb
              .getTin()
              .tin(tin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KybApi#getTin");
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
| **tin** | **String**|  | [optional] |

### Return type

[**KybGetTinResponse**](KybGetTinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

