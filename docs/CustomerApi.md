# CustomerApi

All URIs are relative to *https://public.billsby.com/api/v1/rest/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSubscriptionToExistingCustomer**](CustomerApi.md#addSubscriptionToExistingCustomer) | **POST** /{companyDomain}/customers/{customerUniqueId}/subscriptions | Add subscription to existing customer |
| [**clearGdprData**](CustomerApi.md#clearGdprData) | **PUT** /{companyDomain}/customers/{customerUniqueId}/gdprcleanup | Clear customer data (GDPR) |
| [**createNewCustomerAndSubscription**](CustomerApi.md#createNewCustomerAndSubscription) | **POST** /{companyDomain}/subscriptions | Create new customer and subscription |
| [**createWithoutSubscription**](CustomerApi.md#createWithoutSubscription) | **POST** /{companyDomain}/customers | Create without subscription |
| [**deleteById**](CustomerApi.md#deleteById) | **DELETE** /{companyDomain}/customers/{customerUniqueId} | Delete a customer |
| [**getCreditNotes**](CustomerApi.md#getCreditNotes) | **GET** /{companyDomain}/customers/{customerUniqueId}/creditNotes | Customer credit notes |
| [**getDetails**](CustomerApi.md#getDetails) | **GET** /{companyDomain}/customers/{customerUniqueId} | Customer details |
| [**getFeatureTags**](CustomerApi.md#getFeatureTags) | **GET** /{companyDomain}/customers/{customerUniqueId}/subscriptions/featuretags | Customer feature tags |
| [**getSubscriptionsByUniqueId**](CustomerApi.md#getSubscriptionsByUniqueId) | **GET** /{companyDomain}/customers/{customerUniqueId}/subscriptions | Customer subscriptions |
| [**listCustomers**](CustomerApi.md#listCustomers) | **GET** /{companyDomain}/customers | List customers |
| [**updateCustomFieldResponse**](CustomerApi.md#updateCustomFieldResponse) | **PUT** /{companyDomain}/customfieldResponses/{customFieldResponseId} | Update customer response to custom fields |
| [**updateDetails**](CustomerApi.md#updateDetails) | **PUT** /{companyDomain}/customers/{customerUniqueId} | Update customer |
| [**updatePaymentCardToken**](CustomerApi.md#updatePaymentCardToken) | **PUT** /{companyDomain}/customers/{customerUniqueId}/paymentCard | Update payment card token |
| [**updatePaymentDetailsRequest**](CustomerApi.md#updatePaymentDetailsRequest) | **GET** /{companyDomain}/customers/{customerUniqueId}/paymentdetailsrequest | Request to update payment details |


<a name="addSubscriptionToExistingCustomer"></a>
# **addSubscriptionToExistingCustomer**
> CustomerAddSubscriptionToExistingCustomerResponse addSubscriptionToExistingCustomer(companyDomain, customerUniqueId).customerAddSubscriptionToExistingCustomerRequest(customerAddSubscriptionToExistingCustomerRequest).execute();

Add subscription to existing customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    Integer cycleId = 56; // The unique identifier of the cycle in the Billsby platform
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the customer in the Billsby platform
    Integer units = 56; // The number of units for unit based plans
    CustomerAddSubscriptionToExistingCustomerRequestAddress address = new CustomerAddSubscriptionToExistingCustomerRequestAddress();
    Object shippingAddress = null; // The shipping address of the customer
    String additionalEmail = "additionalEmail_example"; // Any additional email addresses given by the customer
    String phoneNumberDialCountry = "phoneNumberDialCountry_example"; // The country associated with the phone number
    Integer phoneNumberDialCode = 56; // The country dial code for the customer phone number
    Integer phoneNumber = 56; // The customer's phone number
    Boolean marketingConsent = true; // Gas the customer given marketing consent: true or false
    String taxRegNumber = "taxRegNumber_example"; // Tax registration number
    String ipAddress = "ipAddress_example";
    List<CustomerAddSubscriptionToExistingCustomerRequestCustomFieldResponseInner> customFieldResponse = Arrays.asList(); // Any responses to custom fields
    List<CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner> addOns = Arrays.asList(); // Any add-ons to be included in the plan, along with the quantity of each add-on if unit based
    Integer allowances = 56; // Any allowances to be included with the plan
    List<CustomerAddSubscriptionToExistingCustomerRequestCouponCodesInner> couponCodes = Arrays.asList(); // The coupon code to be used for the plan
    try {
      CustomerAddSubscriptionToExistingCustomerResponse result = client
              .customer
              .addSubscriptionToExistingCustomer(cycleId, companyDomain, customerUniqueId)
              .units(units)
              .address(address)
              .shippingAddress(shippingAddress)
              .additionalEmail(additionalEmail)
              .phoneNumberDialCountry(phoneNumberDialCountry)
              .phoneNumberDialCode(phoneNumberDialCode)
              .phoneNumber(phoneNumber)
              .marketingConsent(marketingConsent)
              .taxRegNumber(taxRegNumber)
              .ipAddress(ipAddress)
              .customFieldResponse(customFieldResponse)
              .addOns(addOns)
              .allowances(allowances)
              .couponCodes(couponCodes)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomerUniqueId());
      System.out.println(result.getSubscriptionUniqueId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#addSubscriptionToExistingCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAddSubscriptionToExistingCustomerResponse> response = client
              .customer
              .addSubscriptionToExistingCustomer(cycleId, companyDomain, customerUniqueId)
              .units(units)
              .address(address)
              .shippingAddress(shippingAddress)
              .additionalEmail(additionalEmail)
              .phoneNumberDialCountry(phoneNumberDialCountry)
              .phoneNumberDialCode(phoneNumberDialCode)
              .phoneNumber(phoneNumber)
              .marketingConsent(marketingConsent)
              .taxRegNumber(taxRegNumber)
              .ipAddress(ipAddress)
              .customFieldResponse(customFieldResponse)
              .addOns(addOns)
              .allowances(allowances)
              .couponCodes(couponCodes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#addSubscriptionToExistingCustomer");
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
| **customerAddSubscriptionToExistingCustomerRequest** | [**CustomerAddSubscriptionToExistingCustomerRequest**](CustomerAddSubscriptionToExistingCustomerRequest.md)|  | [optional] |

### Return type

[**CustomerAddSubscriptionToExistingCustomerResponse**](CustomerAddSubscriptionToExistingCustomerResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="clearGdprData"></a>
# **clearGdprData**
> String clearGdprData(companyDomain, customerUniqueId).execute();

Clear customer data (GDPR)



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
      String result = client
              .customer
              .clearGdprData(companyDomain, customerUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#clearGdprData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .customer
              .clearGdprData(companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#clearGdprData");
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

<a name="createNewCustomerAndSubscription"></a>
# **createNewCustomerAndSubscription**
> CustomerCreateNewCustomerAndSubscriptionResponse createNewCustomerAndSubscription(companyDomain).customerCreateNewCustomerAndSubscriptionRequest(customerCreateNewCustomerAndSubscriptionRequest).execute();

Create new customer and subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String firstName = "firstName_example"; // The customer's first name
    String lastName = "lastName_example"; // The customer's last name
    String email = "email_example"; // The customer's email address
    Integer cycleId = 56; // The unique identifier of the cycle in Billsby
    Integer units = 56; // The number of units included in the subscription (min. 1)
    CustomerCreateNewCustomerAndSubscriptionRequestAddress address = new CustomerCreateNewCustomerAndSubscriptionRequestAddress();
    CustomerCreateNewCustomerAndSubscriptionRequestCardDetails cardDetails = new CustomerCreateNewCustomerAndSubscriptionRequestCardDetails();
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    CustomerCreateNewCustomerAndSubscriptionRequestShippingAddress shippingAddress = new CustomerCreateNewCustomerAndSubscriptionRequestShippingAddress();
    String additionalEmail = "additionalEmail_example"; // Any additional email address provided by the customer
    String phoneNumberDialCountry = "phoneNumberDialCountry_example"; // The country associated with their phone number
    Integer phoneNumberDialCode = 56; // The country code associated with their phone number
    Integer phoneNumber = 56; // The customer's phone number. If phoneNumber is provided, then phoneNumberDialCountry and phoneNumberDialCode are required.
    Boolean marketingConsent = true; // Has the customer given marketing consent; true or false
    List<CustomerAddSubscriptionToExistingCustomerRequestCustomFieldResponseInner> customFieldResponse = Arrays.asList(); // Response to any custom field questions you want to add to the subscription
    List<CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner> addOns = Arrays.asList(); // The add-ons that you want to include in the subscription
    List<Integer> allowances = Arrays.asList(); // The IDs of any allowances you want to include in the subscription. For multiple allowances you can add the IDs separated by a comma
    List<CustomerAddSubscriptionToExistingCustomerRequestCouponCodesInner> couponCodes = Arrays.asList(); // The codes of any coupons you want to apply to the subscription
    try {
      CustomerCreateNewCustomerAndSubscriptionResponse result = client
              .customer
              .createNewCustomerAndSubscription(firstName, lastName, email, cycleId, units, address, cardDetails, companyDomain)
              .shippingAddress(shippingAddress)
              .additionalEmail(additionalEmail)
              .phoneNumberDialCountry(phoneNumberDialCountry)
              .phoneNumberDialCode(phoneNumberDialCode)
              .phoneNumber(phoneNumber)
              .marketingConsent(marketingConsent)
              .customFieldResponse(customFieldResponse)
              .addOns(addOns)
              .allowances(allowances)
              .couponCodes(couponCodes)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomerUniqueId());
      System.out.println(result.getSubscriptionUniqueId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createNewCustomerAndSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerCreateNewCustomerAndSubscriptionResponse> response = client
              .customer
              .createNewCustomerAndSubscription(firstName, lastName, email, cycleId, units, address, cardDetails, companyDomain)
              .shippingAddress(shippingAddress)
              .additionalEmail(additionalEmail)
              .phoneNumberDialCountry(phoneNumberDialCountry)
              .phoneNumberDialCode(phoneNumberDialCode)
              .phoneNumber(phoneNumber)
              .marketingConsent(marketingConsent)
              .customFieldResponse(customFieldResponse)
              .addOns(addOns)
              .allowances(allowances)
              .couponCodes(couponCodes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createNewCustomerAndSubscription");
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
| **customerCreateNewCustomerAndSubscriptionRequest** | [**CustomerCreateNewCustomerAndSubscriptionRequest**](CustomerCreateNewCustomerAndSubscriptionRequest.md)|  | [optional] |

### Return type

[**CustomerCreateNewCustomerAndSubscriptionResponse**](CustomerCreateNewCustomerAndSubscriptionResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createWithoutSubscription"></a>
# **createWithoutSubscription**
> CustomerCreateWithoutSubscriptionResponse createWithoutSubscription(companyDomain).customerCreateWithoutSubscriptionRequest(customerCreateWithoutSubscriptionRequest).execute();

Create without subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String addressLine1 = "addressLine1_example";
    String city = "city_example";
    String state = "state_example";
    String country = "country_example";
    String postCode = "postCode_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String email = "email_example";
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    String addressLine2 = "addressLine2_example";
    CustomerCreateWithoutSubscriptionRequestCardDetails cardDetails = new CustomerCreateWithoutSubscriptionRequestCardDetails();
    try {
      CustomerCreateWithoutSubscriptionResponse result = client
              .customer
              .createWithoutSubscription(addressLine1, city, state, country, postCode, firstName, lastName, email, companyDomain)
              .addressLine2(addressLine2)
              .cardDetails(cardDetails)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomerUniqueId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createWithoutSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerCreateWithoutSubscriptionResponse> response = client
              .customer
              .createWithoutSubscription(addressLine1, city, state, country, postCode, firstName, lastName, email, companyDomain)
              .addressLine2(addressLine2)
              .cardDetails(cardDetails)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createWithoutSubscription");
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
| **customerCreateWithoutSubscriptionRequest** | [**CustomerCreateWithoutSubscriptionRequest**](CustomerCreateWithoutSubscriptionRequest.md)|  | [optional] |

### Return type

[**CustomerCreateWithoutSubscriptionResponse**](CustomerCreateWithoutSubscriptionResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="deleteById"></a>
# **deleteById**
> String deleteById(companyDomain, customerUniqueId).execute();

Delete a customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
      String result = client
              .customer
              .deleteById(companyDomain, customerUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .customer
              .deleteById(companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#deleteById");
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

<a name="getCreditNotes"></a>
# **getCreditNotes**
> List&lt;CustomerGetCreditNotesResponseInner&gt; getCreditNotes(companyDomain, customerUniqueId).execute();

Customer credit notes

This query gets individual customer&#39;s credit notes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
      List<CustomerGetCreditNotesResponseInner> result = client
              .customer
              .getCreditNotes(companyDomain, customerUniqueId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCreditNotes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CustomerGetCreditNotesResponseInner>> response = client
              .customer
              .getCreditNotes(companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCreditNotes");
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

[**List&lt;CustomerGetCreditNotesResponseInner&gt;**](CustomerGetCreditNotesResponseInner.md)

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
> CustomerGetDetailsResponse getDetails(companyDomain, customerUniqueId).execute();

Customer details

This query gets individual customer details using the unique identifier provided in the Billsby platform

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
      CustomerGetDetailsResponse result = client
              .customer
              .getDetails(companyDomain, customerUniqueId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyCurrency());
      System.out.println(result.getTotalAmountPaid());
      System.out.println(result.getAverageAmountPerMonth());
      System.out.println(result.getCardStatus());
      System.out.println(result.getCustomerUniqueId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getEmail());
      System.out.println(result.getAdditionalEmail());
      System.out.println(result.getPhoneNumberDialCountry());
      System.out.println(result.getPhoneNumberDialCode());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getIsMarketingConsentGiven());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerGetDetailsResponse> response = client
              .customer
              .getDetails(companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getDetails");
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

[**CustomerGetDetailsResponse**](CustomerGetDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getFeatureTags"></a>
# **getFeatureTags**
> List&lt;String&gt; getFeatureTags(companyDomain, customerUniqueId).execute();

Customer feature tags



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
      List<String> result = client
              .customer
              .getFeatureTags(companyDomain, customerUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getFeatureTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<String>> response = client
              .customer
              .getFeatureTags(companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getFeatureTags");
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

<a name="getSubscriptionsByUniqueId"></a>
# **getSubscriptionsByUniqueId**
> List&lt;CustomerGetSubscriptionsByUniqueIdResponseInner&gt; getSubscriptionsByUniqueId(companyDomain, customerUniqueId).execute();

Customer subscriptions

This query gets individual customer&#39;s subscriptions using the unique identifier provided in the Billsby platform

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
      List<CustomerGetSubscriptionsByUniqueIdResponseInner> result = client
              .customer
              .getSubscriptionsByUniqueId(companyDomain, customerUniqueId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getSubscriptionsByUniqueId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CustomerGetSubscriptionsByUniqueIdResponseInner>> response = client
              .customer
              .getSubscriptionsByUniqueId(companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getSubscriptionsByUniqueId");
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

[**List&lt;CustomerGetSubscriptionsByUniqueIdResponseInner&gt;**](CustomerGetSubscriptionsByUniqueIdResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listCustomers"></a>
# **listCustomers**
> String listCustomers(companyDomain, page, pageSize).search(search).execute();

List customers



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
    Integer pageSize = 56; // The number of records to return per page (max 100)
    String search = "search_example"; // Filter customers by name (this can be a partial name)
    try {
      String result = client
              .customer
              .listCustomers(companyDomain, page, pageSize)
              .search(search)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#listCustomers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .customer
              .listCustomers(companyDomain, page, pageSize)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#listCustomers");
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
| **pageSize** | **Integer**| The number of records to return per page (max 100) | |
| **search** | **String**| Filter customers by name (this can be a partial name) | [optional] |

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

<a name="updateCustomFieldResponse"></a>
# **updateCustomFieldResponse**
> List&lt;CustomerUpdateCustomFieldResponseResponseInner&gt; updateCustomFieldResponse(companyDomain, customFieldResponseId).customerUpdateCustomFieldResponseRequest(customerUpdateCustomFieldResponseRequest).execute();

Update customer response to custom fields



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String value = "value_example"; // Input the response that you would like to update to
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    Integer customFieldResponseId = 56; // The unique identifier for an individual customers response to a question
    try {
      List<CustomerUpdateCustomFieldResponseResponseInner> result = client
              .customer
              .updateCustomFieldResponse(value, companyDomain, customFieldResponseId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateCustomFieldResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CustomerUpdateCustomFieldResponseResponseInner>> response = client
              .customer
              .updateCustomFieldResponse(value, companyDomain, customFieldResponseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateCustomFieldResponse");
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
| **customFieldResponseId** | **Integer**| The unique identifier for an individual customers response to a question | |
| **customerUpdateCustomFieldResponseRequest** | [**CustomerUpdateCustomFieldResponseRequest**](CustomerUpdateCustomFieldResponseRequest.md)|  | [optional] |

### Return type

[**List&lt;CustomerUpdateCustomFieldResponseResponseInner&gt;**](CustomerUpdateCustomFieldResponseResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateDetails"></a>
# **updateDetails**
> CustomerUpdateDetailsResponse updateDetails(companyDomain, customerUniqueId).customerUpdateDetailsRequest(customerUpdateDetailsRequest).execute();

Update customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    String firstName = "firstName_example"; // The customers first name
    String lastName = "lastName_example"; // The customers last name
    String email = "email_example"; // The email address we have on file for the customer
    CustomerUpdateDetailsRequestBillingAddress billingAddress = new CustomerUpdateDetailsRequestBillingAddress();
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    String customerUniqueId = "customerUniqueId_example"; // The unique identifier of the customer in the Billsby platform
    String phoneNumberDialCountry = "phoneNumberDialCountry_example"; // The customers phone number dial country (i.e. \\\"UK\\\")
    String phoneNumberDialCode = "phoneNumberDialCode_example"; // The customer phone number dial code
    String phoneNumber = "phoneNumber_example"; // The phone number we have on file for the customer. Remove \\\"0\\\" from the start.
    try {
      CustomerUpdateDetailsResponse result = client
              .customer
              .updateDetails(firstName, lastName, email, billingAddress, companyDomain, customerUniqueId)
              .phoneNumberDialCountry(phoneNumberDialCountry)
              .phoneNumberDialCode(phoneNumberDialCode)
              .phoneNumber(phoneNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomerId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getEmail());
      System.out.println(result.getAdditionalEmail());
      System.out.println(result.getPhoneNumberDialCountry());
      System.out.println(result.getPhoneNumberDialCode());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getIsMarketingConsentGiven());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getUniqueId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerUpdateDetailsResponse> response = client
              .customer
              .updateDetails(firstName, lastName, email, billingAddress, companyDomain, customerUniqueId)
              .phoneNumberDialCountry(phoneNumberDialCountry)
              .phoneNumberDialCode(phoneNumberDialCode)
              .phoneNumber(phoneNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateDetails");
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
| **customerUpdateDetailsRequest** | [**CustomerUpdateDetailsRequest**](CustomerUpdateDetailsRequest.md)|  | [optional] |

### Return type

[**CustomerUpdateDetailsResponse**](CustomerUpdateDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updatePaymentCardToken"></a>
# **updatePaymentCardToken**
> String updatePaymentCardToken(companyDomain, customerUniqueId).customerUpdatePaymentCardTokenRequest(customerUpdatePaymentCardTokenRequest).execute();

Update payment card token



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
    String fullName = "fullName_example"; // The full name of the customer
    String paymentCardtoken = "paymentCardtoken_example"; // The token for the payment card in the Billsby vault
    Integer expiryMonth = 56; // The date that the payment card expires
    Integer expiryYear = 56; // The year that the payment card expires
    String cardType = "cardType_example"; // The type of card (e.g. Visa, Mastercard, AMEX, etc.)
    String last4Digits = "last4Digits_example"; // The last four digits of the long number on the payment card
    try {
      String result = client
              .customer
              .updatePaymentCardToken(companyDomain, customerUniqueId)
              .fullName(fullName)
              .paymentCardtoken(paymentCardtoken)
              .expiryMonth(expiryMonth)
              .expiryYear(expiryYear)
              .cardType(cardType)
              .last4Digits(last4Digits)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updatePaymentCardToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .customer
              .updatePaymentCardToken(companyDomain, customerUniqueId)
              .fullName(fullName)
              .paymentCardtoken(paymentCardtoken)
              .expiryMonth(expiryMonth)
              .expiryYear(expiryYear)
              .cardType(cardType)
              .last4Digits(last4Digits)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updatePaymentCardToken");
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
| **customerUpdatePaymentCardTokenRequest** | [**CustomerUpdatePaymentCardTokenRequest**](CustomerUpdatePaymentCardTokenRequest.md)|  | [optional] |

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

<a name="updatePaymentDetailsRequest"></a>
# **updatePaymentDetailsRequest**
> String updatePaymentDetailsRequest(companyDomain, customerUniqueId).execute();

Request to update payment details



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerApi;
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
      String result = client
              .customer
              .updatePaymentDetailsRequest(companyDomain, customerUniqueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updatePaymentDetailsRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .customer
              .updatePaymentDetailsRequest(companyDomain, customerUniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updatePaymentDetailsRequest");
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

