# FraudGetEmailReputationResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | Pointer to **string** |  | [optional] 
**Reputation** | Pointer to **string** |  | [optional] 
**Suspicious** | Pointer to **bool** |  | [optional] 
**References** | Pointer to **float32** |  | [optional] 
**Details** | Pointer to [**FraudGetEmailReputationResponseEntityDetails**](FraudGetEmailReputationResponseEntityDetails.md) |  | [optional] 
**Score** | Pointer to **float32** |  | [optional] 
**Deliverable** | Pointer to **bool** |  | [optional] 
**DomainDetails** | Pointer to [**FraudGetEmailReputationResponseEntityDomainDetails**](FraudGetEmailReputationResponseEntityDomainDetails.md) |  | [optional] 
**BreachDetails** | Pointer to [**FraudGetEmailReputationResponseEntityBreachDetails**](FraudGetEmailReputationResponseEntityBreachDetails.md) |  | [optional] 
**AccountDetailsRegistered** | Pointer to **[]string** |  | [optional] 

## Methods

### NewFraudGetEmailReputationResponseEntity

`func NewFraudGetEmailReputationResponseEntity() *FraudGetEmailReputationResponseEntity`

NewFraudGetEmailReputationResponseEntity instantiates a new FraudGetEmailReputationResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFraudGetEmailReputationResponseEntityWithDefaults

`func NewFraudGetEmailReputationResponseEntityWithDefaults() *FraudGetEmailReputationResponseEntity`

NewFraudGetEmailReputationResponseEntityWithDefaults instantiates a new FraudGetEmailReputationResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *FraudGetEmailReputationResponseEntity) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *FraudGetEmailReputationResponseEntity) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *FraudGetEmailReputationResponseEntity) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *FraudGetEmailReputationResponseEntity) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetReputation

`func (o *FraudGetEmailReputationResponseEntity) GetReputation() string`

GetReputation returns the Reputation field if non-nil, zero value otherwise.

### GetReputationOk

`func (o *FraudGetEmailReputationResponseEntity) GetReputationOk() (*string, bool)`

GetReputationOk returns a tuple with the Reputation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReputation

`func (o *FraudGetEmailReputationResponseEntity) SetReputation(v string)`

SetReputation sets Reputation field to given value.

### HasReputation

`func (o *FraudGetEmailReputationResponseEntity) HasReputation() bool`

HasReputation returns a boolean if a field has been set.

### GetSuspicious

`func (o *FraudGetEmailReputationResponseEntity) GetSuspicious() bool`

GetSuspicious returns the Suspicious field if non-nil, zero value otherwise.

### GetSuspiciousOk

`func (o *FraudGetEmailReputationResponseEntity) GetSuspiciousOk() (*bool, bool)`

GetSuspiciousOk returns a tuple with the Suspicious field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspicious

`func (o *FraudGetEmailReputationResponseEntity) SetSuspicious(v bool)`

SetSuspicious sets Suspicious field to given value.

### HasSuspicious

`func (o *FraudGetEmailReputationResponseEntity) HasSuspicious() bool`

HasSuspicious returns a boolean if a field has been set.

### GetReferences

`func (o *FraudGetEmailReputationResponseEntity) GetReferences() float32`

GetReferences returns the References field if non-nil, zero value otherwise.

### GetReferencesOk

`func (o *FraudGetEmailReputationResponseEntity) GetReferencesOk() (*float32, bool)`

GetReferencesOk returns a tuple with the References field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReferences

`func (o *FraudGetEmailReputationResponseEntity) SetReferences(v float32)`

SetReferences sets References field to given value.

### HasReferences

`func (o *FraudGetEmailReputationResponseEntity) HasReferences() bool`

HasReferences returns a boolean if a field has been set.

### GetDetails

`func (o *FraudGetEmailReputationResponseEntity) GetDetails() FraudGetEmailReputationResponseEntityDetails`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *FraudGetEmailReputationResponseEntity) GetDetailsOk() (*FraudGetEmailReputationResponseEntityDetails, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *FraudGetEmailReputationResponseEntity) SetDetails(v FraudGetEmailReputationResponseEntityDetails)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *FraudGetEmailReputationResponseEntity) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetScore

