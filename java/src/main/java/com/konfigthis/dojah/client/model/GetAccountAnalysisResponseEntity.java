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
import com.konfigthis.dojah.client.model.GetAccountAnalysisResponseEntityAccountBreakdown;
import com.konfigthis.dojah.client.model.GetAccountAnalysisResponseEntityExpenseBreakdown;
import com.konfigthis.dojah.client.model.GetAccountAnalysisResponseEntityFundsManagement;
import com.konfigthis.dojah.client.model.GetAccountAnalysisResponseEntityInflowBreakdown;
import com.konfigthis.dojah.client.model.GetAccountAnalysisResponseEntityTransactionRoutineBreakdown;
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

import com.konfigthis.dojah.client.JSON;

/**
 * GetAccountAnalysisResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetAccountAnalysisResponseEntity {
  public static final String SERIALIZED_NAME_ACCOUNT_BREAKDOWN = "accountBreakdown";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BREAKDOWN)
  private GetAccountAnalysisResponseEntityAccountBreakdown accountBreakdown;

  public static final String SERIALIZED_NAME_EXPENSE_BREAKDOWN = "expenseBreakdown";
  @SerializedName(SERIALIZED_NAME_EXPENSE_BREAKDOWN)
  private GetAccountAnalysisResponseEntityExpenseBreakdown expenseBreakdown;

  public static final String SERIALIZED_NAME_FUNDS_MANAGEMENT = "fundsManagement";
  @SerializedName(SERIALIZED_NAME_FUNDS_MANAGEMENT)
  private GetAccountAnalysisResponseEntityFundsManagement fundsManagement;

  public static final String SERIALIZED_NAME_INFLOW_BREAKDOWN = "inflowBreakdown";
  @SerializedName(SERIALIZED_NAME_INFLOW_BREAKDOWN)
  private GetAccountAnalysisResponseEntityInflowBreakdown inflowBreakdown;

  public static final String SERIALIZED_NAME_TRANSACTION_ROUTINE_BREAKDOWN = "transactionRoutineBreakdown";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ROUTINE_BREAKDOWN)
  private GetAccountAnalysisResponseEntityTransactionRoutineBreakdown transactionRoutineBreakdown;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BigDecimal status;

  public GetAccountAnalysisResponseEntity() {
  }

  public GetAccountAnalysisResponseEntity accountBreakdown(GetAccountAnalysisResponseEntityAccountBreakdown accountBreakdown) {
    
    this.accountBreakdown = accountBreakdown;
    return this;
  }

   /**
   * Get accountBreakdown
   * @return accountBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountAnalysisResponseEntityAccountBreakdown getAccountBreakdown() {
    return accountBreakdown;
  }


  public void setAccountBreakdown(GetAccountAnalysisResponseEntityAccountBreakdown accountBreakdown) {
    this.accountBreakdown = accountBreakdown;
  }


  public GetAccountAnalysisResponseEntity expenseBreakdown(GetAccountAnalysisResponseEntityExpenseBreakdown expenseBreakdown) {
    
    this.expenseBreakdown = expenseBreakdown;
    return this;
  }

   /**
   * Get expenseBreakdown
   * @return expenseBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountAnalysisResponseEntityExpenseBreakdown getExpenseBreakdown() {
    return expenseBreakdown;
  }


  public void setExpenseBreakdown(GetAccountAnalysisResponseEntityExpenseBreakdown expenseBreakdown) {
    this.expenseBreakdown = expenseBreakdown;
  }


  public GetAccountAnalysisResponseEntity fundsManagement(GetAccountAnalysisResponseEntityFundsManagement fundsManagement) {
    
    this.fundsManagement = fundsManagement;
    return this;
  }

   /**
   * Get fundsManagement
   * @return fundsManagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountAnalysisResponseEntityFundsManagement getFundsManagement() {
    return fundsManagement;
  }


  public void setFundsManagement(GetAccountAnalysisResponseEntityFundsManagement fundsManagement) {
    this.fundsManagement = fundsManagement;
  }


  public GetAccountAnalysisResponseEntity inflowBreakdown(GetAccountAnalysisResponseEntityInflowBreakdown inflowBreakdown) {
    
    this.inflowBreakdown = inflowBreakdown;
    return this;
  }

   /**
   * Get inflowBreakdown
   * @return inflowBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountAnalysisResponseEntityInflowBreakdown getInflowBreakdown() {
    return inflowBreakdown;
  }


  public void setInflowBreakdown(GetAccountAnalysisResponseEntityInflowBreakdown inflowBreakdown) {
    this.inflowBreakdown = inflowBreakdown;
  }


  public GetAccountAnalysisResponseEntity transactionRoutineBreakdown(GetAccountAnalysisResponseEntityTransactionRoutineBreakdown transactionRoutineBreakdown) {
    
    this.transactionRoutineBreakdown = transactionRoutineBreakdown;
    return this;
  }

   /**
   * Get transactionRoutineBreakdown
   * @return transactionRoutineBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountAnalysisResponseEntityTransactionRoutineBreakdown getTransactionRoutineBreakdown() {
    return transactionRoutineBreakdown;
  }


  public void setTransactionRoutineBreakdown(GetAccountAnalysisResponseEntityTransactionRoutineBreakdown transactionRoutineBreakdown) {
    this.transactionRoutineBreakdown = transactionRoutineBreakdown;
  }


  public GetAccountAnalysisResponseEntity status(BigDecimal status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "")

  public BigDecimal getStatus() {
    return status;
  }


  public void setStatus(BigDecimal status) {
    this.status = status;
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
   * @return the GetAccountAnalysisResponseEntity instance itself
   */
  public GetAccountAnalysisResponseEntity putAdditionalProperty(String key, Object value) {
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
    GetAccountAnalysisResponseEntity getAccountAnalysisResponseEntity = (GetAccountAnalysisResponseEntity) o;
    return Objects.equals(this.accountBreakdown, getAccountAnalysisResponseEntity.accountBreakdown) &&
        Objects.equals(this.expenseBreakdown, getAccountAnalysisResponseEntity.expenseBreakdown) &&
        Objects.equals(this.fundsManagement, getAccountAnalysisResponseEntity.fundsManagement) &&
        Objects.equals(this.inflowBreakdown, getAccountAnalysisResponseEntity.inflowBreakdown) &&
        Objects.equals(this.transactionRoutineBreakdown, getAccountAnalysisResponseEntity.transactionRoutineBreakdown) &&
        Objects.equals(this.status, getAccountAnalysisResponseEntity.status)&&
        Objects.equals(this.additionalProperties, getAccountAnalysisResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBreakdown, expenseBreakdown, fundsManagement, inflowBreakdown, transactionRoutineBreakdown, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountAnalysisResponseEntity {\n");
    sb.append("    accountBreakdown: ").append(toIndentedString(accountBreakdown)).append("\n");
    sb.append("    expenseBreakdown: ").append(toIndentedString(expenseBreakdown)).append("\n");
    sb.append("    fundsManagement: ").append(toIndentedString(fundsManagement)).append("\n");
    sb.append("    inflowBreakdown: ").append(toIndentedString(inflowBreakdown)).append("\n");
    sb.append("    transactionRoutineBreakdown: ").append(toIndentedString(transactionRoutineBreakdown)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("accountBreakdown");
    openapiFields.add("expenseBreakdown");
    openapiFields.add("fundsManagement");
    openapiFields.add("inflowBreakdown");
    openapiFields.add("transactionRoutineBreakdown");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAccountAnalysisResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetAccountAnalysisResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccountAnalysisResponseEntity is not found in the empty JSON string", GetAccountAnalysisResponseEntity.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `accountBreakdown`
      if (jsonObj.get("accountBreakdown") != null && !jsonObj.get("accountBreakdown").isJsonNull()) {
        GetAccountAnalysisResponseEntityAccountBreakdown.validateJsonObject(jsonObj.getAsJsonObject("accountBreakdown"));
      }
      // validate the optional field `expenseBreakdown`
      if (jsonObj.get("expenseBreakdown") != null && !jsonObj.get("expenseBreakdown").isJsonNull()) {
        GetAccountAnalysisResponseEntityExpenseBreakdown.validateJsonObject(jsonObj.getAsJsonObject("expenseBreakdown"));
      }
      // validate the optional field `fundsManagement`
      if (jsonObj.get("fundsManagement") != null && !jsonObj.get("fundsManagement").isJsonNull()) {
        GetAccountAnalysisResponseEntityFundsManagement.validateJsonObject(jsonObj.getAsJsonObject("fundsManagement"));
      }
      // validate the optional field `inflowBreakdown`
      if (jsonObj.get("inflowBreakdown") != null && !jsonObj.get("inflowBreakdown").isJsonNull()) {
        GetAccountAnalysisResponseEntityInflowBreakdown.validateJsonObject(jsonObj.getAsJsonObject("inflowBreakdown"));
      }
      // validate the optional field `transactionRoutineBreakdown`
      if (jsonObj.get("transactionRoutineBreakdown") != null && !jsonObj.get("transactionRoutineBreakdown").isJsonNull()) {
        GetAccountAnalysisResponseEntityTransactionRoutineBreakdown.validateJsonObject(jsonObj.getAsJsonObject("transactionRoutineBreakdown"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccountAnalysisResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccountAnalysisResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccountAnalysisResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccountAnalysisResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccountAnalysisResponseEntity>() {
           @Override
           public void write(JsonWriter out, GetAccountAnalysisResponseEntity value) throws IOException {
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
           public GetAccountAnalysisResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetAccountAnalysisResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetAccountAnalysisResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAccountAnalysisResponseEntity
  * @throws IOException if the JSON string is invalid with respect to GetAccountAnalysisResponseEntity
  */
  public static GetAccountAnalysisResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccountAnalysisResponseEntity.class);
  }

 /**
  * Convert an instance of GetAccountAnalysisResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
