# Dojah.Net.Api.ServicesApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CategorizeTransactions**](ServicesApi.md#categorizetransactions) | **POST** /v1/ml/categorize_transaction | Categorize Transactions |

<a name="categorizetransactions"></a>
# **CategorizeTransactions**
> CategorizeTransactionsResponse CategorizeTransactions (CategorizeTransactionsRequest categorizeTransactionsRequest = null)

Categorize Transactions

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
    public class CategorizeTransactionsExample
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

            var apiInstance = new ServicesApi(config);
            var categorizeTransactionsRequest = new CategorizeTransactionsRequest(); // CategorizeTransactionsRequest |  (optional) 

            try
            {
                // Categorize Transactions
                CategorizeTransactionsResponse result = apiInstance.CategorizeTransactions(categorizeTransactionsRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ServicesApi.CategorizeTransactions: " + e.Message);
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

#### Using the CategorizeTransactionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Categorize Transactions
    ApiResponse<CategorizeTransactionsResponse> response = apiInstance.CategorizeTransactionsWithHttpInfo(categorizeTransactionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ServicesApi.CategorizeTransactionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **categorizeTransactionsRequest** | [**CategorizeTransactionsRequest**](CategorizeTransactionsRequest.md) |  | [optional]  |

### Return type

[**CategorizeTransactionsResponse**](CategorizeTransactionsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

