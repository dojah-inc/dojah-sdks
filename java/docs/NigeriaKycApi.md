# NigeriaKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBasicBvn**](NigeriaKycApi.md#getBasicBvn) | **GET** /api/v1/kyc/bvn | KYC - Get Basic BVN Info |
| [**getBasicBvn1**](NigeriaKycApi.md#getBasicBvn1) | **GET** /api/v1/kyc/bvn/basic | KYC - Lookup BVN Basic 1 |
| [**getBasicPhoneNumber**](NigeriaKycApi.md#getBasicPhoneNumber) | **GET** /api/v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic |
| [**getDriversLicense**](NigeriaKycApi.md#getDriversLicense) | **GET** /api/v1/kyc/dl | KYC - Get Drivers License Info |
| [**getNin**](NigeriaKycApi.md#getNin) | **GET** /api/v1/kyc/nin | KYC - Get NIN Info |
| [**getNormalBvn**](NigeriaKycApi.md#getNormalBvn) | **GET** /api/v1/kyc/bvn/full | KYC - Lookup BVN Normal |
| [**getNuban**](NigeriaKycApi.md#getNuban) | **GET** /api/v1/kyc/nuban | KYC - Get NUBAN Information |
| [**getPassport**](NigeriaKycApi.md#getPassport) | **GET** /api/v1/kyc/passport | KYC - Passport |
| [**getPhoneNumber**](NigeriaKycApi.md#getPhoneNumber) | **GET** /api/v1/kyc/phone_number | KYC - Lookup Phone Number |
| [**getPremiumBvn**](NigeriaKycApi.md#getPremiumBvn) | **GET** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium |
| [**getVnin**](NigeriaKycApi.md#getVnin) | **GET** /api/v1/kyc/vnin | Lookup VNIN |


<a name="getBasicBvn"></a>
# **getBasicBvn**
> ValidateBvnResponse getBasicBvn().bvn(bvn).execute();

KYC - Get Basic BVN Info

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    Integer bvn = 22468537919;
    try {
      ValidateBvnResponse result = client
              .nigeriaKyc
              .getBasicBvn()
              .bvn(bvn)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getBasicBvn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ValidateBvnResponse> response = client
              .nigeriaKyc
              .getBasicBvn()
              .bvn(bvn)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getBasicBvn");
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
| **bvn** | **Integer**|  | [optional] |

### Return type

[**ValidateBvnResponse**](ValidateBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

<a name="getBasicBvn1"></a>
# **getBasicBvn1**
> GetBasicBvnResponse getBasicBvn1().bvn(bvn).execute();

KYC - Lookup BVN Basic 1

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    Integer bvn = 22621998885;
    try {
      GetBasicBvnResponse result = client
              .nigeriaKyc
              .getBasicBvn1()
              .bvn(bvn)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getBasicBvn1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetBasicBvnResponse> response = client
              .nigeriaKyc
              .getBasicBvn1()
              .bvn(bvn)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getBasicBvn1");
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
| **bvn** | **Integer**|  | [optional] |

### Return type

[**GetBasicBvnResponse**](GetBasicBvnResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getBasicPhoneNumber"></a>
# **getBasicPhoneNumber**
> Object getBasicPhoneNumber().phoneNumber(phoneNumber).execute();

KYC Lookup Phone Number Basic

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    Integer phoneNumber = 9131377829;
    try {
      Object result = client
              .nigeriaKyc
              .getBasicPhoneNumber()
              .phoneNumber(phoneNumber)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getBasicPhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .nigeriaKyc
              .getBasicPhoneNumber()
              .phoneNumber(phoneNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getBasicPhoneNumber");
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
| **phoneNumber** | **Integer**|  | [optional] |

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

<a name="getDriversLicense"></a>
# **getDriversLicense**
> GetKycDriversLicenseResponse getDriversLicense().licenseNumber(licenseNumber).execute();

KYC - Get Drivers License Info

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    String licenseNumber = "FKJ49409AB13";
    try {
      GetKycDriversLicenseResponse result = client
              .nigeriaKyc
              .getDriversLicense()
              .licenseNumber(licenseNumber)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getDriversLicense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetKycDriversLicenseResponse> response = client
              .nigeriaKyc
              .getDriversLicense()
              .licenseNumber(licenseNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getDriversLicense");
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
| **licenseNumber** | **String**|  | [optional] |

### Return type

[**GetKycDriversLicenseResponse**](GetKycDriversLicenseResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

<a name="getNin"></a>
# **getNin**
> NigeriaKycGetNinResponse getNin().nin(nin).execute();

KYC - Get NIN Info

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    Integer nin = 55648152772;
    try {
      NigeriaKycGetNinResponse result = client
              .nigeriaKyc
              .getNin()
              .nin(nin)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getNin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NigeriaKycGetNinResponse> response = client
              .nigeriaKyc
              .getNin()
              .nin(nin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getNin");
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
| **nin** | **Integer**|  | [optional] |

### Return type

[**NigeriaKycGetNinResponse**](NigeriaKycGetNinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

<a name="getNormalBvn"></a>
# **getNormalBvn**
> GetFullBvnResponse getNormalBvn().bvn(bvn).execute();

KYC - Lookup BVN Normal

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    Integer bvn = 22342291445;
    try {
      GetFullBvnResponse result = client
              .nigeriaKyc
              .getNormalBvn()
              .bvn(bvn)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getNormalBvn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetFullBvnResponse> response = client
              .nigeriaKyc
              .getNormalBvn()
              .bvn(bvn)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getNormalBvn");
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
| **bvn** | **Integer**|  | [optional] |

### Return type

[**GetFullBvnResponse**](GetFullBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

<a name="getNuban"></a>
# **getNuban**
> GetNubanResponse getNuban().bankCode(bankCode).accountNumber(accountNumber).execute();

KYC - Get NUBAN Information

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    Integer bankCode = 58;
    Integer accountNumber = 11223344;
    try {
      GetNubanResponse result = client
              .nigeriaKyc
              .getNuban()
              .bankCode(bankCode)
              .accountNumber(accountNumber)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getNuban");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetNubanResponse> response = client
              .nigeriaKyc
              .getNuban()
              .bankCode(bankCode)
              .accountNumber(accountNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getNuban");
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
| **bankCode** | **Integer**|  | [optional] |
| **accountNumber** | **Integer**|  | [optional] |

### Return type

[**GetNubanResponse**](GetNubanResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

<a name="getPassport"></a>
# **getPassport**
> GetKycPassportResponse getPassport().passportNumber(passportNumber).surname(surname).execute();

KYC - Passport

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    String passportNumber = "B00671500";
    String surname = "adekanmi";
    try {
      GetKycPassportResponse result = client
              .nigeriaKyc
              .getPassport()
              .passportNumber(passportNumber)
              .surname(surname)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getPassport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetKycPassportResponse> response = client
              .nigeriaKyc
              .getPassport()
              .passportNumber(passportNumber)
              .surname(surname)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getPassport");
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
| **passportNumber** | **String**|  | [optional] |
| **surname** | **String**|  | [optional] |

### Return type

[**GetKycPassportResponse**](GetKycPassportResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getPhoneNumber"></a>
# **getPhoneNumber**
> GetPhoneNumberResponse getPhoneNumber().phoneNumber(phoneNumber).execute();

KYC - Lookup Phone Number

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    Integer phoneNumber = 8034628633;
    try {
      GetPhoneNumberResponse result = client
              .nigeriaKyc
              .getPhoneNumber()
              .phoneNumber(phoneNumber)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getPhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPhoneNumberResponse> response = client
              .nigeriaKyc
              .getPhoneNumber()
              .phoneNumber(phoneNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getPhoneNumber");
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
| **phoneNumber** | **Integer**|  | [optional] |

### Return type

[**GetPhoneNumberResponse**](GetPhoneNumberResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth), [noauthAuth](../README.md#noauthAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

<a name="getPremiumBvn"></a>
# **getPremiumBvn**
> GetPremiumBvnResponse getPremiumBvn().bvn(bvn).execute();

KYC - Lookup BVN Premium

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    Integer bvn = 22200508254;
    try {
      GetPremiumBvnResponse result = client
              .nigeriaKyc
              .getPremiumBvn()
              .bvn(bvn)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getPremiumBvn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPremiumBvnResponse> response = client
              .nigeriaKyc
              .getPremiumBvn()
              .bvn(bvn)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getPremiumBvn");
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
| **bvn** | **Integer**|  | [optional] |

### Return type

[**GetPremiumBvnResponse**](GetPremiumBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

<a name="getVnin"></a>
# **getVnin**
> GetVninResponse getVnin().vnin(vnin).execute();

Lookup VNIN

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
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
    String vnin = "LC829995256998RD";
    try {
      GetVninResponse result = client
              .nigeriaKyc
              .getVnin()
              .vnin(vnin)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getVnin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetVninResponse> response = client
              .nigeriaKyc
              .getVnin()
              .vnin(vnin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NigeriaKycApi#getVnin");
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
| **vnin** | **String**|  | [optional] |

### Return type

[**GetVninResponse**](GetVninResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

