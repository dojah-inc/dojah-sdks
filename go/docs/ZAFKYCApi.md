# \ZAFKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetId**](ZAFKYCApi.md#GetId) | **Get** /api/v1/za/kyc/id | KYC - Lookup ID



## GetId

> ZafKycGetIdResponse GetId(ctx).IdNumber(idNumber).Execute()

KYC - Lookup ID

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
    idNumber := int32(9910180077084) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.ZAFKYCApi.GetId(context.Background()).IdNumber(idNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ZAFKYCApi.GetId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetId`: ZafKycGetIdResponse
    fmt.Fprintf(os.Stdout, "Response from `ZAFKYCApi.GetId`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idNumber** | **int32** |  | 

### Return type

[**ZafKycGetIdResponse**](ZafKycGetIdResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

