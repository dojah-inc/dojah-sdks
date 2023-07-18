# FraudGetEmailReputationResponseEntityDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blacklisted** | Pointer to **bool** |  | [optional] 
**MaliciousActivity** | Pointer to **bool** |  | [optional] 
**MaliciousActivityRecent** | Pointer to **bool** |  | [optional] 
**CredentialsLeaked** | Pointer to **bool** |  | [optional] 
**CredentialsLeakedRecent** | Pointer to **bool** |  | [optional] 
**DataBreach** | Pointer to **bool** |  | [optional] 
**FirstSeen** | Pointer to **string** |  | [optional] 
**LastSeen** | Pointer to **string** |  | [optional] 
**DomainExists** | Pointer to **bool** |  | [optional] 
**DomainReputation** | Pointer to **string** |  | [optional] 
**NewDomain** | Pointer to **bool** |  | [optional] 
**DaysSinceDomainCreation** | Pointer to **float32** |  | [optional] 
**SuspiciousTld** | Pointer to **bool** |  | [optional] 
**Spam** | Pointer to **bool** |  | [optional] 
**FreeProvider** | Pointer to **bool** |  | [optional] 
**Disposable** | Pointer to **bool** |  | [optional] 
**Deliverable** | Pointer to **bool** |  | [optional] 
**AcceptAll** | Pointer to **bool** |  | [optional] 
**ValidMx** | Pointer to **bool** |  | [optional] 
**PrimaryMx** | Pointer to **string** |  | [optional] 
**Spoofable** | Pointer to **bool** |  | [optional] 
**SpfStrict** | Pointer to **bool** |  | [optional] 
**DmarcEnforced** | Pointer to **bool** |  | [optional] 
**Profiles** | Pointer to **[]string** |  | [optional] 

## Methods

### NewFraudGetEmailReputationResponseEntityDetails

`func NewFraudGetEmailReputationResponseEntityDetails() *FraudGetEmailReputationResponseEntityDetails`

NewFraudGetEmailReputationResponseEntityDetails instantiates a new FraudGetEmailReputationResponseEntityDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFraudGetEmailReputationResponseEntityDetailsWithDefaults

`func NewFraudGetEmailReputationResponseEntityDetailsWithDefaults() *FraudGetEmailReputationResponseEntityDetails`

NewFraudGetEmailReputationResponseEntityDetailsWithDefaults instantiates a new FraudGetEmailReputationResponseEntityDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlacklisted

`func (o *FraudGetEmailReputationResponseEntityDetails) GetBlacklisted() bool`

GetBlacklisted returns the Blacklisted field if non-nil, zero value otherwise.

### GetBlacklistedOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetBlacklistedOk() (*bool, bool)`

GetBlacklistedOk returns a tuple with the Blacklisted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlacklisted

`func (o *FraudGetEmailReputationResponseEntityDetails) SetBlacklisted(v bool)`

SetBlacklisted sets Blacklisted field to given value.

### HasBlacklisted

`func (o *FraudGetEmailReputationResponseEntityDetails) HasBlacklisted() bool`

HasBlacklisted returns a boolean if a field has been set.

### GetMaliciousActivity

`func (o *FraudGetEmailReputationResponseEntityDetails) GetMaliciousActivity() bool`

GetMaliciousActivity returns the MaliciousActivity field if non-nil, zero value otherwise.

### GetMaliciousActivityOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetMaliciousActivityOk() (*bool, bool)`

GetMaliciousActivityOk returns a tuple with the MaliciousActivity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaliciousActivity

`func (o *FraudGetEmailReputationResponseEntityDetails) SetMaliciousActivity(v bool)`

SetMaliciousActivity sets MaliciousActivity field to given value.

### HasMaliciousActivity

`func (o *FraudGetEmailReputationResponseEntityDetails) HasMaliciousActivity() bool`

HasMaliciousActivity returns a boolean if a field has been set.

### GetMaliciousActivityRecent

`func (o *FraudGetEmailReputationResponseEntityDetails) GetMaliciousActivityRecent() bool`

GetMaliciousActivityRecent returns the MaliciousActivityRecent field if non-nil, zero value otherwise.

### GetMaliciousActivityRecentOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetMaliciousActivityRecentOk() (*bool, bool)`

GetMaliciousActivityRecentOk returns a tuple with the MaliciousActivityRecent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaliciousActivityRecent

`func (o *FraudGetEmailReputationResponseEntityDetails) SetMaliciousActivityRecent(v bool)`

SetMaliciousActivityRecent sets MaliciousActivityRecent field to given value.

### HasMaliciousActivityRecent

`func (o *FraudGetEmailReputationResponseEntityDetails) HasMaliciousActivityRecent() bool`

HasMaliciousActivityRecent returns a boolean if a field has been set.

### GetCredentialsLeaked

