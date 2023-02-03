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


package io.dojah.client.api;

import io.dojah.client.ApiException;
import io.dojah.client.model.GetDriversLicenseResponse;
import io.dojah.client.model.GetPassportResponse;
import io.dojah.client.model.GetSsnitResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GhKycApi
 */
@Disabled
public class GhKycApiTest {

    private final GhKycApi api = new GhKycApi();

    /**
     * Driver&#39;s License
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDriversLicenseTest() throws ApiException {
        String id = null;
        String fullName = null;
        String dateOfBirth = null;
        GetDriversLicenseResponse response = api.getDriversLicense(id, fullName, dateOfBirth);
        // TODO: test validations
    }

    /**
     * Passport
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPassportTest() throws ApiException {
        String id = null;
        String firstName = null;
        String lastName = null;
        String middleName = null;
        String dateOfBirth = null;
        GetPassportResponse response = api.getPassport(id, firstName, lastName, middleName, dateOfBirth);
        // TODO: test validations
    }

    /**
     * SSNIT
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSsnitTest() throws ApiException {
        String id = null;
        String fullName = null;
        String dateOfBirth = null;
        GetSsnitResponse response = api.getSsnit(id, fullName, dateOfBirth);
        // TODO: test validations
    }

}
