# AddonApi

All URIs are relative to *https://public.billsby.com/api/v1/rest/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAddonList**](AddonApi.md#getAddonList) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/addons | Get add-ons for specific subscription |
| [**getDetails**](AddonApi.md#getDetails) | **GET** /{companyDomain}/addons/{addonId} | Get add-on details |
| [**listAvailableAddons**](AddonApi.md#listAvailableAddons) | **GET** /{companyDomain}/addons | Get a list of available add-ons |


<a name="getAddonList"></a>
# **getAddonList**
> String getAddonList(companyDomain, subscriptionUniqueId).execute();

Get add-ons for specific subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddonApi;
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
    String subscriptionUniqueId = "subscriptionUniqueId_example"; // The unique identifier of the subscription in the Billsby platform
    try {
      String result = client
              .addon
              .getAddonList(companyDomain, subscriptionUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonApi#getAddonList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .addon
              .getAddonList(companyDomain, subscriptionUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonApi#getAddonList");
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
| **subscriptionUniqueId** | **String**| The unique identifier of the subscription in the Billsby platform | |

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

<a name="getDetails"></a>
# **getDetails**
> AddonGetDetailsResponse getDetails(companyDomain, addonId).execute();

Get add-on details



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddonApi;
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
    Integer addonId = 56; // The unique identifier of the add-on in the Billsby platform
    try {
      AddonGetDetailsResponse result = client
              .addon
              .getDetails(companyDomain, addonId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAddonId());
      System.out.println(result.getName());
      System.out.println(result.getDisplayName());
      System.out.println(result.getSingleUnitName());
      System.out.println(result.getPluralUnitName());
      System.out.println(result.getPricingModelType());
      System.out.println(result.getHasActiveLinkedPlans());
      System.out.println(result.getFeatureTags());
      System.out.println(result.getPlans());
      System.out.println(result.getPriceModels());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddonGetDetailsResponse> response = client
              .addon
              .getDetails(companyDomain, addonId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonApi#getDetails");
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
| **addonId** | **Integer**| The unique identifier of the add-on in the Billsby platform | |

### Return type

[**AddonGetDetailsResponse**](AddonGetDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listAvailableAddons"></a>
# **listAvailableAddons**
> List&lt;AddonListAvailableAddonsResponseInner&gt; listAvailableAddons(companyDomain).execute();

Get a list of available add-ons



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddonApi;
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
      List<AddonListAvailableAddonsResponseInner> result = client
              .addon
              .listAvailableAddons(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonApi#listAvailableAddons");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AddonListAvailableAddonsResponseInner>> response = client
              .addon
              .listAvailableAddons(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddonApi#listAvailableAddons");
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

[**List&lt;AddonListAvailableAddonsResponseInner&gt;**](AddonListAvailableAddonsResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

