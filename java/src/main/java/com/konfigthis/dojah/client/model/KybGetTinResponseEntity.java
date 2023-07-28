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
 * KybGetTinResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class KybGetTinResponseEntity {
  public static final String SERIALIZED_NAME_SEARCH = "Search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private String search;

  public static final String SERIALIZED_NAME_TAXPAYER_NAME = "Taxpayer_Name";
  @SerializedName(SERIALIZED_NAME_TAXPAYER_NAME)
  private String taxpayerName;

  public static final String SERIALIZED_NAME_CA_C_REG_NO = "CAC_Reg_No";
  @SerializedName(SERIALIZED_NAME_CA_C_REG_NO)
  private String caCRegNo;

  public static final String SERIALIZED_NAME_F_I_R_S_T_I_N = "FIRSTIN";
  @SerializedName(SERIALIZED_NAME_F_I_R_S_T_I_N)
  private String FIRSTIN;

  public static final String SERIALIZED_NAME_J_I_T_T_I_N = "JITTIN";
  @SerializedName(SERIALIZED_NAME_J_I_T_T_I_N)
  private String JITTIN;

  public static final String SERIALIZED_NAME_TAX_OFFICE = "Tax_Office";
  @SerializedName(SERIALIZED_NAME_TAX_OFFICE)
  private String taxOffice;

  public static final String SERIALIZED_NAME_PHONE_NO = "Phone_No";
  @SerializedName(SERIALIZED_NAME_PHONE_NO)
  private String phoneNo;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public KybGetTinResponseEntity() {
  }

  public KybGetTinResponseEntity search(String search) {

    
    
    
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21148119-0001", value = "")

  public String getSearch() {
    return search;
  }


  public void setSearch(String search) {

    
    
    
    this.search = search;
  }


  public KybGetTinResponseEntity taxpayerName(String taxpayerName) {

    
    
    
    
    this.taxpayerName = taxpayerName;
    return this;
  }

   /**
   * Get taxpayerName
   * @return taxpayerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SMILE IDENTITY NIGERIA LIMITED LAGOS", value = "")

  public String getTaxpayerName() {
    return taxpayerName;
  }


  public void setTaxpayerName(String taxpayerName) {

    
    
    
    this.taxpayerName = taxpayerName;
  }


  public KybGetTinResponseEntity caCRegNo(String caCRegNo) {

    
    
    
    
    this.caCRegNo = caCRegNo;
    return this;
  }

   /**
   * Get caCRegNo
   * @return caCRegNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1539621", value = "")

  public String getCaCRegNo() {
    return caCRegNo;
  }


  public void setCaCRegNo(String caCRegNo) {

    
    
    
    this.caCRegNo = caCRegNo;
  }


  public KybGetTinResponseEntity FIRSTIN(String FIRSTIN) {

    
    
    
    
    this.FIRSTIN = FIRSTIN;
    return this;
  }

   /**
   * Get FIRSTIN
   * @return FIRSTIN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21148119-0001", value = "")

  public String getFIRSTIN() {
    return FIRSTIN;
  }


  public void setFIRSTIN(String FIRSTIN) {

    
    
    
    this.FIRSTIN = FIRSTIN;
  }


  public KybGetTinResponseEntity JITTIN(String JITTIN) {

    
    
    
    
    this.JITTIN = JITTIN;
    return this;
  }

   /**
   * Get JITTIN
   * @return JITTIN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "N/A", value = "")

  public String getJITTIN() {
    return JITTIN;
  }


  public void setJITTIN(String JITTIN) {

    
    
    
    this.JITTIN = JITTIN;
  }


  public KybGetTinResponseEntity taxOffice(String taxOffice) {

    
    
    
    
    this.taxOffice = taxOffice;
    return this;
  }

   /**
   * Get taxOffice
   * @return taxOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MSTO IKOYI", value = "")

  public String getTaxOffice() {
    return taxOffice;
  }


  public void setTaxOffice(String taxOffice) {

    
    
    
    this.taxOffice = taxOffice;
  }


  public KybGetTinResponseEntity phoneNo(String phoneNo) {

    
    
    
    
    this.phoneNo = phoneNo;
    return this;
  }

   /**
   * Get phoneNo
   * @return phoneNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sundayoguntola@hotmail.com", value = "")

  public String getPhoneNo() {
    return phoneNo;
  }


  public void setPhoneNo(String phoneNo) {

    
    
    
    this.phoneNo = phoneNo;
  }


  public KybGetTinResponseEntity email(String email) {

    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "07055427676", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {

    
    
    
    this.email = email;
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
   * @return the KybGetTinResponseEntity instance itself
   */
  public KybGetTinResponseEntity putAdditionalProperty(String key, Object value) {
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
    KybGetTinResponseEntity kybGetTinResponseEntity = (KybGetTinResponseEntity) o;
    return Objects.equals(this.search, kybGetTinResponseEntity.search) &&
        Objects.equals(this.taxpayerName, kybGetTinResponseEntity.taxpayerName) &&
        Objects.equals(this.caCRegNo, kybGetTinResponseEntity.caCRegNo) &&
        Objects.equals(this.FIRSTIN, kybGetTinResponseEntity.FIRSTIN) &&
        Objects.equals(this.JITTIN, kybGetTinResponseEntity.JITTIN) &&
        Objects.equals(this.taxOffice, kybGetTinResponseEntity.taxOffice) &&
        Objects.equals(this.phoneNo, kybGetTinResponseEntity.phoneNo) &&
        Objects.equals(this.email, kybGetTinResponseEntity.email)&&
        Objects.equals(this.additionalProperties, kybGetTinResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search, taxpayerName, caCRegNo, FIRSTIN, JITTIN, taxOffice, phoneNo, email, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KybGetTinResponseEntity {\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    taxpayerName: ").append(toIndentedString(taxpayerName)).append("\n");
    sb.append("    caCRegNo: ").append(toIndentedString(caCRegNo)).append("\n");
    sb.append("    FIRSTIN: ").append(toIndentedString(FIRSTIN)).append("\n");
    sb.append("    JITTIN: ").append(toIndentedString(JITTIN)).append("\n");
    sb.append("    taxOffice: ").append(toIndentedString(taxOffice)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("Search");
    openapiFields.add("Taxpayer_Name");
    openapiFields.add("CAC_Reg_No");
    openapiFields.add("FIRSTIN");
    openapiFields.add("JITTIN");
    openapiFields.add("Tax_Office");
    openapiFields.add("Phone_No");
    openapiFields.add("Email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KybGetTinResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KybGetTinResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KybGetTinResponseEntity is not found in the empty JSON string", KybGetTinResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("Search") != null && !jsonObj.get("Search").isJsonNull()) && !jsonObj.get("Search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Search").toString()));
      }
      if ((jsonObj.get("Taxpayer_Name") != null && !jsonObj.get("Taxpayer_Name").isJsonNull()) && !jsonObj.get("Taxpayer_Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Taxpayer_Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Taxpayer_Name").toString()));
      }
      if ((jsonObj.get("CAC_Reg_No") != null && !jsonObj.get("CAC_Reg_No").isJsonNull()) && !jsonObj.get("CAC_Reg_No").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CAC_Reg_No` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CAC_Reg_No").toString()));
      }
      if ((jsonObj.get("FIRSTIN") != null && !jsonObj.get("FIRSTIN").isJsonNull()) && !jsonObj.get("FIRSTIN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FIRSTIN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FIRSTIN").toString()));
      }
      if ((jsonObj.get("JITTIN") != null && !jsonObj.get("JITTIN").isJsonNull()) && !jsonObj.get("JITTIN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JITTIN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JITTIN").toString()));
      }
      if ((jsonObj.get("Tax_Office") != null && !jsonObj.get("Tax_Office").isJsonNull()) && !jsonObj.get("Tax_Office").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tax_Office` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Tax_Office").toString()));
      }
      if ((jsonObj.get("Phone_No") != null && !jsonObj.get("Phone_No").isJsonNull()) && !jsonObj.get("Phone_No").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Phone_No` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Phone_No").toString()));
      }
      if ((jsonObj.get("Email") != null && !jsonObj.get("Email").isJsonNull()) && !jsonObj.get("Email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KybGetTinResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KybGetTinResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KybGetTinResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KybGetTinResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<KybGetTinResponseEntity>() {
           @Override
           public void write(JsonWriter out, KybGetTinResponseEntity value) throws IOException {
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
           public KybGetTinResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             KybGetTinResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of KybGetTinResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KybGetTinResponseEntity
  * @throws IOException if the JSON string is invalid with respect to KybGetTinResponseEntity
  */
  public static KybGetTinResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KybGetTinResponseEntity.class);
  }

 /**
  * Convert an instance of KybGetTinResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
