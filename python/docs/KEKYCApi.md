# dojah_client.KEKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_national_id**](KEKYCApi.md#get_national_id) | **GET** /api/v1/ke/kyc/id | KYC - National ID


# **get_national_id**
> GetNationalIdResponse get_national_id()

KYC - National ID

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kekyc_api
from dojah_client.model.get_national_id_response import GetNationalIdResponse
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
    api_instance = kekyc_api.KEKYCApi(api_client)
    id = 24798402 # int |  (optional)
    first_name = "ZEDEKIAH" # str |  (optional)
    last_name = "ANDENGA" # str |  (optional)
    middle_name = "middle_name_example" # str |  (optional)
    date_of_birth = "1985-12-29" # str |  (optional)
    gender = "M" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - National ID
        api_response = api_instance.get_national_id(id=id, first_name=first_name, last_name=last_name, middle_name=middle_name, date_of_birth=date_of_birth, gender=gender)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KEKYCApi->get_national_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | [optional]
 **first_name** | **str**|  | [optional]
 **last_name** | **str**|  | [optional]
 **middle_name** | **str**|  | [optional]
 **date_of_birth** | **str**|  | [optional]
 **gender** | **str**|  | [optional]

### Return type

[**GetNationalIdResponse**](GetNationalIdResponse.md)

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