`func (o *FraudGetEmailReputationResponseEntityDetails) GetCredentialsLeaked() bool`

GetCredentialsLeaked returns the CredentialsLeaked field if non-nil, zero value otherwise.

### GetCredentialsLeakedOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetCredentialsLeakedOk() (*bool, bool)`

GetCredentialsLeakedOk returns a tuple with the CredentialsLeaked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentialsLeaked

`func (o *FraudGetEmailReputationResponseEntityDetails) SetCredentialsLeaked(v bool)`

SetCredentialsLeaked sets CredentialsLeaked field to given value.

### HasCredentialsLeaked

`func (o *FraudGetEmailReputationResponseEntityDetails) HasCredentialsLeaked() bool`

HasCredentialsLeaked returns a boolean if a field has been set.

### GetCredentialsLeakedRecent

`func (o *FraudGetEmailReputationResponseEntityDetails) GetCredentialsLeakedRecent() bool`

GetCredentialsLeakedRecent returns the CredentialsLeakedRecent field if non-nil, zero value otherwise.

### GetCredentialsLeakedRecentOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetCredentialsLeakedRecentOk() (*bool, bool)`

GetCredentialsLeakedRecentOk returns a tuple with the CredentialsLeakedRecent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentialsLeakedRecent

`func (o *FraudGetEmailReputationResponseEntityDetails) SetCredentialsLeakedRecent(v bool)`

SetCredentialsLeakedRecent sets CredentialsLeakedRecent field to given value.

### HasCredentialsLeakedRecent

`func (o *FraudGetEmailReputationResponseEntityDetails) HasCredentialsLeakedRecent() bool`

HasCredentialsLeakedRecent returns a boolean if a field has been set.

### GetDataBreach

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDataBreach() bool`

GetDataBreach returns the DataBreach field if non-nil, zero value otherwise.

### GetDataBreachOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDataBreachOk() (*bool, bool)`

GetDataBreachOk returns a tuple with the DataBreach field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataBreach

`func (o *FraudGetEmailReputationResponseEntityDetails) SetDataBreach(v bool)`

SetDataBreach sets DataBreach field to given value.

### HasDataBreach

`func (o *FraudGetEmailReputationResponseEntityDetails) HasDataBreach() bool`

HasDataBreach returns a boolean if a field has been set.

### GetFirstSeen

`func (o *FraudGetEmailReputationResponseEntityDetails) GetFirstSeen() string`

GetFirstSeen returns the FirstSeen field if non-nil, zero value otherwise.

### GetFirstSeenOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetFirstSeenOk() (*string, bool)`

GetFirstSeenOk returns a tuple with the FirstSeen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstSeen

`func (o *FraudGetEmailReputationResponseEntityDetails) SetFirstSeen(v string)`

SetFirstSeen sets FirstSeen field to given value.

### HasFirstSeen

`func (o *FraudGetEmailReputationResponseEntityDetails) HasFirstSeen() bool`

HasFirstSeen returns a boolean if a field has been set.

### GetLastSeen

`func (o *FraudGetEmailReputationResponseEntityDetails) GetLastSeen() string`

GetLastSeen returns the LastSeen field if non-nil, zero value otherwise.

### GetLastSeenOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetLastSeenOk() (*string, bool)`

GetLastSeenOk returns a tuple with the LastSeen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastSeen

`func (o *FraudGetEmailReputationResponseEntityDetails) SetLastSeen(v string)`

SetLastSeen sets LastSeen field to given value.

### HasLastSeen

`func (o *FraudGetEmailReputationResponseEntityDetails) HasLastSeen() bool`

HasLastSeen returns a boolean if a field has been set.

### GetDomainExists

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDomainExists() bool`

GetDomainExists returns the DomainExists field if non-nil, zero value otherwise.

### GetDomainExistsOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDomainExistsOk() (*bool, bool)`

GetDomainExistsOk returns a tuple with the DomainExists field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomainExists

`func (o *FraudGetEmailReputationResponseEntityDetails) SetDomainExists(v bool)`

SetDomainExists sets DomainExists field to given value.

### HasDomainExists

`func (o *FraudGetEmailReputationResponseEntityDetails) HasDomainExists() bool`

HasDomainExists returns a boolean if a field has been set.

### GetDomainReputation

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDomainReputation() string`

GetDomainReputation returns the DomainReputation field if non-nil, zero value otherwise.

### GetDomainReputationOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDomainReputationOk() (*string, bool)`

GetDomainReputationOk returns a tuple with the DomainReputation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomainReputation

`func (o *FraudGetEmailReputationResponseEntityDetails) SetDomainReputation(v string)`

SetDomainReputation sets DomainReputation field to given value.

### HasDomainReputation

`func (o *FraudGetEmailReputationResponseEntityDetails) HasDomainReputation() bool`

