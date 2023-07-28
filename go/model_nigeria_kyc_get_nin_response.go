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

// NigeriaKycGetNinResponse struct for NigeriaKycGetNinResponse
type NigeriaKycGetNinResponse struct {
	Entity *NigeriaKycGetNinResponseEntity `json:"entity,omitempty"`
}

// NewNigeriaKycGetNinResponse instantiates a new NigeriaKycGetNinResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNigeriaKycGetNinResponse() *NigeriaKycGetNinResponse {
	this := NigeriaKycGetNinResponse{}
	return &this
}

// NewNigeriaKycGetNinResponseWithDefaults instantiates a new NigeriaKycGetNinResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNigeriaKycGetNinResponseWithDefaults() *NigeriaKycGetNinResponse {
	this := NigeriaKycGetNinResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *NigeriaKycGetNinResponse) GetEntity() NigeriaKycGetNinResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret NigeriaKycGetNinResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *NigeriaKycGetNinResponse) GetEntityOk() (*NigeriaKycGetNinResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *NigeriaKycGetNinResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given NigeriaKycGetNinResponseEntity and assigns it to the Entity field.
func (o *NigeriaKycGetNinResponse) SetEntity(v NigeriaKycGetNinResponseEntity) {
	o.Entity = &v
}

func (o NigeriaKycGetNinResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableNigeriaKycGetNinResponse struct {
	value *NigeriaKycGetNinResponse
	isSet bool
}

func (v NullableNigeriaKycGetNinResponse) Get() *NigeriaKycGetNinResponse {
	return v.value
}

func (v *NullableNigeriaKycGetNinResponse) Set(val *NigeriaKycGetNinResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableNigeriaKycGetNinResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableNigeriaKycGetNinResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNigeriaKycGetNinResponse(val *NigeriaKycGetNinResponse) *NullableNigeriaKycGetNinResponse {
	return &NullableNigeriaKycGetNinResponse{value: val, isSet: true}
}

func (v NullableNigeriaKycGetNinResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNigeriaKycGetNinResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

