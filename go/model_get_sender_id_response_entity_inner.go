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

// GetSenderIdResponseEntityInner struct for GetSenderIdResponseEntityInner
type GetSenderIdResponseEntityInner struct {
	SenderId *string `json:"sender_id,omitempty"`
	Activated *bool `json:"activated,omitempty"`
	CreatedAt *string `json:"createdAt,omitempty"`
}

// NewGetSenderIdResponseEntityInner instantiates a new GetSenderIdResponseEntityInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetSenderIdResponseEntityInner() *GetSenderIdResponseEntityInner {
	this := GetSenderIdResponseEntityInner{}
	return &this
}

// NewGetSenderIdResponseEntityInnerWithDefaults instantiates a new GetSenderIdResponseEntityInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetSenderIdResponseEntityInnerWithDefaults() *GetSenderIdResponseEntityInner {
	this := GetSenderIdResponseEntityInner{}
	return &this
}

// GetSenderId returns the SenderId field value if set, zero value otherwise.
func (o *GetSenderIdResponseEntityInner) GetSenderId() string {
	if o == nil || isNil(o.SenderId) {
		var ret string
		return ret
	}
	return *o.SenderId
}

// GetSenderIdOk returns a tuple with the SenderId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSenderIdResponseEntityInner) GetSenderIdOk() (*string, bool) {
	if o == nil || isNil(o.SenderId) {
    return nil, false
	}
	return o.SenderId, true
}

// HasSenderId returns a boolean if a field has been set.
func (o *GetSenderIdResponseEntityInner) HasSenderId() bool {
	if o != nil && !isNil(o.SenderId) {
		return true
	}

	return false
}

// SetSenderId gets a reference to the given string and assigns it to the SenderId field.
func (o *GetSenderIdResponseEntityInner) SetSenderId(v string) {
	o.SenderId = &v
}

// GetActivated returns the Activated field value if set, zero value otherwise.
func (o *GetSenderIdResponseEntityInner) GetActivated() bool {
	if o == nil || isNil(o.Activated) {
		var ret bool
		return ret
	}
	return *o.Activated
}

// GetActivatedOk returns a tuple with the Activated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSenderIdResponseEntityInner) GetActivatedOk() (*bool, bool) {
	if o == nil || isNil(o.Activated) {
    return nil, false
	}
	return o.Activated, true
}

// HasActivated returns a boolean if a field has been set.
func (o *GetSenderIdResponseEntityInner) HasActivated() bool {
	if o != nil && !isNil(o.Activated) {
		return true
	}

	return false
}

// SetActivated gets a reference to the given bool and assigns it to the Activated field.
func (o *GetSenderIdResponseEntityInner) SetActivated(v bool) {
	o.Activated = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *GetSenderIdResponseEntityInner) GetCreatedAt() string {
	if o == nil || isNil(o.CreatedAt) {
		var ret string
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSenderIdResponseEntityInner) GetCreatedAtOk() (*string, bool) {
	if o == nil || isNil(o.CreatedAt) {
    return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *GetSenderIdResponseEntityInner) HasCreatedAt() bool {
	if o != nil && !isNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given string and assigns it to the CreatedAt field.
func (o *GetSenderIdResponseEntityInner) SetCreatedAt(v string) {
	o.CreatedAt = &v
}

func (o GetSenderIdResponseEntityInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.SenderId) {
		toSerialize["sender_id"] = o.SenderId
	}
	if !isNil(o.Activated) {
		toSerialize["activated"] = o.Activated
	}
	if !isNil(o.CreatedAt) {
		toSerialize["createdAt"] = o.CreatedAt
	}
	return json.Marshal(toSerialize)
}

type NullableGetSenderIdResponseEntityInner struct {
	value *GetSenderIdResponseEntityInner
	isSet bool
}

func (v NullableGetSenderIdResponseEntityInner) Get() *GetSenderIdResponseEntityInner {
	return v.value
}

func (v *NullableGetSenderIdResponseEntityInner) Set(val *GetSenderIdResponseEntityInner) {
	v.value = val
	v.isSet = true
}

func (v NullableGetSenderIdResponseEntityInner) IsSet() bool {
	return v.isSet
}

func (v *NullableGetSenderIdResponseEntityInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetSenderIdResponseEntityInner(val *GetSenderIdResponseEntityInner) *NullableGetSenderIdResponseEntityInner {
	return &NullableGetSenderIdResponseEntityInner{value: val, isSet: true}
}

func (v NullableGetSenderIdResponseEntityInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetSenderIdResponseEntityInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


