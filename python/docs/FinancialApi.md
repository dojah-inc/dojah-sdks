# dojah_client.FinancialApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collect_status_from_pdf**](FinancialApi.md#collect_status_from_pdf) | **POST** /api/v1/financial/transactions/pdf | Collect Status via PDF Statement
[**collect_transactions**](FinancialApi.md#collect_transactions) | **POST** /v1/financial/transactions | Collect Transactions
[**get_account**](FinancialApi.md#get_account) | **GET** /api/v1/financial/account_information | Get Account Information
[**get_account_analysis**](FinancialApi.md#get_account_analysis) | **GET** /api/v1/financial/analysis | Get Account Analysis
[**get_account_subscriptions**](FinancialApi.md#get_account_subscriptions) | **GET** /v1/financial/account_subscription | Get Account Subscriptions
[**get_account_transactions**](FinancialApi.md#get_account_transactions) | **GET** /api/v1/financial/account_transactions | Get Account Transactions
[**get_basic_bvn**](FinancialApi.md#get_basic_bvn) | **GET** /v1/financial/bvn_information/basic | Get BVN Information Basic
[**get_earning_structure**](FinancialApi.md#get_earning_structure) | **GET** /v1/financial/earning_structure | Get Earning Structure
[**get_full_bvn**](FinancialApi.md#get_full_bvn) | **GET** /v1/financial/bvn_information/full | Get BVN Information Full
[**get_spending_pattern**](FinancialApi.md#get_spending_pattern) | **GET** /v1/financial/spending_pattern | Get Spending Pattern


# **collect_status_from_pdf**
> CollectStatusFromPdfResponse collect_status_from_pdf()

Collect Status via PDF Statement

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.collect_status_from_pdf_response import CollectStatusFromPdfResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    statement = open('/path/to/file', 'rb') # file_type |  (optional)
    bank_code = 33 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Collect Status via PDF Statement
        api_response = api_instance.collect_status_from_pdf(statement=statement, bank_code=bank_code)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->collect_status_from_pdf: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statement** | **file_type**|  | [optional]
 **bank_code** | **int**|  | [optional]

### Return type

[**CollectStatusFromPdfResponse**](CollectStatusFromPdfResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collect_transactions**
> CollectTransactionsResponse collect_transactions()

Collect Transactions

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.collect_transactions_response import CollectTransactionsResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Collect Transactions
        api_response = api_instance.collect_transactions(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->collect_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**CollectTransactionsResponse**](CollectTransactionsResponse.md)

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

# **get_account**
> GetAccountResponse get_account()

Get Account Information

/services/@app_id/account/@account_id

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.get_account_response import GetAccountResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    account_id = "d5b86083-08c5-4de2-ac19-7610a16c297d" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Account Information
        api_response = api_instance.get_account(account_id=account_id)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->get_account: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**|  | [optional]

### Return type

[**GetAccountResponse**](GetAccountResponse.md)

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

# **get_account_analysis**
> GetAccountAnalysisResponse get_account_analysis()

Get Account Analysis

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.get_account_analysis_response import GetAccountAnalysisResponse
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
    api_instance = financial_api.FinancialApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get Account Analysis
        api_response = api_instance.get_account_analysis()
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->get_account_analysis: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountAnalysisResponse**](GetAccountAnalysisResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * Access-Control-Allow-Origin -  <br>  * uuid -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * ETag -  <br>  * Vary -  <br>  * CF-Cache-Status -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_subscriptions**
> GetAccountSubscriptionsResponse get_account_subscriptions()

Get Account Subscriptions

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.get_account_subscriptions_response import GetAccountSubscriptionsResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    account_id = "02f63911-a958-4025-9d72-8bd2d7da274b" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Account Subscriptions
        api_response = api_instance.get_account_subscriptions(account_id=account_id)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->get_account_subscriptions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**|  | [optional]

### Return type

[**GetAccountSubscriptionsResponse**](GetAccountSubscriptionsResponse.md)

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

# **get_account_transactions**
> GetAccountTransactionsResponse get_account_transactions()

Get Account Transactions

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.get_account_transactions_response import GetAccountTransactionsResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    account_id = "d5b86083-08c5-4de2-ac19-7610a16c297d" # str |  (optional)
    length = 200 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Account Transactions
        api_response = api_instance.get_account_transactions(account_id=account_id, length=length)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->get_account_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**|  | [optional]
 **length** | **int**|  | [optional]

### Return type

[**GetAccountTransactionsResponse**](GetAccountTransactionsResponse.md)

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

# **get_basic_bvn**
> FinancialGetBasicBvnResponse get_basic_bvn()

Get BVN Information Basic

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.financial_get_basic_bvn_response import FinancialGetBasicBvnResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    account_id = "34c7a2a10b4d4050869fe6f0aa6f0a30" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get BVN Information Basic
        api_response = api_instance.get_basic_bvn(account_id=account_id)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->get_basic_bvn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**|  | [optional]

### Return type

[**FinancialGetBasicBvnResponse**](FinancialGetBasicBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * cf-request-id -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_earning_structure**
> GetEarningStructureResponse get_earning_structure()

Get Earning Structure

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.get_earning_structure_response import GetEarningStructureResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    account_id = "02f63911-a958-4025-9d72-8bd2d7da274b" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Earning Structure
        api_response = api_instance.get_earning_structure(account_id=account_id)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->get_earning_structure: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**|  | [optional]

### Return type

[**GetEarningStructureResponse**](GetEarningStructureResponse.md)

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

# **get_full_bvn**
> FinancialGetFullBvnResponse get_full_bvn()

Get BVN Information Full

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.financial_get_full_bvn_response import FinancialGetFullBvnResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    account_id = "34c7a2a10b4d4050869fe6f0aa6f0a30" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get BVN Information Full
        api_response = api_instance.get_full_bvn(account_id=account_id)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->get_full_bvn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**|  | [optional]

### Return type

[**FinancialGetFullBvnResponse**](FinancialGetFullBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * cf-request-id -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_spending_pattern**
> GetSpendingPatternResponse get_spending_pattern()

Get Spending Pattern

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import financial_api
from dojah_client.model.get_spending_pattern_response import GetSpendingPatternResponse
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
    api_instance = financial_api.FinancialApi(api_client)
    account_id = "02f63911-a958-4025-9d72-8bd2d7da274b" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Spending Pattern
        api_response = api_instance.get_spending_pattern(account_id=account_id)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling FinancialApi->get_spending_pattern: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **str**|  | [optional]

### Return type

[**GetSpendingPatternResponse**](GetSpendingPatternResponse.md)

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

