# Dojah.Net.Api.GlobalKYCApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CaEkyc**](GlobalKYCApi.md#caekyc) | **GET** /api/v1/ca/kyc | Canada Ekyc |
| [**GetUsSsn**](GlobalKYCApi.md#getusssn) | **GET** /api/v1/us/kyc | US SSN |
| [**UkTwoPlusTwo**](GlobalKYCApi.md#uktwoplustwo) | **GET** /api/v1/uk/kyc | UK 2+2 |

<a name="caekyc"></a>
# **CaEkyc**
> Object CaEkyc (string country = null, string firstName = null, string lastName = null, string streetName = null, string dateOfBirth = null, int? houseNumber = null, int? postCode = null)

Canada Ekyc

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class CaEkycExample
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

            var country = "GBR";  // string |  (optional) 
            var firstName = "Tobi";  // string |  (optional) 
            var lastName = "Ololade";  // string |  (optional) 
            var streetName = "Street 1";  // string |  (optional) 
            var dateOfBirth = "1992-05-18";  // string |  (optional) 
            var houseNumber = 25;  // int? |  (optional) 
            var postCode = 1234;  // int? |  (optional) 

            try
            {
                // Canada Ekyc
                Object result = client.GlobalKYC.CaEkyc(country, firstName, lastName, streetName, dateOfBirth, houseNumber, postCode);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GlobalKYCApi.CaEkyc: " + e.Message);
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

#### Using the CaEkycWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Canada Ekyc
    ApiResponse<Object> response = apiInstance.CaEkycWithHttpInfo(country, firstName, lastName, streetName, dateOfBirth, houseNumber, postCode);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GlobalKYCApi.CaEkycWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **country** | **string** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |
| **streetName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |
| **houseNumber** | **int?** |  | [optional]  |
| **postCode** | **int?** |  | [optional]  |

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

<a name="getusssn"></a>
# **GetUsSsn**
> Object GetUsSsn (string country = null, string firstName = null, string lastName = null, string streetName = null, string dateOfBirth = null, int? houseNumber = null, int? postCode = null)

US SSN

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class GetUsSsnExample
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

            var country = "GBR";  // string |  (optional) 
            var firstName = "Tobi";  // string |  (optional) 
            var lastName = "Ololade";  // string |  (optional) 
            var streetName = "Street 1";  // string |  (optional) 
            var dateOfBirth = "1992-05-18";  // string |  (optional) 
            var houseNumber = 25;  // int? |  (optional) 
            var postCode = 1234;  // int? |  (optional) 

            try
            {
                // US SSN
                Object result = client.GlobalKYC.GetUsSsn(country, firstName, lastName, streetName, dateOfBirth, houseNumber, postCode);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GlobalKYCApi.GetUsSsn: " + e.Message);
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

#### Using the GetUsSsnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // US SSN
    ApiResponse<Object> response = apiInstance.GetUsSsnWithHttpInfo(country, firstName, lastName, streetName, dateOfBirth, houseNumber, postCode);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GlobalKYCApi.GetUsSsnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **country** | **string** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |
| **streetName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |
| **houseNumber** | **int?** |  | [optional]  |
| **postCode** | **int?** |  | [optional]  |

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

<a name="uktwoplustwo"></a>
# **UkTwoPlusTwo**
> Object UkTwoPlusTwo (string country = null, string firstName = null, string lastName = null, string streetName = null, string dateOfBirth = null, int? houseNumber = null, int? postCode = null)

UK 2+2

### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Example
{
    public class UkTwoPlusTwoExample
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

            var country = "GBR";  // string |  (optional) 
            var firstName = "Tobi";  // string |  (optional) 
            var lastName = "Ololade";  // string |  (optional) 
            var streetName = "Street 1";  // string |  (optional) 
            var dateOfBirth = "1992-05-18";  // string |  (optional) 
            var houseNumber = 25;  // int? |  (optional) 
            var postCode = 1234;  // int? |  (optional) 

            try
            {
                // UK 2+2
                Object result = client.GlobalKYC.UkTwoPlusTwo(country, firstName, lastName, streetName, dateOfBirth, houseNumber, postCode);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling GlobalKYCApi.UkTwoPlusTwo: " + e.Message);
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

#### Using the UkTwoPlusTwoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // UK 2+2
    ApiResponse<Object> response = apiInstance.UkTwoPlusTwoWithHttpInfo(country, firstName, lastName, streetName, dateOfBirth, houseNumber, postCode);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling GlobalKYCApi.UkTwoPlusTwoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **country** | **string** |  | [optional]  |
| **firstName** | **string** |  | [optional]  |
| **lastName** | **string** |  | [optional]  |
| **streetName** | **string** |  | [optional]  |
| **dateOfBirth** | **string** |  | [optional]  |
| **houseNumber** | **int?** |  | [optional]  |
| **postCode** | **int?** |  | [optional]  |

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

