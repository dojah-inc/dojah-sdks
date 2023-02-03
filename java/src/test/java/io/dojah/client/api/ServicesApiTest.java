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
import io.dojah.client.model.CategorizeTransactionsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServicesApi
 */
@Disabled
public class ServicesApiTest {

    private final ServicesApi api = new ServicesApi();

    /**
     * Categorize Transactions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void categorizeTransactionsTest() throws ApiException {
        Object body = null;
        CategorizeTransactionsResponse response = api.categorizeTransactions(body);
        // TODO: test validations
    }

}
