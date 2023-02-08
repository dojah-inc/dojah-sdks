# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from dojah_client.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from dojah_client.model.analyze_document_response import AnalyzeDocumentResponse
from dojah_client.model.analyze_document_response_entity import AnalyzeDocumentResponseEntity
from dojah_client.model.analyze_document_response_entity_document_images import AnalyzeDocumentResponseEntityDocumentImages
from dojah_client.model.analyze_document_response_entity_document_type import AnalyzeDocumentResponseEntityDocumentType
from dojah_client.model.analyze_document_response_entity_status import AnalyzeDocumentResponseEntityStatus
from dojah_client.model.analyze_document_response_entity_text_data_inner import AnalyzeDocumentResponseEntityTextDataInner
from dojah_client.model.categorize_transactions_request import CategorizeTransactionsRequest
from dojah_client.model.categorize_transactions_response import CategorizeTransactionsResponse
from dojah_client.model.categorize_transactions_response_entity import CategorizeTransactionsResponseEntity
from dojah_client.model.collect_status_from_pdf_response import CollectStatusFromPdfResponse
from dojah_client.model.collect_transactions_request import CollectTransactionsRequest
from dojah_client.model.collect_transactions_request_transactions_inner import CollectTransactionsRequestTransactionsInner
from dojah_client.model.collect_transactions_response import CollectTransactionsResponse
from dojah_client.model.collect_transactions_response_entity import CollectTransactionsResponseEntity
from dojah_client.model.create_wallet_request import CreateWalletRequest
from dojah_client.model.create_wallet_response import CreateWalletResponse
from dojah_client.model.create_wallet_response_entity import CreateWalletResponseEntity
from dojah_client.model.credit_subwallet_request import CreditSubwalletRequest
from dojah_client.model.credit_subwallet_response import CreditSubwalletResponse
from dojah_client.model.credit_subwallet_response_entity import CreditSubwalletResponseEntity
from dojah_client.model.delete_webhook_response import DeleteWebhookResponse
from dojah_client.model.financial_get_basic_bvn_response import FinancialGetBasicBvnResponse
from dojah_client.model.financial_get_basic_bvn_response_entity import FinancialGetBasicBvnResponseEntity
from dojah_client.model.financial_get_full_bvn_response import FinancialGetFullBvnResponse
from dojah_client.model.financial_get_full_bvn_response_entity import FinancialGetFullBvnResponseEntity
from dojah_client.model.general_get_nuban_response import GeneralGetNubanResponse
from dojah_client.model.general_get_nuban_response_entity import GeneralGetNubanResponseEntity
from dojah_client.model.general_get_wallet_balance_response import GeneralGetWalletBalanceResponse
from dojah_client.model.get_account_analysis_response import GetAccountAnalysisResponse
from dojah_client.model.get_account_analysis_response_entity import GetAccountAnalysisResponseEntity
from dojah_client.model.get_account_analysis_response_entity_account_breakdown import GetAccountAnalysisResponseEntityAccountBreakdown
from dojah_client.model.get_account_analysis_response_entity_expense_breakdown import GetAccountAnalysisResponseEntityExpenseBreakdown
from dojah_client.model.get_account_analysis_response_entity_funds_management import GetAccountAnalysisResponseEntityFundsManagement
from dojah_client.model.get_account_analysis_response_entity_inflow_breakdown import GetAccountAnalysisResponseEntityInflowBreakdown
from dojah_client.model.get_account_analysis_response_entity_transaction_routine_breakdown import GetAccountAnalysisResponseEntityTransactionRoutineBreakdown
from dojah_client.model.get_account_response import GetAccountResponse
from dojah_client.model.get_account_subscriptions_response import GetAccountSubscriptionsResponse
from dojah_client.model.get_account_subscriptions_response_entity import GetAccountSubscriptionsResponseEntity
from dojah_client.model.get_account_transactions_response import GetAccountTransactionsResponse
from dojah_client.model.get_account_transactions_response_entity import GetAccountTransactionsResponseEntity
from dojah_client.model.get_account_transactions_response_entity_transactions_inner import GetAccountTransactionsResponseEntityTransactionsInner
from dojah_client.model.get_advanced_cac_response import GetAdvancedCacResponse
from dojah_client.model.get_banks_response import GetBanksResponse
from dojah_client.model.get_banks_response_entity_inner import GetBanksResponseEntityInner
from dojah_client.model.get_basic_bvn_response import GetBasicBvnResponse
from dojah_client.model.get_basic_bvn_response_entity import GetBasicBvnResponseEntity
from dojah_client.model.get_basic_cac_response import GetBasicCacResponse
from dojah_client.model.get_basic_cac_response_entity import GetBasicCacResponseEntity
from dojah_client.model.get_basic_phone_number_response import GetBasicPhoneNumberResponse
from dojah_client.model.get_basic_phone_number_response_entity import GetBasicPhoneNumberResponseEntity
from dojah_client.model.get_bin_response import GetBinResponse
from dojah_client.model.get_bin_response_entity import GetBinResponseEntity
from dojah_client.model.get_cac_response import GetCacResponse
from dojah_client.model.get_cac_response_entity import GetCacResponseEntity
from dojah_client.model.get_data_plans_response import GetDataPlansResponse
from dojah_client.model.get_document_analysis_request import GetDocumentAnalysisRequest
from dojah_client.model.get_document_analysis_response import GetDocumentAnalysisResponse
from dojah_client.model.get_document_analysis_response_entity import GetDocumentAnalysisResponseEntity
from dojah_client.model.get_document_analysis_response_entity_data import GetDocumentAnalysisResponseEntityData
from dojah_client.model.get_drivers_license_response import GetDriversLicenseResponse
from dojah_client.model.get_drivers_license_response_entity import GetDriversLicenseResponseEntity
from dojah_client.model.get_earning_structure_response import GetEarningStructureResponse
from dojah_client.model.get_earning_structure_response_entity import GetEarningStructureResponseEntity
from dojah_client.model.get_email_reputation_response import GetEmailReputationResponse
from dojah_client.model.get_email_reputation_response_entity import GetEmailReputationResponseEntity
from dojah_client.model.get_email_reputation_response_entity_details import GetEmailReputationResponseEntityDetails
from dojah_client.model.get_full_bvn_response import GetFullBvnResponse
from dojah_client.model.get_full_bvn_response_entity import GetFullBvnResponseEntity
from dojah_client.model.get_generic_ocr_text_request import GetGenericOcrTextRequest
from dojah_client.model.get_generic_ocr_text_response import GetGenericOcrTextResponse
from dojah_client.model.get_kyc_drivers_license_response import GetKycDriversLicenseResponse
from dojah_client.model.get_kyc_drivers_license_response_entity import GetKycDriversLicenseResponseEntity
from dojah_client.model.get_kyc_drivers_license_response_entity_personal_details import GetKycDriversLicenseResponseEntityPersonalDetails
from dojah_client.model.get_kyc_passport_response import GetKycPassportResponse
from dojah_client.model.get_kyc_passport_response_entity import GetKycPassportResponseEntity
from dojah_client.model.get_national_id_response import GetNationalIdResponse
from dojah_client.model.get_national_id_response_entity import GetNationalIdResponseEntity
from dojah_client.model.get_nuban_response import GetNubanResponse
from dojah_client.model.get_nuban_response_entity import GetNubanResponseEntity
from dojah_client.model.get_ocr_text_request import GetOcrTextRequest
from dojah_client.model.get_ocr_text_response import GetOcrTextResponse
from dojah_client.model.get_ocr_text_response_entity import GetOcrTextResponseEntity
from dojah_client.model.get_passport_response import GetPassportResponse
from dojah_client.model.get_passport_response_entity import GetPassportResponseEntity
from dojah_client.model.get_phone_number404_response import GetPhoneNumber404Response
from dojah_client.model.get_phone_number_response import GetPhoneNumberResponse
from dojah_client.model.get_phone_number_response_entity import GetPhoneNumberResponseEntity
from dojah_client.model.get_premium_bvn_response import GetPremiumBvnResponse
from dojah_client.model.get_premium_bvn_response_entity import GetPremiumBvnResponseEntity
from dojah_client.model.get_screening_info_response import GetScreeningInfoResponse
from dojah_client.model.get_screening_info_response_entity import GetScreeningInfoResponseEntity
from dojah_client.model.get_screening_info_response_entity_result import GetScreeningInfoResponseEntityResult
from dojah_client.model.get_sender_id_response import GetSenderIdResponse
from dojah_client.model.get_sender_id_response_entity_inner import GetSenderIdResponseEntityInner
from dojah_client.model.get_sms_status_response import GetSmsStatusResponse
from dojah_client.model.get_sms_status_response_entity import GetSmsStatusResponseEntity
from dojah_client.model.get_spending_pattern_response import GetSpendingPatternResponse
from dojah_client.model.get_spending_pattern_response_entity import GetSpendingPatternResponseEntity
from dojah_client.model.get_spending_pattern_response_entity_pattern import GetSpendingPatternResponseEntityPattern
from dojah_client.model.get_spending_pattern_response_entity_pattern_airtime_data import GetSpendingPatternResponseEntityPatternAirtimeData
from dojah_client.model.get_spending_pattern_response_entity_pattern_bank_transfer import GetSpendingPatternResponseEntityPatternBankTransfer
from dojah_client.model.get_spending_pattern_response_entity_pattern_charges import GetSpendingPatternResponseEntityPatternCharges
from dojah_client.model.get_spending_pattern_response_entity_pattern_food import GetSpendingPatternResponseEntityPatternFood
from dojah_client.model.get_spending_pattern_response_entity_pattern_others import GetSpendingPatternResponseEntityPatternOthers
from dojah_client.model.get_ssnit_response import GetSsnitResponse
from dojah_client.model.get_ssnit_response_entity import GetSsnitResponseEntity
from dojah_client.model.get_tin_response import GetTinResponse
from dojah_client.model.get_tin_response_entity import GetTinResponseEntity
from dojah_client.model.get_transaction_response import GetTransactionResponse
from dojah_client.model.get_transaction_response_entity import GetTransactionResponseEntity
from dojah_client.model.get_vin_response import GetVinResponse
from dojah_client.model.get_vin_response_entity import GetVinResponseEntity
from dojah_client.model.get_vnin_response import GetVninResponse
from dojah_client.model.get_vnin_response_entity import GetVninResponseEntity
from dojah_client.model.get_voter_response import GetVoterResponse
from dojah_client.model.get_voter_response_entity import GetVoterResponseEntity
from dojah_client.model.get_wallet_balance_response import GetWalletBalanceResponse
from dojah_client.model.get_wallet_balance_response_entity import GetWalletBalanceResponseEntity
from dojah_client.model.get_wallet_response import GetWalletResponse
from dojah_client.model.get_wallet_response_entity import GetWalletResponseEntity
from dojah_client.model.get_wallets_response import GetWalletsResponse
from dojah_client.model.get_wallets_response_entity import GetWalletsResponseEntity
from dojah_client.model.get_webhooks_response import GetWebhooksResponse
from dojah_client.model.get_webhooks_response_entity_inner import GetWebhooksResponseEntityInner
from dojah_client.model.notify_webhook_request import NotifyWebhookRequest
from dojah_client.model.notify_webhook_request_data import NotifyWebhookRequestData
from dojah_client.model.notify_webhook_response import NotifyWebhookResponse
from dojah_client.model.purchase_airtime_request import PurchaseAirtimeRequest
from dojah_client.model.purchase_airtime_response import PurchaseAirtimeResponse
from dojah_client.model.purchase_airtime_response_entity import PurchaseAirtimeResponseEntity
from dojah_client.model.purchase_airtime_response_entity_data_inner import PurchaseAirtimeResponseEntityDataInner
from dojah_client.model.purchase_data_request import PurchaseDataRequest
from dojah_client.model.purchase_data_response import PurchaseDataResponse
from dojah_client.model.purchase_data_response_entity_inner import PurchaseDataResponseEntityInner
from dojah_client.model.request_sender_id_request import RequestSenderIdRequest
from dojah_client.model.request_sender_id_response import RequestSenderIdResponse
from dojah_client.model.request_sender_id_response_entity_inner import RequestSenderIdResponseEntityInner
from dojah_client.model.screen_aml_request import ScreenAmlRequest
from dojah_client.model.screen_aml_response import ScreenAmlResponse
from dojah_client.model.screen_aml_response_entity import ScreenAmlResponseEntity
from dojah_client.model.send_otp_request import SendOtpRequest
from dojah_client.model.send_otp_response import SendOtpResponse
from dojah_client.model.send_otp_response_entity_inner import SendOtpResponseEntityInner
from dojah_client.model.send_sms_request import SendSmsRequest
from dojah_client.model.send_sms_response import SendSmsResponse
from dojah_client.model.send_sms_response_entity import SendSmsResponseEntity
from dojah_client.model.subscribe_service_request import SubscribeServiceRequest
from dojah_client.model.subscribe_service_response import SubscribeServiceResponse
from dojah_client.model.transfer_funds_request import TransferFundsRequest
from dojah_client.model.transfer_funds_response import TransferFundsResponse
from dojah_client.model.transfer_funds_response_entity import TransferFundsResponseEntity
from dojah_client.model.validate_bvn_response import ValidateBvnResponse
from dojah_client.model.validate_bvn_response_entity import ValidateBvnResponseEntity
from dojah_client.model.validate_bvn_response_entity_bvn import ValidateBvnResponseEntityBvn
from dojah_client.model.validate_bvn_response_entity_first_name import ValidateBvnResponseEntityFirstName
from dojah_client.model.validate_otp_response import ValidateOtpResponse
from dojah_client.model.validate_otp_response_entity import ValidateOtpResponseEntity
from dojah_client.model.verify_age_response import VerifyAgeResponse
from dojah_client.model.verify_age_response_entity import VerifyAgeResponseEntity
from dojah_client.model.verify_photo_id_with_selfie_request import VerifyPhotoIdWithSelfieRequest
from dojah_client.model.verify_photo_id_with_selfie_response import VerifyPhotoIdWithSelfieResponse
from dojah_client.model.verify_photo_id_with_selfie_response_entity import VerifyPhotoIdWithSelfieResponseEntity
from dojah_client.model.verify_photo_id_with_selfie_response_entity_selfie import VerifyPhotoIdWithSelfieResponseEntitySelfie
from dojah_client.model.verify_selfie_bvn_request import VerifySelfieBvnRequest
from dojah_client.model.verify_selfie_bvn_response import VerifySelfieBvnResponse
from dojah_client.model.verify_selfie_bvn_response_entity import VerifySelfieBvnResponseEntity
from dojah_client.model.verify_selfie_bvn_response_entity_selfie_verification import VerifySelfieBvnResponseEntitySelfieVerification
from dojah_client.model.verify_selfie_nin_request import VerifySelfieNinRequest
from dojah_client.model.verify_selfie_nin_response import VerifySelfieNinResponse
from dojah_client.model.verify_selfie_nin_response_entity import VerifySelfieNinResponseEntity
from dojah_client.model.verify_selfie_nin_response_entity_selfie_verification import VerifySelfieNinResponseEntitySelfieVerification
