# \GeneralApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBanks**](GeneralApi.md#GetBanks) | **Get** /v1/general/banks | General - Get Banks
[**GetBin**](GeneralApi.md#GetBin) | **Get** /v1/general/bin | General Resolve BIN
[**GetNuban**](GeneralApi.md#GetNuban) | **Get** /api/v1/general/account | General Resolve NUBAN



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

