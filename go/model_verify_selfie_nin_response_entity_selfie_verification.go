/*
DOJAH APIs

Use Dojah to verify, onboard and manage user identity across Africa!

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package dojah

import (
	"encoding/json"
)

// VerifySelfieNinResponseEntitySelfieVerification struct for VerifySelfieNinResponseEntitySelfieVerification
type VerifySelfieNinResponseEntitySelfieVerification struct {
	ConfidenceValue *float32 `json:"confidence_value,omitempty"`
	Match *bool `json:"match,omitempty"`
}

// NewVerifySelfieNinResponseEntitySelfieVerification instantiates a new VerifySelfieNinResponseEntitySelfieVerification object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVerifySelfieNinResponseEntitySelfieVerification() *VerifySelfieNinResponseEntitySelfieVerification {
	this := VerifySelfieNinResponseEntitySelfieVerification{}
	return &this
}

// NewVerifySelfieNinResponseEntitySelfieVerificationWithDefaults instantiates a new VerifySelfieNinResponseEntitySelfieVerification object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVerifySelfieNinResponseEntitySelfieVerificationWithDefaults() *VerifySelfieNinResponseEntitySelfieVerification {
	this := VerifySelfieNinResponseEntitySelfieVerification{}
	return &this
}

// GetConfidenceValue returns the ConfidenceValue field value if set, zero value otherwise.
func (o *VerifySelfieNinResponseEntitySelfieVerification) GetConfidenceValue() float32 {
	if o == nil || isNil(o.ConfidenceValue) {
		var ret float32
		return ret
	}
	return *o.ConfidenceValue
}

// GetConfidenceValueOk returns a tuple with the ConfidenceValue field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifySelfieNinResponseEntitySelfieVerification) GetConfidenceValueOk() (*float32, bool) {
	if o == nil || isNil(o.ConfidenceValue) {
    return nil, false
	}
	return o.ConfidenceValue, true
}

// HasConfidenceValue returns a boolean if a field has been set.
func (o *VerifySelfieNinResponseEntitySelfieVerification) HasConfidenceValue() bool {
	if o != nil && !isNil(o.ConfidenceValue) {
		return true
	}

	return false
}

// SetConfidenceValue gets a reference to the given float32 and assigns it to the ConfidenceValue field.
func (o *VerifySelfieNinResponseEntitySelfieVerification) SetConfidenceValue(v float32) {
	o.ConfidenceValue = &v
}

// GetMatch returns the Match field value if set, zero value otherwise.
func (o *VerifySelfieNinResponseEntitySelfieVerification) GetMatch() bool {
	if o == nil || isNil(o.Match) {
		var ret bool
		return ret
	}
	return *o.Match
}

// GetMatchOk returns a tuple with the Match field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifySelfieNinResponseEntitySelfieVerification) GetMatchOk() (*bool, bool) {
	if o == nil || isNil(o.Match) {
    return nil, false
	}
	return o.Match, true
}

// HasMatch returns a boolean if a field has been set.
func (o *VerifySelfieNinResponseEntitySelfieVerification) HasMatch() bool {
	if o != nil && !isNil(o.Match) {
		return true
	}

	return false
}

// SetMatch gets a reference to the given bool and assigns it to the Match field.
func (o *VerifySelfieNinResponseEntitySelfieVerification) SetMatch(v bool) {
	o.Match = &v
}

func (o VerifySelfieNinResponseEntitySelfieVerification) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.ConfidenceValue) {
		toSerialize["confidence_value"] = o.ConfidenceValue
	}
	if !isNil(o.Match) {
		toSerialize["match"] = o.Match
	}
	return json.Marshal(toSerialize)
}

type NullableVerifySelfieNinResponseEntitySelfieVerification struct {
	value *VerifySelfieNinResponseEntitySelfieVerification
	isSet bool
}

func (v NullableVerifySelfieNinResponseEntitySelfieVerification) Get() *VerifySelfieNinResponseEntitySelfieVerification {
	return v.value
}

func (v *NullableVerifySelfieNinResponseEntitySelfieVerification) Set(val *VerifySelfieNinResponseEntitySelfieVerification) {
	v.value = val
	v.isSet = true
}

func (v NullableVerifySelfieNinResponseEntitySelfieVerification) IsSet() bool {
	return v.isSet
}

func (v *NullableVerifySelfieNinResponseEntitySelfieVerification) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVerifySelfieNinResponseEntitySelfieVerification(val *VerifySelfieNinResponseEntitySelfieVerification) *NullableVerifySelfieNinResponseEntitySelfieVerification {
	return &NullableVerifySelfieNinResponseEntitySelfieVerification{value: val, isSet: true}
}

func (v NullableVerifySelfieNinResponseEntitySelfieVerification) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVerifySelfieNinResponseEntitySelfieVerification) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

