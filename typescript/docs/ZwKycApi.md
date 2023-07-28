# ZwKycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCredit**](ZwKycApi.md#checkCredit) | **GET** /api/v1/zw/kyc/fcb | Credit Check
[**verifyId**](ZwKycApi.md#verifyId) | **GET** /api/v1/zw/kyc/nin | National ID Verification


# **checkCredit**

#### **GET** /api/v1/zw/kyc/fcb


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const checkCreditResponse = await dojah.zwKyc.checkCredit({});

console.log(checkCreditResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idNumber** | [**string**] |  | (optional) defaults to undefined
 **name** | [**string**] |  | (optional) defaults to undefined
 **surname** | [**string**] |  | (optional) defaults to undefined
 **gender** | [**string**] |  | (optional) defaults to undefined
 **dob** | [**string**] |  | (optional) defaults to undefined
 **maritalStatus** | [**string**] |  | (optional) defaults to undefined
 **mobileNumber** | [**number**] |  | (optional) defaults to undefined


### Return type

**ZwKycCheckCreditResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Strict-Transport-Security -  <br>  * X-Content-Type-Options -  <br>  * Server -  <br>  * CF-RAY -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **verifyId**

#### **GET** /api/v1/zw/kyc/nin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const verifyIdResponse = await dojah.zwKyc.verifyId({});

console.log(verifyIdResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] |  | (optional) defaults to undefined


### Return type

**ZwKycVerifyIdResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


