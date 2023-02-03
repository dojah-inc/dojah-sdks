# dojah_client.GeneralApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_banks**](GeneralApi.md#get_banks) | **GET** /v1/general/banks | General - Get Banks
[**get_bin**](GeneralApi.md#get_bin) | **GET** /v1/general/bin | General Resolve BIN
[**get_data_plans**](GeneralApi.md#get_data_plans) | **GET** /v1/purchase/data/plans | Purchase - Get Data Plans
[**get_nuban**](GeneralApi.md#get_nuban) | **GET** /v1/general/account | General Resolve NUBAN
[**get_wallet_balance**](GeneralApi.md#get_wallet_balance) | **GET** /api/v1/balance | Get Dojah Wallet Balance
[**purchase_airtime**](GeneralApi.md#purchase_airtime) | **POST** /v1/purchase/airtime | Purchase - Send Airtime
[**purchase_data**](GeneralApi.md#purchase_data) | **POST** /v1/purchase/data | Purchase - Buy Data


# **get_banks**
> GetBanksResponse get_banks()

General - Get Banks

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import general_api
from dojah_client.model.get_banks_response import GetBanksResponse
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
    api_instance = general_api.GeneralApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # General - Get Banks
        api_response = api_instance.get_banks()
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GeneralApi->get_banks: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBanksResponse**](GetBanksResponse.md)

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

# **get_bin**
> GetBinResponse get_bin()

General Resolve BIN

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import general_api
from dojah_client.model.get_bin_response import GetBinResponse
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
    api_instance = general_api.GeneralApi(api_client)
    card_bin = 506118 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # General Resolve BIN
        api_response = api_instance.get_bin(card_bin=card_bin)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GeneralApi->get_bin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_bin** | **int**|  | [optional]

### Return type

[**GetBinResponse**](GetBinResponse.md)

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

# **get_data_plans**
> GetDataPlansResponse get_data_plans()

Purchase - Get Data Plans

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import general_api
from dojah_client.model.get_data_plans_response import GetDataPlansResponse
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
    api_instance = general_api.GeneralApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Purchase - Get Data Plans
        api_response = api_instance.get_data_plans()
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GeneralApi->get_data_plans: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDataPlansResponse**](GetDataPlansResponse.md)

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

# **get_nuban**
> GeneralGetNubanResponse get_nuban()

General Resolve NUBAN

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import general_api
from dojah_client.model.general_get_nuban_response import GeneralGetNubanResponse
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
    api_instance = general_api.GeneralApi(api_client)
    bank_code = 58 # int |  (optional)
    account_number = 37466959 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # General Resolve NUBAN
        api_response = api_instance.get_nuban(bank_code=bank_code, account_number=account_number)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GeneralApi->get_nuban: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_code** | **int**|  | [optional]
 **account_number** | **int**|  | [optional]

### Return type

[**GeneralGetNubanResponse**](GeneralGetNubanResponse.md)

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

# **get_wallet_balance**
> GetWalletBalanceResponse get_wallet_balance()

Get Dojah Wallet Balance

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import general_api
from dojah_client.model.general_get_wallet_balance_response import GeneralGetWalletBalanceResponse
from dojah_client.model.get_wallet_balance_response import GetWalletBalanceResponse
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
    api_instance = general_api.GeneralApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get Dojah Wallet Balance
        api_response = api_instance.get_wallet_balance()
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GeneralApi->get_wallet_balance: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GetWalletBalanceResponse**](GetWalletBalanceResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_airtime**
> PurchaseAirtimeResponse purchase_airtime()

Purchase - Send Airtime

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import general_api
from dojah_client.model.purchase_airtime_response import PurchaseAirtimeResponse
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
    api_instance = general_api.GeneralApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Purchase - Send Airtime
        api_response = api_instance.purchase_airtime(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GeneralApi->purchase_airtime: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**PurchaseAirtimeResponse**](PurchaseAirtimeResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_data**
> PurchaseDataResponse purchase_data()

Purchase - Buy Data

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import general_api
from dojah_client.model.purchase_data_response import PurchaseDataResponse
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
    api_instance = general_api.GeneralApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Purchase - Buy Data
        api_response = api_instance.purchase_data(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling GeneralApi->purchase_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**PurchaseDataResponse**](PurchaseDataResponse.md)

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

