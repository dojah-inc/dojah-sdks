# TzKycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNin**](TzKycApi.md#getNin) | **GET** /api/v1/tz/kyc/nin | Lookup TZ NIN


# **getNin**

#### **GET** /api/v1/tz/kyc/nin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const getNinResponse = await dojah.tzKyc.getNin({});

console.log(getNinResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined
 **mothersLastName** | [**string**] |  | (optional) defaults to undefined
 **mothersFirstName** | [**string**] |  | (optional) defaults to undefined


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


