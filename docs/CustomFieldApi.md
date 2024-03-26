# CustomFieldApi

All URIs are relative to *https://public.billsby.com/api/v1/rest/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewField**](CustomFieldApi.md#createNewField) | **POST** /{companyDomain}/customfields | Create custom field |
| [**getResponse**](CustomFieldApi.md#getResponse) | **GET** /{companyDomain}/customfieldResponses | Custom fields response |
| [**list**](CustomFieldApi.md#list) | **GET** /{companyDomain}/customfields | Custom fields |
| [**updateField**](CustomFieldApi.md#updateField) | **PUT** /{companyDomain}/customfields/{customFieldId} | Update custom field |


<a name="createNewField"></a>
# **createNewField**
> String createNewField(companyDomain).customFieldCreateNewFieldRequest(customFieldCreateNewFieldRequest).execute();

Create custom field



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String description = "description_example"; // Description of the custom field
    Integer type = 56; // The type of custom field; SingleLineTextField = 0, MultiLineTextField = 1, CheckboxField = 2, DatePickerField = 3, NumbersField = 4, DropdownField = 5
    String label = "label_example"; // Title of the custom field
    Boolean compulsory = true; // Is the custom field compulsory; true or false
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    String options = "options_example"; // A comma separated list of option titles for DropdownField type
    try {
      String result = client
              .customField
              .createNewField(description, type, label, compulsory, companyDomain)
              .options(options)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#createNewField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .customField
              .createNewField(description, type, label, compulsory, companyDomain)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#createNewField");
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
| **customFieldCreateNewFieldRequest** | [**CustomFieldCreateNewFieldRequest**](CustomFieldCreateNewFieldRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getResponse"></a>
# **getResponse**
> List&lt;CustomFieldGetResponseResponseInner&gt; getResponse(companyDomain).productId(productId).customerUniqueId(customerUniqueId).execute();

Custom fields response



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldApi;
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
    Integer productId = 56; // The unique identifier of the product in the Billsby platform
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the customer in the Billsby platform
    try {
      List<CustomFieldGetResponseResponseInner> result = client
              .customField
              .getResponse(companyDomain)
              .productId(productId)
              .customerUniqueId(customerUniqueId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#getResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CustomFieldGetResponseResponseInner>> response = client
              .customField
              .getResponse(companyDomain)
              .productId(productId)
              .customerUniqueId(customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#getResponse");
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
| **productId** | **Integer**| The unique identifier of the product in the Billsby platform | [optional] |
| **customerUniqueId** | **String**| The unique identifier of the customer in the Billsby platform | [optional] |

### Return type

[**List&lt;CustomFieldGetResponseResponseInner&gt;**](CustomFieldGetResponseResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="list"></a>
# **list**
> List&lt;CustomFieldListResponseInner&gt; list(companyDomain).execute();

Custom fields



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldApi;
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
    try {
      List<CustomFieldListResponseInner> result = client
              .customField
              .list(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CustomFieldListResponseInner>> response = client
              .customField
              .list(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#list");
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

### Return type

[**List&lt;CustomFieldListResponseInner&gt;**](CustomFieldListResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateField"></a>
# **updateField**
> String updateField(companyDomain, customFieldId).customFieldUpdateFieldRequest(customFieldUpdateFieldRequest).execute();

Update custom field

Update an existing custom field

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldApi;
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
    String customFieldId = "customFieldId_example"; // The unique identifier of the custom field in the Billsby platform
    String description = "description_example"; // Description of the custom field
    String label = "label_example"; // Title of the custom field
    String options = "options_example"; // A comma separated list of option titles for DropdownField type
    Boolean compulsory = true; // Is the custom field compulsory; true or false
    try {
      String result = client
              .customField
              .updateField(companyDomain, customFieldId)
              .description(description)
              .label(label)
              .options(options)
              .compulsory(compulsory)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#updateField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .customField
              .updateField(companyDomain, customFieldId)
              .description(description)
              .label(label)
              .options(options)
              .compulsory(compulsory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldApi#updateField");
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
| **customFieldId** | **String**| The unique identifier of the custom field in the Billsby platform | |
| **customFieldUpdateFieldRequest** | [**CustomFieldUpdateFieldRequest**](CustomFieldUpdateFieldRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

