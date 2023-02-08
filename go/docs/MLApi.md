# \MLApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDocumentAnalysis**](MLApi.md#GetDocumentAnalysis) | **Post** /v1/document/analysis/dl | Document Analysis Drivers License
[**GetGenericOcrText**](MLApi.md#GetGenericOcrText) | **Post** /v1/ml/ocr/generic | Generic OCR Service
[**GetOcrText**](MLApi.md#GetOcrText) | **Post** /v1/ml/ocr | BVN Ocr
[**VerifyPhotoIdWithSelfie**](MLApi.md#VerifyPhotoIdWithSelfie) | **Post** /v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification



## GetDocumentAnalysis

> GetDocumentAnalysisResponse GetDocumentAnalysis(ctx).GetDocumentAnalysisRequest(getDocumentAnalysisRequest).Execute()

Document Analysis Drivers License

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
    getDocumentAnalysisRequest := *dojah.NewGetDocumentAnalysisRequest() // GetDocumentAnalysisRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.MLApi.GetDocumentAnalysis(context.Background()).GetDocumentAnalysisRequest(getDocumentAnalysisRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MLApi.GetDocumentAnalysis``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetDocumentAnalysis`: GetDocumentAnalysisResponse
    fmt.Fprintf(os.Stdout, "Response from `MLApi.GetDocumentAnalysis`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetDocumentAnalysisRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDocumentAnalysisRequest** | [**GetDocumentAnalysisRequest**](GetDocumentAnalysisRequest.md) |  | 

### Return type

[**GetDocumentAnalysisResponse**](GetDocumentAnalysisResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetGenericOcrText

> GetGenericOcrTextResponse GetGenericOcrText(ctx).GetGenericOcrTextRequest(getGenericOcrTextRequest).Execute()

Generic OCR Service

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
    getGenericOcrTextRequest := *dojah.NewGetGenericOcrTextRequest() // GetGenericOcrTextRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.MLApi.GetGenericOcrText(context.Background()).GetGenericOcrTextRequest(getGenericOcrTextRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MLApi.GetGenericOcrText``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetGenericOcrText`: GetGenericOcrTextResponse
    fmt.Fprintf(os.Stdout, "Response from `MLApi.GetGenericOcrText`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetGenericOcrTextRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getGenericOcrTextRequest** | [**GetGenericOcrTextRequest**](GetGenericOcrTextRequest.md) |  | 

### Return type

[**GetGenericOcrTextResponse**](GetGenericOcrTextResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOcrText

> GetOcrTextResponse GetOcrText(ctx).GetOcrTextRequest(getOcrTextRequest).Execute()

BVN Ocr

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
    getOcrTextRequest := *dojah.NewGetOcrTextRequest() // GetOcrTextRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.MLApi.GetOcrText(context.Background()).GetOcrTextRequest(getOcrTextRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MLApi.GetOcrText``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetOcrText`: GetOcrTextResponse
    fmt.Fprintf(os.Stdout, "Response from `MLApi.GetOcrText`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetOcrTextRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getOcrTextRequest** | [**GetOcrTextRequest**](GetOcrTextRequest.md) |  | 

### Return type

[**GetOcrTextResponse**](GetOcrTextResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifyPhotoIdWithSelfie

> VerifyPhotoIdWithSelfieResponse VerifyPhotoIdWithSelfie(ctx).VerifyPhotoIdWithSelfieRequest(verifyPhotoIdWithSelfieRequest).Execute()

KYC - Selfie Photo ID Verification

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
    verifyPhotoIdWithSelfieRequest := *dojah.NewVerifyPhotoIdWithSelfieRequest() // VerifyPhotoIdWithSelfieRequest |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.MLApi.VerifyPhotoIdWithSelfie(context.Background()).VerifyPhotoIdWithSelfieRequest(verifyPhotoIdWithSelfieRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MLApi.VerifyPhotoIdWithSelfie``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifyPhotoIdWithSelfie`: VerifyPhotoIdWithSelfieResponse
    fmt.Fprintf(os.Stdout, "Response from `MLApi.VerifyPhotoIdWithSelfie`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifyPhotoIdWithSelfieRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyPhotoIdWithSelfieRequest** | [**VerifyPhotoIdWithSelfieRequest**](VerifyPhotoIdWithSelfieRequest.md) |  | 

### Return type

[**VerifyPhotoIdWithSelfieResponse**](VerifyPhotoIdWithSelfieResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

