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
 * GetKycDriversLicenseResponseEntityPersonalDetails
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetKycDriversLicenseResponseEntityPersonalDetails {
  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private String birthDate;

  public static final String SERIALIZED_NAME_BLOOD_GROUP_ID = "blood_group_id";
  @SerializedName(SERIALIZED_NAME_BLOOD_GROUP_ID)
  private String bloodGroupId;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DISABILITY_REASON = "disability_reason";
  @SerializedName(SERIALIZED_NAME_DISABILITY_REASON)
  private String disabilityReason;

  public static final String SERIALIZED_NAME_FACIAL_MARK = "facial_mark";
  @SerializedName(SERIALIZED_NAME_FACIAL_MARK)
  private String facialMark;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_GLASSES = "glasses";
  @SerializedName(SERIALIZED_NAME_GLASSES)
  private String glasses;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_IS_DISABILITY = "is_disability";
  @SerializedName(SERIALIZED_NAME_IS_DISABILITY)
  private String isDisability;

  public static final String SERIALIZED_NAME_LGA = "lga";
  @SerializedName(SERIALIZED_NAME_LGA)
  private String lga;

  public static final String SERIALIZED_NAME_MOTHER_MAIDEN_NAME = "mother_maiden_name";
  @SerializedName(SERIALIZED_NAME_MOTHER_MAIDEN_NAME)
  private String motherMaidenName;

  public static final String SERIALIZED_NAME_NIN_NUMBER = "nin_number";
  @SerializedName(SERIALIZED_NAME_NIN_NUMBER)
  private String ninNumber;

  public static final String SERIALIZED_NAME_OTHERNAME = "othername";
  @SerializedName(SERIALIZED_NAME_OTHERNAME)
  private String othername;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SURNAME = "surname";
  @SerializedName(SERIALIZED_NAME_SURNAME)
  private String surname;

  public static final String SERIALIZED_NAME_UNIVERSALTAX_IDENTITY_NUMBER = "universaltax_identity_number";
  @SerializedName(SERIALIZED_NAME_UNIVERSALTAX_IDENTITY_NUMBER)
  private String universaltaxIdentityNumber;

  public GetKycDriversLicenseResponseEntityPersonalDetails() {
  }

  public GetKycDriversLicenseResponseEntityPersonalDetails birthDate(String birthDate) {

    
    
    
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18/05/1992", value = "")

  public String getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(String birthDate) {

    
    
    
    this.birthDate = birthDate;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails bloodGroupId(String bloodGroupId) {

    
    
    
    
    this.bloodGroupId = bloodGroupId;
    return this;
  }

   /**
   * Get bloodGroupId
   * @return bloodGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B+", value = "")

  public String getBloodGroupId() {
    return bloodGroupId;
  }


  public void setBloodGroupId(String bloodGroupId) {

    
    
    
    this.bloodGroupId = bloodGroupId;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails country(String country) {

    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nigeria", value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {

    
    
    
    this.country = country;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails disabilityReason(String disabilityReason) {

    
    
    
    
    this.disabilityReason = disabilityReason;
    return this;
  }

   /**
   * Get disabilityReason
   * @return disabilityReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getDisabilityReason() {
    return disabilityReason;
  }


  public void setDisabilityReason(String disabilityReason) {

    
    
    
    this.disabilityReason = disabilityReason;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails facialMark(String facialMark) {

    
    
    
    
    this.facialMark = facialMark;
    return this;
  }

   /**
   * Get facialMark
   * @return facialMark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getFacialMark() {
    return facialMark;
  }


  public void setFacialMark(String facialMark) {

    
    
    
    this.facialMark = facialMark;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails firstname(String firstname) {

    
    
    
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TOBI", value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {

    
    
    
    this.firstname = firstname;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails gender(String gender) {

    
    
    
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Male", value = "")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {

    
    
    
    this.gender = gender;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails glasses(String glasses) {

    
    
    
    
    this.glasses = glasses;
    return this;
  }

   /**
   * Get glasses
   * @return glasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getGlasses() {
    return glasses;
  }


  public void setGlasses(String glasses) {

    
    
    
    this.glasses = glasses;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails height(String height) {

    
    
    
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.7", value = "")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {

    
    
    
    this.height = height;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails isDisability(String isDisability) {

    
    
    
    
    this.isDisability = isDisability;
    return this;
  }

   /**
   * Get isDisability
   * @return isDisability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getIsDisability() {
    return isDisability;
  }


  public void setIsDisability(String isDisability) {

    
    
    
    this.isDisability = isDisability;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails lga(String lga) {

    
    
    
    
    this.lga = lga;
    return this;
  }

   /**
   * Get lga
   * @return lga
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Etsako East", value = "")

  public String getLga() {
    return lga;
  }


  public void setLga(String lga) {

    
    
    
    this.lga = lga;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails motherMaidenName(String motherMaidenName) {

    
    
    
    
    this.motherMaidenName = motherMaidenName;
    return this;
  }

   /**
   * Get motherMaidenName
   * @return motherMaidenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OGUNSOLA", value = "")

  public String getMotherMaidenName() {
    return motherMaidenName;
  }


  public void setMotherMaidenName(String motherMaidenName) {

    
    
    
    this.motherMaidenName = motherMaidenName;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails ninNumber(String ninNumber) {

    
    
    
    
    this.ninNumber = ninNumber;
    return this;
  }

   /**
   * Get ninNumber
   * @return ninNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getNinNumber() {
    return ninNumber;
  }


  public void setNinNumber(String ninNumber) {

    
    
    
    this.ninNumber = ninNumber;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails othername(String othername) {

    
    
    
    
    this.othername = othername;
    return this;
  }

   /**
   * Get othername
   * @return othername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OLALEKAN", value = "")

  public String getOthername() {
    return othername;
  }


  public void setOthername(String othername) {

    
    
    
    this.othername = othername;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails state(String state) {

    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Edo", value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {

    
    
    
    this.state = state;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails surname(String surname) {

    
    
    
    
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OLOLADE", value = "")

  public String getSurname() {
    return surname;
  }


  public void setSurname(String surname) {

    
    
    
    this.surname = surname;
  }


  public GetKycDriversLicenseResponseEntityPersonalDetails universaltaxIdentityNumber(String universaltaxIdentityNumber) {

    
    
    
    
    this.universaltaxIdentityNumber = universaltaxIdentityNumber;
    return this;
  }

   /**
   * Get universaltaxIdentityNumber
   * @return universaltaxIdentityNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getUniversaltaxIdentityNumber() {
    return universaltaxIdentityNumber;
  }


  public void setUniversaltaxIdentityNumber(String universaltaxIdentityNumber) {

    
    
    
    this.universaltaxIdentityNumber = universaltaxIdentityNumber;
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
   * @return the GetKycDriversLicenseResponseEntityPersonalDetails instance itself
   */
  public GetKycDriversLicenseResponseEntityPersonalDetails putAdditionalProperty(String key, Object value) {
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
    GetKycDriversLicenseResponseEntityPersonalDetails getKycDriversLicenseResponseEntityPersonalDetails = (GetKycDriversLicenseResponseEntityPersonalDetails) o;
    return Objects.equals(this.birthDate, getKycDriversLicenseResponseEntityPersonalDetails.birthDate) &&
        Objects.equals(this.bloodGroupId, getKycDriversLicenseResponseEntityPersonalDetails.bloodGroupId) &&
        Objects.equals(this.country, getKycDriversLicenseResponseEntityPersonalDetails.country) &&
        Objects.equals(this.disabilityReason, getKycDriversLicenseResponseEntityPersonalDetails.disabilityReason) &&
        Objects.equals(this.facialMark, getKycDriversLicenseResponseEntityPersonalDetails.facialMark) &&
        Objects.equals(this.firstname, getKycDriversLicenseResponseEntityPersonalDetails.firstname) &&
        Objects.equals(this.gender, getKycDriversLicenseResponseEntityPersonalDetails.gender) &&
        Objects.equals(this.glasses, getKycDriversLicenseResponseEntityPersonalDetails.glasses) &&
        Objects.equals(this.height, getKycDriversLicenseResponseEntityPersonalDetails.height) &&
        Objects.equals(this.isDisability, getKycDriversLicenseResponseEntityPersonalDetails.isDisability) &&
        Objects.equals(this.lga, getKycDriversLicenseResponseEntityPersonalDetails.lga) &&
        Objects.equals(this.motherMaidenName, getKycDriversLicenseResponseEntityPersonalDetails.motherMaidenName) &&
        Objects.equals(this.ninNumber, getKycDriversLicenseResponseEntityPersonalDetails.ninNumber) &&
        Objects.equals(this.othername, getKycDriversLicenseResponseEntityPersonalDetails.othername) &&
        Objects.equals(this.state, getKycDriversLicenseResponseEntityPersonalDetails.state) &&
        Objects.equals(this.surname, getKycDriversLicenseResponseEntityPersonalDetails.surname) &&
        Objects.equals(this.universaltaxIdentityNumber, getKycDriversLicenseResponseEntityPersonalDetails.universaltaxIdentityNumber)&&
        Objects.equals(this.additionalProperties, getKycDriversLicenseResponseEntityPersonalDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthDate, bloodGroupId, country, disabilityReason, facialMark, firstname, gender, glasses, height, isDisability, lga, motherMaidenName, ninNumber, othername, state, surname, universaltaxIdentityNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKycDriversLicenseResponseEntityPersonalDetails {\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    bloodGroupId: ").append(toIndentedString(bloodGroupId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    disabilityReason: ").append(toIndentedString(disabilityReason)).append("\n");
    sb.append("    facialMark: ").append(toIndentedString(facialMark)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    glasses: ").append(toIndentedString(glasses)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isDisability: ").append(toIndentedString(isDisability)).append("\n");
    sb.append("    lga: ").append(toIndentedString(lga)).append("\n");
    sb.append("    motherMaidenName: ").append(toIndentedString(motherMaidenName)).append("\n");
    sb.append("    ninNumber: ").append(toIndentedString(ninNumber)).append("\n");
    sb.append("    othername: ").append(toIndentedString(othername)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    universaltaxIdentityNumber: ").append(toIndentedString(universaltaxIdentityNumber)).append("\n");
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
    openapiFields.add("birth_date");
    openapiFields.add("blood_group_id");
    openapiFields.add("country");
    openapiFields.add("disability_reason");
    openapiFields.add("facial_mark");
    openapiFields.add("firstname");
    openapiFields.add("gender");
    openapiFields.add("glasses");
    openapiFields.add("height");
    openapiFields.add("is_disability");
    openapiFields.add("lga");
    openapiFields.add("mother_maiden_name");
    openapiFields.add("nin_number");
    openapiFields.add("othername");
    openapiFields.add("state");
    openapiFields.add("surname");
    openapiFields.add("universaltax_identity_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetKycDriversLicenseResponseEntityPersonalDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetKycDriversLicenseResponseEntityPersonalDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetKycDriversLicenseResponseEntityPersonalDetails is not found in the empty JSON string", GetKycDriversLicenseResponseEntityPersonalDetails.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("birth_date") != null && !jsonObj.get("birth_date").isJsonNull()) && !jsonObj.get("birth_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birth_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birth_date").toString()));
      }
      if ((jsonObj.get("blood_group_id") != null && !jsonObj.get("blood_group_id").isJsonNull()) && !jsonObj.get("blood_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blood_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blood_group_id").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("disability_reason") != null && !jsonObj.get("disability_reason").isJsonNull()) && !jsonObj.get("disability_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disability_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disability_reason").toString()));
      }
      if ((jsonObj.get("facial_mark") != null && !jsonObj.get("facial_mark").isJsonNull()) && !jsonObj.get("facial_mark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facial_mark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facial_mark").toString()));
      }
      if ((jsonObj.get("firstname") != null && !jsonObj.get("firstname").isJsonNull()) && !jsonObj.get("firstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstname").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("glasses") != null && !jsonObj.get("glasses").isJsonNull()) && !jsonObj.get("glasses").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `glasses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("glasses").toString()));
      }
      if ((jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull()) && !jsonObj.get("height").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `height` to be a primitive type in the JSON string but got `%s`", jsonObj.get("height").toString()));
      }
      if ((jsonObj.get("is_disability") != null && !jsonObj.get("is_disability").isJsonNull()) && !jsonObj.get("is_disability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_disability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_disability").toString()));
      }
      if ((jsonObj.get("lga") != null && !jsonObj.get("lga").isJsonNull()) && !jsonObj.get("lga").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lga` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lga").toString()));
      }
      if ((jsonObj.get("mother_maiden_name") != null && !jsonObj.get("mother_maiden_name").isJsonNull()) && !jsonObj.get("mother_maiden_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mother_maiden_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mother_maiden_name").toString()));
      }
      if ((jsonObj.get("nin_number") != null && !jsonObj.get("nin_number").isJsonNull()) && !jsonObj.get("nin_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nin_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nin_number").toString()));
      }
      if ((jsonObj.get("othername") != null && !jsonObj.get("othername").isJsonNull()) && !jsonObj.get("othername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `othername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("othername").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("surname") != null && !jsonObj.get("surname").isJsonNull()) && !jsonObj.get("surname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surname").toString()));
      }
      if ((jsonObj.get("universaltax_identity_number") != null && !jsonObj.get("universaltax_identity_number").isJsonNull()) && !jsonObj.get("universaltax_identity_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `universaltax_identity_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("universaltax_identity_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetKycDriversLicenseResponseEntityPersonalDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetKycDriversLicenseResponseEntityPersonalDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetKycDriversLicenseResponseEntityPersonalDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetKycDriversLicenseResponseEntityPersonalDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GetKycDriversLicenseResponseEntityPersonalDetails>() {
           @Override
           public void write(JsonWriter out, GetKycDriversLicenseResponseEntityPersonalDetails value) throws IOException {
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
           public GetKycDriversLicenseResponseEntityPersonalDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetKycDriversLicenseResponseEntityPersonalDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetKycDriversLicenseResponseEntityPersonalDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetKycDriversLicenseResponseEntityPersonalDetails
  * @throws IOException if the JSON string is invalid with respect to GetKycDriversLicenseResponseEntityPersonalDetails
  */
  public static GetKycDriversLicenseResponseEntityPersonalDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetKycDriversLicenseResponseEntityPersonalDetails.class);
  }

 /**
  * Convert an instance of GetKycDriversLicenseResponseEntityPersonalDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

