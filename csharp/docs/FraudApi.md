# Dojah.Net.Api.FraudApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetEmailReputation**](FraudApi.md#getemailreputation) | **GET** /api/v1/kyc/email | Email Reputation |
| [**GetIpReputation**](FraudApi.md#getipreputation) | **GET** /api/v1/fraud/ip | IP Reputation |
| [**ScreenPhone**](FraudApi.md#screenphone) | **GET** /api/v1/fraud/phone | Phone Screening |
| [**ScreenUser**](FraudApi.md#screenuser) | **GET** /api/v1/fraud/user | User Screening |

<a name="getemailreputation"></a>
# **GetEmailReputation**
> FraudGetEmailReputationResponse GetEmailReputation (string email = null)

Email Reputation

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetEmailReputationExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            var email = "johndoe@gmail.com";  // string |  (optional) 

            try
            {
                // Email Reputation
                FraudGetEmailReputationResponse result = client.Fraud.GetEmailReputation(email);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FraudApi.GetEmailReputation: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the GetEmailReputationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Email Reputation
    ApiResponse<FraudGetEmailReputationResponse> response = apiInstance.GetEmailReputationWithHttpInfo(email);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FraudApi.GetEmailReputationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **email** | **string** |  | [optional]  |

### Return type

[**FraudGetEmailReputationResponse**](FraudGetEmailReputationResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * CF-Ray -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * X-Powered-By -  <br>  * Report-To -  <br>  * NEL -  <br>  * Vary -  <br>  * Server -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getipreputation"></a>
# **GetIpReputation**
> FraudGetIpReputationResponse GetIpReputation (string ipAddress = null)

IP Reputation

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetIpReputationExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            var ipAddress = "102.215.56.170";  // string |  (optional) 

            try
            {
                // IP Reputation
                FraudGetIpReputationResponse result = client.Fraud.GetIpReputation(ipAddress);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FraudApi.GetIpReputation: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the GetIpReputationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // IP Reputation
    ApiResponse<FraudGetIpReputationResponse> response = apiInstance.GetIpReputationWithHttpInfo(ipAddress);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FraudApi.GetIpReputationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ipAddress** | **string** |  | [optional]  |

### Return type

[**FraudGetIpReputationResponse**](FraudGetIpReputationResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Server-Timing -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="screenphone"></a>
# **ScreenPhone**
> FraudScreenPhoneResponse ScreenPhone (int? phoneNumber = null)

Phone Screening

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class ScreenPhoneExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            var phoneNumber = 2348068810228;  // int? |  (optional) 

            try
            {
                // Phone Screening
                FraudScreenPhoneResponse result = client.Fraud.ScreenPhone(phoneNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FraudApi.ScreenPhone: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the ScreenPhoneWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Phone Screening
    ApiResponse<FraudScreenPhoneResponse> response = apiInstance.ScreenPhoneWithHttpInfo(phoneNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FraudApi.ScreenPhoneWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **phoneNumber** | **int?** |  | [optional]  |

### Return type

[**FraudScreenPhoneResponse**](FraudScreenPhoneResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="screenuser"></a>
# **ScreenUser**
> FraudScreenUserResponse ScreenUser (string firstName = null, string lastName = null, string dateOfBirth = null, string email = null, string phone = null, string ipAddress = null)

User Screening

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class ScreenUserExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            var firstName = "Robert";  // string |  (optional) 
            var lastName = "Morris";  // string |  (optional) 
            var dateOfBirth = "1986-11-12";  // string |  (optional) 
            var email = "andre.little@moore.com";  // string |  (optional) 
            var phone = "001-640-858-2058";  // string |  (optional) 
            var ipAddress = "116.7.209.8";  // string |  (optional) 

            try
            {
                // User Screening
                FraudScreenUserResponse result = client.Fraud.ScreenUser(firstName, lastName, dateOfBirth, email, phone, ipAddress);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FraudApi.ScreenUser: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the ScreenUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // User Screening
    ApiResponse<FraudScreenUserResponse> response = apiInstance.ScreenUserWithHttpInfo(firstName, lastName, dateOfBirth, email, phone, ipAddress);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FraudApi.ScreenUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |
| **email** | **string** |  | [optional]  |
| **phone** | **string** |  | [optional]  |
| **ipAddress** | **string** |  | [optional]  |

### Return type

[**FraudScreenUserResponse**](FraudScreenUserResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

