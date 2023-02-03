# GetEmailReputationResponseEntityDetails

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

### NewGetEmailReputationResponseEntityDetails

`func NewGetEmailReputationResponseEntityDetails() *GetEmailReputationResponseEntityDetails`

NewGetEmailReputationResponseEntityDetails instantiates a new GetEmailReputationResponseEntityDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetEmailReputationResponseEntityDetailsWithDefaults

`func NewGetEmailReputationResponseEntityDetailsWithDefaults() *GetEmailReputationResponseEntityDetails`

NewGetEmailReputationResponseEntityDetailsWithDefaults instantiates a new GetEmailReputationResponseEntityDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlacklisted

`func (o *GetEmailReputationResponseEntityDetails) GetBlacklisted() bool`

GetBlacklisted returns the Blacklisted field if non-nil, zero value otherwise.

### GetBlacklistedOk

`func (o *GetEmailReputationResponseEntityDetails) GetBlacklistedOk() (*bool, bool)`

GetBlacklistedOk returns a tuple with the Blacklisted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlacklisted

`func (o *GetEmailReputationResponseEntityDetails) SetBlacklisted(v bool)`

SetBlacklisted sets Blacklisted field to given value.

### HasBlacklisted

`func (o *GetEmailReputationResponseEntityDetails) HasBlacklisted() bool`

HasBlacklisted returns a boolean if a field has been set.

### GetMaliciousActivity

`func (o *GetEmailReputationResponseEntityDetails) GetMaliciousActivity() bool`

GetMaliciousActivity returns the MaliciousActivity field if non-nil, zero value otherwise.

### GetMaliciousActivityOk

`func (o *GetEmailReputationResponseEntityDetails) GetMaliciousActivityOk() (*bool, bool)`

GetMaliciousActivityOk returns a tuple with the MaliciousActivity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaliciousActivity

`func (o *GetEmailReputationResponseEntityDetails) SetMaliciousActivity(v bool)`

SetMaliciousActivity sets MaliciousActivity field to given value.

### HasMaliciousActivity

`func (o *GetEmailReputationResponseEntityDetails) HasMaliciousActivity() bool`

HasMaliciousActivity returns a boolean if a field has been set.

### GetMaliciousActivityRecent

`func (o *GetEmailReputationResponseEntityDetails) GetMaliciousActivityRecent() bool`

GetMaliciousActivityRecent returns the MaliciousActivityRecent field if non-nil, zero value otherwise.

### GetMaliciousActivityRecentOk

`func (o *GetEmailReputationResponseEntityDetails) GetMaliciousActivityRecentOk() (*bool, bool)`

GetMaliciousActivityRecentOk returns a tuple with the MaliciousActivityRecent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaliciousActivityRecent

`func (o *GetEmailReputationResponseEntityDetails) SetMaliciousActivityRecent(v bool)`

SetMaliciousActivityRecent sets MaliciousActivityRecent field to given value.

### HasMaliciousActivityRecent

`func (o *GetEmailReputationResponseEntityDetails) HasMaliciousActivityRecent() bool`

HasMaliciousActivityRecent returns a boolean if a field has been set.

### GetCredentialsLeaked

`func (o *GetEmailReputationResponseEntityDetails) GetCredentialsLeaked() bool`

GetCredentialsLeaked returns the CredentialsLeaked field if non-nil, zero value otherwise.

### GetCredentialsLeakedOk

`func (o *GetEmailReputationResponseEntityDetails) GetCredentialsLeakedOk() (*bool, bool)`

GetCredentialsLeakedOk returns a tuple with the CredentialsLeaked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentialsLeaked

`func (o *GetEmailReputationResponseEntityDetails) SetCredentialsLeaked(v bool)`

SetCredentialsLeaked sets CredentialsLeaked field to given value.

### HasCredentialsLeaked

`func (o *GetEmailReputationResponseEntityDetails) HasCredentialsLeaked() bool`

HasCredentialsLeaked returns a boolean if a field has been set.

### GetCredentialsLeakedRecent

`func (o *GetEmailReputationResponseEntityDetails) GetCredentialsLeakedRecent() bool`

GetCredentialsLeakedRecent returns the CredentialsLeakedRecent field if non-nil, zero value otherwise.

### GetCredentialsLeakedRecentOk

`func (o *GetEmailReputationResponseEntityDetails) GetCredentialsLeakedRecentOk() (*bool, bool)`

GetCredentialsLeakedRecentOk returns a tuple with the CredentialsLeakedRecent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentialsLeakedRecent

`func (o *GetEmailReputationResponseEntityDetails) SetCredentialsLeakedRecent(v bool)`

SetCredentialsLeakedRecent sets CredentialsLeakedRecent field to given value.

