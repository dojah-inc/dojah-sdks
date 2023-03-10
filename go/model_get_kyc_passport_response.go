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

// GetKycPassportResponse struct for GetKycPassportResponse
type GetKycPassportResponse struct {
	Entity *GetKycPassportResponseEntity `json:"entity,omitempty"`
}

// NewGetKycPassportResponse instantiates a new GetKycPassportResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetKycPassportResponse() *GetKycPassportResponse {
	this := GetKycPassportResponse{}
	return &this
}

// NewGetKycPassportResponseWithDefaults instantiates a new GetKycPassportResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetKycPassportResponseWithDefaults() *GetKycPassportResponse {
	this := GetKycPassportResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *GetKycPassportResponse) GetEntity() GetKycPassportResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret GetKycPassportResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponse) GetEntityOk() (*GetKycPassportResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *GetKycPassportResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given GetKycPassportResponseEntity and assigns it to the Entity field.
func (o *GetKycPassportResponse) SetEntity(v GetKycPassportResponseEntity) {
	o.Entity = &v
}

func (o GetKycPassportResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableGetKycPassportResponse struct {
	value *GetKycPassportResponse
	isSet bool
}

func (v NullableGetKycPassportResponse) Get() *GetKycPassportResponse {
	return v.value
}

func (v *NullableGetKycPassportResponse) Set(val *GetKycPassportResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetKycPassportResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetKycPassportResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetKycPassportResponse(val *GetKycPassportResponse) *NullableGetKycPassportResponse {
	return &NullableGetKycPassportResponse{value: val, isSet: true}
}

func (v NullableGetKycPassportResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetKycPassportResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

