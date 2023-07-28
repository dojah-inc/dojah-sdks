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

**Important note: this library can be used in both the client-side or server-side, but using it
in client-side browser code is not recommended as you would expose security credentials.**



## Getting Started

```typescript
import { Dojah } from "dojah-typescript-sdk";

const dojah = new Dojah({
  // Defining the base path is optional and defaults to https://api.dojah.io
  // basePath: "https://api.dojah.io",
  authorization: "API_KEY",
  appId: "API_KEY",
});

const getScreeningInfoResponse = await dojah.aml.getScreeningInfo({});

console.log(getScreeningInfoResponse);
```

## Documentation for API Endpoints

All URIs are relative to *https://api.dojah.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AmlApi* | [**getScreeningInfo**](docs/AmlApi.md#getScreeningInfo) | **GET** /api/v1/aml/screening/info | Get AML Info
*AmlApi* | [**screenAml**](docs/AmlApi.md#screenAml) | **POST** /api/v1/aml/screening/platform | AML Screening
*AuthenticationApi* | [**getSenderId**](docs/AuthenticationApi.md#getSenderId) | **GET** /api/v1/messaging/sender_ids | Messaging - Get Sender IDs
*AuthenticationApi* | [**getSmsStatus**](docs/AuthenticationApi.md#getSmsStatus) | **GET** /v1/messaging/sms/get_status | Messaging - Get SMS Status
*AuthenticationApi* | [**requestSenderId**](docs/AuthenticationApi.md#requestSenderId) | **POST** /api/v1/messaging/sender_id | Messaging - Request Sender ID
*AuthenticationApi* | [**sendOtp**](docs/AuthenticationApi.md#sendOtp) | **POST** /api/v1/messaging/otp | Messaging - Send OTP
*AuthenticationApi* | [**sendSms**](docs/AuthenticationApi.md#sendSms) | **POST** /api/v1/messaging/sms | Messaging - Send SMS
*AuthenticationApi* | [**validateOtp**](docs/AuthenticationApi.md#validateOtp) | **GET** /api/v1/messaging/otp/validate | Messaging - Validate OTP
*DocumentAnalysisApi* | [**analyzeDocument**](docs/DocumentAnalysisApi.md#analyzeDocument) | **POST** /api/v1/document/analysis | KYC - Document Analysis
*FraudApi* | [**getEmailReputation**](docs/FraudApi.md#getEmailReputation) | **GET** /api/v1/kyc/email | Email Reputation
*FraudApi* | [**getIpReputation**](docs/FraudApi.md#getIpReputation) | **GET** /api/v1/fraud/ip | IP Reputation
*FraudApi* | [**screenPhone**](docs/FraudApi.md#screenPhone) | **GET** /api/v1/fraud/phone | Phone Screening
*FraudApi* | [**screenUser**](docs/FraudApi.md#screenUser) | **GET** /api/v1/fraud/user | User Screening
*GhKycApi* | [**getDriversLicense**](docs/GhKycApi.md#getDriversLicense) | **GET** /api/v1/gh/kyc/dl | Driver\&#39;s License
*GhKycApi* | [**getPassport**](docs/GhKycApi.md#getPassport) | **GET** /api/v1/gh/kyc/passport | Passport
*GhKycApi* | [**getSsnit**](docs/GhKycApi.md#getSsnit) | **GET** /api/v1/gh/kyc/ssnit | SSNIT
*GhKycApi* | [**getVoter**](docs/GhKycApi.md#getVoter) | **GET** /api/v1/gh/kyc/voter | Voter ID Lookup
*GeneralApi* | [**getBanks**](docs/GeneralApi.md#getBanks) | **GET** /v1/general/banks | General - Get Banks
*GeneralApi* | [**getBin**](docs/GeneralApi.md#getBin) | **GET** /v1/general/bin | General Resolve BIN
*GeneralApi* | [**getNuban**](docs/GeneralApi.md#getNuban) | **GET** /api/v1/general/account | General Resolve NUBAN
*GlobalKycApi* | [**caEkyc**](docs/GlobalKycApi.md#caEkyc) | **GET** /api/v1/ca/kyc | Canada Ekyc
*GlobalKycApi* | [**getUsSsn**](docs/GlobalKycApi.md#getUsSsn) | **GET** /api/v1/us/kyc | US SSN
*GlobalKycApi* | [**ukTwoPlusTwo**](docs/GlobalKycApi.md#ukTwoPlusTwo) | **GET** /api/v1/uk/kyc | UK 2+2
*KeKycApi* | [**getNationalId**](docs/KeKycApi.md#getNationalId) | **GET** /api/v1/ke/kyc/id | KYC - National ID
*KeKycApi* | [**getPassport**](docs/KeKycApi.md#getPassport) | **GET** /api/v1/ke/kyc/passport | KYC - Passport
*KybApi* | [**businessDetail**](docs/KybApi.md#businessDetail) | **GET** /api/v1/kyb/business/detail | Business Detail
*KybApi* | [**businessSearch**](docs/KybApi.md#businessSearch) | **GET** /api/v1/kyb/business/search | Business Search
*KybApi* | [**getCac**](docs/KybApi.md#getCac) | **GET** /api/v1/kyc/cac | KYC - Get CAC 
*KybApi* | [**getTin**](docs/KybApi.md#getTin) | **GET** /api/v1/kyc/tin | KYC - Fetch Tin
*KycApi* | [**checkLiveness**](docs/KycApi.md#checkLiveness) | **POST** /api/v1/ml/liveness | Liveness Check
*KycApi* | [**getAccounts**](docs/KycApi.md#getAccounts) | **GET** /api/v1/kyc/accounts | KYC - Fetch Accounts 
*KycApi* | [**getAddressVerification**](docs/KycApi.md#getAddressVerification) | **GET** /api/v1/kyc/address | Fetch Address Verification Data
*KycApi* | [**getBvnFromNuban**](docs/KycApi.md#getBvnFromNuban) | **GET** /api/v1/kyc/nuban/bvn | Lookup BVN from NUBAN
*KycApi* | [**getVin**](docs/KycApi.md#getVin) | **GET** /api/v1/kyc/vin | KYC - Get VIN
*KycApi* | [**submitAddress**](docs/KycApi.md#submitAddress) | **POST** /api/v1/kyc/address | Submit Address
*MlApi* | [**verifyPhotoIdWithSelfie**](docs/MlApi.md#verifyPhotoIdWithSelfie) | **POST** /api/v1/kyc/photoid/verify | KYC - Selfie Photo ID Verification
*NigeriaKycApi* | [**getBasicBvn**](docs/NigeriaKycApi.md#getBasicBvn) | **GET** /api/v1/kyc/bvn | KYC - Get Basic BVN Info
*NigeriaKycApi* | [**getBasicBvn1**](docs/NigeriaKycApi.md#getBasicBvn1) | **GET** /api/v1/kyc/bvn/basic | KYC - Lookup BVN Basic 1
*NigeriaKycApi* | [**getBasicPhoneNumber**](docs/NigeriaKycApi.md#getBasicPhoneNumber) | **GET** /api/v1/kyc/phone_number/basic | KYC Lookup Phone Number Basic
*NigeriaKycApi* | [**getDriversLicense**](docs/NigeriaKycApi.md#getDriversLicense) | **GET** /api/v1/kyc/dl | KYC - Get Drivers License Info
*NigeriaKycApi* | [**getNin**](docs/NigeriaKycApi.md#getNin) | **GET** /api/v1/kyc/nin | KYC - Get NIN Info
*NigeriaKycApi* | [**getNormalBvn**](docs/NigeriaKycApi.md#getNormalBvn) | **GET** /api/v1/kyc/bvn/full | KYC - Lookup BVN Normal
*NigeriaKycApi* | [**getNuban**](docs/NigeriaKycApi.md#getNuban) | **GET** /api/v1/kyc/nuban | KYC - Get NUBAN Information
*NigeriaKycApi* | [**getPassport**](docs/NigeriaKycApi.md#getPassport) | **GET** /api/v1/kyc/passport | KYC - Passport
*NigeriaKycApi* | [**getPhoneNumber**](docs/NigeriaKycApi.md#getPhoneNumber) | **GET** /api/v1/kyc/phone_number | KYC - Lookup Phone Number
*NigeriaKycApi* | [**getPremiumBvn**](docs/NigeriaKycApi.md#getPremiumBvn) | **GET** /api/v1/kyc/bvn/advance | KYC - Lookup BVN Premium
*NigeriaKycApi* | [**getVnin**](docs/NigeriaKycApi.md#getVnin) | **GET** /api/v1/kyc/vnin | Lookup VNIN
*PurchaseApi* | [**sendAirtime**](docs/PurchaseApi.md#sendAirtime) | **POST** /v1/purchase/airtime | Purchase - Send Airtime
*ServicesApi* | [**getWalletBalance**](docs/ServicesApi.md#getWalletBalance) | **GET** /api/v1/balance | Get Dojah Wallet Balance
*TzKycApi* | [**getNin**](docs/TzKycApi.md#getNin) | **GET** /api/v1/tz/kyc/nin | Lookup TZ NIN
*UgKycApi* | [**getVoter**](docs/UgKycApi.md#getVoter) | **GET** /api/v1/ug/kyc/voter | Voters ID
*VerificationsApi* | [**validateBvn**](docs/VerificationsApi.md#validateBvn) | **GET** /v1/kyc/bvn | KYC - Validate BVN
*VerificationsApi* | [**verifyAge**](docs/VerificationsApi.md#verifyAge) | **GET** /v1/kyc/age_verification | KYC - Age Verification
*VerificationsApi* | [**verifySelfieBvn**](docs/VerificationsApi.md#verifySelfieBvn) | **POST** /v1/kyc/bvn/verify | KYV - Selfie BVN Verificatoin
*VerificationsApi* | [**verifySelfieNin**](docs/VerificationsApi.md#verifySelfieNin) | **POST** /api/v1/kyc/nin/verify | KYC - Selfie NIN Verification
*VerificationsApi* | [**verifySelfieVnin**](docs/VerificationsApi.md#verifySelfieVnin) | **POST** /api/v1/kyc/vnin/verify | KYC - Selfie vNIN verification
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /api/v1/webhook/delete | Delete Webhook
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /api/v1/webhook/fetch | Fetch All Webhooks
*WebhooksApi* | [**notifyWebhook**](docs/WebhooksApi.md#notifyWebhook) | **POST** /api/v1/webhook/notify | Post Hook
*WebhooksApi* | [**subscribeService**](docs/WebhooksApi.md#subscribeService) | **POST** /api/v1/webhook/subscribe | Subscribe to service
*ZafKycApi* | [**getId**](docs/ZafKycApi.md#getId) | **GET** /api/v1/za/kyc/id | KYC - Lookup ID
*ZwKycApi* | [**checkCredit**](docs/ZwKycApi.md#checkCredit) | **GET** /api/v1/zw/kyc/fcb | Credit Check
*ZwKycApi* | [**verifyId**](docs/ZwKycApi.md#verifyId) | **GET** /api/v1/zw/kyc/nin | National ID Verification

