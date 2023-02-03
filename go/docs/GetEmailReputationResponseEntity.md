# GetEmailReputationResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | Pointer to **string** |  | [optional] 
**Reputation** | Pointer to **string** |  | [optional] 
**Suspicious** | Pointer to **bool** |  | [optional] 
**References** | Pointer to **float32** |  | [optional] 
**Details** | Pointer to [**GetEmailReputationResponseEntityDetails**](GetEmailReputationResponseEntityDetails.md) |  | [optional] 

## Methods

### NewGetEmailReputationResponseEntity

`func NewGetEmailReputationResponseEntity() *GetEmailReputationResponseEntity`

NewGetEmailReputationResponseEntity instantiates a new GetEmailReputationResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetEmailReputationResponseEntityWithDefaults

`func NewGetEmailReputationResponseEntityWithDefaults() *GetEmailReputationResponseEntity`

NewGetEmailReputationResponseEntityWithDefaults instantiates a new GetEmailReputationResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *GetEmailReputationResponseEntity) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *GetEmailReputationResponseEntity) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *GetEmailReputationResponseEntity) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *GetEmailReputationResponseEntity) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetReputation

`func (o *GetEmailReputationResponseEntity) GetReputation() string`

GetReputation returns the Reputation field if non-nil, zero value otherwise.

### GetReputationOk

`func (o *GetEmailReputationResponseEntity) GetReputationOk() (*string, bool)`

GetReputationOk returns a tuple with the Reputation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReputation

`func (o *GetEmailReputationResponseEntity) SetReputation(v string)`

SetReputation sets Reputation field to given value.

### HasReputation

`func (o *GetEmailReputationResponseEntity) HasReputation() bool`

HasReputation returns a boolean if a field has been set.

### GetSuspicious

`func (o *GetEmailReputationResponseEntity) GetSuspicious() bool`

GetSuspicious returns the Suspicious field if non-nil, zero value otherwise.

### GetSuspiciousOk

`func (o *GetEmailReputationResponseEntity) GetSuspiciousOk() (*bool, bool)`

GetSuspiciousOk returns a tuple with the Suspicious field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspicious

`func (o *GetEmailReputationResponseEntity) SetSuspicious(v bool)`

SetSuspicious sets Suspicious field to given value.

### HasSuspicious

`func (o *GetEmailReputationResponseEntity) HasSuspicious() bool`

HasSuspicious returns a boolean if a field has been set.

### GetReferences

`func (o *GetEmailReputationResponseEntity) GetReferences() float32`

GetReferences returns the References field if non-nil, zero value otherwise.

### GetReferencesOk

`func (o *GetEmailReputationResponseEntity) GetReferencesOk() (*float32, bool)`

GetReferencesOk returns a tuple with the References field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReferences

`func (o *GetEmailReputationResponseEntity) SetReferences(v float32)`

SetReferences sets References field to given value.

### HasReferences

`func (o *GetEmailReputationResponseEntity) HasReferences() bool`

HasReferences returns a boolean if a field has been set.

### GetDetails

`func (o *GetEmailReputationResponseEntity) GetDetails() GetEmailReputationResponseEntityDetails`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *GetEmailReputationResponseEntity) GetDetailsOk() (*GetEmailReputationResponseEntityDetails, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *GetEmailReputationResponseEntity) SetDetails(v GetEmailReputationResponseEntityDetails)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *GetEmailReputationResponseEntity) HasDetails() bool`

HasDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


