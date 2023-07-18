# \NigeriaKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBasicBvn**](NigeriaKYCApi.md#GetBasicBvn) | **Get** /api/v1/kyc/bvn | KYC - Get Basic BVN Info
[**GetBasicBvn1**](NigeriaKYCApi.md#GetBasicBvn1) | **Get** /api/v1/kyc/bvn/basic | KYC - Lookup BVN Basic 1
[**GetBasicPhoneNumber**](NigeriaKYCApi.md#GetBasicPhoneNumber) | **Get** /api/v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic
[**GetDriversLicense**](NigeriaKYCApi.md#GetDriversLicense) | **Get** /api/v1/kyc/dl | KYC - Get Drivers License Info
[**GetNin**](NigeriaKYCApi.md#GetNin) | **Get** /api/v1/kyc/nin | KYC - Get NIN Info
[**GetNormalBvn**](NigeriaKYCApi.md#GetNormalBvn) | **Get** /api/v1/kyc/bvn/full | KYC - Lookup BVN Normal
[**GetNuban**](NigeriaKYCApi.md#GetNuban) | **Get** /api/v1/kyc/nuban | KYC - Get NUBAN Information
[**GetPassport**](NigeriaKYCApi.md#GetPassport) | **Get** /api/v1/kyc/passport | KYC - Passport
[**GetPhoneNumber**](NigeriaKYCApi.md#GetPhoneNumber) | **Get** /api/v1/kyc/phone_number | KYC - Lookup Phone Number
[**GetPremiumBvn**](NigeriaKYCApi.md#GetPremiumBvn) | **Get** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium
[**GetVnin**](NigeriaKYCApi.md#GetVnin) | **Get** /api/v1/kyc/vnin | Lookup VNIN



## GetBasicBvn

> ValidateBvnResponse GetBasicBvn(ctx).AppId(appId).Bvn(bvn).Execute()

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
    appId := "{{app_id}}" // string |  (optional)
    bvn := int32(22468537919) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetBasicBvn(context.Background()).AppId(appId).Bvn(bvn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetBasicBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBasicBvn`: ValidateBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetBasicBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBasicBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **bvn** | **int32** |  | 

### Return type

[**ValidateBvnResponse**](ValidateBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBasicBvn1

> GetBasicBvnResponse GetBasicBvn1(ctx).AppId(appId).Bvn(bvn).Execute()

KYC - Lookup BVN Basic 1

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
    bvn := int32(22621998885) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetBasicBvn1(context.Background()).AppId(appId).Bvn(bvn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetBasicBvn1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBasicBvn1`: GetBasicBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetBasicBvn1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBasicBvn1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **bvn** | **int32** |  | 

### Return type

[**GetBasicBvnResponse**](GetBasicBvnResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBasicPhoneNumber

> map[string]interface{} GetBasicPhoneNumber(ctx).AppId(appId).PhoneNumber(phoneNumber).Execute()

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
    appId := "{{app_id}}" // string |  (optional)
    phoneNumber := int32(9131377829) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetBasicPhoneNumber(context.Background()).AppId(appId).PhoneNumber(phoneNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetBasicPhoneNumber``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBasicPhoneNumber`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetBasicPhoneNumber`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBasicPhoneNumberRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **phoneNumber** | **int32** |  | 

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


## GetDriversLicense

> GetKycDriversLicenseResponse GetDriversLicense(ctx).AppId(appId).LicenseNumber(licenseNumber).Execute()

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
    appId := "{{app_id}}" // string |  (optional)
    licenseNumber := "FKJ49409AB13" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetDriversLicense(context.Background()).AppId(appId).LicenseNumber(licenseNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetDriversLicense``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetDriversLicense`: GetKycDriversLicenseResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetDriversLicense`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetDriversLicenseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **licenseNumber** | **string** |  | 

### Return type

[**GetKycDriversLicenseResponse**](GetKycDriversLicenseResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetNin

> NigeriaKycGetNinResponse GetNin(ctx).AppId(appId).Nin(nin).Execute()

KYC - Get NIN Info

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
    nin := int32(55648152772) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetNin(context.Background()).AppId(appId).Nin(nin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetNin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetNin`: NigeriaKycGetNinResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetNin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetNinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **nin** | **int32** |  | 

### Return type

[**NigeriaKycGetNinResponse**](NigeriaKycGetNinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetNormalBvn

> GetFullBvnResponse GetNormalBvn(ctx).AppId(appId).Bvn(bvn).Execute()

KYC - Lookup BVN Normal

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
    bvn := int32(22342291445) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetNormalBvn(context.Background()).AppId(appId).Bvn(bvn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetNormalBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetNormalBvn`: GetFullBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetNormalBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetNormalBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **bvn** | **int32** |  | 

### Return type

[**GetFullBvnResponse**](GetFullBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetNuban

> GetNubanResponse GetNuban(ctx).AppId(appId).BankCode(bankCode).AccountNumber(accountNumber).Execute()

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
    appId := "{{app_id}}" // string |  (optional)
    bankCode := int32(58) // int32 |  (optional)
    accountNumber := int32(11223344) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetNuban(context.Background()).AppId(appId).BankCode(bankCode).AccountNumber(accountNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetNuban``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetNuban`: GetNubanResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetNuban`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetNubanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **bankCode** | **int32** |  | 
 **accountNumber** | **int32** |  | 

### Return type

[**GetNubanResponse**](GetNubanResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

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
    passportNumber := "B00671500" // string |  (optional)
    surname := "adekanmi" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetPassport(context.Background()).PassportNumber(passportNumber).Surname(surname).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetPassport``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPassport`: GetKycPassportResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetPassport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPassportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passportNumber** | **string** |  | 
 **surname** | **string** |  | 

### Return type

[**GetKycPassportResponse**](GetKycPassportResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPhoneNumber

> GetPhoneNumberResponse GetPhoneNumber(ctx).AppId(appId).PhoneNumber(phoneNumber).Execute()

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
    appId := "{{app_id}}" // string |  (optional)
    phoneNumber := int32(8034628633) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetPhoneNumber(context.Background()).AppId(appId).PhoneNumber(phoneNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetPhoneNumber``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPhoneNumber`: GetPhoneNumberResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetPhoneNumber`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPhoneNumberRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **phoneNumber** | **int32** |  | 

### Return type

[**GetPhoneNumberResponse**](GetPhoneNumberResponse.md)

### Authorization

[noauthAuth](../README.md#noauthAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPremiumBvn

> GetPremiumBvnResponse GetPremiumBvn(ctx).AppId(appId).Bvn(bvn).Execute()

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
    appId := "{{app_id}}" // string |  (optional)
    bvn := int32(22200508254) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetPremiumBvn(context.Background()).AppId(appId).Bvn(bvn).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetPremiumBvn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPremiumBvn`: GetPremiumBvnResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetPremiumBvn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPremiumBvnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **bvn** | **int32** |  | 

### Return type

[**GetPremiumBvnResponse**](GetPremiumBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVnin

> GetVninResponse GetVnin(ctx).AppId(appId).Vnin(vnin).Execute()

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
    appId := "{{app_id}}" // string |  (optional)
    vnin := "LC829995256998RD" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.NigeriaKYCApi.GetVnin(context.Background()).AppId(appId).Vnin(vnin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `NigeriaKYCApi.GetVnin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetVnin`: GetVninResponse
    fmt.Fprintf(os.Stdout, "Response from `NigeriaKYCApi.GetVnin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetVninRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **vnin** | **string** |  | 

### Return type

[**GetVninResponse**](GetVninResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

