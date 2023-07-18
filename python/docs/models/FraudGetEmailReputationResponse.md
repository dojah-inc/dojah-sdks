# dojah_client.model.fraud_get_email_reputation_response.FraudGetEmailReputationResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[entity](#entity)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# entity

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
**[details](#details)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**score** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**deliverable** | bool,  | BoolClass,  |  | [optional] 
**[domain_details](#domain_details)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[breach_details](#breach_details)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[account_details_registered](#account_details_registered)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# details

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**blacklisted** | bool,  | BoolClass,  |  | [optional] 
**malicious_activity** | bool,  | BoolClass,  |  | [optional] 
**malicious_activity_recent** | bool,  | BoolClass,  |  | [optional] 
**credentials_leaked** | bool,  | BoolClass,  |  | [optional] 
**credentials_leaked_recent** | bool,  | BoolClass,  |  | [optional] 
**data_breach** | bool,  | BoolClass,  |  | [optional] 
**first_seen** | str,  | str,  |  | [optional] 
**last_seen** | str,  | str,  |  | [optional] 
**domain_exists** | bool,  | BoolClass,  |  | [optional] 
**domain_reputation** | str,  | str,  |  | [optional] 
**new_domain** | bool,  | BoolClass,  |  | [optional] 
**days_since_domain_creation** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**suspicious_tld** | bool,  | BoolClass,  |  | [optional] 
**spam** | bool,  | BoolClass,  |  | [optional] 
**free_provider** | bool,  | BoolClass,  |  | [optional] 
**disposable** | bool,  | BoolClass,  |  | [optional] 
**deliverable** | bool,  | BoolClass,  |  | [optional] 
**accept_all** | bool,  | BoolClass,  |  | [optional] 
**valid_mx** | bool,  | BoolClass,  |  | [optional] 
**primary_mx** | str,  | str,  |  | [optional] 
**spoofable** | bool,  | BoolClass,  |  | [optional] 
**spf_strict** | bool,  | BoolClass,  |  | [optional] 
**dmarc_enforced** | bool,  | BoolClass,  |  | [optional] 
**[profiles](#profiles)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# profiles

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# domain_details

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**domain** | str,  | str,  |  | [optional] 
**tld** | str,  | str,  |  | [optional] 
**registered** | bool,  | BoolClass,  |  | [optional] 
**created** | str,  | str,  |  | [optional] 
**updated** | str,  | str,  |  | [optional] 
**expires** | str,  | str,  |  | [optional] 
**registrar_name** | str,  | str,  |  | [optional] 
**registered_to** | None, str,  | NoneClass, str,  |  | [optional] 
**disposable** | bool,  | BoolClass,  |  | [optional] 
**free** | bool,  | BoolClass,  |  | [optional] 
**custom** | bool,  | BoolClass,  |  | [optional] 
**dmarc_enforced** | bool,  | BoolClass,  |  | [optional] 
**spf_strict** | bool,  | BoolClass,  |  | [optional] 
**valid_mx** | bool,  | BoolClass,  |  | [optional] 
**accept_all** | bool,  | BoolClass,  |  | [optional] 
**suspicious_tld** | bool,  | BoolClass,  |  | [optional] 
**website_exists** | bool,  | BoolClass,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# breach_details

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**haveibeenpwned_listed** | bool,  | BoolClass,  |  | [optional] 
**number_of_breaches** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**first_breach** | None, str,  | NoneClass, str,  |  | [optional] 
**[breaches](#breaches)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# breaches

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# account_details_registered

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

