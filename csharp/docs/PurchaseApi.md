# Dojah.Net.Api.PurchaseApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SendAirtime**](PurchaseApi.md#sendairtime) | **POST** /v1/purchase/airtime | Purchase - Send Airtime |

<a name="sendairtime"></a>
# **SendAirtime**
> PurchaseAirtimeResponse SendAirtime (PurchaseAirtimeRequest purchaseAirtimeRequest, string appId = null)

Purchase - Send Airtime

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
    public class SendAirtimeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new PurchaseApi(config);
            var purchaseAirtimeRequest = new PurchaseAirtimeRequest(); // PurchaseAirtimeRequest | 
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // Purchase - Send Airtime
                PurchaseAirtimeResponse result = apiInstance.SendAirtime(purchaseAirtimeRequest, appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling PurchaseApi.SendAirtime: " + e.Message);
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

#### Using the SendAirtimeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Purchase - Send Airtime
    ApiResponse<PurchaseAirtimeResponse> response = apiInstance.SendAirtimeWithHttpInfo(purchaseAirtimeRequest, appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PurchaseApi.SendAirtimeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **purchaseAirtimeRequest** | [**PurchaseAirtimeRequest**](PurchaseAirtimeRequest.md) |  |  |
| **appId** | **string** |  | [optional]  |

### Return type

[**PurchaseAirtimeResponse**](PurchaseAirtimeResponse.md)

### Authorization

[noauthAuth](../README.md#noauthAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

