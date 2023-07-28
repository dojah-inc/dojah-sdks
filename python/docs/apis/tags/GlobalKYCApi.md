<a name="__pageTop"></a>
# dojah_client.apis.tags.global_kyc_api.GlobalKYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ca_ekyc**](#ca_ekyc) | **get** /api/v1/ca/kyc | Canada Ekyc
[**get_us_ssn**](#get_us_ssn) | **get** /api/v1/us/kyc | US SSN
[**uk_two_plus_two**](#uk_two_plus_two) | **get** /api/v1/uk/kyc | UK 2+2

# **ca_ekyc**

Canada Ekyc

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
)

try:
    # Canada Ekyc
    ca_ekyc_response = dojah.global_kyc.ca_ekyc(
        country="GBR",  # optional
        first_name="Tobi",  # optional
        last_name="Ololade",  # optional
        street_name="Street 1",  # optional
        date_of_birth="1992-05-18",  # optional
        house_number=25,  # optional
        post_code=1234,  # optional
    )
    pprint(ca_ekyc_response.headers)
    pprint(ca_ekyc_response.status)
    pprint(ca_ekyc_response.round_trip_time)
except ApiException as e:
    print("Exception when calling GlobalKYCApi.ca_ekyc: %s\n" % e)
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
country | CountrySchema | | optional
first_name | FirstNameSchema | | optional
last_name | LastNameSchema | | optional
street_name | StreetNameSchema | | optional
date_of_birth | DateOfBirthSchema | | optional
house_number | HouseNumberSchema | | optional
post_code | PostCodeSchema | | optional


# CountrySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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

# StreetNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# DateOfBirthSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# HouseNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

# PostCodeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#ca_ekyc.ApiResponseFor200) | Successful response

#### ca_ekyc.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Authorization

[appIdAuth](../../../README.md#appIdAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_us_ssn**

US SSN

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
)

try:
    # US SSN
    get_us_ssn_response = dojah.global_kyc.get_us_ssn(
        country="GBR",  # optional
        first_name="Tobi",  # optional
        last_name="Ololade",  # optional
        street_name="Street 1",  # optional
        date_of_birth="1992-05-18",  # optional
        house_number=25,  # optional
        post_code=1234,  # optional
    )
    pprint(get_us_ssn_response.headers)
    pprint(get_us_ssn_response.status)
    pprint(get_us_ssn_response.round_trip_time)
except ApiException as e:
    print("Exception when calling GlobalKYCApi.get_us_ssn: %s\n" % e)
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
country | CountrySchema | | optional
first_name | FirstNameSchema | | optional
last_name | LastNameSchema | | optional
street_name | StreetNameSchema | | optional
date_of_birth | DateOfBirthSchema | | optional
house_number | HouseNumberSchema | | optional
post_code | PostCodeSchema | | optional


# CountrySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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

# StreetNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# DateOfBirthSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# HouseNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

# PostCodeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_us_ssn.ApiResponseFor200) | Successful response

#### get_us_ssn.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Authorization

[appIdAuth](../../../README.md#appIdAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **uk_two_plus_two**

UK 2+2

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
)

try:
    # UK 2+2
    uk_two_plus_two_response = dojah.global_kyc.uk_two_plus_two(
        country="GBR",  # optional
        first_name="Tobi",  # optional
        last_name="Ololade",  # optional
        street_name="Street 1",  # optional
        date_of_birth="1992-05-18",  # optional
        house_number=25,  # optional
        post_code=1234,  # optional
    )
    pprint(uk_two_plus_two_response.headers)
    pprint(uk_two_plus_two_response.status)
    pprint(uk_two_plus_two_response.round_trip_time)
except ApiException as e:
    print("Exception when calling GlobalKYCApi.uk_two_plus_two: %s\n" % e)
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
country | CountrySchema | | optional
first_name | FirstNameSchema | | optional
last_name | LastNameSchema | | optional
street_name | StreetNameSchema | | optional
date_of_birth | DateOfBirthSchema | | optional
house_number | HouseNumberSchema | | optional
post_code | PostCodeSchema | | optional


# CountrySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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

# StreetNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# DateOfBirthSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# HouseNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

# PostCodeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#uk_two_plus_two.ApiResponseFor200) | Successful response

#### uk_two_plus_two.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Authorization

[appIdAuth](../../../README.md#appIdAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

