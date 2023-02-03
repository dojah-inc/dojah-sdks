/*
 * DOJAH APIs
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package io.dojah.client.model;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.dojah.client.JSON;

/**
 * GetCacResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetCacResponseEntity {
  public static final String SERIALIZED_NAME_RC_NUMBER = "rc_number";
  @SerializedName(SERIALIZED_NAME_RC_NUMBER)
  private String rcNumber;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_DATE_OF_REGISTRATION = "date_of_registration";
  @SerializedName(SERIALIZED_NAME_DATE_OF_REGISTRATION)
  private String dateOfRegistration;

  public GetCacResponseEntity() {
  }

  public GetCacResponseEntity rcNumber(String rcNumber) {
    
    this.rcNumber = rcNumber;
    return this;
  }

   /**
   * Get rcNumber
   * @return rcNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1261103", value = "")

  public String getRcNumber() {
    return rcNumber;
  }


  public void setRcNumber(String rcNumber) {
    this.rcNumber = rcNumber;
  }


  public GetCacResponseEntity companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ELTAFORD LIMITED", value = "")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public GetCacResponseEntity address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO 37 ISAIAH ROAD UBEJI", value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public GetCacResponseEntity dateOfRegistration(String dateOfRegistration) {
    
    this.dateOfRegistration = dateOfRegistration;
    return this;
  }

   /**
   * Get dateOfRegistration
   * @return dateOfRegistration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-05-15", value = "")

  public String getDateOfRegistration() {
    return dateOfRegistration;
  }


  public void setDateOfRegistration(String dateOfRegistration) {
    this.dateOfRegistration = dateOfRegistration;
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
   * @return the GetCacResponseEntity instance itself
   */
  public GetCacResponseEntity putAdditionalProperty(String key, Object value) {
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
    GetCacResponseEntity getCacResponseEntity = (GetCacResponseEntity) o;
    return Objects.equals(this.rcNumber, getCacResponseEntity.rcNumber) &&
        Objects.equals(this.companyName, getCacResponseEntity.companyName) &&
        Objects.equals(this.address, getCacResponseEntity.address) &&
        Objects.equals(this.dateOfRegistration, getCacResponseEntity.dateOfRegistration)&&
        Objects.equals(this.additionalProperties, getCacResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rcNumber, companyName, address, dateOfRegistration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCacResponseEntity {\n");
    sb.append("    rcNumber: ").append(toIndentedString(rcNumber)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfRegistration: ").append(toIndentedString(dateOfRegistration)).append("\n");
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
    openapiFields.add("rc_number");
    openapiFields.add("company_name");
    openapiFields.add("address");
    openapiFields.add("date_of_registration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetCacResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetCacResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCacResponseEntity is not found in the empty JSON string", GetCacResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("rc_number") != null && !jsonObj.get("rc_number").isJsonNull()) && !jsonObj.get("rc_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rc_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rc_number").toString()));
      }
      if ((jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonNull()) && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("date_of_registration") != null && !jsonObj.get("date_of_registration").isJsonNull()) && !jsonObj.get("date_of_registration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_registration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_registration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCacResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCacResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCacResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCacResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCacResponseEntity>() {
           @Override
           public void write(JsonWriter out, GetCacResponseEntity value) throws IOException {
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
           public GetCacResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetCacResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetCacResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetCacResponseEntity
  * @throws IOException if the JSON string is invalid with respect to GetCacResponseEntity
  */
  public static GetCacResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCacResponseEntity.class);
  }

 /**
  * Convert an instance of GetCacResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

