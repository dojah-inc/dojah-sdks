# KybApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdvancedCac**](KybApi.md#getAdvancedCac) | **GET** /v1/kyc/cac/advance | KYC - Get CAC Advanced
[**getBasicCac**](KybApi.md#getBasicCac) | **GET** /v1/kyc/cac/basic | KYB - Get CAC 2
[**getCac**](KybApi.md#getCac) | **GET** /v1/kyc/cac | KYC - Get CAC 
[**getTin**](KybApi.md#getTin) | **GET** /v1/kyc/tin | KYC - Fetch Tin


# **getAdvancedCac**

#### **GET** /v1/kyc/cac/advance


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getAdvancedCacResponse = await dojah.kyb.getAdvancedCac({});

console.log(getAdvancedCacResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rc** | [**number**] |  | (optional) defaults to undefined
 **type** | [**string**] |  | (optional) defaults to undefined
 **_class** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetAdvancedCacResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getBasicCac**

#### **GET** /v1/kyc/cac/basic


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getBasicCacResponse = await dojah.kyb.getBasicCac({});

console.log(getBasicCacResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rc** | [**number**] |  | (optional) defaults to undefined
 **type** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetBasicCacResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getCac**

#### **GET** /v1/kyc/cac


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getCacResponse = await dojah.kyb.getCac({});

console.log(getCacResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rcNumber** | [**number**] |  | (optional) defaults to undefined
 **companyName** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetCacResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getTin**

#### **GET** /v1/kyc/tin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getTinResponse = await dojah.kyb.getTin({});

console.log(getTinResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tin** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetTinResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


