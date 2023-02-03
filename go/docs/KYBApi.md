# \KYBApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAdvancedCac**](KYBApi.md#GetAdvancedCac) | **Get** /v1/kyc/cac/advance | KYC - Get CAC Advanced
[**GetBasicCac**](KYBApi.md#GetBasicCac) | **Get** /v1/kyc/cac/basic | KYB - Get CAC 2
[**GetCac**](KYBApi.md#GetCac) | **Get** /v1/kyc/cac | KYC - Get CAC 
[**GetTin**](KYBApi.md#GetTin) | **Get** /v1/kyc/tin | KYC - Fetch Tin



## GetAdvancedCac

> GetAdvancedCacResponse GetAdvancedCac(ctx).Rc(rc).Type_(type_).Class(class).Execute()

KYC - Get CAC Advanced

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
    rc := int32(1432074) // int32 |  (optional)
    type_ := "co" // string |  (optional)
    class := "advance" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYBApi.GetAdvancedCac(context.Background()).Rc(rc).Type_(type_).Class(class).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYBApi.GetAdvancedCac``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAdvancedCac`: GetAdvancedCacResponse
    fmt.Fprintf(os.Stdout, "Response from `KYBApi.GetAdvancedCac`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetAdvancedCacRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rc** | **int32** |  | 
 **type_** | **string** |  | 
 **class** | **string** |  | 

### Return type

[**GetAdvancedCacResponse**](GetAdvancedCacResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBasicCac

> GetBasicCacResponse GetBasicCac(ctx).Rc(rc).Type_(type_).Execute()

KYB - Get CAC 2

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
    rc := int32(3330883) // int32 |  (optional)
    type_ := "bn" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYBApi.GetBasicCac(context.Background()).Rc(rc).Type_(type_).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYBApi.GetBasicCac``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBasicCac`: GetBasicCacResponse
    fmt.Fprintf(os.Stdout, "Response from `KYBApi.GetBasicCac`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBasicCacRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rc** | **int32** |  | 
 **type_** | **string** |  | 

### Return type

[**GetBasicCacResponse**](GetBasicCacResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCac

> GetCacResponse GetCac(ctx).RcNumber(rcNumber).CompanyName(companyName).Execute()

KYC - Get CAC 

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
    rcNumber := int32(1432074) // int32 |  (optional)
    companyName := "ELTA SOLUTIONS LIMITED" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYBApi.GetCac(context.Background()).RcNumber(rcNumber).CompanyName(companyName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYBApi.GetCac``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCac`: GetCacResponse
    fmt.Fprintf(os.Stdout, "Response from `KYBApi.GetCac`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetCacRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rcNumber** | **int32** |  | 
 **companyName** | **string** |  | 

### Return type

[**GetCacResponse**](GetCacResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTin

> GetTinResponse GetTin(ctx).Tin(tin).Execute()

KYC - Fetch Tin

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
    tin := "21148119-0001" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYBApi.GetTin(context.Background()).Tin(tin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYBApi.GetTin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetTin`: GetTinResponse
    fmt.Fprintf(os.Stdout, "Response from `KYBApi.GetTin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetTinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tin** | **string** |  | 

### Return type

[**GetTinResponse**](GetTinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

