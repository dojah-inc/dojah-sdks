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

// VerifyPhotoIdWithSelfieResponseEntity struct for VerifyPhotoIdWithSelfieResponseEntity
type VerifyPhotoIdWithSelfieResponseEntity struct {
	Selfie *VerifyPhotoIdWithSelfieResponseEntitySelfie `json:"selfie,omitempty"`
}

// NewVerifyPhotoIdWithSelfieResponseEntity instantiates a new VerifyPhotoIdWithSelfieResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVerifyPhotoIdWithSelfieResponseEntity() *VerifyPhotoIdWithSelfieResponseEntity {
	this := VerifyPhotoIdWithSelfieResponseEntity{}
	return &this
}

// NewVerifyPhotoIdWithSelfieResponseEntityWithDefaults instantiates a new VerifyPhotoIdWithSelfieResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVerifyPhotoIdWithSelfieResponseEntityWithDefaults() *VerifyPhotoIdWithSelfieResponseEntity {
	this := VerifyPhotoIdWithSelfieResponseEntity{}
	return &this
}

// GetSelfie returns the Selfie field value if set, zero value otherwise.
func (o *VerifyPhotoIdWithSelfieResponseEntity) GetSelfie() VerifyPhotoIdWithSelfieResponseEntitySelfie {
	if o == nil || isNil(o.Selfie) {
		var ret VerifyPhotoIdWithSelfieResponseEntitySelfie
		return ret
	}
	return *o.Selfie
}

// GetSelfieOk returns a tuple with the Selfie field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyPhotoIdWithSelfieResponseEntity) GetSelfieOk() (*VerifyPhotoIdWithSelfieResponseEntitySelfie, bool) {
	if o == nil || isNil(o.Selfie) {
    return nil, false
	}
	return o.Selfie, true
}

// HasSelfie returns a boolean if a field has been set.
func (o *VerifyPhotoIdWithSelfieResponseEntity) HasSelfie() bool {
	if o != nil && !isNil(o.Selfie) {
		return true
	}

	return false
}

// SetSelfie gets a reference to the given VerifyPhotoIdWithSelfieResponseEntitySelfie and assigns it to the Selfie field.
func (o *VerifyPhotoIdWithSelfieResponseEntity) SetSelfie(v VerifyPhotoIdWithSelfieResponseEntitySelfie) {
	o.Selfie = &v
}

func (o VerifyPhotoIdWithSelfieResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Selfie) {
		toSerialize["selfie"] = o.Selfie
	}
	return json.Marshal(toSerialize)
}

type NullableVerifyPhotoIdWithSelfieResponseEntity struct {
	value *VerifyPhotoIdWithSelfieResponseEntity
	isSet bool
}

func (v NullableVerifyPhotoIdWithSelfieResponseEntity) Get() *VerifyPhotoIdWithSelfieResponseEntity {
	return v.value
}

func (v *NullableVerifyPhotoIdWithSelfieResponseEntity) Set(val *VerifyPhotoIdWithSelfieResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableVerifyPhotoIdWithSelfieResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableVerifyPhotoIdWithSelfieResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVerifyPhotoIdWithSelfieResponseEntity(val *VerifyPhotoIdWithSelfieResponseEntity) *NullableVerifyPhotoIdWithSelfieResponseEntity {
	return &NullableVerifyPhotoIdWithSelfieResponseEntity{value: val, isSet: true}
}

func (v NullableVerifyPhotoIdWithSelfieResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVerifyPhotoIdWithSelfieResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


