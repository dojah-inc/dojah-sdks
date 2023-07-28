# VerificationsApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateBvn**](VerificationsApi.md#validateBvn) | **GET** /v1/kyc/bvn | KYC - Validate BVN |
| [**verifyAge**](VerificationsApi.md#verifyAge) | **GET** /v1/kyc/age_verification | KYC - Age Verification |
| [**verifySelfieBvn**](VerificationsApi.md#verifySelfieBvn) | **POST** /v1/kyc/bvn/verify | KYV - Selfie BVN Verificatoin |
| [**verifySelfieNin**](VerificationsApi.md#verifySelfieNin) | **POST** /api/v1/kyc/nin/verify | KYC - Selfie NIN Verification |
| [**verifySelfieVnin**](VerificationsApi.md#verifySelfieVnin) | **POST** /api/v1/kyc/vnin/verify | KYC - Selfie vNIN verification |


<a name="validateBvn"></a>
# **validateBvn**
> Object validateBvn().bvn(bvn).firstName(firstName).dob(dob).execute();

KYC - Validate BVN

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.VerificationsApi;
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
    Integer bvn = 22250148240;
    String firstName = "FRANCIS";
    String dob = "1982-02-19";
    try {
      Object result = client
              .verifications
              .validateBvn()
              .bvn(bvn)
              .firstName(firstName)
              .dob(dob)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#validateBvn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .verifications
              .validateBvn()
              .bvn(bvn)
              .firstName(firstName)
              .dob(dob)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#validateBvn");
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
| **firstName** | **String**|  | [optional] |
| **dob** | **String**|  | [optional] |

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

<a name="verifyAge"></a>
# **verifyAge**
> VerifyAgeResponse verifyAge().mode(mode).accountNumber(accountNumber).bankCode(bankCode).dob(dob).firstName(firstName).lastName(lastName).execute();

KYC - Age Verification

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.VerificationsApi;
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
    String mode = "account_number";
    Integer accountNumber = 3046507407;
    Integer bankCode = 11;
    String dob = "1993-06-10";
    String firstName = "Mosh";
    String lastName = "Saliu";
    try {
      VerifyAgeResponse result = client
              .verifications
              .verifyAge()
              .mode(mode)
              .accountNumber(accountNumber)
              .bankCode(bankCode)
              .dob(dob)
              .firstName(firstName)
              .lastName(lastName)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verifyAge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VerifyAgeResponse> response = client
              .verifications
              .verifyAge()
              .mode(mode)
              .accountNumber(accountNumber)
              .bankCode(bankCode)
              .dob(dob)
              .firstName(firstName)
              .lastName(lastName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verifyAge");
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
| **mode** | **String**|  | [optional] |
| **accountNumber** | **Integer**|  | [optional] |
| **bankCode** | **Integer**|  | [optional] |
| **dob** | **String**|  | [optional] |
| **firstName** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |

### Return type

[**VerifyAgeResponse**](VerifyAgeResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

<a name="verifySelfieBvn"></a>
# **verifySelfieBvn**
> VerifySelfieBvnResponse verifySelfieBvn(verifySelfieBvnRequest).execute();

KYV - Selfie BVN Verificatoin

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.VerificationsApi;
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
    String bvn = "bvn_example";
    String selfieImage = "selfieImage_example";
    try {
      VerifySelfieBvnResponse result = client
              .verifications
              .verifySelfieBvn()
              .bvn(bvn)
              .selfieImage(selfieImage)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verifySelfieBvn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VerifySelfieBvnResponse> response = client
              .verifications
              .verifySelfieBvn()
              .bvn(bvn)
              .selfieImage(selfieImage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verifySelfieBvn");
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
| **verifySelfieBvnRequest** | [**VerifySelfieBvnRequest**](VerifySelfieBvnRequest.md)|  | |

### Return type

[**VerifySelfieBvnResponse**](VerifySelfieBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="verifySelfieNin"></a>
# **verifySelfieNin**
> Object verifySelfieNin(verificationsVerifySelfieNinRequest).execute();

KYC - Selfie NIN Verification

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.VerificationsApi;
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
    String nin = "nin_example";
    String selfieImage = "selfieImage_example";
    try {
      Object result = client
              .verifications
              .verifySelfieNin()
              .nin(nin)
              .selfieImage(selfieImage)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verifySelfieNin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .verifications
              .verifySelfieNin()
              .nin(nin)
              .selfieImage(selfieImage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verifySelfieNin");
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
| **verificationsVerifySelfieNinRequest** | [**VerificationsVerifySelfieNinRequest**](VerificationsVerifySelfieNinRequest.md)|  | |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="verifySelfieVnin"></a>
# **verifySelfieVnin**
> Object verifySelfieVnin(verificationsVerifySelfieVninRequest).execute();

KYC - Selfie vNIN verification

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.VerificationsApi;
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
    String vnin = "vnin_example";
    String selfieImage = "selfieImage_example";
    try {
      Object result = client
              .verifications
              .verifySelfieVnin()
              .vnin(vnin)
              .selfieImage(selfieImage)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verifySelfieVnin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .verifications
              .verifySelfieVnin()
              .vnin(vnin)
              .selfieImage(selfieImage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verifySelfieVnin");
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
| **verificationsVerifySelfieVninRequest** | [**VerificationsVerifySelfieVninRequest**](VerificationsVerifySelfieVninRequest.md)|  | |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

