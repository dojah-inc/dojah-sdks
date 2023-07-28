# \MLApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VerifyPhotoIdWithSelfie**](MLApi.md#VerifyPhotoIdWithSelfie) | **Post** /api/v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification



## VerifyPhotoIdWithSelfie

> map[string]interface{} VerifyPhotoIdWithSelfie(ctx).MlVerifyPhotoIdWithSelfieRequest(mlVerifyPhotoIdWithSelfieRequest).Execute()

KYC - Selfie Photo ID Verification

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
    mlVerifyPhotoIdWithSelfieRequest := *dojah.NewMlVerifyPhotoIdWithSelfieRequest() // MlVerifyPhotoIdWithSelfieRequest | 

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.MLApi.VerifyPhotoIdWithSelfie(context.Background()).MlVerifyPhotoIdWithSelfieRequest(mlVerifyPhotoIdWithSelfieRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MLApi.VerifyPhotoIdWithSelfie``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifyPhotoIdWithSelfie`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `MLApi.VerifyPhotoIdWithSelfie`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifyPhotoIdWithSelfieRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mlVerifyPhotoIdWithSelfieRequest** | [**MlVerifyPhotoIdWithSelfieRequest**](MlVerifyPhotoIdWithSelfieRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

