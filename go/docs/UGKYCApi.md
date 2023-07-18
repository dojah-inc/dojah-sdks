# \UGKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetVoter**](UGKYCApi.md#GetVoter) | **Get** /api/v1/ug/kyc/voter | Voters ID



## GetVoter

> map[string]interface{} GetVoter(ctx).AppId(appId).Id(id).FirstName(firstName).LastName(lastName).Execute()

Voters ID

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
    id := int32(67335751) // int32 |  (optional)
    firstName := "Happy" // string |  (optional)
    lastName := "Christmas" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.UGKYCApi.GetVoter(context.Background()).AppId(appId).Id(id).FirstName(firstName).LastName(lastName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UGKYCApi.GetVoter``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetVoter`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `UGKYCApi.GetVoter`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetVoterRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **id** | **int32** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 

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

