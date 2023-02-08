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

// ScreenAmlRequest struct for ScreenAmlRequest
type ScreenAmlRequest struct {
	FirstName *string `json:"first_name,omitempty"`
	LastName *string `json:"last_name,omitempty"`
	DateOfBirth *string `json:"date_of_birth,omitempty"`
}

// NewScreenAmlRequest instantiates a new ScreenAmlRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewScreenAmlRequest() *ScreenAmlRequest {
	this := ScreenAmlRequest{}
	return &this
}

// NewScreenAmlRequestWithDefaults instantiates a new ScreenAmlRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewScreenAmlRequestWithDefaults() *ScreenAmlRequest {
	this := ScreenAmlRequest{}
	return &this
}

// GetFirstName returns the FirstName field value if set, zero value otherwise.
func (o *ScreenAmlRequest) GetFirstName() string {
	if o == nil || isNil(o.FirstName) {
		var ret string
		return ret
	}
	return *o.FirstName
}

// GetFirstNameOk returns a tuple with the FirstName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ScreenAmlRequest) GetFirstNameOk() (*string, bool) {
	if o == nil || isNil(o.FirstName) {
    return nil, false
	}
	return o.FirstName, true
}

// HasFirstName returns a boolean if a field has been set.
func (o *ScreenAmlRequest) HasFirstName() bool {
	if o != nil && !isNil(o.FirstName) {
		return true
	}

	return false
}

// SetFirstName gets a reference to the given string and assigns it to the FirstName field.
func (o *ScreenAmlRequest) SetFirstName(v string) {
	o.FirstName = &v
}

// GetLastName returns the LastName field value if set, zero value otherwise.
func (o *ScreenAmlRequest) GetLastName() string {
	if o == nil || isNil(o.LastName) {
		var ret string
		return ret
	}
	return *o.LastName
}

// GetLastNameOk returns a tuple with the LastName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ScreenAmlRequest) GetLastNameOk() (*string, bool) {
	if o == nil || isNil(o.LastName) {
    return nil, false
	}
	return o.LastName, true
}

// HasLastName returns a boolean if a field has been set.
func (o *ScreenAmlRequest) HasLastName() bool {
	if o != nil && !isNil(o.LastName) {
		return true
	}

	return false
}

// SetLastName gets a reference to the given string and assigns it to the LastName field.
func (o *ScreenAmlRequest) SetLastName(v string) {
	o.LastName = &v
}

// GetDateOfBirth returns the DateOfBirth field value if set, zero value otherwise.
func (o *ScreenAmlRequest) GetDateOfBirth() string {
	if o == nil || isNil(o.DateOfBirth) {
		var ret string
		return ret
	}
	return *o.DateOfBirth
}

// GetDateOfBirthOk returns a tuple with the DateOfBirth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ScreenAmlRequest) GetDateOfBirthOk() (*string, bool) {
	if o == nil || isNil(o.DateOfBirth) {
    return nil, false
	}
	return o.DateOfBirth, true
}

// HasDateOfBirth returns a boolean if a field has been set.
func (o *ScreenAmlRequest) HasDateOfBirth() bool {
	if o != nil && !isNil(o.DateOfBirth) {
		return true
	}

	return false
}

// SetDateOfBirth gets a reference to the given string and assigns it to the DateOfBirth field.
func (o *ScreenAmlRequest) SetDateOfBirth(v string) {
	o.DateOfBirth = &v
}

func (o ScreenAmlRequest) MarshalJSON() ([]byte, error) {
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
	return json.Marshal(toSerialize)
}

type NullableScreenAmlRequest struct {
	value *ScreenAmlRequest
	isSet bool
}

func (v NullableScreenAmlRequest) Get() *ScreenAmlRequest {
	return v.value
}

func (v *NullableScreenAmlRequest) Set(val *ScreenAmlRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableScreenAmlRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableScreenAmlRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableScreenAmlRequest(val *ScreenAmlRequest) *NullableScreenAmlRequest {
	return &NullableScreenAmlRequest{value: val, isSet: true}
}

func (v NullableScreenAmlRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableScreenAmlRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


