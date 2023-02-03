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
 * GetDocumentAnalysisResponseEntityData
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetDocumentAnalysisResponseEntityData {
  public static final String SERIALIZED_NAME_A_D_D_R_E_S_S = "ADDRESS";
  @SerializedName(SERIALIZED_NAME_A_D_D_R_E_S_S)
  private String ADDRESS;

  public static final String SERIALIZED_NAME_C_I_T_Y_I_N_A_D_D_R_E_S_S = "CITY_IN_ADDRESS";
  @SerializedName(SERIALIZED_NAME_C_I_T_Y_I_N_A_D_D_R_E_S_S)
  private String CITY_IN_ADDRESS;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "CLASS";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_C_O_U_N_T_Y = "COUNTY";
  @SerializedName(SERIALIZED_NAME_C_O_U_N_T_Y)
  private String COUNTY;

  public static final String SERIALIZED_NAME_D_A_T_E_O_F_B_I_R_T_H = "DATE_OF_BIRTH";
  @SerializedName(SERIALIZED_NAME_D_A_T_E_O_F_B_I_R_T_H)
  private String DATE_OF_BIRTH;

  public static final String SERIALIZED_NAME_D_A_T_E_O_F_I_S_S_U_E = "DATE_OF_ISSUE";
  @SerializedName(SERIALIZED_NAME_D_A_T_E_O_F_I_S_S_U_E)
  private String DATE_OF_ISSUE;

  public static final String SERIALIZED_NAME_D_O_C_U_M_E_N_T_N_U_M_B_E_R = "DOCUMENT_NUMBER";
  @SerializedName(SERIALIZED_NAME_D_O_C_U_M_E_N_T_N_U_M_B_E_R)
  private String DOCUMENT_NUMBER;

  public static final String SERIALIZED_NAME_E_N_D_O_R_S_E_M_E_N_T_S = "ENDORSEMENTS";
  @SerializedName(SERIALIZED_NAME_E_N_D_O_R_S_E_M_E_N_T_S)
  private String ENDORSEMENTS;

  public static final String SERIALIZED_NAME_E_X_P_I_R_A_T_I_O_N_D_A_T_E = "EXPIRATION_DATE";
  @SerializedName(SERIALIZED_NAME_E_X_P_I_R_A_T_I_O_N_D_A_T_E)
  private String EXPIRATION_DATE;

  public static final String SERIALIZED_NAME_F_I_R_S_T_N_A_M_E = "FIRST_NAME";
  @SerializedName(SERIALIZED_NAME_F_I_R_S_T_N_A_M_E)
  private String FIRST_NAME;

  public static final String SERIALIZED_NAME_I_D_T_Y_P_E = "ID_TYPE";
  @SerializedName(SERIALIZED_NAME_I_D_T_Y_P_E)
  private String ID_TYPE;

  public static final String SERIALIZED_NAME_L_A_S_T_N_A_M_E = "LAST_NAME";
  @SerializedName(SERIALIZED_NAME_L_A_S_T_N_A_M_E)
  private String LAST_NAME;

  public static final String SERIALIZED_NAME_M_I_D_D_L_E_N_A_M_E = "MIDDLE_NAME";
  @SerializedName(SERIALIZED_NAME_M_I_D_D_L_E_N_A_M_E)
  private String MIDDLE_NAME;

  public static final String SERIALIZED_NAME_P_L_A_C_E_O_F_B_I_R_T_H = "PLACE_OF_BIRTH";
  @SerializedName(SERIALIZED_NAME_P_L_A_C_E_O_F_B_I_R_T_H)
  private String PLACE_OF_BIRTH;

  public static final String SERIALIZED_NAME_R_E_S_T_R_I_C_T_I_O_N_S = "RESTRICTIONS";
  @SerializedName(SERIALIZED_NAME_R_E_S_T_R_I_C_T_I_O_N_S)
  private String RESTRICTIONS;

  public static final String SERIALIZED_NAME_S_T_A_T_E_I_N_A_D_D_R_E_S_S = "STATE_IN_ADDRESS";
  @SerializedName(SERIALIZED_NAME_S_T_A_T_E_I_N_A_D_D_R_E_S_S)
  private String STATE_IN_ADDRESS;

  public static final String SERIALIZED_NAME_S_T_A_T_E_N_A_M_E = "STATE_NAME";
  @SerializedName(SERIALIZED_NAME_S_T_A_T_E_N_A_M_E)
  private String STATE_NAME;

  public static final String SERIALIZED_NAME_S_U_F_F_I_X = "SUFFIX";
  @SerializedName(SERIALIZED_NAME_S_U_F_F_I_X)
  private String SUFFIX;

  public static final String SERIALIZED_NAME_V_E_T_E_R_A_N = "VETERAN";
  @SerializedName(SERIALIZED_NAME_V_E_T_E_R_A_N)
  private String VETERAN;

  public static final String SERIALIZED_NAME_Z_I_P_C_O_D_E_I_N_A_D_D_R_E_S_S = "ZIP_CODE_IN_ADDRESS";
  @SerializedName(SERIALIZED_NAME_Z_I_P_C_O_D_E_I_N_A_D_D_R_E_S_S)
  private String ZIP_CODE_IN_ADDRESS;

  public GetDocumentAnalysisResponseEntityData() {
  }

  public GetDocumentAnalysisResponseEntityData ADDRESS(String ADDRESS) {
    
    this.ADDRESS = ADDRESS;
    return this;
  }

   /**
   * Get ADDRESS
   * @return ADDRESS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25 GADO NASKO ROAD KUBAWA", value = "")

  public String getADDRESS() {
    return ADDRESS;
  }


  public void setADDRESS(String ADDRESS) {
    this.ADDRESS = ADDRESS;
  }


  public GetDocumentAnalysisResponseEntityData CITY_IN_ADDRESS(String CITY_IN_ADDRESS) {
    
    this.CITY_IN_ADDRESS = CITY_IN_ADDRESS;
    return this;
  }

   /**
   * Get CITY_IN_ADDRESS
   * @return CITY_IN_ADDRESS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABUJA", value = "")

  public String getCITYINADDRESS() {
    return CITY_IN_ADDRESS;
  }


  public void setCITYINADDRESS(String CITY_IN_ADDRESS) {
    this.CITY_IN_ADDRESS = CITY_IN_ADDRESS;
  }


  public GetDocumentAnalysisResponseEntityData propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D", value = "")

  public String getPropertyClass() {
    return propertyClass;
  }


  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public GetDocumentAnalysisResponseEntityData COUNTY(String COUNTY) {
    
    this.COUNTY = COUNTY;
    return this;
  }

   /**
   * Get COUNTY
   * @return COUNTY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getCOUNTY() {
    return COUNTY;
  }


  public void setCOUNTY(String COUNTY) {
    this.COUNTY = COUNTY;
  }


  public GetDocumentAnalysisResponseEntityData DATE_OF_BIRTH(String DATE_OF_BIRTH) {
    
    this.DATE_OF_BIRTH = DATE_OF_BIRTH;
    return this;
  }

   /**
   * Get DATE_OF_BIRTH
   * @return DATE_OF_BIRTH
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18-05-1992", value = "")

  public String getDATEOFBIRTH() {
    return DATE_OF_BIRTH;
  }


  public void setDATEOFBIRTH(String DATE_OF_BIRTH) {
    this.DATE_OF_BIRTH = DATE_OF_BIRTH;
  }


  public GetDocumentAnalysisResponseEntityData DATE_OF_ISSUE(String DATE_OF_ISSUE) {
    
    this.DATE_OF_ISSUE = DATE_OF_ISSUE;
    return this;
  }

   /**
   * Get DATE_OF_ISSUE
   * @return DATE_OF_ISSUE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22-01-2019", value = "")

  public String getDATEOFISSUE() {
    return DATE_OF_ISSUE;
  }


  public void setDATEOFISSUE(String DATE_OF_ISSUE) {
    this.DATE_OF_ISSUE = DATE_OF_ISSUE;
  }


  public GetDocumentAnalysisResponseEntityData DOCUMENT_NUMBER(String DOCUMENT_NUMBER) {
    
    this.DOCUMENT_NUMBER = DOCUMENT_NUMBER;
    return this;
  }

   /**
   * Get DOCUMENT_NUMBER
   * @return DOCUMENT_NUMBER
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FKJ49409AB13", value = "")

  public String getDOCUMENTNUMBER() {
    return DOCUMENT_NUMBER;
  }


  public void setDOCUMENTNUMBER(String DOCUMENT_NUMBER) {
    this.DOCUMENT_NUMBER = DOCUMENT_NUMBER;
  }


  public GetDocumentAnalysisResponseEntityData ENDORSEMENTS(String ENDORSEMENTS) {
    
    this.ENDORSEMENTS = ENDORSEMENTS;
    return this;
  }

   /**
   * Get ENDORSEMENTS
   * @return ENDORSEMENTS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P", value = "")

  public String getENDORSEMENTS() {
    return ENDORSEMENTS;
  }


  public void setENDORSEMENTS(String ENDORSEMENTS) {
    this.ENDORSEMENTS = ENDORSEMENTS;
  }


  public GetDocumentAnalysisResponseEntityData EXPIRATION_DATE(String EXPIRATION_DATE) {
    
    this.EXPIRATION_DATE = EXPIRATION_DATE;
    return this;
  }

   /**
   * Get EXPIRATION_DATE
   * @return EXPIRATION_DATE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18-05-2024", value = "")

  public String getEXPIRATIONDATE() {
    return EXPIRATION_DATE;
  }


  public void setEXPIRATIONDATE(String EXPIRATION_DATE) {
    this.EXPIRATION_DATE = EXPIRATION_DATE;
  }


  public GetDocumentAnalysisResponseEntityData FIRST_NAME(String FIRST_NAME) {
    
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }

   /**
   * Get FIRST_NAME
   * @return FIRST_NAME
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TOBI", value = "")

  public String getFIRSTNAME() {
    return FIRST_NAME;
  }


  public void setFIRSTNAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }


  public GetDocumentAnalysisResponseEntityData ID_TYPE(String ID_TYPE) {
    
    this.ID_TYPE = ID_TYPE;
    return this;
  }

   /**
   * Get ID_TYPE
   * @return ID_TYPE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DRIVER LICENSE FRONT", value = "")

  public String getIDTYPE() {
    return ID_TYPE;
  }


  public void setIDTYPE(String ID_TYPE) {
    this.ID_TYPE = ID_TYPE;
  }


  public GetDocumentAnalysisResponseEntityData LAST_NAME(String LAST_NAME) {
    
    this.LAST_NAME = LAST_NAME;
    return this;
  }

   /**
   * Get LAST_NAME
   * @return LAST_NAME
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OLOLADE", value = "")

  public String getLASTNAME() {
    return LAST_NAME;
  }


  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }


  public GetDocumentAnalysisResponseEntityData MIDDLE_NAME(String MIDDLE_NAME) {
    
    this.MIDDLE_NAME = MIDDLE_NAME;
    return this;
  }

   /**
   * Get MIDDLE_NAME
   * @return MIDDLE_NAME
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OLALEKAN", value = "")

  public String getMIDDLENAME() {
    return MIDDLE_NAME;
  }


  public void setMIDDLENAME(String MIDDLE_NAME) {
    this.MIDDLE_NAME = MIDDLE_NAME;
  }


  public GetDocumentAnalysisResponseEntityData PLACE_OF_BIRTH(String PLACE_OF_BIRTH) {
    
    this.PLACE_OF_BIRTH = PLACE_OF_BIRTH;
    return this;
  }

   /**
   * Get PLACE_OF_BIRTH
   * @return PLACE_OF_BIRTH
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getPLACEOFBIRTH() {
    return PLACE_OF_BIRTH;
  }


  public void setPLACEOFBIRTH(String PLACE_OF_BIRTH) {
    this.PLACE_OF_BIRTH = PLACE_OF_BIRTH;
  }


  public GetDocumentAnalysisResponseEntityData RESTRICTIONS(String RESTRICTIONS) {
    
    this.RESTRICTIONS = RESTRICTIONS;
    return this;
  }

   /**
   * Get RESTRICTIONS
   * @return RESTRICTIONS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getRESTRICTIONS() {
    return RESTRICTIONS;
  }


  public void setRESTRICTIONS(String RESTRICTIONS) {
    this.RESTRICTIONS = RESTRICTIONS;
  }


  public GetDocumentAnalysisResponseEntityData STATE_IN_ADDRESS(String STATE_IN_ADDRESS) {
    
    this.STATE_IN_ADDRESS = STATE_IN_ADDRESS;
    return this;
  }

   /**
   * Get STATE_IN_ADDRESS
   * @return STATE_IN_ADDRESS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getSTATEINADDRESS() {
    return STATE_IN_ADDRESS;
  }


  public void setSTATEINADDRESS(String STATE_IN_ADDRESS) {
    this.STATE_IN_ADDRESS = STATE_IN_ADDRESS;
  }


  public GetDocumentAnalysisResponseEntityData STATE_NAME(String STATE_NAME) {
    
    this.STATE_NAME = STATE_NAME;
    return this;
  }

   /**
   * Get STATE_NAME
   * @return STATE_NAME
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getSTATENAME() {
    return STATE_NAME;
  }


  public void setSTATENAME(String STATE_NAME) {
    this.STATE_NAME = STATE_NAME;
  }


  public GetDocumentAnalysisResponseEntityData SUFFIX(String SUFFIX) {
    
    this.SUFFIX = SUFFIX;
    return this;
  }

   /**
   * Get SUFFIX
   * @return SUFFIX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getSUFFIX() {
    return SUFFIX;
  }


  public void setSUFFIX(String SUFFIX) {
    this.SUFFIX = SUFFIX;
  }


  public GetDocumentAnalysisResponseEntityData VETERAN(String VETERAN) {
    
    this.VETERAN = VETERAN;
    return this;
  }

   /**
   * Get VETERAN
   * @return VETERAN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getVETERAN() {
    return VETERAN;
  }


  public void setVETERAN(String VETERAN) {
    this.VETERAN = VETERAN;
  }


  public GetDocumentAnalysisResponseEntityData ZIP_CODE_IN_ADDRESS(String ZIP_CODE_IN_ADDRESS) {
    
    this.ZIP_CODE_IN_ADDRESS = ZIP_CODE_IN_ADDRESS;
    return this;
  }

   /**
   * Get ZIP_CODE_IN_ADDRESS
   * @return ZIP_CODE_IN_ADDRESS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "08060141707", value = "")

  public String getZIPCODEINADDRESS() {
    return ZIP_CODE_IN_ADDRESS;
  }


  public void setZIPCODEINADDRESS(String ZIP_CODE_IN_ADDRESS) {
    this.ZIP_CODE_IN_ADDRESS = ZIP_CODE_IN_ADDRESS;
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
   * @return the GetDocumentAnalysisResponseEntityData instance itself
   */
  public GetDocumentAnalysisResponseEntityData putAdditionalProperty(String key, Object value) {
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
    GetDocumentAnalysisResponseEntityData getDocumentAnalysisResponseEntityData = (GetDocumentAnalysisResponseEntityData) o;
    return Objects.equals(this.ADDRESS, getDocumentAnalysisResponseEntityData.ADDRESS) &&
        Objects.equals(this.CITY_IN_ADDRESS, getDocumentAnalysisResponseEntityData.CITY_IN_ADDRESS) &&
        Objects.equals(this.propertyClass, getDocumentAnalysisResponseEntityData.propertyClass) &&
        Objects.equals(this.COUNTY, getDocumentAnalysisResponseEntityData.COUNTY) &&
        Objects.equals(this.DATE_OF_BIRTH, getDocumentAnalysisResponseEntityData.DATE_OF_BIRTH) &&
        Objects.equals(this.DATE_OF_ISSUE, getDocumentAnalysisResponseEntityData.DATE_OF_ISSUE) &&
        Objects.equals(this.DOCUMENT_NUMBER, getDocumentAnalysisResponseEntityData.DOCUMENT_NUMBER) &&
        Objects.equals(this.ENDORSEMENTS, getDocumentAnalysisResponseEntityData.ENDORSEMENTS) &&
        Objects.equals(this.EXPIRATION_DATE, getDocumentAnalysisResponseEntityData.EXPIRATION_DATE) &&
        Objects.equals(this.FIRST_NAME, getDocumentAnalysisResponseEntityData.FIRST_NAME) &&
        Objects.equals(this.ID_TYPE, getDocumentAnalysisResponseEntityData.ID_TYPE) &&
        Objects.equals(this.LAST_NAME, getDocumentAnalysisResponseEntityData.LAST_NAME) &&
        Objects.equals(this.MIDDLE_NAME, getDocumentAnalysisResponseEntityData.MIDDLE_NAME) &&
        Objects.equals(this.PLACE_OF_BIRTH, getDocumentAnalysisResponseEntityData.PLACE_OF_BIRTH) &&
        Objects.equals(this.RESTRICTIONS, getDocumentAnalysisResponseEntityData.RESTRICTIONS) &&
        Objects.equals(this.STATE_IN_ADDRESS, getDocumentAnalysisResponseEntityData.STATE_IN_ADDRESS) &&
        Objects.equals(this.STATE_NAME, getDocumentAnalysisResponseEntityData.STATE_NAME) &&
        Objects.equals(this.SUFFIX, getDocumentAnalysisResponseEntityData.SUFFIX) &&
        Objects.equals(this.VETERAN, getDocumentAnalysisResponseEntityData.VETERAN) &&
        Objects.equals(this.ZIP_CODE_IN_ADDRESS, getDocumentAnalysisResponseEntityData.ZIP_CODE_IN_ADDRESS)&&
        Objects.equals(this.additionalProperties, getDocumentAnalysisResponseEntityData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ADDRESS, CITY_IN_ADDRESS, propertyClass, COUNTY, DATE_OF_BIRTH, DATE_OF_ISSUE, DOCUMENT_NUMBER, ENDORSEMENTS, EXPIRATION_DATE, FIRST_NAME, ID_TYPE, LAST_NAME, MIDDLE_NAME, PLACE_OF_BIRTH, RESTRICTIONS, STATE_IN_ADDRESS, STATE_NAME, SUFFIX, VETERAN, ZIP_CODE_IN_ADDRESS, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentAnalysisResponseEntityData {\n");
    sb.append("    ADDRESS: ").append(toIndentedString(ADDRESS)).append("\n");
    sb.append("    CITY_IN_ADDRESS: ").append(toIndentedString(CITY_IN_ADDRESS)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    COUNTY: ").append(toIndentedString(COUNTY)).append("\n");
    sb.append("    DATE_OF_BIRTH: ").append(toIndentedString(DATE_OF_BIRTH)).append("\n");
    sb.append("    DATE_OF_ISSUE: ").append(toIndentedString(DATE_OF_ISSUE)).append("\n");
    sb.append("    DOCUMENT_NUMBER: ").append(toIndentedString(DOCUMENT_NUMBER)).append("\n");
    sb.append("    ENDORSEMENTS: ").append(toIndentedString(ENDORSEMENTS)).append("\n");
    sb.append("    EXPIRATION_DATE: ").append(toIndentedString(EXPIRATION_DATE)).append("\n");
    sb.append("    FIRST_NAME: ").append(toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    ID_TYPE: ").append(toIndentedString(ID_TYPE)).append("\n");
    sb.append("    LAST_NAME: ").append(toIndentedString(LAST_NAME)).append("\n");
    sb.append("    MIDDLE_NAME: ").append(toIndentedString(MIDDLE_NAME)).append("\n");
    sb.append("    PLACE_OF_BIRTH: ").append(toIndentedString(PLACE_OF_BIRTH)).append("\n");
    sb.append("    RESTRICTIONS: ").append(toIndentedString(RESTRICTIONS)).append("\n");
    sb.append("    STATE_IN_ADDRESS: ").append(toIndentedString(STATE_IN_ADDRESS)).append("\n");
    sb.append("    STATE_NAME: ").append(toIndentedString(STATE_NAME)).append("\n");
    sb.append("    SUFFIX: ").append(toIndentedString(SUFFIX)).append("\n");
    sb.append("    VETERAN: ").append(toIndentedString(VETERAN)).append("\n");
    sb.append("    ZIP_CODE_IN_ADDRESS: ").append(toIndentedString(ZIP_CODE_IN_ADDRESS)).append("\n");
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
    openapiFields.add("ADDRESS");
    openapiFields.add("CITY_IN_ADDRESS");
    openapiFields.add("CLASS");
    openapiFields.add("COUNTY");
    openapiFields.add("DATE_OF_BIRTH");
    openapiFields.add("DATE_OF_ISSUE");
    openapiFields.add("DOCUMENT_NUMBER");
    openapiFields.add("ENDORSEMENTS");
    openapiFields.add("EXPIRATION_DATE");
    openapiFields.add("FIRST_NAME");
    openapiFields.add("ID_TYPE");
    openapiFields.add("LAST_NAME");
    openapiFields.add("MIDDLE_NAME");
    openapiFields.add("PLACE_OF_BIRTH");
    openapiFields.add("RESTRICTIONS");
    openapiFields.add("STATE_IN_ADDRESS");
    openapiFields.add("STATE_NAME");
    openapiFields.add("SUFFIX");
    openapiFields.add("VETERAN");
    openapiFields.add("ZIP_CODE_IN_ADDRESS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDocumentAnalysisResponseEntityData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetDocumentAnalysisResponseEntityData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDocumentAnalysisResponseEntityData is not found in the empty JSON string", GetDocumentAnalysisResponseEntityData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("ADDRESS") != null && !jsonObj.get("ADDRESS").isJsonNull()) && !jsonObj.get("ADDRESS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ADDRESS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ADDRESS").toString()));
      }
      if ((jsonObj.get("CITY_IN_ADDRESS") != null && !jsonObj.get("CITY_IN_ADDRESS").isJsonNull()) && !jsonObj.get("CITY_IN_ADDRESS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CITY_IN_ADDRESS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CITY_IN_ADDRESS").toString()));
      }
      if ((jsonObj.get("CLASS") != null && !jsonObj.get("CLASS").isJsonNull()) && !jsonObj.get("CLASS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CLASS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CLASS").toString()));
      }
      if ((jsonObj.get("COUNTY") != null && !jsonObj.get("COUNTY").isJsonNull()) && !jsonObj.get("COUNTY").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `COUNTY` to be a primitive type in the JSON string but got `%s`", jsonObj.get("COUNTY").toString()));
      }
      if ((jsonObj.get("DATE_OF_BIRTH") != null && !jsonObj.get("DATE_OF_BIRTH").isJsonNull()) && !jsonObj.get("DATE_OF_BIRTH").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DATE_OF_BIRTH` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DATE_OF_BIRTH").toString()));
      }
      if ((jsonObj.get("DATE_OF_ISSUE") != null && !jsonObj.get("DATE_OF_ISSUE").isJsonNull()) && !jsonObj.get("DATE_OF_ISSUE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DATE_OF_ISSUE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DATE_OF_ISSUE").toString()));
      }
      if ((jsonObj.get("DOCUMENT_NUMBER") != null && !jsonObj.get("DOCUMENT_NUMBER").isJsonNull()) && !jsonObj.get("DOCUMENT_NUMBER").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DOCUMENT_NUMBER` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DOCUMENT_NUMBER").toString()));
      }
      if ((jsonObj.get("ENDORSEMENTS") != null && !jsonObj.get("ENDORSEMENTS").isJsonNull()) && !jsonObj.get("ENDORSEMENTS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ENDORSEMENTS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ENDORSEMENTS").toString()));
      }
      if ((jsonObj.get("EXPIRATION_DATE") != null && !jsonObj.get("EXPIRATION_DATE").isJsonNull()) && !jsonObj.get("EXPIRATION_DATE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EXPIRATION_DATE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EXPIRATION_DATE").toString()));
      }
      if ((jsonObj.get("FIRST_NAME") != null && !jsonObj.get("FIRST_NAME").isJsonNull()) && !jsonObj.get("FIRST_NAME").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FIRST_NAME` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FIRST_NAME").toString()));
      }
      if ((jsonObj.get("ID_TYPE") != null && !jsonObj.get("ID_TYPE").isJsonNull()) && !jsonObj.get("ID_TYPE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID_TYPE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID_TYPE").toString()));
      }
      if ((jsonObj.get("LAST_NAME") != null && !jsonObj.get("LAST_NAME").isJsonNull()) && !jsonObj.get("LAST_NAME").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LAST_NAME` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LAST_NAME").toString()));
      }
      if ((jsonObj.get("MIDDLE_NAME") != null && !jsonObj.get("MIDDLE_NAME").isJsonNull()) && !jsonObj.get("MIDDLE_NAME").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MIDDLE_NAME` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MIDDLE_NAME").toString()));
      }
      if ((jsonObj.get("PLACE_OF_BIRTH") != null && !jsonObj.get("PLACE_OF_BIRTH").isJsonNull()) && !jsonObj.get("PLACE_OF_BIRTH").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PLACE_OF_BIRTH` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PLACE_OF_BIRTH").toString()));
      }
      if ((jsonObj.get("RESTRICTIONS") != null && !jsonObj.get("RESTRICTIONS").isJsonNull()) && !jsonObj.get("RESTRICTIONS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RESTRICTIONS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RESTRICTIONS").toString()));
      }
      if ((jsonObj.get("STATE_IN_ADDRESS") != null && !jsonObj.get("STATE_IN_ADDRESS").isJsonNull()) && !jsonObj.get("STATE_IN_ADDRESS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `STATE_IN_ADDRESS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("STATE_IN_ADDRESS").toString()));
      }
      if ((jsonObj.get("STATE_NAME") != null && !jsonObj.get("STATE_NAME").isJsonNull()) && !jsonObj.get("STATE_NAME").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `STATE_NAME` to be a primitive type in the JSON string but got `%s`", jsonObj.get("STATE_NAME").toString()));
      }
      if ((jsonObj.get("SUFFIX") != null && !jsonObj.get("SUFFIX").isJsonNull()) && !jsonObj.get("SUFFIX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SUFFIX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SUFFIX").toString()));
      }
      if ((jsonObj.get("VETERAN") != null && !jsonObj.get("VETERAN").isJsonNull()) && !jsonObj.get("VETERAN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VETERAN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VETERAN").toString()));
      }
      if ((jsonObj.get("ZIP_CODE_IN_ADDRESS") != null && !jsonObj.get("ZIP_CODE_IN_ADDRESS").isJsonNull()) && !jsonObj.get("ZIP_CODE_IN_ADDRESS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ZIP_CODE_IN_ADDRESS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ZIP_CODE_IN_ADDRESS").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDocumentAnalysisResponseEntityData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDocumentAnalysisResponseEntityData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDocumentAnalysisResponseEntityData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDocumentAnalysisResponseEntityData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDocumentAnalysisResponseEntityData>() {
           @Override
           public void write(JsonWriter out, GetDocumentAnalysisResponseEntityData value) throws IOException {
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
           public GetDocumentAnalysisResponseEntityData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetDocumentAnalysisResponseEntityData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetDocumentAnalysisResponseEntityData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDocumentAnalysisResponseEntityData
  * @throws IOException if the JSON string is invalid with respect to GetDocumentAnalysisResponseEntityData
  */
  public static GetDocumentAnalysisResponseEntityData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDocumentAnalysisResponseEntityData.class);
  }

 /**
  * Convert an instance of GetDocumentAnalysisResponseEntityData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

