# DocumentAnalysisApi

All URIs are relative to *https://api.dojah.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyzeDocument**](DocumentAnalysisApi.md#analyzeDocument) | **POST** /api/v1/document/analysis | KYC - Document Analysis |


<a name="analyzeDocument"></a>
# **analyzeDocument**
> AnalyzeDocumentResponse analyzeDocument().execute();

KYC - Document Analysis

### Example
```java
import com.konfigthis.dojah.client.ApiClient;
import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.ApiResponse;
import com.konfigthis.dojah.client.Dojah;
import com.konfigthis.dojah.client.Configuration;
import com.konfigthis.dojah.client.auth.*;
import com.konfigthis.dojah.client.model.*;
import com.konfigthis.dojah.client.api.DocumentAnalysisApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dojah.io";
    
    // Configure API key authorization: appIdAuth
    configuration.Appid  = "YOUR API KEY";

    Dojah client = new Dojah(configuration);
    try {
      AnalyzeDocumentResponse result = client
              .documentAnalysis
              .analyzeDocument()
              .execute();
      System.out.println(result);

      System.out.println(result.getEntity());

    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAnalysisApi#analyzeDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnalyzeDocumentResponse> response = client
              .documentAnalysis
              .analyzeDocument()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentAnalysisApi#analyzeDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AnalyzeDocumentResponse**](AnalyzeDocumentResponse.md)

### Authorization

[appIdAuth](../README.md#appIdAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

