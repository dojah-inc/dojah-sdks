# Dojah.Net.Api.AuthenticationApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetSenderId**](AuthenticationApi.md#getsenderid) | **GET** /api/v1/messaging/sender_ids | Messaging - Get Sender IDs |
| [**GetSmsStatus**](AuthenticationApi.md#getsmsstatus) | **GET** /v1/messaging/sms/get_status | Messaging - Get SMS Status |
| [**RequestSenderId**](AuthenticationApi.md#requestsenderid) | **POST** /api/v1/messaging/sender_id | Messaging - Request Sender ID |
| [**SendOtp**](AuthenticationApi.md#sendotp) | **POST** /api/v1/messaging/otp | Messaging - Send OTP |
| [**SendSms**](AuthenticationApi.md#sendsms) | **POST** /api/v1/messaging/sms | Messaging - Send SMS |
| [**ValidateOtp**](AuthenticationApi.md#validateotp) | **GET** /api/v1/messaging/otp/validate | Messaging - Validate OTP |

<a name="getsenderid"></a>
# **GetSenderId**
> GetSenderIdResponse GetSenderId (string appId = null)

Messaging - Get Sender IDs

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetSenderIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new AuthenticationApi(config);
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // Messaging - Get Sender IDs
                GetSenderIdResponse result = apiInstance.GetSenderId(appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AuthenticationApi.GetSenderId: " + e.Message);
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

#### Using the GetSenderIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Messaging - Get Sender IDs
    ApiResponse<GetSenderIdResponse> response = apiInstance.GetSenderIdWithHttpInfo(appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.GetSenderIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |

### Return type

[**GetSenderIdResponse**](GetSenderIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsmsstatus"></a>
# **GetSmsStatus**
> GetSmsStatusResponse GetSmsStatus (string appId = null, string messageId = null)

Messaging - Get SMS Status

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetSmsStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new AuthenticationApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var messageId = 54818c8a-4aed-4e5f-b846-8274fd4e0bbd;  // string |  (optional) 

            try
            {
                // Messaging - Get SMS Status
                GetSmsStatusResponse result = apiInstance.GetSmsStatus(appId, messageId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AuthenticationApi.GetSmsStatus: " + e.Message);
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

#### Using the GetSmsStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Messaging - Get SMS Status
    ApiResponse<GetSmsStatusResponse> response = apiInstance.GetSmsStatusWithHttpInfo(appId, messageId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.GetSmsStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **messageId** | **string** |  | [optional]  |

### Return type

[**GetSmsStatusResponse**](GetSmsStatusResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="requestsenderid"></a>
# **RequestSenderId**
> RequestSenderIdResponse RequestSenderId (RequestSenderIdRequest requestSenderIdRequest, string appId = null)

Messaging - Request Sender ID

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class RequestSenderIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";

            var apiInstance = new AuthenticationApi(config);
            var requestSenderIdRequest = new RequestSenderIdRequest(); // RequestSenderIdRequest | 
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // Messaging - Request Sender ID
                RequestSenderIdResponse result = apiInstance.RequestSenderId(requestSenderIdRequest, appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AuthenticationApi.RequestSenderId: " + e.Message);
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

#### Using the RequestSenderIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Messaging - Request Sender ID
    ApiResponse<RequestSenderIdResponse> response = apiInstance.RequestSenderIdWithHttpInfo(requestSenderIdRequest, appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.RequestSenderIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **requestSenderIdRequest** | [**RequestSenderIdRequest**](RequestSenderIdRequest.md) |  |  |
| **appId** | **string** |  | [optional]  |

### Return type

[**RequestSenderIdResponse**](RequestSenderIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="sendotp"></a>
# **SendOtp**
> AuthenticationSendOtpResponse SendOtp (AuthenticationSendOtpRequest authenticationSendOtpRequest, string appId = null)

Messaging - Send OTP

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class SendOtpExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new AuthenticationApi(config);
            var authenticationSendOtpRequest = new AuthenticationSendOtpRequest(); // AuthenticationSendOtpRequest | 
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // Messaging - Send OTP
                AuthenticationSendOtpResponse result = apiInstance.SendOtp(authenticationSendOtpRequest, appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AuthenticationApi.SendOtp: " + e.Message);
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

#### Using the SendOtpWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Messaging - Send OTP
    ApiResponse<AuthenticationSendOtpResponse> response = apiInstance.SendOtpWithHttpInfo(authenticationSendOtpRequest, appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.SendOtpWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authenticationSendOtpRequest** | [**AuthenticationSendOtpRequest**](AuthenticationSendOtpRequest.md) |  |  |
| **appId** | **string** |  | [optional]  |

### Return type

[**AuthenticationSendOtpResponse**](AuthenticationSendOtpResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="sendsms"></a>
# **SendSms**
> SendSmsResponse SendSms (SendSmsRequest sendSmsRequest, string appId = null)

Messaging - Send SMS

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class SendSmsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new AuthenticationApi(config);
            var sendSmsRequest = new SendSmsRequest(); // SendSmsRequest | 
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // Messaging - Send SMS
                SendSmsResponse result = apiInstance.SendSms(sendSmsRequest, appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AuthenticationApi.SendSms: " + e.Message);
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

#### Using the SendSmsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Messaging - Send SMS
    ApiResponse<SendSmsResponse> response = apiInstance.SendSmsWithHttpInfo(sendSmsRequest, appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.SendSmsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sendSmsRequest** | [**SendSmsRequest**](SendSmsRequest.md) |  |  |
| **appId** | **string** |  | [optional]  |

### Return type

[**SendSmsResponse**](SendSmsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="validateotp"></a>
# **ValidateOtp**
> AuthenticationValidateOtpResponse ValidateOtp (string appId = null, string referenceId = null, int? code = null)

Messaging - Validate OTP

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class ValidateOtpExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new AuthenticationApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var referenceId = a89e4b64-367f-414f-a189-1800bc364b05;  // string |  (optional) 
            var code = 81974;  // int? |  (optional) 

            try
            {
                // Messaging - Validate OTP
                AuthenticationValidateOtpResponse result = apiInstance.ValidateOtp(appId, referenceId, code);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AuthenticationApi.ValidateOtp: " + e.Message);
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

#### Using the ValidateOtpWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Messaging - Validate OTP
    ApiResponse<AuthenticationValidateOtpResponse> response = apiInstance.ValidateOtpWithHttpInfo(appId, referenceId, code);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AuthenticationApi.ValidateOtpWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **referenceId** | **string** |  | [optional]  |
| **code** | **int?** |  | [optional]  |

### Return type

[**AuthenticationValidateOtpResponse**](AuthenticationValidateOtpResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

