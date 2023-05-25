# Dojah.Net.Api.GHKYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetDriversLicense**](GHKYCApi.md#getdriverslicense) | **GET** /api/v1/gh/kyc/dl | Driver&#39;s License |
| [**GetPassport**](GHKYCApi.md#getpassport) | **GET** /api/v1/gh/kyc/passport | Passport |
| [**GetSsnit**](GHKYCApi.md#getssnit) | **GET** /api/v1/gh/kyc/ssnit | SSNIT |

<a name="getdriverslicense"></a>
# **GetDriversLicense**
> GetDriversLicenseResponse GetDriversLicense (string id = null, string fullName = null, string dateOfBirth = null)

Driver's License

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

            // Configure API key authorization: apikeyAuth
            config.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.ApiKeyPrefix.Add("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.ApiKey.Add("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.ApiKeyPrefix.Add("AppId", "Bearer");

            var apiInstance = new GHKYCApi(config);
            var id = V0000000;  // string |  (optional) 
            var fullName = John Doe;  // string |  (optional) 
            var dateOfBirth = 1988-09-01;  // string |  (optional) 

            try
            {
                // Driver's License
                GetDriversLicenseResponse result = apiInstance.GetDriversLicense(id, fullName, dateOfBirth);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GHKYCApi.GetDriversLicense: " + e.Message);
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
    // Driver's License
    ApiResponse<GetDriversLicenseResponse> response = apiInstance.GetDriversLicenseWithHttpInfo(id, fullName, dateOfBirth);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GHKYCApi.GetDriversLicenseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** |  | [optional]  |
| **fullName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |

### Return type

[**GetDriversLicenseResponse**](GetDriversLicenseResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpassport"></a>
# **GetPassport**
> GetPassportResponse GetPassport (string id = null, string firstName = null, string lastName = null, string middleName = null, string dateOfBirth = null)

Passport

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

            // Configure API key authorization: apikeyAuth
            config.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.ApiKeyPrefix.Add("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.ApiKey.Add("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.ApiKeyPrefix.Add("AppId", "Bearer");

            var apiInstance = new GHKYCApi(config);
            var id = G0000000;  // string |  (optional) 
            var firstName = John;  // string |  (optional) 
            var lastName = Doe;  // string |  (optional) 
            var middleName = Jack;  // string |  (optional) 
            var dateOfBirth = 1990-04-05;  // string |  (optional) 

            try
            {
                // Passport
                GetPassportResponse result = apiInstance.GetPassport(id, firstName, lastName, middleName, dateOfBirth);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GHKYCApi.GetPassport: " + e.Message);
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
    // Passport
    ApiResponse<GetPassportResponse> response = apiInstance.GetPassportWithHttpInfo(id, firstName, lastName, middleName, dateOfBirth);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GHKYCApi.GetPassportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |
| **middleName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |

### Return type

[**GetPassportResponse**](GetPassportResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getssnit"></a>
# **GetSsnit**
> GetSsnitResponse GetSsnit (string id = null, string fullName = null, string dateOfBirth = null)

SSNIT

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
    public class GetSsnitExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";

            // Configure API key authorization: apikeyAuth
            config.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.ApiKeyPrefix.Add("Authorization", "Bearer");
            // Configure API key authorization: appIdAuth
            config.ApiKey.Add("AppId", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.ApiKeyPrefix.Add("AppId", "Bearer");

            var apiInstance = new GHKYCApi(config);
            var id = G0000000;  // string |  (optional) 
            var fullName = John Doe;  // string |  (optional) 
            var dateOfBirth = 1990-04-05;  // string |  (optional) 

            try
            {
                // SSNIT
                GetSsnitResponse result = apiInstance.GetSsnit(id, fullName, dateOfBirth);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GHKYCApi.GetSsnit: " + e.Message);
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

#### Using the GetSsnitWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // SSNIT
    ApiResponse<GetSsnitResponse> response = apiInstance.GetSsnitWithHttpInfo(id, fullName, dateOfBirth);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GHKYCApi.GetSsnitWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** |  | [optional]  |
| **fullName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |

### Return type

[**GetSsnitResponse**](GetSsnitResponse.md)

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

