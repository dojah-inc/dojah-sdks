# \WalletApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateWallet**](WalletApi.md#CreateWallet) | **Post** /v1/wallet/ngn/create | Create NGN Wallet
[**CreditSubwallet**](WalletApi.md#CreditSubwallet) | **Post** /v1/wallet/ngn/credit | Credit Sub-wallet
[**GetTransaction**](WalletApi.md#GetTransaction) | **Get** /v1/wallet/ngn/transaction | Retrieve Transaction Details
[**GetWallet**](WalletApi.md#GetWallet) | **Get** /v1/wallet/ngn/retrieve | Retrieve Wallet Details
[**GetWallets**](WalletApi.md#GetWallets) | **Get** /v1/wallet/ngn/accounts | Get Wallets
[**TransferFunds**](WalletApi.md#TransferFunds) | **Post** /v1/wallet/ngn/transfer | Transfer Funds



## CreateWallet

> CreateWalletResponse CreateWallet(ctx).CreateWalletRequest(createWalletRequest).Execute()

Create NGN Wallet

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
    createWalletRequest := *dojah.NewCreateWalletRequest() // CreateWalletRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.WalletApi.CreateWallet(context.Background()).CreateWalletRequest(createWalletRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletApi.CreateWallet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateWallet`: CreateWalletResponse
    fmt.Fprintf(os.Stdout, "Response from `WalletApi.CreateWallet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateWalletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWalletRequest** | [**CreateWalletRequest**](CreateWalletRequest.md) |  | 

### Return type

[**CreateWalletResponse**](CreateWalletResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreditSubwallet

> CreditSubwalletResponse CreditSubwallet(ctx).CreditSubwalletRequest(creditSubwalletRequest).Execute()

Credit Sub-wallet

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
    creditSubwalletRequest := *dojah.NewCreditSubwalletRequest() // CreditSubwalletRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.WalletApi.CreditSubwallet(context.Background()).CreditSubwalletRequest(creditSubwalletRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletApi.CreditSubwallet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreditSubwallet`: CreditSubwalletResponse
    fmt.Fprintf(os.Stdout, "Response from `WalletApi.CreditSubwallet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreditSubwalletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditSubwalletRequest** | [**CreditSubwalletRequest**](CreditSubwalletRequest.md) |  | 

### Return type

[**CreditSubwalletResponse**](CreditSubwalletResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTransaction

> GetTransactionResponse GetTransaction(ctx).TransactionId(transactionId).Execute()

Retrieve Transaction Details

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
    transactionId := "Dojah-c02585e5-9a8b-4230-8c1b-11fd2869f4ce" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.WalletApi.GetTransaction(context.Background()).TransactionId(transactionId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletApi.GetTransaction``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetTransaction`: GetTransactionResponse
    fmt.Fprintf(os.Stdout, "Response from `WalletApi.GetTransaction`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetTransactionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **string** |  | 

### Return type

[**GetTransactionResponse**](GetTransactionResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetWallet

> GetWalletResponse GetWallet(ctx).WalletId(walletId).Execute()

Retrieve Wallet Details

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
    walletId := "694a047f-fb99-46d7-8c3c-d655716a834a" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.WalletApi.GetWallet(context.Background()).WalletId(walletId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletApi.GetWallet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetWallet`: GetWalletResponse
    fmt.Fprintf(os.Stdout, "Response from `WalletApi.GetWallet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetWalletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **string** |  | 

### Return type

[**GetWalletResponse**](GetWalletResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetWallets

> GetWalletsResponse GetWallets(ctx).AppId(appId).Execute()

Get Wallets

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
    appId := "{{app_id}}" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.WalletApi.GetWallets(context.Background()).AppId(appId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletApi.GetWallets``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetWallets`: GetWalletsResponse
    fmt.Fprintf(os.Stdout, "Response from `WalletApi.GetWallets`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetWalletsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 

### Return type

[**GetWalletsResponse**](GetWalletsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TransferFunds

> TransferFundsResponse TransferFunds(ctx).TransferFundsRequest(transferFundsRequest).Execute()

Transfer Funds

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
    transferFundsRequest := *dojah.NewTransferFundsRequest() // TransferFundsRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.WalletApi.TransferFunds(context.Background()).TransferFundsRequest(transferFundsRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletApi.TransferFunds``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `TransferFunds`: TransferFundsResponse
    fmt.Fprintf(os.Stdout, "Response from `WalletApi.TransferFunds`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTransferFundsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferFundsRequest** | [**TransferFundsRequest**](TransferFundsRequest.md) |  | 

### Return type

[**TransferFundsResponse**](TransferFundsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

