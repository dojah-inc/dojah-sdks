# Dojah.Net.Api.KEKYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetNationalId**](KEKYCApi.md#getnationalid) | **GET** /api/v1/ke/kyc/id | KYC - National ID |

<a name="getnationalid"></a>
# **GetNationalId**
> GetNationalIdResponse GetNationalId (int? id = null, string firstName = null, string lastName = null, string middleName = null, string dateOfBirth = null, string gender = null)

KYC - National ID

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
    public class GetNationalIdExample
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

            var apiInstance = new KEKYCApi(config);
            var id = 24798402;  // int? |  (optional) 
            var firstName = ZEDEKIAH;  // string |  (optional) 
            var lastName = ANDENGA;  // string |  (optional) 
            var middleName = "middleName_example";  // string |  (optional) 
            var dateOfBirth = 1985-12-29;  // string |  (optional) 
            var gender = M;  // string |  (optional) 

            try
            {
                // KYC - National ID
                GetNationalIdResponse result = apiInstance.GetNationalId(id, firstName, lastName, middleName, dateOfBirth, gender);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling KEKYCApi.GetNationalId: " + e.Message);
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

#### Using the GetNationalIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - National ID
    ApiResponse<GetNationalIdResponse> response = apiInstance.GetNationalIdWithHttpInfo(id, firstName, lastName, middleName, dateOfBirth, gender);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KEKYCApi.GetNationalIdWithHttpInfo: " + e.Message);
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
| **middleName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |
| **gender** | **string** |  | [optional]  |

### Return type

[**GetNationalIdResponse**](GetNationalIdResponse.md)

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

