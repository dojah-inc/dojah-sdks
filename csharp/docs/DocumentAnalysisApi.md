# Dojah.Net.Api.DocumentAnalysisApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AnalyzeDocument**](DocumentAnalysisApi.md#analyzedocument) | **POST** /api/v1/document/analysis | KYC - Document Analysis |

<a name="analyzedocument"></a>
# **AnalyzeDocument**
> AnalyzeDocumentResponse AnalyzeDocument ()

KYC - Document Analysis

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class AnalyzeDocumentExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: appIdAuth
            client.SetApiKey("YOUR_API_KEY");


            try
            {
                // KYC - Document Analysis
                AnalyzeDocumentResponse result = client.DocumentAnalysis.AnalyzeDocument();
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling DocumentAnalysisApi.AnalyzeDocument: " + e.Message);
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

#### Using the AnalyzeDocumentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Document Analysis
    ApiResponse<AnalyzeDocumentResponse> response = apiInstance.AnalyzeDocumentWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DocumentAnalysisApi.AnalyzeDocumentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**AnalyzeDocumentResponse**](AnalyzeDocumentResponse.md)

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

