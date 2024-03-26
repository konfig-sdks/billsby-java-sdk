# InvoiceApi

All URIs are relative to *https://public.billsby.com/api/v1/rest/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOneTimeCharge**](InvoiceApi.md#createOneTimeCharge) | **POST** /{companyDomain}/customers/{customerUniqueId}/invoices | Create a one-time charge |
| [**createRefund**](InvoiceApi.md#createRefund) | **POST** /{companyDomain}/customers/{customerUniqueId}/refunds | Refund an invoice |
| [**details**](InvoiceApi.md#details) | **GET** /invoices/{invoiceNumber} | Individual invoices |
| [**getCustomerInvoices**](InvoiceApi.md#getCustomerInvoices) | **GET** /{companyDomain}/customers/{customerUniqueId}/invoices | Customer invoices |
| [**getPaymentLogs**](InvoiceApi.md#getPaymentLogs) | **GET** /{companyDomain}/customers/{customerUniqueId}/invoices/{invoiceNumber}/paymentlogs | Customer payment logs |
| [**listCompanyInvoices**](InvoiceApi.md#listCompanyInvoices) | **GET** /{companyDomain}/companies/invoices | Company invoices |
| [**markAsPaidOffline**](InvoiceApi.md#markAsPaidOffline) | **PUT** /{companyDomain}/invoices/{invoiceNumber}/PaidOffline | Invoice paid offline |
| [**markWrittenOff**](InvoiceApi.md#markWrittenOff) | **PUT** /{companyDomain}/invoices/{invoiceNumber}/WrittenOff | Invoice written off |
| [**reattemptPayment**](InvoiceApi.md#reattemptPayment) | **PUT** /{companyDomain}/invoices/{invoiceNumber}/Payment | Reattempt invoice payment |


<a name="createOneTimeCharge"></a>
# **createOneTimeCharge**
> Boolean createOneTimeCharge(companyDomain, customerUniqueId).invoiceCreateOneTimeChargeRequest(invoiceCreateOneTimeChargeRequest).execute();

Create a one-time charge

This query creates a one-time charge for an individual customer

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String description = "description_example"; // The description for the one-time charge
    String currencyCode = "currencyCode_example"; // The code for the currency of the one-time charge
    Integer amount = 56; // The amount of the one-time charge
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the customer in the Billsby platform
    try {
      Boolean result = client
              .invoice
              .createOneTimeCharge(description, currencyCode, amount, companyDomain, customerUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#createOneTimeCharge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Boolean> response = client
              .invoice
              .createOneTimeCharge(description, currencyCode, amount, companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#createOneTimeCharge");
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
| **customerUniqueId** | **String**| The unique identifier of the customer in the Billsby platform | |
| **invoiceCreateOneTimeChargeRequest** | [**InvoiceCreateOneTimeChargeRequest**](InvoiceCreateOneTimeChargeRequest.md)|  | [optional] |

### Return type

**Boolean**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createRefund"></a>
# **createRefund**
> InvoiceCreateRefundResponse createRefund(companyDomain, customerUniqueId).invoiceCreateRefundRequest(invoiceCreateRefundRequest).execute();

Refund an invoice



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String invoiceNumber = "invoiceNumber_example"; // The invoice number associated with the invoice you want to refund
    Integer amount = 56; // The amount you would like to refund (can be partial). Amounts are unformatted so if you're using a decimal currency, you'll need to put 100 to refund $1, for example.
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the customer in the Billsby platform
    try {
      InvoiceCreateRefundResponse result = client
              .invoice
              .createRefund(invoiceNumber, amount, companyDomain, customerUniqueId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#createRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceCreateRefundResponse> response = client
              .invoice
              .createRefund(invoiceNumber, amount, companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#createRefund");
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
| **customerUniqueId** | **String**| The unique identifier of the customer in the Billsby platform | |
| **invoiceCreateRefundRequest** | [**InvoiceCreateRefundRequest**](InvoiceCreateRefundRequest.md)|  | [optional] |

### Return type

[**InvoiceCreateRefundResponse**](InvoiceCreateRefundResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="details"></a>
# **details**
> InvoiceDetailsResponse details(invoiceNumber).execute();

Individual invoices



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String invoiceNumber = "invoiceNumber_example"; // The invoice number for the invoice you'd like to retrieve
    try {
      InvoiceDetailsResponse result = client
              .invoice
              .details(invoiceNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoiceId());
      System.out.println(result.getCustomerEmail());
      System.out.println(result.getCustomerFirstName());
      System.out.println(result.getCustomerLastName());
      System.out.println(result.getCustomerUniqueId());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressPostCode());
      System.out.println(result.getAddressCity());
      System.out.println(result.getAddressState());
      System.out.println(result.getAddressCountry());
      System.out.println(result.getAddressCountryCode());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getFormattedAmount());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getStatus());
      System.out.println(result.getSubTotal());
      System.out.println(result.getTaxTotal());
      System.out.println(result.getProrationAdjustment());
      System.out.println(result.getProrationFactor());
      System.out.println(result.getTaxes());
      System.out.println(result.getInvoiceType());
      System.out.println(result.getSubscriptions());
      System.out.println(result.getCompanyName());
      System.out.println(result.getCompanyEmail());
      System.out.println(result.getCompanyTaxNumber());
      System.out.println(result.getCompanyDomain());
      System.out.println(result.getCompanyPhoneNumberDialCountry());
      System.out.println(result.getCompanyPhoneNumberDialCode());
      System.out.println(result.getCompanyPhoneNumber());
      System.out.println(result.getCompanyAddressLine1());
      System.out.println(result.getCompanyAddressLine2());
      System.out.println(result.getCompanyCity());
      System.out.println(result.getCompanyState());
      System.out.println(result.getCompanyPostCode());
      System.out.println(result.getCompanyCountry());
      System.out.println(result.getBrandingLogo());
      System.out.println(result.getBrandingLogoBackgroundColor());
      System.out.println(result.getBrandingHighlightColor());
      System.out.println(result.getSupportUrl());
      System.out.println(result.getCardType());
      System.out.println(result.getCardLast4Digits());
      System.out.println(result.getCardExpiryMonth());
      System.out.println(result.getCardExpiryYear());
      System.out.println(result.getRefundableAmount());
      System.out.println(result.getFooterCompanyName());
      System.out.println(result.getFooterAddressLine1());
      System.out.println(result.getFooterAddressLine2());
      System.out.println(result.getFooterAddressState());
      System.out.println(result.getFooterAddressCity());
      System.out.println(result.getFooterAddressPostCode());
      System.out.println(result.getFooterAddressCountryISO3());
      System.out.println(result.getFooterEmailAddress());
      System.out.println(result.getFooterPhoneNumberDialCountry());
      System.out.println(result.getFooterPhoneNumberDialCode());
      System.out.println(result.getFooterPhoneNumber());
      System.out.println(result.getSupportContactHeading());
      System.out.println(result.getSupportContactContent());
      System.out.println(result.getSupportContactSupportUrl());
      System.out.println(result.getSupportContactSupportUrlButtonText());
      System.out.println(result.getIsAdvertEnabled());
      System.out.println(result.getAdvertImageUrl());
      System.out.println(result.getAdvertLinkToUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#details");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceDetailsResponse> response = client
              .invoice
              .details(invoiceNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#details");
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
| **invoiceNumber** | **String**| The invoice number for the invoice you&#39;d like to retrieve | |

### Return type

[**InvoiceDetailsResponse**](InvoiceDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getCustomerInvoices"></a>
# **getCustomerInvoices**
> List&lt;InvoiceGetCustomerInvoicesResponseInner&gt; getCustomerInvoices(companyDomain, customerUniqueId).execute();

Customer invoices

This query gets individual customer&#39;s invoices

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
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
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the customer in the Billsby platform
    try {
      List<InvoiceGetCustomerInvoicesResponseInner> result = client
              .invoice
              .getCustomerInvoices(companyDomain, customerUniqueId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#getCustomerInvoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<InvoiceGetCustomerInvoicesResponseInner>> response = client
              .invoice
              .getCustomerInvoices(companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#getCustomerInvoices");
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
| **customerUniqueId** | **String**| The unique identifier of the customer in the Billsby platform | |

### Return type

[**List&lt;InvoiceGetCustomerInvoicesResponseInner&gt;**](InvoiceGetCustomerInvoicesResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getPaymentLogs"></a>
# **getPaymentLogs**
> List&lt;InvoiceGetPaymentLogsResponseInner&gt; getPaymentLogs(companyDomain, customerUniqueId, invoiceNumber).execute();

Customer payment logs



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
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
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the customer in the Billsby platform
    String invoiceNumber = "invoiceNumber_example"; // The unique identifier of the invoice in the Billsby platform
    try {
      List<InvoiceGetPaymentLogsResponseInner> result = client
              .invoice
              .getPaymentLogs(companyDomain, customerUniqueId, invoiceNumber)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#getPaymentLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<InvoiceGetPaymentLogsResponseInner>> response = client
              .invoice
              .getPaymentLogs(companyDomain, customerUniqueId, invoiceNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#getPaymentLogs");
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
| **customerUniqueId** | **String**| The unique identifier of the customer in the Billsby platform | |
| **invoiceNumber** | **String**| The unique identifier of the invoice in the Billsby platform | |

### Return type

[**List&lt;InvoiceGetPaymentLogsResponseInner&gt;**](InvoiceGetPaymentLogsResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listCompanyInvoices"></a>
# **listCompanyInvoices**
> String listCompanyInvoices(companyDomain, page, pageSize).query(query).orderBy(orderBy).orderByDescending(orderByDescending).isPending(isPending).isPaid(isPaid).isUnpaid(isUnpaid).isPaidOffline(isPaidOffline).isWrittenOff(isWrittenOff).execute();

Company invoices

Get a list of your company&#39;s invoices

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
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
    Integer page = 56; // The page of invoices you would like to view
    Integer pageSize = 56; // The number of records to return per page (max 100)
    String query = "query_example"; // Add search terms here to filter results
    String orderBy = "orderBy_example"; // Sort the results by particular properties
    String orderByDescending = "orderByDescending_example"; // Sort the results by particular properties in descending order
    Boolean isPending = true; // Do you want to show invoices with the status 'pending'; true or false
    Boolean isPaid = true; // Do you want to show invoices with the status 'paid'; true or false
    String isUnpaid = "isUnpaid_example"; // Do you want to show invoices with the status 'unpaid'; true or false
    Boolean isPaidOffline = true; // Do you want to show invoices with the status 'paid offline'; true or false
    Boolean isWrittenOff = true; // Do you want to show invoices with the status 'written off'; true or false
    try {
      String result = client
              .invoice
              .listCompanyInvoices(companyDomain, page, pageSize)
              .query(query)
              .orderBy(orderBy)
              .orderByDescending(orderByDescending)
              .isPending(isPending)
              .isPaid(isPaid)
              .isUnpaid(isUnpaid)
              .isPaidOffline(isPaidOffline)
              .isWrittenOff(isWrittenOff)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#listCompanyInvoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .invoice
              .listCompanyInvoices(companyDomain, page, pageSize)
              .query(query)
              .orderBy(orderBy)
              .orderByDescending(orderByDescending)
              .isPending(isPending)
              .isPaid(isPaid)
              .isUnpaid(isUnpaid)
              .isPaidOffline(isPaidOffline)
              .isWrittenOff(isWrittenOff)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#listCompanyInvoices");
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
| **page** | **Integer**| The page of invoices you would like to view | |
| **pageSize** | **Integer**| The number of records to return per page (max 100) | |
| **query** | **String**| Add search terms here to filter results | [optional] |
| **orderBy** | **String**| Sort the results by particular properties | [optional] |
| **orderByDescending** | **String**| Sort the results by particular properties in descending order | [optional] |
| **isPending** | **Boolean**| Do you want to show invoices with the status &#39;pending&#39;; true or false | [optional] |
| **isPaid** | **Boolean**| Do you want to show invoices with the status &#39;paid&#39;; true or false | [optional] |
| **isUnpaid** | **String**| Do you want to show invoices with the status &#39;unpaid&#39;; true or false | [optional] |
| **isPaidOffline** | **Boolean**| Do you want to show invoices with the status &#39;paid offline&#39;; true or false | [optional] |
| **isWrittenOff** | **Boolean**| Do you want to show invoices with the status &#39;written off&#39;; true or false | [optional] |

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

<a name="markAsPaidOffline"></a>
# **markAsPaidOffline**
> String markAsPaidOffline(invoiceNumber, companyDomain).execute();

Invoice paid offline

Mark an invoice as paid offline

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String invoiceNumber = "invoiceNumber_example"; // The unique identifier of the invoice in the Billsby platform
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    try {
      String result = client
              .invoice
              .markAsPaidOffline(invoiceNumber, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#markAsPaidOffline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .invoice
              .markAsPaidOffline(invoiceNumber, companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#markAsPaidOffline");
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
| **invoiceNumber** | **String**| The unique identifier of the invoice in the Billsby platform | |
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

<a name="markWrittenOff"></a>
# **markWrittenOff**
> String markWrittenOff(invoiceNumber, companyDomain).execute();

Invoice written off

Mark an invoice as written off

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String invoiceNumber = "invoiceNumber_example"; // The unique identifier of the invoice in the Billsby platform
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    try {
      String result = client
              .invoice
              .markWrittenOff(invoiceNumber, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#markWrittenOff");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .invoice
              .markWrittenOff(invoiceNumber, companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#markWrittenOff");
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
| **invoiceNumber** | **String**| The unique identifier of the invoice in the Billsby platform | |
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

<a name="reattemptPayment"></a>
# **reattemptPayment**
> String reattemptPayment(invoiceNumber, companyDomain).execute();

Reattempt invoice payment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoiceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String invoiceNumber = "invoiceNumber_example"; // The unique identifier of the invoice in the Billsby platform
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    try {
      String result = client
              .invoice
              .reattemptPayment(invoiceNumber, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#reattemptPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .invoice
              .reattemptPayment(invoiceNumber, companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceApi#reattemptPayment");
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
| **invoiceNumber** | **String**| The unique identifier of the invoice in the Billsby platform | |
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