HasDomainReputation returns a boolean if a field has been set.

### GetNewDomain

`func (o *FraudGetEmailReputationResponseEntityDetails) GetNewDomain() bool`

GetNewDomain returns the NewDomain field if non-nil, zero value otherwise.

### GetNewDomainOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetNewDomainOk() (*bool, bool)`

GetNewDomainOk returns a tuple with the NewDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewDomain

`func (o *FraudGetEmailReputationResponseEntityDetails) SetNewDomain(v bool)`

SetNewDomain sets NewDomain field to given value.

### HasNewDomain

`func (o *FraudGetEmailReputationResponseEntityDetails) HasNewDomain() bool`

HasNewDomain returns a boolean if a field has been set.

### GetDaysSinceDomainCreation

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDaysSinceDomainCreation() float32`

GetDaysSinceDomainCreation returns the DaysSinceDomainCreation field if non-nil, zero value otherwise.

### GetDaysSinceDomainCreationOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDaysSinceDomainCreationOk() (*float32, bool)`

GetDaysSinceDomainCreationOk returns a tuple with the DaysSinceDomainCreation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaysSinceDomainCreation

`func (o *FraudGetEmailReputationResponseEntityDetails) SetDaysSinceDomainCreation(v float32)`

SetDaysSinceDomainCreation sets DaysSinceDomainCreation field to given value.

### HasDaysSinceDomainCreation

`func (o *FraudGetEmailReputationResponseEntityDetails) HasDaysSinceDomainCreation() bool`

HasDaysSinceDomainCreation returns a boolean if a field has been set.

### GetSuspiciousTld

`func (o *FraudGetEmailReputationResponseEntityDetails) GetSuspiciousTld() bool`

GetSuspiciousTld returns the SuspiciousTld field if non-nil, zero value otherwise.

### GetSuspiciousTldOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetSuspiciousTldOk() (*bool, bool)`

GetSuspiciousTldOk returns a tuple with the SuspiciousTld field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspiciousTld

`func (o *FraudGetEmailReputationResponseEntityDetails) SetSuspiciousTld(v bool)`

SetSuspiciousTld sets SuspiciousTld field to given value.

### HasSuspiciousTld

`func (o *FraudGetEmailReputationResponseEntityDetails) HasSuspiciousTld() bool`

HasSuspiciousTld returns a boolean if a field has been set.

### GetSpam

`func (o *FraudGetEmailReputationResponseEntityDetails) GetSpam() bool`

GetSpam returns the Spam field if non-nil, zero value otherwise.

### GetSpamOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetSpamOk() (*bool, bool)`

GetSpamOk returns a tuple with the Spam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpam

`func (o *FraudGetEmailReputationResponseEntityDetails) SetSpam(v bool)`

SetSpam sets Spam field to given value.

### HasSpam

`func (o *FraudGetEmailReputationResponseEntityDetails) HasSpam() bool`

HasSpam returns a boolean if a field has been set.

### GetFreeProvider

`func (o *FraudGetEmailReputationResponseEntityDetails) GetFreeProvider() bool`

GetFreeProvider returns the FreeProvider field if non-nil, zero value otherwise.

### GetFreeProviderOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetFreeProviderOk() (*bool, bool)`

GetFreeProviderOk returns a tuple with the FreeProvider field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreeProvider

`func (o *FraudGetEmailReputationResponseEntityDetails) SetFreeProvider(v bool)`

SetFreeProvider sets FreeProvider field to given value.

### HasFreeProvider

`func (o *FraudGetEmailReputationResponseEntityDetails) HasFreeProvider() bool`

HasFreeProvider returns a boolean if a field has been set.

### GetDisposable

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDisposable() bool`

GetDisposable returns the Disposable field if non-nil, zero value otherwise.

### GetDisposableOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDisposableOk() (*bool, bool)`

GetDisposableOk returns a tuple with the Disposable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisposable

`func (o *FraudGetEmailReputationResponseEntityDetails) SetDisposable(v bool)`

SetDisposable sets Disposable field to given value.

### HasDisposable

`func (o *FraudGetEmailReputationResponseEntityDetails) HasDisposable() bool`

HasDisposable returns a boolean if a field has been set.

### GetDeliverable

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDeliverable() bool`

GetDeliverable returns the Deliverable field if non-nil, zero value otherwise.

### GetDeliverableOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDeliverableOk() (*bool, bool)`

GetDeliverableOk returns a tuple with the Deliverable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliverable

`func (o *FraudGetEmailReputationResponseEntityDetails) SetDeliverable(v bool)`

SetDeliverable sets Deliverable field to given value.

### HasDeliverable

`func (o *FraudGetEmailReputationResponseEntityDetails) HasDeliverable() bool`

HasDeliverable returns a boolean if a field has been set.

