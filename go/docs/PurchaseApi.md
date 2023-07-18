# \PurchaseApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SendAirtime**](PurchaseApi.md#SendAirtime) | **Post** /v1/purchase/airtime | Purchase - Send Airtime



## SendAirtime

> PurchaseAirtimeResponse SendAirtime(ctx).PurchaseAirtimeRequest(purchaseAirtimeRequest).AppId(appId).Execute()

Purchase - Send Airtime

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
    purchaseAirtimeRequest := *dojah.NewPurchaseAirtimeRequest() // PurchaseAirtimeRequest | 
    appId := "{{app_id}}" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.PurchaseApi.SendAirtime(context.Background()).PurchaseAirtimeRequest(purchaseAirtimeRequest).AppId(appId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PurchaseApi.SendAirtime``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SendAirtime`: PurchaseAirtimeResponse
    fmt.Fprintf(os.Stdout, "Response from `PurchaseApi.SendAirtime`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSendAirtimeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseAirtimeRequest** | [**PurchaseAirtimeRequest**](PurchaseAirtimeRequest.md) |  | 
 **appId** | **string** |  | 

### Return type

[**PurchaseAirtimeResponse**](PurchaseAirtimeResponse.md)

### Authorization

[noauthAuth](../README.md#noauthAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

