# Dojah.Net.Api.KYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AnalyzeDocument**](KYCApi.md#analyzedocument) | **POST** /api/v1/document/analysis | KYC - Document Analysis |
| [**GetBasicBvn**](KYCApi.md#getbasicbvn) | **GET** /api/v1/kyc/bvn/basic | KYC - Get Basic BVN Info |
| [**GetBasicPhoneNumber**](KYCApi.md#getbasicphonenumber) | **GET** /v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic |
| [**GetDriversLicense**](KYCApi.md#getdriverslicense) | **GET** /api/v1/kyc/dl | KYC - Get Drivers License Info |
| [**GetEmailReputation**](KYCApi.md#getemailreputation) | **GET** /v1/kyc/email | KYC - Get Email Reputation |
| [**GetFullBvn**](KYCApi.md#getfullbvn) | **GET** /api/v1/kyc/bvn/full | KYC - Lookup BVN Basic |
| [**GetNuban**](KYCApi.md#getnuban) | **GET** /api/v1/kyc/nuban | KYC - Get NUBAN Information |
| [**GetPassport**](KYCApi.md#getpassport) | **GET** /api/v1/kyc/passport | KYC - Passport |
| [**GetPhoneNumber**](KYCApi.md#getphonenumber) | **GET** /api/v1/kyc/phone_number | KYC - Lookup Phone Number |
| [**GetPremiumBvn**](KYCApi.md#getpremiumbvn) | **GET** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium |
| [**GetVIN**](KYCApi.md#getvin) | **GET** /api/v1/kyc/vin | KYC - Get VIN |
| [**GetVnin**](KYCApi.md#getvnin) | **GET** /api/v1/kyc/vnin | Lookup VNIN |
| [**ValidateBvn**](KYCApi.md#validatebvn) | **GET** /api/v1/kyc/bvn | KYC - Validate BVN |
| [**VerifyAge**](KYCApi.md#verifyage) | **GET** /v1/kyc/age_verification | KYC - Age Verification |
| [**VerifySelfieBvn**](KYCApi.md#verifyselfiebvn) | **POST** /v1/kyc/bvn/verify | KYC - Selfie BVN Verificatoin |
| [**VerifySelfieNin**](KYCApi.md#verifyselfienin) | **POST** /v1/kyc/nin/verify | KYC - Selfie NIN Verification |

<a name="analyzedocument"></a>
# **AnalyzeDocument**
> AnalyzeDocumentResponse AnalyzeDocument ()

KYC - Document Analysis

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class AnalyzeDocumentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);

            try
            {
                // KYC - Document Analysis
                AnalyzeDocumentResponse result = apiInstance.AnalyzeDocument();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.AnalyzeDocument: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AnalyzeDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Document Analysis
    ApiResponse<AnalyzeDocumentResponse> response = apiInstance.AnalyzeDocumentWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.AnalyzeDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**AnalyzeDocumentResponse**](AnalyzeDocumentResponse.md)

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

<a name="getbasicbvn"></a>
# **GetBasicBvn**
> GetBasicBvnResponse GetBasicBvn (int? bvn = null)

KYC - Get Basic BVN Info

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetBasicBvnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var bvn = 22468537919;  // int? |  (optional) 

            try
            {
                // KYC - Get Basic BVN Info
                GetBasicBvnResponse result = apiInstance.GetBasicBvn(bvn);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetBasicBvn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBasicBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get Basic BVN Info
    ApiResponse<GetBasicBvnResponse> response = apiInstance.GetBasicBvnWithHttpInfo(bvn);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetBasicBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bvn** | **int?** |  | [optional]  |

### Return type

[**GetBasicBvnResponse**](GetBasicBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbasicphonenumber"></a>
# **GetBasicPhoneNumber**
> GetBasicPhoneNumberResponse GetBasicPhoneNumber (int? phoneNumber = null)

KYC Lookup Phone Number Basic

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetBasicPhoneNumberExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var phoneNumber = 8068810228;  // int? |  (optional) 

            try
            {
                // KYC Lookup Phone Number Basic
                GetBasicPhoneNumberResponse result = apiInstance.GetBasicPhoneNumber(phoneNumber);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetBasicPhoneNumber: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBasicPhoneNumberWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC Lookup Phone Number Basic
    ApiResponse<GetBasicPhoneNumberResponse> response = apiInstance.GetBasicPhoneNumberWithHttpInfo(phoneNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetBasicPhoneNumberWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **phoneNumber** | **int?** |  | [optional]  |

### Return type

[**GetBasicPhoneNumberResponse**](GetBasicPhoneNumberResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdriverslicense"></a>
# **GetDriversLicense**
> GetKycDriversLicenseResponse GetDriversLicense (string licenseNumber = null)

KYC - Get Drivers License Info

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetDriversLicenseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var licenseNumber = FKJ49409AB13;  // string |  (optional) 

            try
            {
                // KYC - Get Drivers License Info
                GetKycDriversLicenseResponse result = apiInstance.GetDriversLicense(licenseNumber);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetDriversLicense: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetDriversLicenseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get Drivers License Info
    ApiResponse<GetKycDriversLicenseResponse> response = apiInstance.GetDriversLicenseWithHttpInfo(licenseNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetDriversLicenseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **licenseNumber** | **string** |  | [optional]  |

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
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getemailreputation"></a>
# **GetEmailReputation**
> GetEmailReputationResponse GetEmailReputation (string email = null)

KYC - Get Email Reputation

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetEmailReputationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var email = johndoe@gmail.com;  // string |  (optional) 

            try
            {
                // KYC - Get Email Reputation
                GetEmailReputationResponse result = apiInstance.GetEmailReputation(email);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetEmailReputation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
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
    // KYC - Get Email Reputation
    ApiResponse<GetEmailReputationResponse> response = apiInstance.GetEmailReputationWithHttpInfo(email);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetEmailReputationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **email** | **string** |  | [optional]  |

### Return type

[**GetEmailReputationResponse**](GetEmailReputationResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * CF-Ray -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * X-Powered-By -  <br>  * Report-To -  <br>  * NEL -  <br>  * Vary -  <br>  * Server -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfullbvn"></a>
# **GetFullBvn**
> GetFullBvnResponse GetFullBvn (int? bvn = null)

KYC - Lookup BVN Basic

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetFullBvnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var bvn = 22222222222;  // int? |  (optional) 

            try
            {
                // KYC - Lookup BVN Basic
                GetFullBvnResponse result = apiInstance.GetFullBvn(bvn);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetFullBvn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetFullBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Lookup BVN Basic
    ApiResponse<GetFullBvnResponse> response = apiInstance.GetFullBvnWithHttpInfo(bvn);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetFullBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bvn** | **int?** |  | [optional]  |

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
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getnuban"></a>
# **GetNuban**
> GetNubanResponse GetNuban (int? bankCode = null, int? accountNumber = null)

KYC - Get NUBAN Information

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetNubanExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var bankCode = 58;  // int? |  (optional) 
            var accountNumber = 11223344;  // int? |  (optional) 

            try
            {
                // KYC - Get NUBAN Information
                GetNubanResponse result = apiInstance.GetNuban(bankCode, accountNumber);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetNuban: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetNubanWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get NUBAN Information
    ApiResponse<GetNubanResponse> response = apiInstance.GetNubanWithHttpInfo(bankCode, accountNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetNubanWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bankCode** | **int?** |  | [optional]  |
| **accountNumber** | **int?** |  | [optional]  |

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
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpassport"></a>
# **GetPassport**
> GetKycPassportResponse GetPassport (int? passportNumber = null, string surname = null)

KYC - Passport

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetPassportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var passportNumber = 70142502085;  // int? |  (optional) 
            var surname = ololade;  // string |  (optional) 

            try
            {
                // KYC - Passport
                GetKycPassportResponse result = apiInstance.GetPassport(passportNumber, surname);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetPassport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetPassportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Passport
    ApiResponse<GetKycPassportResponse> response = apiInstance.GetPassportWithHttpInfo(passportNumber, surname);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetPassportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **passportNumber** | **int?** |  | [optional]  |
| **surname** | **string** |  | [optional]  |

### Return type

[**GetKycPassportResponse**](GetKycPassportResponse.md)

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

<a name="getphonenumber"></a>
# **GetPhoneNumber**
> GetPhoneNumberResponse GetPhoneNumber (int? phoneNumber = null)

KYC - Lookup Phone Number

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetPhoneNumberExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var phoneNumber = 8011111111;  // int? |  (optional) 

            try
            {
                // KYC - Lookup Phone Number
                GetPhoneNumberResponse result = apiInstance.GetPhoneNumber(phoneNumber);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetPhoneNumber: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetPhoneNumberWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Lookup Phone Number
    ApiResponse<GetPhoneNumberResponse> response = apiInstance.GetPhoneNumberWithHttpInfo(phoneNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetPhoneNumberWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **phoneNumber** | **int?** |  | [optional]  |

### Return type

[**GetPhoneNumberResponse**](GetPhoneNumberResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpremiumbvn"></a>
# **GetPremiumBvn**
> GetPremiumBvnResponse GetPremiumBvn (int? bvn = null)

KYC - Lookup BVN Premium

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetPremiumBvnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var bvn = 22305638508;  // int? |  (optional) 

            try
            {
                // KYC - Lookup BVN Premium
                GetPremiumBvnResponse result = apiInstance.GetPremiumBvn(bvn);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetPremiumBvn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetPremiumBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Lookup BVN Premium
    ApiResponse<GetPremiumBvnResponse> response = apiInstance.GetPremiumBvnWithHttpInfo(bvn);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetPremiumBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bvn** | **int?** |  | [optional]  |

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
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvin"></a>
# **GetVIN**
> GetVinResponse GetVIN (string mode = null, string firstname = null, string lastname = null, int? vin = null, string state = null)

KYC - Get VIN

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetVINExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var mode = vin;  // string |  (optional) 
            var firstname = moshood;  // string |  (optional) 
            var lastname = saliu;  // string |  (optional) 
            var vin = 55586;  // int? |  (optional) 
            var state = ondo;  // string |  (optional) 

            try
            {
                // KYC - Get VIN
                GetVinResponse result = apiInstance.GetVIN(mode, firstname, lastname, vin, state);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetVIN: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetVINWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get VIN
    ApiResponse<GetVinResponse> response = apiInstance.GetVINWithHttpInfo(mode, firstname, lastname, vin, state);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetVINWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mode** | **string** |  | [optional]  |
| **firstname** | **string** |  | [optional]  |
| **lastname** | **string** |  | [optional]  |
| **vin** | **int?** |  | [optional]  |
| **state** | **string** |  | [optional]  |

### Return type

[**GetVinResponse**](GetVinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * cf-request-id -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvnin"></a>
# **GetVnin**
> GetVninResponse GetVnin (string vnin = null)

Lookup VNIN

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetVninExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var vnin = AB012345678910YZ;  // string |  (optional) 

            try
            {
                // Lookup VNIN
                GetVninResponse result = apiInstance.GetVnin(vnin);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.GetVnin: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetVninWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Lookup VNIN
    ApiResponse<GetVninResponse> response = apiInstance.GetVninWithHttpInfo(vnin);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetVninWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vnin** | **string** |  | [optional]  |

### Return type

[**GetVninResponse**](GetVninResponse.md)

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

<a name="validatebvn"></a>
# **ValidateBvn**
> ValidateBvnResponse ValidateBvn (int? bvn = null, string firstName = null, string dob = null)

KYC - Validate BVN

### Example
```csharp
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
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var bvn = 22250148240;  // int? |  (optional) 
            var firstName = FRANCIS;  // string |  (optional) 
            var dob = 1982-02-19;  // string |  (optional) 

            try
            {
                // KYC - Validate BVN
                ValidateBvnResponse result = apiInstance.ValidateBvn(bvn, firstName, dob);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.ValidateBvn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
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
    ApiResponse<ValidateBvnResponse> response = apiInstance.ValidateBvnWithHttpInfo(bvn, firstName, dob);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.ValidateBvnWithHttpInfo: " + e.Message);
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

[**ValidateBvnResponse**](ValidateBvnResponse.md)

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
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var mode = account_number;  // string |  (optional) 
            var accountNumber = 3046507407;  // int? |  (optional) 
            var bankCode = 11;  // int? |  (optional) 
            var dob = 1993-06-10;  // string |  (optional) 
            var firstName = Mosh;  // string |  (optional) 
            var lastName = Saliu;  // string |  (optional) 

            try
            {
                // KYC - Age Verification
                VerifyAgeResponse result = apiInstance.VerifyAge(mode, accountNumber, bankCode, dob, firstName, lastName);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.VerifyAge: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
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
    Debug.Print("Exception when calling KYCApi.VerifyAgeWithHttpInfo: " + e.Message);
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
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyselfiebvn"></a>
# **VerifySelfieBvn**
> VerifySelfieBvnResponse VerifySelfieBvn (Object body = null)

KYC - Selfie BVN Verificatoin

### Example
```csharp
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
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var body = null;  // Object |  (optional) 

            try
            {
                // KYC - Selfie BVN Verificatoin
                VerifySelfieBvnResponse result = apiInstance.VerifySelfieBvn(body);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.VerifySelfieBvn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
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
    // KYC - Selfie BVN Verificatoin
    ApiResponse<VerifySelfieBvnResponse> response = apiInstance.VerifySelfieBvnWithHttpInfo(body);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.VerifySelfieBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **body** | **Object** |  | [optional]  |

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
> VerifySelfieNinResponse VerifySelfieNin (Object body = null)

KYC - Selfie NIN Verification

### Example
```csharp
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
            config.BasePath = "https://api.dojah.io";
            // Configure API key authorization: apikeyAuth
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.AddApiKey("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("AppId", "Bearer");

            var apiInstance = new KYCApi(config);
            var body = null;  // Object |  (optional) 

            try
            {
                // KYC - Selfie NIN Verification
                VerifySelfieNinResponse result = apiInstance.VerifySelfieNin(body);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYCApi.VerifySelfieNin: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
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
    ApiResponse<VerifySelfieNinResponse> response = apiInstance.VerifySelfieNinWithHttpInfo(body);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.VerifySelfieNinWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **body** | **Object** |  | [optional]  |

### Return type

[**VerifySelfieNinResponse**](VerifySelfieNinResponse.md)

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

