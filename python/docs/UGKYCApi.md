# dojah_client.UGKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_voter**](UGKYCApi.md#get_voter) | **GET** /api/v1/ug/kyc/voter | Voters ID


# **get_voter**
> GetVoterResponse get_voter()

Voters ID

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import ugkyc_api
from dojah_client.model.get_voter_response import GetVoterResponse
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
    api_instance = ugkyc_api.UGKYCApi(api_client)
    id = 67335751 # int |  (optional)
    first_name = "Happy" # str |  (optional)
    last_name = "Christmas" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Voters ID
        api_response = api_instance.get_voter(id=id, first_name=first_name, last_name=last_name)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling UGKYCApi->get_voter: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | [optional]
 **first_name** | **str**|  | [optional]
 **last_name** | **str**|  | [optional]

### Return type

[**GetVoterResponse**](GetVoterResponse.md)

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

