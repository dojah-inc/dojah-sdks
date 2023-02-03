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
import com.konfigthis.dojah.client.model.CollectStatusFromPdfResponse;
import com.konfigthis.dojah.client.model.CollectTransactionsResponse;
import java.io.File;
import com.konfigthis.dojah.client.model.FinancialGetBasicBvnResponse;
import com.konfigthis.dojah.client.model.FinancialGetFullBvnResponse;
import com.konfigthis.dojah.client.model.GetAccountAnalysisResponse;
import com.konfigthis.dojah.client.model.GetAccountResponse;
import com.konfigthis.dojah.client.model.GetAccountSubscriptionsResponse;
import com.konfigthis.dojah.client.model.GetAccountTransactionsResponse;
import com.konfigthis.dojah.client.model.GetEarningStructureResponse;
import com.konfigthis.dojah.client.model.GetSpendingPatternResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FinancialApi
 */
@Disabled
public class FinancialApiTest {

    private final FinancialApi api = new FinancialApi();

    /**
     * Collect Status via PDF Statement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void collectStatusFromPdfTest() throws ApiException {
        File statement = null;
        Integer bankCode = null;
        CollectStatusFromPdfResponse response = api.collectStatusFromPdf(statement, bankCode);
        // TODO: test validations
    }

    /**
     * Collect Transactions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void collectTransactionsTest() throws ApiException {
        Object body = null;
        CollectTransactionsResponse response = api.collectTransactions(body);
        // TODO: test validations
    }

    /**
     * Get Account Information
     *
     * /services/@app_id/account/@account_id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        String accountId = null;
        GetAccountResponse response = api.getAccount(accountId);
        // TODO: test validations
    }

    /**
     * Get Account Analysis
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountAnalysisTest() throws ApiException {
        GetAccountAnalysisResponse response = api.getAccountAnalysis();
        // TODO: test validations
    }

    /**
     * Get Account Subscriptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountSubscriptionsTest() throws ApiException {
        String accountId = null;
        GetAccountSubscriptionsResponse response = api.getAccountSubscriptions(accountId);
        // TODO: test validations
    }

    /**
     * Get Account Transactions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountTransactionsTest() throws ApiException {
        String accountId = null;
        Integer length = null;
        GetAccountTransactionsResponse response = api.getAccountTransactions(accountId, length);
        // TODO: test validations
    }

    /**
     * Get BVN Information Basic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBasicBvnTest() throws ApiException {
        String accountId = null;
        FinancialGetBasicBvnResponse response = api.getBasicBvn(accountId);
        // TODO: test validations
    }

    /**
     * Get Earning Structure
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEarningStructureTest() throws ApiException {
        String accountId = null;
        GetEarningStructureResponse response = api.getEarningStructure(accountId);
        // TODO: test validations
    }

    /**
     * Get BVN Information Full
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFullBvnTest() throws ApiException {
        String accountId = null;
        FinancialGetFullBvnResponse response = api.getFullBvn(accountId);
        // TODO: test validations
    }

    /**
     * Get Spending Pattern
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpendingPatternTest() throws ApiException {
        String accountId = null;
        GetSpendingPatternResponse response = api.getSpendingPattern(accountId);
        // TODO: test validations
    }

}