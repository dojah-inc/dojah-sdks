# ServicesApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWalletBalance**](ServicesApi.md#getWalletBalance) | **GET** /api/v1/balance | Get Dojah Wallet Balance


# **getWalletBalance**

#### **GET** /api/v1/balance


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const getWalletBalanceResponse = await dojah.services.getWalletBalance();

console.log(getWalletBalanceResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**GetWalletBalanceResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


