# GeneralApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBanks**](GeneralApi.md#getBanks) | **GET** /v1/general/banks | General - Get Banks
[**getBin**](GeneralApi.md#getBin) | **GET** /v1/general/bin | General Resolve BIN
[**getDataPlans**](GeneralApi.md#getDataPlans) | **GET** /v1/purchase/data/plans | Purchase - Get Data Plans
[**getNuban**](GeneralApi.md#getNuban) | **GET** /v1/general/account | General Resolve NUBAN
[**getWalletBalance**](GeneralApi.md#getWalletBalance) | **GET** /api/v1/balance | Get Dojah Wallet Balance
[**purchaseAirtime**](GeneralApi.md#purchaseAirtime) | **POST** /v1/purchase/airtime | Purchase - Send Airtime
[**purchaseData**](GeneralApi.md#purchaseData) | **POST** /v1/purchase/data | Purchase - Buy Data


# **getBanks**

#### **GET** /v1/general/banks


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getBin**

#### **GET** /v1/general/bin


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDataPlans**

#### **GET** /v1/purchase/data/plans


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getDataPlansResponse = await dojah.general.getDataPlans();

console.log(getDataPlansResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**GetDataPlansResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getNuban**

#### **GET** /v1/general/account


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
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

# **getWalletBalance**

#### **GET** /api/v1/balance


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getWalletBalanceResponse = await dojah.general.getWalletBalance();

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
**200** | OK |  -  |
**401** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **purchaseAirtime**

#### **POST** /v1/purchase/airtime


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const purchaseAirtimeResponse = await dojah.general.purchaseAirtime({
  destination: "08068810228",
  amount: "100",
});

console.log(purchaseAirtimeResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseAirtimeRequest** | **PurchaseAirtimeRequest**|  |


### Return type

**PurchaseAirtimeResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **purchaseData**

#### **POST** /v1/purchase/data


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const purchaseDataResponse = await dojah.general.purchaseData({
  plan: "9MOBILE_1.5GB",
  destination: "09090577941",
});

console.log(purchaseDataResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseDataRequest** | **PurchaseDataRequest**|  |


### Return type

**PurchaseDataResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


