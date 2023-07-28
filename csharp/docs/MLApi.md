# Dojah.Net.Api.MLApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**VerifyPhotoIdWithSelfie**](MLApi.md#verifyphotoidwithselfie) | **POST** /api/v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification |

<a name="verifyphotoidwithselfie"></a>
# **VerifyPhotoIdWithSelfie**
> Object VerifyPhotoIdWithSelfie (MlVerifyPhotoIdWithSelfieRequest mlVerifyPhotoIdWithSelfieRequest)

KYC - Selfie Photo ID Verification

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class VerifyPhotoIdWithSelfieExample
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

            var mlVerifyPhotoIdWithSelfieRequest = new MlVerifyPhotoIdWithSelfieRequest(); // MlVerifyPhotoIdWithSelfieRequest | 

            try
            {
                // KYC - Selfie Photo ID Verification
                Object result = client.ML.VerifyPhotoIdWithSelfie(mlVerifyPhotoIdWithSelfieRequest);
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
    ApiResponse<Object> response = apiInstance.VerifyPhotoIdWithSelfieWithHttpInfo(mlVerifyPhotoIdWithSelfieRequest);
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

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

