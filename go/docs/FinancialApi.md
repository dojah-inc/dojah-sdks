# \FinancialApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CollectStatusFromPdf**](FinancialApi.md#CollectStatusFromPdf) | **Post** /api/v1/financial/transactions/pdf | Collect Status via PDF Statement
[**CollectTransactions**](FinancialApi.md#CollectTransactions) | **Post** /v1/financial/transactions | Collect Transactions
[**GetAccount**](FinancialApi.md#GetAccount) | **Get** /api/v1/financial/account_information | Get Account Information
[**GetAccountAnalysis**](FinancialApi.md#GetAccountAnalysis) | **Get** /api/v1/financial/analysis | Get Account Analysis
[**GetAccountSubscriptions**](FinancialApi.md#GetAccountSubscriptions) | **Get** /v1/financial/account_subscription | Get Account Subscriptions
[**GetAccountTransactions**](FinancialApi.md#GetAccountTransactions) | **Get** /api/v1/financial/account_transactions | Get Account Transactions
[**GetBasicBvn**](FinancialApi.md#GetBasicBvn) | **Get** /v1/financial/bvn_information/basic | Get BVN Information Basic
[**GetEarningStructure**](FinancialApi.md#GetEarningStructure) | **Get** /v1/financial/earning_structure | Get Earning Structure
[**GetFullBvn**](FinancialApi.md#GetFullBvn) | **Get** /v1/financial/bvn_information/full | Get BVN Information Full
[**GetSpendingPattern**](FinancialApi.md#GetSpendingPattern) | **Get** /v1/financial/spending_pattern | Get Spending Pattern



## CollectStatusFromPdf

> CollectStatusFromPdfResponse CollectStatusFromPdf(ctx).Statement(statement).BankCode(bankCode).Execute()

Collect Status via PDF Statement

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
    statement := os.NewFile(1234, "some_file") // *os.File |  (optional)
    bankCode := int32(56) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.CollectStatusFromPdf(context.Background()).Statement(statement).BankCode(bankCode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.CollectStatusFromPdf``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CollectStatusFromPdf`: CollectStatusFromPdfResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.CollectStatusFromPdf`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCollectStatusFromPdfRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statement** | ***os.File** |  | 
 **bankCode** | **int32** |  | 

### Return type

[**CollectStatusFromPdfResponse**](CollectStatusFromPdfResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CollectTransactions

> CollectTransactionsResponse CollectTransactions(ctx).CollectTransactionsRequest(collectTransactionsRequest).Execute()

Collect Transactions

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
    collectTransactionsRequest := *dojah.NewCollectTransactionsRequest() // CollectTransactionsRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.CollectTransactions(context.Background()).CollectTransactionsRequest(collectTransactionsRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.CollectTransactions``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CollectTransactions`: CollectTransactionsResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.CollectTransactions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCollectTransactionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectTransactionsRequest** | [**CollectTransactionsRequest**](CollectTransactionsRequest.md) |  | 

### Return type

[**CollectTransactionsResponse**](CollectTransactionsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAccount

> GetAccountResponse GetAccount(ctx).AccountId(accountId).Execute()

Get Account Information



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
    accountId := "d5b86083-08c5-4de2-ac19-7610a16c297d" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.GetAccount(context.Background()).AccountId(accountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.GetAccount``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAccount`: GetAccountResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.GetAccount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAccountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** |  | 

### Return type

[**GetAccountResponse**](GetAccountResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAccountAnalysis

> GetAccountAnalysisResponse GetAccountAnalysis(ctx).Execute()

Get Account Analysis

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

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.GetAccountAnalysis(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.GetAccountAnalysis``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAccountAnalysis`: GetAccountAnalysisResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.GetAccountAnalysis`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetAccountAnalysisRequest struct via the builder pattern


### Return type

[**GetAccountAnalysisResponse**](GetAccountAnalysisResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAccountSubscriptions

> GetAccountSubscriptionsResponse GetAccountSubscriptions(ctx).AccountId(accountId).Execute()

Get Account Subscriptions

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
    accountId := "02f63911-a958-4025-9d72-8bd2d7da274b" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.GetAccountSubscriptions(context.Background()).AccountId(accountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.GetAccountSubscriptions``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAccountSubscriptions`: GetAccountSubscriptionsResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.GetAccountSubscriptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAccountSubscriptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** |  | 

### Return type

[**GetAccountSubscriptionsResponse**](GetAccountSubscriptionsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAccountTransactions

> GetAccountTransactionsResponse GetAccountTransactions(ctx).AccountId(accountId).Length(length).Execute()

Get Account Transactions

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
    accountId := "d5b86083-08c5-4de2-ac19-7610a16c297d" // string |  (optional)
    length := int32(200) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.GetAccountTransactions(context.Background()).AccountId(accountId).Length(length).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.GetAccountTransactions``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAccountTransactions`: GetAccountTransactionsResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.GetAccountTransactions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAccountTransactionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** |  | 
 **length** | **int32** |  | 

### Return type

[**GetAccountTransactionsResponse**](GetAccountTransactionsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBasicBvn

> FinancialGetBasicBvnResponse GetBasicBvn(ctx).AccountId(accountId).Execute()

Get BVN Information Basic

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
    accountId := "34c7a2a10b4d4050869fe6f0aa6f0a30" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.GetBasicBvn(context.Background()).AccountId(accountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.GetBasicBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBasicBvn`: FinancialGetBasicBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.GetBasicBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBasicBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** |  | 

### Return type

[**FinancialGetBasicBvnResponse**](FinancialGetBasicBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetEarningStructure

> GetEarningStructureResponse GetEarningStructure(ctx).AccountId(accountId).Execute()

Get Earning Structure

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
    accountId := "02f63911-a958-4025-9d72-8bd2d7da274b" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.GetEarningStructure(context.Background()).AccountId(accountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.GetEarningStructure``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetEarningStructure`: GetEarningStructureResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.GetEarningStructure`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetEarningStructureRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** |  | 

### Return type

[**GetEarningStructureResponse**](GetEarningStructureResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetFullBvn

> FinancialGetFullBvnResponse GetFullBvn(ctx).AccountId(accountId).Execute()

Get BVN Information Full

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
    accountId := "34c7a2a10b4d4050869fe6f0aa6f0a30" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.GetFullBvn(context.Background()).AccountId(accountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.GetFullBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetFullBvn`: FinancialGetFullBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.GetFullBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetFullBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** |  | 

### Return type

[**FinancialGetFullBvnResponse**](FinancialGetFullBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSpendingPattern

> GetSpendingPatternResponse GetSpendingPattern(ctx).AccountId(accountId).Execute()

Get Spending Pattern

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
    accountId := "02f63911-a958-4025-9d72-8bd2d7da274b" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FinancialApi.GetSpendingPattern(context.Background()).AccountId(accountId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FinancialApi.GetSpendingPattern``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSpendingPattern`: GetSpendingPatternResponse
    fmt.Fprintf(os.Stdout, "Response from `FinancialApi.GetSpendingPattern`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetSpendingPatternRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** |  | 

### Return type

[**GetSpendingPatternResponse**](GetSpendingPatternResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

