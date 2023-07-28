# \WebHooksApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteWebhook**](WebHooksApi.md#DeleteWebhook) | **Delete** /api/v1/webhook/delete | Delete Webhook
[**GetWebhooks**](WebHooksApi.md#GetWebhooks) | **Get** /api/v1/webhook/fetch | Fetch All Webhooks
[**NotifyWebhook**](WebHooksApi.md#NotifyWebhook) | **Post** /api/v1/webhook/notify | Post Hook
[**SubscribeService**](WebHooksApi.md#SubscribeService) | **Post** /api/v1/webhook/subscribe | Subscribe to service



## DeleteWebhook

> DeleteWebhookResponse DeleteWebhook(ctx).Execute()

Delete Webhook

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
    resp, r, err := apiClient.WebHooksApi.DeleteWebhook(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebHooksApi.DeleteWebhook``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DeleteWebhook`: DeleteWebhookResponse
    fmt.Fprintf(os.Stdout, "Response from `WebHooksApi.DeleteWebhook`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteWebhookRequest struct via the builder pattern


### Return type

[**DeleteWebhookResponse**](DeleteWebhookResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetWebhooks

> GetWebhooksResponse GetWebhooks(ctx).Execute()

Fetch All Webhooks

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
    resp, r, err := apiClient.WebHooksApi.GetWebhooks(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebHooksApi.GetWebhooks``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetWebhooks`: GetWebhooksResponse
    fmt.Fprintf(os.Stdout, "Response from `WebHooksApi.GetWebhooks`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetWebhooksRequest struct via the builder pattern


### Return type

[**GetWebhooksResponse**](GetWebhooksResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NotifyWebhook

> NotifyWebhookResponse NotifyWebhook(ctx).NotifyWebhookRequest(notifyWebhookRequest).Execute()

Post Hook

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
    notifyWebhookRequest := *dojah.NewNotifyWebhookRequest() // NotifyWebhookRequest | 

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.WebHooksApi.NotifyWebhook(context.Background()).NotifyWebhookRequest(notifyWebhookRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebHooksApi.NotifyWebhook``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `NotifyWebhook`: NotifyWebhookResponse
    fmt.Fprintf(os.Stdout, "Response from `WebHooksApi.NotifyWebhook`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiNotifyWebhookRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notifyWebhookRequest** | [**NotifyWebhookRequest**](NotifyWebhookRequest.md) |  | 

### Return type

[**NotifyWebhookResponse**](NotifyWebhookResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SubscribeService

> SubscribeServiceResponse SubscribeService(ctx).SubscribeServiceRequest(subscribeServiceRequest).Execute()

Subscribe to service

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
    subscribeServiceRequest := *dojah.NewSubscribeServiceRequest() // SubscribeServiceRequest | 

    configuration := dojah.NewConfiguration()
    apiClient := dojah.NewAPIClient(configuration)
    resp, r, err := apiClient.WebHooksApi.SubscribeService(context.Background()).SubscribeServiceRequest(subscribeServiceRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WebHooksApi.SubscribeService``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SubscribeService`: SubscribeServiceResponse
    fmt.Fprintf(os.Stdout, "Response from `WebHooksApi.SubscribeService`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSubscribeServiceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscribeServiceRequest** | [**SubscribeServiceRequest**](SubscribeServiceRequest.md) |  | 

### Return type

[**SubscribeServiceResponse**](SubscribeServiceResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth), [noauthAuth](../README.md#noauthAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

