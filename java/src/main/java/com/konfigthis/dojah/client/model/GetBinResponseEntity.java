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
 * GetBinResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetBinResponseEntity {
  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_SUB_BRAND = "sub_brand";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND)
  private String subBrand;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "country_name";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private String bank;

  public GetBinResponseEntity() {
  }

  public GetBinResponseEntity bin(String bin) {

    
    
    
    
    this.bin = bin;
    return this;
  }

   /**
   * Get bin
   * @return bin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "506118", value = "")

  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {

    
    
    
    this.bin = bin;
  }


  public GetBinResponseEntity brand(String brand) {

    
    
    
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Verve", value = "")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {

    
    
    
    this.brand = brand;
  }


  public GetBinResponseEntity subBrand(String subBrand) {

    
    
    
    
    this.subBrand = subBrand;
    return this;
  }

   /**
   * Get subBrand
   * @return subBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getSubBrand() {
    return subBrand;
  }


  public void setSubBrand(String subBrand) {

    
    
    
    this.subBrand = subBrand;
  }


  public GetBinResponseEntity countryCode(String countryCode) {

    
    
    
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NG", value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {

    
    
    
    this.countryCode = countryCode;
  }


  public GetBinResponseEntity countryName(String countryName) {

    
    
    
    
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nigeria", value = "")

  public String getCountryName() {
    return countryName;
  }


  public void setCountryName(String countryName) {

    
    
    
    this.countryName = countryName;
  }


  public GetBinResponseEntity cardType(String cardType) {

    
    
    
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEBIT", value = "")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {

    
    
    
    this.cardType = cardType;
  }


  public GetBinResponseEntity bank(String bank) {

    
    
    
    
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ecobank Nigeria", value = "")

  public String getBank() {
    return bank;
  }


  public void setBank(String bank) {

    
    
    
    this.bank = bank;
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
   * @return the GetBinResponseEntity instance itself
   */
  public GetBinResponseEntity putAdditionalProperty(String key, Object value) {
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
    GetBinResponseEntity getBinResponseEntity = (GetBinResponseEntity) o;
    return Objects.equals(this.bin, getBinResponseEntity.bin) &&
        Objects.equals(this.brand, getBinResponseEntity.brand) &&
        Objects.equals(this.subBrand, getBinResponseEntity.subBrand) &&
        Objects.equals(this.countryCode, getBinResponseEntity.countryCode) &&
        Objects.equals(this.countryName, getBinResponseEntity.countryName) &&
        Objects.equals(this.cardType, getBinResponseEntity.cardType) &&
        Objects.equals(this.bank, getBinResponseEntity.bank)&&
        Objects.equals(this.additionalProperties, getBinResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bin, brand, subBrand, countryCode, countryName, cardType, bank, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBinResponseEntity {\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    subBrand: ").append(toIndentedString(subBrand)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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
    openapiFields.add("bin");
    openapiFields.add("brand");
    openapiFields.add("sub_brand");
    openapiFields.add("country_code");
    openapiFields.add("country_name");
    openapiFields.add("card_type");
    openapiFields.add("bank");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetBinResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetBinResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBinResponseEntity is not found in the empty JSON string", GetBinResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("bin") != null && !jsonObj.get("bin").isJsonNull()) && !jsonObj.get("bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin").toString()));
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if ((jsonObj.get("sub_brand") != null && !jsonObj.get("sub_brand").isJsonNull()) && !jsonObj.get("sub_brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_brand").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("country_name") != null && !jsonObj.get("country_name").isJsonNull()) && !jsonObj.get("country_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_name").toString()));
      }
      if ((jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if ((jsonObj.get("bank") != null && !jsonObj.get("bank").isJsonNull()) && !jsonObj.get("bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBinResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBinResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBinResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBinResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBinResponseEntity>() {
           @Override
           public void write(JsonWriter out, GetBinResponseEntity value) throws IOException {
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
           public GetBinResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetBinResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetBinResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBinResponseEntity
  * @throws IOException if the JSON string is invalid with respect to GetBinResponseEntity
  */
  public static GetBinResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBinResponseEntity.class);
  }

 /**
  * Convert an instance of GetBinResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

