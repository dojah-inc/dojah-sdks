# \ServicesApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetWalletBalance**](ServicesApi.md#GetWalletBalance) | **Get** /api/v1/balance | Get Dojah Wallet Balance



## GetWalletBalance

> GetWalletBalanceResponse GetWalletBalance(ctx).Execute()

Get Dojah Wallet Balance

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    dojah "github.com/dojah-inc/dojah-sdks/go"
)

func main() {

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.ServicesApi.GetWalletBalance(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServicesApi.GetWalletBalance``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetWalletBalance`: GetWalletBalanceResponse
    fmt.Fprintf(os.Stdout, "Response from `ServicesApi.GetWalletBalance`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetWalletBalanceRequest struct via the builder pattern


### Return type

[**GetWalletBalanceResponse**](GetWalletBalanceResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

