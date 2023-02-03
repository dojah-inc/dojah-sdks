# dojah_client.GHKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_drivers_license**](GHKYCApi.md#get_drivers_license) | **GET** /api/v1/gh/kyc/dl | Driver&#39;s License
[**get_passport**](GHKYCApi.md#get_passport) | **GET** /api/v1/gh/kyc/passport | Passport
[**get_ssnit**](GHKYCApi.md#get_ssnit) | **GET** /api/v1/gh/kyc/ssnit | SSNIT


# **get_drivers_license**
> GetDriversLicenseResponse get_drivers_license()

Driver's License

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import ghkyc_api
from dojah_client.model.get_drivers_license_response import GetDriversLicenseResponse
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
    api_instance = ghkyc_api.GHKYCApi(api_client)
    id = "V0000000" # str |  (optional)
    full_name = "John Doe" # str |  (optional)
    date_of_birth = "1988-09-01" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Driver's License
        api_response = api_instance.get_drivers_license(id=id, full_name=full_name, date_of_birth=date_of_birth)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GHKYCApi->get_drivers_license: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | [optional]
 **full_name** | **str**|  | [optional]
 **date_of_birth** | **str**|  | [optional]

### Return type

[**GetDriversLicenseResponse**](GetDriversLicenseResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * Content-Type -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_passport**
> GetPassportResponse get_passport()

Passport

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import ghkyc_api
from dojah_client.model.get_passport_response import GetPassportResponse
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
    api_instance = ghkyc_api.GHKYCApi(api_client)
    id = "G0000000" # str |  (optional)
    first_name = "John" # str |  (optional)
    last_name = "Doe" # str |  (optional)
    middle_name = "Jack" # str |  (optional)
    date_of_birth = "1990-04-05" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Passport
        api_response = api_instance.get_passport(id=id, first_name=first_name, last_name=last_name, middle_name=middle_name, date_of_birth=date_of_birth)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GHKYCApi->get_passport: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | [optional]
 **first_name** | **str**|  | [optional]
 **last_name** | **str**|  | [optional]
 **middle_name** | **str**|  | [optional]
 **date_of_birth** | **str**|  | [optional]

### Return type

[**GetPassportResponse**](GetPassportResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * Content-Type -  <br>  * ETag -  <br>  * Vary -  <br>  * Content-Encoding -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  * Transfer-Encoding -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ssnit**
> GetSsnitResponse get_ssnit()

SSNIT

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import ghkyc_api
from dojah_client.model.get_ssnit_response import GetSsnitResponse
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
    api_instance = ghkyc_api.GHKYCApi(api_client)
    id = "G0000000" # str |  (optional)
    full_name = "John Doe" # str |  (optional)
    date_of_birth = "1990-04-05" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # SSNIT
        api_response = api_instance.get_ssnit(id=id, full_name=full_name, date_of_birth=date_of_birth)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GHKYCApi->get_ssnit: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | [optional]
 **full_name** | **str**|  | [optional]
 **date_of_birth** | **str**|  | [optional]

### Return type

[**GetSsnitResponse**](GetSsnitResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

