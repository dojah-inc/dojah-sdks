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
 * FinancialGetBasicBvnResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FinancialGetBasicBvnResponseEntity {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_FORMATTED_DOB = "formatted_dob";
  @SerializedName(SERIALIZED_NAME_FORMATTED_DOB)
  private String formattedDob;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_BVN = "bvn";
  @SerializedName(SERIALIZED_NAME_BVN)
  private String bvn;

  public FinancialGetBasicBvnResponseEntity() {
  }

  public FinancialGetBasicBvnResponseEntity firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISAAC", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public FinancialGetBasicBvnResponseEntity lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "THOMPSON", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public FinancialGetBasicBvnResponseEntity dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28-Jun-00", value = "")

  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public FinancialGetBasicBvnResponseEntity formattedDob(String formattedDob) {
    
    this.formattedDob = formattedDob;
    return this;
  }

   /**
   * Get formattedDob
   * @return formattedDob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000-06-28", value = "")

  public String getFormattedDob() {
    return formattedDob;
  }


  public void setFormattedDob(String formattedDob) {
    this.formattedDob = formattedDob;
  }


  public FinancialGetBasicBvnResponseEntity mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "070***28116", value = "")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public FinancialGetBasicBvnResponseEntity bvn(String bvn) {
    
    this.bvn = bvn;
    return this;
  }

   /**
   * Get bvn
   * @return bvn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2246***3719", value = "")

  public String getBvn() {
    return bvn;
  }


  public void setBvn(String bvn) {
    this.bvn = bvn;
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
   * @return the FinancialGetBasicBvnResponseEntity instance itself
   */
  public FinancialGetBasicBvnResponseEntity putAdditionalProperty(String key, Object value) {
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
    FinancialGetBasicBvnResponseEntity financialGetBasicBvnResponseEntity = (FinancialGetBasicBvnResponseEntity) o;
    return Objects.equals(this.firstName, financialGetBasicBvnResponseEntity.firstName) &&
        Objects.equals(this.lastName, financialGetBasicBvnResponseEntity.lastName) &&
        Objects.equals(this.dob, financialGetBasicBvnResponseEntity.dob) &&
        Objects.equals(this.formattedDob, financialGetBasicBvnResponseEntity.formattedDob) &&
        Objects.equals(this.mobile, financialGetBasicBvnResponseEntity.mobile) &&
        Objects.equals(this.bvn, financialGetBasicBvnResponseEntity.bvn)&&
        Objects.equals(this.additionalProperties, financialGetBasicBvnResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, dob, formattedDob, mobile, bvn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialGetBasicBvnResponseEntity {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    formattedDob: ").append(toIndentedString(formattedDob)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    bvn: ").append(toIndentedString(bvn)).append("\n");
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
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("dob");
    openapiFields.add("formatted_dob");
    openapiFields.add("mobile");
    openapiFields.add("bvn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialGetBasicBvnResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FinancialGetBasicBvnResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialGetBasicBvnResponseEntity is not found in the empty JSON string", FinancialGetBasicBvnResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("formatted_dob") != null && !jsonObj.get("formatted_dob").isJsonNull()) && !jsonObj.get("formatted_dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formatted_dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formatted_dob").toString()));
      }
      if ((jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonNull()) && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if ((jsonObj.get("bvn") != null && !jsonObj.get("bvn").isJsonNull()) && !jsonObj.get("bvn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bvn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bvn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialGetBasicBvnResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialGetBasicBvnResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialGetBasicBvnResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialGetBasicBvnResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialGetBasicBvnResponseEntity>() {
           @Override
           public void write(JsonWriter out, FinancialGetBasicBvnResponseEntity value) throws IOException {
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
           public FinancialGetBasicBvnResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FinancialGetBasicBvnResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FinancialGetBasicBvnResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialGetBasicBvnResponseEntity
  * @throws IOException if the JSON string is invalid with respect to FinancialGetBasicBvnResponseEntity
  */
  public static FinancialGetBasicBvnResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialGetBasicBvnResponseEntity.class);
  }

 /**
  * Convert an instance of FinancialGetBasicBvnResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

