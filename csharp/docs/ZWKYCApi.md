# Dojah.Net.Api.ZWKYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CheckCredit**](ZWKYCApi.md#checkcredit) | **GET** /api/v1/zw/kyc/fcb | Credit Check |
| [**VerifyId**](ZWKYCApi.md#verifyid) | **GET** /api/v1/zw/kyc/nin | National ID Verification |

<a name="checkcredit"></a>
# **CheckCredit**
> ZwKycCheckCreditResponse CheckCredit (string idNumber = null, string name = null, string surname = null, string gender = null, string dob = null, string maritalStatus = null, int? mobileNumber = null)

Credit Check

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class CheckCreditExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            var idNumber = "45190221E45";  // string |  (optional) 
            var name = "CHIMUNDEGE";  // string |  (optional) 
            var surname = "CHIMUNDEGE";  // string |  (optional) 
            var gender = "F";  // string |  (optional) 
            var dob = "1994-04-03";  // string |  (optional) 
            var maritalStatus = "M";  // string |  (optional) 
            var mobileNumber = 26424257383;  // int? |  (optional) 

            try
            {
                // Credit Check
                ZwKycCheckCreditResponse result = client.ZWKYC.CheckCredit(idNumber, name, surname, gender, dob, maritalStatus, mobileNumber);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ZWKYCApi.CheckCredit: " + e.Message);
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

#### Using the CheckCreditWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Credit Check
    ApiResponse<ZwKycCheckCreditResponse> response = apiInstance.CheckCreditWithHttpInfo(idNumber, name, surname, gender, dob, maritalStatus, mobileNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ZWKYCApi.CheckCreditWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **idNumber** | **string** |  | [optional]  |
| **name** | **string** |  | [optional]  |
| **surname** | **string** |  | [optional]  |
| **gender** | **string** |  | [optional]  |
| **dob** | **string** |  | [optional]  |
| **maritalStatus** | **string** |  | [optional]  |
| **mobileNumber** | **int?** |  | [optional]  |

### Return type

[**ZwKycCheckCreditResponse**](ZwKycCheckCreditResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Strict-Transport-Security -  <br>  * X-Content-Type-Options -  <br>  * Server -  <br>  * CF-RAY -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyid"></a>
# **VerifyId**
> ZwKycVerifyIdResponse VerifyId (string id = null)

National ID Verification

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class VerifyIdExample
    {
        public static void Main()
        {

            Dojah client = new Dojah();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            var id = "45190221E45";  // string |  (optional) 

            try
            {
                // National ID Verification
                ZwKycVerifyIdResponse result = client.ZWKYC.VerifyId(id);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling ZWKYCApi.VerifyId: " + e.Message);
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

#### Using the VerifyIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // National ID Verification
    ApiResponse<ZwKycVerifyIdResponse> response = apiInstance.VerifyIdWithHttpInfo(id);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ZWKYCApi.VerifyIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** |  | [optional]  |

### Return type

[**ZwKycVerifyIdResponse**](ZwKycVerifyIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

