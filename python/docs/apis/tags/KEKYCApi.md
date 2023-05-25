<a name="__pageTop"></a>
# dojah_client.apis.tags.kekyc_api.KEKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_national_id**](#get_national_id) | **get** /api/v1/ke/kyc/id | KYC - National ID

# **get_national_id**

KYC - National ID

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
    # KYC - National ID
    get_national_id_response = dojah.ke_kyc.get_national_id(
        id=24798402,  # optional
        first_name="ZEDEKIAH",  # optional
        last_name="ANDENGA",  # optional
        middle_name="string_example",  # optional
        date_of_birth="1985-12-29",  # optional
        gender="M",  # optional
    )
    pprint(get_national_id_response.body)
    pprint(get_national_id_response.body["entity"])
    pprint(get_national_id_response.headers)
    pprint(get_national_id_response.status)
    pprint(get_national_id_response.round_trip_time)
except ApiException as e:
    print("Exception when calling KEKYCApi.get_national_id: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
id | IdSchema | | optional
first_name | FirstNameSchema | | optional
last_name | LastNameSchema | | optional
middle_name | MiddleNameSchema | | optional
date_of_birth | DateOfBirthSchema | | optional
gender | GenderSchema | | optional


# IdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

# FirstNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LastNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# MiddleNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# DateOfBirthSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# GenderSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_national_id.ApiResponseFor200) | Successful response

#### get_national_id.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**GetNationalIdResponse**](../../models/GetNationalIdResponse.md) |  | 


### Authorization

[apikeyAuth](../../../README.md#apikeyAuth), [appIdAuth](../../../README.md#appIdAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

