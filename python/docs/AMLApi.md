# dojah_client.AMLApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_screening_info**](AMLApi.md#get_screening_info) | **GET** /v1/aml/screening/info | Get AML Info
[**screen_aml**](AMLApi.md#screen_aml) | **POST** /api/v1/aml/screening | AML Screening


# **get_screening_info**
> GetScreeningInfoResponse get_screening_info()

Get AML Info

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import aml_api
from dojah_client.model.get_screening_info_response import GetScreeningInfoResponse
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
    api_instance = aml_api.AMLApi(api_client)
    reference_id = "c574a3c8-dc27-4013-8bbc-462e7ed87d55" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get AML Info
        api_response = api_instance.get_screening_info(reference_id=reference_id)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling AMLApi->get_screening_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference_id** | **str**|  | [optional]

### Return type

[**GetScreeningInfoResponse**](GetScreeningInfoResponse.md)

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

# **screen_aml**
> ScreenAmlResponse screen_aml()

AML Screening

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import aml_api
from dojah_client.model.screen_aml_response import ScreenAmlResponse
from dojah_client.model.screen_aml_request import ScreenAmlRequest
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
    api_instance = aml_api.AMLApi(api_client)
    screen_aml_request = ScreenAmlRequest(
        first_name="Obama ",
        last_name=" ",
        date_of_birth="1997-08-18",
    ) # ScreenAmlRequest |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # AML Screening
        api_response = api_instance.screen_aml(screen_aml_request=screen_aml_request)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling AMLApi->screen_aml: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screen_aml_request** | [**ScreenAmlRequest**](ScreenAmlRequest.md)|  | [optional]

### Return type

[**ScreenAmlResponse**](ScreenAmlResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

