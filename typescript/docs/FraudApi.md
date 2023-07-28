# FraudApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmailReputation**](FraudApi.md#getEmailReputation) | **GET** /api/v1/kyc/email | Email Reputation
[**getIpReputation**](FraudApi.md#getIpReputation) | **GET** /api/v1/fraud/ip | IP Reputation
[**screenPhone**](FraudApi.md#screenPhone) | **GET** /api/v1/fraud/phone | Phone Screening
[**screenUser**](FraudApi.md#screenUser) | **GET** /api/v1/fraud/user | User Screening


# **getEmailReputation**

#### **GET** /api/v1/kyc/email


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getEmailReputationResponse = await dojah.fraud.getEmailReputation({});

console.log(getEmailReputationResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | [**string**] |  | (optional) defaults to undefined


### Return type

**FraudGetEmailReputationResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * CF-Ray -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * X-Powered-By -  <br>  * Report-To -  <br>  * NEL -  <br>  * Vary -  <br>  * Server -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getIpReputation**

#### **GET** /api/v1/fraud/ip


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getIpReputationResponse = await dojah.fraud.getIpReputation({});

console.log(getIpReputationResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | [**string**] |  | (optional) defaults to undefined


### Return type

**FraudGetIpReputationResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Server-Timing -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **screenPhone**

#### **GET** /api/v1/fraud/phone


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const screenPhoneResponse = await dojah.fraud.screenPhone({});

console.log(screenPhoneResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | [**number**] |  | (optional) defaults to undefined


### Return type

**FraudScreenPhoneResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **screenUser**

#### **GET** /api/v1/fraud/user


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const screenUserResponse = await dojah.fraud.screenUser({});

console.log(screenUserResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined
 **email** | [**string**] |  | (optional) defaults to undefined
 **phone** | [**string**] |  | (optional) defaults to undefined
 **ipAddress** | [**string**] |  | (optional) defaults to undefined


### Return type

**FraudScreenUserResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


