# FraudScreenUserResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AmlScreeningResult** | Pointer to **NullableString** |  | [optional] 
**IpCheckResult** | Pointer to [**FraudScreenUserResponseEntityIpCheckResult**](FraudScreenUserResponseEntityIpCheckResult.md) |  | [optional] 
**EmailCheckResult** | Pointer to [**FraudScreenUserResponseEntityEmailCheckResult**](FraudScreenUserResponseEntityEmailCheckResult.md) |  | [optional] 
**PhoneCheckResult** | Pointer to [**FraudScreenUserResponseEntityPhoneCheckResult**](FraudScreenUserResponseEntityPhoneCheckResult.md) |  | [optional] 
**OverallRiskScore** | Pointer to **float32** |  | [optional] 

## Methods

### NewFraudScreenUserResponseEntity

`func NewFraudScreenUserResponseEntity() *FraudScreenUserResponseEntity`

NewFraudScreenUserResponseEntity instantiates a new FraudScreenUserResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFraudScreenUserResponseEntityWithDefaults

`func NewFraudScreenUserResponseEntityWithDefaults() *FraudScreenUserResponseEntity`

NewFraudScreenUserResponseEntityWithDefaults instantiates a new FraudScreenUserResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmlScreeningResult

`func (o *FraudScreenUserResponseEntity) GetAmlScreeningResult() string`

GetAmlScreeningResult returns the AmlScreeningResult field if non-nil, zero value otherwise.

### GetAmlScreeningResultOk

`func (o *FraudScreenUserResponseEntity) GetAmlScreeningResultOk() (*string, bool)`

GetAmlScreeningResultOk returns a tuple with the AmlScreeningResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmlScreeningResult

`func (o *FraudScreenUserResponseEntity) SetAmlScreeningResult(v string)`

SetAmlScreeningResult sets AmlScreeningResult field to given value.

### HasAmlScreeningResult

`func (o *FraudScreenUserResponseEntity) HasAmlScreeningResult() bool`

HasAmlScreeningResult returns a boolean if a field has been set.

### SetAmlScreeningResultNil

`func (o *FraudScreenUserResponseEntity) SetAmlScreeningResultNil(b bool)`

 SetAmlScreeningResultNil sets the value for AmlScreeningResult to be an explicit nil

### UnsetAmlScreeningResult
`func (o *FraudScreenUserResponseEntity) UnsetAmlScreeningResult()`

UnsetAmlScreeningResult ensures that no value is present for AmlScreeningResult, not even an explicit nil
### GetIpCheckResult

`func (o *FraudScreenUserResponseEntity) GetIpCheckResult() FraudScreenUserResponseEntityIpCheckResult`

GetIpCheckResult returns the IpCheckResult field if non-nil, zero value otherwise.

### GetIpCheckResultOk

`func (o *FraudScreenUserResponseEntity) GetIpCheckResultOk() (*FraudScreenUserResponseEntityIpCheckResult, bool)`

GetIpCheckResultOk returns a tuple with the IpCheckResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpCheckResult

`func (o *FraudScreenUserResponseEntity) SetIpCheckResult(v FraudScreenUserResponseEntityIpCheckResult)`

SetIpCheckResult sets IpCheckResult field to given value.

### HasIpCheckResult

`func (o *FraudScreenUserResponseEntity) HasIpCheckResult() bool`

HasIpCheckResult returns a boolean if a field has been set.

### GetEmailCheckResult

`func (o *FraudScreenUserResponseEntity) GetEmailCheckResult() FraudScreenUserResponseEntityEmailCheckResult`

GetEmailCheckResult returns the EmailCheckResult field if non-nil, zero value otherwise.

### GetEmailCheckResultOk

`func (o *FraudScreenUserResponseEntity) GetEmailCheckResultOk() (*FraudScreenUserResponseEntityEmailCheckResult, bool)`

GetEmailCheckResultOk returns a tuple with the EmailCheckResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailCheckResult

`func (o *FraudScreenUserResponseEntity) SetEmailCheckResult(v FraudScreenUserResponseEntityEmailCheckResult)`

SetEmailCheckResult sets EmailCheckResult field to given value.

### HasEmailCheckResult

`func (o *FraudScreenUserResponseEntity) HasEmailCheckResult() bool`

HasEmailCheckResult returns a boolean if a field has been set.

### GetPhoneCheckResult

`func (o *FraudScreenUserResponseEntity) GetPhoneCheckResult() FraudScreenUserResponseEntityPhoneCheckResult`

GetPhoneCheckResult returns the PhoneCheckResult field if non-nil, zero value otherwise.

### GetPhoneCheckResultOk

`func (o *FraudScreenUserResponseEntity) GetPhoneCheckResultOk() (*FraudScreenUserResponseEntityPhoneCheckResult, bool)`

GetPhoneCheckResultOk returns a tuple with the PhoneCheckResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneCheckResult

`func (o *FraudScreenUserResponseEntity) SetPhoneCheckResult(v FraudScreenUserResponseEntityPhoneCheckResult)`

SetPhoneCheckResult sets PhoneCheckResult field to given value.

### HasPhoneCheckResult

`func (o *FraudScreenUserResponseEntity) HasPhoneCheckResult() bool`

HasPhoneCheckResult returns a boolean if a field has been set.

### GetOverallRiskScore

`func (o *FraudScreenUserResponseEntity) GetOverallRiskScore() float32`

GetOverallRiskScore returns the OverallRiskScore field if non-nil, zero value otherwise.

### GetOverallRiskScoreOk

`func (o *FraudScreenUserResponseEntity) GetOverallRiskScoreOk() (*float32, bool)`

GetOverallRiskScoreOk returns a tuple with the OverallRiskScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverallRiskScore

`func (o *FraudScreenUserResponseEntity) SetOverallRiskScore(v float32)`

SetOverallRiskScore sets OverallRiskScore field to given value.

### HasOverallRiskScore

`func (o *FraudScreenUserResponseEntity) HasOverallRiskScore() bool`

HasOverallRiskScore returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


