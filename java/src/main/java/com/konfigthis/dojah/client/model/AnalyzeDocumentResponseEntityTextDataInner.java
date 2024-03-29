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
 * AnalyzeDocumentResponseEntityTextDataInner
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnalyzeDocumentResponseEntityTextDataInner {
  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_FIELD_TYPE = "field_type";
  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  private Double fieldType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Double status;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public AnalyzeDocumentResponseEntityTextDataInner() {
  }

  public AnalyzeDocumentResponseEntityTextDataInner fieldName(String fieldName) {

    
    
    
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Date of Expiry", value = "")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {

    
    
    
    this.fieldName = fieldName;
  }


  public AnalyzeDocumentResponseEntityTextDataInner fieldType(Double fieldType) {

    
    
    
    
    this.fieldType = fieldType;
    return this;
  }

  public AnalyzeDocumentResponseEntityTextDataInner fieldType(Integer fieldType) {

    
    
    
    
    this.fieldType = fieldType.doubleValue();
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Double getFieldType() {
    return fieldType;
  }


  public void setFieldType(Double fieldType) {

    
    
    
    this.fieldType = fieldType;
  }


  public AnalyzeDocumentResponseEntityTextDataInner status(Double status) {

    
    
    
    
    this.status = status;
    return this;
  }

  public AnalyzeDocumentResponseEntityTextDataInner status(Integer status) {

    
    
    
    
    this.status = status.doubleValue();
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Double getStatus() {
    return status;
  }


  public void setStatus(Double status) {

    
    
    
    this.status = status;
  }


  public AnalyzeDocumentResponseEntityTextDataInner value(String value) {

    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2007-08-21", value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {

    
    
    
    this.value = value;
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
   * @return the AnalyzeDocumentResponseEntityTextDataInner instance itself
   */
  public AnalyzeDocumentResponseEntityTextDataInner putAdditionalProperty(String key, Object value) {
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
    AnalyzeDocumentResponseEntityTextDataInner analyzeDocumentResponseEntityTextDataInner = (AnalyzeDocumentResponseEntityTextDataInner) o;
    return Objects.equals(this.fieldName, analyzeDocumentResponseEntityTextDataInner.fieldName) &&
        Objects.equals(this.fieldType, analyzeDocumentResponseEntityTextDataInner.fieldType) &&
        Objects.equals(this.status, analyzeDocumentResponseEntityTextDataInner.status) &&
        Objects.equals(this.value, analyzeDocumentResponseEntityTextDataInner.value)&&
        Objects.equals(this.additionalProperties, analyzeDocumentResponseEntityTextDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldType, status, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeDocumentResponseEntityTextDataInner {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("field_name");
    openapiFields.add("field_type");
    openapiFields.add("status");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnalyzeDocumentResponseEntityTextDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnalyzeDocumentResponseEntityTextDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyzeDocumentResponseEntityTextDataInner is not found in the empty JSON string", AnalyzeDocumentResponseEntityTextDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonNull()) && !jsonObj.get("field_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_name").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyzeDocumentResponseEntityTextDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyzeDocumentResponseEntityTextDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyzeDocumentResponseEntityTextDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyzeDocumentResponseEntityTextDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyzeDocumentResponseEntityTextDataInner>() {
           @Override
           public void write(JsonWriter out, AnalyzeDocumentResponseEntityTextDataInner value) throws IOException {
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
           public AnalyzeDocumentResponseEntityTextDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnalyzeDocumentResponseEntityTextDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AnalyzeDocumentResponseEntityTextDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyzeDocumentResponseEntityTextDataInner
  * @throws IOException if the JSON string is invalid with respect to AnalyzeDocumentResponseEntityTextDataInner
  */
  public static AnalyzeDocumentResponseEntityTextDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyzeDocumentResponseEntityTextDataInner.class);
  }

 /**
  * Convert an instance of AnalyzeDocumentResponseEntityTextDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

