# \AMLApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetScreeningInfo**](AMLApi.md#GetScreeningInfo) | **Get** /v1/aml/screening/info | Get AML Info
[**ScreenAml**](AMLApi.md#ScreenAml) | **Post** /api/v1/aml/screening | AML Screening



## GetScreeningInfo

> GetScreeningInfoResponse GetScreeningInfo(ctx).ReferenceId(referenceId).Execute()

Get AML Info

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
    referenceId := "c574a3c8-dc27-4013-8bbc-462e7ed87d55" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AMLApi.GetScreeningInfo(context.Background()).ReferenceId(referenceId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AMLApi.GetScreeningInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetScreeningInfo`: GetScreeningInfoResponse
    fmt.Fprintf(os.Stdout, "Response from `AMLApi.GetScreeningInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetScreeningInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceId** | **string** |  | 

### Return type

[**GetScreeningInfoResponse**](GetScreeningInfoResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ScreenAml

> ScreenAmlResponse ScreenAml(ctx).Body(body).Execute()

AML Screening

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
    body := map[string]interface{}{ ... } // map[string]interface{} |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AMLApi.ScreenAml(context.Background()).Body(body).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AMLApi.ScreenAml``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ScreenAml`: ScreenAmlResponse
    fmt.Fprintf(os.Stdout, "Response from `AMLApi.ScreenAml`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiScreenAmlRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map[string]interface{}** |  | 

### Return type

[**ScreenAmlResponse**](ScreenAmlResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

