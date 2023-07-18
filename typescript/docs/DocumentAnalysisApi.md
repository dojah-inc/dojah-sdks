# DocumentAnalysisApi

All URIs are relative to *https://api.dojah.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeDocument**](DocumentAnalysisApi.md#analyzeDocument) | **POST** /api/v1/document/analysis | KYC - Document Analysis


# **analyzeDocument**

#### **POST** /api/v1/document/analysis


### Example


```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
});

const analyzeDocumentResponse = await dojah.documentAnalysis.analyzeDocument(
  {}
);

console.log(analyzeDocumentResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | (optional) defaults to undefined


### Return type

**AnalyzeDocumentResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


