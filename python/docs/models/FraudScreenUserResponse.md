# dojah_client.model.fraud_screen_user_response.FraudScreenUserResponse

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
**aml_screening_result** | None, str,  | NoneClass, str,  |  | [optional] 
**[ip_check_result](#ip_check_result)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[email_check_result](#email_check_result)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[phone_check_result](#phone_check_result)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**overall_risk_score** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# ip_check_result

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ip** | str,  | str,  |  | [optional] 
**[blacklists](#blacklists)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[anonymity](#anonymity)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[risk_score](#risk_score)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[ip_details](#ip_details)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# blacklists

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**detections** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**engines_count** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**detection_rate** | str,  | str,  |  | [optional] 
**scantime** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# anonymity

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**is_proxy** | bool,  | BoolClass,  |  | [optional] 
**is_webproxy** | bool,  | BoolClass,  |  | [optional] 
**is_vpn** | bool,  | BoolClass,  |  | [optional] 
**is_hosting** | bool,  | BoolClass,  |  | [optional] 
**is_tor** | bool,  | BoolClass,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# risk_score

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**result** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# ip_details

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**reverse_dns** | str,  | str,  |  | [optional] 
**continent_code** | str,  | str,  |  | [optional] 
**continent_name** | str,  | str,  |  | [optional] 
**country_code** | str,  | str,  |  | [optional] 
**country_name** | str,  | str,  |  | [optional] 
**country_currency** | str,  | str,  |  | [optional] 
**country_calling_code** | str,  | str,  |  | [optional] 
**region_name** | str,  | str,  |  | [optional] 
**city_name** | str,  | str,  |  | [optional] 
**latitude** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**longitude** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**isp** | str,  | str,  |  | [optional] 
**asn** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# email_check_result

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
**[domain_details](#domain_details)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[breach_details](#breach_details)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[account_details_registered](#account_details_registered)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

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
**registered_to** | str,  | str,  |  | [optional] 
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
**first_breach** | str,  | str,  |  | [optional] 
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
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  |  | [optional] 
**domain** | None, str,  | NoneClass, str,  |  | [optional] 
**date** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# account_details_registered

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# phone_check_result

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**number** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**valid** | bool,  | BoolClass,  |  | [optional] 
**disposable** | bool,  | BoolClass,  |  | [optional] 
**type** | str,  | str,  |  | [optional] 
**country** | str,  | str,  |  | [optional] 
**carrier** | str,  | str,  |  | [optional] 
**score** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**[account_details_registered](#account_details_registered)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

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

