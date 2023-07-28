# dojah_client.model.fraud_get_email_reputation_response_entity.FraudGetEmailReputationResponseEntity

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**email** | str,  | str,  |  | [optional] 
**reputation** | str,  | str,  |  | [optional] 
**suspicious** | bool,  | BoolClass,  |  | [optional] 
**references** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**details** | [**FraudGetEmailReputationResponseEntityDetails**](FraudGetEmailReputationResponseEntityDetails.md) | [**FraudGetEmailReputationResponseEntityDetails**](FraudGetEmailReputationResponseEntityDetails.md) |  | [optional] 
**score** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**deliverable** | bool,  | BoolClass,  |  | [optional] 
**domain_details** | [**FraudGetEmailReputationResponseEntityDomainDetails**](FraudGetEmailReputationResponseEntityDomainDetails.md) | [**FraudGetEmailReputationResponseEntityDomainDetails**](FraudGetEmailReputationResponseEntityDomainDetails.md) |  | [optional] 
**breach_details** | [**FraudGetEmailReputationResponseEntityBreachDetails**](FraudGetEmailReputationResponseEntityBreachDetails.md) | [**FraudGetEmailReputationResponseEntityBreachDetails**](FraudGetEmailReputationResponseEntityBreachDetails.md) |  | [optional] 
**account_details_registered** | [**FraudGetEmailReputationResponseEntityAccountDetailsRegistered**](FraudGetEmailReputationResponseEntityAccountDetailsRegistered.md) | [**FraudGetEmailReputationResponseEntityAccountDetailsRegistered**](FraudGetEmailReputationResponseEntityAccountDetailsRegistered.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

