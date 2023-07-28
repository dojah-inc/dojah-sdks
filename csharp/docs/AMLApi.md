# Dojah.Net.Api.AMLApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetScreeningInfo**](AMLApi.md#getscreeninginfo) | **GET** /api/v1/aml/screening/info | Get AML Info |
| [**ScreenAml**](AMLApi.md#screenaml) | **POST** /api/v1/aml/screening/platform | AML Screening |

<a name="getscreeninginfo"></a>
# **GetScreeningInfo**
> Object GetScreeningInfo (string profileId = null)

Get AML Info

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetScreeningInfoExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: appIdAuth
            client.SetApiKey("YOUR_API_KEY");

            var profileId = "WC7117469";  // string |  (optional) 

            try
            {
                // Get AML Info
                Object result = client.AML.GetScreeningInfo(profileId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AMLApi.GetScreeningInfo: " + e.Message);
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

#### Using the GetScreeningInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get AML Info
    ApiResponse<Object> response = apiInstance.GetScreeningInfoWithHttpInfo(profileId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AMLApi.GetScreeningInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **profileId** | **string** |  | [optional]  |

### Return type

**Object**

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

<a name="screenaml"></a>
# **ScreenAml**
> AmlScreenAmlResponse ScreenAml (AmlScreenAmlRequest amlScreenAmlRequest)

AML Screening

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class ScreenAmlExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: appIdAuth
            client.SetApiKey("YOUR_API_KEY");

            var amlScreenAmlRequest = new AmlScreenAmlRequest(); // AmlScreenAmlRequest | 

            try
            {
                // AML Screening
                AmlScreenAmlResponse result = client.AML.ScreenAml(amlScreenAmlRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AMLApi.ScreenAml: " + e.Message);
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

#### Using the ScreenAmlWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // AML Screening
    ApiResponse<AmlScreenAmlResponse> response = apiInstance.ScreenAmlWithHttpInfo(amlScreenAmlRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AMLApi.ScreenAmlWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **amlScreenAmlRequest** | [**AmlScreenAmlRequest**](AmlScreenAmlRequest.md) |  |  |

### Return type

[**AmlScreenAmlResponse**](AmlScreenAmlResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

