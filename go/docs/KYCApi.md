# \KYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalyzeDocument**](KYCApi.md#AnalyzeDocument) | **Post** /api/v1/document/analysis | KYC - Document Analysis
[**GetBasicBvn**](KYCApi.md#GetBasicBvn) | **Get** /api/v1/kyc/bvn/basic | KYC - Get Basic BVN Info
[**GetBasicPhoneNumber**](KYCApi.md#GetBasicPhoneNumber) | **Get** /v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic
[**GetDriversLicense**](KYCApi.md#GetDriversLicense) | **Get** /api/v1/kyc/dl | KYC - Get Drivers License Info
[**GetEmailReputation**](KYCApi.md#GetEmailReputation) | **Get** /v1/kyc/email | KYC - Get Email Reputation
[**GetFullBvn**](KYCApi.md#GetFullBvn) | **Get** /api/v1/kyc/bvn/full | KYC - Lookup BVN Basic
[**GetNuban**](KYCApi.md#GetNuban) | **Get** /api/v1/kyc/nuban | KYC - Get NUBAN Information
[**GetPassport**](KYCApi.md#GetPassport) | **Get** /api/v1/kyc/passport | KYC - Passport
[**GetPhoneNumber**](KYCApi.md#GetPhoneNumber) | **Get** /api/v1/kyc/phone_number | KYC - Lookup Phone Number
[**GetPremiumBvn**](KYCApi.md#GetPremiumBvn) | **Get** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium
[**GetVIN**](KYCApi.md#GetVIN) | **Get** /api/v1/kyc/vin | KYC - Get VIN
[**GetVnin**](KYCApi.md#GetVnin) | **Get** /api/v1/kyc/vnin | Lookup VNIN
[**ValidateBvn**](KYCApi.md#ValidateBvn) | **Get** /api/v1/kyc/bvn | KYC - Validate BVN
[**VerifyAge**](KYCApi.md#VerifyAge) | **Get** /v1/kyc/age_verification | KYC - Age Verification
[**VerifySelfieBvn**](KYCApi.md#VerifySelfieBvn) | **Post** /v1/kyc/bvn/verify | KYC - Selfie BVN Verificatoin
[**VerifySelfieNin**](KYCApi.md#VerifySelfieNin) | **Post** /v1/kyc/nin/verify | KYC - Selfie NIN Verification



## AnalyzeDocument

> AnalyzeDocumentResponse AnalyzeDocument(ctx).Execute()

KYC - Document Analysis

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
    resp, r, err := apiClient.KYCApi.AnalyzeDocument(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.AnalyzeDocument``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AnalyzeDocument`: AnalyzeDocumentResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.AnalyzeDocument`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAnalyzeDocumentRequest struct via the builder pattern


### Return type

[**AnalyzeDocumentResponse**](AnalyzeDocumentResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBasicBvn

> GetBasicBvnResponse GetBasicBvn(ctx).Bvn(bvn).Execute()

KYC - Get Basic BVN Info

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
    bvn := int32(22468537919) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetBasicBvn(context.Background()).Bvn(bvn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetBasicBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBasicBvn`: GetBasicBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetBasicBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBasicBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **int32** |  | 

### Return type

[**GetBasicBvnResponse**](GetBasicBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBasicPhoneNumber

> GetBasicPhoneNumberResponse GetBasicPhoneNumber(ctx).PhoneNumber(phoneNumber).Execute()

KYC Lookup Phone Number Basic

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
    phoneNumber := int32(8068810228) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetBasicPhoneNumber(context.Background()).PhoneNumber(phoneNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetBasicPhoneNumber``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBasicPhoneNumber`: GetBasicPhoneNumberResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetBasicPhoneNumber`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBasicPhoneNumberRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **int32** |  | 

### Return type

[**GetBasicPhoneNumberResponse**](GetBasicPhoneNumberResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetDriversLicense

> GetKycDriversLicenseResponse GetDriversLicense(ctx).LicenseNumber(licenseNumber).Execute()

KYC - Get Drivers License Info

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
    licenseNumber := "FKJ49409AB13" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetDriversLicense(context.Background()).LicenseNumber(licenseNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetDriversLicense``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetDriversLicense`: GetKycDriversLicenseResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetDriversLicense`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetDriversLicenseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseNumber** | **string** |  | 

### Return type

[**GetKycDriversLicenseResponse**](GetKycDriversLicenseResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetEmailReputation

> GetEmailReputationResponse GetEmailReputation(ctx).Email(email).Execute()

KYC - Get Email Reputation

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
    email := "johndoe@gmail.com" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetEmailReputation(context.Background()).Email(email).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetEmailReputation``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetEmailReputation`: GetEmailReputationResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetEmailReputation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetEmailReputationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string** |  | 

### Return type

[**GetEmailReputationResponse**](GetEmailReputationResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetFullBvn

> GetFullBvnResponse GetFullBvn(ctx).Bvn(bvn).Execute()

KYC - Lookup BVN Basic

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
    bvn := int32(22222222222) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetFullBvn(context.Background()).Bvn(bvn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetFullBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetFullBvn`: GetFullBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetFullBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetFullBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **int32** |  | 

### Return type

[**GetFullBvnResponse**](GetFullBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetNuban

> GetNubanResponse GetNuban(ctx).BankCode(bankCode).AccountNumber(accountNumber).Execute()

KYC - Get NUBAN Information

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
    accountNumber := int32(11223344) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetNuban(context.Background()).BankCode(bankCode).AccountNumber(accountNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetNuban``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetNuban`: GetNubanResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetNuban`: %v\n", resp)
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

[**GetNubanResponse**](GetNubanResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPassport

> GetKycPassportResponse GetPassport(ctx).PassportNumber(passportNumber).Surname(surname).Execute()

KYC - Passport

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
    passportNumber := int32(70142502085) // int32 |  (optional)
    surname := "ololade" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetPassport(context.Background()).PassportNumber(passportNumber).Surname(surname).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetPassport``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPassport`: GetKycPassportResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetPassport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPassportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passportNumber** | **int32** |  | 
 **surname** | **string** |  | 

### Return type

[**GetKycPassportResponse**](GetKycPassportResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPhoneNumber

> GetPhoneNumberResponse GetPhoneNumber(ctx).PhoneNumber(phoneNumber).Execute()

KYC - Lookup Phone Number

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
    phoneNumber := int32(8011111111) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetPhoneNumber(context.Background()).PhoneNumber(phoneNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetPhoneNumber``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPhoneNumber`: GetPhoneNumberResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetPhoneNumber`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPhoneNumberRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **int32** |  | 

### Return type

[**GetPhoneNumberResponse**](GetPhoneNumberResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPremiumBvn

> GetPremiumBvnResponse GetPremiumBvn(ctx).Bvn(bvn).Execute()

KYC - Lookup BVN Premium

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
    bvn := int32(22305638508) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetPremiumBvn(context.Background()).Bvn(bvn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetPremiumBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPremiumBvn`: GetPremiumBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetPremiumBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPremiumBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **int32** |  | 

### Return type

[**GetPremiumBvnResponse**](GetPremiumBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVIN

> GetVinResponse GetVIN(ctx).Mode(mode).Firstname(firstname).Lastname(lastname).Vin(vin).State(state).Execute()

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
    mode := "vin" // string |  (optional)
    firstname := "moshood" // string |  (optional)
    lastname := "saliu" // string |  (optional)
    vin := int32(55586) // int32 |  (optional)
    state := "ondo" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetVIN(context.Background()).Mode(mode).Firstname(firstname).Lastname(lastname).Vin(vin).State(state).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetVIN``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetVIN`: GetVinResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetVIN`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetVINRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | **string** |  | 
 **firstname** | **string** |  | 
 **lastname** | **string** |  | 
 **vin** | **int32** |  | 
 **state** | **string** |  | 

### Return type

[**GetVinResponse**](GetVinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVnin

> GetVninResponse GetVnin(ctx).Vnin(vnin).Execute()

Lookup VNIN

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
    vnin := "AB012345678910YZ" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.GetVnin(context.Background()).Vnin(vnin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.GetVnin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetVnin`: GetVninResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.GetVnin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetVninRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vnin** | **string** |  | 

### Return type

[**GetVninResponse**](GetVninResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ValidateBvn

> ValidateBvnResponse ValidateBvn(ctx).Bvn(bvn).FirstName(firstName).Dob(dob).Execute()

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
    bvn := int32(22250148240) // int32 |  (optional)
    firstName := "FRANCIS" // string |  (optional)
    dob := "1982-02-19" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.ValidateBvn(context.Background()).Bvn(bvn).FirstName(firstName).Dob(dob).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.ValidateBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ValidateBvn`: ValidateBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.ValidateBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiValidateBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **int32** |  | 
 **firstName** | **string** |  | 
 **dob** | **string** |  | 

### Return type

[**ValidateBvnResponse**](ValidateBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifyAge

> VerifyAgeResponse VerifyAge(ctx).Mode(mode).AccountNumber(accountNumber).BankCode(bankCode).Dob(dob).FirstName(firstName).LastName(lastName).Execute()

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
    mode := "account_number" // string |  (optional)
    accountNumber := int32(3046507407) // int32 |  (optional)
    bankCode := int32(11) // int32 |  (optional)
    dob := "1993-06-10" // string |  (optional)
    firstName := "Mosh" // string |  (optional)
    lastName := "Saliu" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.VerifyAge(context.Background()).Mode(mode).AccountNumber(accountNumber).BankCode(bankCode).Dob(dob).FirstName(firstName).LastName(lastName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.VerifyAge``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifyAge`: VerifyAgeResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.VerifyAge`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifyAgeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | **string** |  | 
 **accountNumber** | **int32** |  | 
 **bankCode** | **int32** |  | 
 **dob** | **string** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 

### Return type

[**VerifyAgeResponse**](VerifyAgeResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifySelfieBvn

> VerifySelfieBvnResponse VerifySelfieBvn(ctx).VerifySelfieBvnRequest(verifySelfieBvnRequest).Execute()

KYC - Selfie BVN Verificatoin

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
    verifySelfieBvnRequest := *dojah.NewVerifySelfieBvnRequest() // VerifySelfieBvnRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.VerifySelfieBvn(context.Background()).VerifySelfieBvnRequest(verifySelfieBvnRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.VerifySelfieBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifySelfieBvn`: VerifySelfieBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.VerifySelfieBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifySelfieBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifySelfieBvnRequest** | [**VerifySelfieBvnRequest**](VerifySelfieBvnRequest.md) |  | 

### Return type

[**VerifySelfieBvnResponse**](VerifySelfieBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifySelfieNin

> VerifySelfieNinResponse VerifySelfieNin(ctx).VerifySelfieNinRequest(verifySelfieNinRequest).Execute()

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
    verifySelfieNinRequest := *dojah.NewVerifySelfieNinRequest() // VerifySelfieNinRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYCApi.VerifySelfieNin(context.Background()).VerifySelfieNinRequest(verifySelfieNinRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYCApi.VerifySelfieNin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifySelfieNin`: VerifySelfieNinResponse
    fmt.Fprintf(os.Stdout, "Response from `KYCApi.VerifySelfieNin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifySelfieNinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifySelfieNinRequest** | [**VerifySelfieNinRequest**](VerifySelfieNinRequest.md) |  | 

### Return type

[**VerifySelfieNinResponse**](VerifySelfieNinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

