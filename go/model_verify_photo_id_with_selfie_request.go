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

// VerifyPhotoIdWithSelfieRequest struct for VerifyPhotoIdWithSelfieRequest
type VerifyPhotoIdWithSelfieRequest struct {
	SelfieImage *string `json:"selfie_image,omitempty"`
	PhotoidImage *string `json:"photoid_image,omitempty"`
}

// NewVerifyPhotoIdWithSelfieRequest instantiates a new VerifyPhotoIdWithSelfieRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVerifyPhotoIdWithSelfieRequest() *VerifyPhotoIdWithSelfieRequest {
	this := VerifyPhotoIdWithSelfieRequest{}
	return &this
}

// NewVerifyPhotoIdWithSelfieRequestWithDefaults instantiates a new VerifyPhotoIdWithSelfieRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVerifyPhotoIdWithSelfieRequestWithDefaults() *VerifyPhotoIdWithSelfieRequest {
	this := VerifyPhotoIdWithSelfieRequest{}
	return &this
}

// GetSelfieImage returns the SelfieImage field value if set, zero value otherwise.
func (o *VerifyPhotoIdWithSelfieRequest) GetSelfieImage() string {
	if o == nil || isNil(o.SelfieImage) {
		var ret string
		return ret
	}
	return *o.SelfieImage
}

// GetSelfieImageOk returns a tuple with the SelfieImage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyPhotoIdWithSelfieRequest) GetSelfieImageOk() (*string, bool) {
	if o == nil || isNil(o.SelfieImage) {
    return nil, false
	}
	return o.SelfieImage, true
}

// HasSelfieImage returns a boolean if a field has been set.
func (o *VerifyPhotoIdWithSelfieRequest) HasSelfieImage() bool {
	if o != nil && !isNil(o.SelfieImage) {
		return true
	}

	return false
}

// SetSelfieImage gets a reference to the given string and assigns it to the SelfieImage field.
func (o *VerifyPhotoIdWithSelfieRequest) SetSelfieImage(v string) {
	o.SelfieImage = &v
}

// GetPhotoidImage returns the PhotoidImage field value if set, zero value otherwise.
func (o *VerifyPhotoIdWithSelfieRequest) GetPhotoidImage() string {
	if o == nil || isNil(o.PhotoidImage) {
		var ret string
		return ret
	}
	return *o.PhotoidImage
}

// GetPhotoidImageOk returns a tuple with the PhotoidImage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyPhotoIdWithSelfieRequest) GetPhotoidImageOk() (*string, bool) {
	if o == nil || isNil(o.PhotoidImage) {
    return nil, false
	}
	return o.PhotoidImage, true
}

// HasPhotoidImage returns a boolean if a field has been set.
func (o *VerifyPhotoIdWithSelfieRequest) HasPhotoidImage() bool {
	if o != nil && !isNil(o.PhotoidImage) {
		return true
	}

	return false
}

// SetPhotoidImage gets a reference to the given string and assigns it to the PhotoidImage field.
func (o *VerifyPhotoIdWithSelfieRequest) SetPhotoidImage(v string) {
	o.PhotoidImage = &v
}

func (o VerifyPhotoIdWithSelfieRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.SelfieImage) {
		toSerialize["selfie_image"] = o.SelfieImage
	}
	if !isNil(o.PhotoidImage) {
		toSerialize["photoid_image"] = o.PhotoidImage
	}
	return json.Marshal(toSerialize)
}

type NullableVerifyPhotoIdWithSelfieRequest struct {
	value *VerifyPhotoIdWithSelfieRequest
	isSet bool
}

func (v NullableVerifyPhotoIdWithSelfieRequest) Get() *VerifyPhotoIdWithSelfieRequest {
	return v.value
}

func (v *NullableVerifyPhotoIdWithSelfieRequest) Set(val *VerifyPhotoIdWithSelfieRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableVerifyPhotoIdWithSelfieRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableVerifyPhotoIdWithSelfieRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVerifyPhotoIdWithSelfieRequest(val *VerifyPhotoIdWithSelfieRequest) *NullableVerifyPhotoIdWithSelfieRequest {
	return &NullableVerifyPhotoIdWithSelfieRequest{value: val, isSet: true}
}

func (v NullableVerifyPhotoIdWithSelfieRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVerifyPhotoIdWithSelfieRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


