# GlobalKycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**caEkyc**](GlobalKycApi.md#caEkyc) | **GET** /api/v1/ca/kyc | Canada Ekyc
[**getUsSsn**](GlobalKycApi.md#getUsSsn) | **GET** /api/v1/us/kyc | US SSN
[**ukTwoPlusTwo**](GlobalKycApi.md#ukTwoPlusTwo) | **GET** /api/v1/uk/kyc | UK 2+2


# **caEkyc**

#### **GET** /api/v1/ca/kyc


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const caEkycResponse = await dojah.globalKyc.caEkyc({});

console.log(caEkycResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined
 **country** | [**string**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined
 **streetName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined
 **houseNumber** | [**number**] |  | (optional) defaults to undefined
 **postCode** | [**number**] |  | (optional) defaults to undefined


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

# **getUsSsn**

#### **GET** /api/v1/us/kyc


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const getUsSsnResponse = await dojah.globalKyc.getUsSsn({});

console.log(getUsSsnResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined
 **country** | [**string**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined
 **streetName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined
 **houseNumber** | [**number**] |  | (optional) defaults to undefined
 **postCode** | [**number**] |  | (optional) defaults to undefined


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

# **ukTwoPlusTwo**

#### **GET** /api/v1/uk/kyc


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const ukTwoPlusTwoResponse = await dojah.globalKyc.ukTwoPlusTwo({});

console.log(ukTwoPlusTwoResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined
 **country** | [**string**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined
 **streetName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined
 **houseNumber** | [**number**] |  | (optional) defaults to undefined
 **postCode** | [**number**] |  | (optional) defaults to undefined


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


