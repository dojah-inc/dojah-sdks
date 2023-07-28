# ZafKycApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getId**](ZafKycApi.md#getId) | **GET** /api/v1/za/kyc/id | KYC - Lookup ID


# **getId**

#### **GET** /api/v1/za/kyc/id


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getIdResponse = await dojah.zafKyc.getId({});

console.log(getIdResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idNumber** | [**number**] |  | (optional) defaults to undefined


### Return type

**ZafKycGetIdResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Strict-Transport-Security -  <br>  * X-Content-Type-Options -  <br>  * Server -  <br>  * CF-RAY -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


