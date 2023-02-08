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

// GetOcrTextRequest struct for GetOcrTextRequest
type GetOcrTextRequest struct {
	Image *string `json:"image,omitempty"`
}

// NewGetOcrTextRequest instantiates a new GetOcrTextRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetOcrTextRequest() *GetOcrTextRequest {
	this := GetOcrTextRequest{}
	return &this
}

// NewGetOcrTextRequestWithDefaults instantiates a new GetOcrTextRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetOcrTextRequestWithDefaults() *GetOcrTextRequest {
	this := GetOcrTextRequest{}
	return &this
}

// GetImage returns the Image field value if set, zero value otherwise.
func (o *GetOcrTextRequest) GetImage() string {
	if o == nil || isNil(o.Image) {
		var ret string
		return ret
	}
	return *o.Image
}

// GetImageOk returns a tuple with the Image field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetOcrTextRequest) GetImageOk() (*string, bool) {
	if o == nil || isNil(o.Image) {
    return nil, false
	}
	return o.Image, true
}

// HasImage returns a boolean if a field has been set.
func (o *GetOcrTextRequest) HasImage() bool {
	if o != nil && !isNil(o.Image) {
		return true
	}

	return false
}

// SetImage gets a reference to the given string and assigns it to the Image field.
func (o *GetOcrTextRequest) SetImage(v string) {
	o.Image = &v
}

func (o GetOcrTextRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Image) {
		toSerialize["image"] = o.Image
	}
	return json.Marshal(toSerialize)
}

type NullableGetOcrTextRequest struct {
	value *GetOcrTextRequest
	isSet bool
}

func (v NullableGetOcrTextRequest) Get() *GetOcrTextRequest {
	return v.value
}

func (v *NullableGetOcrTextRequest) Set(val *GetOcrTextRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableGetOcrTextRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableGetOcrTextRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetOcrTextRequest(val *GetOcrTextRequest) *NullableGetOcrTextRequest {
	return &NullableGetOcrTextRequest{value: val, isSet: true}
}

func (v NullableGetOcrTextRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetOcrTextRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


