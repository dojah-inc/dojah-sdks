# AmlApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScreeningInfo**](AmlApi.md#getScreeningInfo) | **GET** /api/v1/aml/screening/info | Get AML Info
[**screenAml**](AmlApi.md#screenAml) | **POST** /api/v1/aml/screening/platform | AML Screening


# **getScreeningInfo**

#### **GET** /api/v1/aml/screening/info


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const getScreeningInfoResponse = await dojah.aml.getScreeningInfo({});

console.log(getScreeningInfoResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | [**string**] |  | (optional) defaults to undefined


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

# **screenAml**

#### **POST** /api/v1/aml/screening/platform


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const screenAmlResponse = await dojah.aml.screenAml({
  first_name: "Tinubu ",
  last_name: "Bola",
  date_of_birth: "1997-08-18",
  name_query_match_threshold: "80",
});

console.log(screenAmlResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amlScreenAmlRequest** | **AmlScreenAmlRequest**|  |


### Return type

**AmlScreenAmlResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


