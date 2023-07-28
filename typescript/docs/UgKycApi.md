# UgKycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVoter**](UgKycApi.md#getVoter) | **GET** /api/v1/ug/kyc/voter | Voters ID


# **getVoter**

#### **GET** /api/v1/ug/kyc/voter


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getVoterResponse = await dojah.ugKyc.getVoter({});

console.log(getVoterResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**number**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined


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


