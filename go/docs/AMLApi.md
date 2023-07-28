# \AMLApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetScreeningInfo**](AMLApi.md#GetScreeningInfo) | **Get** /api/v1/aml/screening/info | Get AML Info
[**ScreenAml**](AMLApi.md#ScreenAml) | **Post** /api/v1/aml/screening/platform | AML Screening



## GetScreeningInfo

> map[string]interface{} GetScreeningInfo(ctx).ProfileId(profileId).Execute()

Get AML Info

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
    profileId := ""WC7117469"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AMLApi.GetScreeningInfo(context.Background()).ProfileId(profileId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AMLApi.GetScreeningInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetScreeningInfo`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `AMLApi.GetScreeningInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetScreeningInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **string** |  | 

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


## ScreenAml

> AmlScreenAmlResponse ScreenAml(ctx).AmlScreenAmlRequest(amlScreenAmlRequest).Execute()

AML Screening

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
    amlScreenAmlRequest := *dojah.NewAmlScreenAmlRequest() // AmlScreenAmlRequest | 

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AMLApi.ScreenAml(context.Background()).AmlScreenAmlRequest(amlScreenAmlRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AMLApi.ScreenAml``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ScreenAml`: AmlScreenAmlResponse
    fmt.Fprintf(os.Stdout, "Response from `AMLApi.ScreenAml`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiScreenAmlRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amlScreenAmlRequest** | [**AmlScreenAmlRequest**](AmlScreenAmlRequest.md) |  | 

### Return type

[**AmlScreenAmlResponse**](AmlScreenAmlResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

