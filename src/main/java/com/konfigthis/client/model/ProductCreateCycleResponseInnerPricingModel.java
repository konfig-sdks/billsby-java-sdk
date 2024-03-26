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
 * ProductCreateCycleResponseInnerPricingModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProductCreateCycleResponseInnerPricingModel {
  public static final String SERIALIZED_NAME_PRICING_MODEL_ID = "pricingModelId";
  @SerializedName(SERIALIZED_NAME_PRICING_MODEL_ID)
  private Integer pricingModelId = 0;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Integer frequency = 0;

  public static final String SERIALIZED_NAME_FREQUENCY_TYPE = "frequencyType";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_TYPE)
  private Integer frequencyType = 0;

  public static final String SERIALIZED_NAME_FREE_TRIAL = "freeTrial";
  @SerializedName(SERIALIZED_NAME_FREE_TRIAL)
  private Integer freeTrial = 0;

  public static final String SERIALIZED_NAME_FREE_TRIAL_FREQUENCY_TYPE = "freeTrialFrequencyType";
  @SerializedName(SERIALIZED_NAME_FREE_TRIAL_FREQUENCY_TYPE)
  private Integer freeTrialFrequencyType = 0;

  public static final String SERIALIZED_NAME_CONTRACT_TERM = "contractTerm";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TERM)
  private Integer contractTerm = 0;

  public static final String SERIALIZED_NAME_CONTRACT_TERM_FREQUENCY_TYPE = "contractTermFrequencyType";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TERM_FREQUENCY_TYPE)
  private Integer contractTermFrequencyType = 0;

  public static final String SERIALIZED_NAME_SETUP_FEE_PRICE = "setupFeePrice";
  @SerializedName(SERIALIZED_NAME_SETUP_FEE_PRICE)
  private Integer setupFeePrice = 0;

  public static final String SERIALIZED_NAME_SETUP_FEE_PRICE_FORMATTED = "setupFeePriceFormatted";
  @SerializedName(SERIALIZED_NAME_SETUP_FEE_PRICE_FORMATTED)
  private String setupFeePriceFormatted;

  public static final String SERIALIZED_NAME_FREE_QUANTITY = "freeQuantity";
  @SerializedName(SERIALIZED_NAME_FREE_QUANTITY)
  private Integer freeQuantity = 0;

  public static final String SERIALIZED_NAME_BILLING_DATE_TYPE = "billingDateType";
  @SerializedName(SERIALIZED_NAME_BILLING_DATE_TYPE)
  private Integer billingDateType = 0;

  public static final String SERIALIZED_NAME_FIXED_BILLING_DATE_DAY = "fixedBillingDateDay";
  @SerializedName(SERIALIZED_NAME_FIXED_BILLING_DATE_DAY)
  private Integer fixedBillingDateDay = 0;

  public static final String SERIALIZED_NAME_PRO_RATE_OPTION = "proRateOption";
  @SerializedName(SERIALIZED_NAME_PRO_RATE_OPTION)
  private Integer proRateOption = 0;

  public ProductCreateCycleResponseInnerPricingModel() {
  }

  public ProductCreateCycleResponseInnerPricingModel pricingModelId(Integer pricingModelId) {
    
    
    
    
    this.pricingModelId = pricingModelId;
    return this;
  }

   /**
   * Get pricingModelId
   * @return pricingModelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getPricingModelId() {
    return pricingModelId;
  }


  public void setPricingModelId(Integer pricingModelId) {
    
    
    
    this.pricingModelId = pricingModelId;
  }


  public ProductCreateCycleResponseInnerPricingModel frequency(Integer frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFrequency() {
    return frequency;
  }


  public void setFrequency(Integer frequency) {
    
    
    
    this.frequency = frequency;
  }


  public ProductCreateCycleResponseInnerPricingModel frequencyType(Integer frequencyType) {
    
    
    
    
    this.frequencyType = frequencyType;
    return this;
  }

   /**
   * Get frequencyType
   * @return frequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFrequencyType() {
    return frequencyType;
  }


  public void setFrequencyType(Integer frequencyType) {
    
    
    
    this.frequencyType = frequencyType;
  }


  public ProductCreateCycleResponseInnerPricingModel freeTrial(Integer freeTrial) {
    
    
    
    
    this.freeTrial = freeTrial;
    return this;
  }

   /**
   * Get freeTrial
   * @return freeTrial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFreeTrial() {
    return freeTrial;
  }


  public void setFreeTrial(Integer freeTrial) {
    
    
    
    this.freeTrial = freeTrial;
  }


  public ProductCreateCycleResponseInnerPricingModel freeTrialFrequencyType(Integer freeTrialFrequencyType) {
    
    
    
    
    this.freeTrialFrequencyType = freeTrialFrequencyType;
    return this;
  }

   /**
   * Get freeTrialFrequencyType
   * @return freeTrialFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFreeTrialFrequencyType() {
    return freeTrialFrequencyType;
  }


  public void setFreeTrialFrequencyType(Integer freeTrialFrequencyType) {
    
    
    
    this.freeTrialFrequencyType = freeTrialFrequencyType;
  }


  public ProductCreateCycleResponseInnerPricingModel contractTerm(Integer contractTerm) {
    
    
    
    
    this.contractTerm = contractTerm;
    return this;
  }

   /**
   * Get contractTerm
   * @return contractTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getContractTerm() {
    return contractTerm;
  }


  public void setContractTerm(Integer contractTerm) {
    
    
    
    this.contractTerm = contractTerm;
  }


  public ProductCreateCycleResponseInnerPricingModel contractTermFrequencyType(Integer contractTermFrequencyType) {
    
    
    
    
    this.contractTermFrequencyType = contractTermFrequencyType;
    return this;
  }

   /**
   * Get contractTermFrequencyType
   * @return contractTermFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getContractTermFrequencyType() {
    return contractTermFrequencyType;
  }


  public void setContractTermFrequencyType(Integer contractTermFrequencyType) {
    
    
    
    this.contractTermFrequencyType = contractTermFrequencyType;
  }


  public ProductCreateCycleResponseInnerPricingModel setupFeePrice(Integer setupFeePrice) {
    
    
    
    
    this.setupFeePrice = setupFeePrice;
    return this;
  }

   /**
   * Get setupFeePrice
   * @return setupFeePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getSetupFeePrice() {
    return setupFeePrice;
  }


  public void setSetupFeePrice(Integer setupFeePrice) {
    
    
    
    this.setupFeePrice = setupFeePrice;
  }


  public ProductCreateCycleResponseInnerPricingModel setupFeePriceFormatted(String setupFeePriceFormatted) {
    
    
    
    
    this.setupFeePriceFormatted = setupFeePriceFormatted;
    return this;
  }

   /**
   * Get setupFeePriceFormatted
   * @return setupFeePriceFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getSetupFeePriceFormatted() {
    return setupFeePriceFormatted;
  }


  public void setSetupFeePriceFormatted(String setupFeePriceFormatted) {
    
    
    
    this.setupFeePriceFormatted = setupFeePriceFormatted;
  }


  public ProductCreateCycleResponseInnerPricingModel freeQuantity(Integer freeQuantity) {
    
    
    
    
    this.freeQuantity = freeQuantity;
    return this;
  }

   /**
   * Get freeQuantity
   * @return freeQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFreeQuantity() {
    return freeQuantity;
  }


  public void setFreeQuantity(Integer freeQuantity) {
    
    
    
    this.freeQuantity = freeQuantity;
  }


  public ProductCreateCycleResponseInnerPricingModel billingDateType(Integer billingDateType) {
    
    
    
    
    this.billingDateType = billingDateType;
    return this;
  }

   /**
   * Get billingDateType
   * @return billingDateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getBillingDateType() {
    return billingDateType;
  }


  public void setBillingDateType(Integer billingDateType) {
    
    
    
    this.billingDateType = billingDateType;
  }


  public ProductCreateCycleResponseInnerPricingModel fixedBillingDateDay(Integer fixedBillingDateDay) {
    
    
    
    
    this.fixedBillingDateDay = fixedBillingDateDay;
    return this;
  }

   /**
   * Get fixedBillingDateDay
   * @return fixedBillingDateDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFixedBillingDateDay() {
    return fixedBillingDateDay;
  }


  public void setFixedBillingDateDay(Integer fixedBillingDateDay) {
    
    
    
    this.fixedBillingDateDay = fixedBillingDateDay;
  }


  public ProductCreateCycleResponseInnerPricingModel proRateOption(Integer proRateOption) {
    
    
    
    
    this.proRateOption = proRateOption;
    return this;
  }

   /**
   * Get proRateOption
   * @return proRateOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getProRateOption() {
    return proRateOption;
  }


  public void setProRateOption(Integer proRateOption) {
    
    
    
    this.proRateOption = proRateOption;
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
   * @return the ProductCreateCycleResponseInnerPricingModel instance itself
   */
  public ProductCreateCycleResponseInnerPricingModel putAdditionalProperty(String key, Object value) {
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
    ProductCreateCycleResponseInnerPricingModel productCreateCycleResponseInnerPricingModel = (ProductCreateCycleResponseInnerPricingModel) o;
    return Objects.equals(this.pricingModelId, productCreateCycleResponseInnerPricingModel.pricingModelId) &&
        Objects.equals(this.frequency, productCreateCycleResponseInnerPricingModel.frequency) &&
        Objects.equals(this.frequencyType, productCreateCycleResponseInnerPricingModel.frequencyType) &&
        Objects.equals(this.freeTrial, productCreateCycleResponseInnerPricingModel.freeTrial) &&
        Objects.equals(this.freeTrialFrequencyType, productCreateCycleResponseInnerPricingModel.freeTrialFrequencyType) &&
        Objects.equals(this.contractTerm, productCreateCycleResponseInnerPricingModel.contractTerm) &&
        Objects.equals(this.contractTermFrequencyType, productCreateCycleResponseInnerPricingModel.contractTermFrequencyType) &&
        Objects.equals(this.setupFeePrice, productCreateCycleResponseInnerPricingModel.setupFeePrice) &&
        Objects.equals(this.setupFeePriceFormatted, productCreateCycleResponseInnerPricingModel.setupFeePriceFormatted) &&
        Objects.equals(this.freeQuantity, productCreateCycleResponseInnerPricingModel.freeQuantity) &&
        Objects.equals(this.billingDateType, productCreateCycleResponseInnerPricingModel.billingDateType) &&
        Objects.equals(this.fixedBillingDateDay, productCreateCycleResponseInnerPricingModel.fixedBillingDateDay) &&
        Objects.equals(this.proRateOption, productCreateCycleResponseInnerPricingModel.proRateOption)&&
        Objects.equals(this.additionalProperties, productCreateCycleResponseInnerPricingModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingModelId, frequency, frequencyType, freeTrial, freeTrialFrequencyType, contractTerm, contractTermFrequencyType, setupFeePrice, setupFeePriceFormatted, freeQuantity, billingDateType, fixedBillingDateDay, proRateOption, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreateCycleResponseInnerPricingModel {\n");
    sb.append("    pricingModelId: ").append(toIndentedString(pricingModelId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyType: ").append(toIndentedString(frequencyType)).append("\n");
    sb.append("    freeTrial: ").append(toIndentedString(freeTrial)).append("\n");
    sb.append("    freeTrialFrequencyType: ").append(toIndentedString(freeTrialFrequencyType)).append("\n");
    sb.append("    contractTerm: ").append(toIndentedString(contractTerm)).append("\n");
    sb.append("    contractTermFrequencyType: ").append(toIndentedString(contractTermFrequencyType)).append("\n");
    sb.append("    setupFeePrice: ").append(toIndentedString(setupFeePrice)).append("\n");
    sb.append("    setupFeePriceFormatted: ").append(toIndentedString(setupFeePriceFormatted)).append("\n");
    sb.append("    freeQuantity: ").append(toIndentedString(freeQuantity)).append("\n");
    sb.append("    billingDateType: ").append(toIndentedString(billingDateType)).append("\n");
    sb.append("    fixedBillingDateDay: ").append(toIndentedString(fixedBillingDateDay)).append("\n");
    sb.append("    proRateOption: ").append(toIndentedString(proRateOption)).append("\n");
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
    openapiFields.add("pricingModelId");
    openapiFields.add("frequency");
    openapiFields.add("frequencyType");
    openapiFields.add("freeTrial");
    openapiFields.add("freeTrialFrequencyType");
    openapiFields.add("contractTerm");
    openapiFields.add("contractTermFrequencyType");
    openapiFields.add("setupFeePrice");
    openapiFields.add("setupFeePriceFormatted");
    openapiFields.add("freeQuantity");
    openapiFields.add("billingDateType");
    openapiFields.add("fixedBillingDateDay");
    openapiFields.add("proRateOption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductCreateCycleResponseInnerPricingModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductCreateCycleResponseInnerPricingModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductCreateCycleResponseInnerPricingModel is not found in the empty JSON string", ProductCreateCycleResponseInnerPricingModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("setupFeePriceFormatted") != null && !jsonObj.get("setupFeePriceFormatted").isJsonNull()) && !jsonObj.get("setupFeePriceFormatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `setupFeePriceFormatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("setupFeePriceFormatted").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductCreateCycleResponseInnerPricingModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductCreateCycleResponseInnerPricingModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductCreateCycleResponseInnerPricingModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductCreateCycleResponseInnerPricingModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductCreateCycleResponseInnerPricingModel>() {
           @Override
           public void write(JsonWriter out, ProductCreateCycleResponseInnerPricingModel value) throws IOException {
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
           public ProductCreateCycleResponseInnerPricingModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductCreateCycleResponseInnerPricingModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductCreateCycleResponseInnerPricingModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductCreateCycleResponseInnerPricingModel
  * @throws IOException if the JSON string is invalid with respect to ProductCreateCycleResponseInnerPricingModel
  */
  public static ProductCreateCycleResponseInnerPricingModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductCreateCycleResponseInnerPricingModel.class);
  }

 /**
  * Convert an instance of ProductCreateCycleResponseInnerPricingModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

