# dojah_client.MLApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_document_analysis**](MLApi.md#get_document_analysis) | **POST** /v1/document/analysis/dl | Document Analysis Drivers License
[**get_generic_ocr_text**](MLApi.md#get_generic_ocr_text) | **POST** /v1/ml/ocr/generic | Generic OCR Service
[**get_ocr_text**](MLApi.md#get_ocr_text) | **POST** /v1/ml/ocr | BVN Ocr
[**verify_photo_id_with_selfie**](MLApi.md#verify_photo_id_with_selfie) | **POST** /v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification


# **get_document_analysis**
> GetDocumentAnalysisResponse get_document_analysis()

Document Analysis Drivers License

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import ml_api
from dojah_client.model.get_document_analysis_response import GetDocumentAnalysisResponse
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
    api_instance = ml_api.MLApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Document Analysis Drivers License
        api_response = api_instance.get_document_analysis(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling MLApi->get_document_analysis: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**GetDocumentAnalysisResponse**](GetDocumentAnalysisResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_generic_ocr_text**
> GetGenericOcrTextResponse get_generic_ocr_text()

Generic OCR Service

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import ml_api
from dojah_client.model.get_generic_ocr_text_response import GetGenericOcrTextResponse
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
    api_instance = ml_api.MLApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Generic OCR Service
        api_response = api_instance.get_generic_ocr_text(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling MLApi->get_generic_ocr_text: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**GetGenericOcrTextResponse**](GetGenericOcrTextResponse.md)

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

# **get_ocr_text**
> GetOcrTextResponse get_ocr_text()

BVN Ocr

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import ml_api
from dojah_client.model.get_ocr_text_response import GetOcrTextResponse
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
    api_instance = ml_api.MLApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # BVN Ocr
        api_response = api_instance.get_ocr_text(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling MLApi->get_ocr_text: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**GetOcrTextResponse**](GetOcrTextResponse.md)

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

# **verify_photo_id_with_selfie**
> VerifyPhotoIdWithSelfieResponse verify_photo_id_with_selfie()

KYC - Selfie Photo ID Verification

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import ml_api
from dojah_client.model.verify_photo_id_with_selfie_response import VerifyPhotoIdWithSelfieResponse
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
    api_instance = ml_api.MLApi(api_client)
    body = {} # {str: (bool, dict, float, int, list, str, none_type)} |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Selfie Photo ID Verification
        api_response = api_instance.verify_photo_id_with_selfie(body=body)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling MLApi->verify_photo_id_with_selfie: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **{str: (bool, dict, float, int, list, str, none_type)}**|  | [optional]

### Return type

[**VerifyPhotoIdWithSelfieResponse**](VerifyPhotoIdWithSelfieResponse.md)

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

