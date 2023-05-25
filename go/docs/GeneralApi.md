# \GeneralApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBanks**](GeneralApi.md#GetBanks) | **Get** /v1/general/banks | General - Get Banks
[**GetBin**](GeneralApi.md#GetBin) | **Get** /v1/general/bin | General Resolve BIN
[**GetDataPlans**](GeneralApi.md#GetDataPlans) | **Get** /v1/purchase/data/plans | Purchase - Get Data Plans
[**GetNuban**](GeneralApi.md#GetNuban) | **Get** /v1/general/account | General Resolve NUBAN
[**GetWalletBalance**](GeneralApi.md#GetWalletBalance) | **Get** /api/v1/balance | Get Dojah Wallet Balance
[**PurchaseAirtime**](GeneralApi.md#PurchaseAirtime) | **Post** /v1/purchase/airtime | Purchase - Send Airtime
[**PurchaseData**](GeneralApi.md#PurchaseData) | **Post** /v1/purchase/data | Purchase - Buy Data



## GetBanks

> GetBanksResponse GetBanks(ctx).Execute()

General - Get Banks

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
    resp, r, err := apiClient.GeneralApi.GetBanks(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GeneralApi.GetBanks``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBanks`: GetBanksResponse
    fmt.Fprintf(os.Stdout, "Response from `GeneralApi.GetBanks`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetBanksRequest struct via the builder pattern


### Return type

[**GetBanksResponse**](GetBanksResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBin

> GetBinResponse GetBin(ctx).CardBin(cardBin).Execute()

General Resolve BIN

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
    cardBin := int32(506118) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GeneralApi.GetBin(context.Background()).CardBin(cardBin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GeneralApi.GetBin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBin`: GetBinResponse
    fmt.Fprintf(os.Stdout, "Response from `GeneralApi.GetBin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardBin** | **int32** |  | 

### Return type

[**GetBinResponse**](GetBinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetDataPlans

> GetDataPlansResponse GetDataPlans(ctx).Execute()

Purchase - Get Data Plans

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
    resp, r, err := apiClient.GeneralApi.GetDataPlans(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GeneralApi.GetDataPlans``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetDataPlans`: GetDataPlansResponse
    fmt.Fprintf(os.Stdout, "Response from `GeneralApi.GetDataPlans`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetDataPlansRequest struct via the builder pattern


### Return type

[**GetDataPlansResponse**](GetDataPlansResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetNuban

> GeneralGetNubanResponse GetNuban(ctx).BankCode(bankCode).AccountNumber(accountNumber).Execute()

General Resolve NUBAN

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
    bankCode := int32(58) // int32 |  (optional)
    accountNumber := int32(37466959) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GeneralApi.GetNuban(context.Background()).BankCode(bankCode).AccountNumber(accountNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GeneralApi.GetNuban``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetNuban`: GeneralGetNubanResponse
    fmt.Fprintf(os.Stdout, "Response from `GeneralApi.GetNuban`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetNubanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankCode** | **int32** |  | 
 **accountNumber** | **int32** |  | 

### Return type

[**GeneralGetNubanResponse**](GeneralGetNubanResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
    resp, r, err := apiClient.GeneralApi.GetWalletBalance(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GeneralApi.GetWalletBalance``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetWalletBalance`: GetWalletBalanceResponse
    fmt.Fprintf(os.Stdout, "Response from `GeneralApi.GetWalletBalance`: %v\n", resp)
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


## PurchaseAirtime

> PurchaseAirtimeResponse PurchaseAirtime(ctx).PurchaseAirtimeRequest(purchaseAirtimeRequest).Execute()

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
    purchaseAirtimeRequest := *dojah.NewPurchaseAirtimeRequest() // PurchaseAirtimeRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GeneralApi.PurchaseAirtime(context.Background()).PurchaseAirtimeRequest(purchaseAirtimeRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GeneralApi.PurchaseAirtime``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PurchaseAirtime`: PurchaseAirtimeResponse
    fmt.Fprintf(os.Stdout, "Response from `GeneralApi.PurchaseAirtime`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPurchaseAirtimeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseAirtimeRequest** | [**PurchaseAirtimeRequest**](PurchaseAirtimeRequest.md) |  | 

### Return type

[**PurchaseAirtimeResponse**](PurchaseAirtimeResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PurchaseData

> PurchaseDataResponse PurchaseData(ctx).PurchaseDataRequest(purchaseDataRequest).Execute()

Purchase - Buy Data

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
    purchaseDataRequest := *dojah.NewPurchaseDataRequest() // PurchaseDataRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GeneralApi.PurchaseData(context.Background()).PurchaseDataRequest(purchaseDataRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GeneralApi.PurchaseData``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PurchaseData`: PurchaseDataResponse
    fmt.Fprintf(os.Stdout, "Response from `GeneralApi.PurchaseData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPurchaseDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseDataRequest** | [**PurchaseDataRequest**](PurchaseDataRequest.md) |  | 

### Return type

[**PurchaseDataResponse**](PurchaseDataResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

