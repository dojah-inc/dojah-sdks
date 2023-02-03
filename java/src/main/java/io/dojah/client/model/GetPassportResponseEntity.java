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
 * GetPassportResponseEntity
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetPassportResponseEntity {
  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiry_date";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_DATE_OF_BIRTH_MATCH = "is_date_of_birth_match";
  @SerializedName(SERIALIZED_NAME_IS_DATE_OF_BIRTH_MATCH)
  private Boolean isDateOfBirthMatch;

  public static final String SERIALIZED_NAME_IS_FIRST_NAME_MATCH = "is_first_name_match";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_NAME_MATCH)
  private Boolean isFirstNameMatch;

  public static final String SERIALIZED_NAME_IS_LAST_NAME_MATCH = "is_last_name_match";
  @SerializedName(SERIALIZED_NAME_IS_LAST_NAME_MATCH)
  private Boolean isLastNameMatch;

  public static final String SERIALIZED_NAME_IS_MIDDLE_NAME_MATCH = "is_middle_name_match";
  @SerializedName(SERIALIZED_NAME_IS_MIDDLE_NAME_MATCH)
  private Boolean isMiddleNameMatch;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private String picture;

  public static final String SERIALIZED_NAME_PLACE_OF_BIRTH = "place_of_birth";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_BIRTH)
  private String placeOfBirth;

  public static final String SERIALIZED_NAME_PLACE_OF_ISSUE = "place_of_issue";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_ISSUE)
  private String placeOfIssue;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BigDecimal status;

  public GetPassportResponseEntity() {
  }

  public GetPassportResponseEntity dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1990-04-05", value = "")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public GetPassportResponseEntity expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-10-03", value = "")

  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public GetPassportResponseEntity firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public GetPassportResponseEntity gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MALE", value = "")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public GetPassportResponseEntity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "G0000000", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GetPassportResponseEntity isDateOfBirthMatch(Boolean isDateOfBirthMatch) {
    
    this.isDateOfBirthMatch = isDateOfBirthMatch;
    return this;
  }

   /**
   * Get isDateOfBirthMatch
   * @return isDateOfBirthMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsDateOfBirthMatch() {
    return isDateOfBirthMatch;
  }


  public void setIsDateOfBirthMatch(Boolean isDateOfBirthMatch) {
    this.isDateOfBirthMatch = isDateOfBirthMatch;
  }


  public GetPassportResponseEntity isFirstNameMatch(Boolean isFirstNameMatch) {
    
    this.isFirstNameMatch = isFirstNameMatch;
    return this;
  }

   /**
   * Get isFirstNameMatch
   * @return isFirstNameMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsFirstNameMatch() {
    return isFirstNameMatch;
  }


  public void setIsFirstNameMatch(Boolean isFirstNameMatch) {
    this.isFirstNameMatch = isFirstNameMatch;
  }


  public GetPassportResponseEntity isLastNameMatch(Boolean isLastNameMatch) {
    
    this.isLastNameMatch = isLastNameMatch;
    return this;
  }

   /**
   * Get isLastNameMatch
   * @return isLastNameMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsLastNameMatch() {
    return isLastNameMatch;
  }


  public void setIsLastNameMatch(Boolean isLastNameMatch) {
    this.isLastNameMatch = isLastNameMatch;
  }


  public GetPassportResponseEntity isMiddleNameMatch(Boolean isMiddleNameMatch) {
    
    this.isMiddleNameMatch = isMiddleNameMatch;
    return this;
  }

   /**
   * Get isMiddleNameMatch
   * @return isMiddleNameMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsMiddleNameMatch() {
    return isMiddleNameMatch;
  }


  public void setIsMiddleNameMatch(Boolean isMiddleNameMatch) {
    this.isMiddleNameMatch = isMiddleNameMatch;
  }


  public GetPassportResponseEntity issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-03", value = "")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public GetPassportResponseEntity lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public GetPassportResponseEntity middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jack", value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public GetPassportResponseEntity picture(String picture) {
    
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<base64 encoded image>", value = "")

  public String getPicture() {
    return picture;
  }


  public void setPicture(String picture) {
    this.picture = picture;
  }


  public GetPassportResponseEntity placeOfBirth(String placeOfBirth) {
    
    this.placeOfBirth = placeOfBirth;
    return this;
  }

   /**
   * Get placeOfBirth
   * @return placeOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TEMA", value = "")

  public String getPlaceOfBirth() {
    return placeOfBirth;
  }


  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }


  public GetPassportResponseEntity placeOfIssue(String placeOfIssue) {
    
    this.placeOfIssue = placeOfIssue;
    return this;
  }

   /**
   * Get placeOfIssue
   * @return placeOfIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACCRA", value = "")

  public String getPlaceOfIssue() {
    return placeOfIssue;
  }


  public void setPlaceOfIssue(String placeOfIssue) {
    this.placeOfIssue = placeOfIssue;
  }


  public GetPassportResponseEntity status(BigDecimal status) {
    
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
   * @return the GetPassportResponseEntity instance itself
   */
  public GetPassportResponseEntity putAdditionalProperty(String key, Object value) {
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
    GetPassportResponseEntity getPassportResponseEntity = (GetPassportResponseEntity) o;
    return Objects.equals(this.dateOfBirth, getPassportResponseEntity.dateOfBirth) &&
        Objects.equals(this.expiryDate, getPassportResponseEntity.expiryDate) &&
        Objects.equals(this.firstName, getPassportResponseEntity.firstName) &&
        Objects.equals(this.gender, getPassportResponseEntity.gender) &&
        Objects.equals(this.id, getPassportResponseEntity.id) &&
        Objects.equals(this.isDateOfBirthMatch, getPassportResponseEntity.isDateOfBirthMatch) &&
        Objects.equals(this.isFirstNameMatch, getPassportResponseEntity.isFirstNameMatch) &&
        Objects.equals(this.isLastNameMatch, getPassportResponseEntity.isLastNameMatch) &&
        Objects.equals(this.isMiddleNameMatch, getPassportResponseEntity.isMiddleNameMatch) &&
        Objects.equals(this.issueDate, getPassportResponseEntity.issueDate) &&
        Objects.equals(this.lastName, getPassportResponseEntity.lastName) &&
        Objects.equals(this.middleName, getPassportResponseEntity.middleName) &&
        Objects.equals(this.picture, getPassportResponseEntity.picture) &&
        Objects.equals(this.placeOfBirth, getPassportResponseEntity.placeOfBirth) &&
        Objects.equals(this.placeOfIssue, getPassportResponseEntity.placeOfIssue) &&
        Objects.equals(this.status, getPassportResponseEntity.status)&&
        Objects.equals(this.additionalProperties, getPassportResponseEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, expiryDate, firstName, gender, id, isDateOfBirthMatch, isFirstNameMatch, isLastNameMatch, isMiddleNameMatch, issueDate, lastName, middleName, picture, placeOfBirth, placeOfIssue, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPassportResponseEntity {\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDateOfBirthMatch: ").append(toIndentedString(isDateOfBirthMatch)).append("\n");
    sb.append("    isFirstNameMatch: ").append(toIndentedString(isFirstNameMatch)).append("\n");
    sb.append("    isLastNameMatch: ").append(toIndentedString(isLastNameMatch)).append("\n");
    sb.append("    isMiddleNameMatch: ").append(toIndentedString(isMiddleNameMatch)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    placeOfIssue: ").append(toIndentedString(placeOfIssue)).append("\n");
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
    openapiFields.add("date_of_birth");
    openapiFields.add("expiry_date");
    openapiFields.add("first_name");
    openapiFields.add("gender");
    openapiFields.add("id");
    openapiFields.add("is_date_of_birth_match");
    openapiFields.add("is_first_name_match");
    openapiFields.add("is_last_name_match");
    openapiFields.add("is_middle_name_match");
    openapiFields.add("issue_date");
    openapiFields.add("last_name");
    openapiFields.add("middle_name");
    openapiFields.add("picture");
    openapiFields.add("place_of_birth");
    openapiFields.add("place_of_issue");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetPassportResponseEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetPassportResponseEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPassportResponseEntity is not found in the empty JSON string", GetPassportResponseEntity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) && !jsonObj.get("date_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_birth").toString()));
      }
      if ((jsonObj.get("expiry_date") != null && !jsonObj.get("expiry_date").isJsonNull()) && !jsonObj.get("expiry_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiry_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiry_date").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("issue_date") != null && !jsonObj.get("issue_date").isJsonNull()) && !jsonObj.get("issue_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_date").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("middle_name") != null && !jsonObj.get("middle_name").isJsonNull()) && !jsonObj.get("middle_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_name").toString()));
      }
      if ((jsonObj.get("picture") != null && !jsonObj.get("picture").isJsonNull()) && !jsonObj.get("picture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picture").toString()));
      }
      if ((jsonObj.get("place_of_birth") != null && !jsonObj.get("place_of_birth").isJsonNull()) && !jsonObj.get("place_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_of_birth").toString()));
      }
      if ((jsonObj.get("place_of_issue") != null && !jsonObj.get("place_of_issue").isJsonNull()) && !jsonObj.get("place_of_issue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_of_issue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_of_issue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPassportResponseEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPassportResponseEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPassportResponseEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPassportResponseEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPassportResponseEntity>() {
           @Override
           public void write(JsonWriter out, GetPassportResponseEntity value) throws IOException {
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
           public GetPassportResponseEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetPassportResponseEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetPassportResponseEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetPassportResponseEntity
  * @throws IOException if the JSON string is invalid with respect to GetPassportResponseEntity
  */
  public static GetPassportResponseEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPassportResponseEntity.class);
  }

 /**
  * Convert an instance of GetPassportResponseEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

