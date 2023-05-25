# ServicesApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categorizeTransactions**](ServicesApi.md#categorizeTransactions) | **POST** /v1/ml/categorize_transaction | Categorize Transactions


# **categorizeTransactions**

#### **POST** /v1/ml/categorize_transaction


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const categorizeTransactionsResponse =
  await dojah.services.categorizeTransactions({
    description:
      "POS/WEB PURCHASE TRANSACTION -047608- -253842-MUNCHIES BY MOE OY OYNG",
    trans_type: "debit",
  });

console.log(categorizeTransactionsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categorizeTransactionsRequest** | **CategorizeTransactionsRequest**|  |


### Return type

**CategorizeTransactionsResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


