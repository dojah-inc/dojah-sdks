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
import com.konfigthis.dojah.client.model.GetAccountTransactionsResponseEntityTransactionsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.dojah.client.JSON;

/**
 * GetAccountTransactionsResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetAccountTransactionsResponseEntity {
  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<GetAccountTransactionsResponseEntityTransactionsInner> transactions = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previous_page";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "next_page";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private BigDecimal nextPage;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private BigDecimal totalPages;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private BigDecimal currentPage;

  public GetAccountTransactionsResponseEntity() {
  }

  public GetAccountTransactionsResponseEntity transactions(List<GetAccountTransactionsResponseEntityTransactionsInner> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public GetAccountTransactionsResponseEntity addTransactionsItem(GetAccountTransactionsResponseEntityTransactionsInner transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetAccountTransactionsResponseEntityTransactionsInner> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<GetAccountTransactionsResponseEntityTransactionsInner> transactions) {
    this.transactions = transactions;
  }


  public GetAccountTransactionsResponseEntity total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "521", value = "")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public GetAccountTransactionsResponseEntity previousPage(String previousPage) {
    
    this.previousPage = previousPage;
    return this;
  }

   /**
   * Get previousPage
   * @return previousPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getPreviousPage() {
    return previousPage;
  }


  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }


  public GetAccountTransactionsResponseEntity nextPage(BigDecimal nextPage) {
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public BigDecimal getNextPage() {
    return nextPage;
  }


  public void setNextPage(BigDecimal nextPage) {
    this.nextPage = nextPage;
  }


  public GetAccountTransactionsResponseEntity totalPages(BigDecimal totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "53", value = "")

  public BigDecimal getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(BigDecimal totalPages) {
    this.totalPages = totalPages;
  }


  public GetAccountTransactionsResponseEntity currentPage(BigDecimal currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public BigDecimal getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(BigDecimal currentPage) {
    this.currentPage = currentPage;
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
   * @return the GetAccountTransactionsResponseEntity instance itself
   */
  public GetAccountTransactionsResponseEntity putAdditionalProperty(String key, Object value) {
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
    GetAccountTransactionsResponseEntity getAccountTransactionsResponseEntity = (GetAccountTransactionsResponseEntity) o;
    return Objects.equals(this.transactions, getAccountTransactionsResponseEntity.transactions) &&
        Objects.equals(this.total, getAccountTransactionsResponseEntity.total) &&
        Objects.equals(this.previousPage, getAccountTransactionsResponseEntity.previousPage) &&
        Objects.equals(this.nextPage, getAccountTransactionsResponseEntity.nextPage) &&
        Objects.equals(this.totalPages, getAccountTransactionsResponseEntity.totalPages) &&
        Objects.equals(this.currentPage, getAccountTransactionsResponseEntity.currentPage)&&
        Objects.equals(this.additionalProperties, getAccountTransactionsResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, total, previousPage, nextPage, totalPages, currentPage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransactionsResponseEntity {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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
    openapiFields.add("transactions");
    openapiFields.add("total");
    openapiFields.add("previous_page");
    openapiFields.add("next_page");
    openapiFields.add("total_pages");
    openapiFields.add("current_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAccountTransactionsResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetAccountTransactionsResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccountTransactionsResponseEntity is not found in the empty JSON string", GetAccountTransactionsResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("transactions") != null && !jsonObj.get("transactions").isJsonNull()) {
        JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
        if (jsonArraytransactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
          }

          // validate the optional field `transactions` (array)
          for (int i = 0; i < jsonArraytransactions.size(); i++) {
            GetAccountTransactionsResponseEntityTransactionsInner.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("previous_page") != null && !jsonObj.get("previous_page").isJsonNull()) && !jsonObj.get("previous_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_page").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccountTransactionsResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccountTransactionsResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccountTransactionsResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccountTransactionsResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccountTransactionsResponseEntity>() {
           @Override
           public void write(JsonWriter out, GetAccountTransactionsResponseEntity value) throws IOException {
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
           public GetAccountTransactionsResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetAccountTransactionsResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetAccountTransactionsResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAccountTransactionsResponseEntity
  * @throws IOException if the JSON string is invalid with respect to GetAccountTransactionsResponseEntity
  */
  public static GetAccountTransactionsResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccountTransactionsResponseEntity.class);
  }

 /**
  * Convert an instance of GetAccountTransactionsResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

