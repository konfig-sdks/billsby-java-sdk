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
import com.konfigthis.client.model.CustomerUpdateDetailsResponseBillingAddress;
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
 * CustomerUpdateDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomerUpdateDetailsResponse {
  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private CustomerUpdateDetailsResponseBillingAddress billingAddress;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ADDITIONAL_EMAIL = "additionalEmail";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_EMAIL)
  private String additionalEmail;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_DIAL_COUNTRY = "phoneNumberDialCountry";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_DIAL_COUNTRY)
  private String phoneNumberDialCountry;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_DIAL_CODE = "phoneNumberDialCode";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_DIAL_CODE)
  private String phoneNumberDialCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_IS_MARKETING_CONSENT_GIVEN = "isMarketingConsentGiven";
  @SerializedName(SERIALIZED_NAME_IS_MARKETING_CONSENT_GIVEN)
  private Boolean isMarketingConsentGiven = true;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_UNIQUE_ID = "uniqueId";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private String uniqueId;

  public CustomerUpdateDetailsResponse() {
  }

  public CustomerUpdateDetailsResponse customerId(String customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6DK82SKD", value = "")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    
    
    
    this.customerId = customerId;
  }


  public CustomerUpdateDetailsResponse firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mary", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public CustomerUpdateDetailsResponse lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "quinn", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public CustomerUpdateDetailsResponse billingAddress(CustomerUpdateDetailsResponseBillingAddress billingAddress) {
    
    
    
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerUpdateDetailsResponseBillingAddress getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(CustomerUpdateDetailsResponseBillingAddress billingAddress) {
    
    
    
    this.billingAddress = billingAddress;
  }


  public CustomerUpdateDetailsResponse email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mary.quinn@mistmail.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public CustomerUpdateDetailsResponse additionalEmail(String additionalEmail) {
    
    
    
    
    this.additionalEmail = additionalEmail;
    return this;
  }

   /**
   * Get additionalEmail
   * @return additionalEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "marymay@mistimail.com", value = "")

  public String getAdditionalEmail() {
    return additionalEmail;
  }


  public void setAdditionalEmail(String additionalEmail) {
    
    
    
    this.additionalEmail = additionalEmail;
  }


  public CustomerUpdateDetailsResponse phoneNumberDialCountry(String phoneNumberDialCountry) {
    
    
    
    
    this.phoneNumberDialCountry = phoneNumberDialCountry;
    return this;
  }

   /**
   * Get phoneNumberDialCountry
   * @return phoneNumberDialCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USA", value = "")

  public String getPhoneNumberDialCountry() {
    return phoneNumberDialCountry;
  }


  public void setPhoneNumberDialCountry(String phoneNumberDialCountry) {
    
    
    
    this.phoneNumberDialCountry = phoneNumberDialCountry;
  }


  public CustomerUpdateDetailsResponse phoneNumberDialCode(String phoneNumberDialCode) {
    
    
    
    
    this.phoneNumberDialCode = phoneNumberDialCode;
    return this;
  }

   /**
   * Get phoneNumberDialCode
   * @return phoneNumberDialCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1", value = "")

  public String getPhoneNumberDialCode() {
    return phoneNumberDialCode;
  }


  public void setPhoneNumberDialCode(String phoneNumberDialCode) {
    
    
    
    this.phoneNumberDialCode = phoneNumberDialCode;
  }


  public CustomerUpdateDetailsResponse phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "07283928192", value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public CustomerUpdateDetailsResponse isMarketingConsentGiven(Boolean isMarketingConsentGiven) {
    
    
    
    
    this.isMarketingConsentGiven = isMarketingConsentGiven;
    return this;
  }

   /**
   * Get isMarketingConsentGiven
   * @return isMarketingConsentGiven
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsMarketingConsentGiven() {
    return isMarketingConsentGiven;
  }


  public void setIsMarketingConsentGiven(Boolean isMarketingConsentGiven) {
    
    
    
    this.isMarketingConsentGiven = isMarketingConsentGiven;
  }


  public CustomerUpdateDetailsResponse createdOn(String createdOn) {
    
    
    
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-03T13:31:55.138Z", value = "")

  public String getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(String createdOn) {
    
    
    
    this.createdOn = createdOn;
  }


  public CustomerUpdateDetailsResponse uniqueId(String uniqueId) {
    
    
    
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AHD12QR4", value = "")

  public String getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(String uniqueId) {
    
    
    
    this.uniqueId = uniqueId;
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
   * @return the CustomerUpdateDetailsResponse instance itself
   */
  public CustomerUpdateDetailsResponse putAdditionalProperty(String key, Object value) {
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
    CustomerUpdateDetailsResponse customerUpdateDetailsResponse = (CustomerUpdateDetailsResponse) o;
    return Objects.equals(this.customerId, customerUpdateDetailsResponse.customerId) &&
        Objects.equals(this.firstName, customerUpdateDetailsResponse.firstName) &&
        Objects.equals(this.lastName, customerUpdateDetailsResponse.lastName) &&
        Objects.equals(this.billingAddress, customerUpdateDetailsResponse.billingAddress) &&
        Objects.equals(this.email, customerUpdateDetailsResponse.email) &&
        Objects.equals(this.additionalEmail, customerUpdateDetailsResponse.additionalEmail) &&
        Objects.equals(this.phoneNumberDialCountry, customerUpdateDetailsResponse.phoneNumberDialCountry) &&
        Objects.equals(this.phoneNumberDialCode, customerUpdateDetailsResponse.phoneNumberDialCode) &&
        Objects.equals(this.phoneNumber, customerUpdateDetailsResponse.phoneNumber) &&
        Objects.equals(this.isMarketingConsentGiven, customerUpdateDetailsResponse.isMarketingConsentGiven) &&
        Objects.equals(this.createdOn, customerUpdateDetailsResponse.createdOn) &&
        Objects.equals(this.uniqueId, customerUpdateDetailsResponse.uniqueId)&&
        Objects.equals(this.additionalProperties, customerUpdateDetailsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, firstName, lastName, billingAddress, email, additionalEmail, phoneNumberDialCountry, phoneNumberDialCode, phoneNumber, isMarketingConsentGiven, createdOn, uniqueId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateDetailsResponse {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    additionalEmail: ").append(toIndentedString(additionalEmail)).append("\n");
    sb.append("    phoneNumberDialCountry: ").append(toIndentedString(phoneNumberDialCountry)).append("\n");
    sb.append("    phoneNumberDialCode: ").append(toIndentedString(phoneNumberDialCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    isMarketingConsentGiven: ").append(toIndentedString(isMarketingConsentGiven)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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
    openapiFields.add("customerId");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("billingAddress");
    openapiFields.add("email");
    openapiFields.add("additionalEmail");
    openapiFields.add("phoneNumberDialCountry");
    openapiFields.add("phoneNumberDialCode");
    openapiFields.add("phoneNumber");
    openapiFields.add("isMarketingConsentGiven");
    openapiFields.add("createdOn");
    openapiFields.add("uniqueId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerUpdateDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerUpdateDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerUpdateDetailsResponse is not found in the empty JSON string", CustomerUpdateDetailsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      // validate the optional field `billingAddress`
      if (jsonObj.get("billingAddress") != null && !jsonObj.get("billingAddress").isJsonNull()) {
        CustomerUpdateDetailsResponseBillingAddress.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("additionalEmail") != null && !jsonObj.get("additionalEmail").isJsonNull()) && !jsonObj.get("additionalEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalEmail").toString()));
      }
      if ((jsonObj.get("phoneNumberDialCountry") != null && !jsonObj.get("phoneNumberDialCountry").isJsonNull()) && !jsonObj.get("phoneNumberDialCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberDialCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberDialCountry").toString()));
      }
      if ((jsonObj.get("phoneNumberDialCode") != null && !jsonObj.get("phoneNumberDialCode").isJsonNull()) && !jsonObj.get("phoneNumberDialCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberDialCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberDialCode").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("createdOn") != null && !jsonObj.get("createdOn").isJsonNull()) && !jsonObj.get("createdOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdOn").toString()));
      }
      if ((jsonObj.get("uniqueId") != null && !jsonObj.get("uniqueId").isJsonNull()) && !jsonObj.get("uniqueId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uniqueId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uniqueId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerUpdateDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerUpdateDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerUpdateDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerUpdateDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerUpdateDetailsResponse>() {
           @Override
           public void write(JsonWriter out, CustomerUpdateDetailsResponse value) throws IOException {
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
           public CustomerUpdateDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomerUpdateDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomerUpdateDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerUpdateDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to CustomerUpdateDetailsResponse
  */
  public static CustomerUpdateDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerUpdateDetailsResponse.class);
  }

 /**
  * Convert an instance of CustomerUpdateDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

