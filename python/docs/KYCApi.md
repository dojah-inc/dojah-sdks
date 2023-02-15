# dojah_client.KYCApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze_document**](KYCApi.md#analyze_document) | **POST** /api/v1/document/analysis | KYC - Document Analysis
[**get_basic_bvn**](KYCApi.md#get_basic_bvn) | **GET** /api/v1/kyc/bvn/basic | KYC - Get Basic BVN Info
[**get_basic_phone_number**](KYCApi.md#get_basic_phone_number) | **GET** /v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic
[**get_drivers_license**](KYCApi.md#get_drivers_license) | **GET** /api/v1/kyc/dl | KYC - Get Drivers License Info
[**get_email_reputation**](KYCApi.md#get_email_reputation) | **GET** /v1/kyc/email | KYC - Get Email Reputation
[**get_full_bvn**](KYCApi.md#get_full_bvn) | **GET** /api/v1/kyc/bvn/full | KYC - Lookup BVN Basic
[**get_nuban**](KYCApi.md#get_nuban) | **GET** /api/v1/kyc/nuban | KYC - Get NUBAN Information
[**get_passport**](KYCApi.md#get_passport) | **GET** /api/v1/kyc/passport | KYC - Passport
[**get_phone_number**](KYCApi.md#get_phone_number) | **GET** /api/v1/kyc/phone_number | KYC - Lookup Phone Number
[**get_premium_bvn**](KYCApi.md#get_premium_bvn) | **GET** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium
[**get_vin**](KYCApi.md#get_vin) | **GET** /api/v1/kyc/vin | KYC - Get VIN
[**get_vnin**](KYCApi.md#get_vnin) | **GET** /api/v1/kyc/vnin | Lookup VNIN
[**validate_bvn**](KYCApi.md#validate_bvn) | **GET** /api/v1/kyc/bvn | KYC - Validate BVN
[**verify_age**](KYCApi.md#verify_age) | **GET** /v1/kyc/age_verification | KYC - Age Verification
[**verify_selfie_bvn**](KYCApi.md#verify_selfie_bvn) | **POST** /v1/kyc/bvn/verify | KYC - Selfie BVN Verificatoin
[**verify_selfie_nin**](KYCApi.md#verify_selfie_nin) | **POST** /v1/kyc/nin/verify | KYC - Selfie NIN Verification


# **analyze_document**
> AnalyzeDocumentResponse analyze_document()

KYC - Document Analysis

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.analyze_document_response import AnalyzeDocumentResponse
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
    api_instance = kyc_api.KYCApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # KYC - Document Analysis
        api_response = api_instance.analyze_document()
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->analyze_document: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**AnalyzeDocumentResponse**](AnalyzeDocumentResponse.md)

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

# **get_basic_bvn**
> GetBasicBvnResponse get_basic_bvn()

KYC - Get Basic BVN Info

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_basic_bvn_response import GetBasicBvnResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    bvn = 22468537919 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Get Basic BVN Info
        api_response = api_instance.get_basic_bvn(bvn=bvn)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_basic_bvn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **int**|  | [optional]

### Return type

[**GetBasicBvnResponse**](GetBasicBvnResponse.md)

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

# **get_basic_phone_number**
> GetBasicPhoneNumberResponse get_basic_phone_number()

KYC Lookup Phone Number Basic

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_basic_phone_number_response import GetBasicPhoneNumberResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    phone_number = 8068810228 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC Lookup Phone Number Basic
        api_response = api_instance.get_basic_phone_number(phone_number=phone_number)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_basic_phone_number: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **int**|  | [optional]

### Return type

[**GetBasicPhoneNumberResponse**](GetBasicPhoneNumberResponse.md)

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

# **get_drivers_license**
> GetKycDriversLicenseResponse get_drivers_license()

KYC - Get Drivers License Info

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_kyc_drivers_license_response import GetKycDriversLicenseResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    license_number = "FKJ49409AB13" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Get Drivers License Info
        api_response = api_instance.get_drivers_license(license_number=license_number)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_drivers_license: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **license_number** | **str**|  | [optional]

### Return type

[**GetKycDriversLicenseResponse**](GetKycDriversLicenseResponse.md)

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

# **get_email_reputation**
> GetEmailReputationResponse get_email_reputation()

KYC - Get Email Reputation

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_email_reputation_response import GetEmailReputationResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    email = "johndoe@gmail.com" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Get Email Reputation
        api_response = api_instance.get_email_reputation(email=email)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_email_reputation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**|  | [optional]

### Return type

[**GetEmailReputationResponse**](GetEmailReputationResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * CF-Ray -  <br>  * Access-Control-Allow-Origin -  <br>  * ETag -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * X-Powered-By -  <br>  * Report-To -  <br>  * NEL -  <br>  * Vary -  <br>  * Server -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_full_bvn**
> GetFullBvnResponse get_full_bvn()

KYC - Lookup BVN Basic

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_full_bvn_response import GetFullBvnResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    bvn = 22222222222 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Lookup BVN Basic
        api_response = api_instance.get_full_bvn(bvn=bvn)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_full_bvn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **int**|  | [optional]

### Return type

[**GetFullBvnResponse**](GetFullBvnResponse.md)

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
> GetNubanResponse get_nuban()

KYC - Get NUBAN Information

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_nuban_response import GetNubanResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    bank_code = 58 # int |  (optional)
    account_number = 11223344 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Get NUBAN Information
        api_response = api_instance.get_nuban(bank_code=bank_code, account_number=account_number)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_nuban: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_code** | **int**|  | [optional]
 **account_number** | **int**|  | [optional]

### Return type

[**GetNubanResponse**](GetNubanResponse.md)

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

# **get_passport**
> GetKycPassportResponse get_passport()

KYC - Passport

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_kyc_passport_response import GetKycPassportResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    passport_number = 70142502085 # int |  (optional)
    surname = "ololade" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Passport
        api_response = api_instance.get_passport(passport_number=passport_number, surname=surname)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_passport: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passport_number** | **int**|  | [optional]
 **surname** | **str**|  | [optional]

### Return type

[**GetKycPassportResponse**](GetKycPassportResponse.md)

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

# **get_phone_number**
> GetPhoneNumberResponse get_phone_number()

KYC - Lookup Phone Number

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_phone_number404_response import GetPhoneNumber404Response
from dojah_client.model.get_phone_number_response import GetPhoneNumberResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    phone_number = 8011111111 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Lookup Phone Number
        api_response = api_instance.get_phone_number(phone_number=phone_number)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_phone_number: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **int**|  | [optional]

### Return type

[**GetPhoneNumberResponse**](GetPhoneNumberResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_premium_bvn**
> GetPremiumBvnResponse get_premium_bvn()

KYC - Lookup BVN Premium

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_premium_bvn_response import GetPremiumBvnResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    bvn = 22305638508 # int |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Lookup BVN Premium
        api_response = api_instance.get_premium_bvn(bvn=bvn)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_premium_bvn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **int**|  | [optional]

### Return type

[**GetPremiumBvnResponse**](GetPremiumBvnResponse.md)

### Authorization

[apikeyAuth](../README.md#apikeyAuth), [appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * access-control-allow-origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * etag -  <br>  * vary -  <br>  * CF-Cache-Status -  <br>  * Expect-CT -  <br>  * Report-To -  <br>  * NEL -  <br>  * Server -  <br>  * CF-RAY -  <br>  * Content-Encoding -  <br>  * alt-svc -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vin**
> GetVinResponse get_vin()

KYC - Get VIN

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_vin_response import GetVinResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    mode = "vin" # str |  (optional)
    firstname = "moshood" # str |  (optional)
    lastname = "saliu" # str |  (optional)
    vin = 55586 # int |  (optional)
    state = "ondo" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Get VIN
        api_response = api_instance.get_vin(mode=mode, firstname=firstname, lastname=lastname, vin=vin, state=state)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_vin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | **str**|  | [optional]
 **firstname** | **str**|  | [optional]
 **lastname** | **str**|  | [optional]
 **vin** | **int**|  | [optional]
 **state** | **str**|  | [optional]

### Return type

[**GetVinResponse**](GetVinResponse.md)

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

# **get_vnin**
> GetVninResponse get_vnin()

Lookup VNIN

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.get_vnin_response import GetVninResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    vnin = "AB012345678910YZ" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Lookup VNIN
        api_response = api_instance.get_vnin(vnin=vnin)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->get_vnin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vnin** | **str**|  | [optional]

### Return type

[**GetVninResponse**](GetVninResponse.md)

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

# **validate_bvn**
> ValidateBvnResponse validate_bvn()

KYC - Validate BVN

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.validate_bvn_response import ValidateBvnResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    bvn = 22250148240 # int |  (optional)
    first_name = "FRANCIS" # str |  (optional)
    dob = "1982-02-19" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Validate BVN
        api_response = api_instance.validate_bvn(bvn=bvn, first_name=first_name, dob=dob)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->validate_bvn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bvn** | **int**|  | [optional]
 **first_name** | **str**|  | [optional]
 **dob** | **str**|  | [optional]

### Return type

[**ValidateBvnResponse**](ValidateBvnResponse.md)

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

# **verify_age**
> VerifyAgeResponse verify_age()

KYC - Age Verification

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.verify_age_response import VerifyAgeResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    mode = "account_number" # str |  (optional)
    account_number = 3046507407 # int |  (optional)
    bank_code = 11 # int |  (optional)
    dob = "1993-06-10" # str |  (optional)
    first_name = "Mosh" # str |  (optional)
    last_name = "Saliu" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Age Verification
        api_response = api_instance.verify_age(mode=mode, account_number=account_number, bank_code=bank_code, dob=dob, first_name=first_name, last_name=last_name)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->verify_age: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | **str**|  | [optional]
 **account_number** | **int**|  | [optional]
 **bank_code** | **int**|  | [optional]
 **dob** | **str**|  | [optional]
 **first_name** | **str**|  | [optional]
 **last_name** | **str**|  | [optional]

### Return type

[**VerifyAgeResponse**](VerifyAgeResponse.md)

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

# **verify_selfie_bvn**
> VerifySelfieBvnResponse verify_selfie_bvn()

KYC - Selfie BVN Verificatoin

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.verify_selfie_bvn_request import VerifySelfieBvnRequest
from dojah_client.model.verify_selfie_bvn_response import VerifySelfieBvnResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    verify_selfie_bvn_request = VerifySelfieBvnRequest(
        bvn="22468537919",
        selfie_image="<base64 encoded image>",
    ) # VerifySelfieBvnRequest |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Selfie BVN Verificatoin
        api_response = api_instance.verify_selfie_bvn(verify_selfie_bvn_request=verify_selfie_bvn_request)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->verify_selfie_bvn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verify_selfie_bvn_request** | [**VerifySelfieBvnRequest**](VerifySelfieBvnRequest.md)|  | [optional]

### Return type

[**VerifySelfieBvnResponse**](VerifySelfieBvnResponse.md)

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

# **verify_selfie_nin**
> VerifySelfieNinResponse verify_selfie_nin()

KYC - Selfie NIN Verification

### Example

* Api Key Authentication (apikeyAuth):
* Api Key Authentication (appIdAuth):

```python
import time
import dojah_client
from dojah_client.api import kyc_api
from dojah_client.model.verify_selfie_nin_request import VerifySelfieNinRequest
from dojah_client.model.verify_selfie_nin_response import VerifySelfieNinResponse
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
    api_instance = kyc_api.KYCApi(api_client)
    verify_selfie_nin_request = VerifySelfieNinRequest(
        nin="79628483753",
        selfie_image="<base64 encoded image>",
    ) # VerifySelfieNinRequest |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # KYC - Selfie NIN Verification
        api_response = api_instance.verify_selfie_nin(verify_selfie_nin_request=verify_selfie_nin_request)
        pprint(api_response)
    except dojah_client.ApiException as e:
        print("Exception when calling KYCApi->verify_selfie_nin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verify_selfie_nin_request** | [**VerifySelfieNinRequest**](VerifySelfieNinRequest.md)|  | [optional]

### Return type

[**VerifySelfieNinResponse**](VerifySelfieNinResponse.md)

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

