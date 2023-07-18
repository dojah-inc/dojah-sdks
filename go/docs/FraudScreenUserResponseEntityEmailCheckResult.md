# FraudScreenUserResponseEntityEmailCheckResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | Pointer to **string** |  | [optional] 
**Score** | Pointer to **float32** |  | [optional] 
**Deliverable** | Pointer to **bool** |  | [optional] 
**DomainDetails** | Pointer to [**FraudScreenUserResponseEntityEmailCheckResultDomainDetails**](FraudScreenUserResponseEntityEmailCheckResultDomainDetails.md) |  | [optional] 
**BreachDetails** | Pointer to [**FraudScreenUserResponseEntityEmailCheckResultBreachDetails**](FraudScreenUserResponseEntityEmailCheckResultBreachDetails.md) |  | [optional] 
**AccountDetailsRegistered** | Pointer to **[]string** |  | [optional] 

## Methods

### NewFraudScreenUserResponseEntityEmailCheckResult

`func NewFraudScreenUserResponseEntityEmailCheckResult() *FraudScreenUserResponseEntityEmailCheckResult`

NewFraudScreenUserResponseEntityEmailCheckResult instantiates a new FraudScreenUserResponseEntityEmailCheckResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFraudScreenUserResponseEntityEmailCheckResultWithDefaults

`func NewFraudScreenUserResponseEntityEmailCheckResultWithDefaults() *FraudScreenUserResponseEntityEmailCheckResult`

NewFraudScreenUserResponseEntityEmailCheckResultWithDefaults instantiates a new FraudScreenUserResponseEntityEmailCheckResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *FraudScreenUserResponseEntityEmailCheckResult) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *FraudScreenUserResponseEntityEmailCheckResult) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetScore

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetScore() float32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetScoreOk() (*float32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *FraudScreenUserResponseEntityEmailCheckResult) SetScore(v float32)`

SetScore sets Score field to given value.

### HasScore

`func (o *FraudScreenUserResponseEntityEmailCheckResult) HasScore() bool`

HasScore returns a boolean if a field has been set.

### GetDeliverable

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetDeliverable() bool`

GetDeliverable returns the Deliverable field if non-nil, zero value otherwise.

### GetDeliverableOk

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetDeliverableOk() (*bool, bool)`

GetDeliverableOk returns a tuple with the Deliverable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliverable

`func (o *FraudScreenUserResponseEntityEmailCheckResult) SetDeliverable(v bool)`

SetDeliverable sets Deliverable field to given value.

### HasDeliverable

`func (o *FraudScreenUserResponseEntityEmailCheckResult) HasDeliverable() bool`

HasDeliverable returns a boolean if a field has been set.

### GetDomainDetails

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetDomainDetails() FraudScreenUserResponseEntityEmailCheckResultDomainDetails`

GetDomainDetails returns the DomainDetails field if non-nil, zero value otherwise.

### GetDomainDetailsOk

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetDomainDetailsOk() (*FraudScreenUserResponseEntityEmailCheckResultDomainDetails, bool)`

GetDomainDetailsOk returns a tuple with the DomainDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomainDetails

`func (o *FraudScreenUserResponseEntityEmailCheckResult) SetDomainDetails(v FraudScreenUserResponseEntityEmailCheckResultDomainDetails)`

SetDomainDetails sets DomainDetails field to given value.

### HasDomainDetails

`func (o *FraudScreenUserResponseEntityEmailCheckResult) HasDomainDetails() bool`

HasDomainDetails returns a boolean if a field has been set.

### GetBreachDetails

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetBreachDetails() FraudScreenUserResponseEntityEmailCheckResultBreachDetails`

GetBreachDetails returns the BreachDetails field if non-nil, zero value otherwise.

### GetBreachDetailsOk

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetBreachDetailsOk() (*FraudScreenUserResponseEntityEmailCheckResultBreachDetails, bool)`

GetBreachDetailsOk returns a tuple with the BreachDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBreachDetails

`func (o *FraudScreenUserResponseEntityEmailCheckResult) SetBreachDetails(v FraudScreenUserResponseEntityEmailCheckResultBreachDetails)`

SetBreachDetails sets BreachDetails field to given value.

### HasBreachDetails

`func (o *FraudScreenUserResponseEntityEmailCheckResult) HasBreachDetails() bool`

HasBreachDetails returns a boolean if a field has been set.

### GetAccountDetailsRegistered

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetAccountDetailsRegistered() []string`

GetAccountDetailsRegistered returns the AccountDetailsRegistered field if non-nil, zero value otherwise.

### GetAccountDetailsRegisteredOk

`func (o *FraudScreenUserResponseEntityEmailCheckResult) GetAccountDetailsRegisteredOk() (*[]string, bool)`

GetAccountDetailsRegisteredOk returns a tuple with the AccountDetailsRegistered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountDetailsRegistered

`func (o *FraudScreenUserResponseEntityEmailCheckResult) SetAccountDetailsRegistered(v []string)`

SetAccountDetailsRegistered sets AccountDetailsRegistered field to given value.

### HasAccountDetailsRegistered

`func (o *FraudScreenUserResponseEntityEmailCheckResult) HasAccountDetailsRegistered() bool`

HasAccountDetailsRegistered returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


