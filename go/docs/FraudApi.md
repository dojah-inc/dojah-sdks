# \FraudApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEmailReputation**](FraudApi.md#GetEmailReputation) | **Get** /api/v1/kyc/email | Email Reputation
[**GetIpReputation**](FraudApi.md#GetIpReputation) | **Get** /api/v1/fraud/ip | IP Reputation
[**ScreenPhone**](FraudApi.md#ScreenPhone) | **Get** /api/v1/fraud/phone | Phone Screening
[**ScreenUser**](FraudApi.md#ScreenUser) | **Get** /api/v1/fraud/user | User Screening



## GetEmailReputation

> FraudGetEmailReputationResponse GetEmailReputation(ctx).Email(email).Execute()

Email Reputation

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
    email := ""johndoe@gmail.com"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FraudApi.GetEmailReputation(context.Background()).Email(email).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FraudApi.GetEmailReputation``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetEmailReputation`: FraudGetEmailReputationResponse
    fmt.Fprintf(os.Stdout, "Response from `FraudApi.GetEmailReputation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetEmailReputationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string** |  | 

### Return type

[**FraudGetEmailReputationResponse**](FraudGetEmailReputationResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth), [noauthAuth](../README.md#noauthAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetIpReputation

> FraudGetIpReputationResponse GetIpReputation(ctx).IpAddress(ipAddress).Execute()

IP Reputation

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
    ipAddress := ""102.215.56.170"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FraudApi.GetIpReputation(context.Background()).IpAddress(ipAddress).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FraudApi.GetIpReputation``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetIpReputation`: FraudGetIpReputationResponse
    fmt.Fprintf(os.Stdout, "Response from `FraudApi.GetIpReputation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetIpReputationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | **string** |  | 

### Return type

[**FraudGetIpReputationResponse**](FraudGetIpReputationResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ScreenPhone

> FraudScreenPhoneResponse ScreenPhone(ctx).PhoneNumber(phoneNumber).Execute()

Phone Screening

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
    phoneNumber := int32(2348068810228) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FraudApi.ScreenPhone(context.Background()).PhoneNumber(phoneNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FraudApi.ScreenPhone``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ScreenPhone`: FraudScreenPhoneResponse
    fmt.Fprintf(os.Stdout, "Response from `FraudApi.ScreenPhone`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiScreenPhoneRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **int32** |  | 

### Return type

[**FraudScreenPhoneResponse**](FraudScreenPhoneResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ScreenUser

> FraudScreenUserResponse ScreenUser(ctx).FirstName(firstName).LastName(lastName).DateOfBirth(dateOfBirth).Email(email).Phone(phone).IpAddress(ipAddress).Execute()

User Screening

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
    firstName := ""Robert"" // string |  (optional)
    lastName := ""Morris"" // string |  (optional)
    dateOfBirth := ""1986-11-12"" // string |  (optional)
    email := ""andre.little@moore.com"" // string |  (optional)
    phone := ""001-640-858-2058"" // string |  (optional)
    ipAddress := ""116.7.209.8"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.FraudApi.ScreenUser(context.Background()).FirstName(firstName).LastName(lastName).DateOfBirth(dateOfBirth).Email(email).Phone(phone).IpAddress(ipAddress).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FraudApi.ScreenUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ScreenUser`: FraudScreenUserResponse
    fmt.Fprintf(os.Stdout, "Response from `FraudApi.ScreenUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiScreenUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **string** |  | 
 **lastName** | **string** |  | 
 **dateOfBirth** | **string** |  | 
 **email** | **string** |  | 
 **phone** | **string** |  | 
 **ipAddress** | **string** |  | 

### Return type

[**FraudScreenUserResponse**](FraudScreenUserResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

