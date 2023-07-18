# Dojah.Net.Api.TZKYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetNin**](TZKYCApi.md#getnin) | **GET** /api/v1/tz/kyc/nin | Lookup TZ NIN |

<a name="getnin"></a>
# **GetNin**
> Object GetNin (string appId = null, string firstName = null, string lastName = null, string dateOfBirth = null, string mothersLastName = null, string mothersFirstName = null)

Lookup TZ NIN

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

            var apiInstance = new TZKYCApi(config);
            var appId = {{app_id}};  // string |  (optional) 
            var firstName = khafsa;  // string |  (optional) 
            var lastName = mohammed;  // string |  (optional) 
            var dateOfBirth = 1994-01-11;  // string |  (optional) 
            var mothersLastName = zulekha;  // string |  (optional) 
            var mothersFirstName = kassim;  // string |  (optional) 

            try
            {
                // Lookup TZ NIN
                Object result = apiInstance.GetNin(appId, firstName, lastName, dateOfBirth, mothersLastName, mothersFirstName);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling TZKYCApi.GetNin: " + e.Message);
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
    // Lookup TZ NIN
    ApiResponse<Object> response = apiInstance.GetNinWithHttpInfo(appId, firstName, lastName, dateOfBirth, mothersLastName, mothersFirstName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TZKYCApi.GetNinWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **appId** | **string** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |
| **mothersLastName** | **string** |  | [optional]  |
| **mothersFirstName** | **string** |  | [optional]  |

### Return type

**Object**

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

