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

import com.konfigthis.dojah.client.JSON;

/**
 * CollectTransactionsRequestTransactionsInner
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CollectTransactionsRequestTransactionsInner {
  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transaction_date";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private String transactionDate;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transaction_amount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private String transactionAmount;

  public static final String SERIALIZED_NAME_TRANSACTION_DESCRIPTION = "transaction_description";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DESCRIPTION)
  private String transactionDescription;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "reference_number";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public CollectTransactionsRequestTransactionsInner() {
  }

  public CollectTransactionsRequestTransactionsInner transactionDate(String transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-30", value = "")

  public String getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  public CollectTransactionsRequestTransactionsInner transactionAmount(String transactionAmount) {
    
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * Get transactionAmount
   * @return transactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016.4", value = "")

  public String getTransactionAmount() {
    return transactionAmount;
  }


  public void setTransactionAmount(String transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  public CollectTransactionsRequestTransactionsInner transactionDescription(String transactionDescription) {
    
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0033199479:Int.Pd:01-04-2021 to 30-04-2 |", value = "")

  public String getTransactionDescription() {
    return transactionDescription;
  }


  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }


  public CollectTransactionsRequestTransactionsInner transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "credit", value = "")

  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public CollectTransactionsRequestTransactionsInner referenceNumber(String referenceNumber) {
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345tgfnde9000", value = "")

  public String getReferenceNumber() {
    return referenceNumber;
  }


  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
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
   * @return the CollectTransactionsRequestTransactionsInner instance itself
   */
  public CollectTransactionsRequestTransactionsInner putAdditionalProperty(String key, Object value) {
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
    CollectTransactionsRequestTransactionsInner collectTransactionsRequestTransactionsInner = (CollectTransactionsRequestTransactionsInner) o;
    return Objects.equals(this.transactionDate, collectTransactionsRequestTransactionsInner.transactionDate) &&
        Objects.equals(this.transactionAmount, collectTransactionsRequestTransactionsInner.transactionAmount) &&
        Objects.equals(this.transactionDescription, collectTransactionsRequestTransactionsInner.transactionDescription) &&
        Objects.equals(this.transactionType, collectTransactionsRequestTransactionsInner.transactionType) &&
        Objects.equals(this.referenceNumber, collectTransactionsRequestTransactionsInner.referenceNumber)&&
        Objects.equals(this.additionalProperties, collectTransactionsRequestTransactionsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDate, transactionAmount, transactionDescription, transactionType, referenceNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectTransactionsRequestTransactionsInner {\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
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
    openapiFields.add("transaction_date");
    openapiFields.add("transaction_amount");
    openapiFields.add("transaction_description");
    openapiFields.add("transaction_type");
    openapiFields.add("reference_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CollectTransactionsRequestTransactionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CollectTransactionsRequestTransactionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollectTransactionsRequestTransactionsInner is not found in the empty JSON string", CollectTransactionsRequestTransactionsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("transaction_date") != null && !jsonObj.get("transaction_date").isJsonNull()) && !jsonObj.get("transaction_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_date").toString()));
      }
      if ((jsonObj.get("transaction_amount") != null && !jsonObj.get("transaction_amount").isJsonNull()) && !jsonObj.get("transaction_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_amount").toString()));
      }
      if ((jsonObj.get("transaction_description") != null && !jsonObj.get("transaction_description").isJsonNull()) && !jsonObj.get("transaction_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_description").toString()));
      }
      if ((jsonObj.get("transaction_type") != null && !jsonObj.get("transaction_type").isJsonNull()) && !jsonObj.get("transaction_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_type").toString()));
      }
      if ((jsonObj.get("reference_number") != null && !jsonObj.get("reference_number").isJsonNull()) && !jsonObj.get("reference_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollectTransactionsRequestTransactionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollectTransactionsRequestTransactionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollectTransactionsRequestTransactionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollectTransactionsRequestTransactionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CollectTransactionsRequestTransactionsInner>() {
           @Override
           public void write(JsonWriter out, CollectTransactionsRequestTransactionsInner value) throws IOException {
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
           public CollectTransactionsRequestTransactionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CollectTransactionsRequestTransactionsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CollectTransactionsRequestTransactionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollectTransactionsRequestTransactionsInner
  * @throws IOException if the JSON string is invalid with respect to CollectTransactionsRequestTransactionsInner
  */
  public static CollectTransactionsRequestTransactionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollectTransactionsRequestTransactionsInner.class);
  }

 /**
  * Convert an instance of CollectTransactionsRequestTransactionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
