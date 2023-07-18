# KybApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessDetail**](KybApi.md#businessDetail) | **GET** /api/v1/kyb/business/detail | Business Detail
[**businessSearch**](KybApi.md#businessSearch) | **GET** /api/v1/kyb/business/search | Business Search
[**getCac**](KybApi.md#getCac) | **GET** /api/v1/kyc/cac | KYC - Get CAC 
[**getTin**](KybApi.md#getTin) | **GET** /api/v1/kyc/tin | KYC - Fetch Tin


# **businessDetail**

#### **GET** /api/v1/kyb/business/detail


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const businessDetailResponse = await dojah.kyb.businessDetail({});

console.log(businessDetailResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined
 **internationalNumber** | [**string**] |  | (optional) defaults to undefined
 **countryCode** | [**string**] |  | (optional) defaults to undefined
 **full** | [**boolean**] |  | (optional) defaults to undefined


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

# **businessSearch**

#### **GET** /api/v1/kyb/business/search


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const businessSearchResponse = await dojah.kyb.businessSearch({});

console.log(businessSearchResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined
 **countryCode** | [**string**] |  | (optional) defaults to undefined
 **company** | [**number**] |  | (optional) defaults to undefined


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

# **getCac**

#### **GET** /api/v1/kyc/cac


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const getCacResponse = await dojah.kyb.getCac({});

console.log(getCacResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined
 **rcNumber** | [**number**] |  | (optional) defaults to undefined
 **companyName** | [**string**] |  | (optional) defaults to undefined


### Return type

**KybGetCacResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getTin**

#### **GET** /api/v1/kyc/tin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const getTinResponse = await dojah.kyb.getTin({});

console.log(getTinResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined
 **tin** | [**string**] |  | (optional) defaults to undefined


### Return type

**KybGetTinResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


