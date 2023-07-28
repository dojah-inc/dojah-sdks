<a name="__pageTop"></a>
# dojah_client.apis.tags.document_analysis_api.DocumentAnalysisApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze_document**](#analyze_document) | **post** /api/v1/document/analysis | KYC - Document Analysis

# **analyze_document**

KYC - Document Analysis

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
    # KYC - Document Analysis
    analyze_document_response = dojah.document_analysis.analyze_document()
    pprint(analyze_document_response.body)
    pprint(analyze_document_response.body["entity"])
    pprint(analyze_document_response.headers)
    pprint(analyze_document_response.status)
    pprint(analyze_document_response.round_trip_time)
except ApiException as e:
    print("Exception when calling DocumentAnalysisApi.analyze_document: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#analyze_document.ApiResponseFor200) | Successful response

#### analyze_document.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AnalyzeDocumentResponse**](../../models/AnalyzeDocumentResponse.md) |  | 


### Authorization

[apikeyAuth](../../../README.md#apikeyAuth), [appIdAuth](../../../README.md#appIdAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

