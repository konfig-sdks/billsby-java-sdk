/*
 * Billsby API
 * Billsby is a feature-rich \"Saas\" recurring payment platform, ranked as the leading subscription billing software by G2.  Billsby is designed to ensure customers can go live quickly, often within 1-2 hours.  To help facilitate this process we have a team of friendly knowledgeable advisors ready to help your business go live.      Billsby specializes in providing great customer service at an affordable price point - our technology is rated No 1 on G2 by our customers.  If you are a developer creating a solution for your customer, Billsby has a friendly well-documented API.  The Billsby team are here to provide support to developers in order to ensure a smooth migration or new system build.   Why not book a call, talk through your Billing requirements and we can let you know how we can help you transform your business..
 *
 * The version of the OpenAPI document: 1.3.5
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ProductUpdateProductRequestOrderedCustomFields;
import com.konfigthis.client.model.ProductUpdateProductRequestProductCountryLimitations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ProductCreateNewProductRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProductCreateNewProductRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private Integer visibility;

  public static final String SERIALIZED_NAME_BILLING_CURRENCY = "billingCurrency";
  @SerializedName(SERIALIZED_NAME_BILLING_CURRENCY)
  private String billingCurrency;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_IS_SHIPPING_ADDRESS_REQUIRED = "isShippingAddressRequired";
  @SerializedName(SERIALIZED_NAME_IS_SHIPPING_ADDRESS_REQUIRED)
  private Boolean isShippingAddressRequired;

  public static final String SERIALIZED_NAME_IS_SHIPPING_ADDRESS_VALIDATION_REQUIRED = "isShippingAddressValidationRequired";
  @SerializedName(SERIALIZED_NAME_IS_SHIPPING_ADDRESS_VALIDATION_REQUIRED)
  private Boolean isShippingAddressValidationRequired;

  public static final String SERIALIZED_NAME_IS_BILLING_ADDRESS_VALIDATION_REQUIRED = "isBillingAddressValidationRequired";
  @SerializedName(SERIALIZED_NAME_IS_BILLING_ADDRESS_VALIDATION_REQUIRED)
  private Boolean isBillingAddressValidationRequired;

  public static final String SERIALIZED_NAME_IS_ADDITIONAL_EMAIL_REQUIRED = "isAdditionalEmailRequired";
  @SerializedName(SERIALIZED_NAME_IS_ADDITIONAL_EMAIL_REQUIRED)
  private Boolean isAdditionalEmailRequired;

  public static final String SERIALIZED_NAME_IS_PHONE_NUMBER_REQUIRED = "isPhoneNumberRequired";
  @SerializedName(SERIALIZED_NAME_IS_PHONE_NUMBER_REQUIRED)
  private Boolean isPhoneNumberRequired;

  public static final String SERIALIZED_NAME_IS_MARKETING_CONSENT_REQUIRED = "is MarketingConsentRequired";
  @SerializedName(SERIALIZED_NAME_IS_MARKETING_CONSENT_REQUIRED)
  private Boolean isMarketingConsentRequired;

  public static final String SERIALIZED_NAME_ALERT_EMAIL = "alertEmail";
  @SerializedName(SERIALIZED_NAME_ALERT_EMAIL)
  private String alertEmail;

  public static final String SERIALIZED_NAME_ORDERED_CUSTOM_FIELDS = "orderedCustomFields";
  @SerializedName(SERIALIZED_NAME_ORDERED_CUSTOM_FIELDS)
  private ProductUpdateProductRequestOrderedCustomFields orderedCustomFields;

  public static final String SERIALIZED_NAME_TYPE_OF_PRODUCT = "typeOfProduct";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_PRODUCT)
  private Integer typeOfProduct;

  public static final String SERIALIZED_NAME_PRODUCT_COUNTRY_LIMITATION = "productCountryLimitation";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COUNTRY_LIMITATION)
  private ProductUpdateProductRequestProductCountryLimitations productCountryLimitation;

  public static final String SERIALIZED_NAME_IS_ANY_COUNTRY_ALLOWED = "isAnyCountryAllowed";
  @SerializedName(SERIALIZED_NAME_IS_ANY_COUNTRY_ALLOWED)
  private Boolean isAnyCountryAllowed;

  public ProductCreateNewProductRequest() {
  }

  public ProductCreateNewProductRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A short description of the product
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the product")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ProductCreateNewProductRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The internal name of the product you want to create
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The internal name of the product you want to create")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProductCreateNewProductRequest visibility(Integer visibility) {
    
    
    
    
    this.visibility = visibility;
    return this;
  }

   /**
   * The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public&#x3D;0, Hidden&#x3D;1, Internal&#x3D;2, OffSale&#x3D;3)
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public=0, Hidden=1, Internal=2, OffSale=3)")

  public Integer getVisibility() {
    return visibility;
  }


  public void setVisibility(Integer visibility) {
    
    
    
    this.visibility = visibility;
  }


  public ProductCreateNewProductRequest billingCurrency(String billingCurrency) {
    
    
    
    
    this.billingCurrency = billingCurrency;
    return this;
  }

   /**
   * The currency you want to the product to be billed in. This must be an ISO3 currency code with maximum three characters. For example: GBP, USD, etc.
   * @return billingCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency you want to the product to be billed in. This must be an ISO3 currency code with maximum three characters. For example: GBP, USD, etc.")

  public String getBillingCurrency() {
    return billingCurrency;
  }


  public void setBillingCurrency(String billingCurrency) {
    
    
    
    this.billingCurrency = billingCurrency;
  }


  public ProductCreateNewProductRequest displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the product you want to create
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the product you want to create")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public ProductCreateNewProductRequest isShippingAddressRequired(Boolean isShippingAddressRequired) {
    
    
    
    
    this.isShippingAddressRequired = isShippingAddressRequired;
    return this;
  }

   /**
   * Do you need to collect a shipping address from your customers for this product; true or false
   * @return isShippingAddressRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do you need to collect a shipping address from your customers for this product; true or false")

  public Boolean getIsShippingAddressRequired() {
    return isShippingAddressRequired;
  }


  public void setIsShippingAddressRequired(Boolean isShippingAddressRequired) {
    
    
    
    this.isShippingAddressRequired = isShippingAddressRequired;
  }


  public ProductCreateNewProductRequest isShippingAddressValidationRequired(Boolean isShippingAddressValidationRequired) {
    
    
    
    
    this.isShippingAddressValidationRequired = isShippingAddressValidationRequired;
    return this;
  }

   /**
   * Do you want to validate the shipping address using our tool; true or false
   * @return isShippingAddressValidationRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do you want to validate the shipping address using our tool; true or false")

  public Boolean getIsShippingAddressValidationRequired() {
    return isShippingAddressValidationRequired;
  }


  public void setIsShippingAddressValidationRequired(Boolean isShippingAddressValidationRequired) {
    
    
    
    this.isShippingAddressValidationRequired = isShippingAddressValidationRequired;
  }


  public ProductCreateNewProductRequest isBillingAddressValidationRequired(Boolean isBillingAddressValidationRequired) {
    
    
    
    
    this.isBillingAddressValidationRequired = isBillingAddressValidationRequired;
    return this;
  }

   /**
   * Do you want to validate the billing address using our tool; true or false
   * @return isBillingAddressValidationRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do you want to validate the billing address using our tool; true or false")

  public Boolean getIsBillingAddressValidationRequired() {
    return isBillingAddressValidationRequired;
  }


  public void setIsBillingAddressValidationRequired(Boolean isBillingAddressValidationRequired) {
    
    
    
    this.isBillingAddressValidationRequired = isBillingAddressValidationRequired;
  }


  public ProductCreateNewProductRequest isAdditionalEmailRequired(Boolean isAdditionalEmailRequired) {
    
    
    
    
    this.isAdditionalEmailRequired = isAdditionalEmailRequired;
    return this;
  }

   /**
   * Do you want to collect an additional email address from your customers at checkout; true or false
   * @return isAdditionalEmailRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do you want to collect an additional email address from your customers at checkout; true or false")

  public Boolean getIsAdditionalEmailRequired() {
    return isAdditionalEmailRequired;
  }


  public void setIsAdditionalEmailRequired(Boolean isAdditionalEmailRequired) {
    
    
    
    this.isAdditionalEmailRequired = isAdditionalEmailRequired;
  }


  public ProductCreateNewProductRequest isPhoneNumberRequired(Boolean isPhoneNumberRequired) {
    
    
    
    
    this.isPhoneNumberRequired = isPhoneNumberRequired;
    return this;
  }

   /**
   * Do you need to collect a phone number from your customers at checkout; true or false
   * @return isPhoneNumberRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do you need to collect a phone number from your customers at checkout; true or false")

  public Boolean getIsPhoneNumberRequired() {
    return isPhoneNumberRequired;
  }


  public void setIsPhoneNumberRequired(Boolean isPhoneNumberRequired) {
    
    
    
    this.isPhoneNumberRequired = isPhoneNumberRequired;
  }


  public ProductCreateNewProductRequest isMarketingConsentRequired(Boolean isMarketingConsentRequired) {
    
    
    
    
    this.isMarketingConsentRequired = isMarketingConsentRequired;
    return this;
  }

   /**
   * Do you need to get marketing consent from your customers at checkout; true or false
   * @return isMarketingConsentRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do you need to get marketing consent from your customers at checkout; true or false")

  public Boolean getIsMarketingConsentRequired() {
    return isMarketingConsentRequired;
  }


  public void setIsMarketingConsentRequired(Boolean isMarketingConsentRequired) {
    
    
    
    this.isMarketingConsentRequired = isMarketingConsentRequired;
  }


  public ProductCreateNewProductRequest alertEmail(String alertEmail) {
    
    
    
    
    this.alertEmail = alertEmail;
    return this;
  }

   /**
   * Set an email to be alerted when a customer signs up for this product
   * @return alertEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set an email to be alerted when a customer signs up for this product")

  public String getAlertEmail() {
    return alertEmail;
  }


  public void setAlertEmail(String alertEmail) {
    
    
    
    this.alertEmail = alertEmail;
  }


  public ProductCreateNewProductRequest orderedCustomFields(ProductUpdateProductRequestOrderedCustomFields orderedCustomFields) {
    
    
    
    
    this.orderedCustomFields = orderedCustomFields;
    return this;
  }

   /**
   * Get orderedCustomFields
   * @return orderedCustomFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductUpdateProductRequestOrderedCustomFields getOrderedCustomFields() {
    return orderedCustomFields;
  }


  public void setOrderedCustomFields(ProductUpdateProductRequestOrderedCustomFields orderedCustomFields) {
    
    
    
    this.orderedCustomFields = orderedCustomFields;
  }


  public ProductCreateNewProductRequest typeOfProduct(Integer typeOfProduct) {
    
    
    
    
    this.typeOfProduct = typeOfProduct;
    return this;
  }

   /**
   * The type of product you want to create; 1 is tiered
   * @return typeOfProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of product you want to create; 1 is tiered")

  public Integer getTypeOfProduct() {
    return typeOfProduct;
  }


  public void setTypeOfProduct(Integer typeOfProduct) {
    
    
    
    this.typeOfProduct = typeOfProduct;
  }


  public ProductCreateNewProductRequest productCountryLimitation(ProductUpdateProductRequestProductCountryLimitations productCountryLimitation) {
    
    
    
    
    this.productCountryLimitation = productCountryLimitation;
    return this;
  }

   /**
   * Get productCountryLimitation
   * @return productCountryLimitation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductUpdateProductRequestProductCountryLimitations getProductCountryLimitation() {
    return productCountryLimitation;
  }


  public void setProductCountryLimitation(ProductUpdateProductRequestProductCountryLimitations productCountryLimitation) {
    
    
    
    this.productCountryLimitation = productCountryLimitation;
  }


  public ProductCreateNewProductRequest isAnyCountryAllowed(Boolean isAnyCountryAllowed) {
    
    
    
    
    this.isAnyCountryAllowed = isAnyCountryAllowed;
    return this;
  }

   /**
   * Do you want to allow any country allowed access to the product; true or false
   * @return isAnyCountryAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do you want to allow any country allowed access to the product; true or false")

  public Boolean getIsAnyCountryAllowed() {
    return isAnyCountryAllowed;
  }


  public void setIsAnyCountryAllowed(Boolean isAnyCountryAllowed) {
    
    
    
    this.isAnyCountryAllowed = isAnyCountryAllowed;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ProductCreateNewProductRequest instance itself
   */
  public ProductCreateNewProductRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCreateNewProductRequest productCreateNewProductRequest = (ProductCreateNewProductRequest) o;
    return Objects.equals(this.description, productCreateNewProductRequest.description) &&
        Objects.equals(this.name, productCreateNewProductRequest.name) &&
        Objects.equals(this.visibility, productCreateNewProductRequest.visibility) &&
        Objects.equals(this.billingCurrency, productCreateNewProductRequest.billingCurrency) &&
        Objects.equals(this.displayName, productCreateNewProductRequest.displayName) &&
        Objects.equals(this.isShippingAddressRequired, productCreateNewProductRequest.isShippingAddressRequired) &&
        Objects.equals(this.isShippingAddressValidationRequired, productCreateNewProductRequest.isShippingAddressValidationRequired) &&
        Objects.equals(this.isBillingAddressValidationRequired, productCreateNewProductRequest.isBillingAddressValidationRequired) &&
        Objects.equals(this.isAdditionalEmailRequired, productCreateNewProductRequest.isAdditionalEmailRequired) &&
        Objects.equals(this.isPhoneNumberRequired, productCreateNewProductRequest.isPhoneNumberRequired) &&
        Objects.equals(this.isMarketingConsentRequired, productCreateNewProductRequest.isMarketingConsentRequired) &&
        Objects.equals(this.alertEmail, productCreateNewProductRequest.alertEmail) &&
        Objects.equals(this.orderedCustomFields, productCreateNewProductRequest.orderedCustomFields) &&
        Objects.equals(this.typeOfProduct, productCreateNewProductRequest.typeOfProduct) &&
        Objects.equals(this.productCountryLimitation, productCreateNewProductRequest.productCountryLimitation) &&
        Objects.equals(this.isAnyCountryAllowed, productCreateNewProductRequest.isAnyCountryAllowed)&&
        Objects.equals(this.additionalProperties, productCreateNewProductRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, visibility, billingCurrency, displayName, isShippingAddressRequired, isShippingAddressValidationRequired, isBillingAddressValidationRequired, isAdditionalEmailRequired, isPhoneNumberRequired, isMarketingConsentRequired, alertEmail, orderedCustomFields, typeOfProduct, productCountryLimitation, isAnyCountryAllowed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreateNewProductRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isShippingAddressRequired: ").append(toIndentedString(isShippingAddressRequired)).append("\n");
    sb.append("    isShippingAddressValidationRequired: ").append(toIndentedString(isShippingAddressValidationRequired)).append("\n");
    sb.append("    isBillingAddressValidationRequired: ").append(toIndentedString(isBillingAddressValidationRequired)).append("\n");
    sb.append("    isAdditionalEmailRequired: ").append(toIndentedString(isAdditionalEmailRequired)).append("\n");
    sb.append("    isPhoneNumberRequired: ").append(toIndentedString(isPhoneNumberRequired)).append("\n");
    sb.append("    isMarketingConsentRequired: ").append(toIndentedString(isMarketingConsentRequired)).append("\n");
    sb.append("    alertEmail: ").append(toIndentedString(alertEmail)).append("\n");
    sb.append("    orderedCustomFields: ").append(toIndentedString(orderedCustomFields)).append("\n");
    sb.append("    typeOfProduct: ").append(toIndentedString(typeOfProduct)).append("\n");
    sb.append("    productCountryLimitation: ").append(toIndentedString(productCountryLimitation)).append("\n");
    sb.append("    isAnyCountryAllowed: ").append(toIndentedString(isAnyCountryAllowed)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("visibility");
    openapiFields.add("billingCurrency");
    openapiFields.add("displayName");
    openapiFields.add("isShippingAddressRequired");
    openapiFields.add("isShippingAddressValidationRequired");
    openapiFields.add("isBillingAddressValidationRequired");
    openapiFields.add("isAdditionalEmailRequired");
    openapiFields.add("isPhoneNumberRequired");
    openapiFields.add("is MarketingConsentRequired");
    openapiFields.add("alertEmail");
    openapiFields.add("orderedCustomFields");
    openapiFields.add("typeOfProduct");
    openapiFields.add("productCountryLimitation");
    openapiFields.add("isAnyCountryAllowed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductCreateNewProductRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductCreateNewProductRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductCreateNewProductRequest is not found in the empty JSON string", ProductCreateNewProductRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("billingCurrency") != null && !jsonObj.get("billingCurrency").isJsonNull()) && !jsonObj.get("billingCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingCurrency").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("alertEmail") != null && !jsonObj.get("alertEmail").isJsonNull()) && !jsonObj.get("alertEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alertEmail").toString()));
      }
      // validate the optional field `orderedCustomFields`
      if (jsonObj.get("orderedCustomFields") != null && !jsonObj.get("orderedCustomFields").isJsonNull()) {
        ProductUpdateProductRequestOrderedCustomFields.validateJsonObject(jsonObj.getAsJsonObject("orderedCustomFields"));
      }
      // validate the optional field `productCountryLimitation`
      if (jsonObj.get("productCountryLimitation") != null && !jsonObj.get("productCountryLimitation").isJsonNull()) {
        ProductUpdateProductRequestProductCountryLimitations.validateJsonObject(jsonObj.getAsJsonObject("productCountryLimitation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductCreateNewProductRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductCreateNewProductRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductCreateNewProductRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductCreateNewProductRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductCreateNewProductRequest>() {
           @Override
           public void write(JsonWriter out, ProductCreateNewProductRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductCreateNewProductRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductCreateNewProductRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductCreateNewProductRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductCreateNewProductRequest
  * @throws IOException if the JSON string is invalid with respect to ProductCreateNewProductRequest
  */
  public static ProductCreateNewProductRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductCreateNewProductRequest.class);
  }

 /**
  * Convert an instance of ProductCreateNewProductRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

