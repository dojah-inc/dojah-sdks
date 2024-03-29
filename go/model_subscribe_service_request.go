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

// SubscribeServiceRequest struct for SubscribeServiceRequest
type SubscribeServiceRequest struct {
	Webhook *string `json:"webhook,omitempty"`
	Service *string `json:"service,omitempty"`
}

// NewSubscribeServiceRequest instantiates a new SubscribeServiceRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSubscribeServiceRequest() *SubscribeServiceRequest {
	this := SubscribeServiceRequest{}
	return &this
}

// NewSubscribeServiceRequestWithDefaults instantiates a new SubscribeServiceRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSubscribeServiceRequestWithDefaults() *SubscribeServiceRequest {
	this := SubscribeServiceRequest{}
	return &this
}

// GetWebhook returns the Webhook field value if set, zero value otherwise.
func (o *SubscribeServiceRequest) GetWebhook() string {
	if o == nil || isNil(o.Webhook) {
		var ret string
		return ret
	}
	return *o.Webhook
}

// GetWebhookOk returns a tuple with the Webhook field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscribeServiceRequest) GetWebhookOk() (*string, bool) {
	if o == nil || isNil(o.Webhook) {
    return nil, false
	}
	return o.Webhook, true
}

// HasWebhook returns a boolean if a field has been set.
func (o *SubscribeServiceRequest) HasWebhook() bool {
	if o != nil && !isNil(o.Webhook) {
		return true
	}

	return false
}

// SetWebhook gets a reference to the given string and assigns it to the Webhook field.
func (o *SubscribeServiceRequest) SetWebhook(v string) {
	o.Webhook = &v
}

// GetService returns the Service field value if set, zero value otherwise.
func (o *SubscribeServiceRequest) GetService() string {
	if o == nil || isNil(o.Service) {
		var ret string
		return ret
	}
	return *o.Service
}

// GetServiceOk returns a tuple with the Service field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubscribeServiceRequest) GetServiceOk() (*string, bool) {
	if o == nil || isNil(o.Service) {
    return nil, false
	}
	return o.Service, true
}

// HasService returns a boolean if a field has been set.
func (o *SubscribeServiceRequest) HasService() bool {
	if o != nil && !isNil(o.Service) {
		return true
	}

	return false
}

// SetService gets a reference to the given string and assigns it to the Service field.
func (o *SubscribeServiceRequest) SetService(v string) {
	o.Service = &v
}

func (o SubscribeServiceRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Webhook) {
		toSerialize["webhook"] = o.Webhook
	}
	if !isNil(o.Service) {
		toSerialize["service"] = o.Service
	}
	return json.Marshal(toSerialize)
}

type NullableSubscribeServiceRequest struct {
	value *SubscribeServiceRequest
	isSet bool
}

func (v NullableSubscribeServiceRequest) Get() *SubscribeServiceRequest {
	return v.value
}

func (v *NullableSubscribeServiceRequest) Set(val *SubscribeServiceRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableSubscribeServiceRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableSubscribeServiceRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubscribeServiceRequest(val *SubscribeServiceRequest) *NullableSubscribeServiceRequest {
	return &NullableSubscribeServiceRequest{value: val, isSet: true}
}

func (v NullableSubscribeServiceRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubscribeServiceRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


