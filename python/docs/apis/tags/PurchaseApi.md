<a name="__pageTop"></a>
# dojah_client.apis.tags.purchase_api.PurchaseApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send_airtime**](#send_airtime) | **post** /v1/purchase/airtime | Purchase - Send Airtime

# **send_airtime**

Purchase - Send Airtime

### Example

```python
from pprint import pprint
from dojah_client import Dojah, ApiException

dojah = Dojah(
    # Defining the host is optional and defaults to https://api.dojah.io
    # See configuration.py for a list of all supported configuration parameters.
    host="https://api.dojah.io",
    # Configure API key authorization: appIdAuth
    api_key="YOUR_API_KEY",
    # Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    # api_key_prefix = {'appIdAuth': 'Bearer'},
    # Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    # api_key_prefix = {'noauthAuth': 'Bearer'},
)

try:
    # Purchase - Send Airtime
    send_airtime_response = dojah.purchase.send_airtime(
        destination="08068810228",  # optional
        amount="100",  # optional
    )
    pprint(send_airtime_response.body)
    pprint(send_airtime_response.body["entity"])
    pprint(send_airtime_response.headers)
    pprint(send_airtime_response.status)
    pprint(send_airtime_response.round_trip_time)
except ApiException as e:
    print("Exception when calling PurchaseApi.send_airtime: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PurchaseAirtimeRequest**](../../models/PurchaseAirtimeRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#send_airtime.ApiResponseFor200) | OK

#### send_airtime.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | ResponseHeadersFor200 |  |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PurchaseAirtimeResponse**](../../models/PurchaseAirtimeResponse.md) |  | 

#### ResponseHeadersFor200

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Date | DateSchema | | optional
Transfer-Encoding | TransferEncodingSchema | | optional
Connection | ConnectionSchema | | optional
access-control-allow-origin | AccessControlAllowOriginSchema | | optional
x-moesif-transaction-id | XMoesifTransactionIdSchema | | optional
etag | EtagSchema | | optional
vary | VarySchema | | optional
CF-Cache-Status | CFCacheStatusSchema | | optional
Expect-CT | ExpectCTSchema | | optional
Report-To | ReportToSchema | | optional
NEL | NELSchema | | optional
Server | ServerSchema | | optional
CF-RAY | CFRAYSchema | | optional
Content-Encoding | ContentEncodingSchema | | optional
alt-svc | AltSvcSchema | | optional

# DateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# TransferEncodingSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ConnectionSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccessControlAllowOriginSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# XMoesifTransactionIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# EtagSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# VarySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CFCacheStatusSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ExpectCTSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ReportToSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# NELSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ServerSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CFRAYSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ContentEncodingSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AltSvcSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 


### Authorization

[appIdAuth](../../../README.md#appIdAuth), [noauthAuth](../../../README.md#noauthAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

