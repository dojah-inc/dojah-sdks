# Dojah.Net.Api.VerificationsApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ValidateBvn**](VerificationsApi.md#validatebvn) | **GET** /v1/kyc/bvn | KYC - Validate BVN |
| [**VerifyAge**](VerificationsApi.md#verifyage) | **GET** /v1/kyc/age_verification | KYC - Age Verification |
| [**VerifySelfieBvn**](VerificationsApi.md#verifyselfiebvn) | **POST** /v1/kyc/bvn/verify | KYV - Selfie BVN Verificatoin |
| [**VerifySelfieNin**](VerificationsApi.md#verifyselfienin) | **POST** /api/v1/kyc/nin/verify | KYC - Selfie NIN Verification |
| [**VerifySelfieVnin**](VerificationsApi.md#verifyselfievnin) | **POST** /api/v1/kyc/vnin/verify | KYC - Selfie vNIN verification |

<a name="validatebvn"></a>
# **ValidateBvn**
> Object ValidateBvn (string appId = null, int? bvn = null, string firstName = null, string dob = null)

KYC - Validate BVN

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
    public class ValidateBvnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new VerificationsApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var bvn = 22250148240;  // int? |  (optional) 
            var firstName = FRANCIS;  // string |  (optional) 
            var dob = 1982-02-19;  // string |  (optional) 

            try
            {
                // KYC - Validate BVN
                Object result = apiInstance.ValidateBvn(appId, bvn, firstName, dob);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling VerificationsApi.ValidateBvn: " + e.Message);
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

#### Using the ValidateBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Validate BVN
    ApiResponse<Object> response = apiInstance.ValidateBvnWithHttpInfo(appId, bvn, firstName, dob);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VerificationsApi.ValidateBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **bvn** | **int?** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **dob** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyage"></a>
# **VerifyAge**
> VerifyAgeResponse VerifyAge (string appId = null, string mode = null, int? accountNumber = null, int? bankCode = null, string dob = null, string firstName = null, string lastName = null)

KYC - Age Verification

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
    public class VerifyAgeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new VerificationsApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var mode = account_number;  // string |  (optional) 
            var accountNumber = 3046507407;  // int? |  (optional) 
            var bankCode = 11;  // int? |  (optional) 
            var dob = 1993-06-10;  // string |  (optional) 
            var firstName = Mosh;  // string |  (optional) 
            var lastName = Saliu;  // string |  (optional) 

            try
            {
                // KYC - Age Verification
                VerifyAgeResponse result = apiInstance.VerifyAge(appId, mode, accountNumber, bankCode, dob, firstName, lastName);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling VerificationsApi.VerifyAge: " + e.Message);
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

#### Using the VerifyAgeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Age Verification
    ApiResponse<VerifyAgeResponse> response = apiInstance.VerifyAgeWithHttpInfo(appId, mode, accountNumber, bankCode, dob, firstName, lastName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VerificationsApi.VerifyAgeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **mode** | **string** |  | [optional]  |
| **accountNumber** | **int?** |  | [optional]  |
| **bankCode** | **int?** |  | [optional]  |
| **dob** | **string** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |

### Return type

[**VerifyAgeResponse**](VerifyAgeResponse.md)

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

<a name="verifyselfiebvn"></a>
# **VerifySelfieBvn**
> VerifySelfieBvnResponse VerifySelfieBvn (VerifySelfieBvnRequest verifySelfieBvnRequest, string appId = null)

KYV - Selfie BVN Verificatoin

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
    public class VerifySelfieBvnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new VerificationsApi(config);
            var verifySelfieBvnRequest = new VerifySelfieBvnRequest(); // VerifySelfieBvnRequest | 
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // KYV - Selfie BVN Verificatoin
                VerifySelfieBvnResponse result = apiInstance.VerifySelfieBvn(verifySelfieBvnRequest, appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling VerificationsApi.VerifySelfieBvn: " + e.Message);
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

#### Using the VerifySelfieBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYV - Selfie BVN Verificatoin
    ApiResponse<VerifySelfieBvnResponse> response = apiInstance.VerifySelfieBvnWithHttpInfo(verifySelfieBvnRequest, appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VerificationsApi.VerifySelfieBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **verifySelfieBvnRequest** | [**VerifySelfieBvnRequest**](VerifySelfieBvnRequest.md) |  |  |
| **appId** | **string** |  | [optional]  |

### Return type

[**VerifySelfieBvnResponse**](VerifySelfieBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyselfienin"></a>
# **VerifySelfieNin**
> Object VerifySelfieNin (VerificationsVerifySelfieNinRequest verificationsVerifySelfieNinRequest, string appId = null)

KYC - Selfie NIN Verification

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
    public class VerifySelfieNinExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new VerificationsApi(config);
            var verificationsVerifySelfieNinRequest = new VerificationsVerifySelfieNinRequest(); // VerificationsVerifySelfieNinRequest | 
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // KYC - Selfie NIN Verification
                Object result = apiInstance.VerifySelfieNin(verificationsVerifySelfieNinRequest, appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling VerificationsApi.VerifySelfieNin: " + e.Message);
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

#### Using the VerifySelfieNinWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Selfie NIN Verification
    ApiResponse<Object> response = apiInstance.VerifySelfieNinWithHttpInfo(verificationsVerifySelfieNinRequest, appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VerificationsApi.VerifySelfieNinWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **verificationsVerifySelfieNinRequest** | [**VerificationsVerifySelfieNinRequest**](VerificationsVerifySelfieNinRequest.md) |  |  |
| **appId** | **string** |  | [optional]  |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyselfievnin"></a>
# **VerifySelfieVnin**
> Object VerifySelfieVnin (VerificationsVerifySelfieVninRequest verificationsVerifySelfieVninRequest, string appId = null)

KYC - Selfie vNIN verification

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
    public class VerifySelfieVninExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";

            var apiInstance = new VerificationsApi(config);
            var verificationsVerifySelfieVninRequest = new VerificationsVerifySelfieVninRequest(); // VerificationsVerifySelfieVninRequest | 
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // KYC - Selfie vNIN verification
                Object result = apiInstance.VerifySelfieVnin(verificationsVerifySelfieVninRequest, appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling VerificationsApi.VerifySelfieVnin: " + e.Message);
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

#### Using the VerifySelfieVninWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Selfie vNIN verification
    ApiResponse<Object> response = apiInstance.VerifySelfieVninWithHttpInfo(verificationsVerifySelfieVninRequest, appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VerificationsApi.VerifySelfieVninWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **verificationsVerifySelfieVninRequest** | [**VerificationsVerifySelfieVninRequest**](VerificationsVerifySelfieVninRequest.md) |  |  |
| **appId** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

