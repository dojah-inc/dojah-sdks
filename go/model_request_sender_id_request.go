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

// RequestSenderIdRequest struct for RequestSenderIdRequest
type RequestSenderIdRequest struct {
	SenderId *string `json:"sender_id,omitempty"`
}

// NewRequestSenderIdRequest instantiates a new RequestSenderIdRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestSenderIdRequest() *RequestSenderIdRequest {
	this := RequestSenderIdRequest{}
	return &this
}

// NewRequestSenderIdRequestWithDefaults instantiates a new RequestSenderIdRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestSenderIdRequestWithDefaults() *RequestSenderIdRequest {
	this := RequestSenderIdRequest{}
	return &this
}

// GetSenderId returns the SenderId field value if set, zero value otherwise.
func (o *RequestSenderIdRequest) GetSenderId() string {
	if o == nil || isNil(o.SenderId) {
		var ret string
		return ret
	}
	return *o.SenderId
}

// GetSenderIdOk returns a tuple with the SenderId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestSenderIdRequest) GetSenderIdOk() (*string, bool) {
	if o == nil || isNil(o.SenderId) {
    return nil, false
	}
	return o.SenderId, true
}

// HasSenderId returns a boolean if a field has been set.
func (o *RequestSenderIdRequest) HasSenderId() bool {
	if o != nil && !isNil(o.SenderId) {
		return true
	}

	return false
}

// SetSenderId gets a reference to the given string and assigns it to the SenderId field.
func (o *RequestSenderIdRequest) SetSenderId(v string) {
	o.SenderId = &v
}

func (o RequestSenderIdRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.SenderId) {
		toSerialize["sender_id"] = o.SenderId
	}
	return json.Marshal(toSerialize)
}

type NullableRequestSenderIdRequest struct {
	value *RequestSenderIdRequest
	isSet bool
}

func (v NullableRequestSenderIdRequest) Get() *RequestSenderIdRequest {
	return v.value
}

func (v *NullableRequestSenderIdRequest) Set(val *RequestSenderIdRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestSenderIdRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestSenderIdRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestSenderIdRequest(val *RequestSenderIdRequest) *NullableRequestSenderIdRequest {
	return &NullableRequestSenderIdRequest{value: val, isSet: true}
}

func (v NullableRequestSenderIdRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestSenderIdRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


