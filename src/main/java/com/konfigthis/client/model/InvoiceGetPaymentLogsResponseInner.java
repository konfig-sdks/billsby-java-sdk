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
 * InvoiceGetPaymentLogsResponseInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoiceGetPaymentLogsResponseInner {
  public static final String SERIALIZED_NAME_PAYMENT_LOG_ID = "paymentLogId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_LOG_ID)
  private Integer paymentLogId = 0;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_GATEWAY_ID = "gatewayId";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
  private Integer gatewayId = 0;

  public static final String SERIALIZED_NAME_GATEWAY_NAME = "gatewayName";
  @SerializedName(SERIALIZED_NAME_GATEWAY_NAME)
  private String gatewayName;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public InvoiceGetPaymentLogsResponseInner() {
  }

  public InvoiceGetPaymentLogsResponseInner paymentLogId(Integer paymentLogId) {
    
    
    
    
    this.paymentLogId = paymentLogId;
    return this;
  }

   /**
   * Get paymentLogId
   * @return paymentLogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getPaymentLogId() {
    return paymentLogId;
  }


  public void setPaymentLogId(Integer paymentLogId) {
    
    
    
    this.paymentLogId = paymentLogId;
  }


  public InvoiceGetPaymentLogsResponseInner createdOn(String createdOn) {
    
    
    
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-29T14:02:11.138Z", value = "")

  public String getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(String createdOn) {
    
    
    
    this.createdOn = createdOn;
  }


  public InvoiceGetPaymentLogsResponseInner gatewayId(Integer gatewayId) {
    
    
    
    
    this.gatewayId = gatewayId;
    return this;
  }

   /**
   * Get gatewayId
   * @return gatewayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getGatewayId() {
    return gatewayId;
  }


  public void setGatewayId(Integer gatewayId) {
    
    
    
    this.gatewayId = gatewayId;
  }


  public InvoiceGetPaymentLogsResponseInner gatewayName(String gatewayName) {
    
    
    
    
    this.gatewayName = gatewayName;
    return this;
  }

   /**
   * Get gatewayName
   * @return gatewayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getGatewayName() {
    return gatewayName;
  }


  public void setGatewayName(String gatewayName) {
    
    
    
    this.gatewayName = gatewayName;
  }


  public InvoiceGetPaymentLogsResponseInner reference(String reference) {
    
    
    
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    
    
    
    this.reference = reference;
  }


  public InvoiceGetPaymentLogsResponseInner paymentMethod(String paymentMethod) {
    
    
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    
    
    
    this.paymentMethod = paymentMethod;
  }


  public InvoiceGetPaymentLogsResponseInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
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
   * @return the InvoiceGetPaymentLogsResponseInner instance itself
   */
  public InvoiceGetPaymentLogsResponseInner putAdditionalProperty(String key, Object value) {
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
    InvoiceGetPaymentLogsResponseInner invoiceGetPaymentLogsResponseInner = (InvoiceGetPaymentLogsResponseInner) o;
    return Objects.equals(this.paymentLogId, invoiceGetPaymentLogsResponseInner.paymentLogId) &&
        Objects.equals(this.createdOn, invoiceGetPaymentLogsResponseInner.createdOn) &&
        Objects.equals(this.gatewayId, invoiceGetPaymentLogsResponseInner.gatewayId) &&
        Objects.equals(this.gatewayName, invoiceGetPaymentLogsResponseInner.gatewayName) &&
        Objects.equals(this.reference, invoiceGetPaymentLogsResponseInner.reference) &&
        Objects.equals(this.paymentMethod, invoiceGetPaymentLogsResponseInner.paymentMethod) &&
        Objects.equals(this.status, invoiceGetPaymentLogsResponseInner.status)&&
        Objects.equals(this.additionalProperties, invoiceGetPaymentLogsResponseInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentLogId, createdOn, gatewayId, gatewayName, reference, paymentMethod, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceGetPaymentLogsResponseInner {\n");
    sb.append("    paymentLogId: ").append(toIndentedString(paymentLogId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    gatewayName: ").append(toIndentedString(gatewayName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("paymentLogId");
    openapiFields.add("createdOn");
    openapiFields.add("gatewayId");
    openapiFields.add("gatewayName");
    openapiFields.add("reference");
    openapiFields.add("paymentMethod");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceGetPaymentLogsResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoiceGetPaymentLogsResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceGetPaymentLogsResponseInner is not found in the empty JSON string", InvoiceGetPaymentLogsResponseInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("createdOn") != null && !jsonObj.get("createdOn").isJsonNull()) && !jsonObj.get("createdOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdOn").toString()));
      }
      if ((jsonObj.get("gatewayName") != null && !jsonObj.get("gatewayName").isJsonNull()) && !jsonObj.get("gatewayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayName").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("paymentMethod") != null && !jsonObj.get("paymentMethod").isJsonNull()) && !jsonObj.get("paymentMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethod").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceGetPaymentLogsResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceGetPaymentLogsResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceGetPaymentLogsResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceGetPaymentLogsResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceGetPaymentLogsResponseInner>() {
           @Override
           public void write(JsonWriter out, InvoiceGetPaymentLogsResponseInner value) throws IOException {
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
           public InvoiceGetPaymentLogsResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceGetPaymentLogsResponseInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoiceGetPaymentLogsResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceGetPaymentLogsResponseInner
  * @throws IOException if the JSON string is invalid with respect to InvoiceGetPaymentLogsResponseInner
  */
  public static InvoiceGetPaymentLogsResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceGetPaymentLogsResponseInner.class);
  }

 /**
  * Convert an instance of InvoiceGetPaymentLogsResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

