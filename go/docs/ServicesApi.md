# \ServicesApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CategorizeTransactions**](ServicesApi.md#CategorizeTransactions) | **Post** /v1/ml/categorize_transaction | Categorize Transactions



## CategorizeTransactions

> CategorizeTransactionsResponse CategorizeTransactions(ctx).CategorizeTransactionsRequest(categorizeTransactionsRequest).Execute()

Categorize Transactions

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    dojah "github.com/konfig-dev/dojah-sdks/go"
)

func main() {
    categorizeTransactionsRequest := *dojah.NewCategorizeTransactionsRequest() // CategorizeTransactionsRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.ServicesApi.CategorizeTransactions(context.Background()).CategorizeTransactionsRequest(categorizeTransactionsRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServicesApi.CategorizeTransactions``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CategorizeTransactions`: CategorizeTransactionsResponse
    fmt.Fprintf(os.Stdout, "Response from `ServicesApi.CategorizeTransactions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCategorizeTransactionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categorizeTransactionsRequest** | [**CategorizeTransactionsRequest**](CategorizeTransactionsRequest.md) |  | 

### Return type

[**CategorizeTransactionsResponse**](CategorizeTransactionsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

