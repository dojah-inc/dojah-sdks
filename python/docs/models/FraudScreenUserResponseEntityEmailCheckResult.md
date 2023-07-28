# dojah_client.model.fraud_screen_user_response_entity_email_check_result.FraudScreenUserResponseEntityEmailCheckResult

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**email** | str,  | str,  |  | [optional] 
**score** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**deliverable** | bool,  | BoolClass,  |  | [optional] 
**domain_details** | [**FraudScreenUserResponseEntityEmailCheckResultDomainDetails**](FraudScreenUserResponseEntityEmailCheckResultDomainDetails.md) | [**FraudScreenUserResponseEntityEmailCheckResultDomainDetails**](FraudScreenUserResponseEntityEmailCheckResultDomainDetails.md) |  | [optional] 
**breach_details** | [**FraudScreenUserResponseEntityEmailCheckResultBreachDetails**](FraudScreenUserResponseEntityEmailCheckResultBreachDetails.md) | [**FraudScreenUserResponseEntityEmailCheckResultBreachDetails**](FraudScreenUserResponseEntityEmailCheckResultBreachDetails.md) |  | [optional] 
**account_details_registered** | [**FraudScreenUserResponseEntityEmailCheckResultAccountDetailsRegistered**](FraudScreenUserResponseEntityEmailCheckResultAccountDetailsRegistered.md) | [**FraudScreenUserResponseEntityEmailCheckResultAccountDetailsRegistered**](FraudScreenUserResponseEntityEmailCheckResultAccountDetailsRegistered.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

