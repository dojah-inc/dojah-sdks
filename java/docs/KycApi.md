# KycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkLiveness**](KycApi.md#checkLiveness) | **POST** /api/v1/ml/liveness | Liveness Check |
| [**getAccounts**](KycApi.md#getAccounts) | **GET** /api/v1/kyc/accounts | KYC - Fetch Accounts  |
| [**getAddressVerification**](KycApi.md#getAddressVerification) | **GET** /api/v1/kyc/address | Fetch Address Verification Data |
| [**getBvnFromNuban**](KycApi.md#getBvnFromNuban) | **GET** /api/v1/kyc/nuban/bvn | Lookup BVN from NUBAN |
| [**getVin**](KycApi.md#getVin) | **GET** /api/v1/kyc/vin | KYC - Get VIN |
| [**submitAddress**](KycApi.md#submitAddress) | **POST** /api/v1/kyc/address | Submit Address |


<a name="checkLiveness"></a>
# **checkLiveness**
> Object checkLiveness(kycCheckLivenessRequest).appId(appId).execute();

Liveness Check

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String image = "image_example";
    String appId = "{{app_id}}";
    try {
      Object result = client
              .kyc
              .checkLiveness()
              .image(image)
              .appId(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#checkLiveness");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .kyc
              .checkLiveness()
              .image(image)
              .appId(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#checkLiveness");
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
| **kycCheckLivenessRequest** | [**KycCheckLivenessRequest**](KycCheckLivenessRequest.md)|  | |
| **appId** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getAccounts"></a>
# **getAccounts**
> Object getAccounts().appId(appId).bvn(bvn).execute();

KYC - Fetch Accounts 

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    String bvn = "22342291445 ";
    try {
      Object result = client
              .kyc
              .getAccounts()
              .appId(appId)
              .bvn(bvn)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#getAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .kyc
              .getAccounts()
              .appId(appId)
              .bvn(bvn)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#getAccounts");
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
| **bvn** | **String**|  | [optional] |

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

<a name="getAddressVerification"></a>
# **getAddressVerification**
> Object getAddressVerification().appId(appId).referenceId(referenceId).execute();

Fetch Address Verification Data

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    String referenceId = "69e10264-4b90-64fe-b4b7-c9dddafd0241";
    try {
      Object result = client
              .kyc
              .getAddressVerification()
              .appId(appId)
              .referenceId(referenceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#getAddressVerification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .kyc
              .getAddressVerification()
              .appId(appId)
              .referenceId(referenceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#getAddressVerification");
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
| **referenceId** | **String**|  | [optional] |

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

<a name="getBvnFromNuban"></a>
# **getBvnFromNuban**
> Object getBvnFromNuban().appId(appId).bankCode(bankCode).accountNumber(accountNumber).execute();

Lookup BVN from NUBAN

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";
    

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    Integer bankCode = 57;
    Integer accountNumber = 2174879334;
    try {
      Object result = client
              .kyc
              .getBvnFromNuban()
              .appId(appId)
              .bankCode(bankCode)
              .accountNumber(accountNumber)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#getBvnFromNuban");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .kyc
              .getBvnFromNuban()
              .appId(appId)
              .bankCode(bankCode)
              .accountNumber(accountNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#getBvnFromNuban");
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
| **bankCode** | **Integer**|  | [optional] |
| **accountNumber** | **Integer**|  | [optional] |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="getVin"></a>
# **getVin**
> GetVinResponse getVin().appId(appId).vin(vin).execute();

KYC - Get VIN

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";
    

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    String vin = "90F5B20205096041114";
    try {
      GetVinResponse result = client
              .kyc
              .getVin()
              .appId(appId)
              .vin(vin)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#getVin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetVinResponse> response = client
              .kyc
              .getVin()
              .appId(appId)
              .vin(vin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#getVin");
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
| **vin** | **String**|  | [optional] |

### Return type

[**GetVinResponse**](GetVinResponse.md)

### Authorization

[noauthAuth](../README.md#noauthAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * cf-request-id -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

<a name="submitAddress"></a>
# **submitAddress**
> KycSubmitAddressResponse submitAddress().appId(appId).kycSubmitAddressRequest(kycSubmitAddressRequest).execute();

Submit Address

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.KycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String street = "street_example";
    String lga = "lga_example";
    String state = "state_example";
    String landmark = "landmark_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String middleName = "middleName_example";
    String dob = "dob_example";
    String gender = "gender_example";
    String mobile = "mobile_example";
    String appId = "{{app_id}}";
    try {
      KycSubmitAddressResponse result = client
              .kyc
              .submitAddress()
              .street(street)
              .lga(lga)
              .state(state)
              .landmark(landmark)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .dob(dob)
              .gender(gender)
              .mobile(mobile)
              .appId(appId)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#submitAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KycSubmitAddressResponse> response = client
              .kyc
              .submitAddress()
              .street(street)
              .lga(lga)
              .state(state)
              .landmark(landmark)
              .firstName(firstName)
              .lastName(lastName)
              .middleName(middleName)
              .dob(dob)
              .gender(gender)
              .mobile(mobile)
              .appId(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KycApi#submitAddress");
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
| **kycSubmitAddressRequest** | [**KycSubmitAddressRequest**](KycSubmitAddressRequest.md)|  | [optional] |

### Return type

[**KycSubmitAddressResponse**](KycSubmitAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

