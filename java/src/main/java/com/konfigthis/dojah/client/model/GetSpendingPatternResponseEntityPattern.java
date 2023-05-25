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


package com.konfigthis.dojah.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.dojah.client.model.GetSpendingPatternResponseEntityPatternAirtimeData;
import com.konfigthis.dojah.client.model.GetSpendingPatternResponseEntityPatternBankTransfer;
import com.konfigthis.dojah.client.model.GetSpendingPatternResponseEntityPatternCharges;
import com.konfigthis.dojah.client.model.GetSpendingPatternResponseEntityPatternFood;
import com.konfigthis.dojah.client.model.GetSpendingPatternResponseEntityPatternOthers;
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
 * GetSpendingPatternResponseEntityPattern
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetSpendingPatternResponseEntityPattern {
  public static final String SERIALIZED_NAME_OTHERS = "Others";
  @SerializedName(SERIALIZED_NAME_OTHERS)
  private GetSpendingPatternResponseEntityPatternOthers others;

  public static final String SERIALIZED_NAME_FOOD = "Food";
  @SerializedName(SERIALIZED_NAME_FOOD)
  private GetSpendingPatternResponseEntityPatternFood food;

  public static final String SERIALIZED_NAME_AIRTIME_DATA = "Airtime/Data";
  @SerializedName(SERIALIZED_NAME_AIRTIME_DATA)
  private GetSpendingPatternResponseEntityPatternAirtimeData airtimeData;

  public static final String SERIALIZED_NAME_BANK_TRANSFER = "Bank Transfer";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER)
  private GetSpendingPatternResponseEntityPatternBankTransfer bankTransfer;

  public static final String SERIALIZED_NAME_CHARGES = "Charges";
  @SerializedName(SERIALIZED_NAME_CHARGES)
  private GetSpendingPatternResponseEntityPatternCharges charges;

  public GetSpendingPatternResponseEntityPattern() {
  }

  public GetSpendingPatternResponseEntityPattern others(GetSpendingPatternResponseEntityPatternOthers others) {

    
    
    
    
    this.others = others;
    return this;
  }

   /**
   * Get others
   * @return others
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSpendingPatternResponseEntityPatternOthers getOthers() {
    return others;
  }


  public void setOthers(GetSpendingPatternResponseEntityPatternOthers others) {

    
    
    
    this.others = others;
  }


  public GetSpendingPatternResponseEntityPattern food(GetSpendingPatternResponseEntityPatternFood food) {

    
    
    
    
    this.food = food;
    return this;
  }

   /**
   * Get food
   * @return food
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSpendingPatternResponseEntityPatternFood getFood() {
    return food;
  }


  public void setFood(GetSpendingPatternResponseEntityPatternFood food) {

    
    
    
    this.food = food;
  }


  public GetSpendingPatternResponseEntityPattern airtimeData(GetSpendingPatternResponseEntityPatternAirtimeData airtimeData) {

    
    
    
    
    this.airtimeData = airtimeData;
    return this;
  }

   /**
   * Get airtimeData
   * @return airtimeData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSpendingPatternResponseEntityPatternAirtimeData getAirtimeData() {
    return airtimeData;
  }


  public void setAirtimeData(GetSpendingPatternResponseEntityPatternAirtimeData airtimeData) {

    
    
    
    this.airtimeData = airtimeData;
  }


  public GetSpendingPatternResponseEntityPattern bankTransfer(GetSpendingPatternResponseEntityPatternBankTransfer bankTransfer) {

    
    
    
    
    this.bankTransfer = bankTransfer;
    return this;
  }

   /**
   * Get bankTransfer
   * @return bankTransfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSpendingPatternResponseEntityPatternBankTransfer getBankTransfer() {
    return bankTransfer;
  }


  public void setBankTransfer(GetSpendingPatternResponseEntityPatternBankTransfer bankTransfer) {

    
    
    
    this.bankTransfer = bankTransfer;
  }


  public GetSpendingPatternResponseEntityPattern charges(GetSpendingPatternResponseEntityPatternCharges charges) {

    
    
    
    
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSpendingPatternResponseEntityPatternCharges getCharges() {
    return charges;
  }


  public void setCharges(GetSpendingPatternResponseEntityPatternCharges charges) {

    
    
    
    this.charges = charges;
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
   * @return the GetSpendingPatternResponseEntityPattern instance itself
   */
  public GetSpendingPatternResponseEntityPattern putAdditionalProperty(String key, Object value) {
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
    GetSpendingPatternResponseEntityPattern getSpendingPatternResponseEntityPattern = (GetSpendingPatternResponseEntityPattern) o;
    return Objects.equals(this.others, getSpendingPatternResponseEntityPattern.others) &&
        Objects.equals(this.food, getSpendingPatternResponseEntityPattern.food) &&
        Objects.equals(this.airtimeData, getSpendingPatternResponseEntityPattern.airtimeData) &&
        Objects.equals(this.bankTransfer, getSpendingPatternResponseEntityPattern.bankTransfer) &&
        Objects.equals(this.charges, getSpendingPatternResponseEntityPattern.charges)&&
        Objects.equals(this.additionalProperties, getSpendingPatternResponseEntityPattern.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(others, food, airtimeData, bankTransfer, charges, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSpendingPatternResponseEntityPattern {\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
    sb.append("    food: ").append(toIndentedString(food)).append("\n");
    sb.append("    airtimeData: ").append(toIndentedString(airtimeData)).append("\n");
    sb.append("    bankTransfer: ").append(toIndentedString(bankTransfer)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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
    openapiFields.add("Others");
    openapiFields.add("Food");
    openapiFields.add("Airtime/Data");
    openapiFields.add("Bank Transfer");
    openapiFields.add("Charges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetSpendingPatternResponseEntityPattern
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetSpendingPatternResponseEntityPattern.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSpendingPatternResponseEntityPattern is not found in the empty JSON string", GetSpendingPatternResponseEntityPattern.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `Others`
      if (jsonObj.get("Others") != null && !jsonObj.get("Others").isJsonNull()) {
        GetSpendingPatternResponseEntityPatternOthers.validateJsonObject(jsonObj.getAsJsonObject("Others"));
      }
      // validate the optional field `Food`
      if (jsonObj.get("Food") != null && !jsonObj.get("Food").isJsonNull()) {
        GetSpendingPatternResponseEntityPatternFood.validateJsonObject(jsonObj.getAsJsonObject("Food"));
      }
      // validate the optional field `Airtime/Data`
      if (jsonObj.get("Airtime/Data") != null && !jsonObj.get("Airtime/Data").isJsonNull()) {
        GetSpendingPatternResponseEntityPatternAirtimeData.validateJsonObject(jsonObj.getAsJsonObject("Airtime/Data"));
      }
      // validate the optional field `Bank Transfer`
      if (jsonObj.get("Bank Transfer") != null && !jsonObj.get("Bank Transfer").isJsonNull()) {
        GetSpendingPatternResponseEntityPatternBankTransfer.validateJsonObject(jsonObj.getAsJsonObject("Bank Transfer"));
      }
      // validate the optional field `Charges`
      if (jsonObj.get("Charges") != null && !jsonObj.get("Charges").isJsonNull()) {
        GetSpendingPatternResponseEntityPatternCharges.validateJsonObject(jsonObj.getAsJsonObject("Charges"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSpendingPatternResponseEntityPattern.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSpendingPatternResponseEntityPattern' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSpendingPatternResponseEntityPattern> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSpendingPatternResponseEntityPattern.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSpendingPatternResponseEntityPattern>() {
           @Override
           public void write(JsonWriter out, GetSpendingPatternResponseEntityPattern value) throws IOException {
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
           public GetSpendingPatternResponseEntityPattern read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetSpendingPatternResponseEntityPattern instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetSpendingPatternResponseEntityPattern given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSpendingPatternResponseEntityPattern
  * @throws IOException if the JSON string is invalid with respect to GetSpendingPatternResponseEntityPattern
  */
  public static GetSpendingPatternResponseEntityPattern fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSpendingPatternResponseEntityPattern.class);
  }

 /**
  * Convert an instance of GetSpendingPatternResponseEntityPattern to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