### HasCredentialsLeakedRecent

`func (o *GetEmailReputationResponseEntityDetails) HasCredentialsLeakedRecent() bool`

HasCredentialsLeakedRecent returns a boolean if a field has been set.

### GetDataBreach

`func (o *GetEmailReputationResponseEntityDetails) GetDataBreach() bool`

GetDataBreach returns the DataBreach field if non-nil, zero value otherwise.

### GetDataBreachOk

`func (o *GetEmailReputationResponseEntityDetails) GetDataBreachOk() (*bool, bool)`

GetDataBreachOk returns a tuple with the DataBreach field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataBreach

`func (o *GetEmailReputationResponseEntityDetails) SetDataBreach(v bool)`

SetDataBreach sets DataBreach field to given value.

### HasDataBreach

`func (o *GetEmailReputationResponseEntityDetails) HasDataBreach() bool`

HasDataBreach returns a boolean if a field has been set.

### GetFirstSeen

`func (o *GetEmailReputationResponseEntityDetails) GetFirstSeen() string`

GetFirstSeen returns the FirstSeen field if non-nil, zero value otherwise.

### GetFirstSeenOk

`func (o *GetEmailReputationResponseEntityDetails) GetFirstSeenOk() (*string, bool)`

GetFirstSeenOk returns a tuple with the FirstSeen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstSeen

`func (o *GetEmailReputationResponseEntityDetails) SetFirstSeen(v string)`

SetFirstSeen sets FirstSeen field to given value.

### HasFirstSeen

`func (o *GetEmailReputationResponseEntityDetails) HasFirstSeen() bool`

HasFirstSeen returns a boolean if a field has been set.

### GetLastSeen

`func (o *GetEmailReputationResponseEntityDetails) GetLastSeen() string`

GetLastSeen returns the LastSeen field if non-nil, zero value otherwise.

### GetLastSeenOk

`func (o *GetEmailReputationResponseEntityDetails) GetLastSeenOk() (*string, bool)`

GetLastSeenOk returns a tuple with the LastSeen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastSeen

`func (o *GetEmailReputationResponseEntityDetails) SetLastSeen(v string)`

SetLastSeen sets LastSeen field to given value.

### HasLastSeen

`func (o *GetEmailReputationResponseEntityDetails) HasLastSeen() bool`

HasLastSeen returns a boolean if a field has been set.

### GetDomainExists

`func (o *GetEmailReputationResponseEntityDetails) GetDomainExists() bool`

GetDomainExists returns the DomainExists field if non-nil, zero value otherwise.

### GetDomainExistsOk

`func (o *GetEmailReputationResponseEntityDetails) GetDomainExistsOk() (*bool, bool)`

GetDomainExistsOk returns a tuple with the DomainExists field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomainExists

`func (o *GetEmailReputationResponseEntityDetails) SetDomainExists(v bool)`

SetDomainExists sets DomainExists field to given value.

### HasDomainExists

`func (o *GetEmailReputationResponseEntityDetails) HasDomainExists() bool`

HasDomainExists returns a boolean if a field has been set.

### GetDomainReputation

`func (o *GetEmailReputationResponseEntityDetails) GetDomainReputation() string`

GetDomainReputation returns the DomainReputation field if non-nil, zero value otherwise.

### GetDomainReputationOk

`func (o *GetEmailReputationResponseEntityDetails) GetDomainReputationOk() (*string, bool)`

GetDomainReputationOk returns a tuple with the DomainReputation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomainReputation

`func (o *GetEmailReputationResponseEntityDetails) SetDomainReputation(v string)`

SetDomainReputation sets DomainReputation field to given value.

### HasDomainReputation

`func (o *GetEmailReputationResponseEntityDetails) HasDomainReputation() bool`

HasDomainReputation returns a boolean if a field has been set.

### GetNewDomain

`func (o *GetEmailReputationResponseEntityDetails) GetNewDomain() bool`

GetNewDomain returns the NewDomain field if non-nil, zero value otherwise.

### GetNewDomainOk

`func (o *GetEmailReputationResponseEntityDetails) GetNewDomainOk() (*bool, bool)`

GetNewDomainOk returns a tuple with the NewDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewDomain

`func (o *GetEmailReputationResponseEntityDetails) SetNewDomain(v bool)`

SetNewDomain sets NewDomain field to given value.

### HasNewDomain

`func (o *GetEmailReputationResponseEntityDetails) HasNewDomain() bool`

HasNewDomain returns a boolean if a field has been set.

### GetDaysSinceDomainCreation

`func (o *GetEmailReputationResponseEntityDetails) GetDaysSinceDomainCreation() float32`

