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

// GetPhoneNumber404Response struct for GetPhoneNumber404Response
type GetPhoneNumber404Response struct {
	Entity *GetPhoneNumber404ResponseEntity `json:"entity,omitempty"`
}

// NewGetPhoneNumber404Response instantiates a new GetPhoneNumber404Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetPhoneNumber404Response() *GetPhoneNumber404Response {
	this := GetPhoneNumber404Response{}
	return &this
}

// NewGetPhoneNumber404ResponseWithDefaults instantiates a new GetPhoneNumber404Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetPhoneNumber404ResponseWithDefaults() *GetPhoneNumber404Response {
	this := GetPhoneNumber404Response{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *GetPhoneNumber404Response) GetEntity() GetPhoneNumber404ResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret GetPhoneNumber404ResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPhoneNumber404Response) GetEntityOk() (*GetPhoneNumber404ResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *GetPhoneNumber404Response) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given GetPhoneNumber404ResponseEntity and assigns it to the Entity field.
func (o *GetPhoneNumber404Response) SetEntity(v GetPhoneNumber404ResponseEntity) {
	o.Entity = &v
}

func (o GetPhoneNumber404Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableGetPhoneNumber404Response struct {
	value *GetPhoneNumber404Response
	isSet bool
}

func (v NullableGetPhoneNumber404Response) Get() *GetPhoneNumber404Response {
	return v.value
}

func (v *NullableGetPhoneNumber404Response) Set(val *GetPhoneNumber404Response) {
	v.value = val
	v.isSet = true
}

func (v NullableGetPhoneNumber404Response) IsSet() bool {
	return v.isSet
}

func (v *NullableGetPhoneNumber404Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetPhoneNumber404Response(val *GetPhoneNumber404Response) *NullableGetPhoneNumber404Response {
	return &NullableGetPhoneNumber404Response{value: val, isSet: true}
}

func (v NullableGetPhoneNumber404Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetPhoneNumber404Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


