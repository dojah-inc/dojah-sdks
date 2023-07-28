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

// FraudScreenUserResponseEntityEmailCheckResultBreachDetails struct for FraudScreenUserResponseEntityEmailCheckResultBreachDetails
type FraudScreenUserResponseEntityEmailCheckResultBreachDetails struct {
	HaveibeenpwnedListed *bool `json:"haveibeenpwned_listed,omitempty"`
	NumberOfBreaches *float32 `json:"number_of_breaches,omitempty"`
	FirstBreach *string `json:"first_breach,omitempty"`
	Breaches []FraudScreenUserResponseEntityEmailCheckResultBreachDetailsBreachesInner `json:"breaches,omitempty"`
}

// NewFraudScreenUserResponseEntityEmailCheckResultBreachDetails instantiates a new FraudScreenUserResponseEntityEmailCheckResultBreachDetails object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFraudScreenUserResponseEntityEmailCheckResultBreachDetails() *FraudScreenUserResponseEntityEmailCheckResultBreachDetails {
	this := FraudScreenUserResponseEntityEmailCheckResultBreachDetails{}
	return &this
}

// NewFraudScreenUserResponseEntityEmailCheckResultBreachDetailsWithDefaults instantiates a new FraudScreenUserResponseEntityEmailCheckResultBreachDetails object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFraudScreenUserResponseEntityEmailCheckResultBreachDetailsWithDefaults() *FraudScreenUserResponseEntityEmailCheckResultBreachDetails {
	this := FraudScreenUserResponseEntityEmailCheckResultBreachDetails{}
	return &this
}

// GetHaveibeenpwnedListed returns the HaveibeenpwnedListed field value if set, zero value otherwise.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) GetHaveibeenpwnedListed() bool {
	if o == nil || isNil(o.HaveibeenpwnedListed) {
		var ret bool
		return ret
	}
	return *o.HaveibeenpwnedListed
}

// GetHaveibeenpwnedListedOk returns a tuple with the HaveibeenpwnedListed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) GetHaveibeenpwnedListedOk() (*bool, bool) {
	if o == nil || isNil(o.HaveibeenpwnedListed) {
    return nil, false
	}
	return o.HaveibeenpwnedListed, true
}

// HasHaveibeenpwnedListed returns a boolean if a field has been set.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) HasHaveibeenpwnedListed() bool {
	if o != nil && !isNil(o.HaveibeenpwnedListed) {
		return true
	}

	return false
}

// SetHaveibeenpwnedListed gets a reference to the given bool and assigns it to the HaveibeenpwnedListed field.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) SetHaveibeenpwnedListed(v bool) {
	o.HaveibeenpwnedListed = &v
}

// GetNumberOfBreaches returns the NumberOfBreaches field value if set, zero value otherwise.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) GetNumberOfBreaches() float32 {
	if o == nil || isNil(o.NumberOfBreaches) {
		var ret float32
		return ret
	}
	return *o.NumberOfBreaches
}

// GetNumberOfBreachesOk returns a tuple with the NumberOfBreaches field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) GetNumberOfBreachesOk() (*float32, bool) {
	if o == nil || isNil(o.NumberOfBreaches) {
    return nil, false
	}
	return o.NumberOfBreaches, true
}

// HasNumberOfBreaches returns a boolean if a field has been set.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) HasNumberOfBreaches() bool {
	if o != nil && !isNil(o.NumberOfBreaches) {
		return true
	}

	return false
}

// SetNumberOfBreaches gets a reference to the given float32 and assigns it to the NumberOfBreaches field.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) SetNumberOfBreaches(v float32) {
	o.NumberOfBreaches = &v
}

// GetFirstBreach returns the FirstBreach field value if set, zero value otherwise.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) GetFirstBreach() string {
	if o == nil || isNil(o.FirstBreach) {
		var ret string
		return ret
	}
	return *o.FirstBreach
}

// GetFirstBreachOk returns a tuple with the FirstBreach field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) GetFirstBreachOk() (*string, bool) {
	if o == nil || isNil(o.FirstBreach) {
    return nil, false
	}
	return o.FirstBreach, true
}

// HasFirstBreach returns a boolean if a field has been set.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) HasFirstBreach() bool {
	if o != nil && !isNil(o.FirstBreach) {
		return true
	}

	return false
}

// SetFirstBreach gets a reference to the given string and assigns it to the FirstBreach field.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) SetFirstBreach(v string) {
	o.FirstBreach = &v
}

// GetBreaches returns the Breaches field value if set, zero value otherwise.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) GetBreaches() []FraudScreenUserResponseEntityEmailCheckResultBreachDetailsBreachesInner {
	if o == nil || isNil(o.Breaches) {
		var ret []FraudScreenUserResponseEntityEmailCheckResultBreachDetailsBreachesInner
		return ret
	}
	return o.Breaches
}

// GetBreachesOk returns a tuple with the Breaches field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) GetBreachesOk() ([]FraudScreenUserResponseEntityEmailCheckResultBreachDetailsBreachesInner, bool) {
	if o == nil || isNil(o.Breaches) {
    return nil, false
	}
	return o.Breaches, true
}

// HasBreaches returns a boolean if a field has been set.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) HasBreaches() bool {
	if o != nil && !isNil(o.Breaches) {
		return true
	}

	return false
}

// SetBreaches gets a reference to the given []FraudScreenUserResponseEntityEmailCheckResultBreachDetailsBreachesInner and assigns it to the Breaches field.
func (o *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) SetBreaches(v []FraudScreenUserResponseEntityEmailCheckResultBreachDetailsBreachesInner) {
	o.Breaches = v
}

func (o FraudScreenUserResponseEntityEmailCheckResultBreachDetails) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.HaveibeenpwnedListed) {
		toSerialize["haveibeenpwned_listed"] = o.HaveibeenpwnedListed
	}
	if !isNil(o.NumberOfBreaches) {
		toSerialize["number_of_breaches"] = o.NumberOfBreaches
	}
	if !isNil(o.FirstBreach) {
		toSerialize["first_breach"] = o.FirstBreach
	}
	if !isNil(o.Breaches) {
		toSerialize["breaches"] = o.Breaches
	}
	return json.Marshal(toSerialize)
}

type NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails struct {
	value *FraudScreenUserResponseEntityEmailCheckResultBreachDetails
	isSet bool
}

func (v NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails) Get() *FraudScreenUserResponseEntityEmailCheckResultBreachDetails {
	return v.value
}

func (v *NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails) Set(val *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) {
	v.value = val
	v.isSet = true
}

func (v NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails) IsSet() bool {
	return v.isSet
}

func (v *NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails(val *FraudScreenUserResponseEntityEmailCheckResultBreachDetails) *NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails {
	return &NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails{value: val, isSet: true}
}

func (v NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFraudScreenUserResponseEntityEmailCheckResultBreachDetails) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

