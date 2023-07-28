# GhKycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDriversLicense**](GhKycApi.md#getDriversLicense) | **GET** /api/v1/gh/kyc/dl | Driver\&#39;s License
[**getPassport**](GhKycApi.md#getPassport) | **GET** /api/v1/gh/kyc/passport | Passport
[**getSsnit**](GhKycApi.md#getSsnit) | **GET** /api/v1/gh/kyc/ssnit | SSNIT
[**getVoter**](GhKycApi.md#getVoter) | **GET** /api/v1/gh/kyc/voter | Voter ID Lookup


# **getDriversLicense**

#### **GET** /api/v1/gh/kyc/dl


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getDriversLicenseResponse = await dojah.ghKyc.getDriversLicense({});

console.log(getDriversLicenseResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] |  | (optional) defaults to undefined
 **fullName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetDriversLicenseResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getPassport**

#### **GET** /api/v1/gh/kyc/passport


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getPassportResponse = await dojah.ghKyc.getPassport({});

console.log(getPassportResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined
 **middleName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetPassportResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getSsnit**

#### **GET** /api/v1/gh/kyc/ssnit


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getSsnitResponse = await dojah.ghKyc.getSsnit({});

console.log(getSsnitResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] |  | (optional) defaults to undefined
 **fullName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetSsnitResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getVoter**

#### **GET** /api/v1/gh/kyc/voter


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getVoterResponse = await dojah.ghKyc.getVoter({});

console.log(getVoterResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**number**] |  | (optional) defaults to undefined
 **fullName** | [**string**] |  | (optional) defaults to undefined
 **isNewId** | [**boolean**] |  | (optional) defaults to undefined


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