GetDaysSinceDomainCreation returns the DaysSinceDomainCreation field if non-nil, zero value otherwise.

### GetDaysSinceDomainCreationOk

`func (o *GetEmailReputationResponseEntityDetails) GetDaysSinceDomainCreationOk() (*float32, bool)`

GetDaysSinceDomainCreationOk returns a tuple with the DaysSinceDomainCreation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaysSinceDomainCreation

`func (o *GetEmailReputationResponseEntityDetails) SetDaysSinceDomainCreation(v float32)`

SetDaysSinceDomainCreation sets DaysSinceDomainCreation field to given value.

### HasDaysSinceDomainCreation

`func (o *GetEmailReputationResponseEntityDetails) HasDaysSinceDomainCreation() bool`

HasDaysSinceDomainCreation returns a boolean if a field has been set.

### GetSuspiciousTld

`func (o *GetEmailReputationResponseEntityDetails) GetSuspiciousTld() bool`

GetSuspiciousTld returns the SuspiciousTld field if non-nil, zero value otherwise.

### GetSuspiciousTldOk

`func (o *GetEmailReputationResponseEntityDetails) GetSuspiciousTldOk() (*bool, bool)`

GetSuspiciousTldOk returns a tuple with the SuspiciousTld field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspiciousTld

`func (o *GetEmailReputationResponseEntityDetails) SetSuspiciousTld(v bool)`

SetSuspiciousTld sets SuspiciousTld field to given value.

### HasSuspiciousTld

`func (o *GetEmailReputationResponseEntityDetails) HasSuspiciousTld() bool`

HasSuspiciousTld returns a boolean if a field has been set.

### GetSpam

`func (o *GetEmailReputationResponseEntityDetails) GetSpam() bool`

GetSpam returns the Spam field if non-nil, zero value otherwise.

### GetSpamOk

`func (o *GetEmailReputationResponseEntityDetails) GetSpamOk() (*bool, bool)`

GetSpamOk returns a tuple with the Spam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpam

`func (o *GetEmailReputationResponseEntityDetails) SetSpam(v bool)`

SetSpam sets Spam field to given value.

### HasSpam

`func (o *GetEmailReputationResponseEntityDetails) HasSpam() bool`

HasSpam returns a boolean if a field has been set.

### GetFreeProvider

`func (o *GetEmailReputationResponseEntityDetails) GetFreeProvider() bool`

GetFreeProvider returns the FreeProvider field if non-nil, zero value otherwise.

### GetFreeProviderOk

`func (o *GetEmailReputationResponseEntityDetails) GetFreeProviderOk() (*bool, bool)`

GetFreeProviderOk returns a tuple with the FreeProvider field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreeProvider

`func (o *GetEmailReputationResponseEntityDetails) SetFreeProvider(v bool)`

SetFreeProvider sets FreeProvider field to given value.

### HasFreeProvider

`func (o *GetEmailReputationResponseEntityDetails) HasFreeProvider() bool`

HasFreeProvider returns a boolean if a field has been set.

### GetDisposable

`func (o *GetEmailReputationResponseEntityDetails) GetDisposable() bool`

GetDisposable returns the Disposable field if non-nil, zero value otherwise.

### GetDisposableOk

`func (o *GetEmailReputationResponseEntityDetails) GetDisposableOk() (*bool, bool)`

GetDisposableOk returns a tuple with the Disposable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisposable

`func (o *GetEmailReputationResponseEntityDetails) SetDisposable(v bool)`

SetDisposable sets Disposable field to given value.

### HasDisposable

`func (o *GetEmailReputationResponseEntityDetails) HasDisposable() bool`

HasDisposable returns a boolean if a field has been set.

### GetDeliverable

`func (o *GetEmailReputationResponseEntityDetails) GetDeliverable() bool`

GetDeliverable returns the Deliverable field if non-nil, zero value otherwise.

### GetDeliverableOk

`func (o *GetEmailReputationResponseEntityDetails) GetDeliverableOk() (*bool, bool)`

GetDeliverableOk returns a tuple with the Deliverable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliverable

`func (o *GetEmailReputationResponseEntityDetails) SetDeliverable(v bool)`

SetDeliverable sets Deliverable field to given value.

### HasDeliverable

`func (o *GetEmailReputationResponseEntityDetails) HasDeliverable() bool`

HasDeliverable returns a boolean if a field has been set.

### GetAcceptAll

`func (o *GetEmailReputationResponseEntityDetails) GetAcceptAll() bool`

GetAcceptAll returns the AcceptAll field if non-nil, zero value otherwise.

### GetAcceptAllOk

`func (o *GetEmailReputationResponseEntityDetails) GetAcceptAllOk() (*bool, bool)`

GetAcceptAllOk returns a tuple with the AcceptAll field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptAll

