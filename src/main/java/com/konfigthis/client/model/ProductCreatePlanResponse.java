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
import com.konfigthis.client.model.ProductCreatePlanResponseCyclesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ProductCreatePlanResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProductCreatePlanResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PLAN_ID = "planId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private Integer planId = 0;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PRICING_MODEL_TYPE = "pricingModelType";
  @SerializedName(SERIALIZED_NAME_PRICING_MODEL_TYPE)
  private Integer pricingModelType = 0;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId = 0;

  public static final String SERIALIZED_NAME_CYCLES = "cycles";
  @SerializedName(SERIALIZED_NAME_CYCLES)
  private List<ProductCreatePlanResponseCyclesInner> cycles = null;

  public static final String SERIALIZED_NAME_FEATURE_TAGS = "featureTags";
  @SerializedName(SERIALIZED_NAME_FEATURE_TAGS)
  private List<String> featureTags = null;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private String visibility;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirectUrl";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_HAS_ACTIVE_SUBSCRIPTION = "hasActiveSubscription";
  @SerializedName(SERIALIZED_NAME_HAS_ACTIVE_SUBSCRIPTION)
  private Boolean hasActiveSubscription = true;

  public static final String SERIALIZED_NAME_ALERT_EMAIL = "alertEmail";
  @SerializedName(SERIALIZED_NAME_ALERT_EMAIL)
  private String alertEmail;

  public ProductCreatePlanResponse() {
  }

  public ProductCreatePlanResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This plan is our premium experience", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ProductCreatePlanResponse planId(Integer planId) {
    
    
    
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "43", value = "")

  public Integer getPlanId() {
    return planId;
  }


  public void setPlanId(Integer planId) {
    
    
    
    this.planId = planId;
  }


  public ProductCreatePlanResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Premium Plan", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProductCreatePlanResponse displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The Premium Plan", value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public ProductCreatePlanResponse pricingModelType(Integer pricingModelType) {
    
    
    
    
    this.pricingModelType = pricingModelType;
    return this;
  }

   /**
   * Get pricingModelType
   * @return pricingModelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getPricingModelType() {
    return pricingModelType;
  }


  public void setPricingModelType(Integer pricingModelType) {
    
    
    
    this.pricingModelType = pricingModelType;
  }


  public ProductCreatePlanResponse productId(Integer productId) {
    
    
    
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    
    
    
    this.productId = productId;
  }


  public ProductCreatePlanResponse cycles(List<ProductCreatePlanResponseCyclesInner> cycles) {
    
    
    
    
    this.cycles = cycles;
    return this;
  }

  public ProductCreatePlanResponse addCyclesItem(ProductCreatePlanResponseCyclesInner cyclesItem) {
    if (this.cycles == null) {
      this.cycles = new ArrayList<>();
    }
    this.cycles.add(cyclesItem);
    return this;
  }

   /**
   * Get cycles
   * @return cycles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProductCreatePlanResponseCyclesInner> getCycles() {
    return cycles;
  }


  public void setCycles(List<ProductCreatePlanResponseCyclesInner> cycles) {
    
    
    
    this.cycles = cycles;
  }


  public ProductCreatePlanResponse featureTags(List<String> featureTags) {
    
    
    
    
    this.featureTags = featureTags;
    return this;
  }

  public ProductCreatePlanResponse addFeatureTagsItem(String featureTagsItem) {
    if (this.featureTags == null) {
      this.featureTags = new ArrayList<>();
    }
    this.featureTags.add(featureTagsItem);
    return this;
  }

   /**
   * Get featureTags
   * @return featureTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFeatureTags() {
    return featureTags;
  }


  public void setFeatureTags(List<String> featureTags) {
    
    
    
    this.featureTags = featureTags;
  }


  public ProductCreatePlanResponse visibility(String visibility) {
    
    
    
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "public", value = "")

  public String getVisibility() {
    return visibility;
  }


  public void setVisibility(String visibility) {
    
    
    
    this.visibility = visibility;
  }


  public ProductCreatePlanResponse redirectUrl(String redirectUrl) {
    
    
    
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "home@mistimail.com", value = "")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    
    
    
    this.redirectUrl = redirectUrl;
  }


  public ProductCreatePlanResponse hasActiveSubscription(Boolean hasActiveSubscription) {
    
    
    
    
    this.hasActiveSubscription = hasActiveSubscription;
    return this;
  }

   /**
   * Get hasActiveSubscription
   * @return hasActiveSubscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getHasActiveSubscription() {
    return hasActiveSubscription;
  }


  public void setHasActiveSubscription(Boolean hasActiveSubscription) {
    
    
    
    this.hasActiveSubscription = hasActiveSubscription;
  }


  public ProductCreatePlanResponse alertEmail(String alertEmail) {
    
    
    
    
    this.alertEmail = alertEmail;
    return this;
  }

   /**
   * Get alertEmail
   * @return alertEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "accounts@mistimail.com", value = "")

  public String getAlertEmail() {
    return alertEmail;
  }


  public void setAlertEmail(String alertEmail) {
    
    
    
    this.alertEmail = alertEmail;
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
   * @return the ProductCreatePlanResponse instance itself
   */
  public ProductCreatePlanResponse putAdditionalProperty(String key, Object value) {
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
    ProductCreatePlanResponse productCreatePlanResponse = (ProductCreatePlanResponse) o;
    return Objects.equals(this.description, productCreatePlanResponse.description) &&
        Objects.equals(this.planId, productCreatePlanResponse.planId) &&
        Objects.equals(this.name, productCreatePlanResponse.name) &&
        Objects.equals(this.displayName, productCreatePlanResponse.displayName) &&
        Objects.equals(this.pricingModelType, productCreatePlanResponse.pricingModelType) &&
        Objects.equals(this.productId, productCreatePlanResponse.productId) &&
        Objects.equals(this.cycles, productCreatePlanResponse.cycles) &&
        Objects.equals(this.featureTags, productCreatePlanResponse.featureTags) &&
        Objects.equals(this.visibility, productCreatePlanResponse.visibility) &&
        Objects.equals(this.redirectUrl, productCreatePlanResponse.redirectUrl) &&
        Objects.equals(this.hasActiveSubscription, productCreatePlanResponse.hasActiveSubscription) &&
        Objects.equals(this.alertEmail, productCreatePlanResponse.alertEmail)&&
        Objects.equals(this.additionalProperties, productCreatePlanResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, planId, name, displayName, pricingModelType, productId, cycles, featureTags, visibility, redirectUrl, hasActiveSubscription, alertEmail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreatePlanResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    pricingModelType: ").append(toIndentedString(pricingModelType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    cycles: ").append(toIndentedString(cycles)).append("\n");
    sb.append("    featureTags: ").append(toIndentedString(featureTags)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    hasActiveSubscription: ").append(toIndentedString(hasActiveSubscription)).append("\n");
    sb.append("    alertEmail: ").append(toIndentedString(alertEmail)).append("\n");
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
    openapiFields.add("planId");
    openapiFields.add("name");
    openapiFields.add("displayName");
    openapiFields.add("pricingModelType");
    openapiFields.add("productId");
    openapiFields.add("cycles");
    openapiFields.add("featureTags");
    openapiFields.add("visibility");
    openapiFields.add("redirectUrl");
    openapiFields.add("hasActiveSubscription");
    openapiFields.add("alertEmail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductCreatePlanResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductCreatePlanResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductCreatePlanResponse is not found in the empty JSON string", ProductCreatePlanResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (jsonObj.get("cycles") != null && !jsonObj.get("cycles").isJsonNull()) {
        JsonArray jsonArraycycles = jsonObj.getAsJsonArray("cycles");
        if (jsonArraycycles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cycles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cycles` to be an array in the JSON string but got `%s`", jsonObj.get("cycles").toString()));
          }

          // validate the optional field `cycles` (array)
          for (int i = 0; i < jsonArraycycles.size(); i++) {
            ProductCreatePlanResponseCyclesInner.validateJsonObject(jsonArraycycles.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("featureTags") != null && !jsonObj.get("featureTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureTags` to be an array in the JSON string but got `%s`", jsonObj.get("featureTags").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if ((jsonObj.get("redirectUrl") != null && !jsonObj.get("redirectUrl").isJsonNull()) && !jsonObj.get("redirectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUrl").toString()));
      }
      if ((jsonObj.get("alertEmail") != null && !jsonObj.get("alertEmail").isJsonNull()) && !jsonObj.get("alertEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alertEmail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductCreatePlanResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductCreatePlanResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductCreatePlanResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductCreatePlanResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductCreatePlanResponse>() {
           @Override
           public void write(JsonWriter out, ProductCreatePlanResponse value) throws IOException {
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
           public ProductCreatePlanResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductCreatePlanResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductCreatePlanResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductCreatePlanResponse
  * @throws IOException if the JSON string is invalid with respect to ProductCreatePlanResponse
  */
  public static ProductCreatePlanResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductCreatePlanResponse.class);
  }

 /**
  * Convert an instance of ProductCreatePlanResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

