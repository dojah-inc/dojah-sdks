# Dojah.Net.Api.ZAFKYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetId**](ZAFKYCApi.md#getid) | **GET** /api/v1/za/kyc/id | KYC - Lookup ID |

<a name="getid"></a>
# **GetId**
> ZafKycGetIdResponse GetId (int? idNumber = null)

KYC - Lookup ID

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetIdExample
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

            var idNumber = 9910180077084;  // int? |  (optional) 

            try
            {
                // KYC - Lookup ID
                ZafKycGetIdResponse result = client.ZAFKYC.GetId(idNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ZAFKYCApi.GetId: " + e.Message);
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

#### Using the GetIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Lookup ID
    ApiResponse<ZafKycGetIdResponse> response = apiInstance.GetIdWithHttpInfo(idNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ZAFKYCApi.GetIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **idNumber** | **int?** |  | [optional]  |

### Return type

[**ZafKycGetIdResponse**](ZafKycGetIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Strict-Transport-Security -  <br>  * X-Content-Type-Options -  <br>  * Server -  <br>  * CF-RAY -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

