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

// GetEarningStructureResponse struct for GetEarningStructureResponse
type GetEarningStructureResponse struct {
	Entity *GetEarningStructureResponseEntity `json:"entity,omitempty"`
}

// NewGetEarningStructureResponse instantiates a new GetEarningStructureResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetEarningStructureResponse() *GetEarningStructureResponse {
	this := GetEarningStructureResponse{}
	return &this
}

// NewGetEarningStructureResponseWithDefaults instantiates a new GetEarningStructureResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetEarningStructureResponseWithDefaults() *GetEarningStructureResponse {
	this := GetEarningStructureResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *GetEarningStructureResponse) GetEntity() GetEarningStructureResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret GetEarningStructureResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetEarningStructureResponse) GetEntityOk() (*GetEarningStructureResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *GetEarningStructureResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given GetEarningStructureResponseEntity and assigns it to the Entity field.
func (o *GetEarningStructureResponse) SetEntity(v GetEarningStructureResponseEntity) {
	o.Entity = &v
}

func (o GetEarningStructureResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableGetEarningStructureResponse struct {
	value *GetEarningStructureResponse
	isSet bool
}

func (v NullableGetEarningStructureResponse) Get() *GetEarningStructureResponse {
	return v.value
}

func (v *NullableGetEarningStructureResponse) Set(val *GetEarningStructureResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetEarningStructureResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetEarningStructureResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetEarningStructureResponse(val *GetEarningStructureResponse) *NullableGetEarningStructureResponse {
	return &NullableGetEarningStructureResponse{value: val, isSet: true}
}

func (v NullableGetEarningStructureResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetEarningStructureResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

