# Dojah.Net.Api.MLApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**VerifyPhotoIdWithSelfie**](MLApi.md#verifyphotoidwithselfie) | **POST** /api/v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification |

<a name="verifyphotoidwithselfie"></a>
# **VerifyPhotoIdWithSelfie**
> Object VerifyPhotoIdWithSelfie (MlVerifyPhotoIdWithSelfieRequest mlVerifyPhotoIdWithSelfieRequest, string appId = null)

KYC - Selfie Photo ID Verification

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
    public class VerifyPhotoIdWithSelfieExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://api.dojah.io";


            var apiInstance = new MLApi(config);
            var mlVerifyPhotoIdWithSelfieRequest = new MlVerifyPhotoIdWithSelfieRequest(); // MlVerifyPhotoIdWithSelfieRequest | 
            var appId = {{app_id}};  // string |  (optional) 

            try
            {
                // KYC - Selfie Photo ID Verification
                Object result = apiInstance.VerifyPhotoIdWithSelfie(mlVerifyPhotoIdWithSelfieRequest, appId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling MLApi.VerifyPhotoIdWithSelfie: " + e.Message);
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

#### Using the VerifyPhotoIdWithSelfieWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Selfie Photo ID Verification
    ApiResponse<Object> response = apiInstance.VerifyPhotoIdWithSelfieWithHttpInfo(mlVerifyPhotoIdWithSelfieRequest, appId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MLApi.VerifyPhotoIdWithSelfieWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mlVerifyPhotoIdWithSelfieRequest** | [**MlVerifyPhotoIdWithSelfieRequest**](MlVerifyPhotoIdWithSelfieRequest.md) |  |  |
| **appId** | **string** |  | [optional]  |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

