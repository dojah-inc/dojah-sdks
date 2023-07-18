# Dojah.Net.Api.NigeriaKYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetBasicBvn**](NigeriaKYCApi.md#getbasicbvn) | **GET** /api/v1/kyc/bvn | KYC - Get Basic BVN Info |
| [**GetBasicBvn1**](NigeriaKYCApi.md#getbasicbvn1) | **GET** /api/v1/kyc/bvn/basic | KYC - Lookup BVN Basic 1 |
| [**GetBasicPhoneNumber**](NigeriaKYCApi.md#getbasicphonenumber) | **GET** /api/v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic |
| [**GetDriversLicense**](NigeriaKYCApi.md#getdriverslicense) | **GET** /api/v1/kyc/dl | KYC - Get Drivers License Info |
| [**GetNin**](NigeriaKYCApi.md#getnin) | **GET** /api/v1/kyc/nin | KYC - Get NIN Info |
| [**GetNormalBvn**](NigeriaKYCApi.md#getnormalbvn) | **GET** /api/v1/kyc/bvn/full | KYC - Lookup BVN Normal |
| [**GetNuban**](NigeriaKYCApi.md#getnuban) | **GET** /api/v1/kyc/nuban | KYC - Get NUBAN Information |
| [**GetPassport**](NigeriaKYCApi.md#getpassport) | **GET** /api/v1/kyc/passport | KYC - Passport |
| [**GetPhoneNumber**](NigeriaKYCApi.md#getphonenumber) | **GET** /api/v1/kyc/phone_number | KYC - Lookup Phone Number |
| [**GetPremiumBvn**](NigeriaKYCApi.md#getpremiumbvn) | **GET** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium |
| [**GetVnin**](NigeriaKYCApi.md#getvnin) | **GET** /api/v1/kyc/vnin | Lookup VNIN |

<a name="getbasicbvn"></a>
# **GetBasicBvn**
> ValidateBvnResponse GetBasicBvn (string appId = null, int? bvn = null)

KYC - Get Basic BVN Info

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
    public class GetBasicBvnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var bvn = 22468537919;  // int? |  (optional) 

            try
            {
                // KYC - Get Basic BVN Info
                ValidateBvnResponse result = apiInstance.GetBasicBvn(appId, bvn);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetBasicBvn: " + e.Message);
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

#### Using the GetBasicBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get Basic BVN Info
    ApiResponse<ValidateBvnResponse> response = apiInstance.GetBasicBvnWithHttpInfo(appId, bvn);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetBasicBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **bvn** | **int?** |  | [optional]  |

### Return type

[**ValidateBvnResponse**](ValidateBvnResponse.md)

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

<a name="getbasicbvn1"></a>
# **GetBasicBvn1**
> GetBasicBvnResponse GetBasicBvn1 (string appId = null, int? bvn = null)

KYC - Lookup BVN Basic 1

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
    public class GetBasicBvn1Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";

            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var bvn = 22621998885;  // int? |  (optional) 

            try
            {
                // KYC - Lookup BVN Basic 1
                GetBasicBvnResponse result = apiInstance.GetBasicBvn1(appId, bvn);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetBasicBvn1: " + e.Message);
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

#### Using the GetBasicBvn1WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Lookup BVN Basic 1
    ApiResponse<GetBasicBvnResponse> response = apiInstance.GetBasicBvn1WithHttpInfo(appId, bvn);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetBasicBvn1WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **bvn** | **int?** |  | [optional]  |

### Return type

[**GetBasicBvnResponse**](GetBasicBvnResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbasicphonenumber"></a>
# **GetBasicPhoneNumber**
> Object GetBasicPhoneNumber (string appId = null, int? phoneNumber = null)

KYC Lookup Phone Number Basic

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
    public class GetBasicPhoneNumberExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var phoneNumber = 9131377829;  // int? |  (optional) 

            try
            {
                // KYC Lookup Phone Number Basic
                Object result = apiInstance.GetBasicPhoneNumber(appId, phoneNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetBasicPhoneNumber: " + e.Message);
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

#### Using the GetBasicPhoneNumberWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC Lookup Phone Number Basic
    ApiResponse<Object> response = apiInstance.GetBasicPhoneNumberWithHttpInfo(appId, phoneNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetBasicPhoneNumberWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **phoneNumber** | **int?** |  | [optional]  |

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

<a name="getdriverslicense"></a>
# **GetDriversLicense**
> GetKycDriversLicenseResponse GetDriversLicense (string appId = null, string licenseNumber = null)

KYC - Get Drivers License Info

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
    public class GetDriversLicenseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var licenseNumber = FKJ49409AB13;  // string |  (optional) 

            try
            {
                // KYC - Get Drivers License Info
                GetKycDriversLicenseResponse result = apiInstance.GetDriversLicense(appId, licenseNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetDriversLicense: " + e.Message);
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

#### Using the GetDriversLicenseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get Drivers License Info
    ApiResponse<GetKycDriversLicenseResponse> response = apiInstance.GetDriversLicenseWithHttpInfo(appId, licenseNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetDriversLicenseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **licenseNumber** | **string** |  | [optional]  |

### Return type

[**GetKycDriversLicenseResponse**](GetKycDriversLicenseResponse.md)

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

<a name="getnin"></a>
# **GetNin**
> NigeriaKycGetNinResponse GetNin (string appId = null, int? nin = null)

KYC - Get NIN Info

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
    public class GetNinExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var nin = 55648152772;  // int? |  (optional) 

            try
            {
                // KYC - Get NIN Info
                NigeriaKycGetNinResponse result = apiInstance.GetNin(appId, nin);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetNin: " + e.Message);
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

#### Using the GetNinWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get NIN Info
    ApiResponse<NigeriaKycGetNinResponse> response = apiInstance.GetNinWithHttpInfo(appId, nin);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetNinWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **nin** | **int?** |  | [optional]  |

### Return type

[**NigeriaKycGetNinResponse**](NigeriaKycGetNinResponse.md)

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

<a name="getnormalbvn"></a>
# **GetNormalBvn**
> GetFullBvnResponse GetNormalBvn (string appId = null, int? bvn = null)

KYC - Lookup BVN Normal

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
    public class GetNormalBvnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var bvn = 22342291445;  // int? |  (optional) 

            try
            {
                // KYC - Lookup BVN Normal
                GetFullBvnResponse result = apiInstance.GetNormalBvn(appId, bvn);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetNormalBvn: " + e.Message);
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

#### Using the GetNormalBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Lookup BVN Normal
    ApiResponse<GetFullBvnResponse> response = apiInstance.GetNormalBvnWithHttpInfo(appId, bvn);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetNormalBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **bvn** | **int?** |  | [optional]  |

### Return type

[**GetFullBvnResponse**](GetFullBvnResponse.md)

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

<a name="getnuban"></a>
# **GetNuban**
> GetNubanResponse GetNuban (string appId = null, int? bankCode = null, int? accountNumber = null)

KYC - Get NUBAN Information

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
    public class GetNubanExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var bankCode = 58;  // int? |  (optional) 
            var accountNumber = 11223344;  // int? |  (optional) 

            try
            {
                // KYC - Get NUBAN Information
                GetNubanResponse result = apiInstance.GetNuban(appId, bankCode, accountNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetNuban: " + e.Message);
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

#### Using the GetNubanWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get NUBAN Information
    ApiResponse<GetNubanResponse> response = apiInstance.GetNubanWithHttpInfo(appId, bankCode, accountNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetNubanWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **bankCode** | **int?** |  | [optional]  |
| **accountNumber** | **int?** |  | [optional]  |

### Return type

[**GetNubanResponse**](GetNubanResponse.md)

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

<a name="getpassport"></a>
# **GetPassport**
> GetKycPassportResponse GetPassport (string passportNumber = null, string surname = null)

KYC - Passport

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
    public class GetPassportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";

            // Configure API key authorization: appIdAuth
            config.ApiKey.Add("Appid", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.ApiKeyPrefix.Add("Appid", "Bearer");

            var apiInstance = new NigeriaKYCApi(config);
            var passportNumber = B00671500;  // string |  (optional) 
            var surname = adekanmi;  // string |  (optional) 

            try
            {
                // KYC - Passport
                GetKycPassportResponse result = apiInstance.GetPassport(passportNumber, surname);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetPassport: " + e.Message);
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
    Debug.Print("Exception when calling NigeriaKYCApi.GetPassportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **passportNumber** | **string** |  | [optional]  |
| **surname** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getphonenumber"></a>
# **GetPhoneNumber**
> GetPhoneNumberResponse GetPhoneNumber (string appId = null, int? phoneNumber = null)

KYC - Lookup Phone Number

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
    public class GetPhoneNumberExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var phoneNumber = 8034628633;  // int? |  (optional) 

            try
            {
                // KYC - Lookup Phone Number
                GetPhoneNumberResponse result = apiInstance.GetPhoneNumber(appId, phoneNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetPhoneNumber: " + e.Message);
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

#### Using the GetPhoneNumberWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Lookup Phone Number
    ApiResponse<GetPhoneNumberResponse> response = apiInstance.GetPhoneNumberWithHttpInfo(appId, phoneNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetPhoneNumberWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **phoneNumber** | **int?** |  | [optional]  |

### Return type

[**GetPhoneNumberResponse**](GetPhoneNumberResponse.md)

### Authorization

[noauthAuth](../README.md#noauthAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |
| **404** | Not Found |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpremiumbvn"></a>
# **GetPremiumBvn**
> GetPremiumBvnResponse GetPremiumBvn (string appId = null, int? bvn = null)

KYC - Lookup BVN Premium

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
    public class GetPremiumBvnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var bvn = 22200508254;  // int? |  (optional) 

            try
            {
                // KYC - Lookup BVN Premium
                GetPremiumBvnResponse result = apiInstance.GetPremiumBvn(appId, bvn);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetPremiumBvn: " + e.Message);
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

#### Using the GetPremiumBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Lookup BVN Premium
    ApiResponse<GetPremiumBvnResponse> response = apiInstance.GetPremiumBvnWithHttpInfo(appId, bvn);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetPremiumBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **bvn** | **int?** |  | [optional]  |

### Return type

[**GetPremiumBvnResponse**](GetPremiumBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvnin"></a>
# **GetVnin**
> GetVninResponse GetVnin (string appId = null, string vnin = null)

Lookup VNIN

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
    public class GetVninExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";

            var apiInstance = new NigeriaKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var vnin = LC829995256998RD;  // string |  (optional) 

            try
            {
                // Lookup VNIN
                GetVninResponse result = apiInstance.GetVnin(appId, vnin);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NigeriaKYCApi.GetVnin: " + e.Message);
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

#### Using the GetVninWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Lookup VNIN
    ApiResponse<GetVninResponse> response = apiInstance.GetVninWithHttpInfo(appId, vnin);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling NigeriaKYCApi.GetVninWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **vnin** | **string** |  | [optional]  |

### Return type

[**GetVninResponse**](GetVninResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

