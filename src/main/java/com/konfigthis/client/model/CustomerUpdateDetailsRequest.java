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
import com.konfigthis.client.model.CustomerUpdateDetailsRequestBillingAddress;
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
 * CustomerUpdateDetailsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomerUpdateDetailsRequest {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_DIAL_COUNTRY = "phoneNumberDialCountry";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_DIAL_COUNTRY)
  private String phoneNumberDialCountry;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_DIAL_CODE = "phoneNumberDialCode";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_DIAL_CODE)
  private String phoneNumberDialCode;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private CustomerUpdateDetailsRequestBillingAddress billingAddress;

  public CustomerUpdateDetailsRequest() {
  }

  public CustomerUpdateDetailsRequest firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The customers first name
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The customers first name")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public CustomerUpdateDetailsRequest lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The customers last name
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The customers last name")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public CustomerUpdateDetailsRequest phoneNumberDialCountry(String phoneNumberDialCountry) {
    
    
    
    
    this.phoneNumberDialCountry = phoneNumberDialCountry;
    return this;
  }

   /**
   * The customers phone number dial country (i.e. \&quot;UK\&quot;)
   * @return phoneNumberDialCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customers phone number dial country (i.e. \"UK\")")

  public String getPhoneNumberDialCountry() {
    return phoneNumberDialCountry;
  }


  public void setPhoneNumberDialCountry(String phoneNumberDialCountry) {
    
    
    
    this.phoneNumberDialCountry = phoneNumberDialCountry;
  }


  public CustomerUpdateDetailsRequest phoneNumberDialCode(String phoneNumberDialCode) {
    
    
    
    
    this.phoneNumberDialCode = phoneNumberDialCode;
    return this;
  }

   /**
   * The customer phone number dial code
   * @return phoneNumberDialCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer phone number dial code")

  public String getPhoneNumberDialCode() {
    return phoneNumberDialCode;
  }


  public void setPhoneNumberDialCode(String phoneNumberDialCode) {
    
    
    
    this.phoneNumberDialCode = phoneNumberDialCode;
  }


  public CustomerUpdateDetailsRequest email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The email address we have on file for the customer
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email address we have on file for the customer")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public CustomerUpdateDetailsRequest phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number we have on file for the customer. Remove \&quot;0\&quot; from the start.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number we have on file for the customer. Remove \"0\" from the start.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public CustomerUpdateDetailsRequest billingAddress(CustomerUpdateDetailsRequestBillingAddress billingAddress) {
    
    
    
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CustomerUpdateDetailsRequestBillingAddress getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(CustomerUpdateDetailsRequestBillingAddress billingAddress) {
    
    
    
    this.billingAddress = billingAddress;
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
   * @return the CustomerUpdateDetailsRequest instance itself
   */
  public CustomerUpdateDetailsRequest putAdditionalProperty(String key, Object value) {
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
    CustomerUpdateDetailsRequest customerUpdateDetailsRequest = (CustomerUpdateDetailsRequest) o;
    return Objects.equals(this.firstName, customerUpdateDetailsRequest.firstName) &&
        Objects.equals(this.lastName, customerUpdateDetailsRequest.lastName) &&
        Objects.equals(this.phoneNumberDialCountry, customerUpdateDetailsRequest.phoneNumberDialCountry) &&
        Objects.equals(this.phoneNumberDialCode, customerUpdateDetailsRequest.phoneNumberDialCode) &&
        Objects.equals(this.email, customerUpdateDetailsRequest.email) &&
        Objects.equals(this.phoneNumber, customerUpdateDetailsRequest.phoneNumber) &&
        Objects.equals(this.billingAddress, customerUpdateDetailsRequest.billingAddress)&&
        Objects.equals(this.additionalProperties, customerUpdateDetailsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumberDialCountry, phoneNumberDialCode, email, phoneNumber, billingAddress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateDetailsRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumberDialCountry: ").append(toIndentedString(phoneNumberDialCountry)).append("\n");
    sb.append("    phoneNumberDialCode: ").append(toIndentedString(phoneNumberDialCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("phoneNumberDialCountry");
    openapiFields.add("phoneNumberDialCode");
    openapiFields.add("email");
    openapiFields.add("phoneNumber");
    openapiFields.add("billingAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("billingAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerUpdateDetailsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerUpdateDetailsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerUpdateDetailsRequest is not found in the empty JSON string", CustomerUpdateDetailsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerUpdateDetailsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("phoneNumberDialCountry") != null && !jsonObj.get("phoneNumberDialCountry").isJsonNull()) && !jsonObj.get("phoneNumberDialCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberDialCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberDialCountry").toString()));
      }
      if ((jsonObj.get("phoneNumberDialCode") != null && !jsonObj.get("phoneNumberDialCode").isJsonNull()) && !jsonObj.get("phoneNumberDialCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberDialCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberDialCode").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      // validate the required field `billingAddress`
      CustomerUpdateDetailsRequestBillingAddress.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerUpdateDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerUpdateDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerUpdateDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerUpdateDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerUpdateDetailsRequest>() {
           @Override
           public void write(JsonWriter out, CustomerUpdateDetailsRequest value) throws IOException {
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
           public CustomerUpdateDetailsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomerUpdateDetailsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomerUpdateDetailsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerUpdateDetailsRequest
  * @throws IOException if the JSON string is invalid with respect to CustomerUpdateDetailsRequest
  */
  public static CustomerUpdateDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerUpdateDetailsRequest.class);
  }

 /**
  * Convert an instance of CustomerUpdateDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

