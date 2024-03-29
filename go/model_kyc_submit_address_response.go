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

// KycSubmitAddressResponse struct for KycSubmitAddressResponse
type KycSubmitAddressResponse struct {
	Entity *KycSubmitAddressResponseEntity `json:"entity,omitempty"`
}

// NewKycSubmitAddressResponse instantiates a new KycSubmitAddressResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewKycSubmitAddressResponse() *KycSubmitAddressResponse {
	this := KycSubmitAddressResponse{}
	return &this
}

// NewKycSubmitAddressResponseWithDefaults instantiates a new KycSubmitAddressResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewKycSubmitAddressResponseWithDefaults() *KycSubmitAddressResponse {
	this := KycSubmitAddressResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *KycSubmitAddressResponse) GetEntity() KycSubmitAddressResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret KycSubmitAddressResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KycSubmitAddressResponse) GetEntityOk() (*KycSubmitAddressResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *KycSubmitAddressResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given KycSubmitAddressResponseEntity and assigns it to the Entity field.
func (o *KycSubmitAddressResponse) SetEntity(v KycSubmitAddressResponseEntity) {
	o.Entity = &v
}

func (o KycSubmitAddressResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableKycSubmitAddressResponse struct {
	value *KycSubmitAddressResponse
	isSet bool
}

func (v NullableKycSubmitAddressResponse) Get() *KycSubmitAddressResponse {
	return v.value
}

func (v *NullableKycSubmitAddressResponse) Set(val *KycSubmitAddressResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableKycSubmitAddressResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableKycSubmitAddressResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableKycSubmitAddressResponse(val *KycSubmitAddressResponse) *NullableKycSubmitAddressResponse {
	return &NullableKycSubmitAddressResponse{value: val, isSet: true}
}

func (v NullableKycSubmitAddressResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableKycSubmitAddressResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


