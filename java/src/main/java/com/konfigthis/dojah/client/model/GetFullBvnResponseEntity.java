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
 * GetFullBvnResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetFullBvnResponseEntity {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_BVN = "bvn";
  @SerializedName(SERIALIZED_NAME_BVN)
  private String bvn;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ENROLLMENT_BANK = "enrollment_bank";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_BANK)
  private String enrollmentBank;

  public static final String SERIALIZED_NAME_ENROLLMENT_BRANCH = "enrollment_branch";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_BRANCH)
  private String enrollmentBranch;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_LEVEL_OF_ACCOUNT = "level_of_account";
  @SerializedName(SERIALIZED_NAME_LEVEL_OF_ACCOUNT)
  private String levelOfAccount;

  public static final String SERIALIZED_NAME_LGA_OF_ORIGIN = "lga_of_origin";
  @SerializedName(SERIALIZED_NAME_LGA_OF_ORIGIN)
  private String lgaOfOrigin;

  public static final String SERIALIZED_NAME_LGA_OF_RESIDENCE = "lga_of_residence";
  @SerializedName(SERIALIZED_NAME_LGA_OF_RESIDENCE)
  private String lgaOfResidence;

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private String maritalStatus;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_NAME_ON_CARD = "name_on_card";
  @SerializedName(SERIALIZED_NAME_NAME_ON_CARD)
  private String nameOnCard;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_NIN = "nin";
  @SerializedName(SERIALIZED_NAME_NIN)
  private String nin;

  public static final String SERIALIZED_NAME_PHONE_NUMBER1 = "phone_number1";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER1)
  private String phoneNumber1;

  public static final String SERIALIZED_NAME_PHONE_NUMBER2 = "phone_number2";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER2)
  private String phoneNumber2;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_REGISTRATION_DATE = "registration_date";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_DATE)
  private String registrationDate;

  public static final String SERIALIZED_NAME_RESIDENTIAL_ADDRESS = "residential_address";
  @SerializedName(SERIALIZED_NAME_RESIDENTIAL_ADDRESS)
  private String residentialAddress;

  public static final String SERIALIZED_NAME_STATE_OF_ORIGIN = "state_of_origin";
  @SerializedName(SERIALIZED_NAME_STATE_OF_ORIGIN)
  private String stateOfOrigin;

  public static final String SERIALIZED_NAME_STATE_OF_RESIDENCE = "state_of_residence";
  @SerializedName(SERIALIZED_NAME_STATE_OF_RESIDENCE)
  private String stateOfResidence;

  public static final String SERIALIZED_NAME_WATCH_LISTED = "watch_listed";
  @SerializedName(SERIALIZED_NAME_WATCH_LISTED)
  private String watchListed;

  public GetFullBvnResponseEntity() {
  }

  public GetFullBvnResponseEntity title(String title) {

    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mr", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {

    
    
    
    this.title = title;
  }


  public GetFullBvnResponseEntity bvn(String bvn) {

    
    
    
    
    this.bvn = bvn;
    return this;
  }

   /**
   * Get bvn
   * @return bvn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22468537919", value = "")

  public String getBvn() {
    return bvn;
  }


  public void setBvn(String bvn) {

    
    
    
    this.bvn = bvn;
  }


  public GetFullBvnResponseEntity dateOfBirth(String dateOfBirth) {

    
    
    
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28-Jun-2000", value = "")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {

    
    
    
    this.dateOfBirth = dateOfBirth;
  }


  public GetFullBvnResponseEntity email(String email) {

    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OLADIPOJOSHUAOLUWATIMILEYIN@YAHOO.COM", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {

    
    
    
    this.email = email;
  }


  public GetFullBvnResponseEntity enrollmentBank(String enrollmentBank) {

    
    
    
    
    this.enrollmentBank = enrollmentBank;
    return this;
  }

   /**
   * Get enrollmentBank
   * @return enrollmentBank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "058", value = "")

  public String getEnrollmentBank() {
    return enrollmentBank;
  }


  public void setEnrollmentBank(String enrollmentBank) {

    
    
    
    this.enrollmentBank = enrollmentBank;
  }


  public GetFullBvnResponseEntity enrollmentBranch(String enrollmentBranch) {

    
    
    
    
    this.enrollmentBranch = enrollmentBranch;
    return this;
  }

   /**
   * Get enrollmentBranch
   * @return enrollmentBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNILORIN", value = "")

  public String getEnrollmentBranch() {
    return enrollmentBranch;
  }


  public void setEnrollmentBranch(String enrollmentBranch) {

    
    
    
    this.enrollmentBranch = enrollmentBranch;
  }


  public GetFullBvnResponseEntity firstName(String firstName) {

    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JOSHUA", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {

    
    
    
    this.firstName = firstName;
  }


  public GetFullBvnResponseEntity gender(String gender) {

    
    
    
    
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


  public GetFullBvnResponseEntity image(String image) {

    
    
    
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<base64 encoded image>", value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {

    
    
    
    this.image = image;
  }


  public GetFullBvnResponseEntity lastName(String lastName) {

    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OLADIPO", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {

    
    
    
    this.lastName = lastName;
  }


  public GetFullBvnResponseEntity levelOfAccount(String levelOfAccount) {

    
    
    
    
    this.levelOfAccount = levelOfAccount;
    return this;
  }

   /**
   * Get levelOfAccount
   * @return levelOfAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Level 2 - Medium Level Accounts", value = "")

  public String getLevelOfAccount() {
    return levelOfAccount;
  }


  public void setLevelOfAccount(String levelOfAccount) {

    
    
    
    this.levelOfAccount = levelOfAccount;
  }


  public GetFullBvnResponseEntity lgaOfOrigin(String lgaOfOrigin) {

    
    
    
    
    this.lgaOfOrigin = lgaOfOrigin;
    return this;
  }

   /**
   * Get lgaOfOrigin
   * @return lgaOfOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Odo Otin", value = "")

  public String getLgaOfOrigin() {
    return lgaOfOrigin;
  }


  public void setLgaOfOrigin(String lgaOfOrigin) {

    
    
    
    this.lgaOfOrigin = lgaOfOrigin;
  }


  public GetFullBvnResponseEntity lgaOfResidence(String lgaOfResidence) {

    
    
    
    
    this.lgaOfResidence = lgaOfResidence;
    return this;
  }

   /**
   * Get lgaOfResidence
   * @return lgaOfResidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ilorin South", value = "")

  public String getLgaOfResidence() {
    return lgaOfResidence;
  }


  public void setLgaOfResidence(String lgaOfResidence) {

    
    
    
    this.lgaOfResidence = lgaOfResidence;
  }


  public GetFullBvnResponseEntity maritalStatus(String maritalStatus) {

    
    
    
    
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Single", value = "")

  public String getMaritalStatus() {
    return maritalStatus;
  }


  public void setMaritalStatus(String maritalStatus) {

    
    
    
    this.maritalStatus = maritalStatus;
  }


  public GetFullBvnResponseEntity middleName(String middleName) {

    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OLUWATIMILEYIN", value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {

    
    
    
    this.middleName = middleName;
  }


  public GetFullBvnResponseEntity nameOnCard(String nameOnCard) {

    
    
    
    
    this.nameOnCard = nameOnCard;
    return this;
  }

   /**
   * Get nameOnCard
   * @return nameOnCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OLADIPO, JOSHUA O", value = "")

  public String getNameOnCard() {
    return nameOnCard;
  }


  public void setNameOnCard(String nameOnCard) {

    
    
    
    this.nameOnCard = nameOnCard;
  }


  public GetFullBvnResponseEntity nationality(String nationality) {

    
    
    
    
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nigeria", value = "")

  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {

    
    
    
    this.nationality = nationality;
  }


  public GetFullBvnResponseEntity nin(String nin) {

    
    
    
    
    this.nin = nin;
    return this;
  }

   /**
   * Get nin
   * @return nin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getNin() {
    return nin;
  }


  public void setNin(String nin) {

    
    
    
    this.nin = nin;
  }


  public GetFullBvnResponseEntity phoneNumber1(String phoneNumber1) {

    
    
    
    
    this.phoneNumber1 = phoneNumber1;
    return this;
  }

   /**
   * Get phoneNumber1
   * @return phoneNumber1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "07085460116", value = "")

  public String getPhoneNumber1() {
    return phoneNumber1;
  }


  public void setPhoneNumber1(String phoneNumber1) {

    
    
    
    this.phoneNumber1 = phoneNumber1;
  }


  public GetFullBvnResponseEntity phoneNumber2(String phoneNumber2) {

    
    
    
    
    this.phoneNumber2 = phoneNumber2;
    return this;
  }

   /**
   * Get phoneNumber2
   * @return phoneNumber2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getPhoneNumber2() {
    return phoneNumber2;
  }


  public void setPhoneNumber2(String phoneNumber2) {

    
    
    
    this.phoneNumber2 = phoneNumber2;
  }


  public GetFullBvnResponseEntity reference(String reference) {

    
    
    
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91b126d1-2467-42fc-b8d5-1cbd32257954", value = "")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {

    
    
    
    this.reference = reference;
  }


  public GetFullBvnResponseEntity registrationDate(String registrationDate) {

    
    
    
    
    this.registrationDate = registrationDate;
    return this;
  }

   /**
   * Get registrationDate
   * @return registrationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21-Mar-2018", value = "")

  public String getRegistrationDate() {
    return registrationDate;
  }


  public void setRegistrationDate(String registrationDate) {

    
    
    
    this.registrationDate = registrationDate;
  }


  public GetFullBvnResponseEntity residentialAddress(String residentialAddress) {

    
    
    
    
    this.residentialAddress = residentialAddress;
    return this;
  }

   /**
   * Get residentialAddress
   * @return residentialAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24, AKATA OWODE, ILORIN", value = "")

  public String getResidentialAddress() {
    return residentialAddress;
  }


  public void setResidentialAddress(String residentialAddress) {

    
    
    
    this.residentialAddress = residentialAddress;
  }


  public GetFullBvnResponseEntity stateOfOrigin(String stateOfOrigin) {

    
    
    
    
    this.stateOfOrigin = stateOfOrigin;
    return this;
  }

   /**
   * Get stateOfOrigin
   * @return stateOfOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Osun State", value = "")

  public String getStateOfOrigin() {
    return stateOfOrigin;
  }


  public void setStateOfOrigin(String stateOfOrigin) {

    
    
    
    this.stateOfOrigin = stateOfOrigin;
  }


  public GetFullBvnResponseEntity stateOfResidence(String stateOfResidence) {

    
    
    
    
    this.stateOfResidence = stateOfResidence;
    return this;
  }

   /**
   * Get stateOfResidence
   * @return stateOfResidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kwara State", value = "")

  public String getStateOfResidence() {
    return stateOfResidence;
  }


  public void setStateOfResidence(String stateOfResidence) {

    
    
    
    this.stateOfResidence = stateOfResidence;
  }


  public GetFullBvnResponseEntity watchListed(String watchListed) {

    
    
    
    
    this.watchListed = watchListed;
    return this;
  }

   /**
   * Get watchListed
   * @return watchListed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getWatchListed() {
    return watchListed;
  }


  public void setWatchListed(String watchListed) {

    
    
    
    this.watchListed = watchListed;
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
   * @return the GetFullBvnResponseEntity instance itself
   */
  public GetFullBvnResponseEntity putAdditionalProperty(String key, Object value) {
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
    GetFullBvnResponseEntity getFullBvnResponseEntity = (GetFullBvnResponseEntity) o;
    return Objects.equals(this.title, getFullBvnResponseEntity.title) &&
        Objects.equals(this.bvn, getFullBvnResponseEntity.bvn) &&
        Objects.equals(this.dateOfBirth, getFullBvnResponseEntity.dateOfBirth) &&
        Objects.equals(this.email, getFullBvnResponseEntity.email) &&
        Objects.equals(this.enrollmentBank, getFullBvnResponseEntity.enrollmentBank) &&
        Objects.equals(this.enrollmentBranch, getFullBvnResponseEntity.enrollmentBranch) &&
        Objects.equals(this.firstName, getFullBvnResponseEntity.firstName) &&
        Objects.equals(this.gender, getFullBvnResponseEntity.gender) &&
        Objects.equals(this.image, getFullBvnResponseEntity.image) &&
        Objects.equals(this.lastName, getFullBvnResponseEntity.lastName) &&
        Objects.equals(this.levelOfAccount, getFullBvnResponseEntity.levelOfAccount) &&
        Objects.equals(this.lgaOfOrigin, getFullBvnResponseEntity.lgaOfOrigin) &&
        Objects.equals(this.lgaOfResidence, getFullBvnResponseEntity.lgaOfResidence) &&
        Objects.equals(this.maritalStatus, getFullBvnResponseEntity.maritalStatus) &&
        Objects.equals(this.middleName, getFullBvnResponseEntity.middleName) &&
        Objects.equals(this.nameOnCard, getFullBvnResponseEntity.nameOnCard) &&
        Objects.equals(this.nationality, getFullBvnResponseEntity.nationality) &&
        Objects.equals(this.nin, getFullBvnResponseEntity.nin) &&
        Objects.equals(this.phoneNumber1, getFullBvnResponseEntity.phoneNumber1) &&
        Objects.equals(this.phoneNumber2, getFullBvnResponseEntity.phoneNumber2) &&
        Objects.equals(this.reference, getFullBvnResponseEntity.reference) &&
        Objects.equals(this.registrationDate, getFullBvnResponseEntity.registrationDate) &&
        Objects.equals(this.residentialAddress, getFullBvnResponseEntity.residentialAddress) &&
        Objects.equals(this.stateOfOrigin, getFullBvnResponseEntity.stateOfOrigin) &&
        Objects.equals(this.stateOfResidence, getFullBvnResponseEntity.stateOfResidence) &&
        Objects.equals(this.watchListed, getFullBvnResponseEntity.watchListed)&&
        Objects.equals(this.additionalProperties, getFullBvnResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, bvn, dateOfBirth, email, enrollmentBank, enrollmentBranch, firstName, gender, image, lastName, levelOfAccount, lgaOfOrigin, lgaOfResidence, maritalStatus, middleName, nameOnCard, nationality, nin, phoneNumber1, phoneNumber2, reference, registrationDate, residentialAddress, stateOfOrigin, stateOfResidence, watchListed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFullBvnResponseEntity {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    bvn: ").append(toIndentedString(bvn)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enrollmentBank: ").append(toIndentedString(enrollmentBank)).append("\n");
    sb.append("    enrollmentBranch: ").append(toIndentedString(enrollmentBranch)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    levelOfAccount: ").append(toIndentedString(levelOfAccount)).append("\n");
    sb.append("    lgaOfOrigin: ").append(toIndentedString(lgaOfOrigin)).append("\n");
    sb.append("    lgaOfResidence: ").append(toIndentedString(lgaOfResidence)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    phoneNumber1: ").append(toIndentedString(phoneNumber1)).append("\n");
    sb.append("    phoneNumber2: ").append(toIndentedString(phoneNumber2)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    residentialAddress: ").append(toIndentedString(residentialAddress)).append("\n");
    sb.append("    stateOfOrigin: ").append(toIndentedString(stateOfOrigin)).append("\n");
    sb.append("    stateOfResidence: ").append(toIndentedString(stateOfResidence)).append("\n");
    sb.append("    watchListed: ").append(toIndentedString(watchListed)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("bvn");
    openapiFields.add("date_of_birth");
    openapiFields.add("email");
    openapiFields.add("enrollment_bank");
    openapiFields.add("enrollment_branch");
    openapiFields.add("first_name");
    openapiFields.add("gender");
    openapiFields.add("image");
    openapiFields.add("last_name");
    openapiFields.add("level_of_account");
    openapiFields.add("lga_of_origin");
    openapiFields.add("lga_of_residence");
    openapiFields.add("marital_status");
    openapiFields.add("middle_name");
    openapiFields.add("name_on_card");
    openapiFields.add("nationality");
    openapiFields.add("nin");
    openapiFields.add("phone_number1");
    openapiFields.add("phone_number2");
    openapiFields.add("reference");
    openapiFields.add("registration_date");
    openapiFields.add("residential_address");
    openapiFields.add("state_of_origin");
    openapiFields.add("state_of_residence");
    openapiFields.add("watch_listed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetFullBvnResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetFullBvnResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFullBvnResponseEntity is not found in the empty JSON string", GetFullBvnResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("bvn") != null && !jsonObj.get("bvn").isJsonNull()) && !jsonObj.get("bvn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bvn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bvn").toString()));
      }
      if ((jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) && !jsonObj.get("date_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_birth").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("enrollment_bank") != null && !jsonObj.get("enrollment_bank").isJsonNull()) && !jsonObj.get("enrollment_bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrollment_bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrollment_bank").toString()));
      }
      if ((jsonObj.get("enrollment_branch") != null && !jsonObj.get("enrollment_branch").isJsonNull()) && !jsonObj.get("enrollment_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrollment_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrollment_branch").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("level_of_account") != null && !jsonObj.get("level_of_account").isJsonNull()) && !jsonObj.get("level_of_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level_of_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level_of_account").toString()));
      }
      if ((jsonObj.get("lga_of_origin") != null && !jsonObj.get("lga_of_origin").isJsonNull()) && !jsonObj.get("lga_of_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lga_of_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lga_of_origin").toString()));
      }
      if ((jsonObj.get("lga_of_residence") != null && !jsonObj.get("lga_of_residence").isJsonNull()) && !jsonObj.get("lga_of_residence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lga_of_residence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lga_of_residence").toString()));
      }
      if ((jsonObj.get("marital_status") != null && !jsonObj.get("marital_status").isJsonNull()) && !jsonObj.get("marital_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marital_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marital_status").toString()));
      }
      if ((jsonObj.get("middle_name") != null && !jsonObj.get("middle_name").isJsonNull()) && !jsonObj.get("middle_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_name").toString()));
      }
      if ((jsonObj.get("name_on_card") != null && !jsonObj.get("name_on_card").isJsonNull()) && !jsonObj.get("name_on_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_on_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_on_card").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("nin") != null && !jsonObj.get("nin").isJsonNull()) && !jsonObj.get("nin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nin").toString()));
      }
      if ((jsonObj.get("phone_number1") != null && !jsonObj.get("phone_number1").isJsonNull()) && !jsonObj.get("phone_number1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number1").toString()));
      }
      if ((jsonObj.get("phone_number2") != null && !jsonObj.get("phone_number2").isJsonNull()) && !jsonObj.get("phone_number2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number2").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("registration_date") != null && !jsonObj.get("registration_date").isJsonNull()) && !jsonObj.get("registration_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_date").toString()));
      }
      if ((jsonObj.get("residential_address") != null && !jsonObj.get("residential_address").isJsonNull()) && !jsonObj.get("residential_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residential_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residential_address").toString()));
      }
      if ((jsonObj.get("state_of_origin") != null && !jsonObj.get("state_of_origin").isJsonNull()) && !jsonObj.get("state_of_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_of_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_of_origin").toString()));
      }
      if ((jsonObj.get("state_of_residence") != null && !jsonObj.get("state_of_residence").isJsonNull()) && !jsonObj.get("state_of_residence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_of_residence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_of_residence").toString()));
      }
      if ((jsonObj.get("watch_listed") != null && !jsonObj.get("watch_listed").isJsonNull()) && !jsonObj.get("watch_listed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `watch_listed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("watch_listed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFullBvnResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFullBvnResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFullBvnResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFullBvnResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFullBvnResponseEntity>() {
           @Override
           public void write(JsonWriter out, GetFullBvnResponseEntity value) throws IOException {
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
           public GetFullBvnResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetFullBvnResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetFullBvnResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFullBvnResponseEntity
  * @throws IOException if the JSON string is invalid with respect to GetFullBvnResponseEntity
  */
  public static GetFullBvnResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFullBvnResponseEntity.class);
  }

 /**
  * Convert an instance of GetFullBvnResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

