# WebhooksApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /api/v1/webhook/delete | Delete Webhook
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /api/v1/webhook/fetch | Fetch All Webhooks
[**notifyWebhook**](WebhooksApi.md#notifyWebhook) | **POST** /api/v1/webhook/notify | Post Hook
[**subscribeService**](WebhooksApi.md#subscribeService) | **POST** /api/v1/webhook/subscribe | Subscribe to service


# **deleteWebhook**

#### **DELETE** /api/v1/webhook/delete


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const deleteWebhookResponse = await dojah.webhooks.deleteWebhook();

console.log(deleteWebhookResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**DeleteWebhookResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getWebhooks**

#### **GET** /api/v1/webhook/fetch


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const getWebhooksResponse = await dojah.webhooks.getWebhooks();

console.log(getWebhooksResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**GetWebhooksResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **notifyWebhook**

#### **POST** /api/v1/webhook/notify


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const notifyWebhookResponse = await dojah.webhooks.notifyWebhook({
  subject: "kyc_widget",
});

console.log(notifyWebhookResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notifyWebhookRequest** | **NotifyWebhookRequest**|  |


### Return type

**NotifyWebhookResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **subscribeService**

#### **POST** /api/v1/webhook/subscribe


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const subscribeServiceResponse = await dojah.webhooks.subscribeService({
  webhook: "https://webhook.site/bc33b503-bf38-4b65-88e5-349d86378d4a",
  service: "sms",
});

console.log(subscribeServiceResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscribeServiceRequest** | **SubscribeServiceRequest**|  |


### Return type

**SubscribeServiceResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


