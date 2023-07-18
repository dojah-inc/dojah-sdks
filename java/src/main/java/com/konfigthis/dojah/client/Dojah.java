package com.konfigthis.dojah.client;

import com.konfigthis.dojah.client.api.AmlApi;
import com.konfigthis.dojah.client.api.AuthenticationApi;
import com.konfigthis.dojah.client.api.DocumentAnalysisApi;
import com.konfigthis.dojah.client.api.FraudApi;
import com.konfigthis.dojah.client.api.GhKycApi;
import com.konfigthis.dojah.client.api.GeneralApi;
import com.konfigthis.dojah.client.api.GlobalKycApi;
import com.konfigthis.dojah.client.api.KeKycApi;
import com.konfigthis.dojah.client.api.KybApi;
import com.konfigthis.dojah.client.api.KycApi;
import com.konfigthis.dojah.client.api.MlApi;
import com.konfigthis.dojah.client.api.NigeriaKycApi;
import com.konfigthis.dojah.client.api.PurchaseApi;
import com.konfigthis.dojah.client.api.ServicesApi;
import com.konfigthis.dojah.client.api.TzKycApi;
import com.konfigthis.dojah.client.api.UgKycApi;
import com.konfigthis.dojah.client.api.VerificationsApi;
import com.konfigthis.dojah.client.api.WebHooksApi;
import com.konfigthis.dojah.client.api.ZafKycApi;
import com.konfigthis.dojah.client.api.ZwKycApi;

public class Dojah {
    private ApiClient apiClient;
    public final AmlApi aml;
    public final AuthenticationApi authentication;
    public final DocumentAnalysisApi documentAnalysis;
    public final FraudApi fraud;
    public final GhKycApi ghKyc;
    public final GeneralApi general;
    public final GlobalKycApi globalKyc;
    public final KeKycApi keKyc;
    public final KybApi kyb;
    public final KycApi kyc;
    public final MlApi ml;
    public final NigeriaKycApi nigeriaKyc;
    public final PurchaseApi purchase;
    public final ServicesApi services;
    public final TzKycApi tzKyc;
    public final UgKycApi ugKyc;
    public final VerificationsApi verifications;
    public final WebHooksApi webHooks;
    public final ZafKycApi zafKyc;
    public final ZwKycApi zwKyc;

    public Dojah() {
        this(null);
    }

    public Dojah(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.aml = new AmlApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.documentAnalysis = new DocumentAnalysisApi(this.apiClient);
        this.fraud = new FraudApi(this.apiClient);
        this.ghKyc = new GhKycApi(this.apiClient);
        this.general = new GeneralApi(this.apiClient);
        this.globalKyc = new GlobalKycApi(this.apiClient);
        this.keKyc = new KeKycApi(this.apiClient);
        this.kyb = new KybApi(this.apiClient);
        this.kyc = new KycApi(this.apiClient);
        this.ml = new MlApi(this.apiClient);
        this.nigeriaKyc = new NigeriaKycApi(this.apiClient);
        this.purchase = new PurchaseApi(this.apiClient);
        this.services = new ServicesApi(this.apiClient);
        this.tzKyc = new TzKycApi(this.apiClient);
        this.ugKyc = new UgKycApi(this.apiClient);
        this.verifications = new VerificationsApi(this.apiClient);
        this.webHooks = new WebHooksApi(this.apiClient);
        this.zafKyc = new ZafKycApi(this.apiClient);
        this.zwKyc = new ZwKycApi(this.apiClient);
    }

}
