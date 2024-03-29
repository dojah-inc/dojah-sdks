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
 * GetVinResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetVinResponseEntity {
  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_VOTER_IDENTIFICATION_NUMBER_COLON = "voter_identification_number:";
  @SerializedName(SERIALIZED_NAME_VOTER_IDENTIFICATION_NUMBER_COLON)
  private String voterIdentificationNumberColon;

  public static final String SERIALIZED_NAME_GENDER_COLON = "gender:";
  @SerializedName(SERIALIZED_NAME_GENDER_COLON)
  private String genderColon;

  public static final String SERIALIZED_NAME_OCCUPATION_COLON = "occupation:";
  @SerializedName(SERIALIZED_NAME_OCCUPATION_COLON)
  private String occupationColon;

  public static final String SERIALIZED_NAME_TIME_OF_REGISTRATION_COLON = "time_of_registration:";
  @SerializedName(SERIALIZED_NAME_TIME_OF_REGISTRATION_COLON)
  private String timeOfRegistrationColon;

  public static final String SERIALIZED_NAME_STATE_COLON = "state:";
  @SerializedName(SERIALIZED_NAME_STATE_COLON)
  private String stateColon;

  public static final String SERIALIZED_NAME_LOCAL_GOVERNMENT_COLON = "local_government:";
  @SerializedName(SERIALIZED_NAME_LOCAL_GOVERNMENT_COLON)
  private String localGovernmentColon;

  public static final String SERIALIZED_NAME_REGISTRATION_AREA_WARD_COLON = "registration_area_ward:";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_AREA_WARD_COLON)
  private String registrationAreaWardColon;

  public static final String SERIALIZED_NAME_POLLING_UNIT_COLON = "polling_unit:";
  @SerializedName(SERIALIZED_NAME_POLLING_UNIT_COLON)
  private String pollingUnitColon;

  public static final String SERIALIZED_NAME_POLLING_UNIT_CODE = "polling_unit_code";
  @SerializedName(SERIALIZED_NAME_POLLING_UNIT_CODE)
  private String pollingUnitCode;

  public GetVinResponseEntity() {
  }

  public GetVinResponseEntity fullName(String fullName) {

    
    
    
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SALIU MOSHOOD KOLAWOLE", value = "")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {

    
    
    
    this.fullName = fullName;
  }


  public GetVinResponseEntity voterIdentificationNumberColon(String voterIdentificationNumberColon) {

    
    
    
    
    this.voterIdentificationNumberColon = voterIdentificationNumberColon;
    return this;
  }

   /**
   * Get voterIdentificationNumberColon
   * @return voterIdentificationNumberColon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "90F5B1C5BD295355586", value = "")

  public String getVoterIdentificationNumberColon() {
    return voterIdentificationNumberColon;
  }


  public void setVoterIdentificationNumberColon(String voterIdentificationNumberColon) {

    
    
    
    this.voterIdentificationNumberColon = voterIdentificationNumberColon;
  }


  public GetVinResponseEntity genderColon(String genderColon) {

    
    
    
    
    this.genderColon = genderColon;
    return this;
  }

   /**
   * Get genderColon
   * @return genderColon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Male", value = "")

  public String getGenderColon() {
    return genderColon;
  }


  public void setGenderColon(String genderColon) {

    
    
    
    this.genderColon = genderColon;
  }


  public GetVinResponseEntity occupationColon(String occupationColon) {

    
    
    
    
    this.occupationColon = occupationColon;
    return this;
  }

   /**
   * Get occupationColon
   * @return occupationColon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STUDENT", value = "")

  public String getOccupationColon() {
    return occupationColon;
  }


  public void setOccupationColon(String occupationColon) {

    
    
    
    this.occupationColon = occupationColon;
  }


  public GetVinResponseEntity timeOfRegistrationColon(String timeOfRegistrationColon) {

    
    
    
    
    this.timeOfRegistrationColon = timeOfRegistrationColon;
    return this;
  }

   /**
   * Get timeOfRegistrationColon
   * @return timeOfRegistrationColon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2011-01-18 13:59:46", value = "")

  public String getTimeOfRegistrationColon() {
    return timeOfRegistrationColon;
  }


  public void setTimeOfRegistrationColon(String timeOfRegistrationColon) {

    
    
    
    this.timeOfRegistrationColon = timeOfRegistrationColon;
  }


  public GetVinResponseEntity stateColon(String stateColon) {

    
    
    
    
    this.stateColon = stateColon;
    return this;
  }

   /**
   * Get stateColon
   * @return stateColon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONDO", value = "")

  public String getStateColon() {
    return stateColon;
  }


  public void setStateColon(String stateColon) {

    
    
    
    this.stateColon = stateColon;
  }


  public GetVinResponseEntity localGovernmentColon(String localGovernmentColon) {

    
    
    
    
    this.localGovernmentColon = localGovernmentColon;
    return this;
  }

   /**
   * Get localGovernmentColon
   * @return localGovernmentColon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDANRE", value = "")

  public String getLocalGovernmentColon() {
    return localGovernmentColon;
  }


  public void setLocalGovernmentColon(String localGovernmentColon) {

    
    
    
    this.localGovernmentColon = localGovernmentColon;
  }


  public GetVinResponseEntity registrationAreaWardColon(String registrationAreaWardColon) {

    
    
    
    
    this.registrationAreaWardColon = registrationAreaWardColon;
    return this;
  }

   /**
   * Get registrationAreaWardColon
   * @return registrationAreaWardColon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISALU JIGBOKIN", value = "")

  public String getRegistrationAreaWardColon() {
    return registrationAreaWardColon;
  }


  public void setRegistrationAreaWardColon(String registrationAreaWardColon) {

    
    
    
    this.registrationAreaWardColon = registrationAreaWardColon;
  }


  public GetVinResponseEntity pollingUnitColon(String pollingUnitColon) {

    
    
    
    
    this.pollingUnitColon = pollingUnitColon;
    return this;
  }

   /**
   * Get pollingUnitColon
   * @return pollingUnitColon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OJAJIGBOKIN, O/S IN FRONT OF ABANA I & II", value = "")

  public String getPollingUnitColon() {
    return pollingUnitColon;
  }


  public void setPollingUnitColon(String pollingUnitColon) {

    
    
    
    this.pollingUnitColon = pollingUnitColon;
  }


  public GetVinResponseEntity pollingUnitCode(String pollingUnitCode) {

    
    
    
    
    this.pollingUnitCode = pollingUnitCode;
    return this;
  }

   /**
   * Get pollingUnitCode
   * @return pollingUnitCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28/08/08/005", value = "")

  public String getPollingUnitCode() {
    return pollingUnitCode;
  }


  public void setPollingUnitCode(String pollingUnitCode) {

    
    
    
    this.pollingUnitCode = pollingUnitCode;
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
   * @return the GetVinResponseEntity instance itself
   */
  public GetVinResponseEntity putAdditionalProperty(String key, Object value) {
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
    GetVinResponseEntity getVinResponseEntity = (GetVinResponseEntity) o;
    return Objects.equals(this.fullName, getVinResponseEntity.fullName) &&
        Objects.equals(this.voterIdentificationNumberColon, getVinResponseEntity.voterIdentificationNumberColon) &&
        Objects.equals(this.genderColon, getVinResponseEntity.genderColon) &&
        Objects.equals(this.occupationColon, getVinResponseEntity.occupationColon) &&
        Objects.equals(this.timeOfRegistrationColon, getVinResponseEntity.timeOfRegistrationColon) &&
        Objects.equals(this.stateColon, getVinResponseEntity.stateColon) &&
        Objects.equals(this.localGovernmentColon, getVinResponseEntity.localGovernmentColon) &&
        Objects.equals(this.registrationAreaWardColon, getVinResponseEntity.registrationAreaWardColon) &&
        Objects.equals(this.pollingUnitColon, getVinResponseEntity.pollingUnitColon) &&
        Objects.equals(this.pollingUnitCode, getVinResponseEntity.pollingUnitCode)&&
        Objects.equals(this.additionalProperties, getVinResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, voterIdentificationNumberColon, genderColon, occupationColon, timeOfRegistrationColon, stateColon, localGovernmentColon, registrationAreaWardColon, pollingUnitColon, pollingUnitCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetVinResponseEntity {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    voterIdentificationNumberColon: ").append(toIndentedString(voterIdentificationNumberColon)).append("\n");
    sb.append("    genderColon: ").append(toIndentedString(genderColon)).append("\n");
    sb.append("    occupationColon: ").append(toIndentedString(occupationColon)).append("\n");
    sb.append("    timeOfRegistrationColon: ").append(toIndentedString(timeOfRegistrationColon)).append("\n");
    sb.append("    stateColon: ").append(toIndentedString(stateColon)).append("\n");
    sb.append("    localGovernmentColon: ").append(toIndentedString(localGovernmentColon)).append("\n");
    sb.append("    registrationAreaWardColon: ").append(toIndentedString(registrationAreaWardColon)).append("\n");
    sb.append("    pollingUnitColon: ").append(toIndentedString(pollingUnitColon)).append("\n");
    sb.append("    pollingUnitCode: ").append(toIndentedString(pollingUnitCode)).append("\n");
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
    openapiFields.add("full_name");
    openapiFields.add("voter_identification_number:");
    openapiFields.add("gender:");
    openapiFields.add("occupation:");
    openapiFields.add("time_of_registration:");
    openapiFields.add("state:");
    openapiFields.add("local_government:");
    openapiFields.add("registration_area_ward:");
    openapiFields.add("polling_unit:");
    openapiFields.add("polling_unit_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetVinResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetVinResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetVinResponseEntity is not found in the empty JSON string", GetVinResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("voter_identification_number:") != null && !jsonObj.get("voter_identification_number:").isJsonNull()) && !jsonObj.get("voter_identification_number:").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voter_identification_number:` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voter_identification_number:").toString()));
      }
      if ((jsonObj.get("gender:") != null && !jsonObj.get("gender:").isJsonNull()) && !jsonObj.get("gender:").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender:` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender:").toString()));
      }
      if ((jsonObj.get("occupation:") != null && !jsonObj.get("occupation:").isJsonNull()) && !jsonObj.get("occupation:").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occupation:` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occupation:").toString()));
      }
      if ((jsonObj.get("time_of_registration:") != null && !jsonObj.get("time_of_registration:").isJsonNull()) && !jsonObj.get("time_of_registration:").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_of_registration:` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_of_registration:").toString()));
      }
      if ((jsonObj.get("state:") != null && !jsonObj.get("state:").isJsonNull()) && !jsonObj.get("state:").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state:` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state:").toString()));
      }
      if ((jsonObj.get("local_government:") != null && !jsonObj.get("local_government:").isJsonNull()) && !jsonObj.get("local_government:").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `local_government:` to be a primitive type in the JSON string but got `%s`", jsonObj.get("local_government:").toString()));
      }
      if ((jsonObj.get("registration_area_ward:") != null && !jsonObj.get("registration_area_ward:").isJsonNull()) && !jsonObj.get("registration_area_ward:").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_area_ward:` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_area_ward:").toString()));
      }
      if ((jsonObj.get("polling_unit:") != null && !jsonObj.get("polling_unit:").isJsonNull()) && !jsonObj.get("polling_unit:").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `polling_unit:` to be a primitive type in the JSON string but got `%s`", jsonObj.get("polling_unit:").toString()));
      }
      if ((jsonObj.get("polling_unit_code") != null && !jsonObj.get("polling_unit_code").isJsonNull()) && !jsonObj.get("polling_unit_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `polling_unit_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("polling_unit_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetVinResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetVinResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetVinResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetVinResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetVinResponseEntity>() {
           @Override
           public void write(JsonWriter out, GetVinResponseEntity value) throws IOException {
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
           public GetVinResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetVinResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetVinResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetVinResponseEntity
  * @throws IOException if the JSON string is invalid with respect to GetVinResponseEntity
  */
  public static GetVinResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetVinResponseEntity.class);
  }

 /**
  * Convert an instance of GetVinResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

