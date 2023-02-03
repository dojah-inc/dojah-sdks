# \KEKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetNationalId**](KEKYCApi.md#GetNationalId) | **Get** /api/v1/ke/kyc/id | KYC - National ID



## GetNationalId

> GetNationalIdResponse GetNationalId(ctx).Id(id).FirstName(firstName).LastName(lastName).MiddleName(middleName).DateOfBirth(dateOfBirth).Gender(gender).Execute()

KYC - National ID

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
    id := int32(24798402) // int32 |  (optional)
    firstName := "ZEDEKIAH" // string |  (optional)
    lastName := "ANDENGA" // string |  (optional)
    middleName := "middleName_example" // string |  (optional)
    dateOfBirth := "1985-12-29" // string |  (optional)
    gender := "M" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.KEKYCApi.GetNationalId(context.Background()).Id(id).FirstName(firstName).LastName(lastName).MiddleName(middleName).DateOfBirth(dateOfBirth).Gender(gender).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `KEKYCApi.GetNationalId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetNationalId`: GetNationalIdResponse
    fmt.Fprintf(os.Stdout, "Response from `KEKYCApi.GetNationalId`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetNationalIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int32** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 
 **middleName** | **string** |  | 
 **dateOfBirth** | **string** |  | 
 **gender** | **string** |  | 

### Return type

[**GetNationalIdResponse**](GetNationalIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

