# \TZKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetNin**](TZKYCApi.md#GetNin) | **Get** /api/v1/tz/kyc/nin | Lookup TZ NIN



## GetNin

> map[string]interface{} GetNin(ctx).AppId(appId).FirstName(firstName).LastName(lastName).DateOfBirth(dateOfBirth).MothersLastName(mothersLastName).MothersFirstName(mothersFirstName).Execute()

Lookup TZ NIN

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
    firstName := "khafsa" // string |  (optional)
    lastName := "mohammed" // string |  (optional)
    dateOfBirth := "1994-01-11" // string |  (optional)
    mothersLastName := "zulekha" // string |  (optional)
    mothersFirstName := "kassim" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.TZKYCApi.GetNin(context.Background()).AppId(appId).FirstName(firstName).LastName(lastName).DateOfBirth(dateOfBirth).MothersLastName(mothersLastName).MothersFirstName(mothersFirstName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TZKYCApi.GetNin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetNin`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `TZKYCApi.GetNin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetNinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 
 **dateOfBirth** | **string** |  | 
 **mothersLastName** | **string** |  | 
 **mothersFirstName** | **string** |  | 

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

