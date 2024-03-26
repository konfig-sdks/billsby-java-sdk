# CreditnoteApi

All URIs are relative to *https://public.billsby.com/api/v1/rest/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](CreditnoteApi.md#list) | **GET** /{companyDomain}/companies/creditnotes | Company credit notes |
| [**reattemptPayment**](CreditnoteApi.md#reattemptPayment) | **PUT** /{companyDomain} /creditNotes /{creditNoteNumber} /Payment | Reattempt credit note payment |


<a name="list"></a>
# **list**
> CreditnoteListResponse list(companyDomain, page, pageSize).query(query).orderBy(orderBy).orderByDescending(orderByDescending).isPending(isPending).isPaid(isPaid).isFailed(isFailed).execute();

Company credit notes

Get a list of all your company&#39;s credit notes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CreditnoteApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    Integer page = 56; // The page of credit notes you would like to view
    Integer pageSize = 56; // The number of records to return per page (max 100)
    String query = "query_example"; // Add search terms here to filter results
    String orderBy = "orderBy_example"; // Sort the results by particular properties
    String orderByDescending = "orderByDescending_example"; // Sort the results by particular properties in descending order
    Boolean isPending = true; // Do you want to show credit notes with the status 'pending'; true or false
    Boolean isPaid = true; // Do you want to show credit notes with the status 'paid'; true or false
    Boolean isFailed = true; // Do you want to show credit notes with the status 'failed'; true or false
    try {
      CreditnoteListResponse result = client
              .creditnote
              .list(companyDomain, page, pageSize)
              .query(query)
              .orderBy(orderBy)
              .orderByDescending(orderByDescending)
              .isPending(isPending)
              .isPaid(isPaid)
              .isFailed(isFailed)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrentPage());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getRowCount());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditnoteApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreditnoteListResponse> response = client
              .creditnote
              .list(companyDomain, page, pageSize)
              .query(query)
              .orderBy(orderBy)
              .orderByDescending(orderByDescending)
              .isPending(isPending)
              .isPaid(isPaid)
              .isFailed(isFailed)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditnoteApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyDomain** | **String**| Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets | |
| **page** | **Integer**| The page of credit notes you would like to view | |
| **pageSize** | **Integer**| The number of records to return per page (max 100) | |
| **query** | **String**| Add search terms here to filter results | [optional] |
| **orderBy** | **String**| Sort the results by particular properties | [optional] |
| **orderByDescending** | **String**| Sort the results by particular properties in descending order | [optional] |
| **isPending** | **Boolean**| Do you want to show credit notes with the status &#39;pending&#39;; true or false | [optional] |
| **isPaid** | **Boolean**| Do you want to show credit notes with the status &#39;paid&#39;; true or false | [optional] |
| **isFailed** | **Boolean**| Do you want to show credit notes with the status &#39;failed&#39;; true or false | [optional] |

### Return type

[**CreditnoteListResponse**](CreditnoteListResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="reattemptPayment"></a>
# **reattemptPayment**
> String reattemptPayment(creditNoteNumber, companyDomain).execute();

Reattempt credit note payment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CreditnoteApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String creditNoteNumber = "creditNoteNumber_example"; // The unique identifier of the credit note in the Billsby platform
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    try {
      String result = client
              .creditnote
              .reattemptPayment(creditNoteNumber, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditnoteApi#reattemptPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .creditnote
              .reattemptPayment(creditNoteNumber, companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditnoteApi#reattemptPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **creditNoteNumber** | **String**| The unique identifier of the credit note in the Billsby platform | |
| **companyDomain** | **String**| Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

