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

// GetPassportResponse struct for GetPassportResponse
type GetPassportResponse struct {
	Entity *GetPassportResponseEntity `json:"entity,omitempty"`
}

// NewGetPassportResponse instantiates a new GetPassportResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetPassportResponse() *GetPassportResponse {
	this := GetPassportResponse{}
	return &this
}

// NewGetPassportResponseWithDefaults instantiates a new GetPassportResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetPassportResponseWithDefaults() *GetPassportResponse {
	this := GetPassportResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *GetPassportResponse) GetEntity() GetPassportResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret GetPassportResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponse) GetEntityOk() (*GetPassportResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *GetPassportResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given GetPassportResponseEntity and assigns it to the Entity field.
func (o *GetPassportResponse) SetEntity(v GetPassportResponseEntity) {
	o.Entity = &v
}

func (o GetPassportResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableGetPassportResponse struct {
	value *GetPassportResponse
	isSet bool
}

func (v NullableGetPassportResponse) Get() *GetPassportResponse {
	return v.value
}

func (v *NullableGetPassportResponse) Set(val *GetPassportResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetPassportResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetPassportResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetPassportResponse(val *GetPassportResponse) *NullableGetPassportResponse {
	return &NullableGetPassportResponse{value: val, isSet: true}
}

func (v NullableGetPassportResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetPassportResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


