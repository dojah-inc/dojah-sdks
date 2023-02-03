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
import io.dojah.client.model.GetSenderIdResponse;
import io.dojah.client.model.GetSmsStatusResponse;
import io.dojah.client.model.RequestSenderIdResponse;
import io.dojah.client.model.SendOtpResponse;
import io.dojah.client.model.SendSmsResponse;
import io.dojah.client.model.ValidateOtpResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     * Messaging - Get Sender IDs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSenderIdTest() throws ApiException {
        GetSenderIdResponse response = api.getSenderId();
        // TODO: test validations
    }

    /**
     * Messaging - Get SMS Status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSmsStatusTest() throws ApiException {
        String messageId = null;
        GetSmsStatusResponse response = api.getSmsStatus(messageId);
        // TODO: test validations
    }

    /**
     * Messaging - Request Sender ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestSenderIdTest() throws ApiException {
        Object body = null;
        RequestSenderIdResponse response = api.requestSenderId(body);
        // TODO: test validations
    }

    /**
     * Messaging - Send OTP
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendOtpTest() throws ApiException {
        Object body = null;
        SendOtpResponse response = api.sendOtp(body);
        // TODO: test validations
    }

    /**
     * Messaging - Send SMS
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendSmsTest() throws ApiException {
        Object body = null;
        SendSmsResponse response = api.sendSms(body);
        // TODO: test validations
    }

    /**
     * Messaging - Validate OTP
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateOtpTest() throws ApiException {
        String referenceId = null;
        Integer code = null;
        ValidateOtpResponse response = api.validateOtp(referenceId, code);
        // TODO: test validations
    }

}
