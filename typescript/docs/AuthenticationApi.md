# AuthenticationApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSenderId**](AuthenticationApi.md#getSenderId) | **GET** /api/v1/messaging/sender_ids | Messaging - Get Sender IDs
[**getSmsStatus**](AuthenticationApi.md#getSmsStatus) | **GET** /v1/messaging/sms/get_status | Messaging - Get SMS Status
[**requestSenderId**](AuthenticationApi.md#requestSenderId) | **POST** /api/v1/messaging/sender_id | Messaging - Request Sender ID
[**sendOtp**](AuthenticationApi.md#sendOtp) | **POST** /api/v1/messaging/otp | Messaging - Send OTP
[**sendSms**](AuthenticationApi.md#sendSms) | **POST** /api/v1/messaging/sms | Messaging - Send SMS
[**validateOtp**](AuthenticationApi.md#validateOtp) | **GET** /api/v1/messaging/otp/validate | Messaging - Validate OTP


# **getSenderId**

#### **GET** /api/v1/messaging/sender_ids


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getSenderIdResponse = await dojah.authentication.getSenderId();

console.log(getSenderIdResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**GetSenderIdResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getSmsStatus**

#### **GET** /v1/messaging/sms/get_status


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getSmsStatusResponse = await dojah.authentication.getSmsStatus({});

console.log(getSmsStatusResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetSmsStatusResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **requestSenderId**

#### **POST** /api/v1/messaging/sender_id


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const requestSenderIdResponse = await dojah.authentication.requestSenderId({
  sender_id: "Dojah",
});

console.log(requestSenderIdResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestSenderIdRequest** | **RequestSenderIdRequest**|  |


### Return type

**RequestSenderIdResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **sendOtp**

#### **POST** /api/v1/messaging/otp


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const sendOtpResponse = await dojah.authentication.sendOtp({
  destination: "08068810228",
  length: 6,
  channel: "sms",
  sender_id: "Dojah",
  priority: true,
});

console.log(sendOtpResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationSendOtpRequest** | **AuthenticationSendOtpRequest**|  |


### Return type

**AuthenticationSendOtpResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **sendSms**

#### **POST** /api/v1/messaging/sms


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const sendSmsResponse = await dojah.authentication.sendSms({
  destination: "08068810228",
  message: "Checking to see if you are Okay",
  channel: "whatsapp",
  sender_id: "Kedesa",
});

console.log(sendSmsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendSmsRequest** | **SendSmsRequest**|  |


### Return type

**SendSmsResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **validateOtp**

#### **GET** /api/v1/messaging/otp/validate


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const validateOtpResponse = await dojah.authentication.validateOtp({});

console.log(validateOtpResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceId** | [**string**] |  | (optional) defaults to undefined
 **code** | [**number**] |  | (optional) defaults to undefined


### Return type

**AuthenticationValidateOtpResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


