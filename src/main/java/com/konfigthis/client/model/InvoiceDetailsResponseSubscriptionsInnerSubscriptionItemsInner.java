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
 * InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private String units;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private String unitPrice;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private String discounts;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner() {
  }

  public InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner units(String units) {
    
    
    
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public String getUnits() {
    return units;
  }


  public void setUnits(String units) {
    
    
    
    this.units = units;
  }


  public InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner unitPrice(String unitPrice) {
    
    
    
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public String getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(String unitPrice) {
    
    
    
    this.unitPrice = unitPrice;
  }


  public InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner discounts(String discounts) {
    
    
    
    
    this.discounts = discounts;
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getDiscounts() {
    return discounts;
  }


  public void setDiscounts(String discounts) {
    
    
    
    this.discounts = discounts;
  }


  public InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
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
   * @return the InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner instance itself
   */
  public InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner putAdditionalProperty(String key, Object value) {
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
    InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner invoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner = (InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner) o;
    return Objects.equals(this.description, invoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.description) &&
        Objects.equals(this.units, invoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.units) &&
        Objects.equals(this.unitPrice, invoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.unitPrice) &&
        Objects.equals(this.discounts, invoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.discounts) &&
        Objects.equals(this.amount, invoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.amount)&&
        Objects.equals(this.additionalProperties, invoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, units, unitPrice, discounts, amount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("units");
    openapiFields.add("unitPrice");
    openapiFields.add("discounts");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner is not found in the empty JSON string", InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("units") != null && !jsonObj.get("units").isJsonNull()) && !jsonObj.get("units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("units").toString()));
      }
      if ((jsonObj.get("unitPrice") != null && !jsonObj.get("unitPrice").isJsonNull()) && !jsonObj.get("unitPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitPrice").toString()));
      }
      if ((jsonObj.get("discounts") != null && !jsonObj.get("discounts").isJsonNull()) && !jsonObj.get("discounts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discounts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discounts").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner value) throws IOException {
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
           public InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner
  */
  public static InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner.class);
  }

 /**
  * Convert an instance of InvoiceDetailsResponseSubscriptionsInnerSubscriptionItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