`func (o *FraudGetEmailReputationResponseEntity) GetScore() float32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *FraudGetEmailReputationResponseEntity) GetScoreOk() (*float32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *FraudGetEmailReputationResponseEntity) SetScore(v float32)`

SetScore sets Score field to given value.

### HasScore

`func (o *FraudGetEmailReputationResponseEntity) HasScore() bool`

HasScore returns a boolean if a field has been set.

### GetDeliverable

`func (o *FraudGetEmailReputationResponseEntity) GetDeliverable() bool`

GetDeliverable returns the Deliverable field if non-nil, zero value otherwise.

### GetDeliverableOk

`func (o *FraudGetEmailReputationResponseEntity) GetDeliverableOk() (*bool, bool)`

GetDeliverableOk returns a tuple with the Deliverable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliverable

`func (o *FraudGetEmailReputationResponseEntity) SetDeliverable(v bool)`

SetDeliverable sets Deliverable field to given value.

### HasDeliverable

`func (o *FraudGetEmailReputationResponseEntity) HasDeliverable() bool`

HasDeliverable returns a boolean if a field has been set.

### GetDomainDetails

`func (o *FraudGetEmailReputationResponseEntity) GetDomainDetails() FraudGetEmailReputationResponseEntityDomainDetails`

GetDomainDetails returns the DomainDetails field if non-nil, zero value otherwise.

### GetDomainDetailsOk

`func (o *FraudGetEmailReputationResponseEntity) GetDomainDetailsOk() (*FraudGetEmailReputationResponseEntityDomainDetails, bool)`

GetDomainDetailsOk returns a tuple with the DomainDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomainDetails

`func (o *FraudGetEmailReputationResponseEntity) SetDomainDetails(v FraudGetEmailReputationResponseEntityDomainDetails)`

SetDomainDetails sets DomainDetails field to given value.

### HasDomainDetails

`func (o *FraudGetEmailReputationResponseEntity) HasDomainDetails() bool`

HasDomainDetails returns a boolean if a field has been set.

### GetBreachDetails

`func (o *FraudGetEmailReputationResponseEntity) GetBreachDetails() FraudGetEmailReputationResponseEntityBreachDetails`

GetBreachDetails returns the BreachDetails field if non-nil, zero value otherwise.

### GetBreachDetailsOk

`func (o *FraudGetEmailReputationResponseEntity) GetBreachDetailsOk() (*FraudGetEmailReputationResponseEntityBreachDetails, bool)`

GetBreachDetailsOk returns a tuple with the BreachDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBreachDetails

`func (o *FraudGetEmailReputationResponseEntity) SetBreachDetails(v FraudGetEmailReputationResponseEntityBreachDetails)`

SetBreachDetails sets BreachDetails field to given value.

### HasBreachDetails

`func (o *FraudGetEmailReputationResponseEntity) HasBreachDetails() bool`

HasBreachDetails returns a boolean if a field has been set.

### GetAccountDetailsRegistered

`func (o *FraudGetEmailReputationResponseEntity) GetAccountDetailsRegistered() []string`

GetAccountDetailsRegistered returns the AccountDetailsRegistered field if non-nil, zero value otherwise.

### GetAccountDetailsRegisteredOk

`func (o *FraudGetEmailReputationResponseEntity) GetAccountDetailsRegisteredOk() (*[]string, bool)`

GetAccountDetailsRegisteredOk returns a tuple with the AccountDetailsRegistered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountDetailsRegistered

`func (o *FraudGetEmailReputationResponseEntity) SetAccountDetailsRegistered(v []string)`

SetAccountDetailsRegistered sets AccountDetailsRegistered field to given value.

### HasAccountDetailsRegistered

`func (o *FraudGetEmailReputationResponseEntity) HasAccountDetailsRegistered() bool`

HasAccountDetailsRegistered returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


