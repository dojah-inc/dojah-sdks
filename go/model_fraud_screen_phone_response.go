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

// FraudScreenPhoneResponse struct for FraudScreenPhoneResponse
type FraudScreenPhoneResponse struct {
	Entity *FraudScreenPhoneResponseEntity `json:"entity,omitempty"`
}

// NewFraudScreenPhoneResponse instantiates a new FraudScreenPhoneResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFraudScreenPhoneResponse() *FraudScreenPhoneResponse {
	this := FraudScreenPhoneResponse{}
	return &this
}

// NewFraudScreenPhoneResponseWithDefaults instantiates a new FraudScreenPhoneResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFraudScreenPhoneResponseWithDefaults() *FraudScreenPhoneResponse {
	this := FraudScreenPhoneResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *FraudScreenPhoneResponse) GetEntity() FraudScreenPhoneResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret FraudScreenPhoneResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudScreenPhoneResponse) GetEntityOk() (*FraudScreenPhoneResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *FraudScreenPhoneResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given FraudScreenPhoneResponseEntity and assigns it to the Entity field.
func (o *FraudScreenPhoneResponse) SetEntity(v FraudScreenPhoneResponseEntity) {
	o.Entity = &v
}

func (o FraudScreenPhoneResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableFraudScreenPhoneResponse struct {
	value *FraudScreenPhoneResponse
	isSet bool
}

func (v NullableFraudScreenPhoneResponse) Get() *FraudScreenPhoneResponse {
	return v.value
}

func (v *NullableFraudScreenPhoneResponse) Set(val *FraudScreenPhoneResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableFraudScreenPhoneResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableFraudScreenPhoneResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFraudScreenPhoneResponse(val *FraudScreenPhoneResponse) *NullableFraudScreenPhoneResponse {
	return &NullableFraudScreenPhoneResponse{value: val, isSet: true}
}

func (v NullableFraudScreenPhoneResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFraudScreenPhoneResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

