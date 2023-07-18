# FraudScreenUserResponseEntityPhoneCheckResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Number** | Pointer to **float32** |  | [optional] 
**Valid** | Pointer to **bool** |  | [optional] 
**Disposable** | Pointer to **bool** |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 
**Country** | Pointer to **string** |  | [optional] 
**Carrier** | Pointer to **string** |  | [optional] 
**Score** | Pointer to **float32** |  | [optional] 
**AccountDetailsRegistered** | Pointer to **[]string** |  | [optional] 

## Methods

### NewFraudScreenUserResponseEntityPhoneCheckResult

`func NewFraudScreenUserResponseEntityPhoneCheckResult() *FraudScreenUserResponseEntityPhoneCheckResult`

NewFraudScreenUserResponseEntityPhoneCheckResult instantiates a new FraudScreenUserResponseEntityPhoneCheckResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFraudScreenUserResponseEntityPhoneCheckResultWithDefaults

`func NewFraudScreenUserResponseEntityPhoneCheckResultWithDefaults() *FraudScreenUserResponseEntityPhoneCheckResult`

NewFraudScreenUserResponseEntityPhoneCheckResultWithDefaults instantiates a new FraudScreenUserResponseEntityPhoneCheckResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNumber

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetNumber() float32`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetNumberOk() (*float32, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) SetNumber(v float32)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetValid

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetValid() bool`

GetValid returns the Valid field if non-nil, zero value otherwise.

### GetValidOk

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetValidOk() (*bool, bool)`

GetValidOk returns a tuple with the Valid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValid

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) SetValid(v bool)`

SetValid sets Valid field to given value.

### HasValid

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) HasValid() bool`

HasValid returns a boolean if a field has been set.

### GetDisposable

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetDisposable() bool`

GetDisposable returns the Disposable field if non-nil, zero value otherwise.

### GetDisposableOk

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetDisposableOk() (*bool, bool)`

GetDisposableOk returns a tuple with the Disposable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisposable

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) SetDisposable(v bool)`

SetDisposable sets Disposable field to given value.

### HasDisposable

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) HasDisposable() bool`

HasDisposable returns a boolean if a field has been set.

### GetType

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) HasType() bool`

HasType returns a boolean if a field has been set.

### GetCountry

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCarrier

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetCarrier() string`

GetCarrier returns the Carrier field if non-nil, zero value otherwise.

### GetCarrierOk

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetCarrierOk() (*string, bool)`

GetCarrierOk returns a tuple with the Carrier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarrier

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) SetCarrier(v string)`

SetCarrier sets Carrier field to given value.

### HasCarrier

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) HasCarrier() bool`

HasCarrier returns a boolean if a field has been set.

### GetScore

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetScore() float32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetScoreOk() (*float32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) SetScore(v float32)`

SetScore sets Score field to given value.

### HasScore

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) HasScore() bool`

HasScore returns a boolean if a field has been set.

### GetAccountDetailsRegistered

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetAccountDetailsRegistered() []string`

GetAccountDetailsRegistered returns the AccountDetailsRegistered field if non-nil, zero value otherwise.

### GetAccountDetailsRegisteredOk

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) GetAccountDetailsRegisteredOk() (*[]string, bool)`

GetAccountDetailsRegisteredOk returns a tuple with the AccountDetailsRegistered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountDetailsRegistered

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) SetAccountDetailsRegistered(v []string)`

SetAccountDetailsRegistered sets AccountDetailsRegistered field to given value.

### HasAccountDetailsRegistered

`func (o *FraudScreenUserResponseEntityPhoneCheckResult) HasAccountDetailsRegistered() bool`

HasAccountDetailsRegistered returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


