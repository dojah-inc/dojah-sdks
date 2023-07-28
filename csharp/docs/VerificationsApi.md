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
> Object ValidateBvn (int? bvn = null, string firstName = null, string dob = null)

KYC - Validate BVN

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class ValidateBvnExample
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

            var bvn = 22250148240;  // int? |  (optional) 
            var firstName = "FRANCIS";  // string |  (optional) 
            var dob = "1982-02-19";  // string |  (optional) 

            try
            {
                // KYC - Validate BVN
                Object result = client.Verifications.ValidateBvn(bvn, firstName, dob);
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
    ApiResponse<Object> response = apiInstance.ValidateBvnWithHttpInfo(bvn, firstName, dob);
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
| **bvn** | **int?** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **dob** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyage"></a>
# **VerifyAge**
> VerifyAgeResponse VerifyAge (string mode = null, int? accountNumber = null, int? bankCode = null, string dob = null, string firstName = null, string lastName = null)

KYC - Age Verification

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class VerifyAgeExample
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

            var mode = "account_number";  // string |  (optional) 
            var accountNumber = 3046507407;  // int? |  (optional) 
            var bankCode = 11;  // int? |  (optional) 
            var dob = "1993-06-10";  // string |  (optional) 
            var firstName = "Mosh";  // string |  (optional) 
            var lastName = "Saliu";  // string |  (optional) 

            try
            {
                // KYC - Age Verification
                VerifyAgeResponse result = client.Verifications.VerifyAge(mode, accountNumber, bankCode, dob, firstName, lastName);
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
    ApiResponse<VerifyAgeResponse> response = apiInstance.VerifyAgeWithHttpInfo(mode, accountNumber, bankCode, dob, firstName, lastName);
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
| **mode** | **string** |  | [optional]  |
| **accountNumber** | **int?** |  | [optional]  |
| **bankCode** | **int?** |  | [optional]  |
| **dob** | **string** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyselfiebvn"></a>
# **VerifySelfieBvn**
> VerifySelfieBvnResponse VerifySelfieBvn (VerifySelfieBvnRequest verifySelfieBvnRequest)

KYV - Selfie BVN Verificatoin

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class VerifySelfieBvnExample
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

            var verifySelfieBvnRequest = new VerifySelfieBvnRequest(); // VerifySelfieBvnRequest | 

            try
            {
                // KYV - Selfie BVN Verificatoin
                VerifySelfieBvnResponse result = client.Verifications.VerifySelfieBvn(verifySelfieBvnRequest);
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
    ApiResponse<VerifySelfieBvnResponse> response = apiInstance.VerifySelfieBvnWithHttpInfo(verifySelfieBvnRequest);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyselfienin"></a>
# **VerifySelfieNin**
> Object VerifySelfieNin (VerificationsVerifySelfieNinRequest verificationsVerifySelfieNinRequest)

KYC - Selfie NIN Verification

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class VerifySelfieNinExample
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

            var verificationsVerifySelfieNinRequest = new VerificationsVerifySelfieNinRequest(); // VerificationsVerifySelfieNinRequest | 

            try
            {
                // KYC - Selfie NIN Verification
                Object result = client.Verifications.VerifySelfieNin(verificationsVerifySelfieNinRequest);
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
    ApiResponse<Object> response = apiInstance.VerifySelfieNinWithHttpInfo(verificationsVerifySelfieNinRequest);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyselfievnin"></a>
# **VerifySelfieVnin**
> Object VerifySelfieVnin (VerificationsVerifySelfieVninRequest verificationsVerifySelfieVninRequest)

KYC - Selfie vNIN verification

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class VerifySelfieVninExample
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

            var verificationsVerifySelfieVninRequest = new VerificationsVerifySelfieVninRequest(); // VerificationsVerifySelfieVninRequest | 

            try
            {
                // KYC - Selfie vNIN verification
                Object result = client.Verifications.VerifySelfieVnin(verificationsVerifySelfieVninRequest);
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
    ApiResponse<Object> response = apiInstance.VerifySelfieVninWithHttpInfo(verificationsVerifySelfieVninRequest);
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

