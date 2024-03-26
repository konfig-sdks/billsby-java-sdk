<div align="left">

[![Visit Billsby](./header.png)](https://www.billsby.com&#x2F;)

# [Billsby](https://www.billsby.com&#x2F;)

Billsby is a feature-rich "Saas" recurring payment platform, ranked as the leading subscription billing software by G2.

Billsby is designed to ensure customers can go live quickly, often within 1-2 hours.  To help facilitate this process we have a team of friendly knowledgeable advisors ready to help your business go live.    

Billsby specializes in providing great customer service at an affordable price point - our technology is rated No 1 on G2 by our customers.

If you are a developer creating a solution for your customer, Billsby has a friendly well-documented API.  The Billsby team are here to provide support to developers in order to ensure a smooth migration or new system build. 

Why not book a call, talk through your Billing requirements and we can let you know how we can help you transform your business..

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Billsby&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>billsby-java-sdk</artifactId>
  <version>1.3.5</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:billsby-java-sdk:1.3.5"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/billsby-java-sdk-1.3.5.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://public.billsby.com/api/v1/rest/core*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddonApi* | [**getAddonList**](docs/AddonApi.md#getAddonList) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/addons | Get add-ons for specific subscription
*AddonApi* | [**getDetails**](docs/AddonApi.md#getDetails) | **GET** /{companyDomain}/addons/{addonId} | Get add-on details
*AddonApi* | [**listAvailableAddons**](docs/AddonApi.md#listAvailableAddons) | **GET** /{companyDomain}/addons | Get a list of available add-ons
*AllowanceApi* | [**getDetails**](docs/AllowanceApi.md#getDetails) | **GET** /{companyDomain}/allowances/{allowanceId} | Get allowance details
*AllowanceApi* | [**getList**](docs/AllowanceApi.md#getList) | **GET** /{companyDomain}/allowances | Get a list of available allowances
*AllowanceApi* | [**getSpecificSubscriptionAllowances**](docs/AllowanceApi.md#getSpecificSubscriptionAllowances) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/allowances | Get allowances for specific subscription
*CreditnoteApi* | [**list**](docs/CreditnoteApi.md#list) | **GET** /{companyDomain}/companies/creditnotes | Company credit notes
*CreditnoteApi* | [**reattemptPayment**](docs/CreditnoteApi.md#reattemptPayment) | **PUT** /{companyDomain} /creditNotes /{creditNoteNumber} /Payment | Reattempt credit note payment
*CustomFieldApi* | [**createNewField**](docs/CustomFieldApi.md#createNewField) | **POST** /{companyDomain}/customfields | Create custom field
*CustomFieldApi* | [**getResponse**](docs/CustomFieldApi.md#getResponse) | **GET** /{companyDomain}/customfieldResponses | Custom fields response
*CustomFieldApi* | [**list**](docs/CustomFieldApi.md#list) | **GET** /{companyDomain}/customfields | Custom fields
*CustomFieldApi* | [**updateField**](docs/CustomFieldApi.md#updateField) | **PUT** /{companyDomain}/customfields/{customFieldId} | Update custom field
*CustomerApi* | [**addSubscriptionToExistingCustomer**](docs/CustomerApi.md#addSubscriptionToExistingCustomer) | **POST** /{companyDomain}/customers/{customerUniqueId}/subscriptions | Add subscription to existing customer
*CustomerApi* | [**clearGdprData**](docs/CustomerApi.md#clearGdprData) | **PUT** /{companyDomain}/customers/{customerUniqueId}/gdprcleanup | Clear customer data (GDPR)
*CustomerApi* | [**createNewCustomerAndSubscription**](docs/CustomerApi.md#createNewCustomerAndSubscription) | **POST** /{companyDomain}/subscriptions | Create new customer and subscription
*CustomerApi* | [**createWithoutSubscription**](docs/CustomerApi.md#createWithoutSubscription) | **POST** /{companyDomain}/customers | Create without subscription
*CustomerApi* | [**deleteById**](docs/CustomerApi.md#deleteById) | **DELETE** /{companyDomain}/customers/{customerUniqueId} | Delete a customer
*CustomerApi* | [**getCreditNotes**](docs/CustomerApi.md#getCreditNotes) | **GET** /{companyDomain}/customers/{customerUniqueId}/creditNotes | Customer credit notes
*CustomerApi* | [**getDetails**](docs/CustomerApi.md#getDetails) | **GET** /{companyDomain}/customers/{customerUniqueId} | Customer details
*CustomerApi* | [**getFeatureTags**](docs/CustomerApi.md#getFeatureTags) | **GET** /{companyDomain}/customers/{customerUniqueId}/subscriptions/featuretags | Customer feature tags
*CustomerApi* | [**getSubscriptionsByUniqueId**](docs/CustomerApi.md#getSubscriptionsByUniqueId) | **GET** /{companyDomain}/customers/{customerUniqueId}/subscriptions | Customer subscriptions
*CustomerApi* | [**listCustomers**](docs/CustomerApi.md#listCustomers) | **GET** /{companyDomain}/customers | List customers
*CustomerApi* | [**updateCustomFieldResponse**](docs/CustomerApi.md#updateCustomFieldResponse) | **PUT** /{companyDomain}/customfieldResponses/{customFieldResponseId} | Update customer response to custom fields
*CustomerApi* | [**updateDetails**](docs/CustomerApi.md#updateDetails) | **PUT** /{companyDomain}/customers/{customerUniqueId} | Update customer
*CustomerApi* | [**updatePaymentCardToken**](docs/CustomerApi.md#updatePaymentCardToken) | **PUT** /{companyDomain}/customers/{customerUniqueId}/paymentCard | Update payment card token
*CustomerApi* | [**updatePaymentDetailsRequest**](docs/CustomerApi.md#updatePaymentDetailsRequest) | **GET** /{companyDomain}/customers/{customerUniqueId}/paymentdetailsrequest | Request to update payment details
*InvoiceApi* | [**createOneTimeCharge**](docs/InvoiceApi.md#createOneTimeCharge) | **POST** /{companyDomain}/customers/{customerUniqueId}/invoices | Create a one-time charge
*InvoiceApi* | [**createRefund**](docs/InvoiceApi.md#createRefund) | **POST** /{companyDomain}/customers/{customerUniqueId}/refunds | Refund an invoice
*InvoiceApi* | [**details**](docs/InvoiceApi.md#details) | **GET** /invoices/{invoiceNumber} | Individual invoices
*InvoiceApi* | [**getCustomerInvoices**](docs/InvoiceApi.md#getCustomerInvoices) | **GET** /{companyDomain}/customers/{customerUniqueId}/invoices | Customer invoices
*InvoiceApi* | [**getPaymentLogs**](docs/InvoiceApi.md#getPaymentLogs) | **GET** /{companyDomain}/customers/{customerUniqueId}/invoices/{invoiceNumber}/paymentlogs | Customer payment logs
*InvoiceApi* | [**listCompanyInvoices**](docs/InvoiceApi.md#listCompanyInvoices) | **GET** /{companyDomain}/companies/invoices | Company invoices
*InvoiceApi* | [**markAsPaidOffline**](docs/InvoiceApi.md#markAsPaidOffline) | **PUT** /{companyDomain}/invoices/{invoiceNumber}/PaidOffline | Invoice paid offline
*InvoiceApi* | [**markWrittenOff**](docs/InvoiceApi.md#markWrittenOff) | **PUT** /{companyDomain}/invoices/{invoiceNumber}/WrittenOff | Invoice written off
*InvoiceApi* | [**reattemptPayment**](docs/InvoiceApi.md#reattemptPayment) | **PUT** /{companyDomain}/invoices/{invoiceNumber}/Payment | Reattempt invoice payment
*ProductApi* | [**createCycle**](docs/ProductApi.md#createCycle) | **POST** /{companyDomain}/products/{productId}/plans/{planId}/cycles | Create a cycle
*ProductApi* | [**createNewProduct**](docs/ProductApi.md#createNewProduct) | **POST** /{companyDomain}/products | Create a product
*ProductApi* | [**createPlan**](docs/ProductApi.md#createPlan) | **POST** /{companyDomain}/products/{productId}/plans | Create a plan
*ProductApi* | [**getDetails**](docs/ProductApi.md#getDetails) | **GET** /{companyDomain}/products/{productId} | Product details
*ProductApi* | [**listPlans**](docs/ProductApi.md#listPlans) | **GET** /{companyDomain}/products/{productId}/plans | List plans
*ProductApi* | [**listProducts**](docs/ProductApi.md#listProducts) | **GET** /{companyDomain}/products | List products
*ProductApi* | [**updatePlanAndCycle**](docs/ProductApi.md#updatePlanAndCycle) | **PUT** /{companyDomain}/products/{productId}/plans/{planId} | Update a plan and cycle
*ProductApi* | [**updatePlanOrder**](docs/ProductApi.md#updatePlanOrder) | **PUT** /{companyDomain}/products/{productId}/plans/orders | Update plan order
*ProductApi* | [**updateProduct**](docs/ProductApi.md#updateProduct) | **PUT** /{companyDomain}/products/{productId} | Update a product
*SubscriptionApi* | [**addFeatureTags**](docs/SubscriptionApi.md#addFeatureTags) | **POST** /{companyDomain}/subscriptions/tags | Add feature tags
*SubscriptionApi* | [**cancelSubscription**](docs/SubscriptionApi.md#cancelSubscription) | **DELETE** /{companyDomain}/subscriptions/{subscriptionUniqueId} | Cancel a subscription
*SubscriptionApi* | [**changePlan**](docs/SubscriptionApi.md#changePlan) | **PUT** /{companyDomain}/subscriptions/{subscriptionUniqueId}/plan | Change plan
*SubscriptionApi* | [**featureTagsSplit**](docs/SubscriptionApi.md#featureTagsSplit) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/tags/split | Feature tags by plan and custom tags
*SubscriptionApi* | [**getCountersValue**](docs/SubscriptionApi.md#getCountersValue) | **GET** /usage/{companyDomain}/subscriptions/{subscriptionUniqueId}/counters/{counterId} | Counter value
*SubscriptionApi* | [**getDetails**](docs/SubscriptionApi.md#getDetails) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId} | Subscription details
*SubscriptionApi* | [**getEventLogs**](docs/SubscriptionApi.md#getEventLogs) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/logs | Event logs
*SubscriptionApi* | [**getShippingAddress**](docs/SubscriptionApi.md#getShippingAddress) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/shippingAddress | Shipping address
*SubscriptionApi* | [**listSubscriptions**](docs/SubscriptionApi.md#listSubscriptions) | **GET** /{companyDomain}/subscriptions | List subscriptions
*SubscriptionApi* | [**listTagsBySubscription**](docs/SubscriptionApi.md#listTagsBySubscription) | **GET** /{companyDomain}/subscriptions/{subscriptionUniqueId}/tags | Feature tags by Subscription
*SubscriptionApi* | [**removeFeatureTag**](docs/SubscriptionApi.md#removeFeatureTag) | **DELETE** /{companyDomain}/subscriptions/tags/{tagname} | Delete feature tag
*SubscriptionApi* | [**updateCounter**](docs/SubscriptionApi.md#updateCounter) | **POST** /operations/{companyDomain}/subscriptions/{subscriptionUniqueId}/counters/{counterId} | Update counter
*SubscriptionApi* | [**updateRenewalDate**](docs/SubscriptionApi.md#updateRenewalDate) | **PUT** /{companyDomain}/subscriptions/{subscriptionUniqueId}/renewaldate | Update next renewal date
*SubscriptionApi* | [**updateShippingAddress**](docs/SubscriptionApi.md#updateShippingAddress) | **PUT** /{companyDomain}/subscriptions/{subscriptionUniqueId}/shippingAddress | Update subscription shipping address


## Documentation for Models

 - [AddonGetDetailsResponse](docs/AddonGetDetailsResponse.md)
 - [AddonGetDetailsResponsePlansInner](docs/AddonGetDetailsResponsePlansInner.md)
 - [AddonGetDetailsResponsePriceModelsInner](docs/AddonGetDetailsResponsePriceModelsInner.md)
 - [AddonGetDetailsResponsePriceModelsInnerTiersInner](docs/AddonGetDetailsResponsePriceModelsInnerTiersInner.md)
 - [AddonListAvailableAddonsResponseInner](docs/AddonListAvailableAddonsResponseInner.md)
 - [AllowanceGetDetailsResponse](docs/AllowanceGetDetailsResponse.md)
 - [AllowanceGetDetailsResponseCounter](docs/AllowanceGetDetailsResponseCounter.md)
 - [AllowanceGetDetailsResponsePlansInner](docs/AllowanceGetDetailsResponsePlansInner.md)
 - [AllowanceGetDetailsResponsePriceModelsInner](docs/AllowanceGetDetailsResponsePriceModelsInner.md)
 - [AllowanceGetDetailsResponsePriceModelsInnerTiersInner](docs/AllowanceGetDetailsResponsePriceModelsInnerTiersInner.md)
 - [CreditnoteListResponse](docs/CreditnoteListResponse.md)
 - [CreditnoteListResponseResultsInner](docs/CreditnoteListResponseResultsInner.md)
 - [CustomFieldCreateNewFieldRequest](docs/CustomFieldCreateNewFieldRequest.md)
 - [CustomFieldGetResponseResponseInner](docs/CustomFieldGetResponseResponseInner.md)
 - [CustomFieldGetResponseResponseInnerCustomField](docs/CustomFieldGetResponseResponseInnerCustomField.md)
 - [CustomFieldListResponseInner](docs/CustomFieldListResponseInner.md)
 - [CustomFieldUpdateFieldRequest](docs/CustomFieldUpdateFieldRequest.md)
 - [CustomerAddSubscriptionToExistingCustomerRequest](docs/CustomerAddSubscriptionToExistingCustomerRequest.md)
 - [CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner](docs/CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner.md)
 - [CustomerAddSubscriptionToExistingCustomerRequestAddress](docs/CustomerAddSubscriptionToExistingCustomerRequestAddress.md)
 - [CustomerAddSubscriptionToExistingCustomerRequestCouponCodesInner](docs/CustomerAddSubscriptionToExistingCustomerRequestCouponCodesInner.md)
 - [CustomerAddSubscriptionToExistingCustomerRequestCustomFieldResponseInner](docs/CustomerAddSubscriptionToExistingCustomerRequestCustomFieldResponseInner.md)
 - [CustomerAddSubscriptionToExistingCustomerResponse](docs/CustomerAddSubscriptionToExistingCustomerResponse.md)
 - [CustomerCreateNewCustomerAndSubscriptionRequest](docs/CustomerCreateNewCustomerAndSubscriptionRequest.md)
 - [CustomerCreateNewCustomerAndSubscriptionRequestAddress](docs/CustomerCreateNewCustomerAndSubscriptionRequestAddress.md)
 - [CustomerCreateNewCustomerAndSubscriptionRequestCardDetails](docs/CustomerCreateNewCustomerAndSubscriptionRequestCardDetails.md)
 - [CustomerCreateNewCustomerAndSubscriptionRequestShippingAddress](docs/CustomerCreateNewCustomerAndSubscriptionRequestShippingAddress.md)
 - [CustomerCreateNewCustomerAndSubscriptionResponse](docs/CustomerCreateNewCustomerAndSubscriptionResponse.md)
 - [CustomerCreateWithoutSubscriptionRequest](docs/CustomerCreateWithoutSubscriptionRequest.md)
 - [CustomerCreateWithoutSubscriptionRequestCardDetails](docs/CustomerCreateWithoutSubscriptionRequestCardDetails.md)
 - [CustomerCreateWithoutSubscriptionResponse](docs/CustomerCreateWithoutSubscriptionResponse.md)
 - [CustomerGetCreditNotesResponseInner](docs/CustomerGetCreditNotesResponseInner.md)
 - [CustomerGetDetailsResponse](docs/CustomerGetDetailsResponse.md)
 - [CustomerGetDetailsResponseBillingAddress](docs/CustomerGetDetailsResponseBillingAddress.md)
 - [CustomerGetSubscriptionsByUniqueIdResponseInner](docs/CustomerGetSubscriptionsByUniqueIdResponseInner.md)
 - [CustomerUpdateCustomFieldResponseRequest](docs/CustomerUpdateCustomFieldResponseRequest.md)
 - [CustomerUpdateCustomFieldResponseResponseInner](docs/CustomerUpdateCustomFieldResponseResponseInner.md)
 - [CustomerUpdateCustomFieldResponseResponseInnerCustomField](docs/CustomerUpdateCustomFieldResponseResponseInnerCustomField.md)
 - [CustomerUpdateDetailsRequest](docs/CustomerUpdateDetailsRequest.md)
 - [CustomerUpdateDetailsRequestBillingAddress](docs/CustomerUpdateDetailsRequestBillingAddress.md)
 - [CustomerUpdateDetailsResponse](docs/CustomerUpdateDetailsResponse.md)
 - [CustomerUpdateDetailsResponseBillingAddress](docs/CustomerUpdateDetailsResponseBillingAddress.md)
 - [CustomerUpdatePaymentCardTokenRequest](docs/CustomerUpdatePaymentCardTokenRequest.md)
 - [InvoiceCreateOneTimeChargeRequest](docs/InvoiceCreateOneTimeChargeRequest.md)
 - [InvoiceCreateRefundRequest](docs/InvoiceCreateRefundRequest.md)
 - [InvoiceCreateRefundResponse](docs/InvoiceCreateRefundResponse.md)
 - [InvoiceDetailsResponse](docs/InvoiceDetailsResponse.md)
 - [InvoiceDetailsResponseSubscriptionsInner](docs/InvoiceDetailsResponseSubscriptionsInner.md)
 - [InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner](docs/InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.md)
 - [InvoiceGetCustomerInvoicesResponseInner](docs/InvoiceGetCustomerInvoicesResponseInner.md)
 - [InvoiceGetPaymentLogsResponseInner](docs/InvoiceGetPaymentLogsResponseInner.md)
 - [ProductCreateCycleRequest](docs/ProductCreateCycleRequest.md)
 - [ProductCreateCycleRequestAddonPlanInputModelsInner](docs/ProductCreateCycleRequestAddonPlanInputModelsInner.md)
 - [ProductCreateCycleRequestAddonPlanInputModelsInnerAddonPriceModelsInner](docs/ProductCreateCycleRequestAddonPlanInputModelsInnerAddonPriceModelsInner.md)
 - [ProductCreateCycleRequestAllowancePlanInputModelInner](docs/ProductCreateCycleRequestAllowancePlanInputModelInner.md)
 - [ProductCreateCycleRequestAllowancePlanInputModelInnerAllowancePriceModelsInner](docs/ProductCreateCycleRequestAllowancePlanInputModelInnerAllowancePriceModelsInner.md)
 - [ProductCreateCycleRequestCyclesInputModelInner](docs/ProductCreateCycleRequestCyclesInputModelInner.md)
 - [ProductCreateCycleRequestCyclesInputModelInnerTiersInner](docs/ProductCreateCycleRequestCyclesInputModelInnerTiersInner.md)
 - [ProductCreateCycleResponseInner](docs/ProductCreateCycleResponseInner.md)
 - [ProductCreateCycleResponseInnerPricingModel](docs/ProductCreateCycleResponseInnerPricingModel.md)
 - [ProductCreateNewProductRequest](docs/ProductCreateNewProductRequest.md)
 - [ProductCreateNewProductResponse](docs/ProductCreateNewProductResponse.md)
 - [ProductCreateNewProductResponseProductCountryLimitation](docs/ProductCreateNewProductResponseProductCountryLimitation.md)
 - [ProductCreateNewProductResponseProductCountryLimitationCountrySettingsInner](docs/ProductCreateNewProductResponseProductCountryLimitationCountrySettingsInner.md)
 - [ProductCreatePlanRequest](docs/ProductCreatePlanRequest.md)
 - [ProductCreatePlanResponse](docs/ProductCreatePlanResponse.md)
 - [ProductCreatePlanResponseCyclesInner](docs/ProductCreatePlanResponseCyclesInner.md)
 - [ProductCreatePlanResponseCyclesInnerPricingModel](docs/ProductCreatePlanResponseCyclesInnerPricingModel.md)
 - [ProductGetDetailsResponse](docs/ProductGetDetailsResponse.md)
 - [ProductGetDetailsResponseProductCountryLimitation](docs/ProductGetDetailsResponseProductCountryLimitation.md)
 - [ProductGetDetailsResponseProductCountryLimitationCountrySettingsInner](docs/ProductGetDetailsResponseProductCountryLimitationCountrySettingsInner.md)
 - [ProductListPlansResponseInner](docs/ProductListPlansResponseInner.md)
 - [ProductListPlansResponseInnerCyclesInner](docs/ProductListPlansResponseInnerCyclesInner.md)
 - [ProductListPlansResponseInnerCyclesInnerPricingModel](docs/ProductListPlansResponseInnerCyclesInnerPricingModel.md)
 - [ProductListProductsResponse](docs/ProductListProductsResponse.md)
 - [ProductListProductsResponseResultsInner](docs/ProductListProductsResponseResultsInner.md)
 - [ProductListProductsResponseResultsInnerCustomFieldsInner](docs/ProductListProductsResponseResultsInnerCustomFieldsInner.md)
 - [ProductUpdatePlanAndCycleRequest](docs/ProductUpdatePlanAndCycleRequest.md)
 - [ProductUpdatePlanAndCycleRequestCycles](docs/ProductUpdatePlanAndCycleRequestCycles.md)
 - [ProductUpdatePlanAndCycleRequestCyclesTiers](docs/ProductUpdatePlanAndCycleRequestCyclesTiers.md)
 - [ProductUpdatePlanOrderRequest](docs/ProductUpdatePlanOrderRequest.md)
 - [ProductUpdateProductRequest](docs/ProductUpdateProductRequest.md)
 - [ProductUpdateProductRequestOrderedCustomFields](docs/ProductUpdateProductRequestOrderedCustomFields.md)
 - [ProductUpdateProductRequestProductCountryLimitations](docs/ProductUpdateProductRequestProductCountryLimitations.md)
 - [ProductUpdateProductResponse](docs/ProductUpdateProductResponse.md)
 - [ProductUpdateProductResponseProductCountryLimitation](docs/ProductUpdateProductResponseProductCountryLimitation.md)
 - [ProductUpdateProductResponseProductCountryLimitationCountrySettingsInner](docs/ProductUpdateProductResponseProductCountryLimitationCountrySettingsInner.md)
 - [SubscriptionAddFeatureTagsRequest](docs/SubscriptionAddFeatureTagsRequest.md)
 - [SubscriptionChangePlanRequest](docs/SubscriptionChangePlanRequest.md)
 - [SubscriptionFeatureTagsSplitResponse](docs/SubscriptionFeatureTagsSplitResponse.md)
 - [SubscriptionGetCountersValueResponse](docs/SubscriptionGetCountersValueResponse.md)
 - [SubscriptionGetEventLogsResponse](docs/SubscriptionGetEventLogsResponse.md)
 - [SubscriptionGetEventLogsResponseResultsInner](docs/SubscriptionGetEventLogsResponseResultsInner.md)
 - [SubscriptionGetShippingAddressResponse](docs/SubscriptionGetShippingAddressResponse.md)
 - [SubscriptionListSubscriptionsResponse](docs/SubscriptionListSubscriptionsResponse.md)
 - [SubscriptionListSubscriptionsResponseResultsInner](docs/SubscriptionListSubscriptionsResponseResultsInner.md)
 - [SubscriptionUpdateCounterRequest](docs/SubscriptionUpdateCounterRequest.md)
 - [SubscriptionUpdateRenewalDateRequest](docs/SubscriptionUpdateRenewalDateRequest.md)
 - [SubscriptionUpdateShippingAddressRequest](docs/SubscriptionUpdateShippingAddressRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
