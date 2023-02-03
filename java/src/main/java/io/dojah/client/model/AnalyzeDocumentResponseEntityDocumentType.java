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
import java.math.BigDecimal;

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
 * AnalyzeDocumentResponseEntityDocumentType
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnalyzeDocumentResponseEntityDocumentType {
  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "document_name";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  private String documentName;

  public static final String SERIALIZED_NAME_DOCUMENT_COUNTRY_NAME = "document_country_name";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_COUNTRY_NAME)
  private String documentCountryName;

  public static final String SERIALIZED_NAME_DOCUMENT_COUNTRY_CODE = "document_country_code";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_COUNTRY_CODE)
  private String documentCountryCode;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_ID = "document_type_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_ID)
  private BigDecimal documentTypeId;

  public static final String SERIALIZED_NAME_DOCUMENT_YEAR = "document_year";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_YEAR)
  private String documentYear;

  public AnalyzeDocumentResponseEntityDocumentType() {
  }

  public AnalyzeDocumentResponseEntityDocumentType documentName(String documentName) {
    
    this.documentName = documentName;
    return this;
  }

   /**
   * Get documentName
   * @return documentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "United States - Permanent Resident Card (2010)", value = "")

  public String getDocumentName() {
    return documentName;
  }


  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  public AnalyzeDocumentResponseEntityDocumentType documentCountryName(String documentCountryName) {
    
    this.documentCountryName = documentCountryName;
    return this;
  }

   /**
   * Get documentCountryName
   * @return documentCountryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "United States", value = "")

  public String getDocumentCountryName() {
    return documentCountryName;
  }


  public void setDocumentCountryName(String documentCountryName) {
    this.documentCountryName = documentCountryName;
  }


  public AnalyzeDocumentResponseEntityDocumentType documentCountryCode(String documentCountryCode) {
    
    this.documentCountryCode = documentCountryCode;
    return this;
  }

   /**
   * Get documentCountryCode
   * @return documentCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USA", value = "")

  public String getDocumentCountryCode() {
    return documentCountryCode;
  }


  public void setDocumentCountryCode(String documentCountryCode) {
    this.documentCountryCode = documentCountryCode;
  }


  public AnalyzeDocumentResponseEntityDocumentType documentTypeId(BigDecimal documentTypeId) {
    
    this.documentTypeId = documentTypeId;
    return this;
  }

   /**
   * Get documentTypeId
   * @return documentTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "173", value = "")

  public BigDecimal getDocumentTypeId() {
    return documentTypeId;
  }


  public void setDocumentTypeId(BigDecimal documentTypeId) {
    this.documentTypeId = documentTypeId;
  }


  public AnalyzeDocumentResponseEntityDocumentType documentYear(String documentYear) {
    
    this.documentYear = documentYear;
    return this;
  }

   /**
   * Get documentYear
   * @return documentYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2010", value = "")

  public String getDocumentYear() {
    return documentYear;
  }


  public void setDocumentYear(String documentYear) {
    this.documentYear = documentYear;
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
   * @return the AnalyzeDocumentResponseEntityDocumentType instance itself
   */
  public AnalyzeDocumentResponseEntityDocumentType putAdditionalProperty(String key, Object value) {
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
    AnalyzeDocumentResponseEntityDocumentType analyzeDocumentResponseEntityDocumentType = (AnalyzeDocumentResponseEntityDocumentType) o;
    return Objects.equals(this.documentName, analyzeDocumentResponseEntityDocumentType.documentName) &&
        Objects.equals(this.documentCountryName, analyzeDocumentResponseEntityDocumentType.documentCountryName) &&
        Objects.equals(this.documentCountryCode, analyzeDocumentResponseEntityDocumentType.documentCountryCode) &&
        Objects.equals(this.documentTypeId, analyzeDocumentResponseEntityDocumentType.documentTypeId) &&
        Objects.equals(this.documentYear, analyzeDocumentResponseEntityDocumentType.documentYear)&&
        Objects.equals(this.additionalProperties, analyzeDocumentResponseEntityDocumentType.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentName, documentCountryName, documentCountryCode, documentTypeId, documentYear, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeDocumentResponseEntityDocumentType {\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentCountryName: ").append(toIndentedString(documentCountryName)).append("\n");
    sb.append("    documentCountryCode: ").append(toIndentedString(documentCountryCode)).append("\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
    sb.append("    documentYear: ").append(toIndentedString(documentYear)).append("\n");
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
    openapiFields.add("document_name");
    openapiFields.add("document_country_name");
    openapiFields.add("document_country_code");
    openapiFields.add("document_type_id");
    openapiFields.add("document_year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnalyzeDocumentResponseEntityDocumentType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnalyzeDocumentResponseEntityDocumentType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyzeDocumentResponseEntityDocumentType is not found in the empty JSON string", AnalyzeDocumentResponseEntityDocumentType.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("document_name") != null && !jsonObj.get("document_name").isJsonNull()) && !jsonObj.get("document_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_name").toString()));
      }
      if ((jsonObj.get("document_country_name") != null && !jsonObj.get("document_country_name").isJsonNull()) && !jsonObj.get("document_country_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_country_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_country_name").toString()));
      }
      if ((jsonObj.get("document_country_code") != null && !jsonObj.get("document_country_code").isJsonNull()) && !jsonObj.get("document_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_country_code").toString()));
      }
      if ((jsonObj.get("document_year") != null && !jsonObj.get("document_year").isJsonNull()) && !jsonObj.get("document_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_year").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyzeDocumentResponseEntityDocumentType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyzeDocumentResponseEntityDocumentType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyzeDocumentResponseEntityDocumentType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyzeDocumentResponseEntityDocumentType.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyzeDocumentResponseEntityDocumentType>() {
           @Override
           public void write(JsonWriter out, AnalyzeDocumentResponseEntityDocumentType value) throws IOException {
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
           public AnalyzeDocumentResponseEntityDocumentType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnalyzeDocumentResponseEntityDocumentType instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AnalyzeDocumentResponseEntityDocumentType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyzeDocumentResponseEntityDocumentType
  * @throws IOException if the JSON string is invalid with respect to AnalyzeDocumentResponseEntityDocumentType
  */
  public static AnalyzeDocumentResponseEntityDocumentType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyzeDocumentResponseEntityDocumentType.class);
  }

 /**
  * Convert an instance of AnalyzeDocumentResponseEntityDocumentType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
