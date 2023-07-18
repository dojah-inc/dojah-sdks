# FraudGetEmailReputationResponseEntityDomainDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Domain** | Pointer to **string** |  | [optional] 
**Tld** | Pointer to **string** |  | [optional] 
**Registered** | Pointer to **bool** |  | [optional] 
**Created** | Pointer to **string** |  | [optional] 
**Updated** | Pointer to **string** |  | [optional] 
**Expires** | Pointer to **string** |  | [optional] 
**RegistrarName** | Pointer to **string** |  | [optional] 
**RegisteredTo** | Pointer to **NullableString** |  | [optional] 
**Disposable** | Pointer to **bool** |  | [optional] 
**Free** | Pointer to **bool** |  | [optional] 
**Custom** | Pointer to **bool** |  | [optional] 
**DmarcEnforced** | Pointer to **bool** |  | [optional] 
**SpfStrict** | Pointer to **bool** |  | [optional] 
**ValidMx** | Pointer to **bool** |  | [optional] 
**AcceptAll** | Pointer to **bool** |  | [optional] 
**SuspiciousTld** | Pointer to **bool** |  | [optional] 
**WebsiteExists** | Pointer to **bool** |  | [optional] 

## Methods

### NewFraudGetEmailReputationResponseEntityDomainDetails

`func NewFraudGetEmailReputationResponseEntityDomainDetails() *FraudGetEmailReputationResponseEntityDomainDetails`

NewFraudGetEmailReputationResponseEntityDomainDetails instantiates a new FraudGetEmailReputationResponseEntityDomainDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFraudGetEmailReputationResponseEntityDomainDetailsWithDefaults

`func NewFraudGetEmailReputationResponseEntityDomainDetailsWithDefaults() *FraudGetEmailReputationResponseEntityDomainDetails`

NewFraudGetEmailReputationResponseEntityDomainDetailsWithDefaults instantiates a new FraudGetEmailReputationResponseEntityDomainDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDomain

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetDomain() string`

GetDomain returns the Domain field if non-nil, zero value otherwise.

### GetDomainOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetDomainOk() (*string, bool)`

GetDomainOk returns a tuple with the Domain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomain

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetDomain(v string)`

SetDomain sets Domain field to given value.

### HasDomain

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasDomain() bool`

HasDomain returns a boolean if a field has been set.

### GetTld

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetTld() string`

GetTld returns the Tld field if non-nil, zero value otherwise.

### GetTldOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetTldOk() (*string, bool)`

GetTldOk returns a tuple with the Tld field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTld

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetTld(v string)`

SetTld sets Tld field to given value.

### HasTld

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasTld() bool`

HasTld returns a boolean if a field has been set.

### GetRegistered

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetRegistered() bool`

GetRegistered returns the Registered field if non-nil, zero value otherwise.

### GetRegisteredOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetRegisteredOk() (*bool, bool)`

GetRegisteredOk returns a tuple with the Registered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistered

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetRegistered(v bool)`

SetRegistered sets Registered field to given value.

### HasRegistered

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasRegistered() bool`

HasRegistered returns a boolean if a field has been set.

### GetCreated

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetCreated() string`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetCreatedOk() (*string, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetCreated(v string)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetUpdated

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetUpdated() string`

GetUpdated returns the Updated field if non-nil, zero value otherwise.

### GetUpdatedOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetUpdatedOk() (*string, bool)`

GetUpdatedOk returns a tuple with the Updated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdated

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetUpdated(v string)`

SetUpdated sets Updated field to given value.

### HasUpdated

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasUpdated() bool`

HasUpdated returns a boolean if a field has been set.

### GetExpires

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetExpires() string`

GetExpires returns the Expires field if non-nil, zero value otherwise.

### GetExpiresOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetExpiresOk() (*string, bool)`

GetExpiresOk returns a tuple with the Expires field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpires

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetExpires(v string)`

SetExpires sets Expires field to given value.

### HasExpires

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasExpires() bool`

HasExpires returns a boolean if a field has been set.

### GetRegistrarName

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetRegistrarName() string`

GetRegistrarName returns the RegistrarName field if non-nil, zero value otherwise.

### GetRegistrarNameOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetRegistrarNameOk() (*string, bool)`

GetRegistrarNameOk returns a tuple with the RegistrarName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistrarName

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetRegistrarName(v string)`

SetRegistrarName sets RegistrarName field to given value.

### HasRegistrarName

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasRegistrarName() bool`

HasRegistrarName returns a boolean if a field has been set.

### GetRegisteredTo

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetRegisteredTo() string`

GetRegisteredTo returns the RegisteredTo field if non-nil, zero value otherwise.

### GetRegisteredToOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetRegisteredToOk() (*string, bool)`

