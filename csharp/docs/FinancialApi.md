# Dojah.Net.Api.FinancialApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CollectStatusFromPdf**](FinancialApi.md#collectstatusfrompdf) | **POST** /api/v1/financial/transactions/pdf | Collect Status via PDF Statement |
| [**CollectTransactions**](FinancialApi.md#collecttransactions) | **POST** /v1/financial/transactions | Collect Transactions |
| [**GetAccount**](FinancialApi.md#getaccount) | **GET** /api/v1/financial/account_information | Get Account Information |
| [**GetAccountAnalysis**](FinancialApi.md#getaccountanalysis) | **GET** /api/v1/financial/analysis | Get Account Analysis |
| [**GetAccountSubscriptions**](FinancialApi.md#getaccountsubscriptions) | **GET** /v1/financial/account_subscription | Get Account Subscriptions |
| [**GetAccountTransactions**](FinancialApi.md#getaccounttransactions) | **GET** /api/v1/financial/account_transactions | Get Account Transactions |
| [**GetBasicBvn**](FinancialApi.md#getbasicbvn) | **GET** /v1/financial/bvn_information/basic | Get BVN Information Basic |
| [**GetEarningStructure**](FinancialApi.md#getearningstructure) | **GET** /v1/financial/earning_structure | Get Earning Structure |
| [**GetFullBvn**](FinancialApi.md#getfullbvn) | **GET** /v1/financial/bvn_information/full | Get BVN Information Full |
| [**GetSpendingPattern**](FinancialApi.md#getspendingpattern) | **GET** /v1/financial/spending_pattern | Get Spending Pattern |

<a name="collectstatusfrompdf"></a>
# **CollectStatusFromPdf**
> CollectStatusFromPdfResponse CollectStatusFromPdf (System.IO.Stream statement = null, int? bankCode = null)

Collect Status via PDF Statement

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
    public class CollectStatusFromPdfExample
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

            var apiInstance = new FinancialApi(config);
            var statement = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream |  (optional) 
            var bankCode = 56;  // int? |  (optional) 

            try
            {
                // Collect Status via PDF Statement
                CollectStatusFromPdfResponse result = apiInstance.CollectStatusFromPdf(statement, bankCode);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.CollectStatusFromPdf: " + e.Message);
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

#### Using the CollectStatusFromPdfWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Collect Status via PDF Statement
    ApiResponse<CollectStatusFromPdfResponse> response = apiInstance.CollectStatusFromPdfWithHttpInfo(statement, bankCode);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.CollectStatusFromPdfWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **statement** | **System.IO.Stream****System.IO.Stream** |  | [optional]  |
| **bankCode** | **int?** |  | [optional]  |

### Return type

[**CollectStatusFromPdfResponse**](CollectStatusFromPdfResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collecttransactions"></a>
# **CollectTransactions**
> CollectTransactionsResponse CollectTransactions (CollectTransactionsRequest collectTransactionsRequest = null)

Collect Transactions

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
    public class CollectTransactionsExample
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

            var apiInstance = new FinancialApi(config);
            var collectTransactionsRequest = new CollectTransactionsRequest(); // CollectTransactionsRequest |  (optional) 

            try
            {
                // Collect Transactions
                CollectTransactionsResponse result = apiInstance.CollectTransactions(collectTransactionsRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.CollectTransactions: " + e.Message);
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

#### Using the CollectTransactionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Collect Transactions
    ApiResponse<CollectTransactionsResponse> response = apiInstance.CollectTransactionsWithHttpInfo(collectTransactionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.CollectTransactionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **collectTransactionsRequest** | [**CollectTransactionsRequest**](CollectTransactionsRequest.md) |  | [optional]  |

### Return type

[**CollectTransactionsResponse**](CollectTransactionsResponse.md)

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

<a name="getaccount"></a>
# **GetAccount**
> GetAccountResponse GetAccount (string accountId = null)

Get Account Information

/services/@app_id/account/@account_id

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
    public class GetAccountExample
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

            var apiInstance = new FinancialApi(config);
            var accountId = d5b86083-08c5-4de2-ac19-7610a16c297d;  // string |  (optional) 

            try
            {
                // Get Account Information
                GetAccountResponse result = apiInstance.GetAccount(accountId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.GetAccount: " + e.Message);
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

#### Using the GetAccountWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Account Information
    ApiResponse<GetAccountResponse> response = apiInstance.GetAccountWithHttpInfo(accountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.GetAccountWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accountId** | **string** |  | [optional]  |

### Return type

[**GetAccountResponse**](GetAccountResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getaccountanalysis"></a>
# **GetAccountAnalysis**
> GetAccountAnalysisResponse GetAccountAnalysis ()

Get Account Analysis

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
    public class GetAccountAnalysisExample
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

            var apiInstance = new FinancialApi(config);

            try
            {
                // Get Account Analysis
                GetAccountAnalysisResponse result = apiInstance.GetAccountAnalysis();
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.GetAccountAnalysis: " + e.Message);
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

#### Using the GetAccountAnalysisWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Account Analysis
    ApiResponse<GetAccountAnalysisResponse> response = apiInstance.GetAccountAnalysisWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.GetAccountAnalysisWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**GetAccountAnalysisResponse**](GetAccountAnalysisResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getaccountsubscriptions"></a>
# **GetAccountSubscriptions**
> GetAccountSubscriptionsResponse GetAccountSubscriptions (string accountId = null)

Get Account Subscriptions

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
    public class GetAccountSubscriptionsExample
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

            var apiInstance = new FinancialApi(config);
            var accountId = 02f63911-a958-4025-9d72-8bd2d7da274b;  // string |  (optional) 

            try
            {
                // Get Account Subscriptions
                GetAccountSubscriptionsResponse result = apiInstance.GetAccountSubscriptions(accountId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.GetAccountSubscriptions: " + e.Message);
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

#### Using the GetAccountSubscriptionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Account Subscriptions
    ApiResponse<GetAccountSubscriptionsResponse> response = apiInstance.GetAccountSubscriptionsWithHttpInfo(accountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.GetAccountSubscriptionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accountId** | **string** |  | [optional]  |

### Return type

[**GetAccountSubscriptionsResponse**](GetAccountSubscriptionsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getaccounttransactions"></a>
# **GetAccountTransactions**
> GetAccountTransactionsResponse GetAccountTransactions (string accountId = null, int? length = null)

Get Account Transactions

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
    public class GetAccountTransactionsExample
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

            var apiInstance = new FinancialApi(config);
            var accountId = d5b86083-08c5-4de2-ac19-7610a16c297d;  // string |  (optional) 
            var length = 200;  // int? |  (optional) 

            try
            {
                // Get Account Transactions
                GetAccountTransactionsResponse result = apiInstance.GetAccountTransactions(accountId, length);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.GetAccountTransactions: " + e.Message);
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

#### Using the GetAccountTransactionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Account Transactions
    ApiResponse<GetAccountTransactionsResponse> response = apiInstance.GetAccountTransactionsWithHttpInfo(accountId, length);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.GetAccountTransactionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accountId** | **string** |  | [optional]  |
| **length** | **int?** |  | [optional]  |

### Return type

[**GetAccountTransactionsResponse**](GetAccountTransactionsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbasicbvn"></a>
# **GetBasicBvn**
> FinancialGetBasicBvnResponse GetBasicBvn (string accountId = null)

Get BVN Information Basic

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
    public class GetBasicBvnExample
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

            var apiInstance = new FinancialApi(config);
            var accountId = 34c7a2a10b4d4050869fe6f0aa6f0a30;  // string |  (optional) 

            try
            {
                // Get BVN Information Basic
                FinancialGetBasicBvnResponse result = apiInstance.GetBasicBvn(accountId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.GetBasicBvn: " + e.Message);
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

#### Using the GetBasicBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get BVN Information Basic
    ApiResponse<FinancialGetBasicBvnResponse> response = apiInstance.GetBasicBvnWithHttpInfo(accountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.GetBasicBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accountId** | **string** |  | [optional]  |

### Return type

[**FinancialGetBasicBvnResponse**](FinancialGetBasicBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * cf-request-id -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getearningstructure"></a>
# **GetEarningStructure**
> GetEarningStructureResponse GetEarningStructure (string accountId = null)

Get Earning Structure

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
    public class GetEarningStructureExample
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

            var apiInstance = new FinancialApi(config);
            var accountId = 02f63911-a958-4025-9d72-8bd2d7da274b;  // string |  (optional) 

            try
            {
                // Get Earning Structure
                GetEarningStructureResponse result = apiInstance.GetEarningStructure(accountId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.GetEarningStructure: " + e.Message);
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

#### Using the GetEarningStructureWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Earning Structure
    ApiResponse<GetEarningStructureResponse> response = apiInstance.GetEarningStructureWithHttpInfo(accountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.GetEarningStructureWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accountId** | **string** |  | [optional]  |

### Return type

[**GetEarningStructureResponse**](GetEarningStructureResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfullbvn"></a>
# **GetFullBvn**
> FinancialGetFullBvnResponse GetFullBvn (string accountId = null)

Get BVN Information Full

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
    public class GetFullBvnExample
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

            var apiInstance = new FinancialApi(config);
            var accountId = 34c7a2a10b4d4050869fe6f0aa6f0a30;  // string |  (optional) 

            try
            {
                // Get BVN Information Full
                FinancialGetFullBvnResponse result = apiInstance.GetFullBvn(accountId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.GetFullBvn: " + e.Message);
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

#### Using the GetFullBvnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get BVN Information Full
    ApiResponse<FinancialGetFullBvnResponse> response = apiInstance.GetFullBvnWithHttpInfo(accountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.GetFullBvnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accountId** | **string** |  | [optional]  |

### Return type

[**FinancialGetFullBvnResponse**](FinancialGetFullBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * cf-request-id -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getspendingpattern"></a>
# **GetSpendingPattern**
> GetSpendingPatternResponse GetSpendingPattern (string accountId = null)

Get Spending Pattern

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
    public class GetSpendingPatternExample
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

            var apiInstance = new FinancialApi(config);
            var accountId = 02f63911-a958-4025-9d72-8bd2d7da274b;  // string |  (optional) 

            try
            {
                // Get Spending Pattern
                GetSpendingPatternResponse result = apiInstance.GetSpendingPattern(accountId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FinancialApi.GetSpendingPattern: " + e.Message);
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

#### Using the GetSpendingPatternWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Spending Pattern
    ApiResponse<GetSpendingPatternResponse> response = apiInstance.GetSpendingPatternWithHttpInfo(accountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FinancialApi.GetSpendingPatternWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accountId** | **string** |  | [optional]  |

### Return type

[**GetSpendingPatternResponse**](GetSpendingPatternResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

