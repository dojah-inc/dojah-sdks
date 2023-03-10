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

// GetDataPlansResponse struct for GetDataPlansResponse
type GetDataPlansResponse struct {
	Entity []PurchaseDataResponseEntityInner `json:"entity,omitempty"`
}

// NewGetDataPlansResponse instantiates a new GetDataPlansResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetDataPlansResponse() *GetDataPlansResponse {
	this := GetDataPlansResponse{}
	return &this
}

// NewGetDataPlansResponseWithDefaults instantiates a new GetDataPlansResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetDataPlansResponseWithDefaults() *GetDataPlansResponse {
	this := GetDataPlansResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *GetDataPlansResponse) GetEntity() []PurchaseDataResponseEntityInner {
	if o == nil || isNil(o.Entity) {
		var ret []PurchaseDataResponseEntityInner
		return ret
	}
	return o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetDataPlansResponse) GetEntityOk() ([]PurchaseDataResponseEntityInner, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *GetDataPlansResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given []PurchaseDataResponseEntityInner and assigns it to the Entity field.
func (o *GetDataPlansResponse) SetEntity(v []PurchaseDataResponseEntityInner) {
	o.Entity = v
}

func (o GetDataPlansResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableGetDataPlansResponse struct {
	value *GetDataPlansResponse
	isSet bool
}

func (v NullableGetDataPlansResponse) Get() *GetDataPlansResponse {
	return v.value
}

func (v *NullableGetDataPlansResponse) Set(val *GetDataPlansResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetDataPlansResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetDataPlansResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetDataPlansResponse(val *GetDataPlansResponse) *NullableGetDataPlansResponse {
	return &NullableGetDataPlansResponse{value: val, isSet: true}
}

func (v NullableGetDataPlansResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetDataPlansResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

