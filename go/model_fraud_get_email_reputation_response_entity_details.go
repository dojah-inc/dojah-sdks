/*
DOJAH Publilc APIs

Use Dojah to verify, onboard and manage user identity across Africa!

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package dojah

import (
	"encoding/json"
)

// FraudGetEmailReputationResponseEntityDetails struct for FraudGetEmailReputationResponseEntityDetails
type FraudGetEmailReputationResponseEntityDetails struct {
	Blacklisted *bool `json:"blacklisted,omitempty"`
	MaliciousActivity *bool `json:"malicious_activity,omitempty"`
	MaliciousActivityRecent *bool `json:"malicious_activity_recent,omitempty"`
	CredentialsLeaked *bool `json:"credentials_leaked,omitempty"`
	CredentialsLeakedRecent *bool `json:"credentials_leaked_recent,omitempty"`
	DataBreach *bool `json:"data_breach,omitempty"`
	FirstSeen *string `json:"first_seen,omitempty"`
	LastSeen *string `json:"last_seen,omitempty"`
	DomainExists *bool `json:"domain_exists,omitempty"`
	DomainReputation *string `json:"domain_reputation,omitempty"`
	NewDomain *bool `json:"new_domain,omitempty"`
	DaysSinceDomainCreation *float32 `json:"days_since_domain_creation,omitempty"`
	SuspiciousTld *bool `json:"suspicious_tld,omitempty"`
	Spam *bool `json:"spam,omitempty"`
	FreeProvider *bool `json:"free_provider,omitempty"`
	Disposable *bool `json:"disposable,omitempty"`
	Deliverable *bool `json:"deliverable,omitempty"`
	AcceptAll *bool `json:"accept_all,omitempty"`
	ValidMx *bool `json:"valid_mx,omitempty"`
	PrimaryMx *string `json:"primary_mx,omitempty"`
	Spoofable *bool `json:"spoofable,omitempty"`
	SpfStrict *bool `json:"spf_strict,omitempty"`
	DmarcEnforced *bool `json:"dmarc_enforced,omitempty"`
	Profiles []string `json:"profiles,omitempty"`
}

// NewFraudGetEmailReputationResponseEntityDetails instantiates a new FraudGetEmailReputationResponseEntityDetails object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFraudGetEmailReputationResponseEntityDetails() *FraudGetEmailReputationResponseEntityDetails {
	this := FraudGetEmailReputationResponseEntityDetails{}
	return &this
}

// NewFraudGetEmailReputationResponseEntityDetailsWithDefaults instantiates a new FraudGetEmailReputationResponseEntityDetails object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFraudGetEmailReputationResponseEntityDetailsWithDefaults() *FraudGetEmailReputationResponseEntityDetails {
	this := FraudGetEmailReputationResponseEntityDetails{}
	return &this
}

// GetBlacklisted returns the Blacklisted field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetBlacklisted() bool {
	if o == nil || isNil(o.Blacklisted) {
		var ret bool
		return ret
	}
	return *o.Blacklisted
}

// GetBlacklistedOk returns a tuple with the Blacklisted field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetBlacklistedOk() (*bool, bool) {
	if o == nil || isNil(o.Blacklisted) {
    return nil, false
	}
	return o.Blacklisted, true
}

// HasBlacklisted returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasBlacklisted() bool {
	if o != nil && !isNil(o.Blacklisted) {
		return true
	}

	return false
}

// SetBlacklisted gets a reference to the given bool and assigns it to the Blacklisted field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetBlacklisted(v bool) {
	o.Blacklisted = &v
}

// GetMaliciousActivity returns the MaliciousActivity field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetMaliciousActivity() bool {
	if o == nil || isNil(o.MaliciousActivity) {
		var ret bool
		return ret
	}
	return *o.MaliciousActivity
}

// GetMaliciousActivityOk returns a tuple with the MaliciousActivity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetMaliciousActivityOk() (*bool, bool) {
	if o == nil || isNil(o.MaliciousActivity) {
    return nil, false
	}
	return o.MaliciousActivity, true
}

// HasMaliciousActivity returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasMaliciousActivity() bool {
	if o != nil && !isNil(o.MaliciousActivity) {
		return true
	}

	return false
}

// SetMaliciousActivity gets a reference to the given bool and assigns it to the MaliciousActivity field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetMaliciousActivity(v bool) {
	o.MaliciousActivity = &v
}

// GetMaliciousActivityRecent returns the MaliciousActivityRecent field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetMaliciousActivityRecent() bool {
	if o == nil || isNil(o.MaliciousActivityRecent) {
		var ret bool
		return ret
	}
	return *o.MaliciousActivityRecent
}

// GetMaliciousActivityRecentOk returns a tuple with the MaliciousActivityRecent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetMaliciousActivityRecentOk() (*bool, bool) {
	if o == nil || isNil(o.MaliciousActivityRecent) {
    return nil, false
	}
	return o.MaliciousActivityRecent, true
}

// HasMaliciousActivityRecent returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasMaliciousActivityRecent() bool {
	if o != nil && !isNil(o.MaliciousActivityRecent) {
		return true
	}

	return false
}

// SetMaliciousActivityRecent gets a reference to the given bool and assigns it to the MaliciousActivityRecent field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetMaliciousActivityRecent(v bool) {
	o.MaliciousActivityRecent = &v
}

// GetCredentialsLeaked returns the CredentialsLeaked field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetCredentialsLeaked() bool {
	if o == nil || isNil(o.CredentialsLeaked) {
		var ret bool
		return ret
	}
	return *o.CredentialsLeaked
}

// GetCredentialsLeakedOk returns a tuple with the CredentialsLeaked field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetCredentialsLeakedOk() (*bool, bool) {
	if o == nil || isNil(o.CredentialsLeaked) {
    return nil, false
	}
	return o.CredentialsLeaked, true
}

// HasCredentialsLeaked returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasCredentialsLeaked() bool {
	if o != nil && !isNil(o.CredentialsLeaked) {
		return true
	}

	return false
}

// SetCredentialsLeaked gets a reference to the given bool and assigns it to the CredentialsLeaked field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetCredentialsLeaked(v bool) {
	o.CredentialsLeaked = &v
}

// GetCredentialsLeakedRecent returns the CredentialsLeakedRecent field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetCredentialsLeakedRecent() bool {
	if o == nil || isNil(o.CredentialsLeakedRecent) {
		var ret bool
		return ret
	}
	return *o.CredentialsLeakedRecent
}

// GetCredentialsLeakedRecentOk returns a tuple with the CredentialsLeakedRecent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetCredentialsLeakedRecentOk() (*bool, bool) {
	if o == nil || isNil(o.CredentialsLeakedRecent) {
    return nil, false
	}
	return o.CredentialsLeakedRecent, true
}

// HasCredentialsLeakedRecent returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasCredentialsLeakedRecent() bool {
	if o != nil && !isNil(o.CredentialsLeakedRecent) {
		return true
	}

	return false
}

// SetCredentialsLeakedRecent gets a reference to the given bool and assigns it to the CredentialsLeakedRecent field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetCredentialsLeakedRecent(v bool) {
	o.CredentialsLeakedRecent = &v
}

// GetDataBreach returns the DataBreach field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDataBreach() bool {
	if o == nil || isNil(o.DataBreach) {
		var ret bool
		return ret
	}
	return *o.DataBreach
}

// GetDataBreachOk returns a tuple with the DataBreach field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDataBreachOk() (*bool, bool) {
	if o == nil || isNil(o.DataBreach) {
    return nil, false
	}
	return o.DataBreach, true
}

// HasDataBreach returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasDataBreach() bool {
	if o != nil && !isNil(o.DataBreach) {
		return true
	}

	return false
}

// SetDataBreach gets a reference to the given bool and assigns it to the DataBreach field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetDataBreach(v bool) {
	o.DataBreach = &v
}

// GetFirstSeen returns the FirstSeen field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetFirstSeen() string {
	if o == nil || isNil(o.FirstSeen) {
		var ret string
		return ret
	}
	return *o.FirstSeen
}

// GetFirstSeenOk returns a tuple with the FirstSeen field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetFirstSeenOk() (*string, bool) {
	if o == nil || isNil(o.FirstSeen) {
    return nil, false
	}
	return o.FirstSeen, true
}

// HasFirstSeen returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasFirstSeen() bool {
	if o != nil && !isNil(o.FirstSeen) {
		return true
	}

	return false
}

// SetFirstSeen gets a reference to the given string and assigns it to the FirstSeen field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetFirstSeen(v string) {
	o.FirstSeen = &v
}

// GetLastSeen returns the LastSeen field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetLastSeen() string {
	if o == nil || isNil(o.LastSeen) {
		var ret string
		return ret
	}
	return *o.LastSeen
}

// GetLastSeenOk returns a tuple with the LastSeen field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetLastSeenOk() (*string, bool) {
	if o == nil || isNil(o.LastSeen) {
    return nil, false
	}
	return o.LastSeen, true
}

// HasLastSeen returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasLastSeen() bool {
	if o != nil && !isNil(o.LastSeen) {
		return true
	}

	return false
}

// SetLastSeen gets a reference to the given string and assigns it to the LastSeen field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetLastSeen(v string) {
	o.LastSeen = &v
}

// GetDomainExists returns the DomainExists field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDomainExists() bool {
	if o == nil || isNil(o.DomainExists) {
		var ret bool
		return ret
	}
	return *o.DomainExists
}

// GetDomainExistsOk returns a tuple with the DomainExists field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDomainExistsOk() (*bool, bool) {
	if o == nil || isNil(o.DomainExists) {
    return nil, false
	}
	return o.DomainExists, true
}

// HasDomainExists returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasDomainExists() bool {
	if o != nil && !isNil(o.DomainExists) {
		return true
	}

	return false
}

// SetDomainExists gets a reference to the given bool and assigns it to the DomainExists field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetDomainExists(v bool) {
	o.DomainExists = &v
}

// GetDomainReputation returns the DomainReputation field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDomainReputation() string {
	if o == nil || isNil(o.DomainReputation) {
		var ret string
		return ret
	}
	return *o.DomainReputation
}

// GetDomainReputationOk returns a tuple with the DomainReputation field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDomainReputationOk() (*string, bool) {
	if o == nil || isNil(o.DomainReputation) {
    return nil, false
	}
	return o.DomainReputation, true
}

// HasDomainReputation returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasDomainReputation() bool {
	if o != nil && !isNil(o.DomainReputation) {
		return true
	}

	return false
}

// SetDomainReputation gets a reference to the given string and assigns it to the DomainReputation field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetDomainReputation(v string) {
	o.DomainReputation = &v
}

// GetNewDomain returns the NewDomain field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetNewDomain() bool {
	if o == nil || isNil(o.NewDomain) {
		var ret bool
		return ret
	}
	return *o.NewDomain
}

// GetNewDomainOk returns a tuple with the NewDomain field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetNewDomainOk() (*bool, bool) {
	if o == nil || isNil(o.NewDomain) {
    return nil, false
	}
	return o.NewDomain, true
}

// HasNewDomain returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasNewDomain() bool {
	if o != nil && !isNil(o.NewDomain) {
		return true
	}

	return false
}

// SetNewDomain gets a reference to the given bool and assigns it to the NewDomain field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetNewDomain(v bool) {
	o.NewDomain = &v
}

// GetDaysSinceDomainCreation returns the DaysSinceDomainCreation field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDaysSinceDomainCreation() float32 {
	if o == nil || isNil(o.DaysSinceDomainCreation) {
		var ret float32
		return ret
	}
	return *o.DaysSinceDomainCreation
}

// GetDaysSinceDomainCreationOk returns a tuple with the DaysSinceDomainCreation field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDaysSinceDomainCreationOk() (*float32, bool) {
	if o == nil || isNil(o.DaysSinceDomainCreation) {
    return nil, false
	}
	return o.DaysSinceDomainCreation, true
}

// HasDaysSinceDomainCreation returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasDaysSinceDomainCreation() bool {
	if o != nil && !isNil(o.DaysSinceDomainCreation) {
		return true
	}

	return false
}

// SetDaysSinceDomainCreation gets a reference to the given float32 and assigns it to the DaysSinceDomainCreation field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetDaysSinceDomainCreation(v float32) {
	o.DaysSinceDomainCreation = &v
}

// GetSuspiciousTld returns the SuspiciousTld field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetSuspiciousTld() bool {
	if o == nil || isNil(o.SuspiciousTld) {
		var ret bool
		return ret
	}
	return *o.SuspiciousTld
}

// GetSuspiciousTldOk returns a tuple with the SuspiciousTld field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetSuspiciousTldOk() (*bool, bool) {
	if o == nil || isNil(o.SuspiciousTld) {
    return nil, false
	}
	return o.SuspiciousTld, true
}

// HasSuspiciousTld returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasSuspiciousTld() bool {
	if o != nil && !isNil(o.SuspiciousTld) {
		return true
	}

	return false
}

// SetSuspiciousTld gets a reference to the given bool and assigns it to the SuspiciousTld field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetSuspiciousTld(v bool) {
	o.SuspiciousTld = &v
}

// GetSpam returns the Spam field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetSpam() bool {
	if o == nil || isNil(o.Spam) {
		var ret bool
		return ret
	}
	return *o.Spam
}

// GetSpamOk returns a tuple with the Spam field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetSpamOk() (*bool, bool) {
	if o == nil || isNil(o.Spam) {
    return nil, false
	}
	return o.Spam, true
}

// HasSpam returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasSpam() bool {
	if o != nil && !isNil(o.Spam) {
		return true
	}

	return false
}

// SetSpam gets a reference to the given bool and assigns it to the Spam field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetSpam(v bool) {
	o.Spam = &v
}

// GetFreeProvider returns the FreeProvider field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetFreeProvider() bool {
	if o == nil || isNil(o.FreeProvider) {
		var ret bool
		return ret
	}
	return *o.FreeProvider
}

// GetFreeProviderOk returns a tuple with the FreeProvider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetFreeProviderOk() (*bool, bool) {
	if o == nil || isNil(o.FreeProvider) {
    return nil, false
	}
	return o.FreeProvider, true
}

// HasFreeProvider returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasFreeProvider() bool {
	if o != nil && !isNil(o.FreeProvider) {
		return true
	}

	return false
}

// SetFreeProvider gets a reference to the given bool and assigns it to the FreeProvider field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetFreeProvider(v bool) {
	o.FreeProvider = &v
}

// GetDisposable returns the Disposable field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDisposable() bool {
	if o == nil || isNil(o.Disposable) {
		var ret bool
		return ret
	}
	return *o.Disposable
}

// GetDisposableOk returns a tuple with the Disposable field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDisposableOk() (*bool, bool) {
	if o == nil || isNil(o.Disposable) {
    return nil, false
	}
	return o.Disposable, true
}

// HasDisposable returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasDisposable() bool {
	if o != nil && !isNil(o.Disposable) {
		return true
	}

	return false
}

// SetDisposable gets a reference to the given bool and assigns it to the Disposable field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetDisposable(v bool) {
	o.Disposable = &v
}

// GetDeliverable returns the Deliverable field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDeliverable() bool {
	if o == nil || isNil(o.Deliverable) {
		var ret bool
		return ret
	}
	return *o.Deliverable
}

// GetDeliverableOk returns a tuple with the Deliverable field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDeliverableOk() (*bool, bool) {
	if o == nil || isNil(o.Deliverable) {
    return nil, false
	}
	return o.Deliverable, true
}

// HasDeliverable returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasDeliverable() bool {
	if o != nil && !isNil(o.Deliverable) {
		return true
	}

	return false
}

// SetDeliverable gets a reference to the given bool and assigns it to the Deliverable field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetDeliverable(v bool) {
	o.Deliverable = &v
}

// GetAcceptAll returns the AcceptAll field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetAcceptAll() bool {
	if o == nil || isNil(o.AcceptAll) {
		var ret bool
		return ret
	}
	return *o.AcceptAll
}

// GetAcceptAllOk returns a tuple with the AcceptAll field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetAcceptAllOk() (*bool, bool) {
	if o == nil || isNil(o.AcceptAll) {
    return nil, false
	}
	return o.AcceptAll, true
}

// HasAcceptAll returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasAcceptAll() bool {
	if o != nil && !isNil(o.AcceptAll) {
		return true
	}

	return false
}

// SetAcceptAll gets a reference to the given bool and assigns it to the AcceptAll field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetAcceptAll(v bool) {
	o.AcceptAll = &v
}

// GetValidMx returns the ValidMx field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetValidMx() bool {
	if o == nil || isNil(o.ValidMx) {
		var ret bool
		return ret
	}
	return *o.ValidMx
}

// GetValidMxOk returns a tuple with the ValidMx field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetValidMxOk() (*bool, bool) {
	if o == nil || isNil(o.ValidMx) {
    return nil, false
	}
	return o.ValidMx, true
}

// HasValidMx returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasValidMx() bool {
	if o != nil && !isNil(o.ValidMx) {
		return true
	}

	return false
}

// SetValidMx gets a reference to the given bool and assigns it to the ValidMx field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetValidMx(v bool) {
	o.ValidMx = &v
}

// GetPrimaryMx returns the PrimaryMx field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetPrimaryMx() string {
	if o == nil || isNil(o.PrimaryMx) {
		var ret string
		return ret
	}
	return *o.PrimaryMx
}

// GetPrimaryMxOk returns a tuple with the PrimaryMx field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetPrimaryMxOk() (*string, bool) {
	if o == nil || isNil(o.PrimaryMx) {
    return nil, false
	}
	return o.PrimaryMx, true
}

// HasPrimaryMx returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasPrimaryMx() bool {
	if o != nil && !isNil(o.PrimaryMx) {
		return true
	}

	return false
}

// SetPrimaryMx gets a reference to the given string and assigns it to the PrimaryMx field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetPrimaryMx(v string) {
	o.PrimaryMx = &v
}

// GetSpoofable returns the Spoofable field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetSpoofable() bool {
	if o == nil || isNil(o.Spoofable) {
		var ret bool
		return ret
	}
	return *o.Spoofable
}

// GetSpoofableOk returns a tuple with the Spoofable field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetSpoofableOk() (*bool, bool) {
	if o == nil || isNil(o.Spoofable) {
    return nil, false
	}
	return o.Spoofable, true
}

// HasSpoofable returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasSpoofable() bool {
	if o != nil && !isNil(o.Spoofable) {
		return true
	}

	return false
}

// SetSpoofable gets a reference to the given bool and assigns it to the Spoofable field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetSpoofable(v bool) {
	o.Spoofable = &v
}

// GetSpfStrict returns the SpfStrict field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetSpfStrict() bool {
	if o == nil || isNil(o.SpfStrict) {
		var ret bool
		return ret
	}
	return *o.SpfStrict
}

// GetSpfStrictOk returns a tuple with the SpfStrict field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetSpfStrictOk() (*bool, bool) {
	if o == nil || isNil(o.SpfStrict) {
    return nil, false
	}
	return o.SpfStrict, true
}

// HasSpfStrict returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasSpfStrict() bool {
	if o != nil && !isNil(o.SpfStrict) {
		return true
	}

	return false
}

// SetSpfStrict gets a reference to the given bool and assigns it to the SpfStrict field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetSpfStrict(v bool) {
	o.SpfStrict = &v
}

// GetDmarcEnforced returns the DmarcEnforced field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDmarcEnforced() bool {
	if o == nil || isNil(o.DmarcEnforced) {
		var ret bool
		return ret
	}
	return *o.DmarcEnforced
}

// GetDmarcEnforcedOk returns a tuple with the DmarcEnforced field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetDmarcEnforcedOk() (*bool, bool) {
	if o == nil || isNil(o.DmarcEnforced) {
    return nil, false
	}
	return o.DmarcEnforced, true
}

// HasDmarcEnforced returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasDmarcEnforced() bool {
	if o != nil && !isNil(o.DmarcEnforced) {
		return true
	}

	return false
}

// SetDmarcEnforced gets a reference to the given bool and assigns it to the DmarcEnforced field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetDmarcEnforced(v bool) {
	o.DmarcEnforced = &v
}

// GetProfiles returns the Profiles field value if set, zero value otherwise.
func (o *FraudGetEmailReputationResponseEntityDetails) GetProfiles() []string {
	if o == nil || isNil(o.Profiles) {
		var ret []string
		return ret
	}
	return o.Profiles
}

// GetProfilesOk returns a tuple with the Profiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) GetProfilesOk() ([]string, bool) {
	if o == nil || isNil(o.Profiles) {
    return nil, false
	}
	return o.Profiles, true
}

// HasProfiles returns a boolean if a field has been set.
func (o *FraudGetEmailReputationResponseEntityDetails) HasProfiles() bool {
	if o != nil && !isNil(o.Profiles) {
		return true
	}

	return false
}

// SetProfiles gets a reference to the given []string and assigns it to the Profiles field.
func (o *FraudGetEmailReputationResponseEntityDetails) SetProfiles(v []string) {
	o.Profiles = v
}

func (o FraudGetEmailReputationResponseEntityDetails) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Blacklisted) {
		toSerialize["blacklisted"] = o.Blacklisted
	}
	if !isNil(o.MaliciousActivity) {
		toSerialize["malicious_activity"] = o.MaliciousActivity
	}
	if !isNil(o.MaliciousActivityRecent) {
		toSerialize["malicious_activity_recent"] = o.MaliciousActivityRecent
	}
	if !isNil(o.CredentialsLeaked) {
		toSerialize["credentials_leaked"] = o.CredentialsLeaked
	}
	if !isNil(o.CredentialsLeakedRecent) {
		toSerialize["credentials_leaked_recent"] = o.CredentialsLeakedRecent
	}
	if !isNil(o.DataBreach) {
		toSerialize["data_breach"] = o.DataBreach
	}
	if !isNil(o.FirstSeen) {
		toSerialize["first_seen"] = o.FirstSeen
	}
	if !isNil(o.LastSeen) {
		toSerialize["last_seen"] = o.LastSeen
	}
	if !isNil(o.DomainExists) {
		toSerialize["domain_exists"] = o.DomainExists
	}
	if !isNil(o.DomainReputation) {
		toSerialize["domain_reputation"] = o.DomainReputation
	}
	if !isNil(o.NewDomain) {
		toSerialize["new_domain"] = o.NewDomain
	}
	if !isNil(o.DaysSinceDomainCreation) {
		toSerialize["days_since_domain_creation"] = o.DaysSinceDomainCreation
	}
	if !isNil(o.SuspiciousTld) {
		toSerialize["suspicious_tld"] = o.SuspiciousTld
	}
	if !isNil(o.Spam) {
		toSerialize["spam"] = o.Spam
	}
	if !isNil(o.FreeProvider) {
		toSerialize["free_provider"] = o.FreeProvider
	}
	if !isNil(o.Disposable) {
		toSerialize["disposable"] = o.Disposable
	}
	if !isNil(o.Deliverable) {
		toSerialize["deliverable"] = o.Deliverable
	}
	if !isNil(o.AcceptAll) {
		toSerialize["accept_all"] = o.AcceptAll
	}
	if !isNil(o.ValidMx) {
		toSerialize["valid_mx"] = o.ValidMx
	}
	if !isNil(o.PrimaryMx) {
		toSerialize["primary_mx"] = o.PrimaryMx
	}
	if !isNil(o.Spoofable) {
		toSerialize["spoofable"] = o.Spoofable
	}
	if !isNil(o.SpfStrict) {
		toSerialize["spf_strict"] = o.SpfStrict
	}
	if !isNil(o.DmarcEnforced) {
		toSerialize["dmarc_enforced"] = o.DmarcEnforced
	}
	if !isNil(o.Profiles) {
		toSerialize["profiles"] = o.Profiles
	}
	return json.Marshal(toSerialize)
}

type NullableFraudGetEmailReputationResponseEntityDetails struct {
	value *FraudGetEmailReputationResponseEntityDetails
	isSet bool
}

func (v NullableFraudGetEmailReputationResponseEntityDetails) Get() *FraudGetEmailReputationResponseEntityDetails {
	return v.value
}

func (v *NullableFraudGetEmailReputationResponseEntityDetails) Set(val *FraudGetEmailReputationResponseEntityDetails) {
	v.value = val
	v.isSet = true
}

func (v NullableFraudGetEmailReputationResponseEntityDetails) IsSet() bool {
	return v.isSet
}

func (v *NullableFraudGetEmailReputationResponseEntityDetails) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFraudGetEmailReputationResponseEntityDetails(val *FraudGetEmailReputationResponseEntityDetails) *NullableFraudGetEmailReputationResponseEntityDetails {
	return &NullableFraudGetEmailReputationResponseEntityDetails{value: val, isSet: true}
}

func (v NullableFraudGetEmailReputationResponseEntityDetails) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFraudGetEmailReputationResponseEntityDetails) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


