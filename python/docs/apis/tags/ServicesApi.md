<a name="__pageTop"></a>
# dojah_client.apis.tags.services_api.ServicesApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categorize_transactions**](#categorize_transactions) | **post** /v1/ml/categorize_transaction | Categorize Transactions

# **categorize_transactions**

Categorize Transactions

### Example

```python
from pprint import pprint
from dojah_client import Dojah, ApiException

dojah = Dojah(
    # Defining the host is optional and defaults to https://api.dojah.io
    # See configuration.py for a list of all supported configuration parameters.
    host="https://api.dojah.io",
    # Configure API key authorization: apikeyAuth
    authorization="YOUR_API_KEY",
    # Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    # api_key_prefix = {'apikeyAuth': 'Bearer'},
    # Configure API key authorization: appIdAuth
    app_id="YOUR_API_KEY",
    # Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    # api_key_prefix = {'appIdAuth': 'Bearer'},
)

try:
    # Categorize Transactions
    categorize_transactions_response = dojah.services.categorize_transactions(
        description="POS/WEB PURCHASE TRANSACTION -047608- -253842-MUNCHIES BY MOE OY OYNG",  # optional
        trans_type="debit",  # optional
    )
    pprint(categorize_transactions_response.body)
    pprint(categorize_transactions_response.body["entity"])
    pprint(categorize_transactions_response.headers)
    pprint(categorize_transactions_response.status)
    pprint(categorize_transactions_response.round_trip_time)
except ApiException as e:
    print("Exception when calling ServicesApi.categorize_transactions: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CategorizeTransactionsRequest**](../../models/CategorizeTransactionsRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#categorize_transactions.ApiResponseFor200) | OK

#### categorize_transactions.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | ResponseHeadersFor200 |  |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CategorizeTransactionsResponse**](../../models/CategorizeTransactionsResponse.md) |  | 

#### ResponseHeadersFor200

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Powered-By | XPoweredBySchema | | optional
Access-Control-Allow-Origin | AccessControlAllowOriginSchema | | optional
Content-Length | ContentLengthSchema | | optional
ETag | ETagSchema | | optional
Date | DateSchema | | optional
Connection | ConnectionSchema | | optional

# XPoweredBySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccessControlAllowOriginSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ContentLengthSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

# ETagSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# DateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ConnectionSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 


### Authorization

[apikeyAuth](../../../README.md#apikeyAuth), [appIdAuth](../../../README.md#appIdAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

