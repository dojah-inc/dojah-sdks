# \VerificationsApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ValidateBvn**](VerificationsApi.md#ValidateBvn) | **Get** /v1/kyc/bvn | KYC - Validate BVN
[**VerifyAge**](VerificationsApi.md#VerifyAge) | **Get** /v1/kyc/age_verification | KYC - Age Verification
[**VerifySelfieBvn**](VerificationsApi.md#VerifySelfieBvn) | **Post** /v1/kyc/bvn/verify | KYV - Selfie BVN Verificatoin
[**VerifySelfieNin**](VerificationsApi.md#VerifySelfieNin) | **Post** /api/v1/kyc/nin/verify | KYC - Selfie NIN Verification
[**VerifySelfieVnin**](VerificationsApi.md#VerifySelfieVnin) | **Post** /api/v1/kyc/vnin/verify | KYC - Selfie vNIN verification



## ValidateBvn

> map[string]interface{} ValidateBvn(ctx).AppId(appId).Bvn(bvn).FirstName(firstName).Dob(dob).Execute()

KYC - Validate BVN

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
    appId := "{{app_id}}" // string |  (optional)
    bvn := int32(22250148240) // int32 |  (optional)
    firstName := "FRANCIS" // string |  (optional)
    dob := "1982-02-19" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.VerificationsApi.ValidateBvn(context.Background()).AppId(appId).Bvn(bvn).FirstName(firstName).Dob(dob).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VerificationsApi.ValidateBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ValidateBvn`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `VerificationsApi.ValidateBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiValidateBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **bvn** | **int32** |  | 
 **firstName** | **string** |  | 
 **dob** | **string** |  | 

### Return type

**map[string]interface{}**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifyAge

> VerifyAgeResponse VerifyAge(ctx).AppId(appId).Mode(mode).AccountNumber(accountNumber).BankCode(bankCode).Dob(dob).FirstName(firstName).LastName(lastName).Execute()

KYC - Age Verification

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
    appId := "{{app_id}}" // string |  (optional)
    mode := "account_number" // string |  (optional)
    accountNumber := int32(3046507407) // int32 |  (optional)
    bankCode := int32(11) // int32 |  (optional)
    dob := "1993-06-10" // string |  (optional)
    firstName := "Mosh" // string |  (optional)
    lastName := "Saliu" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.VerificationsApi.VerifyAge(context.Background()).AppId(appId).Mode(mode).AccountNumber(accountNumber).BankCode(bankCode).Dob(dob).FirstName(firstName).LastName(lastName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VerificationsApi.VerifyAge``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifyAge`: VerifyAgeResponse
    fmt.Fprintf(os.Stdout, "Response from `VerificationsApi.VerifyAge`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifyAgeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **mode** | **string** |  | 
 **accountNumber** | **int32** |  | 
 **bankCode** | **int32** |  | 
 **dob** | **string** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 

### Return type

[**VerifyAgeResponse**](VerifyAgeResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifySelfieBvn

> VerifySelfieBvnResponse VerifySelfieBvn(ctx).VerifySelfieBvnRequest(verifySelfieBvnRequest).AppId(appId).Execute()

KYV - Selfie BVN Verificatoin

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
    verifySelfieBvnRequest := *dojah.NewVerifySelfieBvnRequest() // VerifySelfieBvnRequest | 
    appId := "{{app_id}}" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.VerificationsApi.VerifySelfieBvn(context.Background()).VerifySelfieBvnRequest(verifySelfieBvnRequest).AppId(appId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VerificationsApi.VerifySelfieBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifySelfieBvn`: VerifySelfieBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `VerificationsApi.VerifySelfieBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifySelfieBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifySelfieBvnRequest** | [**VerifySelfieBvnRequest**](VerifySelfieBvnRequest.md) |  | 
 **appId** | **string** |  | 

### Return type

[**VerifySelfieBvnResponse**](VerifySelfieBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifySelfieNin

> map[string]interface{} VerifySelfieNin(ctx).VerificationsVerifySelfieNinRequest(verificationsVerifySelfieNinRequest).AppId(appId).Execute()

KYC - Selfie NIN Verification

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
    verificationsVerifySelfieNinRequest := *dojah.NewVerificationsVerifySelfieNinRequest() // VerificationsVerifySelfieNinRequest | 
    appId := "{{app_id}}" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.VerificationsApi.VerifySelfieNin(context.Background()).VerificationsVerifySelfieNinRequest(verificationsVerifySelfieNinRequest).AppId(appId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VerificationsApi.VerifySelfieNin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifySelfieNin`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `VerificationsApi.VerifySelfieNin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifySelfieNinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verificationsVerifySelfieNinRequest** | [**VerificationsVerifySelfieNinRequest**](VerificationsVerifySelfieNinRequest.md) |  | 
 **appId** | **string** |  | 

### Return type

**map[string]interface{}**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifySelfieVnin

> map[string]interface{} VerifySelfieVnin(ctx).VerificationsVerifySelfieVninRequest(verificationsVerifySelfieVninRequest).AppId(appId).Execute()

KYC - Selfie vNIN verification

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
    verificationsVerifySelfieVninRequest := *dojah.NewVerificationsVerifySelfieVninRequest() // VerificationsVerifySelfieVninRequest | 
    appId := "{{app_id}}" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.VerificationsApi.VerifySelfieVnin(context.Background()).VerificationsVerifySelfieVninRequest(verificationsVerifySelfieVninRequest).AppId(appId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VerificationsApi.VerifySelfieVnin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifySelfieVnin`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `VerificationsApi.VerifySelfieVnin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifySelfieVninRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verificationsVerifySelfieVninRequest** | [**VerificationsVerifySelfieVninRequest**](VerificationsVerifySelfieVninRequest.md) |  | 
 **appId** | **string** |  | 

### Return type

**map[string]interface{}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

