# \DocumentAnalysisApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalyzeDocument**](DocumentAnalysisApi.md#AnalyzeDocument) | **Post** /api/v1/document/analysis | KYC - Document Analysis



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
    resp, r, err := apiClient.DocumentAnalysisApi.AnalyzeDocument(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DocumentAnalysisApi.AnalyzeDocument``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AnalyzeDocument`: AnalyzeDocumentResponse
    fmt.Fprintf(os.Stdout, "Response from `DocumentAnalysisApi.AnalyzeDocument`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAnalyzeDocumentRequest struct via the builder pattern


### Return type

[**AnalyzeDocumentResponse**](AnalyzeDocumentResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

