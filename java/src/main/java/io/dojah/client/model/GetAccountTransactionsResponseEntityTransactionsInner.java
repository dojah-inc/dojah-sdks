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
 * GetAccountTransactionsResponseEntityTransactionsInner
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetAccountTransactionsResponseEntityTransactionsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transaction_date";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private String transactionDate;

  public static final String SERIALIZED_NAME_VALUE_DATE = "value_date";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE)
  private String valueDate;

  public static final String SERIALIZED_NAME_TRANS_TYPE = "trans_type";
  @SerializedName(SERIALIZED_NAME_TRANS_TYPE)
  private String transType;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_NARRATION = "narration";
  @SerializedName(SERIALIZED_NAME_NARRATION)
  private String narration;

  public GetAccountTransactionsResponseEntityTransactionsInner() {
  }

  public GetAccountTransactionsResponseEntityTransactionsInner id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1870", value = "")

  public BigDecimal getId() {
    return id;
  }


  public void setId(BigDecimal id) {
    this.id = id;
  }


  public GetAccountTransactionsResponseEntityTransactionsInner transactionDate(String transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-28", value = "")

  public String getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  public GetAccountTransactionsResponseEntityTransactionsInner valueDate(String valueDate) {
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Get valueDate
   * @return valueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-28", value = "")

  public String getValueDate() {
    return valueDate;
  }


  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  public GetAccountTransactionsResponseEntityTransactionsInner transType(String transType) {
    
    this.transType = transType;
    return this;
  }

   /**
   * Get transType
   * @return transType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "debit", value = "")

  public String getTransType() {
    return transType;
  }


  public void setTransType(String transType) {
    this.transType = transType;
  }


  public GetAccountTransactionsResponseEntityTransactionsInner bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Guaranty Trust Bank", value = "")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public GetAccountTransactionsResponseEntityTransactionsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.87", value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetAccountTransactionsResponseEntityTransactionsInner reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public GetAccountTransactionsResponseEntityTransactionsInner narration(String narration) {
    
    this.narration = narration;
    return this;
  }

   /**
   * Get narration
   * @return narration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VALUE ADDED TAX 000013200928140356000182528304 VAT ON NIP TRANSFER FOR 000013200928140356000182528304 via GTWORLD TO KMB/OLUWATOBILOBA OLOLADE ReF:GW492440265000000100002009281402", value = "")

  public String getNarration() {
    return narration;
  }


  public void setNarration(String narration) {
    this.narration = narration;
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
   * @return the GetAccountTransactionsResponseEntityTransactionsInner instance itself
   */
  public GetAccountTransactionsResponseEntityTransactionsInner putAdditionalProperty(String key, Object value) {
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
    GetAccountTransactionsResponseEntityTransactionsInner getAccountTransactionsResponseEntityTransactionsInner = (GetAccountTransactionsResponseEntityTransactionsInner) o;
    return Objects.equals(this.id, getAccountTransactionsResponseEntityTransactionsInner.id) &&
        Objects.equals(this.transactionDate, getAccountTransactionsResponseEntityTransactionsInner.transactionDate) &&
        Objects.equals(this.valueDate, getAccountTransactionsResponseEntityTransactionsInner.valueDate) &&
        Objects.equals(this.transType, getAccountTransactionsResponseEntityTransactionsInner.transType) &&
        Objects.equals(this.bankName, getAccountTransactionsResponseEntityTransactionsInner.bankName) &&
        Objects.equals(this.amount, getAccountTransactionsResponseEntityTransactionsInner.amount) &&
        Objects.equals(this.reference, getAccountTransactionsResponseEntityTransactionsInner.reference) &&
        Objects.equals(this.narration, getAccountTransactionsResponseEntityTransactionsInner.narration)&&
        Objects.equals(this.additionalProperties, getAccountTransactionsResponseEntityTransactionsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionDate, valueDate, transType, bankName, amount, reference, narration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransactionsResponseEntityTransactionsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    transType: ").append(toIndentedString(transType)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    narration: ").append(toIndentedString(narration)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("transaction_date");
    openapiFields.add("value_date");
    openapiFields.add("trans_type");
    openapiFields.add("bank_name");
    openapiFields.add("amount");
    openapiFields.add("reference");
    openapiFields.add("narration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAccountTransactionsResponseEntityTransactionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetAccountTransactionsResponseEntityTransactionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccountTransactionsResponseEntityTransactionsInner is not found in the empty JSON string", GetAccountTransactionsResponseEntityTransactionsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("transaction_date") != null && !jsonObj.get("transaction_date").isJsonNull()) && !jsonObj.get("transaction_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_date").toString()));
      }
      if ((jsonObj.get("value_date") != null && !jsonObj.get("value_date").isJsonNull()) && !jsonObj.get("value_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value_date").toString()));
      }
      if ((jsonObj.get("trans_type") != null && !jsonObj.get("trans_type").isJsonNull()) && !jsonObj.get("trans_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_type").toString()));
      }
      if ((jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonNull()) && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("narration") != null && !jsonObj.get("narration").isJsonNull()) && !jsonObj.get("narration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `narration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("narration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccountTransactionsResponseEntityTransactionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccountTransactionsResponseEntityTransactionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccountTransactionsResponseEntityTransactionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccountTransactionsResponseEntityTransactionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccountTransactionsResponseEntityTransactionsInner>() {
           @Override
           public void write(JsonWriter out, GetAccountTransactionsResponseEntityTransactionsInner value) throws IOException {
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
           public GetAccountTransactionsResponseEntityTransactionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetAccountTransactionsResponseEntityTransactionsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetAccountTransactionsResponseEntityTransactionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAccountTransactionsResponseEntityTransactionsInner
  * @throws IOException if the JSON string is invalid with respect to GetAccountTransactionsResponseEntityTransactionsInner
  */
  public static GetAccountTransactionsResponseEntityTransactionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccountTransactionsResponseEntityTransactionsInner.class);
  }

 /**
  * Convert an instance of GetAccountTransactionsResponseEntityTransactionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

