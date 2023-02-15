# dojah_client.ServicesApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categorize_transactions**](ServicesApi.md#categorize_transactions) | **POST** /v1/ml/categorize_transaction | Categorize Transactions


# **categorize_transactions**
> CategorizeTransactionsResponse categorize_transactions()

Categorize Transactions

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import services_api
from dojah_client.model.categorize_transactions_request import CategorizeTransactionsRequest
from dojah_client.model.categorize_transactions_response import CategorizeTransactionsResponse
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
    api_instance = services_api.ServicesApi(api_client)
    categorize_transactions_request = CategorizeTransactionsRequest(
        description="POS/WEB PURCHASE TRANSACTION -047608- -253842-MUNCHIES BY MOE OY OYNG",
        trans_type="debit",
    ) # CategorizeTransactionsRequest |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Categorize Transactions
        api_response = api_instance.categorize_transactions(categorize_transactions_request=categorize_transactions_request)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling ServicesApi->categorize_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categorize_transactions_request** | [**CategorizeTransactionsRequest**](CategorizeTransactionsRequest.md)|  | [optional]

### Return type

[**CategorizeTransactionsResponse**](CategorizeTransactionsResponse.md)

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

