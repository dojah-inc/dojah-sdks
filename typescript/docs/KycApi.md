# KycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeDocument**](KycApi.md#analyzeDocument) | **POST** /api/v1/document/analysis | KYC - Document Analysis
[**getBasicBvn**](KycApi.md#getBasicBvn) | **GET** /api/v1/kyc/bvn/basic | KYC - Get Basic BVN Info
[**getBasicPhoneNumber**](KycApi.md#getBasicPhoneNumber) | **GET** /v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic
[**getDriversLicense**](KycApi.md#getDriversLicense) | **GET** /api/v1/kyc/dl | KYC - Get Drivers License Info
[**getEmailReputation**](KycApi.md#getEmailReputation) | **GET** /v1/kyc/email | KYC - Get Email Reputation
[**getFullBvn**](KycApi.md#getFullBvn) | **GET** /api/v1/kyc/bvn/full | KYC - Lookup BVN Basic
[**getNuban**](KycApi.md#getNuban) | **GET** /api/v1/kyc/nuban | KYC - Get NUBAN Information
[**getPassport**](KycApi.md#getPassport) | **GET** /api/v1/kyc/passport | KYC - Passport
[**getPhoneNumber**](KycApi.md#getPhoneNumber) | **GET** /api/v1/kyc/phone_number | KYC - Lookup Phone Number
[**getPremiumBvn**](KycApi.md#getPremiumBvn) | **GET** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium
[**getVIN**](KycApi.md#getVIN) | **GET** /api/v1/kyc/vin | KYC - Get VIN
[**getVnin**](KycApi.md#getVnin) | **GET** /api/v1/kyc/vnin | Lookup VNIN
[**validateBvn**](KycApi.md#validateBvn) | **GET** /api/v1/kyc/bvn | KYC - Validate BVN
[**verifyAge**](KycApi.md#verifyAge) | **GET** /v1/kyc/age_verification | KYC - Age Verification
[**verifySelfieBvn**](KycApi.md#verifySelfieBvn) | **POST** /v1/kyc/bvn/verify | KYC - Selfie BVN Verificatoin
[**verifySelfieNin**](KycApi.md#verifySelfieNin) | **POST** /v1/kyc/nin/verify | KYC - Selfie NIN Verification


# **analyzeDocument**

#### **POST** /api/v1/document/analysis


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const analyzeDocumentResponse = await dojah.kyc.analyzeDocument();

console.log(analyzeDocumentResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AnalyzeDocumentResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getBasicBvn**

#### **GET** /api/v1/kyc/bvn/basic


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getBasicBvnResponse = await dojah.kyc.getBasicBvn({});

console.log(getBasicBvnResponse);
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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getBasicPhoneNumber**

#### **GET** /v1/kyc/phone_number/basic


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getBasicPhoneNumberResponse = await dojah.kyc.getBasicPhoneNumber({});

console.log(getBasicPhoneNumberResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | [**number**] |  | (optional) defaults to undefined


### Return type

**GetBasicPhoneNumberResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDriversLicense**

#### **GET** /api/v1/kyc/dl


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getDriversLicenseResponse = await dojah.kyc.getDriversLicense({});

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getEmailReputation**

#### **GET** /v1/kyc/email


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getEmailReputationResponse = await dojah.kyc.getEmailReputation({});

console.log(getEmailReputationResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetEmailReputationResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * CF-Ray -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * X-Powered-By -  <br>  * Report-To -  <br>  * NEL -  <br>  * Vary -  <br>  * Server -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getFullBvn**

#### **GET** /api/v1/kyc/bvn/full


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getFullBvnResponse = await dojah.kyc.getFullBvn({});

console.log(getFullBvnResponse);
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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getNuban**

#### **GET** /api/v1/kyc/nuban


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getNubanResponse = await dojah.kyc.getNuban({});

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
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getPassportResponse = await dojah.kyc.getPassport({});

console.log(getPassportResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passportNumber** | [**number**] |  | (optional) defaults to undefined
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
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getPhoneNumberResponse = await dojah.kyc.getPhoneNumber({});

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
**200** | OK |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getPremiumBvn**

#### **GET** /api/v1/kyc/bvn/advance


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getPremiumBvnResponse = await dojah.kyc.getPremiumBvn({});

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

# **getVIN**

#### **GET** /api/v1/kyc/vin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getVINResponse = await dojah.kyc.getVIN({});

console.log(getVINResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | [**string**] |  | (optional) defaults to undefined
 **firstname** | [**string**] |  | (optional) defaults to undefined
 **lastname** | [**string**] |  | (optional) defaults to undefined
 **vin** | [**number**] |  | (optional) defaults to undefined
 **state** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetVinResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * cf-request-id -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getVnin**

#### **GET** /api/v1/kyc/vnin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getVninResponse = await dojah.kyc.getVnin({});

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

# **validateBvn**

#### **GET** /api/v1/kyc/bvn


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const validateBvnResponse = await dojah.kyc.validateBvn({});

console.log(validateBvnResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | [**number**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **dob** | [**string**] |  | (optional) defaults to undefined


### Return type

**ValidateBvnResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **verifyAge**

#### **GET** /v1/kyc/age_verification


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const verifyAgeResponse = await dojah.kyc.verifyAge({});

console.log(verifyAgeResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | [**string**] |  | (optional) defaults to undefined
 **accountNumber** | [**number**] |  | (optional) defaults to undefined
 **bankCode** | [**number**] |  | (optional) defaults to undefined
 **dob** | [**string**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined


### Return type

**VerifyAgeResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **verifySelfieBvn**

#### **POST** /v1/kyc/bvn/verify


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const verifySelfieBvnResponse = await dojah.kyc.verifySelfieBvn({
  bvn: "22468537919",
  selfie_image: "<base64 encoded image>",
});

console.log(verifySelfieBvnResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifySelfieBvnRequest** | **VerifySelfieBvnRequest**|  |


### Return type

**VerifySelfieBvnResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **verifySelfieNin**

#### **POST** /v1/kyc/nin/verify


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const verifySelfieNinResponse = await dojah.kyc.verifySelfieNin({
  nin: "79628483753",
  selfie_image: "<base64 encoded image>",
});

console.log(verifySelfieNinResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifySelfieNinRequest** | **VerifySelfieNinRequest**|  |


### Return type

**VerifySelfieNinResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


