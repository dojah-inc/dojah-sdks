# WalletApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWallet**](WalletApi.md#createWallet) | **POST** /v1/wallet/ngn/create | Create NGN Wallet
[**creditSubwallet**](WalletApi.md#creditSubwallet) | **POST** /v1/wallet/ngn/credit | Credit Sub-wallet
[**getTransaction**](WalletApi.md#getTransaction) | **GET** /v1/wallet/ngn/transaction | Retrieve Transaction Details
[**getWallet**](WalletApi.md#getWallet) | **GET** /v1/wallet/ngn/retrieve | Retrieve Wallet Details
[**getWallets**](WalletApi.md#getWallets) | **GET** /v1/wallet/ngn/accounts | Get Wallets
[**transferFunds**](WalletApi.md#transferFunds) | **POST** /v1/wallet/ngn/transfer | Transfer Funds


# **createWallet**

#### **POST** /v1/wallet/ngn/create


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const createWalletResponse = await dojah.wallet.createWallet({
  last_name: "Dojah",
  first_name: "Inc",
  phone_number: "08068810258",
  dob: "18-May-1992",
  route: "WEMA",
});

console.log(createWalletResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWalletRequest** | **CreateWalletRequest**|  |


### Return type

**CreateWalletResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **creditSubwallet**

#### **POST** /v1/wallet/ngn/credit


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  apiKey: "API_KEY",
});

const creditSubwalletResponse = await dojah.wallet.creditSubwallet({
  amount: "12",
  wallet_id: "867a8cae-8073-4914-8b04-d7fd096c1006",
});

console.log(creditSubwalletResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditSubwalletRequest** | **CreditSubwalletRequest**|  |


### Return type

**CreditSubwalletResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * CF-Ray -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * X-Powered-By -  <br>  * Report-To -  <br>  * NEL -  <br>  * Vary -  <br>  * Server -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getTransaction**

#### **GET** /v1/wallet/ngn/transaction


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getTransactionResponse = await dojah.wallet.getTransaction({});

console.log(getTransactionResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetTransactionResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * CF-Ray -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * X-Powered-By -  <br>  * Report-To -  <br>  * NEL -  <br>  * Vary -  <br>  * Server -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getWallet**

#### **GET** /v1/wallet/ngn/retrieve


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getWalletResponse = await dojah.wallet.getWallet({});

console.log(getWalletResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetWalletResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getWallets**

#### **GET** /v1/wallet/ngn/accounts


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getWalletsResponse = await dojah.wallet.getWallets({});

console.log(getWalletsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined


### Return type

**GetWalletsResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **transferFunds**

#### **POST** /v1/wallet/ngn/transfer


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const transferFundsResponse = await dojah.wallet.transferFunds({
  amount: "50",
  recipient_bank_code: "058",
  recipient_account_number: "0037466959",
  wallet_id: "6187eb92-a4ad-420f-98cf-05a34188f467",
});

console.log(transferFundsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferFundsRequest** | **TransferFundsRequest**|  |


### Return type

**TransferFundsResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * CF-Ray -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * X-Powered-By -  <br>  * Report-To -  <br>  * NEL -  <br>  * Vary -  <br>  * Server -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


