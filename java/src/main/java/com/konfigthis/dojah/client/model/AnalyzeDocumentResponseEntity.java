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
import com.konfigthis.dojah.client.model.AnalyzeDocumentResponseEntityDocumentImages;
import com.konfigthis.dojah.client.model.AnalyzeDocumentResponseEntityDocumentType;
import com.konfigthis.dojah.client.model.AnalyzeDocumentResponseEntityStatus;
import com.konfigthis.dojah.client.model.AnalyzeDocumentResponseEntityTextDataInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AnalyzeDocumentResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnalyzeDocumentResponseEntity {
  public static final String SERIALIZED_NAME_DOCUMENT_IMAGES = "document_images";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IMAGES)
  private AnalyzeDocumentResponseEntityDocumentImages documentImages;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private AnalyzeDocumentResponseEntityDocumentType documentType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AnalyzeDocumentResponseEntityStatus status;

  public static final String SERIALIZED_NAME_TEXT_DATA = "text_data";
  @SerializedName(SERIALIZED_NAME_TEXT_DATA)
  private List<AnalyzeDocumentResponseEntityTextDataInner> textData = null;

  public AnalyzeDocumentResponseEntity() {
  }

  public AnalyzeDocumentResponseEntity documentImages(AnalyzeDocumentResponseEntityDocumentImages documentImages) {

    
    
    
    
    this.documentImages = documentImages;
    return this;
  }

   /**
   * Get documentImages
   * @return documentImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnalyzeDocumentResponseEntityDocumentImages getDocumentImages() {
    return documentImages;
  }


  public void setDocumentImages(AnalyzeDocumentResponseEntityDocumentImages documentImages) {

    
    
    
    this.documentImages = documentImages;
  }


  public AnalyzeDocumentResponseEntity documentType(AnalyzeDocumentResponseEntityDocumentType documentType) {

    
    
    
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnalyzeDocumentResponseEntityDocumentType getDocumentType() {
    return documentType;
  }


  public void setDocumentType(AnalyzeDocumentResponseEntityDocumentType documentType) {

    
    
    
    this.documentType = documentType;
  }


  public AnalyzeDocumentResponseEntity status(AnalyzeDocumentResponseEntityStatus status) {

    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnalyzeDocumentResponseEntityStatus getStatus() {
    return status;
  }


  public void setStatus(AnalyzeDocumentResponseEntityStatus status) {

    
    
    
    this.status = status;
  }


  public AnalyzeDocumentResponseEntity textData(List<AnalyzeDocumentResponseEntityTextDataInner> textData) {

    
    
    
    
    this.textData = textData;
    return this;
  }

  public AnalyzeDocumentResponseEntity addTextDataItem(AnalyzeDocumentResponseEntityTextDataInner textDataItem) {
    if (this.textData == null) {
      this.textData = new ArrayList<>();
    }
    this.textData.add(textDataItem);
    return this;
  }

   /**
   * Get textData
   * @return textData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AnalyzeDocumentResponseEntityTextDataInner> getTextData() {
    return textData;
  }


  public void setTextData(List<AnalyzeDocumentResponseEntityTextDataInner> textData) {

    
    
    
    this.textData = textData;
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
   * @return the AnalyzeDocumentResponseEntity instance itself
   */
  public AnalyzeDocumentResponseEntity putAdditionalProperty(String key, Object value) {
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
    AnalyzeDocumentResponseEntity analyzeDocumentResponseEntity = (AnalyzeDocumentResponseEntity) o;
    return Objects.equals(this.documentImages, analyzeDocumentResponseEntity.documentImages) &&
        Objects.equals(this.documentType, analyzeDocumentResponseEntity.documentType) &&
        Objects.equals(this.status, analyzeDocumentResponseEntity.status) &&
        Objects.equals(this.textData, analyzeDocumentResponseEntity.textData)&&
        Objects.equals(this.additionalProperties, analyzeDocumentResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentImages, documentType, status, textData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeDocumentResponseEntity {\n");
    sb.append("    documentImages: ").append(toIndentedString(documentImages)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    textData: ").append(toIndentedString(textData)).append("\n");
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
    openapiFields.add("document_images");
    openapiFields.add("document_type");
    openapiFields.add("status");
    openapiFields.add("text_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnalyzeDocumentResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnalyzeDocumentResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyzeDocumentResponseEntity is not found in the empty JSON string", AnalyzeDocumentResponseEntity.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `document_images`
      if (jsonObj.get("document_images") != null && !jsonObj.get("document_images").isJsonNull()) {
        AnalyzeDocumentResponseEntityDocumentImages.validateJsonObject(jsonObj.getAsJsonObject("document_images"));
      }
      // validate the optional field `document_type`
      if (jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) {
        AnalyzeDocumentResponseEntityDocumentType.validateJsonObject(jsonObj.getAsJsonObject("document_type"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        AnalyzeDocumentResponseEntityStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      if (jsonObj.get("text_data") != null && !jsonObj.get("text_data").isJsonNull()) {
        JsonArray jsonArraytextData = jsonObj.getAsJsonArray("text_data");
        if (jsonArraytextData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("text_data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `text_data` to be an array in the JSON string but got `%s`", jsonObj.get("text_data").toString()));
          }

          // validate the optional field `text_data` (array)
          for (int i = 0; i < jsonArraytextData.size(); i++) {
            AnalyzeDocumentResponseEntityTextDataInner.validateJsonObject(jsonArraytextData.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyzeDocumentResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyzeDocumentResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyzeDocumentResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyzeDocumentResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyzeDocumentResponseEntity>() {
           @Override
           public void write(JsonWriter out, AnalyzeDocumentResponseEntity value) throws IOException {
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
           public AnalyzeDocumentResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnalyzeDocumentResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AnalyzeDocumentResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyzeDocumentResponseEntity
  * @throws IOException if the JSON string is invalid with respect to AnalyzeDocumentResponseEntity
  */
  public static AnalyzeDocumentResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyzeDocumentResponseEntity.class);
  }

 /**
  * Convert an instance of AnalyzeDocumentResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

