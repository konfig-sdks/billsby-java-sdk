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
 * AllowanceGetDetailsResponsePriceModelsInnerTiersInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AllowanceGetDetailsResponsePriceModelsInnerTiersInner {
  public static final String SERIALIZED_NAME_FINISH = "finish";
  @SerializedName(SERIALIZED_NAME_FINISH)
  private Integer finish = 0;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price = 0;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start = 0;

  public static final String SERIALIZED_NAME_PRICE_FORMATTED = "priceFormatted";
  @SerializedName(SERIALIZED_NAME_PRICE_FORMATTED)
  private String priceFormatted;

  public AllowanceGetDetailsResponsePriceModelsInnerTiersInner() {
  }

  public AllowanceGetDetailsResponsePriceModelsInnerTiersInner finish(Integer finish) {
    
    
    
    
    this.finish = finish;
    return this;
  }

   /**
   * Get finish
   * @return finish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFinish() {
    return finish;
  }


  public void setFinish(Integer finish) {
    
    
    
    this.finish = finish;
  }


  public AllowanceGetDetailsResponsePriceModelsInnerTiersInner price(Integer price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    
    
    
    this.price = price;
  }


  public AllowanceGetDetailsResponsePriceModelsInnerTiersInner start(Integer start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    
    
    
    this.start = start;
  }


  public AllowanceGetDetailsResponsePriceModelsInnerTiersInner priceFormatted(String priceFormatted) {
    
    
    
    
    this.priceFormatted = priceFormatted;
    return this;
  }

   /**
   * Get priceFormatted
   * @return priceFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getPriceFormatted() {
    return priceFormatted;
  }


  public void setPriceFormatted(String priceFormatted) {
    
    
    
    this.priceFormatted = priceFormatted;
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
   * @return the AllowanceGetDetailsResponsePriceModelsInnerTiersInner instance itself
   */
  public AllowanceGetDetailsResponsePriceModelsInnerTiersInner putAdditionalProperty(String key, Object value) {
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
    AllowanceGetDetailsResponsePriceModelsInnerTiersInner allowanceGetDetailsResponsePriceModelsInnerTiersInner = (AllowanceGetDetailsResponsePriceModelsInnerTiersInner) o;
    return Objects.equals(this.finish, allowanceGetDetailsResponsePriceModelsInnerTiersInner.finish) &&
        Objects.equals(this.price, allowanceGetDetailsResponsePriceModelsInnerTiersInner.price) &&
        Objects.equals(this.start, allowanceGetDetailsResponsePriceModelsInnerTiersInner.start) &&
        Objects.equals(this.priceFormatted, allowanceGetDetailsResponsePriceModelsInnerTiersInner.priceFormatted)&&
        Objects.equals(this.additionalProperties, allowanceGetDetailsResponsePriceModelsInnerTiersInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finish, price, start, priceFormatted, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowanceGetDetailsResponsePriceModelsInnerTiersInner {\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    priceFormatted: ").append(toIndentedString(priceFormatted)).append("\n");
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
    openapiFields.add("finish");
    openapiFields.add("price");
    openapiFields.add("start");
    openapiFields.add("priceFormatted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AllowanceGetDetailsResponsePriceModelsInnerTiersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AllowanceGetDetailsResponsePriceModelsInnerTiersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllowanceGetDetailsResponsePriceModelsInnerTiersInner is not found in the empty JSON string", AllowanceGetDetailsResponsePriceModelsInnerTiersInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("priceFormatted") != null && !jsonObj.get("priceFormatted").isJsonNull()) && !jsonObj.get("priceFormatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceFormatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceFormatted").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllowanceGetDetailsResponsePriceModelsInnerTiersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllowanceGetDetailsResponsePriceModelsInnerTiersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllowanceGetDetailsResponsePriceModelsInnerTiersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllowanceGetDetailsResponsePriceModelsInnerTiersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AllowanceGetDetailsResponsePriceModelsInnerTiersInner>() {
           @Override
           public void write(JsonWriter out, AllowanceGetDetailsResponsePriceModelsInnerTiersInner value) throws IOException {
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
           public AllowanceGetDetailsResponsePriceModelsInnerTiersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AllowanceGetDetailsResponsePriceModelsInnerTiersInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AllowanceGetDetailsResponsePriceModelsInnerTiersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AllowanceGetDetailsResponsePriceModelsInnerTiersInner
  * @throws IOException if the JSON string is invalid with respect to AllowanceGetDetailsResponsePriceModelsInnerTiersInner
  */
  public static AllowanceGetDetailsResponsePriceModelsInnerTiersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllowanceGetDetailsResponsePriceModelsInnerTiersInner.class);
  }

 /**
  * Convert an instance of AllowanceGetDetailsResponsePriceModelsInnerTiersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

