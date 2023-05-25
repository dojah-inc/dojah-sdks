# dojah-typescript-sdk@4.0.0

Use Dojah to verify, onboard and manage user identity across Africa!
## Installing

### npm
```
npm install dojah-typescript-sdk --save
```

### yarn
```
yarn add dojah-typescript-sdk
```

**Important note: this library is can be used in both the client-side or server-side, but using it
in client-side browser code is not recommended as you would expose security credentials.**



## Getting Started

```typescript
import { Configuration, GHKYCApi } from "dojah-typescript-sdk";
const configuration = new Configuration({
  apiKey: (name) => {
    if (name === "Authorization") return process.env.DOJAH_API_KEY;
    if (name === "AppId") return process.env.DOJAH_APP_ID;
    throw Error();
  },
  // Uncomment the below configuration to use sandbox environment
  // basePath: "https://sandbox.dojah.io",
});
const api = new GHKYCApi(configuration);
const request = api.getDriversLicense("V0000000", "John Doe", "1988-09-01");
request.then((result) => {
  console.log(result);
});
```

## Documentation for API Endpoints

All URIs are relative to *https://api.dojah.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AmlApi* | [**getScreeningInfo**](docs/AmlApi.md#getScreeningInfo) | **GET** /v1/aml/screening/info | Get AML Info
*AmlApi* | [**screenAml**](docs/AmlApi.md#screenAml) | **POST** /api/v1/aml/screening | AML Screening
*AuthenticationApi* | [**getSenderId**](docs/AuthenticationApi.md#getSenderId) | **GET** /api/v1/messaging/sender_ids | Messaging - Get Sender IDs
*AuthenticationApi* | [**getSmsStatus**](docs/AuthenticationApi.md#getSmsStatus) | **GET** /v1/messaging/sms/get_status | Messaging - Get SMS Status
*AuthenticationApi* | [**requestSenderId**](docs/AuthenticationApi.md#requestSenderId) | **POST** /api/v1/messaging/sender_id | Messaging - Request Sender ID
*AuthenticationApi* | [**sendOtp**](docs/AuthenticationApi.md#sendOtp) | **POST** /v1/messaging/otp | Messaging - Send OTP
*AuthenticationApi* | [**sendSms**](docs/AuthenticationApi.md#sendSms) | **POST** /api/v1/messaging/sms | Messaging - Send SMS
*AuthenticationApi* | [**validateOtp**](docs/AuthenticationApi.md#validateOtp) | **GET** /v1/messaging/otp/validate | Messaging - Validate OTP
*FinancialApi* | [**collectStatusFromPdf**](docs/FinancialApi.md#collectStatusFromPdf) | **POST** /api/v1/financial/transactions/pdf | Collect Status via PDF Statement
*FinancialApi* | [**collectTransactions**](docs/FinancialApi.md#collectTransactions) | **POST** /v1/financial/transactions | Collect Transactions
*FinancialApi* | [**getAccount**](docs/FinancialApi.md#getAccount) | **GET** /api/v1/financial/account_information | Get Account Information
*FinancialApi* | [**getAccountAnalysis**](docs/FinancialApi.md#getAccountAnalysis) | **GET** /api/v1/financial/analysis | Get Account Analysis
*FinancialApi* | [**getAccountSubscriptions**](docs/FinancialApi.md#getAccountSubscriptions) | **GET** /v1/financial/account_subscription | Get Account Subscriptions
*FinancialApi* | [**getAccountTransactions**](docs/FinancialApi.md#getAccountTransactions) | **GET** /api/v1/financial/account_transactions | Get Account Transactions
*FinancialApi* | [**getBasicBvn**](docs/FinancialApi.md#getBasicBvn) | **GET** /v1/financial/bvn_information/basic | Get BVN Information Basic
*FinancialApi* | [**getEarningStructure**](docs/FinancialApi.md#getEarningStructure) | **GET** /v1/financial/earning_structure | Get Earning Structure
*FinancialApi* | [**getFullBvn**](docs/FinancialApi.md#getFullBvn) | **GET** /v1/financial/bvn_information/full | Get BVN Information Full
*FinancialApi* | [**getSpendingPattern**](docs/FinancialApi.md#getSpendingPattern) | **GET** /v1/financial/spending_pattern | Get Spending Pattern
*GhKycApi* | [**getDriversLicense**](docs/GhKycApi.md#getDriversLicense) | **GET** /api/v1/gh/kyc/dl | Driver\&#39;s License
*GhKycApi* | [**getPassport**](docs/GhKycApi.md#getPassport) | **GET** /api/v1/gh/kyc/passport | Passport
*GhKycApi* | [**getSsnit**](docs/GhKycApi.md#getSsnit) | **GET** /api/v1/gh/kyc/ssnit | SSNIT
*GeneralApi* | [**getBanks**](docs/GeneralApi.md#getBanks) | **GET** /v1/general/banks | General - Get Banks
*GeneralApi* | [**getBin**](docs/GeneralApi.md#getBin) | **GET** /v1/general/bin | General Resolve BIN
*GeneralApi* | [**getDataPlans**](docs/GeneralApi.md#getDataPlans) | **GET** /v1/purchase/data/plans | Purchase - Get Data Plans
*GeneralApi* | [**getNuban**](docs/GeneralApi.md#getNuban) | **GET** /v1/general/account | General Resolve NUBAN
*GeneralApi* | [**getWalletBalance**](docs/GeneralApi.md#getWalletBalance) | **GET** /api/v1/balance | Get Dojah Wallet Balance
*GeneralApi* | [**purchaseAirtime**](docs/GeneralApi.md#purchaseAirtime) | **POST** /v1/purchase/airtime | Purchase - Send Airtime
*GeneralApi* | [**purchaseData**](docs/GeneralApi.md#purchaseData) | **POST** /v1/purchase/data | Purchase - Buy Data
*KeKycApi* | [**getNationalId**](docs/KeKycApi.md#getNationalId) | **GET** /api/v1/ke/kyc/id | KYC - National ID
*KybApi* | [**getAdvancedCac**](docs/KybApi.md#getAdvancedCac) | **GET** /v1/kyc/cac/advance | KYC - Get CAC Advanced
*KybApi* | [**getBasicCac**](docs/KybApi.md#getBasicCac) | **GET** /v1/kyc/cac/basic | KYB - Get CAC 2
*KybApi* | [**getCac**](docs/KybApi.md#getCac) | **GET** /v1/kyc/cac | KYC - Get CAC 
*KybApi* | [**getTin**](docs/KybApi.md#getTin) | **GET** /v1/kyc/tin | KYC - Fetch Tin
*KycApi* | [**analyzeDocument**](docs/KycApi.md#analyzeDocument) | **POST** /api/v1/document/analysis | KYC - Document Analysis
*KycApi* | [**getBasicBvn**](docs/KycApi.md#getBasicBvn) | **GET** /api/v1/kyc/bvn/basic | KYC - Get Basic BVN Info
*KycApi* | [**getBasicPhoneNumber**](docs/KycApi.md#getBasicPhoneNumber) | **GET** /v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic
*KycApi* | [**getDriversLicense**](docs/KycApi.md#getDriversLicense) | **GET** /api/v1/kyc/dl | KYC - Get Drivers License Info
*KycApi* | [**getEmailReputation**](docs/KycApi.md#getEmailReputation) | **GET** /v1/kyc/email | KYC - Get Email Reputation
*KycApi* | [**getFullBvn**](docs/KycApi.md#getFullBvn) | **GET** /api/v1/kyc/bvn/full | KYC - Lookup BVN Basic
*KycApi* | [**getNuban**](docs/KycApi.md#getNuban) | **GET** /api/v1/kyc/nuban | KYC - Get NUBAN Information
*KycApi* | [**getPassport**](docs/KycApi.md#getPassport) | **GET** /api/v1/kyc/passport | KYC - Passport
*KycApi* | [**getPhoneNumber**](docs/KycApi.md#getPhoneNumber) | **GET** /api/v1/kyc/phone_number | KYC - Lookup Phone Number
*KycApi* | [**getPremiumBvn**](docs/KycApi.md#getPremiumBvn) | **GET** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium
*KycApi* | [**getVIN**](docs/KycApi.md#getVIN) | **GET** /api/v1/kyc/vin | KYC - Get VIN
*KycApi* | [**getVnin**](docs/KycApi.md#getVnin) | **GET** /api/v1/kyc/vnin | Lookup VNIN
*KycApi* | [**validateBvn**](docs/KycApi.md#validateBvn) | **GET** /api/v1/kyc/bvn | KYC - Validate BVN
*KycApi* | [**verifyAge**](docs/KycApi.md#verifyAge) | **GET** /v1/kyc/age_verification | KYC - Age Verification
*KycApi* | [**verifySelfieBvn**](docs/KycApi.md#verifySelfieBvn) | **POST** /v1/kyc/bvn/verify | KYC - Selfie BVN Verificatoin
*KycApi* | [**verifySelfieNin**](docs/KycApi.md#verifySelfieNin) | **POST** /v1/kyc/nin/verify | KYC - Selfie NIN Verification
*MlApi* | [**getDocumentAnalysis**](docs/MlApi.md#getDocumentAnalysis) | **POST** /v1/document/analysis/dl | Document Analysis Drivers License
*MlApi* | [**getGenericOcrText**](docs/MlApi.md#getGenericOcrText) | **POST** /v1/ml/ocr/generic | Generic OCR Service
*MlApi* | [**getOcrText**](docs/MlApi.md#getOcrText) | **POST** /v1/ml/ocr | BVN Ocr
*MlApi* | [**verifyPhotoIdWithSelfie**](docs/MlApi.md#verifyPhotoIdWithSelfie) | **POST** /v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification
*ServicesApi* | [**categorizeTransactions**](docs/ServicesApi.md#categorizeTransactions) | **POST** /v1/ml/categorize_transaction | Categorize Transactions
*UgKycApi* | [**getVoter**](docs/UgKycApi.md#getVoter) | **GET** /api/v1/ug/kyc/voter | Voters ID
*WalletApi* | [**createWallet**](docs/WalletApi.md#createWallet) | **POST** /v1/wallet/ngn/create | Create NGN Wallet
*WalletApi* | [**creditSubwallet**](docs/WalletApi.md#creditSubwallet) | **POST** /v1/wallet/ngn/credit | Credit Sub-wallet
*WalletApi* | [**getTransaction**](docs/WalletApi.md#getTransaction) | **GET** /v1/wallet/ngn/transaction | Retrieve Transaction Details
*WalletApi* | [**getWallet**](docs/WalletApi.md#getWallet) | **GET** /v1/wallet/ngn/retrieve | Retrieve Wallet Details
*WalletApi* | [**getWallets**](docs/WalletApi.md#getWallets) | **GET** /v1/wallet/ngn/accounts | Get Wallets
*WalletApi* | [**transferFunds**](docs/WalletApi.md#transferFunds) | **POST** /v1/wallet/ngn/transfer | Transfer Funds
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /api/v1/webhook/delete | Delete Webhook
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /api/v1/webhook/fetch | Fetch All Webhooks
*WebhooksApi* | [**notifyWebhook**](docs/WebhooksApi.md#notifyWebhook) | **POST** /api/v1/webhook/notify | Post Hook
*WebhooksApi* | [**subscribeService**](docs/WebhooksApi.md#subscribeService) | **POST** /api/v1/webhook/subscribe | Subscribe to service

