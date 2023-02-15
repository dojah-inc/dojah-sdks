# dojah_client.AuthenticationApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_sender_id**](AuthenticationApi.md#get_sender_id) | **GET** /api/v1/messaging/sender_ids | Messaging - Get Sender IDs
[**get_sms_status**](AuthenticationApi.md#get_sms_status) | **GET** /v1/messaging/sms/get_status | Messaging - Get SMS Status
[**request_sender_id**](AuthenticationApi.md#request_sender_id) | **POST** /api/v1/messaging/sender_id | Messaging - Request Sender ID
[**send_otp**](AuthenticationApi.md#send_otp) | **POST** /v1/messaging/otp | Messaging - Send OTP
[**send_sms**](AuthenticationApi.md#send_sms) | **POST** /api/v1/messaging/sms | Messaging - Send SMS
[**validate_otp**](AuthenticationApi.md#validate_otp) | **GET** /v1/messaging/otp/validate | Messaging - Validate OTP


# **get_sender_id**
> GetSenderIdResponse get_sender_id()

Messaging - Get Sender IDs

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import authentication_api
from dojah_client.model.get_sender_id_response import GetSenderIdResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(
    api_key={'apikeyAuth': 'YOUR_API_KEY'},
    # Defining the host is optional and defaults to https://api.dojah.io
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://api.dojah.io'
)

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Messaging - Get Sender IDs
        api_response = api_instance.get_sender_id()
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling AuthenticationApi->get_sender_id: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSenderIdResponse**](GetSenderIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sms_status**
> GetSmsStatusResponse get_sms_status()

Messaging - Get SMS Status

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import authentication_api
from dojah_client.model.get_sms_status_response import GetSmsStatusResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(
    api_key={'apikeyAuth': 'YOUR_API_KEY'},
    # Defining the host is optional and defaults to https://api.dojah.io
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://api.dojah.io'
)

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)
    message_id = "54818c8a-4aed-4e5f-b846-8274fd4e0bbd" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Messaging - Get SMS Status
        api_response = api_instance.get_sms_status(message_id=message_id)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling AuthenticationApi->get_sms_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_id** | **str**|  | [optional]

### Return type

[**GetSmsStatusResponse**](GetSmsStatusResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **request_sender_id**
> RequestSenderIdResponse request_sender_id()

Messaging - Request Sender ID

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import authentication_api
from dojah_client.model.request_sender_id_request import RequestSenderIdRequest
from dojah_client.model.request_sender_id_response import RequestSenderIdResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(
    api_key={'apikeyAuth': 'YOUR_API_KEY'},
    # Defining the host is optional and defaults to https://api.dojah.io
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://api.dojah.io'
)

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)
    request_sender_id_request = RequestSenderIdRequest(
        sender_id="Dojah",
    ) # RequestSenderIdRequest |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Messaging - Request Sender ID
        api_response = api_instance.request_sender_id(request_sender_id_request=request_sender_id_request)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling AuthenticationApi->request_sender_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_sender_id_request** | [**RequestSenderIdRequest**](RequestSenderIdRequest.md)|  | [optional]

### Return type

[**RequestSenderIdResponse**](RequestSenderIdResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_otp**
> SendOtpResponse send_otp()

Messaging - Send OTP

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import authentication_api
from dojah_client.model.send_otp_request import SendOtpRequest
from dojah_client.model.send_otp_response import SendOtpResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(
    api_key={'apikeyAuth': 'YOUR_API_KEY'},
    # Defining the host is optional and defaults to https://api.dojah.io
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://api.dojah.io'
)

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)
    send_otp_request = SendOtpRequest(
        destination="08068810228",
        length=6,
        channel="sms",
        sender_id="Dojah",
        priority=True,
    ) # SendOtpRequest |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Messaging - Send OTP
        api_response = api_instance.send_otp(send_otp_request=send_otp_request)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling AuthenticationApi->send_otp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **send_otp_request** | [**SendOtpRequest**](SendOtpRequest.md)|  | [optional]

### Return type

[**SendOtpResponse**](SendOtpResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_sms**
> SendSmsResponse send_sms()

Messaging - Send SMS

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import authentication_api
from dojah_client.model.send_sms_request import SendSmsRequest
from dojah_client.model.send_sms_response import SendSmsResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(
    api_key={'apikeyAuth': 'YOUR_API_KEY'},
    # Defining the host is optional and defaults to https://api.dojah.io
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://api.dojah.io'
)

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)
    send_sms_request = SendSmsRequest(
        destination="08068810228",
        message="Checking to see if you are Okay",
        channel="whatsapp",
        sender_id="Kedesa",
    ) # SendSmsRequest |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Messaging - Send SMS
        api_response = api_instance.send_sms(send_sms_request=send_sms_request)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling AuthenticationApi->send_sms: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **send_sms_request** | [**SendSmsRequest**](SendSmsRequest.md)|  | [optional]

### Return type

[**SendSmsResponse**](SendSmsResponse.md)

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

# **validate_otp**
> ValidateOtpResponse validate_otp()

Messaging - Validate OTP

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import authentication_api
from dojah_client.model.validate_otp_response import ValidateOtpResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apikeyAuth
configuration = dojah_client.Configuration(
    api_key={'apikeyAuth': 'YOUR_API_KEY'},
    # Defining the host is optional and defaults to https://api.dojah.io
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://api.dojah.io'
)

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikeyAuth'] = 'Bearer'

# Configure API key authorization: appIdAuth
configuration.api_key['appIdAuth'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appIdAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with dojah_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)
    reference_id = "a89e4b64-367f-414f-a189-1800bc364b05" # str |  (optional)
    code = 81974 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Messaging - Validate OTP
        api_response = api_instance.validate_otp(reference_id=reference_id, code=code)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling AuthenticationApi->validate_otp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference_id** | **str**|  | [optional]
 **code** | **int**|  | [optional]

### Return type

[**ValidateOtpResponse**](ValidateOtpResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Date -  <br>  * Connection -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

