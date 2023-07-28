# Dojah.Net.Api.GeneralApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetBanks**](GeneralApi.md#getbanks) | **GET** /v1/general/banks | General - Get Banks |
| [**GetBin**](GeneralApi.md#getbin) | **GET** /v1/general/bin | General Resolve BIN |
| [**GetNuban**](GeneralApi.md#getnuban) | **GET** /api/v1/general/account | General Resolve NUBAN |

<a name="getbanks"></a>
# **GetBanks**
> GetBanksResponse GetBanks ()

General - Get Banks

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetBanksExample
    {
        public static void Main()
        {

            DojahClient client = new DojahClient();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");


            try
            {
                // General - Get Banks
                GetBanksResponse result = client.General.GetBanks();
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GeneralApi.GetBanks: " + e.Message);
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

#### Using the GetBanksWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // General - Get Banks
    ApiResponse<GetBanksResponse> response = apiInstance.GetBanksWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GeneralApi.GetBanksWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**GetBanksResponse**](GetBanksResponse.md)

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

<a name="getbin"></a>
# **GetBin**
> GetBinResponse GetBin (int? cardBin = null)

General Resolve BIN

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetBinExample
    {
        public static void Main()
        {

            DojahClient client = new DojahClient();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            var cardBin = 506118;  // int? |  (optional) 

            try
            {
                // General Resolve BIN
                GetBinResponse result = client.General.GetBin(cardBin);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GeneralApi.GetBin: " + e.Message);
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

#### Using the GetBinWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // General Resolve BIN
    ApiResponse<GetBinResponse> response = apiInstance.GetBinWithHttpInfo(cardBin);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GeneralApi.GetBinWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **cardBin** | **int?** |  | [optional]  |

### Return type

[**GetBinResponse**](GetBinResponse.md)

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

<a name="getnuban"></a>
# **GetNuban**
> GeneralGetNubanResponse GetNuban (int? bankCode = null, int? accountNumber = null)

General Resolve NUBAN

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetNubanExample
    {
        public static void Main()
        {

            DojahClient client = new DojahClient();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            var bankCode = 58;  // int? |  (optional) 
            var accountNumber = 37466959;  // int? |  (optional) 

            try
            {
                // General Resolve NUBAN
                GeneralGetNubanResponse result = client.General.GetNuban(bankCode, accountNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GeneralApi.GetNuban: " + e.Message);
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
    // General Resolve NUBAN
    ApiResponse<GeneralGetNubanResponse> response = apiInstance.GetNubanWithHttpInfo(bankCode, accountNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GeneralApi.GetNubanWithHttpInfo: " + e.Message);
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

[**GeneralGetNubanResponse**](GeneralGetNubanResponse.md)

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

