# Dojah.Net.Api.KYBApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetAdvancedCac**](KYBApi.md#getadvancedcac) | **GET** /v1/kyc/cac/advance | KYC - Get CAC Advanced |
| [**GetBasicCac**](KYBApi.md#getbasiccac) | **GET** /v1/kyc/cac/basic | KYB - Get CAC 2 |
| [**GetCac**](KYBApi.md#getcac) | **GET** /v1/kyc/cac | KYC - Get CAC  |
| [**GetTin**](KYBApi.md#gettin) | **GET** /v1/kyc/tin | KYC - Fetch Tin |

<a name="getadvancedcac"></a>
# **GetAdvancedCac**
> GetAdvancedCacResponse GetAdvancedCac (int? rc = null, string type = null, string _class = null)

KYC - Get CAC Advanced

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetAdvancedCacExample
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

            var apiInstance = new KYBApi(config);
            var rc = 1432074;  // int? |  (optional) 
            var type = co;  // string |  (optional) 
            var _class = advance;  // string |  (optional) 

            try
            {
                // KYC - Get CAC Advanced
                GetAdvancedCacResponse result = apiInstance.GetAdvancedCac(rc, type, _class);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYBApi.GetAdvancedCac: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetAdvancedCacWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get CAC Advanced
    ApiResponse<GetAdvancedCacResponse> response = apiInstance.GetAdvancedCacWithHttpInfo(rc, type, _class);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYBApi.GetAdvancedCacWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **rc** | **int?** |  | [optional]  |
| **type** | **string** |  | [optional]  |
| **_class** | **string** |  | [optional]  |

### Return type

[**GetAdvancedCacResponse**](GetAdvancedCacResponse.md)

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

<a name="getbasiccac"></a>
# **GetBasicCac**
> GetBasicCacResponse GetBasicCac (int? rc = null, string type = null)

KYB - Get CAC 2

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetBasicCacExample
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

            var apiInstance = new KYBApi(config);
            var rc = 3330883;  // int? |  (optional) 
            var type = bn;  // string |  (optional) 

            try
            {
                // KYB - Get CAC 2
                GetBasicCacResponse result = apiInstance.GetBasicCac(rc, type);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYBApi.GetBasicCac: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBasicCacWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYB - Get CAC 2
    ApiResponse<GetBasicCacResponse> response = apiInstance.GetBasicCacWithHttpInfo(rc, type);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYBApi.GetBasicCacWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **rc** | **int?** |  | [optional]  |
| **type** | **string** |  | [optional]  |

### Return type

[**GetBasicCacResponse**](GetBasicCacResponse.md)

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

<a name="getcac"></a>
# **GetCac**
> GetCacResponse GetCac (int? rcNumber = null, string companyName = null)

KYC - Get CAC 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetCacExample
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

            var apiInstance = new KYBApi(config);
            var rcNumber = 1432074;  // int? |  (optional) 
            var companyName = ELTA SOLUTIONS LIMITED;  // string |  (optional) 

            try
            {
                // KYC - Get CAC 
                GetCacResponse result = apiInstance.GetCac(rcNumber, companyName);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYBApi.GetCac: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCacWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get CAC 
    ApiResponse<GetCacResponse> response = apiInstance.GetCacWithHttpInfo(rcNumber, companyName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYBApi.GetCacWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **rcNumber** | **int?** |  | [optional]  |
| **companyName** | **string** |  | [optional]  |

### Return type

[**GetCacResponse**](GetCacResponse.md)

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

<a name="gettin"></a>
# **GetTin**
> GetTinResponse GetTin (string tin = null)

KYC - Fetch Tin

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Api;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetTinExample
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

            var apiInstance = new KYBApi(config);
            var tin = 21148119-0001;  // string |  (optional) 

            try
            {
                // KYC - Fetch Tin
                GetTinResponse result = apiInstance.GetTin(tin);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KYBApi.GetTin: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetTinWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Fetch Tin
    ApiResponse<GetTinResponse> response = apiInstance.GetTinWithHttpInfo(tin);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYBApi.GetTinWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **tin** | **string** |  | [optional]  |

### Return type

[**GetTinResponse**](GetTinResponse.md)

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

