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
 * GetNubanResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetNubanResponseEntity {
  public static final String SERIALIZED_NAME_ACCOUNT_CURRENCY = "account_currency";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CURRENCY)
  private String accountCurrency;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_ADDRESS1 = "address_1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address_2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_COUNTRY_OF_BIRTH = "country_of_birth";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_BIRTH)
  private String countryOfBirth;

  public static final String SERIALIZED_NAME_COUNTRY_OF_ISSUE = "country_of_issue";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_ISSUE)
  private String countryOfIssue;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiry_date";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_IDENTITY_NUMBER = "identity_number";
  @SerializedName(SERIALIZED_NAME_IDENTITY_NUMBER)
  private String identityNumber;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_OTHER_NAMES = "other_names";
  @SerializedName(SERIALIZED_NAME_OTHER_NAMES)
  private String otherNames;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public GetNubanResponseEntity() {
  }

  public GetNubanResponseEntity accountCurrency(String accountCurrency) {
    
    this.accountCurrency = accountCurrency;
    return this;
  }

   /**
   * Get accountCurrency
   * @return accountCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "566", value = "")

  public String getAccountCurrency() {
    return accountCurrency;
  }


  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


  public GetNubanResponseEntity accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MOSHOOD KOLAWOLE SALIU", value = "")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public GetNubanResponseEntity accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3046507407", value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public GetNubanResponseEntity accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public GetNubanResponseEntity address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = ".", value = "")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public GetNubanResponseEntity address2(String address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getAddress2() {
    return address2;
  }


  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public GetNubanResponseEntity city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LAGOS", value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public GetNubanResponseEntity countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NG", value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public GetNubanResponseEntity countryOfBirth(String countryOfBirth) {
    
    this.countryOfBirth = countryOfBirth;
    return this;
  }

   /**
   * Get countryOfBirth
   * @return countryOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NIGERIA", value = "")

  public String getCountryOfBirth() {
    return countryOfBirth;
  }


  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }


  public GetNubanResponseEntity countryOfIssue(String countryOfIssue) {
    
    this.countryOfIssue = countryOfIssue;
    return this;
  }

   /**
   * Get countryOfIssue
   * @return countryOfIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nigeria", value = "")

  public String getCountryOfIssue() {
    return countryOfIssue;
  }


  public void setCountryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
  }


  public GetNubanResponseEntity dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10/06/1982", value = "")

  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public GetNubanResponseEntity expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public GetNubanResponseEntity firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MOSHOOD", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public GetNubanResponseEntity identityNumber(String identityNumber) {
    
    this.identityNumber = identityNumber;
    return this;
  }

   /**
   * Get identityNumber
   * @return identityNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22271325556", value = "")

  public String getIdentityNumber() {
    return identityNumber;
  }


  public void setIdentityNumber(String identityNumber) {
    this.identityNumber = identityNumber;
  }


  public GetNubanResponseEntity identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BVN", value = "")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public GetNubanResponseEntity lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SALIU", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public GetNubanResponseEntity nationality(String nationality) {
    
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OTHRS", value = "")

  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public GetNubanResponseEntity otherNames(String otherNames) {
    
    this.otherNames = otherNames;
    return this;
  }

   /**
   * Get otherNames
   * @return otherNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KOLAWOLE", value = "")

  public String getOtherNames() {
    return otherNames;
  }


  public void setOtherNames(String otherNames) {
    this.otherNames = otherNames;
  }


  public GetNubanResponseEntity phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2348137877844", value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public GetNubanResponseEntity postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234", value = "")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public GetNubanResponseEntity reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91b360c9-0360-44b1-978f-ef56ad8fa2a2", value = "")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public GetNubanResponseEntity stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LAGOS", value = "")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
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
   * @return the GetNubanResponseEntity instance itself
   */
  public GetNubanResponseEntity putAdditionalProperty(String key, Object value) {
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
    GetNubanResponseEntity getNubanResponseEntity = (GetNubanResponseEntity) o;
    return Objects.equals(this.accountCurrency, getNubanResponseEntity.accountCurrency) &&
        Objects.equals(this.accountName, getNubanResponseEntity.accountName) &&
        Objects.equals(this.accountNumber, getNubanResponseEntity.accountNumber) &&
        Objects.equals(this.accountType, getNubanResponseEntity.accountType) &&
        Objects.equals(this.address1, getNubanResponseEntity.address1) &&
        Objects.equals(this.address2, getNubanResponseEntity.address2) &&
        Objects.equals(this.city, getNubanResponseEntity.city) &&
        Objects.equals(this.countryCode, getNubanResponseEntity.countryCode) &&
        Objects.equals(this.countryOfBirth, getNubanResponseEntity.countryOfBirth) &&
        Objects.equals(this.countryOfIssue, getNubanResponseEntity.countryOfIssue) &&
        Objects.equals(this.dob, getNubanResponseEntity.dob) &&
        Objects.equals(this.expiryDate, getNubanResponseEntity.expiryDate) &&
        Objects.equals(this.firstName, getNubanResponseEntity.firstName) &&
        Objects.equals(this.identityNumber, getNubanResponseEntity.identityNumber) &&
        Objects.equals(this.identityType, getNubanResponseEntity.identityType) &&
        Objects.equals(this.lastName, getNubanResponseEntity.lastName) &&
        Objects.equals(this.nationality, getNubanResponseEntity.nationality) &&
        Objects.equals(this.otherNames, getNubanResponseEntity.otherNames) &&
        Objects.equals(this.phone, getNubanResponseEntity.phone) &&
        Objects.equals(this.postalCode, getNubanResponseEntity.postalCode) &&
        Objects.equals(this.reference, getNubanResponseEntity.reference) &&
        Objects.equals(this.stateCode, getNubanResponseEntity.stateCode)&&
        Objects.equals(this.additionalProperties, getNubanResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCurrency, accountName, accountNumber, accountType, address1, address2, city, countryCode, countryOfBirth, countryOfIssue, dob, expiryDate, firstName, identityNumber, identityType, lastName, nationality, otherNames, phone, postalCode, reference, stateCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNubanResponseEntity {\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    countryOfIssue: ").append(toIndentedString(countryOfIssue)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    identityNumber: ").append(toIndentedString(identityNumber)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    otherNames: ").append(toIndentedString(otherNames)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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
    openapiFields.add("account_currency");
    openapiFields.add("account_name");
    openapiFields.add("account_number");
    openapiFields.add("account_type");
    openapiFields.add("address_1");
    openapiFields.add("address_2");
    openapiFields.add("city");
    openapiFields.add("country_code");
    openapiFields.add("country_of_birth");
    openapiFields.add("country_of_issue");
    openapiFields.add("dob");
    openapiFields.add("expiry_date");
    openapiFields.add("first_name");
    openapiFields.add("identity_number");
    openapiFields.add("identity_type");
    openapiFields.add("last_name");
    openapiFields.add("nationality");
    openapiFields.add("other_names");
    openapiFields.add("phone");
    openapiFields.add("postal_code");
    openapiFields.add("reference");
    openapiFields.add("state_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetNubanResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetNubanResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetNubanResponseEntity is not found in the empty JSON string", GetNubanResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("account_currency") != null && !jsonObj.get("account_currency").isJsonNull()) && !jsonObj.get("account_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_currency").toString()));
      }
      if ((jsonObj.get("account_name") != null && !jsonObj.get("account_name").isJsonNull()) && !jsonObj.get("account_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_name").toString()));
      }
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("address_1") != null && !jsonObj.get("address_1").isJsonNull()) && !jsonObj.get("address_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_1").toString()));
      }
      if ((jsonObj.get("address_2") != null && !jsonObj.get("address_2").isJsonNull()) && !jsonObj.get("address_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("country_of_birth") != null && !jsonObj.get("country_of_birth").isJsonNull()) && !jsonObj.get("country_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_of_birth").toString()));
      }
      if ((jsonObj.get("country_of_issue") != null && !jsonObj.get("country_of_issue").isJsonNull()) && !jsonObj.get("country_of_issue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_of_issue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_of_issue").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("expiry_date") != null && !jsonObj.get("expiry_date").isJsonNull()) && !jsonObj.get("expiry_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiry_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiry_date").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("identity_number") != null && !jsonObj.get("identity_number").isJsonNull()) && !jsonObj.get("identity_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_number").toString()));
      }
      if ((jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonNull()) && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("other_names") != null && !jsonObj.get("other_names").isJsonNull()) && !jsonObj.get("other_names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_names").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonNull()) && !jsonObj.get("state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetNubanResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetNubanResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetNubanResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetNubanResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetNubanResponseEntity>() {
           @Override
           public void write(JsonWriter out, GetNubanResponseEntity value) throws IOException {
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
           public GetNubanResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetNubanResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetNubanResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetNubanResponseEntity
  * @throws IOException if the JSON string is invalid with respect to GetNubanResponseEntity
  */
  public static GetNubanResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetNubanResponseEntity.class);
  }

 /**
  * Convert an instance of GetNubanResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

