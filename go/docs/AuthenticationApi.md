# \AuthenticationApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSenderId**](AuthenticationApi.md#GetSenderId) | **Get** /api/v1/messaging/sender_ids | Messaging - Get Sender IDs
[**GetSmsStatus**](AuthenticationApi.md#GetSmsStatus) | **Get** /v1/messaging/sms/get_status | Messaging - Get SMS Status
[**RequestSenderId**](AuthenticationApi.md#RequestSenderId) | **Post** /api/v1/messaging/sender_id | Messaging - Request Sender ID
[**SendOtp**](AuthenticationApi.md#SendOtp) | **Post** /api/v1/messaging/otp | Messaging - Send OTP
[**SendSms**](AuthenticationApi.md#SendSms) | **Post** /api/v1/messaging/sms | Messaging - Send SMS
[**ValidateOtp**](AuthenticationApi.md#ValidateOtp) | **Get** /api/v1/messaging/otp/validate | Messaging - Validate OTP



## GetSenderId

> GetSenderIdResponse GetSenderId(ctx).Execute()

Messaging - Get Sender IDs

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
    resp, r, err := apiClient.AuthenticationApi.GetSenderId(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.GetSenderId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSenderId`: GetSenderIdResponse
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.GetSenderId`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetSenderIdRequest struct via the builder pattern


### Return type

[**GetSenderIdResponse**](GetSenderIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSmsStatus

> GetSmsStatusResponse GetSmsStatus(ctx).MessageId(messageId).Execute()

Messaging - Get SMS Status

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
    messageId := ""54818c8a-4aed-4e5f-b846-8274fd4e0bbd"" // string |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.GetSmsStatus(context.Background()).MessageId(messageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.GetSmsStatus``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSmsStatus`: GetSmsStatusResponse
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.GetSmsStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetSmsStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **string** |  | 

### Return type

[**GetSmsStatusResponse**](GetSmsStatusResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RequestSenderId

> RequestSenderIdResponse RequestSenderId(ctx).RequestSenderIdRequest(requestSenderIdRequest).Execute()

Messaging - Request Sender ID

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
    requestSenderIdRequest := *dojah.NewRequestSenderIdRequest() // RequestSenderIdRequest | 

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.RequestSenderId(context.Background()).RequestSenderIdRequest(requestSenderIdRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.RequestSenderId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RequestSenderId`: RequestSenderIdResponse
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.RequestSenderId`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRequestSenderIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestSenderIdRequest** | [**RequestSenderIdRequest**](RequestSenderIdRequest.md) |  | 

### Return type

[**RequestSenderIdResponse**](RequestSenderIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SendOtp

> AuthenticationSendOtpResponse SendOtp(ctx).AuthenticationSendOtpRequest(authenticationSendOtpRequest).Execute()

Messaging - Send OTP

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
    authenticationSendOtpRequest := *dojah.NewAuthenticationSendOtpRequest() // AuthenticationSendOtpRequest | 

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.SendOtp(context.Background()).AuthenticationSendOtpRequest(authenticationSendOtpRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.SendOtp``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SendOtp`: AuthenticationSendOtpResponse
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.SendOtp`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSendOtpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationSendOtpRequest** | [**AuthenticationSendOtpRequest**](AuthenticationSendOtpRequest.md) |  | 

### Return type

[**AuthenticationSendOtpResponse**](AuthenticationSendOtpResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SendSms

> SendSmsResponse SendSms(ctx).SendSmsRequest(sendSmsRequest).Execute()

Messaging - Send SMS

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
    sendSmsRequest := *dojah.NewSendSmsRequest() // SendSmsRequest | 

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.SendSms(context.Background()).SendSmsRequest(sendSmsRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.SendSms``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SendSms`: SendSmsResponse
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.SendSms`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSendSmsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendSmsRequest** | [**SendSmsRequest**](SendSmsRequest.md) |  | 

### Return type

[**SendSmsResponse**](SendSmsResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ValidateOtp

> AuthenticationValidateOtpResponse ValidateOtp(ctx).ReferenceId(referenceId).Code(code).Execute()

Messaging - Validate OTP

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
    referenceId := ""a89e4b64-367f-414f-a189-1800bc364b05"" // string |  (optional)
    code := int32(81974) // int32 |  (optional)

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.ValidateOtp(context.Background()).ReferenceId(referenceId).Code(code).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.ValidateOtp``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ValidateOtp`: AuthenticationValidateOtpResponse
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.ValidateOtp`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiValidateOtpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceId** | **string** |  | 
 **code** | **int32** |  | 

### Return type

[**AuthenticationValidateOtpResponse**](AuthenticationValidateOtpResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

