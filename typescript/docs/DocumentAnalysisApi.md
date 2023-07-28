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
  authorization: "API_KEY",
  appId: "API_KEY",
});

const analyzeDocumentResponse = await dojah.documentAnalysis.analyzeDocument();

console.log(analyzeDocumentResponse);
```


### Parameters
This endpoint does not need any parameter.


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