### GetAcceptAll

`func (o *FraudGetEmailReputationResponseEntityDetails) GetAcceptAll() bool`

GetAcceptAll returns the AcceptAll field if non-nil, zero value otherwise.

### GetAcceptAllOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetAcceptAllOk() (*bool, bool)`

GetAcceptAllOk returns a tuple with the AcceptAll field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptAll

`func (o *FraudGetEmailReputationResponseEntityDetails) SetAcceptAll(v bool)`

SetAcceptAll sets AcceptAll field to given value.

### HasAcceptAll

`func (o *FraudGetEmailReputationResponseEntityDetails) HasAcceptAll() bool`

HasAcceptAll returns a boolean if a field has been set.

### GetValidMx

`func (o *FraudGetEmailReputationResponseEntityDetails) GetValidMx() bool`

GetValidMx returns the ValidMx field if non-nil, zero value otherwise.

### GetValidMxOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetValidMxOk() (*bool, bool)`

GetValidMxOk returns a tuple with the ValidMx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidMx

`func (o *FraudGetEmailReputationResponseEntityDetails) SetValidMx(v bool)`

SetValidMx sets ValidMx field to given value.

### HasValidMx

`func (o *FraudGetEmailReputationResponseEntityDetails) HasValidMx() bool`

HasValidMx returns a boolean if a field has been set.

### GetPrimaryMx

`func (o *FraudGetEmailReputationResponseEntityDetails) GetPrimaryMx() string`

GetPrimaryMx returns the PrimaryMx field if non-nil, zero value otherwise.

### GetPrimaryMxOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetPrimaryMxOk() (*string, bool)`

GetPrimaryMxOk returns a tuple with the PrimaryMx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrimaryMx

`func (o *FraudGetEmailReputationResponseEntityDetails) SetPrimaryMx(v string)`

SetPrimaryMx sets PrimaryMx field to given value.

### HasPrimaryMx

`func (o *FraudGetEmailReputationResponseEntityDetails) HasPrimaryMx() bool`

HasPrimaryMx returns a boolean if a field has been set.

### GetSpoofable

`func (o *FraudGetEmailReputationResponseEntityDetails) GetSpoofable() bool`

GetSpoofable returns the Spoofable field if non-nil, zero value otherwise.

### GetSpoofableOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetSpoofableOk() (*bool, bool)`

GetSpoofableOk returns a tuple with the Spoofable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpoofable

`func (o *FraudGetEmailReputationResponseEntityDetails) SetSpoofable(v bool)`

SetSpoofable sets Spoofable field to given value.

### HasSpoofable

`func (o *FraudGetEmailReputationResponseEntityDetails) HasSpoofable() bool`

HasSpoofable returns a boolean if a field has been set.

### GetSpfStrict

`func (o *FraudGetEmailReputationResponseEntityDetails) GetSpfStrict() bool`

GetSpfStrict returns the SpfStrict field if non-nil, zero value otherwise.

### GetSpfStrictOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetSpfStrictOk() (*bool, bool)`

GetSpfStrictOk returns a tuple with the SpfStrict field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpfStrict

`func (o *FraudGetEmailReputationResponseEntityDetails) SetSpfStrict(v bool)`

SetSpfStrict sets SpfStrict field to given value.

### HasSpfStrict

`func (o *FraudGetEmailReputationResponseEntityDetails) HasSpfStrict() bool`

HasSpfStrict returns a boolean if a field has been set.

### GetDmarcEnforced

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDmarcEnforced() bool`

GetDmarcEnforced returns the DmarcEnforced field if non-nil, zero value otherwise.

### GetDmarcEnforcedOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetDmarcEnforcedOk() (*bool, bool)`

GetDmarcEnforcedOk returns a tuple with the DmarcEnforced field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDmarcEnforced

`func (o *FraudGetEmailReputationResponseEntityDetails) SetDmarcEnforced(v bool)`

SetDmarcEnforced sets DmarcEnforced field to given value.

### HasDmarcEnforced

`func (o *FraudGetEmailReputationResponseEntityDetails) HasDmarcEnforced() bool`

HasDmarcEnforced returns a boolean if a field has been set.

### GetProfiles

`func (o *FraudGetEmailReputationResponseEntityDetails) GetProfiles() []string`

GetProfiles returns the Profiles field if non-nil, zero value otherwise.

### GetProfilesOk

`func (o *FraudGetEmailReputationResponseEntityDetails) GetProfilesOk() (*[]string, bool)`

GetProfilesOk returns a tuple with the Profiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfiles

`func (o *FraudGetEmailReputationResponseEntityDetails) SetProfiles(v []string)`

SetProfiles sets Profiles field to given value.

### HasProfiles

`func (o *FraudGetEmailReputationResponseEntityDetails) HasProfiles() bool`

HasProfiles returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


