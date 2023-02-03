# dojah_client.WebHooksApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_webhook**](WebHooksApi.md#delete_webhook) | **DELETE** /api/v1/webhook/delete | Delete Webhook
[**get_webhooks**](WebHooksApi.md#get_webhooks) | **GET** /api/v1/webhook/fetch | Fetch All Webhooks
[**notify_webhook**](WebHooksApi.md#notify_webhook) | **POST** /api/v1/webhook/notify | Post Hook
[**subscribe_service**](WebHooksApi.md#subscribe_service) | **POST** /api/v1/webhook/subscribe | Subscribe to service


# **delete_webhook**
> DeleteWebhookResponse delete_webhook()

Delete Webhook

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import web_hooks_api
from dojah_client.model.delete_webhook_response import DeleteWebhookResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(api_key={'apikeyAuth': 'YOUR_API_KEY'})

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = web_hooks_api.WebHooksApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Delete Webhook
        api_response = api_instance.delete_webhook()
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling WebHooksApi->delete_webhook: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**DeleteWebhookResponse**](DeleteWebhookResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_webhooks**
> GetWebhooksResponse get_webhooks()

Fetch All Webhooks

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import web_hooks_api
from dojah_client.model.get_webhooks_response import GetWebhooksResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(api_key={'apikeyAuth': 'YOUR_API_KEY'})

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = web_hooks_api.WebHooksApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Fetch All Webhooks
        api_response = api_instance.get_webhooks()
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling WebHooksApi->get_webhooks: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GetWebhooksResponse**](GetWebhooksResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **notify_webhook**
> NotifyWebhookResponse notify_webhook()

Post Hook

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import web_hooks_api
from dojah_client.model.notify_webhook_response import NotifyWebhookResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(api_key={'apikeyAuth': 'YOUR_API_KEY'})

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = web_hooks_api.WebHooksApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Post Hook
        api_response = api_instance.notify_webhook(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling WebHooksApi->notify_webhook: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**NotifyWebhookResponse**](NotifyWebhookResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscribe_service**
> SubscribeServiceResponse subscribe_service()

Subscribe to service

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import web_hooks_api
from dojah_client.model.subscribe_service_response import SubscribeServiceResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(api_key={'apikeyAuth': 'YOUR_API_KEY'})

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = web_hooks_api.WebHooksApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Subscribe to service
        api_response = api_instance.subscribe_service(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling WebHooksApi->subscribe_service: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**SubscribeServiceResponse**](SubscribeServiceResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

