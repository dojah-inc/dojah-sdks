# KeKycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNationalId**](KeKycApi.md#getNationalId) | **GET** /api/v1/ke/kyc/id | KYC - National ID


# **getNationalId**

#### **GET** /api/v1/ke/kyc/id


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getNationalIdResponse = await dojah.keKyc.getNationalId({});

console.log(getNationalIdResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**number**] |  | (optional) defaults to undefined
 **firstName** | [**string**] |  | (optional) defaults to undefined
 **lastName** | [**string**] |  | (optional) defaults to undefined
 **middleName** | [**string**] |  | (optional) defaults to undefined
 **dateOfBirth** | [**string**] |  | (optional) defaults to undefined
 **gender** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetNationalIdResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