`func (o *GetEmailReputationResponseEntityDetails) SetAcceptAll(v bool)`

SetAcceptAll sets AcceptAll field to given value.

### HasAcceptAll

`func (o *GetEmailReputationResponseEntityDetails) HasAcceptAll() bool`

HasAcceptAll returns a boolean if a field has been set.

### GetValidMx

`func (o *GetEmailReputationResponseEntityDetails) GetValidMx() bool`

GetValidMx returns the ValidMx field if non-nil, zero value otherwise.

### GetValidMxOk

`func (o *GetEmailReputationResponseEntityDetails) GetValidMxOk() (*bool, bool)`

GetValidMxOk returns a tuple with the ValidMx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidMx

`func (o *GetEmailReputationResponseEntityDetails) SetValidMx(v bool)`

SetValidMx sets ValidMx field to given value.

### HasValidMx

`func (o *GetEmailReputationResponseEntityDetails) HasValidMx() bool`

HasValidMx returns a boolean if a field has been set.

### GetPrimaryMx

`func (o *GetEmailReputationResponseEntityDetails) GetPrimaryMx() string`

GetPrimaryMx returns the PrimaryMx field if non-nil, zero value otherwise.

### GetPrimaryMxOk

`func (o *GetEmailReputationResponseEntityDetails) GetPrimaryMxOk() (*string, bool)`

GetPrimaryMxOk returns a tuple with the PrimaryMx field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrimaryMx

`func (o *GetEmailReputationResponseEntityDetails) SetPrimaryMx(v string)`

SetPrimaryMx sets PrimaryMx field to given value.

### HasPrimaryMx

`func (o *GetEmailReputationResponseEntityDetails) HasPrimaryMx() bool`

HasPrimaryMx returns a boolean if a field has been set.

### GetSpoofable

`func (o *GetEmailReputationResponseEntityDetails) GetSpoofable() bool`

GetSpoofable returns the Spoofable field if non-nil, zero value otherwise.

### GetSpoofableOk

`func (o *GetEmailReputationResponseEntityDetails) GetSpoofableOk() (*bool, bool)`

GetSpoofableOk returns a tuple with the Spoofable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpoofable

`func (o *GetEmailReputationResponseEntityDetails) SetSpoofable(v bool)`

SetSpoofable sets Spoofable field to given value.

### HasSpoofable

`func (o *GetEmailReputationResponseEntityDetails) HasSpoofable() bool`

HasSpoofable returns a boolean if a field has been set.

### GetSpfStrict

`func (o *GetEmailReputationResponseEntityDetails) GetSpfStrict() bool`

GetSpfStrict returns the SpfStrict field if non-nil, zero value otherwise.

### GetSpfStrictOk

`func (o *GetEmailReputationResponseEntityDetails) GetSpfStrictOk() (*bool, bool)`

GetSpfStrictOk returns a tuple with the SpfStrict field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpfStrict

`func (o *GetEmailReputationResponseEntityDetails) SetSpfStrict(v bool)`

SetSpfStrict sets SpfStrict field to given value.

### HasSpfStrict

`func (o *GetEmailReputationResponseEntityDetails) HasSpfStrict() bool`

HasSpfStrict returns a boolean if a field has been set.

### GetDmarcEnforced

`func (o *GetEmailReputationResponseEntityDetails) GetDmarcEnforced() bool`

GetDmarcEnforced returns the DmarcEnforced field if non-nil, zero value otherwise.

### GetDmarcEnforcedOk

`func (o *GetEmailReputationResponseEntityDetails) GetDmarcEnforcedOk() (*bool, bool)`

GetDmarcEnforcedOk returns a tuple with the DmarcEnforced field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDmarcEnforced

`func (o *GetEmailReputationResponseEntityDetails) SetDmarcEnforced(v bool)`

SetDmarcEnforced sets DmarcEnforced field to given value.

### HasDmarcEnforced

`func (o *GetEmailReputationResponseEntityDetails) HasDmarcEnforced() bool`

HasDmarcEnforced returns a boolean if a field has been set.

### GetProfiles

`func (o *GetEmailReputationResponseEntityDetails) GetProfiles() []string`

GetProfiles returns the Profiles field if non-nil, zero value otherwise.

### GetProfilesOk

`func (o *GetEmailReputationResponseEntityDetails) GetProfilesOk() (*[]string, bool)`

GetProfilesOk returns a tuple with the Profiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfiles

`func (o *GetEmailReputationResponseEntityDetails) SetProfiles(v []string)`

SetProfiles sets Profiles field to given value.

### HasProfiles

`func (o *GetEmailReputationResponseEntityDetails) HasProfiles() bool`

HasProfiles returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


