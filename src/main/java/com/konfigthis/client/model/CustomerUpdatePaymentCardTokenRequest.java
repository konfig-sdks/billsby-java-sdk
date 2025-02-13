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
 * CustomerUpdatePaymentCardTokenRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomerUpdatePaymentCardTokenRequest {
  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_PAYMENT_CARDTOKEN = "paymentCardtoken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARDTOKEN)
  private String paymentCardtoken;

  public static final String SERIALIZED_NAME_EXPIRY_MONTH = "expiryMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRY_MONTH)
  private Integer expiryMonth;

  public static final String SERIALIZED_NAME_EXPIRY_YEAR = "expiryYear";
  @SerializedName(SERIALIZED_NAME_EXPIRY_YEAR)
  private Integer expiryYear;

  public static final String SERIALIZED_NAME_CARD_TYPE = "cardType";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_LAST4_DIGITS = "last4Digits";
  @SerializedName(SERIALIZED_NAME_LAST4_DIGITS)
  private String last4Digits;

  public CustomerUpdatePaymentCardTokenRequest() {
  }

  public CustomerUpdatePaymentCardTokenRequest fullName(String fullName) {
    
    
    
    
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name of the customer
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full name of the customer")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    
    
    
    this.fullName = fullName;
  }


  public CustomerUpdatePaymentCardTokenRequest paymentCardtoken(String paymentCardtoken) {
    
    
    
    
    this.paymentCardtoken = paymentCardtoken;
    return this;
  }

   /**
   * The token for the payment card in the Billsby vault
   * @return paymentCardtoken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The token for the payment card in the Billsby vault")

  public String getPaymentCardtoken() {
    return paymentCardtoken;
  }


  public void setPaymentCardtoken(String paymentCardtoken) {
    
    
    
    this.paymentCardtoken = paymentCardtoken;
  }


  public CustomerUpdatePaymentCardTokenRequest expiryMonth(Integer expiryMonth) {
    
    
    
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The date that the payment card expires
   * @return expiryMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the payment card expires")

  public Integer getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(Integer expiryMonth) {
    
    
    
    this.expiryMonth = expiryMonth;
  }


  public CustomerUpdatePaymentCardTokenRequest expiryYear(Integer expiryYear) {
    
    
    
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The year that the payment card expires
   * @return expiryYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year that the payment card expires")

  public Integer getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(Integer expiryYear) {
    
    
    
    this.expiryYear = expiryYear;
  }


  public CustomerUpdatePaymentCardTokenRequest cardType(String cardType) {
    
    
    
    
    this.cardType = cardType;
    return this;
  }

   /**
   * The type of card (e.g. Visa, Mastercard, AMEX, etc.)
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of card (e.g. Visa, Mastercard, AMEX, etc.)")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    
    
    
    this.cardType = cardType;
  }


  public CustomerUpdatePaymentCardTokenRequest last4Digits(String last4Digits) {
    
    
    
    
    this.last4Digits = last4Digits;
    return this;
  }

   /**
   * The last four digits of the long number on the payment card
   * @return last4Digits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last four digits of the long number on the payment card")

  public String getLast4Digits() {
    return last4Digits;
  }


  public void setLast4Digits(String last4Digits) {
    
    
    
    this.last4Digits = last4Digits;
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
   * @return the CustomerUpdatePaymentCardTokenRequest instance itself
   */
  public CustomerUpdatePaymentCardTokenRequest putAdditionalProperty(String key, Object value) {
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
    CustomerUpdatePaymentCardTokenRequest customerUpdatePaymentCardTokenRequest = (CustomerUpdatePaymentCardTokenRequest) o;
    return Objects.equals(this.fullName, customerUpdatePaymentCardTokenRequest.fullName) &&
        Objects.equals(this.paymentCardtoken, customerUpdatePaymentCardTokenRequest.paymentCardtoken) &&
        Objects.equals(this.expiryMonth, customerUpdatePaymentCardTokenRequest.expiryMonth) &&
        Objects.equals(this.expiryYear, customerUpdatePaymentCardTokenRequest.expiryYear) &&
        Objects.equals(this.cardType, customerUpdatePaymentCardTokenRequest.cardType) &&
        Objects.equals(this.last4Digits, customerUpdatePaymentCardTokenRequest.last4Digits)&&
        Objects.equals(this.additionalProperties, customerUpdatePaymentCardTokenRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, paymentCardtoken, expiryMonth, expiryYear, cardType, last4Digits, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdatePaymentCardTokenRequest {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    paymentCardtoken: ").append(toIndentedString(paymentCardtoken)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    last4Digits: ").append(toIndentedString(last4Digits)).append("\n");
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
    openapiFields.add("fullName");
    openapiFields.add("paymentCardtoken");
    openapiFields.add("expiryMonth");
    openapiFields.add("expiryYear");
    openapiFields.add("cardType");
    openapiFields.add("last4Digits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerUpdatePaymentCardTokenRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerUpdatePaymentCardTokenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerUpdatePaymentCardTokenRequest is not found in the empty JSON string", CustomerUpdatePaymentCardTokenRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("fullName") != null && !jsonObj.get("fullName").isJsonNull()) && !jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      if ((jsonObj.get("paymentCardtoken") != null && !jsonObj.get("paymentCardtoken").isJsonNull()) && !jsonObj.get("paymentCardtoken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentCardtoken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentCardtoken").toString()));
      }
      if ((jsonObj.get("cardType") != null && !jsonObj.get("cardType").isJsonNull()) && !jsonObj.get("cardType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardType").toString()));
      }
      if ((jsonObj.get("last4Digits") != null && !jsonObj.get("last4Digits").isJsonNull()) && !jsonObj.get("last4Digits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last4Digits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last4Digits").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerUpdatePaymentCardTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerUpdatePaymentCardTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerUpdatePaymentCardTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerUpdatePaymentCardTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerUpdatePaymentCardTokenRequest>() {
           @Override
           public void write(JsonWriter out, CustomerUpdatePaymentCardTokenRequest value) throws IOException {
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
           public CustomerUpdatePaymentCardTokenRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomerUpdatePaymentCardTokenRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomerUpdatePaymentCardTokenRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerUpdatePaymentCardTokenRequest
  * @throws IOException if the JSON string is invalid with respect to CustomerUpdatePaymentCardTokenRequest
  */
  public static CustomerUpdatePaymentCardTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerUpdatePaymentCardTokenRequest.class);
  }

 /**
  * Convert an instance of CustomerUpdatePaymentCardTokenRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

