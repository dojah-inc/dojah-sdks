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


package com.konfigthis.dojah.client.api;

import com.konfigthis.dojah.client.ApiException;
import com.konfigthis.dojah.client.model.GetScreeningInfoResponse;
import com.konfigthis.dojah.client.model.ScreenAmlRequest;
import com.konfigthis.dojah.client.model.ScreenAmlResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AmlApi
 */
@Disabled
public class AmlApiTest {

    private final AmlApi api = new AmlApi();

    /**
     * Get AML Info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScreeningInfoTest() throws ApiException {
        String referenceId = null;
        GetScreeningInfoResponse response = api.getScreeningInfo(referenceId);
        // TODO: test validations
    }

    /**
     * AML Screening
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void screenAmlTest() throws ApiException {
        ScreenAmlRequest screenAmlRequest = null;
        ScreenAmlResponse response = api.screenAml(screenAmlRequest);
        // TODO: test validations
    }

}
