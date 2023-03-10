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

// VerifyAgeResponseEntity struct for VerifyAgeResponseEntity
type VerifyAgeResponseEntity struct {
	FirstName *string `json:"first_name,omitempty"`
	LastName *string `json:"last_name,omitempty"`
	DateOfBirth *string `json:"date_of_birth,omitempty"`
	Verification *bool `json:"verification,omitempty"`
}

// NewVerifyAgeResponseEntity instantiates a new VerifyAgeResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVerifyAgeResponseEntity() *VerifyAgeResponseEntity {
	this := VerifyAgeResponseEntity{}
	return &this
}

// NewVerifyAgeResponseEntityWithDefaults instantiates a new VerifyAgeResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVerifyAgeResponseEntityWithDefaults() *VerifyAgeResponseEntity {
	this := VerifyAgeResponseEntity{}
	return &this
}

// GetFirstName returns the FirstName field value if set, zero value otherwise.
func (o *VerifyAgeResponseEntity) GetFirstName() string {
	if o == nil || isNil(o.FirstName) {
		var ret string
		return ret
	}
	return *o.FirstName
}

// GetFirstNameOk returns a tuple with the FirstName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyAgeResponseEntity) GetFirstNameOk() (*string, bool) {
	if o == nil || isNil(o.FirstName) {
    return nil, false
	}
	return o.FirstName, true
}

// HasFirstName returns a boolean if a field has been set.
func (o *VerifyAgeResponseEntity) HasFirstName() bool {
	if o != nil && !isNil(o.FirstName) {
		return true
	}

	return false
}

// SetFirstName gets a reference to the given string and assigns it to the FirstName field.
func (o *VerifyAgeResponseEntity) SetFirstName(v string) {
	o.FirstName = &v
}

// GetLastName returns the LastName field value if set, zero value otherwise.
func (o *VerifyAgeResponseEntity) GetLastName() string {
	if o == nil || isNil(o.LastName) {
		var ret string
		return ret
	}
	return *o.LastName
}

// GetLastNameOk returns a tuple with the LastName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyAgeResponseEntity) GetLastNameOk() (*string, bool) {
	if o == nil || isNil(o.LastName) {
    return nil, false
	}
	return o.LastName, true
}

// HasLastName returns a boolean if a field has been set.
func (o *VerifyAgeResponseEntity) HasLastName() bool {
	if o != nil && !isNil(o.LastName) {
		return true
	}

	return false
}

// SetLastName gets a reference to the given string and assigns it to the LastName field.
func (o *VerifyAgeResponseEntity) SetLastName(v string) {
	o.LastName = &v
}

// GetDateOfBirth returns the DateOfBirth field value if set, zero value otherwise.
func (o *VerifyAgeResponseEntity) GetDateOfBirth() string {
	if o == nil || isNil(o.DateOfBirth) {
		var ret string
		return ret
	}
	return *o.DateOfBirth
}

// GetDateOfBirthOk returns a tuple with the DateOfBirth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyAgeResponseEntity) GetDateOfBirthOk() (*string, bool) {
	if o == nil || isNil(o.DateOfBirth) {
    return nil, false
	}
	return o.DateOfBirth, true
}

// HasDateOfBirth returns a boolean if a field has been set.
func (o *VerifyAgeResponseEntity) HasDateOfBirth() bool {
	if o != nil && !isNil(o.DateOfBirth) {
		return true
	}

	return false
}

// SetDateOfBirth gets a reference to the given string and assigns it to the DateOfBirth field.
func (o *VerifyAgeResponseEntity) SetDateOfBirth(v string) {
	o.DateOfBirth = &v
}

// GetVerification returns the Verification field value if set, zero value otherwise.
func (o *VerifyAgeResponseEntity) GetVerification() bool {
	if o == nil || isNil(o.Verification) {
		var ret bool
		return ret
	}
	return *o.Verification
}

// GetVerificationOk returns a tuple with the Verification field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyAgeResponseEntity) GetVerificationOk() (*bool, bool) {
	if o == nil || isNil(o.Verification) {
    return nil, false
	}
	return o.Verification, true
}

// HasVerification returns a boolean if a field has been set.
func (o *VerifyAgeResponseEntity) HasVerification() bool {
	if o != nil && !isNil(o.Verification) {
		return true
	}

	return false
}

// SetVerification gets a reference to the given bool and assigns it to the Verification field.
func (o *VerifyAgeResponseEntity) SetVerification(v bool) {
	o.Verification = &v
}

func (o VerifyAgeResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.FirstName) {
		toSerialize["first_name"] = o.FirstName
	}
	if !isNil(o.LastName) {
		toSerialize["last_name"] = o.LastName
	}
	if !isNil(o.DateOfBirth) {
		toSerialize["date_of_birth"] = o.DateOfBirth
	}
	if !isNil(o.Verification) {
		toSerialize["verification"] = o.Verification
	}
	return json.Marshal(toSerialize)
}

type NullableVerifyAgeResponseEntity struct {
	value *VerifyAgeResponseEntity
	isSet bool
}

func (v NullableVerifyAgeResponseEntity) Get() *VerifyAgeResponseEntity {
	return v.value
}

func (v *NullableVerifyAgeResponseEntity) Set(val *VerifyAgeResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableVerifyAgeResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableVerifyAgeResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVerifyAgeResponseEntity(val *VerifyAgeResponseEntity) *NullableVerifyAgeResponseEntity {
	return &NullableVerifyAgeResponseEntity{value: val, isSet: true}
}

func (v NullableVerifyAgeResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVerifyAgeResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

