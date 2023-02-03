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
 * GetAccountResponse
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetAccountResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_BVN = "bvn";
  @SerializedName(SERIALIZED_NAME_BVN)
  private String bvn;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private String accountStatus;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public GetAccountResponse() {
  }

  public GetAccountResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SALIU, MOSHOOD KOLAWOLE", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetAccountResponse accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0150927834", value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public GetAccountResponse bvn(String bvn) {
    
    this.bvn = bvn;
    return this;
  }

   /**
   * Get bvn
   * @return bvn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5556", value = "")

  public String getBvn() {
    return bvn;
  }


  public void setBvn(String bvn) {
    this.bvn = bvn;
  }


  public GetAccountResponse accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GT Crea8-e-savers", value = "")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public GetAccountResponse currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Naira", value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public GetAccountResponse accountStatus(String accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Active", value = "")

  public String getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


  public GetAccountResponse balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34,976.80", value = "")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    this.balance = balance;
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
   * @return the GetAccountResponse instance itself
   */
  public GetAccountResponse putAdditionalProperty(String key, Object value) {
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
    GetAccountResponse getAccountResponse = (GetAccountResponse) o;
    return Objects.equals(this.name, getAccountResponse.name) &&
        Objects.equals(this.accountNumber, getAccountResponse.accountNumber) &&
        Objects.equals(this.bvn, getAccountResponse.bvn) &&
        Objects.equals(this.accountType, getAccountResponse.accountType) &&
        Objects.equals(this.currency, getAccountResponse.currency) &&
        Objects.equals(this.accountStatus, getAccountResponse.accountStatus) &&
        Objects.equals(this.balance, getAccountResponse.balance)&&
        Objects.equals(this.additionalProperties, getAccountResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountNumber, bvn, accountType, currency, accountStatus, balance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bvn: ").append(toIndentedString(bvn)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("account_number");
    openapiFields.add("bvn");
    openapiFields.add("account_type");
    openapiFields.add("currency");
    openapiFields.add("account_status");
    openapiFields.add("balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAccountResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetAccountResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccountResponse is not found in the empty JSON string", GetAccountResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("bvn") != null && !jsonObj.get("bvn").isJsonNull()) && !jsonObj.get("bvn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bvn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bvn").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      if ((jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonNull()) && !jsonObj.get("balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccountResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccountResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccountResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccountResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccountResponse>() {
           @Override
           public void write(JsonWriter out, GetAccountResponse value) throws IOException {
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
           public GetAccountResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetAccountResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetAccountResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAccountResponse
  * @throws IOException if the JSON string is invalid with respect to GetAccountResponse
  */
  public static GetAccountResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccountResponse.class);
  }

 /**
  * Convert an instance of GetAccountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

