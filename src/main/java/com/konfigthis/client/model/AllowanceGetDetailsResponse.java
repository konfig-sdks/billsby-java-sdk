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
import com.konfigthis.client.model.AllowanceGetDetailsResponseCounter;
import com.konfigthis.client.model.AllowanceGetDetailsResponsePlansInner;
import com.konfigthis.client.model.AllowanceGetDetailsResponsePriceModelsInner;
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
 * AllowanceGetDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AllowanceGetDetailsResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ALLOWANCE_ID = "allowanceId";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE_ID)
  private Integer allowanceId = 0;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_SINGLE_UNIT_NAME = "singleUnitName";
  @SerializedName(SERIALIZED_NAME_SINGLE_UNIT_NAME)
  private String singleUnitName;

  public static final String SERIALIZED_NAME_PLURAL_UNIT_NAME = "pluralUnitName";
  @SerializedName(SERIALIZED_NAME_PLURAL_UNIT_NAME)
  private String pluralUnitName;

  public static final String SERIALIZED_NAME_PRICING_MODEL_TYPE = "pricingModelType";
  @SerializedName(SERIALIZED_NAME_PRICING_MODEL_TYPE)
  private String pricingModelType;

  public static final String SERIALIZED_NAME_COUNTER = "counter";
  @SerializedName(SERIALIZED_NAME_COUNTER)
  private AllowanceGetDetailsResponseCounter counter;

  public static final String SERIALIZED_NAME_HAS_ACTIVE_LINKED_PLANS = "hasActiveLinkedPlans";
  @SerializedName(SERIALIZED_NAME_HAS_ACTIVE_LINKED_PLANS)
  private Boolean hasActiveLinkedPlans = true;

  public static final String SERIALIZED_NAME_FEATURE_TAGS = "featureTags";
  @SerializedName(SERIALIZED_NAME_FEATURE_TAGS)
  private List<String> featureTags = null;

  public static final String SERIALIZED_NAME_PLANS = "plans";
  @SerializedName(SERIALIZED_NAME_PLANS)
  private List<AllowanceGetDetailsResponsePlansInner> plans = null;

  public static final String SERIALIZED_NAME_PRICE_MODELS = "priceModels";
  @SerializedName(SERIALIZED_NAME_PRICE_MODELS)
  private List<AllowanceGetDetailsResponsePriceModelsInner> priceModels = null;

  public AllowanceGetDetailsResponse() {
  }

  public AllowanceGetDetailsResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AllowanceGetDetailsResponse allowanceId(Integer allowanceId) {
    
    
    
    
    this.allowanceId = allowanceId;
    return this;
  }

   /**
   * Get allowanceId
   * @return allowanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getAllowanceId() {
    return allowanceId;
  }


  public void setAllowanceId(Integer allowanceId) {
    
    
    
    this.allowanceId = allowanceId;
  }


  public AllowanceGetDetailsResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AllowanceGetDetailsResponse displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public AllowanceGetDetailsResponse singleUnitName(String singleUnitName) {
    
    
    
    
    this.singleUnitName = singleUnitName;
    return this;
  }

   /**
   * Get singleUnitName
   * @return singleUnitName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getSingleUnitName() {
    return singleUnitName;
  }


  public void setSingleUnitName(String singleUnitName) {
    
    
    
    this.singleUnitName = singleUnitName;
  }


  public AllowanceGetDetailsResponse pluralUnitName(String pluralUnitName) {
    
    
    
    
    this.pluralUnitName = pluralUnitName;
    return this;
  }

   /**
   * Get pluralUnitName
   * @return pluralUnitName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getPluralUnitName() {
    return pluralUnitName;
  }


  public void setPluralUnitName(String pluralUnitName) {
    
    
    
    this.pluralUnitName = pluralUnitName;
  }


  public AllowanceGetDetailsResponse pricingModelType(String pricingModelType) {
    
    
    
    
    this.pricingModelType = pricingModelType;
    return this;
  }

   /**
   * Get pricingModelType
   * @return pricingModelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getPricingModelType() {
    return pricingModelType;
  }


  public void setPricingModelType(String pricingModelType) {
    
    
    
    this.pricingModelType = pricingModelType;
  }


  public AllowanceGetDetailsResponse counter(AllowanceGetDetailsResponseCounter counter) {
    
    
    
    
    this.counter = counter;
    return this;
  }

   /**
   * Get counter
   * @return counter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AllowanceGetDetailsResponseCounter getCounter() {
    return counter;
  }


  public void setCounter(AllowanceGetDetailsResponseCounter counter) {
    
    
    
    this.counter = counter;
  }


  public AllowanceGetDetailsResponse hasActiveLinkedPlans(Boolean hasActiveLinkedPlans) {
    
    
    
    
    this.hasActiveLinkedPlans = hasActiveLinkedPlans;
    return this;
  }

   /**
   * Get hasActiveLinkedPlans
   * @return hasActiveLinkedPlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getHasActiveLinkedPlans() {
    return hasActiveLinkedPlans;
  }


  public void setHasActiveLinkedPlans(Boolean hasActiveLinkedPlans) {
    
    
    
    this.hasActiveLinkedPlans = hasActiveLinkedPlans;
  }


  public AllowanceGetDetailsResponse featureTags(List<String> featureTags) {
    
    
    
    
    this.featureTags = featureTags;
    return this;
  }

  public AllowanceGetDetailsResponse addFeatureTagsItem(String featureTagsItem) {
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


  public AllowanceGetDetailsResponse plans(List<AllowanceGetDetailsResponsePlansInner> plans) {
    
    
    
    
    this.plans = plans;
    return this;
  }

  public AllowanceGetDetailsResponse addPlansItem(AllowanceGetDetailsResponsePlansInner plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AllowanceGetDetailsResponsePlansInner> getPlans() {
    return plans;
  }


  public void setPlans(List<AllowanceGetDetailsResponsePlansInner> plans) {
    
    
    
    this.plans = plans;
  }


  public AllowanceGetDetailsResponse priceModels(List<AllowanceGetDetailsResponsePriceModelsInner> priceModels) {
    
    
    
    
    this.priceModels = priceModels;
    return this;
  }

  public AllowanceGetDetailsResponse addPriceModelsItem(AllowanceGetDetailsResponsePriceModelsInner priceModelsItem) {
    if (this.priceModels == null) {
      this.priceModels = new ArrayList<>();
    }
    this.priceModels.add(priceModelsItem);
    return this;
  }

   /**
   * Get priceModels
   * @return priceModels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AllowanceGetDetailsResponsePriceModelsInner> getPriceModels() {
    return priceModels;
  }


  public void setPriceModels(List<AllowanceGetDetailsResponsePriceModelsInner> priceModels) {
    
    
    
    this.priceModels = priceModels;
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
   * @return the AllowanceGetDetailsResponse instance itself
   */
  public AllowanceGetDetailsResponse putAdditionalProperty(String key, Object value) {
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
    AllowanceGetDetailsResponse allowanceGetDetailsResponse = (AllowanceGetDetailsResponse) o;
    return Objects.equals(this.description, allowanceGetDetailsResponse.description) &&
        Objects.equals(this.allowanceId, allowanceGetDetailsResponse.allowanceId) &&
        Objects.equals(this.name, allowanceGetDetailsResponse.name) &&
        Objects.equals(this.displayName, allowanceGetDetailsResponse.displayName) &&
        Objects.equals(this.singleUnitName, allowanceGetDetailsResponse.singleUnitName) &&
        Objects.equals(this.pluralUnitName, allowanceGetDetailsResponse.pluralUnitName) &&
        Objects.equals(this.pricingModelType, allowanceGetDetailsResponse.pricingModelType) &&
        Objects.equals(this.counter, allowanceGetDetailsResponse.counter) &&
        Objects.equals(this.hasActiveLinkedPlans, allowanceGetDetailsResponse.hasActiveLinkedPlans) &&
        Objects.equals(this.featureTags, allowanceGetDetailsResponse.featureTags) &&
        Objects.equals(this.plans, allowanceGetDetailsResponse.plans) &&
        Objects.equals(this.priceModels, allowanceGetDetailsResponse.priceModels)&&
        Objects.equals(this.additionalProperties, allowanceGetDetailsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, allowanceId, name, displayName, singleUnitName, pluralUnitName, pricingModelType, counter, hasActiveLinkedPlans, featureTags, plans, priceModels, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowanceGetDetailsResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allowanceId: ").append(toIndentedString(allowanceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    singleUnitName: ").append(toIndentedString(singleUnitName)).append("\n");
    sb.append("    pluralUnitName: ").append(toIndentedString(pluralUnitName)).append("\n");
    sb.append("    pricingModelType: ").append(toIndentedString(pricingModelType)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    hasActiveLinkedPlans: ").append(toIndentedString(hasActiveLinkedPlans)).append("\n");
    sb.append("    featureTags: ").append(toIndentedString(featureTags)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    priceModels: ").append(toIndentedString(priceModels)).append("\n");
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
    openapiFields.add("allowanceId");
    openapiFields.add("name");
    openapiFields.add("displayName");
    openapiFields.add("singleUnitName");
    openapiFields.add("pluralUnitName");
    openapiFields.add("pricingModelType");
    openapiFields.add("counter");
    openapiFields.add("hasActiveLinkedPlans");
    openapiFields.add("featureTags");
    openapiFields.add("plans");
    openapiFields.add("priceModels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AllowanceGetDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AllowanceGetDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllowanceGetDetailsResponse is not found in the empty JSON string", AllowanceGetDetailsResponse.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("singleUnitName") != null && !jsonObj.get("singleUnitName").isJsonNull()) && !jsonObj.get("singleUnitName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `singleUnitName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("singleUnitName").toString()));
      }
      if ((jsonObj.get("pluralUnitName") != null && !jsonObj.get("pluralUnitName").isJsonNull()) && !jsonObj.get("pluralUnitName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluralUnitName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluralUnitName").toString()));
      }
      if ((jsonObj.get("pricingModelType") != null && !jsonObj.get("pricingModelType").isJsonNull()) && !jsonObj.get("pricingModelType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricingModelType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricingModelType").toString()));
      }
      // validate the optional field `counter`
      if (jsonObj.get("counter") != null && !jsonObj.get("counter").isJsonNull()) {
        AllowanceGetDetailsResponseCounter.validateJsonObject(jsonObj.getAsJsonObject("counter"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("featureTags") != null && !jsonObj.get("featureTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureTags` to be an array in the JSON string but got `%s`", jsonObj.get("featureTags").toString()));
      }
      if (jsonObj.get("plans") != null && !jsonObj.get("plans").isJsonNull()) {
        JsonArray jsonArrayplans = jsonObj.getAsJsonArray("plans");
        if (jsonArrayplans != null) {
          // ensure the json data is an array
          if (!jsonObj.get("plans").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `plans` to be an array in the JSON string but got `%s`", jsonObj.get("plans").toString()));
          }

          // validate the optional field `plans` (array)
          for (int i = 0; i < jsonArrayplans.size(); i++) {
            AllowanceGetDetailsResponsePlansInner.validateJsonObject(jsonArrayplans.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("priceModels") != null && !jsonObj.get("priceModels").isJsonNull()) {
        JsonArray jsonArraypriceModels = jsonObj.getAsJsonArray("priceModels");
        if (jsonArraypriceModels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("priceModels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `priceModels` to be an array in the JSON string but got `%s`", jsonObj.get("priceModels").toString()));
          }

          // validate the optional field `priceModels` (array)
          for (int i = 0; i < jsonArraypriceModels.size(); i++) {
            AllowanceGetDetailsResponsePriceModelsInner.validateJsonObject(jsonArraypriceModels.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllowanceGetDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllowanceGetDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllowanceGetDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllowanceGetDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AllowanceGetDetailsResponse>() {
           @Override
           public void write(JsonWriter out, AllowanceGetDetailsResponse value) throws IOException {
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
           public AllowanceGetDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AllowanceGetDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AllowanceGetDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AllowanceGetDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to AllowanceGetDetailsResponse
  */
  public static AllowanceGetDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllowanceGetDetailsResponse.class);
  }

 /**
  * Convert an instance of AllowanceGetDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

