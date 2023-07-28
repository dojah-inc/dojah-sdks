# dojah_client.model.fraud_screen_user_response_entity.FraudScreenUserResponseEntity

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**aml_screening_result** | None, str,  | NoneClass, str,  |  | [optional] 
**ip_check_result** | [**FraudScreenUserResponseEntityIpCheckResult**](FraudScreenUserResponseEntityIpCheckResult.md) | [**FraudScreenUserResponseEntityIpCheckResult**](FraudScreenUserResponseEntityIpCheckResult.md) |  | [optional] 
**email_check_result** | [**FraudScreenUserResponseEntityEmailCheckResult**](FraudScreenUserResponseEntityEmailCheckResult.md) | [**FraudScreenUserResponseEntityEmailCheckResult**](FraudScreenUserResponseEntityEmailCheckResult.md) |  | [optional] 
**phone_check_result** | [**FraudScreenUserResponseEntityPhoneCheckResult**](FraudScreenUserResponseEntityPhoneCheckResult.md) | [**FraudScreenUserResponseEntityPhoneCheckResult**](FraudScreenUserResponseEntityPhoneCheckResult.md) |  | [optional] 
**overall_risk_score** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

