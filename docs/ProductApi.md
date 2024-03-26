# ProductApi

All URIs are relative to *https://public.billsby.com/api/v1/rest/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCycle**](ProductApi.md#createCycle) | **POST** /{companyDomain}/products/{productId}/plans/{planId}/cycles | Create a cycle |
| [**createNewProduct**](ProductApi.md#createNewProduct) | **POST** /{companyDomain}/products | Create a product |
| [**createPlan**](ProductApi.md#createPlan) | **POST** /{companyDomain}/products/{productId}/plans | Create a plan |
| [**getDetails**](ProductApi.md#getDetails) | **GET** /{companyDomain}/products/{productId} | Product details |
| [**listPlans**](ProductApi.md#listPlans) | **GET** /{companyDomain}/products/{productId}/plans | List plans |
| [**listProducts**](ProductApi.md#listProducts) | **GET** /{companyDomain}/products | List products |
| [**updatePlanAndCycle**](ProductApi.md#updatePlanAndCycle) | **PUT** /{companyDomain}/products/{productId}/plans/{planId} | Update a plan and cycle |
| [**updatePlanOrder**](ProductApi.md#updatePlanOrder) | **PUT** /{companyDomain}/products/{productId}/plans/orders | Update plan order |
| [**updateProduct**](ProductApi.md#updateProduct) | **PUT** /{companyDomain}/products/{productId} | Update a product |


<a name="createCycle"></a>
# **createCycle**
> List&lt;ProductCreateCycleResponseInner&gt; createCycle(companyDomain, productId, planId).productCreateCycleRequest(productCreateCycleRequest).execute();

Create a cycle

Create a cycle for a specific plan

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://public.billsby.com/api/v1/rest/core";
    
    configuration.sec0  = "YOUR API KEY";
    Billsby client = new Billsby(configuration);
    List<ProductCreateCycleRequestCyclesInputModelInner> cyclesInputModel = Arrays.asList(); // Define cycle pricing model
    List<ProductCreateCycleRequestAddonPlanInputModelsInner> addonPlanInputModels = Arrays.asList(); // Define attached add-ons
    String companyDomain = "companyDomain_example"; // Your companies Billsby subdomain - for example, if you login at widgets.billsby.com, your companyDomain is widgets
    Integer productId = 56; // The unique identifier of the product in the Billsby platform
    Integer planId = 56; // The unique identifier of the plan in the Billsby platform
    List<ProductCreateCycleRequestAllowancePlanInputModelInner> allowancePlanInputModel = Arrays.asList(); // Define attached allowances
    try {
      List<ProductCreateCycleResponseInner> result = client
              .product
              .createCycle(cyclesInputModel, addonPlanInputModels, companyDomain, productId, planId)
              .allowancePlanInputModel(allowancePlanInputModel)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createCycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProductCreateCycleResponseInner>> response = client
              .product
              .createCycle(cyclesInputModel, addonPlanInputModels, companyDomain, productId, planId)
              .allowancePlanInputModel(allowancePlanInputModel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createCycle");
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
| **productId** | **Integer**| The unique identifier of the product in the Billsby platform | |
| **planId** | **Integer**| The unique identifier of the plan in the Billsby platform | |
| **productCreateCycleRequest** | [**ProductCreateCycleRequest**](ProductCreateCycleRequest.md)|  | [optional] |

### Return type

[**List&lt;ProductCreateCycleResponseInner&gt;**](ProductCreateCycleResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createNewProduct"></a>
# **createNewProduct**
> ProductCreateNewProductResponse createNewProduct(companyDomain).productCreateNewProductRequest(productCreateNewProductRequest).execute();

Create a product

Create a new product for your company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    String description = "description_example"; // A short description of the product
    String name = "name_example"; // The internal name of the product you want to create
    Integer visibility = 56; // The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public=0, Hidden=1, Internal=2, OffSale=3)
    String billingCurrency = "billingCurrency_example"; // The currency you want to the product to be billed in. This must be an ISO3 currency code with maximum three characters. For example: GBP, USD, etc.
    String displayName = "displayName_example"; // The display name of the product you want to create
    Boolean isShippingAddressRequired = true; // Do you need to collect a shipping address from your customers for this product; true or false
    Boolean isShippingAddressValidationRequired = true; // Do you want to validate the shipping address using our tool; true or false
    Boolean isBillingAddressValidationRequired = true; // Do you want to validate the billing address using our tool; true or false
    Boolean isAdditionalEmailRequired = true; // Do you want to collect an additional email address from your customers at checkout; true or false
    Boolean isPhoneNumberRequired = true; // Do you need to collect a phone number from your customers at checkout; true or false
    Boolean isMarketingConsentRequired = true; // Do you need to get marketing consent from your customers at checkout; true or false
    String alertEmail = "alertEmail_example"; // Set an email to be alerted when a customer signs up for this product
    ProductUpdateProductRequestOrderedCustomFields orderedCustomFields = new ProductUpdateProductRequestOrderedCustomFields();
    Integer typeOfProduct = 56; // The type of product you want to create; 1 is tiered
    ProductUpdateProductRequestProductCountryLimitations productCountryLimitation = new ProductUpdateProductRequestProductCountryLimitations();
    Boolean isAnyCountryAllowed = true; // Do you want to allow any country allowed access to the product; true or false
    try {
      ProductCreateNewProductResponse result = client
              .product
              .createNewProduct(companyDomain)
              .description(description)
              .name(name)
              .visibility(visibility)
              .billingCurrency(billingCurrency)
              .displayName(displayName)
              .isShippingAddressRequired(isShippingAddressRequired)
              .isShippingAddressValidationRequired(isShippingAddressValidationRequired)
              .isBillingAddressValidationRequired(isBillingAddressValidationRequired)
              .isAdditionalEmailRequired(isAdditionalEmailRequired)
              .isPhoneNumberRequired(isPhoneNumberRequired)
              .isMarketingConsentRequired(isMarketingConsentRequired)
              .alertEmail(alertEmail)
              .orderedCustomFields(orderedCustomFields)
              .typeOfProduct(typeOfProduct)
              .productCountryLimitation(productCountryLimitation)
              .isAnyCountryAllowed(isAnyCountryAllowed)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getProductCountryLimitation());
      System.out.println(result.getProductId());
      System.out.println(result.getName());
      System.out.println(result.getVisibility());
      System.out.println(result.getBillingCurrency());
      System.out.println(result.getBillingCurrencyTemplate());
      System.out.println(result.getDisplayName());
      System.out.println(result.getTypeOfProduct());
      System.out.println(result.getHasPlans());
      System.out.println(result.getIsShippingAddressRequired());
      System.out.println(result.getIsShippingAddressValidationRequired());
      System.out.println(result.getIsBillingAddressValidationRequired());
      System.out.println(result.getIsAdditionalEmailRequired());
      System.out.println(result.getIsPhoneNumberRequired());
      System.out.println(result.getIsMarketingConsentRequired());
      System.out.println(result.getNumberOfPlans());
      System.out.println(result.getAlertEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createNewProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProductCreateNewProductResponse> response = client
              .product
              .createNewProduct(companyDomain)
              .description(description)
              .name(name)
              .visibility(visibility)
              .billingCurrency(billingCurrency)
              .displayName(displayName)
              .isShippingAddressRequired(isShippingAddressRequired)
              .isShippingAddressValidationRequired(isShippingAddressValidationRequired)
              .isBillingAddressValidationRequired(isBillingAddressValidationRequired)
              .isAdditionalEmailRequired(isAdditionalEmailRequired)
              .isPhoneNumberRequired(isPhoneNumberRequired)
              .isMarketingConsentRequired(isMarketingConsentRequired)
              .alertEmail(alertEmail)
              .orderedCustomFields(orderedCustomFields)
              .typeOfProduct(typeOfProduct)
              .productCountryLimitation(productCountryLimitation)
              .isAnyCountryAllowed(isAnyCountryAllowed)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createNewProduct");
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
| **productCreateNewProductRequest** | [**ProductCreateNewProductRequest**](ProductCreateNewProductRequest.md)|  | [optional] |

### Return type

[**ProductCreateNewProductResponse**](ProductCreateNewProductResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createPlan"></a>
# **createPlan**
> ProductCreatePlanResponse createPlan(companyDomain, productId).productCreatePlanRequest(productCreatePlanRequest).execute();

Create a plan

Create a new plan for a specific product

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    String description = "description_example"; // The description of the plan
    String name = "name_example"; // The name of the plan you want to add
    String displayName = "displayName_example"; // The display name of the plan
    Integer pricingModel = 56; // The type of pricing model for the plan; FlatFee = 1, PerUnit = 2, Reserved = 3, Tiered = 4, Volume = 5, Ranged = 6
    String featureTags = "featureTags_example"; // Any feature tags you want to add to the plan
    Integer visibility = 56; // The type of visibility of each plan; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public=0, Hidden=1, Internal=2, OffSale=3)
    String redirectUrl = "redirectUrl_example"; // The URL you want to redirect your customers to when they have completed the checkout flow
    String alertEmail = "alertEmail_example"; // The email you would like to receive an alert when a customer signs up for this plan
    try {
      ProductCreatePlanResponse result = client
              .product
              .createPlan(companyDomain, productId)
              .description(description)
              .name(name)
              .displayName(displayName)
              .pricingModel(pricingModel)
              .featureTags(featureTags)
              .visibility(visibility)
              .redirectUrl(redirectUrl)
              .alertEmail(alertEmail)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getPlanId());
      System.out.println(result.getName());
      System.out.println(result.getDisplayName());
      System.out.println(result.getPricingModelType());
      System.out.println(result.getProductId());
      System.out.println(result.getCycles());
      System.out.println(result.getFeatureTags());
      System.out.println(result.getVisibility());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getHasActiveSubscription());
      System.out.println(result.getAlertEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProductCreatePlanResponse> response = client
              .product
              .createPlan(companyDomain, productId)
              .description(description)
              .name(name)
              .displayName(displayName)
              .pricingModel(pricingModel)
              .featureTags(featureTags)
              .visibility(visibility)
              .redirectUrl(redirectUrl)
              .alertEmail(alertEmail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createPlan");
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
| **productId** | **Integer**| The unique identifier of the product in the Billsby platform | |
| **productCreatePlanRequest** | [**ProductCreatePlanRequest**](ProductCreatePlanRequest.md)|  | [optional] |

### Return type

[**ProductCreatePlanResponse**](ProductCreatePlanResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getDetails"></a>
# **getDetails**
> ProductGetDetailsResponse getDetails(companyDomain, productId).execute();

Product details

Get the details of a specific product

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    try {
      ProductGetDetailsResponse result = client
              .product
              .getDetails(companyDomain, productId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getProductCountryLimitation());
      System.out.println(result.getProductId());
      System.out.println(result.getName());
      System.out.println(result.getVisibility());
      System.out.println(result.getBillingCurrency());
      System.out.println(result.getBillingCurrencyTemplate());
      System.out.println(result.getDisplayName());
      System.out.println(result.getTypeOfProduct());
      System.out.println(result.getHasPlans());
      System.out.println(result.getIsShippingAddressRequired());
      System.out.println(result.getIsShippingAddressValidationRequired());
      System.out.println(result.getIsBillingAddressValidationRequired());
      System.out.println(result.getIsAdditionalEmailRequired());
      System.out.println(result.getIsPhoneNumberRequired());
      System.out.println(result.getIsMarketingConsentRequired());
      System.out.println(result.getNumberOfPlans());
      System.out.println(result.getAlertEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProductGetDetailsResponse> response = client
              .product
              .getDetails(companyDomain, productId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getDetails");
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
| **productId** | **Integer**| The unique identifier of the product in the Billsby platform | |

### Return type

[**ProductGetDetailsResponse**](ProductGetDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listPlans"></a>
# **listPlans**
> List&lt;ProductListPlansResponseInner&gt; listPlans(companyDomain, productId).execute();

List plans

Get a list of plans associated with a specific product

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    try {
      List<ProductListPlansResponseInner> result = client
              .product
              .listPlans(companyDomain, productId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listPlans");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProductListPlansResponseInner>> response = client
              .product
              .listPlans(companyDomain, productId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listPlans");
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
| **productId** | **Integer**| The unique identifier of the product in the Billsby platform | |

### Return type

[**List&lt;ProductListPlansResponseInner&gt;**](ProductListPlansResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listProducts"></a>
# **listProducts**
> ProductListProductsResponse listProducts(companyDomain, page, pageSize).search(search).visibilityType(visibilityType).execute();

List products



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    Integer page = 56; // The number of the page you would like to return
    Integer pageSize = 56; // The number of entries per page you would like to return
    String search = "search_example"; // Filter products by name (this can be a partial name)
    Integer visibilityType = 56; // The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public=0, Hidden=1, Internal=2, OffSale=3)
    try {
      ProductListProductsResponse result = client
              .product
              .listProducts(companyDomain, page, pageSize)
              .search(search)
              .visibilityType(visibilityType)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrentPage());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getRowCount());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listProducts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProductListProductsResponse> response = client
              .product
              .listProducts(companyDomain, page, pageSize)
              .search(search)
              .visibilityType(visibilityType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listProducts");
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
| **page** | **Integer**| The number of the page you would like to return | |
| **pageSize** | **Integer**| The number of entries per page you would like to return | |
| **search** | **String**| Filter products by name (this can be a partial name) | [optional] |
| **visibilityType** | **Integer**| The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public&#x3D;0, Hidden&#x3D;1, Internal&#x3D;2, OffSale&#x3D;3) | [optional] |

### Return type

[**ProductListProductsResponse**](ProductListProductsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updatePlanAndCycle"></a>
# **updatePlanAndCycle**
> String updatePlanAndCycle(companyDomain, productId, planId).productUpdatePlanAndCycleRequest(productUpdatePlanAndCycleRequest).execute();

Update a plan and cycle

Update a plan and cycle for your company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    Integer planId = 56; // The unique identifier of the plan in the Billsby platform
    String description = "description_example"; // The description of the plan
    String name = "name_example"; // The name of the plan you want to update
    String displayName = "displayName_example"; // The display name of the plan you want to update
    String featureTags = "featureTags_example"; // The feature tags associated with the plan
    Integer visibility = 56; // The visibility of the plan
    ProductUpdatePlanAndCycleRequestCycles cycles = new ProductUpdatePlanAndCycleRequestCycles();
    String redirectUrl = "redirectUrl_example"; // The URL you want your customer to redirected to when they have completed the checkout flow
    String alertEmail = "alertEmail_example"; // Set up an email to receive alerts when a customer signs up for the plan
    try {
      String result = client
              .product
              .updatePlanAndCycle(companyDomain, productId, planId)
              .description(description)
              .name(name)
              .displayName(displayName)
              .featureTags(featureTags)
              .visibility(visibility)
              .cycles(cycles)
              .redirectUrl(redirectUrl)
              .alertEmail(alertEmail)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updatePlanAndCycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .product
              .updatePlanAndCycle(companyDomain, productId, planId)
              .description(description)
              .name(name)
              .displayName(displayName)
              .featureTags(featureTags)
              .visibility(visibility)
              .cycles(cycles)
              .redirectUrl(redirectUrl)
              .alertEmail(alertEmail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updatePlanAndCycle");
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
| **productId** | **Integer**| The unique identifier of the product in the Billsby platform | |
| **planId** | **Integer**| The unique identifier of the plan in the Billsby platform | |
| **productUpdatePlanAndCycleRequest** | [**ProductUpdatePlanAndCycleRequest**](ProductUpdatePlanAndCycleRequest.md)|  | [optional] |

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

<a name="updatePlanOrder"></a>
# **updatePlanOrder**
> String updatePlanOrder(companyDomain, productId).productUpdatePlanOrderRequest(productUpdatePlanOrderRequest).execute();

Update plan order

Change the order in which your plans displayed

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    String productId = "productId_example"; // The unique identifier of the product in the Billsby platform
    List<Integer> orderedPlanIds = Arrays.asList(); // A list of Plan IDs in the desired order to show
    try {
      String result = client
              .product
              .updatePlanOrder(companyDomain, productId)
              .orderedPlanIds(orderedPlanIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updatePlanOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .product
              .updatePlanOrder(companyDomain, productId)
              .orderedPlanIds(orderedPlanIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updatePlanOrder");
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
| **productId** | **String**| The unique identifier of the product in the Billsby platform | |
| **productUpdatePlanOrderRequest** | [**ProductUpdatePlanOrderRequest**](ProductUpdatePlanOrderRequest.md)|  | [optional] |

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

<a name="updateProduct"></a>
# **updateProduct**
> ProductUpdateProductResponse updateProduct(companyDomain, productID).productUpdateProductRequest(productUpdateProductRequest).execute();

Update a product

Update product for your company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Billsby;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    Integer productID = 56; // The unique identifier of the product in the Billsby platform
    String name = "name_example"; // The name of the product you want to update
    Integer visibility = 56; // The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public=0, Hidden=1, Internal=2, OffSale=3)
    String billingCurrency = "billingCurrency_example"; // The currency you want to the product to be billed in. This must be an ISO3 currency code with maximum three characters. For example: GBP, USD, etc
    String displayName = "displayName_example"; // The display name of the product you want to create
    String decription = "decription_example"; // A short description of the product
    Boolean isShippingAddressRequired = true; // Do you need to collect a shipping address from your customers for this product; true or false
    Boolean isShippingAddressValidationRequired = true; // Do you want to validate the shipping address using our tool; true or false
    Boolean isBillingAddressValidationRequired = true; // Do you want to validate the billing address using our tool; true or false
    Boolean isAdditionalEmailRequired = true; // Do you want to collect an additional email address from your customers at checkout; true or false
    Boolean isPhoneNumberRequired = true; // Do you need to collect a phone number from your customers at checkout; true or flase
    Boolean isMarketingConsentRequired = true; // Do you need to get marketing consent from your customers at checkout; true or false
    String alertEmail = "alertEmail_example"; // Set an email to be alerted when a customer signs up for this product
    ProductUpdateProductRequestOrderedCustomFields orderedCustomFields = new ProductUpdateProductRequestOrderedCustomFields();
    Integer typeOfProduct = 56; // The type of product you want to create; 1 is tiered
    ProductUpdateProductRequestProductCountryLimitations productCountryLimitations = new ProductUpdateProductRequestProductCountryLimitations();
    try {
      ProductUpdateProductResponse result = client
              .product
              .updateProduct(companyDomain, productID)
              .name(name)
              .visibility(visibility)
              .billingCurrency(billingCurrency)
              .displayName(displayName)
              .decription(decription)
              .isShippingAddressRequired(isShippingAddressRequired)
              .isShippingAddressValidationRequired(isShippingAddressValidationRequired)
              .isBillingAddressValidationRequired(isBillingAddressValidationRequired)
              .isAdditionalEmailRequired(isAdditionalEmailRequired)
              .isPhoneNumberRequired(isPhoneNumberRequired)
              .isMarketingConsentRequired(isMarketingConsentRequired)
              .alertEmail(alertEmail)
              .orderedCustomFields(orderedCustomFields)
              .typeOfProduct(typeOfProduct)
              .productCountryLimitations(productCountryLimitations)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getProductCountryLimitation());
      System.out.println(result.getProductId());
      System.out.println(result.getName());
      System.out.println(result.getVisibility());
      System.out.println(result.getBillingCurrency());
      System.out.println(result.getBillingCurrencyTemplate());
      System.out.println(result.getDisplayName());
      System.out.println(result.getTypeOfProduct());
      System.out.println(result.getHasPlans());
      System.out.println(result.getIsShippingAddressRequired());
      System.out.println(result.getIsShippingAddressValidationRequired());
      System.out.println(result.getIsBillingAddressValidationRequired());
      System.out.println(result.getIsAdditionalEmailRequired());
      System.out.println(result.getIsPhoneNumberRequired());
      System.out.println(result.getIsMarketingConsentRequired());
      System.out.println(result.getNumberOfPlans());
      System.out.println(result.getAlertEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProductUpdateProductResponse> response = client
              .product
              .updateProduct(companyDomain, productID)
              .name(name)
              .visibility(visibility)
              .billingCurrency(billingCurrency)
              .displayName(displayName)
              .decription(decription)
              .isShippingAddressRequired(isShippingAddressRequired)
              .isShippingAddressValidationRequired(isShippingAddressValidationRequired)
              .isBillingAddressValidationRequired(isBillingAddressValidationRequired)
              .isAdditionalEmailRequired(isAdditionalEmailRequired)
              .isPhoneNumberRequired(isPhoneNumberRequired)
              .isMarketingConsentRequired(isMarketingConsentRequired)
              .alertEmail(alertEmail)
              .orderedCustomFields(orderedCustomFields)
              .typeOfProduct(typeOfProduct)
              .productCountryLimitations(productCountryLimitations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateProduct");
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
| **productID** | **Integer**| The unique identifier of the product in the Billsby platform | |
| **productUpdateProductRequest** | [**ProductUpdateProductRequest**](ProductUpdateProductRequest.md)|  | [optional] |

### Return type

[**ProductUpdateProductResponse**](ProductUpdateProductResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

