# MlApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocumentAnalysis**](MlApi.md#getDocumentAnalysis) | **POST** /v1/document/analysis/dl | Document Analysis Drivers License
[**getGenericOcrText**](MlApi.md#getGenericOcrText) | **POST** /v1/ml/ocr/generic | Generic OCR Service
[**getOcrText**](MlApi.md#getOcrText) | **POST** /v1/ml/ocr | BVN Ocr
[**verifyPhotoIdWithSelfie**](MlApi.md#verifyPhotoIdWithSelfie) | **POST** /v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification


# **getDocumentAnalysis**

#### **POST** /v1/document/analysis/dl


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getDocumentAnalysisResponse = await dojah.ml.getDocumentAnalysis({
  img: "<base64 encoded image>",
});

console.log(getDocumentAnalysisResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDocumentAnalysisRequest** | **GetDocumentAnalysisRequest**|  |


### Return type

**GetDocumentAnalysisResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * Access-Control-Allow-Origin -  <br>  * x-moesif-transaction-id -  <br>  * service -  <br>  * product -  <br>  * price -  <br>  * Content-Length -  <br>  * ETag -  <br>  * Vary -  <br>  * Date -  <br>  * Connection -  <br>  * Keep-Alive -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getGenericOcrText**

#### **POST** /v1/ml/ocr/generic


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getGenericOcrTextResponse = await dojah.ml.getGenericOcrText({
  img: "<base64 encoded image>",
});

console.log(getGenericOcrTextResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getGenericOcrTextRequest** | **GetGenericOcrTextRequest**|  |


### Return type

**GetGenericOcrTextResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getOcrText**

#### **POST** /v1/ml/ocr


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const getOcrTextResponse = await dojah.ml.getOcrText({
  image: "<base64 encoded image>",
});

console.log(getOcrTextResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getOcrTextRequest** | **GetOcrTextRequest**|  |


### Return type

**GetOcrTextResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **verifyPhotoIdWithSelfie**

#### **POST** /v1/kyc/photoid/verify


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  Authorization: "API_KEY",
  AppId: "API_KEY",
});

const verifyPhotoIdWithSelfieResponse = await dojah.ml.verifyPhotoIdWithSelfie({
  selfie_image: "<base64 encoded image>",
  photoid_image: "<base64 encoded image>",
});

console.log(verifyPhotoIdWithSelfieResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyPhotoIdWithSelfieRequest** | **VerifyPhotoIdWithSelfieRequest**|  |


### Return type

**VerifyPhotoIdWithSelfieResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


