/*
 * DOJAH Publilc APIs
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.dojah.client.model;

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

import com.konfigthis.dojah.client.JSON;

/**
 * SendSmsResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SendSmsResponseEntity {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Boolean status;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public SendSmsResponseEntity() {
  }

  public SendSmsResponseEntity status(Boolean status) {

    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getStatus() {
    return status;
  }


  public void setStatus(Boolean status) {

    
    
    
    this.status = status;
  }


  public SendSmsResponseEntity mobile(String mobile) {

    
    
    
    
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2348068810228", value = "")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {

    
    
    
    this.mobile = mobile;
  }


  public SendSmsResponseEntity messageId(String messageId) {

    
    
    
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true_2348068810228@c.us_3EB094F69064FF74BD76", value = "")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {

    
    
    
    this.messageId = messageId;
  }


  public SendSmsResponseEntity batchId(String batchId) {

    
    
    
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "90512", value = "")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {

    
    
    
    this.batchId = batchId;
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
   * @return the SendSmsResponseEntity instance itself
   */
  public SendSmsResponseEntity putAdditionalProperty(String key, Object value) {
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
    SendSmsResponseEntity sendSmsResponseEntity = (SendSmsResponseEntity) o;
    return Objects.equals(this.status, sendSmsResponseEntity.status) &&
        Objects.equals(this.mobile, sendSmsResponseEntity.mobile) &&
        Objects.equals(this.messageId, sendSmsResponseEntity.messageId) &&
        Objects.equals(this.batchId, sendSmsResponseEntity.batchId)&&
        Objects.equals(this.additionalProperties, sendSmsResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, mobile, messageId, batchId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmsResponseEntity {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("mobile");
    openapiFields.add("message_id");
    openapiFields.add("batch_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendSmsResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SendSmsResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendSmsResponseEntity is not found in the empty JSON string", SendSmsResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonNull()) && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if ((jsonObj.get("message_id") != null && !jsonObj.get("message_id").isJsonNull()) && !jsonObj.get("message_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_id").toString()));
      }
      if ((jsonObj.get("batch_id") != null && !jsonObj.get("batch_id").isJsonNull()) && !jsonObj.get("batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendSmsResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendSmsResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendSmsResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendSmsResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SendSmsResponseEntity>() {
           @Override
           public void write(JsonWriter out, SendSmsResponseEntity value) throws IOException {
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
           public SendSmsResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SendSmsResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SendSmsResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendSmsResponseEntity
  * @throws IOException if the JSON string is invalid with respect to SendSmsResponseEntity
  */
  public static SendSmsResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendSmsResponseEntity.class);
  }

 /**
  * Convert an instance of SendSmsResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

