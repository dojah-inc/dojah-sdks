# \KYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CheckLiveness**](KYCApi.md#CheckLiveness) | **Post** /api/v1/ml/liveness | Liveness Check
[**GetAccounts**](KYCApi.md#GetAccounts) | **Get** /api/v1/kyc/accounts | KYC - Fetch Accounts 
[**GetAddressVerification**](KYCApi.md#GetAddressVerification) | **Get** /api/v1/kyc/address | Fetch Address Verification Data
[**GetBvnFromNuban**](KYCApi.md#GetBvnFromNuban) | **Get** /api/v1/kyc/nuban/bvn | Lookup BVN from NUBAN
[**GetVin**](KYCApi.md#GetVin) | **Get** /api/v1/kyc/vin | KYC - Get VIN
[**SubmitAddress**](KYCApi.md#SubmitAddress) | **Post** /api/v1/kyc/address | Submit Address



## CheckLiveness

> map[string]interface{} CheckLiveness(ctx).KycCheckLivenessRequest(kycCheckLivenessRequest).Execute()

Liveness Check

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
    kycCheckLivenessRequest := *dojah.NewKycCheckLivenessRequest() // KycCheckLivenessRequest | 

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.CheckLiveness(context.Background()).KycCheckLivenessRequest(kycCheckLivenessRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.CheckLiveness``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CheckLiveness`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.CheckLiveness`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCheckLivenessRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kycCheckLivenessRequest** | [**KycCheckLivenessRequest**](KycCheckLivenessRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAccounts

> map[string]interface{} GetAccounts(ctx).Bvn(bvn).Execute()

KYC - Fetch Accounts 

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
    bvn := ""22342291445 "" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetAccounts(context.Background()).Bvn(bvn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetAccounts``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAccounts`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetAccounts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **string** |  | 

### Return type

**map[string]interface{}**

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAddressVerification

> map[string]interface{} GetAddressVerification(ctx).ReferenceId(referenceId).Execute()

Fetch Address Verification Data

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
    referenceId := ""69e10264-4b90-64fe-b4b7-c9dddafd0241"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetAddressVerification(context.Background()).ReferenceId(referenceId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetAddressVerification``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAddressVerification`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetAddressVerification`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAddressVerificationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceId** | **string** |  | 

### Return type

**map[string]interface{}**

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBvnFromNuban

> map[string]interface{} GetBvnFromNuban(ctx).BankCode(bankCode).AccountNumber(accountNumber).Execute()

Lookup BVN from NUBAN

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
    bankCode := int32(57) // int32 |  (optional)
    accountNumber := int32(2174879334) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetBvnFromNuban(context.Background()).BankCode(bankCode).AccountNumber(accountNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetBvnFromNuban``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBvnFromNuban`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetBvnFromNuban`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBvnFromNubanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankCode** | **int32** |  | 
 **accountNumber** | **int32** |  | 

### Return type

**map[string]interface{}**

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVin

> GetVinResponse GetVin(ctx).Vin(vin).Execute()

KYC - Get VIN

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
    vin := ""90F5B20205096041114"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetVin(context.Background()).Vin(vin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetVin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetVin`: GetVinResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetVin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetVinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **string** |  | 

### Return type

[**GetVinResponse**](GetVinResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth), [noauthAuth](../README.md#noauthAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SubmitAddress

> KycSubmitAddressResponse SubmitAddress(ctx).KycSubmitAddressRequest(kycSubmitAddressRequest).Execute()

Submit Address

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
    kycSubmitAddressRequest := *dojah.NewKycSubmitAddressRequest() // KycSubmitAddressRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.SubmitAddress(context.Background()).KycSubmitAddressRequest(kycSubmitAddressRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.SubmitAddress``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SubmitAddress`: KycSubmitAddressResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.SubmitAddress`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSubmitAddressRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kycSubmitAddressRequest** | [**KycSubmitAddressRequest**](KycSubmitAddressRequest.md) |  | 

### Return type

[**KycSubmitAddressResponse**](KycSubmitAddressResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

