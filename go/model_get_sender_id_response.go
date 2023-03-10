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

// GetSenderIdResponse struct for GetSenderIdResponse
type GetSenderIdResponse struct {
	Entity []GetSenderIdResponseEntityInner `json:"entity,omitempty"`
}

// NewGetSenderIdResponse instantiates a new GetSenderIdResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetSenderIdResponse() *GetSenderIdResponse {
	this := GetSenderIdResponse{}
	return &this
}

// NewGetSenderIdResponseWithDefaults instantiates a new GetSenderIdResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetSenderIdResponseWithDefaults() *GetSenderIdResponse {
	this := GetSenderIdResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *GetSenderIdResponse) GetEntity() []GetSenderIdResponseEntityInner {
	if o == nil || isNil(o.Entity) {
		var ret []GetSenderIdResponseEntityInner
		return ret
	}
	return o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSenderIdResponse) GetEntityOk() ([]GetSenderIdResponseEntityInner, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *GetSenderIdResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given []GetSenderIdResponseEntityInner and assigns it to the Entity field.
func (o *GetSenderIdResponse) SetEntity(v []GetSenderIdResponseEntityInner) {
	o.Entity = v
}

func (o GetSenderIdResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableGetSenderIdResponse struct {
	value *GetSenderIdResponse
	isSet bool
}

func (v NullableGetSenderIdResponse) Get() *GetSenderIdResponse {
	return v.value
}

func (v *NullableGetSenderIdResponse) Set(val *GetSenderIdResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetSenderIdResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetSenderIdResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetSenderIdResponse(val *GetSenderIdResponse) *NullableGetSenderIdResponse {
	return &NullableGetSenderIdResponse{value: val, isSet: true}
}

func (v NullableGetSenderIdResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetSenderIdResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

