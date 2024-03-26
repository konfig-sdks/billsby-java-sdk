# SubscriptionApi

All URIs are relative to *https://public.billsby.com/api/v1/rest/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFeatureTags**](SubscriptionApi.md#addFeatureTags) | **POST** /{companyDomain}/subscriptions/tags | Add feature tags |
| [**cancelSubscription**](SubscriptionApi.md#cancelSubscription) | **DELETE** /{companyDomain}/subscriptions/{subscriptionUniqueId} | Cancel a subscription |
| [**changePlan**](SubscriptionApi.md#changePlan) | **PUT** /{companyDomain}/subscriptions/{subscriptionUniqueId}/plan | Change plan |
| [**featureTagsSplit**](SubscriptionApi.md#featureTagsSplit) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/tags/split | Feature tags by plan and custom tags |
| [**getCountersValue**](SubscriptionApi.md#getCountersValue) | **GET** /usage/{companyDomain}/subscriptions/{subscriptionUniqueId}/counters/{counterId} | Counter value |
| [**getDetails**](SubscriptionApi.md#getDetails) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId} | Subscription details |
| [**getEventLogs**](SubscriptionApi.md#getEventLogs) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/logs | Event logs |
| [**getShippingAddress**](SubscriptionApi.md#getShippingAddress) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/shippingAddress | Shipping address |
| [**listSubscriptions**](SubscriptionApi.md#listSubscriptions) | **GET** /{companyDomain}/subscriptions | List subscriptions |
| [**listTagsBySubscription**](SubscriptionApi.md#listTagsBySubscription) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/tags | Feature tags by Subscription |
| [**removeFeatureTag**](SubscriptionApi.md#removeFeatureTag) | **DELETE** /{companyDomain}/subscriptions/tags/{tagname} | Delete feature tag |
| [**updateCounter**](SubscriptionApi.md#updateCounter) | **POST** /operations/{companyDomain}/subscriptions/{subscriptionUniqueId}/counters/{counterId} | Update counter |
| [**updateRenewalDate**](SubscriptionApi.md#updateRenewalDate) | **PUT** /{companyDomain}/subscriptions/{subscriptionUniqueId}/renewaldate | Update next renewal date |
| [**updateShippingAddress**](SubscriptionApi.md#updateShippingAddress) | **PUT** /{companyDomain}/subscriptions/{subscriptionUniqueId}/shippingAddress | Update subscription shipping address |


<a name="addFeatureTags"></a>
# **addFeatureTags**
> String addFeatureTags(companyDomain).subscriptionAddFeatureTagsRequest(subscriptionAddFeatureTagsRequest).execute();

Add feature tags

You can add feature tags to existing subscriptions using the unique subscription IDs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    List<String> subscriptionUniqueIds = Arrays.asList(); // Add subscription IDs of all the subscriptions you want to add the feature tags to.
    List<String> tagNames = Arrays.asList(); // The name of the feature tags you want to add
    try {
      String result = client
              .subscription
              .addFeatureTags(companyDomain)
              .subscriptionUniqueIds(subscriptionUniqueIds)
              .tagNames(tagNames)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#addFeatureTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .subscription
              .addFeatureTags(companyDomain)
              .subscriptionUniqueIds(subscriptionUniqueIds)
              .tagNames(tagNames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#addFeatureTags");
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
| **subscriptionAddFeatureTagsRequest** | [**SubscriptionAddFeatureTagsRequest**](SubscriptionAddFeatureTagsRequest.md)|  | [optional] |

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

<a name="cancelSubscription"></a>
# **cancelSubscription**
> String cancelSubscription(companyDomain, subscriptionUniqueId, customerUniqueId).execute();

Cancel a subscription

Cancel an individual subscription using the unique identifier of the subscription in the Billsby platform

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the customer in the Billsby platform
    try {
      String result = client
              .subscription
              .cancelSubscription(companyDomain, subscriptionUniqueId, customerUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#cancelSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .subscription
              .cancelSubscription(companyDomain, subscriptionUniqueId, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#cancelSubscription");
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
| **customerUniqueId** | **String**| The unique identifier of the customer in the Billsby platform | |

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

<a name="changePlan"></a>
# **changePlan**
> String changePlan(companyDomain, subscriptionUniqueId).subscriptionChangePlanRequest(subscriptionChangePlanRequest).execute();

Change plan

Change the plan that a subscription sits on

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    Integer planId = 56; // The unique identifier of the plan that you want to change the subscription to in the Billsby platform
    Integer cycleId = 56; // The unique identifier of the cycle that you want to change the subscription to in the Billsby platform
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the subscription in the Billsby platform
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    String subscriptionUniqueId = "subscriptionUniqueId_example"; // The unique identifier of the subscription in the Billsby platform
    Integer planChangeType = 1; // Immediate = 1 OnRenewal = 2
    Integer units = 56; // The number of units required (for cycles with mulitple units allowed)
    List<CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner> addOns = Arrays.asList();
    List<Integer> allowances = Arrays.asList();
    Boolean issueRefund = false; // In case of immediate change, this will apply a refund into the first invoice of the new plan based on the prorated amount of the current plan
    try {
      String result = client
              .subscription
              .changePlan(planId, cycleId, customerUniqueId, companyDomain, subscriptionUniqueId)
              .planChangeType(planChangeType)
              .units(units)
              .addOns(addOns)
              .allowances(allowances)
              .issueRefund(issueRefund)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#changePlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .subscription
              .changePlan(planId, cycleId, customerUniqueId, companyDomain, subscriptionUniqueId)
              .planChangeType(planChangeType)
              .units(units)
              .addOns(addOns)
              .allowances(allowances)
              .issueRefund(issueRefund)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#changePlan");
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
| **subscriptionChangePlanRequest** | [**SubscriptionChangePlanRequest**](SubscriptionChangePlanRequest.md)|  | [optional] |

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

<a name="featureTagsSplit"></a>
# **featureTagsSplit**
> SubscriptionFeatureTagsSplitResponse featureTagsSplit(companyDomain, subscriptionUniqueId).execute();

Feature tags by plan and custom tags

Returns a list of feature tags in a subscription split by plan tags and custom tags

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
      SubscriptionFeatureTagsSplitResponse result = client
              .subscription
              .featureTagsSplit(companyDomain, subscriptionUniqueId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlanFeatureTags());
      System.out.println(result.getSubscriptionFeatureTags());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#featureTagsSplit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SubscriptionFeatureTagsSplitResponse> response = client
              .subscription
              .featureTagsSplit(companyDomain, subscriptionUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#featureTagsSplit");
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

[**SubscriptionFeatureTagsSplitResponse**](SubscriptionFeatureTagsSplitResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getCountersValue"></a>
# **getCountersValue**
> SubscriptionGetCountersValueResponse getCountersValue(companyDomain, subscriptionUniqueId, counterId).from(from).to(to).execute();

Counter value



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    String counterId = "counterId_example"; // The unique identifier of the counter in the Billsby platform
    LocalDate from = LocalDate.now(); // The date you would like the counter value from; format is ISO 8601, e.g. 2020-08-25T18:35:00.000Z
    LocalDate to = LocalDate.now(); // The date you would like the counter value to; format is ISO 8601, e.g. 2020-08-25T18:35:00.000Z
    try {
      SubscriptionGetCountersValueResponse result = client
              .subscription
              .getCountersValue(companyDomain, subscriptionUniqueId, counterId)
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsage());
      System.out.println(result.getTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getCountersValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SubscriptionGetCountersValueResponse> response = client
              .subscription
              .getCountersValue(companyDomain, subscriptionUniqueId, counterId)
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getCountersValue");
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
| **counterId** | **String**| The unique identifier of the counter in the Billsby platform | |
| **from** | **LocalDate**| The date you would like the counter value from; format is ISO 8601, e.g. 2020-08-25T18:35:00.000Z | [optional] |
| **to** | **LocalDate**| The date you would like the counter value to; format is ISO 8601, e.g. 2020-08-25T18:35:00.000Z | [optional] |

### Return type

[**SubscriptionGetCountersValueResponse**](SubscriptionGetCountersValueResponse.md)

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
> String getDetails(companyDomain, subscriptionUniqueId).execute();

Subscription details

This query gets individual subscription details using the unique identifier provided in the Billsby platform

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
              .subscription
              .getDetails(companyDomain, subscriptionUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .subscription
              .getDetails(companyDomain, subscriptionUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getDetails");
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

<a name="getEventLogs"></a>
# **getEventLogs**
> SubscriptionGetEventLogsResponse getEventLogs(companyDomain, subscriptionUniqueId, page, pageSize).execute();

Event logs

This query returns the event logs of a subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    Integer page = 56; // The page of customers you would like to view
    Integer pageSize = 56; // The number of records to return per page (max 100)
    try {
      SubscriptionGetEventLogsResponse result = client
              .subscription
              .getEventLogs(companyDomain, subscriptionUniqueId, page, pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrentPage());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getRowCount());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getEventLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SubscriptionGetEventLogsResponse> response = client
              .subscription
              .getEventLogs(companyDomain, subscriptionUniqueId, page, pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getEventLogs");
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
| **page** | **Integer**| The page of customers you would like to view | |
| **pageSize** | **Integer**| The number of records to return per page (max 100) | |

### Return type

[**SubscriptionGetEventLogsResponse**](SubscriptionGetEventLogsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getShippingAddress"></a>
# **getShippingAddress**
> SubscriptionGetShippingAddressResponse getShippingAddress(companyDomain, subscriptionUniqueId).execute();

Shipping address

This query gets individual subscription details using the unique identifier provided in the Billsby platform

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
      SubscriptionGetShippingAddressResponse result = client
              .subscription
              .getShippingAddress(companyDomain, subscriptionUniqueId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getState());
      System.out.println(result.getCity());
      System.out.println(result.getCountry());
      System.out.println(result.getPostCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getShippingAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SubscriptionGetShippingAddressResponse> response = client
              .subscription
              .getShippingAddress(companyDomain, subscriptionUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getShippingAddress");
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

[**SubscriptionGetShippingAddressResponse**](SubscriptionGetShippingAddressResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listSubscriptions"></a>
# **listSubscriptions**
> SubscriptionListSubscriptionsResponse listSubscriptions(companyDomain, page, pageSize).orderBy(orderBy).orderByDescending(orderByDescending).isActive(isActive).isInFreeTrial(isInFreeTrial).productName(productName).planName(planName).execute();

List subscriptions

This query gets a list of all of the subscriptions in your account with their subscription IDs so that you can later lookup individual subscriptions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    Integer page = 56; // The page of customers you would like to view
    Integer pageSize = 56; // The number of records to return per page
    String orderBy = "orderBy_example"; // You can order the subscriptions by any of the subscription object properties (e.g. CreatedOn to sort by date of creation)
    String orderByDescending = "orderByDescending_example"; // The ordering direction of the previously set property (e.g. Descending in CreatedOn will sort from newest to oldest, non-descending from oldest to newest)
    Boolean isActive = true; // Will show only the subscriptions that are active
    Boolean isInFreeTrial = true; // Will show only the subscriptions that are in free trial
    String productName = "productName_example"; // Will show only the subscriptions that has products whose names matches the value provided here
    String planName = "planName_example"; // Will show only the subscriptions that has plans whose names matches the value provided here
    try {
      SubscriptionListSubscriptionsResponse result = client
              .subscription
              .listSubscriptions(companyDomain, page, pageSize)
              .orderBy(orderBy)
              .orderByDescending(orderByDescending)
              .isActive(isActive)
              .isInFreeTrial(isInFreeTrial)
              .productName(productName)
              .planName(planName)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrentPage());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getRowCount());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SubscriptionListSubscriptionsResponse> response = client
              .subscription
              .listSubscriptions(companyDomain, page, pageSize)
              .orderBy(orderBy)
              .orderByDescending(orderByDescending)
              .isActive(isActive)
              .isInFreeTrial(isInFreeTrial)
              .productName(productName)
              .planName(planName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listSubscriptions");
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
| **page** | **Integer**| The page of customers you would like to view | |
| **pageSize** | **Integer**| The number of records to return per page | |
| **orderBy** | **String**| You can order the subscriptions by any of the subscription object properties (e.g. CreatedOn to sort by date of creation) | [optional] |
| **orderByDescending** | **String**| The ordering direction of the previously set property (e.g. Descending in CreatedOn will sort from newest to oldest, non-descending from oldest to newest) | [optional] |
| **isActive** | **Boolean**| Will show only the subscriptions that are active | [optional] |
| **isInFreeTrial** | **Boolean**| Will show only the subscriptions that are in free trial | [optional] |
| **productName** | **String**| Will show only the subscriptions that has products whose names matches the value provided here | [optional] |
| **planName** | **String**| Will show only the subscriptions that has plans whose names matches the value provided here | [optional] |

### Return type

[**SubscriptionListSubscriptionsResponse**](SubscriptionListSubscriptionsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listTagsBySubscription"></a>
# **listTagsBySubscription**
> List&lt;String&gt; listTagsBySubscription(companyDomain, subscriptionUniqueId).execute();

Feature tags by Subscription

This query returns a list of feature tags in a subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
      List<String> result = client
              .subscription
              .listTagsBySubscription(companyDomain, subscriptionUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listTagsBySubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<String>> response = client
              .subscription
              .listTagsBySubscription(companyDomain, subscriptionUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listTagsBySubscription");
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

**List&lt;String&gt;**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="removeFeatureTag"></a>
# **removeFeatureTag**
> String removeFeatureTag(companyDomain, tagname).subsId(subsId).execute();

Delete feature tag

Delete a custom feature tag from a list of subscriptions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    String tagname = "tagname_example"; // The name of the custom feature tag you would like to delete
    String subsId = "subsId_example"; // The unique identifier of the subscription in the Billsby platform
    try {
      String result = client
              .subscription
              .removeFeatureTag(companyDomain, tagname)
              .subsId(subsId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#removeFeatureTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .subscription
              .removeFeatureTag(companyDomain, tagname)
              .subsId(subsId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#removeFeatureTag");
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
| **tagname** | **String**| The name of the custom feature tag you would like to delete | |
| **subsId** | **String**| The unique identifier of the subscription in the Billsby platform | [optional] |

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

<a name="updateCounter"></a>
# **updateCounter**
> String updateCounter(companyDomain, subscriptionUniqueId, counterId).subscriptionUpdateCounterRequest(subscriptionUpdateCounterRequest).execute();

Update counter



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String operationType = "operationType_example"; // Where operationType can be one of the following: Increment,Decrement or Set
    Integer value = 56; // The value by which you want to update the counter
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    String subscriptionUniqueId = "subscriptionUniqueId_example"; // The unique identifier of the subscription in the Billsby platform
    String counterId = "counterId_example"; // The unique identifier of the counter in the Billsby platform
    try {
      String result = client
              .subscription
              .updateCounter(operationType, value, companyDomain, subscriptionUniqueId, counterId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateCounter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .subscription
              .updateCounter(operationType, value, companyDomain, subscriptionUniqueId, counterId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateCounter");
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
| **counterId** | **String**| The unique identifier of the counter in the Billsby platform | |
| **subscriptionUpdateCounterRequest** | [**SubscriptionUpdateCounterRequest**](SubscriptionUpdateCounterRequest.md)|  | [optional] |

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

<a name="updateRenewalDate"></a>
# **updateRenewalDate**
> Object updateRenewalDate(companyDomain, subscriptionUniqueId).subscriptionUpdateRenewalDateRequest(subscriptionUpdateRenewalDateRequest).execute();

Update next renewal date



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    Boolean pauseSubscription = true; // Set the subscription status to paused until next renewal date.
    LocalDate newRenewalDate = LocalDate.now(); // The new next renewal date
    try {
      Object result = client
              .subscription
              .updateRenewalDate(companyDomain, subscriptionUniqueId)
              .pauseSubscription(pauseSubscription)
              .newRenewalDate(newRenewalDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateRenewalDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscription
              .updateRenewalDate(companyDomain, subscriptionUniqueId)
              .pauseSubscription(pauseSubscription)
              .newRenewalDate(newRenewalDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateRenewalDate");
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
| **subscriptionUpdateRenewalDateRequest** | [**SubscriptionUpdateRenewalDateRequest**](SubscriptionUpdateRenewalDateRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateShippingAddress"></a>
# **updateShippingAddress**
> String updateShippingAddress(companyDomain, subscriptionUniqueId).subscriptionUpdateShippingAddressRequest(subscriptionUpdateShippingAddressRequest).execute();

Update subscription shipping address

Update the shipping address for a subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    String addressLine1 = "addressLine1_example"; // The first line of the new address that you want to update to
    String addressLine2 = "addressLine2_example"; // The second line of the new address that you want to update to
    String state = "state_example"; // The state of the new address that you want to update to
    String city = "city_example"; // The city of the new address that you want to update to
    String country = "country_example"; // The country of the new address that you wish to change to
    String postCode = "postCode_example"; // The post code of the new address that you want to update to
    try {
      String result = client
              .subscription
              .updateShippingAddress(companyDomain, subscriptionUniqueId)
              .addressLine1(addressLine1)
              .addressLine2(addressLine2)
              .state(state)
              .city(city)
              .country(country)
              .postCode(postCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateShippingAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .subscription
              .updateShippingAddress(companyDomain, subscriptionUniqueId)
              .addressLine1(addressLine1)
              .addressLine2(addressLine2)
              .state(state)
              .city(city)
              .country(country)
              .postCode(postCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateShippingAddress");
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
| **subscriptionUpdateShippingAddressRequest** | [**SubscriptionUpdateShippingAddressRequest**](SubscriptionUpdateShippingAddressRequest.md)|  | [optional] |

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

