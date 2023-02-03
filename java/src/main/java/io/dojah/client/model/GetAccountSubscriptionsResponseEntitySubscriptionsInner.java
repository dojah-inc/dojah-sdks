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
import java.math.BigDecimal;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import io.dojah.client.JSON;

@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetAccountSubscriptionsResponseEntitySubscriptionsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetAccountSubscriptionsResponseEntitySubscriptionsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetAccountSubscriptionsResponseEntitySubscriptionsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetAccountSubscriptionsResponseEntitySubscriptionsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BigDecimal> adapterBigDecimal = gson.getDelegateAdapter(this, TypeToken.get(BigDecimal.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            return (TypeAdapter<T>) new TypeAdapter<GetAccountSubscriptionsResponseEntitySubscriptionsInner>() {
                @Override
                public void write(JsonWriter out, GetAccountSubscriptionsResponseEntitySubscriptionsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BigDecimal`
                    if (value.getActualInstance() instanceof BigDecimal) {
                        JsonObject obj = adapterBigDecimal.toJsonTree((BigDecimal)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonObject obj = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BigDecimal, String");
                }

                @Override
                public GetAccountSubscriptionsResponseEntitySubscriptionsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BigDecimal
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BigDecimal.validateJsonObject(jsonObject);
                        actualAdapter = adapterBigDecimal;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BigDecimal'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BigDecimal failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BigDecimal'", e);
                    }

                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        String.validateJsonObject(jsonObject);
                        actualAdapter = adapterString;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }

                    if (match == 1) {
                        GetAccountSubscriptionsResponseEntitySubscriptionsInner ret = new GetAccountSubscriptionsResponseEntitySubscriptionsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetAccountSubscriptionsResponseEntitySubscriptionsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetAccountSubscriptionsResponseEntitySubscriptionsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public GetAccountSubscriptionsResponseEntitySubscriptionsInner(BigDecimal o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetAccountSubscriptionsResponseEntitySubscriptionsInner(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BigDecimal", new GenericType<BigDecimal>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetAccountSubscriptionsResponseEntitySubscriptionsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BigDecimal, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BigDecimal) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BigDecimal, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * BigDecimal, String
     *
     * @return The actual instance (BigDecimal, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BigDecimal`. If the actual instance is not `BigDecimal`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BigDecimal`
     * @throws ClassCastException if the instance is not `BigDecimal`
     */
    public BigDecimal getBigDecimal() throws ClassCastException {
        return (BigDecimal)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAccountSubscriptionsResponseEntitySubscriptionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with BigDecimal
    try {
      BigDecimal.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for BigDecimal failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with String
    try {
      String.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetAccountSubscriptionsResponseEntitySubscriptionsInner with oneOf schemas: BigDecimal, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetAccountSubscriptionsResponseEntitySubscriptionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAccountSubscriptionsResponseEntitySubscriptionsInner
  * @throws IOException if the JSON string is invalid with respect to GetAccountSubscriptionsResponseEntitySubscriptionsInner
  */
  public static GetAccountSubscriptionsResponseEntitySubscriptionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccountSubscriptionsResponseEntitySubscriptionsInner.class);
  }

 /**
  * Convert an instance of GetAccountSubscriptionsResponseEntitySubscriptionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
