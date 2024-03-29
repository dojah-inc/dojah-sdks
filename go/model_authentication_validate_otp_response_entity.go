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

// AuthenticationValidateOtpResponseEntity struct for AuthenticationValidateOtpResponseEntity
type AuthenticationValidateOtpResponseEntity struct {
	Valid *bool `json:"valid,omitempty"`
}

// NewAuthenticationValidateOtpResponseEntity instantiates a new AuthenticationValidateOtpResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAuthenticationValidateOtpResponseEntity() *AuthenticationValidateOtpResponseEntity {
	this := AuthenticationValidateOtpResponseEntity{}
	return &this
}

// NewAuthenticationValidateOtpResponseEntityWithDefaults instantiates a new AuthenticationValidateOtpResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAuthenticationValidateOtpResponseEntityWithDefaults() *AuthenticationValidateOtpResponseEntity {
	this := AuthenticationValidateOtpResponseEntity{}
	return &this
}

// GetValid returns the Valid field value if set, zero value otherwise.
func (o *AuthenticationValidateOtpResponseEntity) GetValid() bool {
	if o == nil || isNil(o.Valid) {
		var ret bool
		return ret
	}
	return *o.Valid
}

// GetValidOk returns a tuple with the Valid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AuthenticationValidateOtpResponseEntity) GetValidOk() (*bool, bool) {
	if o == nil || isNil(o.Valid) {
    return nil, false
	}
	return o.Valid, true
}

// HasValid returns a boolean if a field has been set.
func (o *AuthenticationValidateOtpResponseEntity) HasValid() bool {
	if o != nil && !isNil(o.Valid) {
		return true
	}

	return false
}

// SetValid gets a reference to the given bool and assigns it to the Valid field.
func (o *AuthenticationValidateOtpResponseEntity) SetValid(v bool) {
	o.Valid = &v
}

func (o AuthenticationValidateOtpResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Valid) {
		toSerialize["valid"] = o.Valid
	}
	return json.Marshal(toSerialize)
}

type NullableAuthenticationValidateOtpResponseEntity struct {
	value *AuthenticationValidateOtpResponseEntity
	isSet bool
}

func (v NullableAuthenticationValidateOtpResponseEntity) Get() *AuthenticationValidateOtpResponseEntity {
	return v.value
}

func (v *NullableAuthenticationValidateOtpResponseEntity) Set(val *AuthenticationValidateOtpResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableAuthenticationValidateOtpResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableAuthenticationValidateOtpResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAuthenticationValidateOtpResponseEntity(val *AuthenticationValidateOtpResponseEntity) *NullableAuthenticationValidateOtpResponseEntity {
	return &NullableAuthenticationValidateOtpResponseEntity{value: val, isSet: true}
}

func (v NullableAuthenticationValidateOtpResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAuthenticationValidateOtpResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


