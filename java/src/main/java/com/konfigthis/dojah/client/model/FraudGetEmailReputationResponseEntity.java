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
import com.konfigthis.dojah.client.model.FraudGetEmailReputationResponseEntityBreachDetails;
import com.konfigthis.dojah.client.model.FraudGetEmailReputationResponseEntityDetails;
import com.konfigthis.dojah.client.model.FraudGetEmailReputationResponseEntityDomainDetails;
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
 * FraudGetEmailReputationResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FraudGetEmailReputationResponseEntity {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_REPUTATION = "reputation";
  @SerializedName(SERIALIZED_NAME_REPUTATION)
  private String reputation;

  public static final String SERIALIZED_NAME_SUSPICIOUS = "suspicious";
  @SerializedName(SERIALIZED_NAME_SUSPICIOUS)
  private Boolean suspicious;

  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private Double references;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private FraudGetEmailReputationResponseEntityDetails details;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_DELIVERABLE = "deliverable";
  @SerializedName(SERIALIZED_NAME_DELIVERABLE)
  private Boolean deliverable;

  public static final String SERIALIZED_NAME_DOMAIN_DETAILS = "domain_details";
  @SerializedName(SERIALIZED_NAME_DOMAIN_DETAILS)
  private FraudGetEmailReputationResponseEntityDomainDetails domainDetails;

  public static final String SERIALIZED_NAME_BREACH_DETAILS = "breach_details";
  @SerializedName(SERIALIZED_NAME_BREACH_DETAILS)
  private FraudGetEmailReputationResponseEntityBreachDetails breachDetails;

  public static final String SERIALIZED_NAME_ACCOUNT_DETAILS_REGISTERED = "account_details_registered";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DETAILS_REGISTERED)
  private List<String> accountDetailsRegistered = null;

  public FraudGetEmailReputationResponseEntity() {
  }

  public FraudGetEmailReputationResponseEntity email(String email) {

    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "johndoe@gmail.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {

    
    
    
    this.email = email;
  }


  public FraudGetEmailReputationResponseEntity reputation(String reputation) {

    
    
    
    
    this.reputation = reputation;
    return this;
  }

   /**
   * Get reputation
   * @return reputation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "high", value = "")

  public String getReputation() {
    return reputation;
  }


  public void setReputation(String reputation) {

    
    
    
    this.reputation = reputation;
  }


  public FraudGetEmailReputationResponseEntity suspicious(Boolean suspicious) {

    
    
    
    
    this.suspicious = suspicious;
    return this;
  }

   /**
   * Get suspicious
   * @return suspicious
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSuspicious() {
    return suspicious;
  }


  public void setSuspicious(Boolean suspicious) {

    
    
    
    this.suspicious = suspicious;
  }


  public FraudGetEmailReputationResponseEntity references(Double references) {

    
    
    
    
    this.references = references;
    return this;
  }

  public FraudGetEmailReputationResponseEntity references(Integer references) {

    
    
    
    
    this.references = references.doubleValue();
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "178", value = "")

  public Double getReferences() {
    return references;
  }


  public void setReferences(Double references) {

    
    
    
    this.references = references;
  }


  public FraudGetEmailReputationResponseEntity details(FraudGetEmailReputationResponseEntityDetails details) {

    
    
    
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudGetEmailReputationResponseEntityDetails getDetails() {
    return details;
  }


  public void setDetails(FraudGetEmailReputationResponseEntityDetails details) {

    
    
    
    this.details = details;
  }


  public FraudGetEmailReputationResponseEntity score(Double score) {

    
    
    
    
    this.score = score;
    return this;
  }

  public FraudGetEmailReputationResponseEntity score(Integer score) {

    
    
    
    
    this.score = score.doubleValue();
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Double getScore() {
    return score;
  }


  public void setScore(Double score) {

    
    
    
    this.score = score;
  }


  public FraudGetEmailReputationResponseEntity deliverable(Boolean deliverable) {

    
    
    
    
    this.deliverable = deliverable;
    return this;
  }

   /**
   * Get deliverable
   * @return deliverable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getDeliverable() {
    return deliverable;
  }


  public void setDeliverable(Boolean deliverable) {

    
    
    
    this.deliverable = deliverable;
  }


  public FraudGetEmailReputationResponseEntity domainDetails(FraudGetEmailReputationResponseEntityDomainDetails domainDetails) {

    
    
    
    
    this.domainDetails = domainDetails;
    return this;
  }

   /**
   * Get domainDetails
   * @return domainDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudGetEmailReputationResponseEntityDomainDetails getDomainDetails() {
    return domainDetails;
  }


  public void setDomainDetails(FraudGetEmailReputationResponseEntityDomainDetails domainDetails) {

    
    
    
    this.domainDetails = domainDetails;
  }


  public FraudGetEmailReputationResponseEntity breachDetails(FraudGetEmailReputationResponseEntityBreachDetails breachDetails) {

    
    
    
    
    this.breachDetails = breachDetails;
    return this;
  }

   /**
   * Get breachDetails
   * @return breachDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudGetEmailReputationResponseEntityBreachDetails getBreachDetails() {
    return breachDetails;
  }


  public void setBreachDetails(FraudGetEmailReputationResponseEntityBreachDetails breachDetails) {

    
    
    
    this.breachDetails = breachDetails;
  }


  public FraudGetEmailReputationResponseEntity accountDetailsRegistered(List<String> accountDetailsRegistered) {

    
    
    
    
    this.accountDetailsRegistered = accountDetailsRegistered;
    return this;
  }

  public FraudGetEmailReputationResponseEntity addAccountDetailsRegisteredItem(String accountDetailsRegisteredItem) {
    if (this.accountDetailsRegistered == null) {
      this.accountDetailsRegistered = new ArrayList<>();
    }
    this.accountDetailsRegistered.add(accountDetailsRegisteredItem);
    return this;
  }

   /**
   * Get accountDetailsRegistered
   * @return accountDetailsRegistered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAccountDetailsRegistered() {
    return accountDetailsRegistered;
  }


  public void setAccountDetailsRegistered(List<String> accountDetailsRegistered) {

    
    
    
    this.accountDetailsRegistered = accountDetailsRegistered;
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
   * @return the FraudGetEmailReputationResponseEntity instance itself
   */
  public FraudGetEmailReputationResponseEntity putAdditionalProperty(String key, Object value) {
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
    FraudGetEmailReputationResponseEntity fraudGetEmailReputationResponseEntity = (FraudGetEmailReputationResponseEntity) o;
    return Objects.equals(this.email, fraudGetEmailReputationResponseEntity.email) &&
        Objects.equals(this.reputation, fraudGetEmailReputationResponseEntity.reputation) &&
        Objects.equals(this.suspicious, fraudGetEmailReputationResponseEntity.suspicious) &&
        Objects.equals(this.references, fraudGetEmailReputationResponseEntity.references) &&
        Objects.equals(this.details, fraudGetEmailReputationResponseEntity.details) &&
        Objects.equals(this.score, fraudGetEmailReputationResponseEntity.score) &&
        Objects.equals(this.deliverable, fraudGetEmailReputationResponseEntity.deliverable) &&
        Objects.equals(this.domainDetails, fraudGetEmailReputationResponseEntity.domainDetails) &&
        Objects.equals(this.breachDetails, fraudGetEmailReputationResponseEntity.breachDetails) &&
        Objects.equals(this.accountDetailsRegistered, fraudGetEmailReputationResponseEntity.accountDetailsRegistered)&&
        Objects.equals(this.additionalProperties, fraudGetEmailReputationResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, reputation, suspicious, references, details, score, deliverable, domainDetails, breachDetails, accountDetailsRegistered, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudGetEmailReputationResponseEntity {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    suspicious: ").append(toIndentedString(suspicious)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    deliverable: ").append(toIndentedString(deliverable)).append("\n");
    sb.append("    domainDetails: ").append(toIndentedString(domainDetails)).append("\n");
    sb.append("    breachDetails: ").append(toIndentedString(breachDetails)).append("\n");
    sb.append("    accountDetailsRegistered: ").append(toIndentedString(accountDetailsRegistered)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("reputation");
    openapiFields.add("suspicious");
    openapiFields.add("references");
    openapiFields.add("details");
    openapiFields.add("score");
    openapiFields.add("deliverable");
    openapiFields.add("domain_details");
    openapiFields.add("breach_details");
    openapiFields.add("account_details_registered");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudGetEmailReputationResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FraudGetEmailReputationResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudGetEmailReputationResponseEntity is not found in the empty JSON string", FraudGetEmailReputationResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("reputation") != null && !jsonObj.get("reputation").isJsonNull()) && !jsonObj.get("reputation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reputation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reputation").toString()));
      }
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        FraudGetEmailReputationResponseEntityDetails.validateJsonObject(jsonObj.getAsJsonObject("details"));
      }
      // validate the optional field `domain_details`
      if (jsonObj.get("domain_details") != null && !jsonObj.get("domain_details").isJsonNull()) {
        FraudGetEmailReputationResponseEntityDomainDetails.validateJsonObject(jsonObj.getAsJsonObject("domain_details"));
      }
      // validate the optional field `breach_details`
      if (jsonObj.get("breach_details") != null && !jsonObj.get("breach_details").isJsonNull()) {
        FraudGetEmailReputationResponseEntityBreachDetails.validateJsonObject(jsonObj.getAsJsonObject("breach_details"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("account_details_registered") != null && !jsonObj.get("account_details_registered").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_details_registered` to be an array in the JSON string but got `%s`", jsonObj.get("account_details_registered").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudGetEmailReputationResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudGetEmailReputationResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudGetEmailReputationResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudGetEmailReputationResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudGetEmailReputationResponseEntity>() {
           @Override
           public void write(JsonWriter out, FraudGetEmailReputationResponseEntity value) throws IOException {
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
           public FraudGetEmailReputationResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FraudGetEmailReputationResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FraudGetEmailReputationResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudGetEmailReputationResponseEntity
  * @throws IOException if the JSON string is invalid with respect to FraudGetEmailReputationResponseEntity
  */
  public static FraudGetEmailReputationResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudGetEmailReputationResponseEntity.class);
  }

 /**
  * Convert an instance of FraudGetEmailReputationResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

