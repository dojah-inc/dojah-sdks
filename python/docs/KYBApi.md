# dojah_client.KYBApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_advanced_cac**](KYBApi.md#get_advanced_cac) | **GET** /v1/kyc/cac/advance | KYC - Get CAC Advanced
[**get_basic_cac**](KYBApi.md#get_basic_cac) | **GET** /v1/kyc/cac/basic | KYB - Get CAC 2
[**get_cac**](KYBApi.md#get_cac) | **GET** /v1/kyc/cac | KYC - Get CAC 
[**get_tin**](KYBApi.md#get_tin) | **GET** /v1/kyc/tin | KYC - Fetch Tin


# **get_advanced_cac**
> GetAdvancedCacResponse get_advanced_cac()

KYC - Get CAC Advanced

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyb_api
from dojah_client.model.get_advanced_cac_response import GetAdvancedCacResponse
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
    api_instance = kyb_api.KYBApi(api_client)
    rc = 1432074 # int |  (optional)
    type = "co" # str |  (optional)
    _class = "advance" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Get CAC Advanced
        api_response = api_instance.get_advanced_cac(rc=rc, type=type, _class=_class)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYBApi->get_advanced_cac: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rc** | **int**|  | [optional]
 **type** | **str**|  | [optional]
 **_class** | **str**|  | [optional]

### Return type

[**GetAdvancedCacResponse**](GetAdvancedCacResponse.md)

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

# **get_basic_cac**
> GetBasicCacResponse get_basic_cac()

KYB - Get CAC 2

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyb_api
from dojah_client.model.get_basic_cac_response import GetBasicCacResponse
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
    api_instance = kyb_api.KYBApi(api_client)
    rc = 3330883 # int |  (optional)
    type = "bn" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYB - Get CAC 2
        api_response = api_instance.get_basic_cac(rc=rc, type=type)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYBApi->get_basic_cac: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rc** | **int**|  | [optional]
 **type** | **str**|  | [optional]

### Return type

[**GetBasicCacResponse**](GetBasicCacResponse.md)

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

# **get_cac**
> GetCacResponse get_cac()

KYC - Get CAC 

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyb_api
from dojah_client.model.get_cac_response import GetCacResponse
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
    api_instance = kyb_api.KYBApi(api_client)
    rc_number = 1432074 # int |  (optional)
    company_name = "ELTA SOLUTIONS LIMITED" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Get CAC 
        api_response = api_instance.get_cac(rc_number=rc_number, company_name=company_name)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYBApi->get_cac: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rc_number** | **int**|  | [optional]
 **company_name** | **str**|  | [optional]

### Return type

[**GetCacResponse**](GetCacResponse.md)

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

# **get_tin**
> GetTinResponse get_tin()

KYC - Fetch Tin

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyb_api
from dojah_client.model.get_tin_response import GetTinResponse
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
    api_instance = kyb_api.KYBApi(api_client)
    tin = "21148119-0001" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Fetch Tin
        api_response = api_instance.get_tin(tin=tin)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYBApi->get_tin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tin** | **str**|  | [optional]

### Return type

[**GetTinResponse**](GetTinResponse.md)

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

