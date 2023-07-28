# NigeriaKycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBasicBvn**](NigeriaKycApi.md#getBasicBvn) | **GET** /api/v1/kyc/bvn | KYC - Get Basic BVN Info
[**getBasicBvn1**](NigeriaKycApi.md#getBasicBvn1) | **GET** /api/v1/kyc/bvn/basic | KYC - Lookup BVN Basic 1
[**getBasicPhoneNumber**](NigeriaKycApi.md#getBasicPhoneNumber) | **GET** /api/v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic
[**getDriversLicense**](NigeriaKycApi.md#getDriversLicense) | **GET** /api/v1/kyc/dl | KYC - Get Drivers License Info
[**getNin**](NigeriaKycApi.md#getNin) | **GET** /api/v1/kyc/nin | KYC - Get NIN Info
[**getNormalBvn**](NigeriaKycApi.md#getNormalBvn) | **GET** /api/v1/kyc/bvn/full | KYC - Lookup BVN Normal
[**getNuban**](NigeriaKycApi.md#getNuban) | **GET** /api/v1/kyc/nuban | KYC - Get NUBAN Information
[**getPassport**](NigeriaKycApi.md#getPassport) | **GET** /api/v1/kyc/passport | KYC - Passport
[**getPhoneNumber**](NigeriaKycApi.md#getPhoneNumber) | **GET** /api/v1/kyc/phone_number | KYC - Lookup Phone Number
[**getPremiumBvn**](NigeriaKycApi.md#getPremiumBvn) | **GET** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium
[**getVnin**](NigeriaKycApi.md#getVnin) | **GET** /api/v1/kyc/vnin | Lookup VNIN


# **getBasicBvn**

#### **GET** /api/v1/kyc/bvn


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getBasicBvnResponse = await dojah.nigeriaKyc.getBasicBvn({});

console.log(getBasicBvnResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | [**number**] |  | (optional) defaults to undefined


### Return type

**ValidateBvnResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getBasicBvn1**

#### **GET** /api/v1/kyc/bvn/basic


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getBasicBvn1Response = await dojah.nigeriaKyc.getBasicBvn1({});

console.log(getBasicBvn1Response);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | [**number**] |  | (optional) defaults to undefined


### Return type

**GetBasicBvnResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getBasicPhoneNumber**

#### **GET** /api/v1/kyc/phone_number/basic


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getBasicPhoneNumberResponse = await dojah.nigeriaKyc.getBasicPhoneNumber(
  {}
);

console.log(getBasicPhoneNumberResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | [**number**] |  | (optional) defaults to undefined


### Return type

**object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDriversLicense**

#### **GET** /api/v1/kyc/dl


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getDriversLicenseResponse = await dojah.nigeriaKyc.getDriversLicense({});

console.log(getDriversLicenseResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseNumber** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetKycDriversLicenseResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getNin**

#### **GET** /api/v1/kyc/nin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getNinResponse = await dojah.nigeriaKyc.getNin({});

console.log(getNinResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nin** | [**number**] |  | (optional) defaults to undefined


### Return type

**NigeriaKycGetNinResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getNormalBvn**

#### **GET** /api/v1/kyc/bvn/full


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getNormalBvnResponse = await dojah.nigeriaKyc.getNormalBvn({});

console.log(getNormalBvnResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | [**number**] |  | (optional) defaults to undefined


### Return type

**GetFullBvnResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getNuban**

#### **GET** /api/v1/kyc/nuban


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getNubanResponse = await dojah.nigeriaKyc.getNuban({});

console.log(getNubanResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankCode** | [**number**] |  | (optional) defaults to undefined
 **accountNumber** | [**number**] |  | (optional) defaults to undefined


### Return type

**GetNubanResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getPassport**

#### **GET** /api/v1/kyc/passport


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getPassportResponse = await dojah.nigeriaKyc.getPassport({});

console.log(getPassportResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passportNumber** | [**string**] |  | (optional) defaults to undefined
 **surname** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetKycPassportResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getPhoneNumber**

#### **GET** /api/v1/kyc/phone_number


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getPhoneNumberResponse = await dojah.nigeriaKyc.getPhoneNumber({});

console.log(getPhoneNumberResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | [**number**] |  | (optional) defaults to undefined


### Return type

**GetPhoneNumberResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |
**404** | Not Found |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getPremiumBvn**

#### **GET** /api/v1/kyc/bvn/advance


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getPremiumBvnResponse = await dojah.nigeriaKyc.getPremiumBvn({});

console.log(getPremiumBvnResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | [**number**] |  | (optional) defaults to undefined


### Return type

**GetPremiumBvnResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getVnin**

#### **GET** /api/v1/kyc/vnin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getVninResponse = await dojah.nigeriaKyc.getVnin({});

console.log(getVninResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vnin** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetVninResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


