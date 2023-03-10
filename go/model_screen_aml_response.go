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

// ScreenAmlResponse struct for ScreenAmlResponse
type ScreenAmlResponse struct {
	Entity *ScreenAmlResponseEntity `json:"entity,omitempty"`
}

// NewScreenAmlResponse instantiates a new ScreenAmlResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewScreenAmlResponse() *ScreenAmlResponse {
	this := ScreenAmlResponse{}
	return &this
}

// NewScreenAmlResponseWithDefaults instantiates a new ScreenAmlResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewScreenAmlResponseWithDefaults() *ScreenAmlResponse {
	this := ScreenAmlResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *ScreenAmlResponse) GetEntity() ScreenAmlResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret ScreenAmlResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ScreenAmlResponse) GetEntityOk() (*ScreenAmlResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *ScreenAmlResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given ScreenAmlResponseEntity and assigns it to the Entity field.
func (o *ScreenAmlResponse) SetEntity(v ScreenAmlResponseEntity) {
	o.Entity = &v
}

func (o ScreenAmlResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableScreenAmlResponse struct {
	value *ScreenAmlResponse
	isSet bool
}

func (v NullableScreenAmlResponse) Get() *ScreenAmlResponse {
	return v.value
}

func (v *NullableScreenAmlResponse) Set(val *ScreenAmlResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableScreenAmlResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableScreenAmlResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableScreenAmlResponse(val *ScreenAmlResponse) *NullableScreenAmlResponse {
	return &NullableScreenAmlResponse{value: val, isSet: true}
}

func (v NullableScreenAmlResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableScreenAmlResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

