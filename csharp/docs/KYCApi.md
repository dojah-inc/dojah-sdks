# Dojah.Net.Api.KYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CheckLiveness**](KYCApi.md#checkliveness) | **POST** /api/v1/ml/liveness | Liveness Check |
| [**GetAccounts**](KYCApi.md#getaccounts) | **GET** /api/v1/kyc/accounts | KYC - Fetch Accounts  |
| [**GetAddressVerification**](KYCApi.md#getaddressverification) | **GET** /api/v1/kyc/address | Fetch Address Verification Data |
| [**GetBvnFromNuban**](KYCApi.md#getbvnfromnuban) | **GET** /api/v1/kyc/nuban/bvn | Lookup BVN from NUBAN |
| [**GetVin**](KYCApi.md#getvin) | **GET** /api/v1/kyc/vin | KYC - Get VIN |
| [**SubmitAddress**](KYCApi.md#submitaddress) | **POST** /api/v1/kyc/address | Submit Address |

<a name="checkliveness"></a>
# **CheckLiveness**
> Object CheckLiveness (KycCheckLivenessRequest kycCheckLivenessRequest)

Liveness Check

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class CheckLivenessExample
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

            var kycCheckLivenessRequest = new KycCheckLivenessRequest(); // KycCheckLivenessRequest | 

            try
            {
                // Liveness Check
                Object result = client.KYC.CheckLiveness(kycCheckLivenessRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling KYCApi.CheckLiveness: " + e.Message);
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

#### Using the CheckLivenessWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Liveness Check
    ApiResponse<Object> response = apiInstance.CheckLivenessWithHttpInfo(kycCheckLivenessRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.CheckLivenessWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **kycCheckLivenessRequest** | [**KycCheckLivenessRequest**](KycCheckLivenessRequest.md) |  |  |

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

<a name="getaccounts"></a>
# **GetAccounts**
> Object GetAccounts (string bvn = null)

KYC - Fetch Accounts 

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetAccountsExample
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

            var bvn = "22342291445 ";  // string |  (optional) 

            try
            {
                // KYC - Fetch Accounts 
                Object result = client.KYC.GetAccounts(bvn);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling KYCApi.GetAccounts: " + e.Message);
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

#### Using the GetAccountsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Fetch Accounts 
    ApiResponse<Object> response = apiInstance.GetAccountsWithHttpInfo(bvn);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetAccountsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bvn** | **string** |  | [optional]  |

### Return type

**Object**

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

<a name="getaddressverification"></a>
# **GetAddressVerification**
> Object GetAddressVerification (string referenceId = null)

Fetch Address Verification Data

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetAddressVerificationExample
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

            var referenceId = "69e10264-4b90-64fe-b4b7-c9dddafd0241";  // string |  (optional) 

            try
            {
                // Fetch Address Verification Data
                Object result = client.KYC.GetAddressVerification(referenceId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling KYCApi.GetAddressVerification: " + e.Message);
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

#### Using the GetAddressVerificationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch Address Verification Data
    ApiResponse<Object> response = apiInstance.GetAddressVerificationWithHttpInfo(referenceId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetAddressVerificationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **referenceId** | **string** |  | [optional]  |

### Return type

**Object**

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

<a name="getbvnfromnuban"></a>
# **GetBvnFromNuban**
> Object GetBvnFromNuban (int? bankCode = null, int? accountNumber = null)

Lookup BVN from NUBAN

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetBvnFromNubanExample
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

            var bankCode = 57;  // int? |  (optional) 
            var accountNumber = 2174879334;  // int? |  (optional) 

            try
            {
                // Lookup BVN from NUBAN
                Object result = client.KYC.GetBvnFromNuban(bankCode, accountNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling KYCApi.GetBvnFromNuban: " + e.Message);
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

#### Using the GetBvnFromNubanWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Lookup BVN from NUBAN
    ApiResponse<Object> response = apiInstance.GetBvnFromNubanWithHttpInfo(bankCode, accountNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetBvnFromNubanWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bankCode** | **int?** |  | [optional]  |
| **accountNumber** | **int?** |  | [optional]  |

### Return type

**Object**

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

<a name="getvin"></a>
# **GetVin**
> GetVinResponse GetVin (string vin = null)

KYC - Get VIN

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetVinExample
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

            var vin = "90F5B20205096041114";  // string |  (optional) 

            try
            {
                // KYC - Get VIN
                GetVinResponse result = client.KYC.GetVin(vin);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling KYCApi.GetVin: " + e.Message);
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

#### Using the GetVinWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // KYC - Get VIN
    ApiResponse<GetVinResponse> response = apiInstance.GetVinWithHttpInfo(vin);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.GetVinWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vin** | **string** |  | [optional]  |

### Return type

[**GetVinResponse**](GetVinResponse.md)

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

<a name="submitaddress"></a>
# **SubmitAddress**
> KycSubmitAddressResponse SubmitAddress (KycSubmitAddressRequest kycSubmitAddressRequest = null)

Submit Address

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class SubmitAddressExample
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

            var kycSubmitAddressRequest = new KycSubmitAddressRequest(); // KycSubmitAddressRequest |  (optional) 

            try
            {
                // Submit Address
                KycSubmitAddressResponse result = client.KYC.SubmitAddress(kycSubmitAddressRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling KYCApi.SubmitAddress: " + e.Message);
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

#### Using the SubmitAddressWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Submit Address
    ApiResponse<KycSubmitAddressResponse> response = apiInstance.SubmitAddressWithHttpInfo(kycSubmitAddressRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KYCApi.SubmitAddressWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **kycSubmitAddressRequest** | [**KycSubmitAddressRequest**](KycSubmitAddressRequest.md) |  | [optional]  |

### Return type

[**KycSubmitAddressResponse**](KycSubmitAddressResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

