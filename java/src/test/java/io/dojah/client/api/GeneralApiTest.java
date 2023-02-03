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
import io.dojah.client.model.GeneralGetNubanResponse;
import io.dojah.client.model.GeneralGetWalletBalanceResponse;
import io.dojah.client.model.GetBanksResponse;
import io.dojah.client.model.GetBinResponse;
import io.dojah.client.model.GetDataPlansResponse;
import io.dojah.client.model.GetWalletBalanceResponse;
import io.dojah.client.model.PurchaseAirtimeResponse;
import io.dojah.client.model.PurchaseDataResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneralApi
 */
@Disabled
public class GeneralApiTest {

    private final GeneralApi api = new GeneralApi();

    /**
     * General - Get Banks
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBanksTest() throws ApiException {
        GetBanksResponse response = api.getBanks();
        // TODO: test validations
    }

    /**
     * General Resolve BIN
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBinTest() throws ApiException {
        Integer cardBin = null;
        GetBinResponse response = api.getBin(cardBin);
        // TODO: test validations
    }

    /**
     * Purchase - Get Data Plans
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataPlansTest() throws ApiException {
        GetDataPlansResponse response = api.getDataPlans();
        // TODO: test validations
    }

    /**
     * General Resolve NUBAN
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNubanTest() throws ApiException {
        Integer bankCode = null;
        Integer accountNumber = null;
        GeneralGetNubanResponse response = api.getNuban(bankCode, accountNumber);
        // TODO: test validations
    }

    /**
     * Get Dojah Wallet Balance
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWalletBalanceTest() throws ApiException {
        GetWalletBalanceResponse response = api.getWalletBalance();
        // TODO: test validations
    }

    /**
     * Purchase - Send Airtime
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void purchaseAirtimeTest() throws ApiException {
        Object body = null;
        PurchaseAirtimeResponse response = api.purchaseAirtime(body);
        // TODO: test validations
    }

    /**
     * Purchase - Buy Data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void purchaseDataTest() throws ApiException {
        Object body = null;
        PurchaseDataResponse response = api.purchaseData(body);
        // TODO: test validations
    }

}