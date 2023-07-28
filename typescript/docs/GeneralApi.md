# GeneralApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBanks**](GeneralApi.md#getBanks) | **GET** /v1/general/banks | General - Get Banks
[**getBin**](GeneralApi.md#getBin) | **GET** /v1/general/bin | General Resolve BIN
[**getNuban**](GeneralApi.md#getNuban) | **GET** /api/v1/general/account | General Resolve NUBAN


# **getBanks**

#### **GET** /v1/general/banks


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const getBanksResponse = await dojah.general.getBanks();

console.log(getBanksResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**GetBanksResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getBin**

#### **GET** /v1/general/bin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const getBinResponse = await dojah.general.getBin({});

console.log(getBinResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardBin** | [**number**] |  | (optional) defaults to undefined


### Return type

**GetBinResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getNuban**

#### **GET** /api/v1/general/account


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const getNubanResponse = await dojah.general.getNuban({});

console.log(getNubanResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankCode** | [**number**] |  | (optional) defaults to undefined
 **accountNumber** | [**number**] |  | (optional) defaults to undefined


### Return type

**GeneralGetNubanResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


