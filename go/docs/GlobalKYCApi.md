# \GlobalKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CaEkyc**](GlobalKYCApi.md#CaEkyc) | **Get** /api/v1/ca/kyc | Canada Ekyc
[**GetUsSsn**](GlobalKYCApi.md#GetUsSsn) | **Get** /api/v1/us/kyc | US SSN
[**UkTwoPlusTwo**](GlobalKYCApi.md#UkTwoPlusTwo) | **Get** /api/v1/uk/kyc | UK 2+2



## CaEkyc

> map[string]interface{} CaEkyc(ctx).AppId(appId).Country(country).FirstName(firstName).LastName(lastName).StreetName(streetName).DateOfBirth(dateOfBirth).HouseNumber(houseNumber).PostCode(postCode).Execute()

Canada Ekyc

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
    country := "GBR" // string |  (optional)
    firstName := "Tobi" // string |  (optional)
    lastName := "Ololade" // string |  (optional)
    streetName := "Street 1" // string |  (optional)
    dateOfBirth := "1992-05-18" // string |  (optional)
    houseNumber := int32(25) // int32 |  (optional)
    postCode := int32(1234) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GlobalKYCApi.CaEkyc(context.Background()).AppId(appId).Country(country).FirstName(firstName).LastName(lastName).StreetName(streetName).DateOfBirth(dateOfBirth).HouseNumber(houseNumber).PostCode(postCode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GlobalKYCApi.CaEkyc``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CaEkyc`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `GlobalKYCApi.CaEkyc`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCaEkycRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **country** | **string** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 
 **streetName** | **string** |  | 
 **dateOfBirth** | **string** |  | 
 **houseNumber** | **int32** |  | 
 **postCode** | **int32** |  | 

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


## GetUsSsn

> map[string]interface{} GetUsSsn(ctx).AppId(appId).Country(country).FirstName(firstName).LastName(lastName).StreetName(streetName).DateOfBirth(dateOfBirth).HouseNumber(houseNumber).PostCode(postCode).Execute()

US SSN

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
    country := "GBR" // string |  (optional)
    firstName := "Tobi" // string |  (optional)
    lastName := "Ololade" // string |  (optional)
    streetName := "Street 1" // string |  (optional)
    dateOfBirth := "1992-05-18" // string |  (optional)
    houseNumber := int32(25) // int32 |  (optional)
    postCode := int32(1234) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GlobalKYCApi.GetUsSsn(context.Background()).AppId(appId).Country(country).FirstName(firstName).LastName(lastName).StreetName(streetName).DateOfBirth(dateOfBirth).HouseNumber(houseNumber).PostCode(postCode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GlobalKYCApi.GetUsSsn``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetUsSsn`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `GlobalKYCApi.GetUsSsn`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetUsSsnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **country** | **string** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 
 **streetName** | **string** |  | 
 **dateOfBirth** | **string** |  | 
 **houseNumber** | **int32** |  | 
 **postCode** | **int32** |  | 

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


## UkTwoPlusTwo

> map[string]interface{} UkTwoPlusTwo(ctx).AppId(appId).Country(country).FirstName(firstName).LastName(lastName).StreetName(streetName).DateOfBirth(dateOfBirth).HouseNumber(houseNumber).PostCode(postCode).Execute()

UK 2+2

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
    country := "GBR" // string |  (optional)
    firstName := "Tobi" // string |  (optional)
    lastName := "Ololade" // string |  (optional)
    streetName := "Street 1" // string |  (optional)
    dateOfBirth := "1992-05-18" // string |  (optional)
    houseNumber := int32(25) // int32 |  (optional)
    postCode := int32(1234) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.GlobalKYCApi.UkTwoPlusTwo(context.Background()).AppId(appId).Country(country).FirstName(firstName).LastName(lastName).StreetName(streetName).DateOfBirth(dateOfBirth).HouseNumber(houseNumber).PostCode(postCode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GlobalKYCApi.UkTwoPlusTwo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UkTwoPlusTwo`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `GlobalKYCApi.UkTwoPlusTwo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUkTwoPlusTwoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **string** |  | 
 **country** | **string** |  | 
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 
 **streetName** | **string** |  | 
 **dateOfBirth** | **string** |  | 
 **houseNumber** | **int32** |  | 
 **postCode** | **int32** |  | 

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

