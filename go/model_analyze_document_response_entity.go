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

// AnalyzeDocumentResponseEntity struct for AnalyzeDocumentResponseEntity
type AnalyzeDocumentResponseEntity struct {
	DocumentImages *AnalyzeDocumentResponseEntityDocumentImages `json:"document_images,omitempty"`
	DocumentType *AnalyzeDocumentResponseEntityDocumentType `json:"document_type,omitempty"`
	Status *AnalyzeDocumentResponseEntityStatus `json:"status,omitempty"`
	TextData []AnalyzeDocumentResponseEntityTextDataInner `json:"text_data,omitempty"`
}

// NewAnalyzeDocumentResponseEntity instantiates a new AnalyzeDocumentResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAnalyzeDocumentResponseEntity() *AnalyzeDocumentResponseEntity {
	this := AnalyzeDocumentResponseEntity{}
	return &this
}

// NewAnalyzeDocumentResponseEntityWithDefaults instantiates a new AnalyzeDocumentResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAnalyzeDocumentResponseEntityWithDefaults() *AnalyzeDocumentResponseEntity {
	this := AnalyzeDocumentResponseEntity{}
	return &this
}

// GetDocumentImages returns the DocumentImages field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntity) GetDocumentImages() AnalyzeDocumentResponseEntityDocumentImages {
	if o == nil || isNil(o.DocumentImages) {
		var ret AnalyzeDocumentResponseEntityDocumentImages
		return ret
	}
	return *o.DocumentImages
}

// GetDocumentImagesOk returns a tuple with the DocumentImages field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntity) GetDocumentImagesOk() (*AnalyzeDocumentResponseEntityDocumentImages, bool) {
	if o == nil || isNil(o.DocumentImages) {
    return nil, false
	}
	return o.DocumentImages, true
}

// HasDocumentImages returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntity) HasDocumentImages() bool {
	if o != nil && !isNil(o.DocumentImages) {
		return true
	}

	return false
}

// SetDocumentImages gets a reference to the given AnalyzeDocumentResponseEntityDocumentImages and assigns it to the DocumentImages field.
func (o *AnalyzeDocumentResponseEntity) SetDocumentImages(v AnalyzeDocumentResponseEntityDocumentImages) {
	o.DocumentImages = &v
}

// GetDocumentType returns the DocumentType field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntity) GetDocumentType() AnalyzeDocumentResponseEntityDocumentType {
	if o == nil || isNil(o.DocumentType) {
		var ret AnalyzeDocumentResponseEntityDocumentType
		return ret
	}
	return *o.DocumentType
}

// GetDocumentTypeOk returns a tuple with the DocumentType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntity) GetDocumentTypeOk() (*AnalyzeDocumentResponseEntityDocumentType, bool) {
	if o == nil || isNil(o.DocumentType) {
    return nil, false
	}
	return o.DocumentType, true
}

// HasDocumentType returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntity) HasDocumentType() bool {
	if o != nil && !isNil(o.DocumentType) {
		return true
	}

	return false
}

// SetDocumentType gets a reference to the given AnalyzeDocumentResponseEntityDocumentType and assigns it to the DocumentType field.
func (o *AnalyzeDocumentResponseEntity) SetDocumentType(v AnalyzeDocumentResponseEntityDocumentType) {
	o.DocumentType = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntity) GetStatus() AnalyzeDocumentResponseEntityStatus {
	if o == nil || isNil(o.Status) {
		var ret AnalyzeDocumentResponseEntityStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntity) GetStatusOk() (*AnalyzeDocumentResponseEntityStatus, bool) {
	if o == nil || isNil(o.Status) {
    return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntity) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given AnalyzeDocumentResponseEntityStatus and assigns it to the Status field.
func (o *AnalyzeDocumentResponseEntity) SetStatus(v AnalyzeDocumentResponseEntityStatus) {
	o.Status = &v
}

// GetTextData returns the TextData field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntity) GetTextData() []AnalyzeDocumentResponseEntityTextDataInner {
	if o == nil || isNil(o.TextData) {
		var ret []AnalyzeDocumentResponseEntityTextDataInner
		return ret
	}
	return o.TextData
}

// GetTextDataOk returns a tuple with the TextData field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntity) GetTextDataOk() ([]AnalyzeDocumentResponseEntityTextDataInner, bool) {
	if o == nil || isNil(o.TextData) {
    return nil, false
	}
	return o.TextData, true
}

// HasTextData returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntity) HasTextData() bool {
	if o != nil && !isNil(o.TextData) {
		return true
	}

	return false
}

// SetTextData gets a reference to the given []AnalyzeDocumentResponseEntityTextDataInner and assigns it to the TextData field.
func (o *AnalyzeDocumentResponseEntity) SetTextData(v []AnalyzeDocumentResponseEntityTextDataInner) {
	o.TextData = v
}

func (o AnalyzeDocumentResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.DocumentImages) {
		toSerialize["document_images"] = o.DocumentImages
	}
	if !isNil(o.DocumentType) {
		toSerialize["document_type"] = o.DocumentType
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !isNil(o.TextData) {
		toSerialize["text_data"] = o.TextData
	}
	return json.Marshal(toSerialize)
}

type NullableAnalyzeDocumentResponseEntity struct {
	value *AnalyzeDocumentResponseEntity
	isSet bool
}

func (v NullableAnalyzeDocumentResponseEntity) Get() *AnalyzeDocumentResponseEntity {
	return v.value
}

func (v *NullableAnalyzeDocumentResponseEntity) Set(val *AnalyzeDocumentResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableAnalyzeDocumentResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableAnalyzeDocumentResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAnalyzeDocumentResponseEntity(val *AnalyzeDocumentResponseEntity) *NullableAnalyzeDocumentResponseEntity {
	return &NullableAnalyzeDocumentResponseEntity{value: val, isSet: true}
}

func (v NullableAnalyzeDocumentResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAnalyzeDocumentResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


