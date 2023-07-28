# \GHKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDriversLicense**](GHKYCApi.md#GetDriversLicense) | **Get** /api/v1/gh/kyc/dl | Driver&#39;s License
[**GetPassport**](GHKYCApi.md#GetPassport) | **Get** /api/v1/gh/kyc/passport | Passport
[**GetSsnit**](GHKYCApi.md#GetSsnit) | **Get** /api/v1/gh/kyc/ssnit | SSNIT
[**GetVoter**](GHKYCApi.md#GetVoter) | **Get** /api/v1/gh/kyc/voter | Voter ID Lookup



## GetDriversLicense

> GetDriversLicenseResponse GetDriversLicense(ctx).Id(id).FullName(fullName).DateOfBirth(dateOfBirth).Execute()

Driver's License

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
    id := ""V0000000"" // string |  (optional)
    fullName := ""John Doe"" // string |  (optional)
    dateOfBirth := ""1988-09-01"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GHKYCApi.GetDriversLicense(context.Background()).Id(id).FullName(fullName).DateOfBirth(dateOfBirth).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GHKYCApi.GetDriversLicense``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetDriversLicense`: GetDriversLicenseResponse
    fmt.Fprintf(os.Stdout, "Response from `GHKYCApi.GetDriversLicense`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetDriversLicenseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | 
 **fullName** | **string** |  | 
 **dateOfBirth** | **string** |  | 

### Return type

[**GetDriversLicenseResponse**](GetDriversLicenseResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPassport

> GetPassportResponse GetPassport(ctx).Id(id).FirstName(firstName).LastName(lastName).MiddleName(middleName).DateOfBirth(dateOfBirth).Execute()

Passport

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
    id := ""G111235468"" // string |  (optional)
    firstName := ""John"" // string |  (optional)
    lastName := ""Doe"" // string |  (optional)
    middleName := ""Jack"" // string |  (optional)
    dateOfBirth := ""1990-04-05"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GHKYCApi.GetPassport(context.Background()).Id(id).FirstName(firstName).LastName(lastName).MiddleName(middleName).DateOfBirth(dateOfBirth).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GHKYCApi.GetPassport``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPassport`: GetPassportResponse
    fmt.Fprintf(os.Stdout, "Response from `GHKYCApi.GetPassport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPassportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 
 **middleName** | **string** |  | 
 **dateOfBirth** | **string** |  | 

### Return type

[**GetPassportResponse**](GetPassportResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSsnit

> GetSsnitResponse GetSsnit(ctx).Id(id).FullName(fullName).DateOfBirth(dateOfBirth).Execute()

SSNIT

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
    id := ""G0000000"" // string |  (optional)
    fullName := ""John Doe"" // string |  (optional)
    dateOfBirth := ""1990-04-05"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GHKYCApi.GetSsnit(context.Background()).Id(id).FullName(fullName).DateOfBirth(dateOfBirth).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GHKYCApi.GetSsnit``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSsnit`: GetSsnitResponse
    fmt.Fprintf(os.Stdout, "Response from `GHKYCApi.GetSsnit`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetSsnitRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | 
 **fullName** | **string** |  | 
 **dateOfBirth** | **string** |  | 

### Return type

[**GetSsnitResponse**](GetSsnitResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVoter

> map[string]interface{} GetVoter(ctx).Id(id).FullName(fullName).IsNewId(isNewId).Execute()

Voter ID Lookup

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
    id := int32(6423007613) // int32 |  (optional)
    fullName := ""John Doe"" // string |  (optional)
    isNewId := false // bool |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GHKYCApi.GetVoter(context.Background()).Id(id).FullName(fullName).IsNewId(isNewId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GHKYCApi.GetVoter``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetVoter`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `GHKYCApi.GetVoter`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetVoterRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int32** |  | 
 **fullName** | **string** |  | 
 **isNewId** | **bool** |  | 

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

