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

// VerifySelfieNinResponse struct for VerifySelfieNinResponse
type VerifySelfieNinResponse struct {
	Entity *VerifySelfieNinResponseEntity `json:"entity,omitempty"`
}

// NewVerifySelfieNinResponse instantiates a new VerifySelfieNinResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVerifySelfieNinResponse() *VerifySelfieNinResponse {
	this := VerifySelfieNinResponse{}
	return &this
}

// NewVerifySelfieNinResponseWithDefaults instantiates a new VerifySelfieNinResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVerifySelfieNinResponseWithDefaults() *VerifySelfieNinResponse {
	this := VerifySelfieNinResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *VerifySelfieNinResponse) GetEntity() VerifySelfieNinResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret VerifySelfieNinResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifySelfieNinResponse) GetEntityOk() (*VerifySelfieNinResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *VerifySelfieNinResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given VerifySelfieNinResponseEntity and assigns it to the Entity field.
func (o *VerifySelfieNinResponse) SetEntity(v VerifySelfieNinResponseEntity) {
	o.Entity = &v
}

func (o VerifySelfieNinResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableVerifySelfieNinResponse struct {
	value *VerifySelfieNinResponse
	isSet bool
}

func (v NullableVerifySelfieNinResponse) Get() *VerifySelfieNinResponse {
	return v.value
}

func (v *NullableVerifySelfieNinResponse) Set(val *VerifySelfieNinResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableVerifySelfieNinResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableVerifySelfieNinResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVerifySelfieNinResponse(val *VerifySelfieNinResponse) *NullableVerifySelfieNinResponse {
	return &NullableVerifySelfieNinResponse{value: val, isSet: true}
}

func (v NullableVerifySelfieNinResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVerifySelfieNinResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


