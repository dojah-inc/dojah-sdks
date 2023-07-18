# ZwKycApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCredit**](ZwKycApi.md#checkCredit) | **GET** /api/v1/zw/kyc/fcb | Credit Check |
| [**verifyId**](ZwKycApi.md#verifyId) | **GET** /api/v1/zw/kyc/nin | National ID Verification |


<a name="checkCredit"></a>
# **checkCredit**
> ZwKycCheckCreditResponse checkCredit().appId(appId).idNumber(idNumber).name(name).surname(surname).gender(gender).dob(dob).maritalStatus(maritalStatus).mobileNumber(mobileNumber).execute();

Credit Check

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.ZwKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    String idNumber = "45190221E45";
    String name = "CHIMUNDEGE";
    String surname = "CHIMUNDEGE";
    String gender = "F";
    String dob = "1994-04-03";
    String maritalStatus = "M";
    Integer mobileNumber = 26424257383;
    try {
      ZwKycCheckCreditResponse result = client
              .zwKyc
              .checkCredit()
              .appId(appId)
              .idNumber(idNumber)
              .name(name)
              .surname(surname)
              .gender(gender)
              .dob(dob)
              .maritalStatus(maritalStatus)
              .mobileNumber(mobileNumber)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling ZwKycApi#checkCredit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ZwKycCheckCreditResponse> response = client
              .zwKyc
              .checkCredit()
              .appId(appId)
              .idNumber(idNumber)
              .name(name)
              .surname(surname)
              .gender(gender)
              .dob(dob)
              .maritalStatus(maritalStatus)
              .mobileNumber(mobileNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZwKycApi#checkCredit");
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
| **idNumber** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **surname** | **String**|  | [optional] |
| **gender** | **String**|  | [optional] |
| **dob** | **String**|  | [optional] |
| **maritalStatus** | **String**|  | [optional] |
| **mobileNumber** | **Integer**|  | [optional] |

### Return type

[**ZwKycCheckCreditResponse**](ZwKycCheckCreditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Strict-Transport-Security -  <br>  * X-Content-Type-Options -  <br>  * Server -  <br>  * CF-RAY -  <br>  * alt-svc -  <br>  |

<a name="verifyId"></a>
# **verifyId**
> ZwKycVerifyIdResponse verifyId().appId(appId).id(id).execute();

National ID Verification

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.ZwKycApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";

    Dojah client = new Dojah(configuration);
    String appId = "{{app_id}}";
    String id = "45190221E45";
    try {
      ZwKycVerifyIdResponse result = client
              .zwKyc
              .verifyId()
              .appId(appId)
              .id(id)
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling ZwKycApi#verifyId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ZwKycVerifyIdResponse> response = client
              .zwKyc
              .verifyId()
              .appId(appId)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZwKycApi#verifyId");
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

### Return type

[**ZwKycVerifyIdResponse**](ZwKycVerifyIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

