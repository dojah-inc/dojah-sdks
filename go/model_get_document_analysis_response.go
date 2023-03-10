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

// GetDocumentAnalysisResponse struct for GetDocumentAnalysisResponse
type GetDocumentAnalysisResponse struct {
	Entity *GetDocumentAnalysisResponseEntity `json:"entity,omitempty"`
}

// NewGetDocumentAnalysisResponse instantiates a new GetDocumentAnalysisResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetDocumentAnalysisResponse() *GetDocumentAnalysisResponse {
	this := GetDocumentAnalysisResponse{}
	return &this
}

// NewGetDocumentAnalysisResponseWithDefaults instantiates a new GetDocumentAnalysisResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetDocumentAnalysisResponseWithDefaults() *GetDocumentAnalysisResponse {
	this := GetDocumentAnalysisResponse{}
	return &this
}

// GetEntity returns the Entity field value if set, zero value otherwise.
func (o *GetDocumentAnalysisResponse) GetEntity() GetDocumentAnalysisResponseEntity {
	if o == nil || isNil(o.Entity) {
		var ret GetDocumentAnalysisResponseEntity
		return ret
	}
	return *o.Entity
}

// GetEntityOk returns a tuple with the Entity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetDocumentAnalysisResponse) GetEntityOk() (*GetDocumentAnalysisResponseEntity, bool) {
	if o == nil || isNil(o.Entity) {
    return nil, false
	}
	return o.Entity, true
}

// HasEntity returns a boolean if a field has been set.
func (o *GetDocumentAnalysisResponse) HasEntity() bool {
	if o != nil && !isNil(o.Entity) {
		return true
	}

	return false
}

// SetEntity gets a reference to the given GetDocumentAnalysisResponseEntity and assigns it to the Entity field.
func (o *GetDocumentAnalysisResponse) SetEntity(v GetDocumentAnalysisResponseEntity) {
	o.Entity = &v
}

func (o GetDocumentAnalysisResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Entity) {
		toSerialize["entity"] = o.Entity
	}
	return json.Marshal(toSerialize)
}

type NullableGetDocumentAnalysisResponse struct {
	value *GetDocumentAnalysisResponse
	isSet bool
}

func (v NullableGetDocumentAnalysisResponse) Get() *GetDocumentAnalysisResponse {
	return v.value
}

func (v *NullableGetDocumentAnalysisResponse) Set(val *GetDocumentAnalysisResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetDocumentAnalysisResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetDocumentAnalysisResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetDocumentAnalysisResponse(val *GetDocumentAnalysisResponse) *NullableGetDocumentAnalysisResponse {
	return &NullableGetDocumentAnalysisResponse{value: val, isSet: true}
}

func (v NullableGetDocumentAnalysisResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetDocumentAnalysisResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

