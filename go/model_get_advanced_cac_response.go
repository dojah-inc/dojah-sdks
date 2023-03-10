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

// GetAdvancedCacResponse struct for GetAdvancedCacResponse
type GetAdvancedCacResponse struct {
	Entity *GetBasicCacResponseEntity `json:"entity,omitempty"`
}

// NewGetAdvancedCacResponse instantiates a new GetAdvancedCacResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetAdvancedCacResponse() *GetAdvancedCacResponse {
	this := GetAdvancedCacResponse{}
	return &this
}

// NewGetAdvancedCacResponseWithDefaults instantiates a new GetAdvancedCacResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetAdvancedCacResponseWithDefaults() *GetAdvancedCacResponse {
	this := GetAdvancedCacResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *GetAdvancedCacResponse) GetEntity() GetBasicCacResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret GetBasicCacResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAdvancedCacResponse) GetEntityOk() (*GetBasicCacResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *GetAdvancedCacResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given GetBasicCacResponseEntity and assigns it to the Entity field.
func (o *GetAdvancedCacResponse) SetEntity(v GetBasicCacResponseEntity) {
	o.Entity = &v
}

func (o GetAdvancedCacResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableGetAdvancedCacResponse struct {
	value *GetAdvancedCacResponse
	isSet bool
}

func (v NullableGetAdvancedCacResponse) Get() *GetAdvancedCacResponse {
	return v.value
}

func (v *NullableGetAdvancedCacResponse) Set(val *GetAdvancedCacResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetAdvancedCacResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetAdvancedCacResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetAdvancedCacResponse(val *GetAdvancedCacResponse) *NullableGetAdvancedCacResponse {
	return &NullableGetAdvancedCacResponse{value: val, isSet: true}
}

func (v NullableGetAdvancedCacResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetAdvancedCacResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

