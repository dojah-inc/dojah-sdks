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
 * ZafKycGetIdResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ZafKycGetIdResponseEntity {
  public static final String SERIALIZED_NAME_BIRTH_PLACE_COUNTRY = "birth_place_country";
  @SerializedName(SERIALIZED_NAME_BIRTH_PLACE_COUNTRY)
  private String birthPlaceCountry;

  public static final String SERIALIZED_NAME_BIRTH_PLACE_COUNTRY_CODE = "birth_place_country_code";
  @SerializedName(SERIALIZED_NAME_BIRTH_PLACE_COUNTRY_CODE)
  private String birthPlaceCountryCode;

  public static final String SERIALIZED_NAME_BOOKED_DATE = "booked_date";
  @SerializedName(SERIALIZED_NAME_BOOKED_DATE)
  private String bookedDate;

  public static final String SERIALIZED_NAME_CARD_DATE = "card_date";
  @SerializedName(SERIALIZED_NAME_CARD_DATE)
  private String cardDate;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_ID_BLOCKED = "id_blocked";
  @SerializedName(SERIALIZED_NAME_ID_BLOCKED)
  private String idBlocked;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private String idNumber;

  public static final String SERIALIZED_NAME_ISSUED_DATE = "issued_date";
  @SerializedName(SERIALIZED_NAME_ISSUED_DATE)
  private String issuedDate;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MAIDEN_NAME = "maiden_name";
  @SerializedName(SERIALIZED_NAME_MAIDEN_NAME)
  private String maidenName;

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private String maritalStatus;

  public static final String SERIALIZED_NAME_ON_H_A_N_I_S = "on_HANIS";
  @SerializedName(SERIALIZED_NAME_ON_H_A_N_I_S)
  private String onHANIS;

  public static final String SERIALIZED_NAME_ON_N_P_R = "on_NPR";
  @SerializedName(SERIALIZED_NAME_ON_N_P_R)
  private String onNPR;

  public static final String SERIALIZED_NAME_PHOTO = "photo";
  @SerializedName(SERIALIZED_NAME_PHOTO)
  private String photo;

  public static final String SERIALIZED_NAME_SMART_CARD_ISSUED = "smart_card_issued";
  @SerializedName(SERIALIZED_NAME_SMART_CARD_ISSUED)
  private String smartCardIssued;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Double status;

  public ZafKycGetIdResponseEntity() {
  }

  public ZafKycGetIdResponseEntity birthPlaceCountry(String birthPlaceCountry) {

    
    
    
    
    this.birthPlaceCountry = birthPlaceCountry;
    return this;
  }

   /**
   * Get birthPlaceCountry
   * @return birthPlaceCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SOUTH AFRICA", value = "")

  public String getBirthPlaceCountry() {
    return birthPlaceCountry;
  }


  public void setBirthPlaceCountry(String birthPlaceCountry) {

    
    
    
    this.birthPlaceCountry = birthPlaceCountry;
  }


  public ZafKycGetIdResponseEntity birthPlaceCountryCode(String birthPlaceCountryCode) {

    
    
    
    
    this.birthPlaceCountryCode = birthPlaceCountryCode;
    return this;
  }

   /**
   * Get birthPlaceCountryCode
   * @return birthPlaceCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZAF", value = "")

  public String getBirthPlaceCountryCode() {
    return birthPlaceCountryCode;
  }


  public void setBirthPlaceCountryCode(String birthPlaceCountryCode) {

    
    
    
    this.birthPlaceCountryCode = birthPlaceCountryCode;
  }


  public ZafKycGetIdResponseEntity bookedDate(String bookedDate) {

    
    
    
    
    this.bookedDate = bookedDate;
    return this;
  }

   /**
   * Get bookedDate
   * @return bookedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-23", value = "")

  public String getBookedDate() {
    return bookedDate;
  }


  public void setBookedDate(String bookedDate) {

    
    
    
    this.bookedDate = bookedDate;
  }


  public ZafKycGetIdResponseEntity cardDate(String cardDate) {

    
    
    
    
    this.cardDate = cardDate;
    return this;
  }

   /**
   * Get cardDate
   * @return cardDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-23", value = "")

  public String getCardDate() {
    return cardDate;
  }


  public void setCardDate(String cardDate) {

    
    
    
    this.cardDate = cardDate;
  }


  public ZafKycGetIdResponseEntity dateOfBirth(String dateOfBirth) {

    
    
    
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1999-06-10", value = "")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {

    
    
    
    this.dateOfBirth = dateOfBirth;
  }


  public ZafKycGetIdResponseEntity fullName(String fullName) {

    
    
    
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PHUMLA PETRONELA", value = "")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {

    
    
    
    this.fullName = fullName;
  }


  public ZafKycGetIdResponseEntity gender(String gender) {

    
    
    
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Female", value = "")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {

    
    
    
    this.gender = gender;
  }


  public ZafKycGetIdResponseEntity idBlocked(String idBlocked) {

    
    
    
    
    this.idBlocked = idBlocked;
    return this;
  }

   /**
   * Get idBlocked
   * @return idBlocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getIdBlocked() {
    return idBlocked;
  }


  public void setIdBlocked(String idBlocked) {

    
    
    
    this.idBlocked = idBlocked;
  }


  public ZafKycGetIdResponseEntity idNumber(String idNumber) {

    
    
    
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9906101240082", value = "")

  public String getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(String idNumber) {

    
    
    
    this.idNumber = idNumber;
  }


  public ZafKycGetIdResponseEntity issuedDate(String issuedDate) {

    
    
    
    
    this.issuedDate = issuedDate;
    return this;
  }

   /**
   * Get issuedDate
   * @return issuedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-23", value = "")

  public String getIssuedDate() {
    return issuedDate;
  }


  public void setIssuedDate(String issuedDate) {

    
    
    
    this.issuedDate = issuedDate;
  }


  public ZafKycGetIdResponseEntity lastName(String lastName) {

    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KRAAI", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {

    
    
    
    this.lastName = lastName;
  }


  public ZafKycGetIdResponseEntity maidenName(String maidenName) {

    
    
    
    
    this.maidenName = maidenName;
    return this;
  }

   /**
   * Get maidenName
   * @return maidenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getMaidenName() {
    return maidenName;
  }


  public void setMaidenName(String maidenName) {

    
    
    
    this.maidenName = maidenName;
  }


  public ZafKycGetIdResponseEntity maritalStatus(String maritalStatus) {

    
    
    
    
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SINGLE", value = "")

  public String getMaritalStatus() {
    return maritalStatus;
  }


  public void setMaritalStatus(String maritalStatus) {

    
    
    
    this.maritalStatus = maritalStatus;
  }


  public ZafKycGetIdResponseEntity onHANIS(String onHANIS) {

    
    
    
    
    this.onHANIS = onHANIS;
    return this;
  }

   /**
   * Get onHANIS
   * @return onHANIS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getOnHANIS() {
    return onHANIS;
  }


  public void setOnHANIS(String onHANIS) {

    
    
    
    this.onHANIS = onHANIS;
  }


  public ZafKycGetIdResponseEntity onNPR(String onNPR) {

    
    
    
    
    this.onNPR = onNPR;
    return this;
  }

   /**
   * Get onNPR
   * @return onNPR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getOnNPR() {
    return onNPR;
  }


  public void setOnNPR(String onNPR) {

    
    
    
    this.onNPR = onNPR;
  }


  public ZafKycGetIdResponseEntity photo(String photo) {

    
    
    
    
    this.photo = photo;
    return this;
  }

   /**
   * Get photo
   * @return photo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQICAQECAQEBAgICAgIC...SHORTENED-BY-KONFIG...395ahqEBBIjXj/3Gme8RtSeo8bL2YmgnQFUgThvLJ++sEE6CHhznuuGjwDw/s8cBcECpy7JO24SSE1Npso2cWaJV2hO6Qq8M/9k=", value = "")

  public String getPhoto() {
    return photo;
  }


  public void setPhoto(String photo) {

    
    
    
    this.photo = photo;
  }


  public ZafKycGetIdResponseEntity smartCardIssued(String smartCardIssued) {

    
    
    
    
    this.smartCardIssued = smartCardIssued;
    return this;
  }

   /**
   * Get smartCardIssued
   * @return smartCardIssued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getSmartCardIssued() {
    return smartCardIssued;
  }


  public void setSmartCardIssued(String smartCardIssued) {

    
    
    
    this.smartCardIssued = smartCardIssued;
  }


  public ZafKycGetIdResponseEntity status(Double status) {

    
    
    
    
    this.status = status;
    return this;
  }

  public ZafKycGetIdResponseEntity status(Integer status) {

    
    
    
    
    this.status = status.doubleValue();
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "")

  public Double getStatus() {
    return status;
  }


  public void setStatus(Double status) {

    
    
    
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
   * @return the ZafKycGetIdResponseEntity instance itself
   */
  public ZafKycGetIdResponseEntity putAdditionalProperty(String key, Object value) {
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
    ZafKycGetIdResponseEntity zafKycGetIdResponseEntity = (ZafKycGetIdResponseEntity) o;
    return Objects.equals(this.birthPlaceCountry, zafKycGetIdResponseEntity.birthPlaceCountry) &&
        Objects.equals(this.birthPlaceCountryCode, zafKycGetIdResponseEntity.birthPlaceCountryCode) &&
        Objects.equals(this.bookedDate, zafKycGetIdResponseEntity.bookedDate) &&
        Objects.equals(this.cardDate, zafKycGetIdResponseEntity.cardDate) &&
        Objects.equals(this.dateOfBirth, zafKycGetIdResponseEntity.dateOfBirth) &&
        Objects.equals(this.fullName, zafKycGetIdResponseEntity.fullName) &&
        Objects.equals(this.gender, zafKycGetIdResponseEntity.gender) &&
        Objects.equals(this.idBlocked, zafKycGetIdResponseEntity.idBlocked) &&
        Objects.equals(this.idNumber, zafKycGetIdResponseEntity.idNumber) &&
        Objects.equals(this.issuedDate, zafKycGetIdResponseEntity.issuedDate) &&
        Objects.equals(this.lastName, zafKycGetIdResponseEntity.lastName) &&
        Objects.equals(this.maidenName, zafKycGetIdResponseEntity.maidenName) &&
        Objects.equals(this.maritalStatus, zafKycGetIdResponseEntity.maritalStatus) &&
        Objects.equals(this.onHANIS, zafKycGetIdResponseEntity.onHANIS) &&
        Objects.equals(this.onNPR, zafKycGetIdResponseEntity.onNPR) &&
        Objects.equals(this.photo, zafKycGetIdResponseEntity.photo) &&
        Objects.equals(this.smartCardIssued, zafKycGetIdResponseEntity.smartCardIssued) &&
        Objects.equals(this.status, zafKycGetIdResponseEntity.status)&&
        Objects.equals(this.additionalProperties, zafKycGetIdResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthPlaceCountry, birthPlaceCountryCode, bookedDate, cardDate, dateOfBirth, fullName, gender, idBlocked, idNumber, issuedDate, lastName, maidenName, maritalStatus, onHANIS, onNPR, photo, smartCardIssued, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZafKycGetIdResponseEntity {\n");
    sb.append("    birthPlaceCountry: ").append(toIndentedString(birthPlaceCountry)).append("\n");
    sb.append("    birthPlaceCountryCode: ").append(toIndentedString(birthPlaceCountryCode)).append("\n");
    sb.append("    bookedDate: ").append(toIndentedString(bookedDate)).append("\n");
    sb.append("    cardDate: ").append(toIndentedString(cardDate)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    idBlocked: ").append(toIndentedString(idBlocked)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    issuedDate: ").append(toIndentedString(issuedDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    onHANIS: ").append(toIndentedString(onHANIS)).append("\n");
    sb.append("    onNPR: ").append(toIndentedString(onNPR)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    smartCardIssued: ").append(toIndentedString(smartCardIssued)).append("\n");
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
    openapiFields.add("birth_place_country");
    openapiFields.add("birth_place_country_code");
    openapiFields.add("booked_date");
    openapiFields.add("card_date");
    openapiFields.add("date_of_birth");
    openapiFields.add("full_name");
    openapiFields.add("gender");
    openapiFields.add("id_blocked");
    openapiFields.add("id_number");
    openapiFields.add("issued_date");
    openapiFields.add("last_name");
    openapiFields.add("maiden_name");
    openapiFields.add("marital_status");
    openapiFields.add("on_HANIS");
    openapiFields.add("on_NPR");
    openapiFields.add("photo");
    openapiFields.add("smart_card_issued");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZafKycGetIdResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ZafKycGetIdResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZafKycGetIdResponseEntity is not found in the empty JSON string", ZafKycGetIdResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("birth_place_country") != null && !jsonObj.get("birth_place_country").isJsonNull()) && !jsonObj.get("birth_place_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birth_place_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birth_place_country").toString()));
      }
      if ((jsonObj.get("birth_place_country_code") != null && !jsonObj.get("birth_place_country_code").isJsonNull()) && !jsonObj.get("birth_place_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birth_place_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birth_place_country_code").toString()));
      }
      if ((jsonObj.get("booked_date") != null && !jsonObj.get("booked_date").isJsonNull()) && !jsonObj.get("booked_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `booked_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("booked_date").toString()));
      }
      if ((jsonObj.get("card_date") != null && !jsonObj.get("card_date").isJsonNull()) && !jsonObj.get("card_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_date").toString()));
      }
      if ((jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) && !jsonObj.get("date_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_birth").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("id_blocked") != null && !jsonObj.get("id_blocked").isJsonNull()) && !jsonObj.get("id_blocked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_blocked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_blocked").toString()));
      }
      if ((jsonObj.get("id_number") != null && !jsonObj.get("id_number").isJsonNull()) && !jsonObj.get("id_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_number").toString()));
      }
      if ((jsonObj.get("issued_date") != null && !jsonObj.get("issued_date").isJsonNull()) && !jsonObj.get("issued_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issued_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issued_date").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("maiden_name") != null && !jsonObj.get("maiden_name").isJsonNull()) && !jsonObj.get("maiden_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maiden_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maiden_name").toString()));
      }
      if ((jsonObj.get("marital_status") != null && !jsonObj.get("marital_status").isJsonNull()) && !jsonObj.get("marital_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marital_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marital_status").toString()));
      }
      if ((jsonObj.get("on_HANIS") != null && !jsonObj.get("on_HANIS").isJsonNull()) && !jsonObj.get("on_HANIS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `on_HANIS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("on_HANIS").toString()));
      }
      if ((jsonObj.get("on_NPR") != null && !jsonObj.get("on_NPR").isJsonNull()) && !jsonObj.get("on_NPR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `on_NPR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("on_NPR").toString()));
      }
      if ((jsonObj.get("photo") != null && !jsonObj.get("photo").isJsonNull()) && !jsonObj.get("photo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `photo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("photo").toString()));
      }
      if ((jsonObj.get("smart_card_issued") != null && !jsonObj.get("smart_card_issued").isJsonNull()) && !jsonObj.get("smart_card_issued").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smart_card_issued` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smart_card_issued").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZafKycGetIdResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZafKycGetIdResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZafKycGetIdResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZafKycGetIdResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ZafKycGetIdResponseEntity>() {
           @Override
           public void write(JsonWriter out, ZafKycGetIdResponseEntity value) throws IOException {
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
           public ZafKycGetIdResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZafKycGetIdResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZafKycGetIdResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZafKycGetIdResponseEntity
  * @throws IOException if the JSON string is invalid with respect to ZafKycGetIdResponseEntity
  */
  public static ZafKycGetIdResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZafKycGetIdResponseEntity.class);
  }

 /**
  * Convert an instance of ZafKycGetIdResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