GetRegisteredToOk returns a tuple with the RegisteredTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegisteredTo

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetRegisteredTo(v string)`

SetRegisteredTo sets RegisteredTo field to given value.

### HasRegisteredTo

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasRegisteredTo() bool`

HasRegisteredTo returns a boolean if a field has been set.

### SetRegisteredToNil

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetRegisteredToNil(b bool)`

 SetRegisteredToNil sets the value for RegisteredTo to be an explicit nil

### UnsetRegisteredTo
`func (o *FraudGetEmailReputationResponseEntityDomainDetails) UnsetRegisteredTo()`

UnsetRegisteredTo ensures that no value is present for RegisteredTo, not even an explicit nil
### GetDisposable

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetDisposable() bool`

GetDisposable returns the Disposable field if non-nil, zero value otherwise.

### GetDisposableOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetDisposableOk() (*bool, bool)`

GetDisposableOk returns a tuple with the Disposable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisposable

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetDisposable(v bool)`

SetDisposable sets Disposable field to given value.

### HasDisposable

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasDisposable() bool`

HasDisposable returns a boolean if a field has been set.

### GetFree

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetFree() bool`

GetFree returns the Free field if non-nil, zero value otherwise.

### GetFreeOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetFreeOk() (*bool, bool)`

GetFreeOk returns a tuple with the Free field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFree

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetFree(v bool)`

SetFree sets Free field to given value.

### HasFree

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasFree() bool`

HasFree returns a boolean if a field has been set.

### GetCustom

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetCustom() bool`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetCustomOk() (*bool, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetCustom(v bool)`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasCustom() bool`

HasCustom returns a boolean if a field has been set.

### GetDmarcEnforced

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetDmarcEnforced() bool`

GetDmarcEnforced returns the DmarcEnforced field if non-nil, zero value otherwise.

### GetDmarcEnforcedOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetDmarcEnforcedOk() (*bool, bool)`

GetDmarcEnforcedOk returns a tuple with the DmarcEnforced field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDmarcEnforced

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetDmarcEnforced(v bool)`

SetDmarcEnforced sets DmarcEnforced field to given value.

### HasDmarcEnforced

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasDmarcEnforced() bool`

HasDmarcEnforced returns a boolean if a field has been set.

### GetSpfStrict

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetSpfStrict() bool`

GetSpfStrict returns the SpfStrict field if non-nil, zero value otherwise.

### GetSpfStrictOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetSpfStrictOk() (*bool, bool)`

GetSpfStrictOk returns a tuple with the SpfStrict field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpfStrict

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetSpfStrict(v bool)`

SetSpfStrict sets SpfStrict field to given value.

### HasSpfStrict

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasSpfStrict() bool`

HasSpfStrict returns a boolean if a field has been set.

### GetValidMx

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetValidMx() bool`

GetValidMx returns the ValidMx field if non-nil, zero value otherwise.

### GetValidMxOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetValidMxOk() (*bool, bool)`

GetValidMxOk returns a tuple with the ValidMx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidMx

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetValidMx(v bool)`

SetValidMx sets ValidMx field to given value.

### HasValidMx

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasValidMx() bool`

HasValidMx returns a boolean if a field has been set.

### GetAcceptAll

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetAcceptAll() bool`

GetAcceptAll returns the AcceptAll field if non-nil, zero value otherwise.

### GetAcceptAllOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetAcceptAllOk() (*bool, bool)`

GetAcceptAllOk returns a tuple with the AcceptAll field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptAll

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetAcceptAll(v bool)`

SetAcceptAll sets AcceptAll field to given value.

### HasAcceptAll

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasAcceptAll() bool`

HasAcceptAll returns a boolean if a field has been set.

### GetSuspiciousTld

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetSuspiciousTld() bool`

GetSuspiciousTld returns the SuspiciousTld field if non-nil, zero value otherwise.

### GetSuspiciousTldOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetSuspiciousTldOk() (*bool, bool)`

GetSuspiciousTldOk returns a tuple with the SuspiciousTld field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspiciousTld

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetSuspiciousTld(v bool)`

SetSuspiciousTld sets SuspiciousTld field to given value.

### HasSuspiciousTld

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasSuspiciousTld() bool`

HasSuspiciousTld returns a boolean if a field has been set.

### GetWebsiteExists

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetWebsiteExists() bool`

GetWebsiteExists returns the WebsiteExists field if non-nil, zero value otherwise.

### GetWebsiteExistsOk

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) GetWebsiteExistsOk() (*bool, bool)`

GetWebsiteExistsOk returns a tuple with the WebsiteExists field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsiteExists

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) SetWebsiteExists(v bool)`

SetWebsiteExists sets WebsiteExists field to given value.

### HasWebsiteExists

`func (o *FraudGetEmailReputationResponseEntityDomainDetails) HasWebsiteExists() bool`

HasWebsiteExists returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


