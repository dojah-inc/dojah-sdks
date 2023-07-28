# \ZWKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CheckCredit**](ZWKYCApi.md#CheckCredit) | **Get** /api/v1/zw/kyc/fcb | Credit Check
[**VerifyId**](ZWKYCApi.md#VerifyId) | **Get** /api/v1/zw/kyc/nin | National ID Verification



## CheckCredit

> ZwKycCheckCreditResponse CheckCredit(ctx).IdNumber(idNumber).Name(name).Surname(surname).Gender(gender).Dob(dob).MaritalStatus(maritalStatus).MobileNumber(mobileNumber).Execute()

Credit Check

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
    idNumber := ""45190221E45"" // string |  (optional)
    name := ""CHIMUNDEGE"" // string |  (optional)
    surname := ""CHIMUNDEGE"" // string |  (optional)
    gender := ""F"" // string |  (optional)
    dob := ""1994-04-03"" // string |  (optional)
    maritalStatus := ""M"" // string |  (optional)
    mobileNumber := int32(26424257383) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.ZWKYCApi.CheckCredit(context.Background()).IdNumber(idNumber).Name(name).Surname(surname).Gender(gender).Dob(dob).MaritalStatus(maritalStatus).MobileNumber(mobileNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ZWKYCApi.CheckCredit``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CheckCredit`: ZwKycCheckCreditResponse
    fmt.Fprintf(os.Stdout, "Response from `ZWKYCApi.CheckCredit`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCheckCreditRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idNumber** | **string** |  | 
 **name** | **string** |  | 
 **surname** | **string** |  | 
 **gender** | **string** |  | 
 **dob** | **string** |  | 
 **maritalStatus** | **string** |  | 
 **mobileNumber** | **int32** |  | 

### Return type

[**ZwKycCheckCreditResponse**](ZwKycCheckCreditResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifyId

> ZwKycVerifyIdResponse VerifyId(ctx).Id(id).Execute()

National ID Verification

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
    id := ""45190221E45"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.ZWKYCApi.VerifyId(context.Background()).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ZWKYCApi.VerifyId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifyId`: ZwKycVerifyIdResponse
    fmt.Fprintf(os.Stdout, "Response from `ZWKYCApi.VerifyId`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifyIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | 

### Return type

[**ZwKycVerifyIdResponse**](ZwKycVerifyIdResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

