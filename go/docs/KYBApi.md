# \KYBApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BusinessDetail**](KYBApi.md#BusinessDetail) | **Get** /api/v1/kyb/business/detail | Business Detail
[**BusinessSearch**](KYBApi.md#BusinessSearch) | **Get** /api/v1/kyb/business/search | Business Search
[**GetCac**](KYBApi.md#GetCac) | **Get** /api/v1/kyc/cac | KYC - Get CAC 
[**GetTin**](KYBApi.md#GetTin) | **Get** /api/v1/kyc/tin | KYC - Fetch Tin



## BusinessDetail

> map[string]interface{} BusinessDetail(ctx).AppId(appId).InternationalNumber(internationalNumber).CountryCode(countryCode).Full(full).Execute()

Business Detail

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
    internationalNumber := "RC-1885308" // string |  (optional)
    countryCode := "NG" // string |  (optional)
    full := true // bool |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYBApi.BusinessDetail(context.Background()).AppId(appId).InternationalNumber(internationalNumber).CountryCode(countryCode).Full(full).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYBApi.BusinessDetail``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BusinessDetail`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `KYBApi.BusinessDetail`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBusinessDetailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **internationalNumber** | **string** |  | 
 **countryCode** | **string** |  | 
 **full** | **bool** |  | 

### Return type

**map[string]interface{}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BusinessSearch

> map[string]interface{} BusinessSearch(ctx).AppId(appId).CountryCode(countryCode).Company(company).Execute()

Business Search

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
    countryCode := "NG" // string |  (optional)
    company := int32(1885308) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYBApi.BusinessSearch(context.Background()).AppId(appId).CountryCode(countryCode).Company(company).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYBApi.BusinessSearch``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BusinessSearch`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `KYBApi.BusinessSearch`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBusinessSearchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **countryCode** | **string** |  | 
 **company** | **int32** |  | 

### Return type

**map[string]interface{}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCac

> KybGetCacResponse GetCac(ctx).AppId(appId).RcNumber(rcNumber).CompanyName(companyName).Execute()

KYC - Get CAC 

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
    rcNumber := int32(1432074) // int32 |  (optional)
    companyName := "ELTA SOLUTIONS LIMITED" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYBApi.GetCac(context.Background()).AppId(appId).RcNumber(rcNumber).CompanyName(companyName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYBApi.GetCac``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCac`: KybGetCacResponse
    fmt.Fprintf(os.Stdout, "Response from `KYBApi.GetCac`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetCacRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **rcNumber** | **int32** |  | 
 **companyName** | **string** |  | 

### Return type

[**KybGetCacResponse**](KybGetCacResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTin

> KybGetTinResponse GetTin(ctx).AppId(appId).Tin(tin).Execute()

KYC - Fetch Tin

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
    tin := "24111697-0001" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KYBApi.GetTin(context.Background()).AppId(appId).Tin(tin).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KYBApi.GetTin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetTin`: KybGetTinResponse
    fmt.Fprintf(os.Stdout, "Response from `KYBApi.GetTin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetTinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **tin** | **string** |  | 

### Return type

[**KybGetTinResponse**](KybGetTinResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

