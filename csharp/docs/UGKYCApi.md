# Dojah.Net.Api.UGKYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetVoter**](UGKYCApi.md#getvoter) | **GET** /api/v1/ug/kyc/voter | Voters ID |

<a name="getvoter"></a>
# **GetVoter**
> GetVoterResponse GetVoter (int? id = null, string firstName = null, string lastName = null)

Voters ID

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
    public class GetVoterExample
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

            var apiInstance = new UGKYCApi(config);
            var id = 67335751;  // int? |  (optional) 
            var firstName = Happy;  // string |  (optional) 
            var lastName = Christmas;  // string |  (optional) 

            try
            {
                // Voters ID
                GetVoterResponse result = apiInstance.GetVoter(id, firstName, lastName);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling UGKYCApi.GetVoter: " + e.Message);
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

#### Using the GetVoterWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Voters ID
    ApiResponse<GetVoterResponse> response = apiInstance.GetVoterWithHttpInfo(id, firstName, lastName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UGKYCApi.GetVoterWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **int?** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |

### Return type

[**GetVoterResponse**](GetVoterResponse.md)

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

