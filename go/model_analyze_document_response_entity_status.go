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

// AnalyzeDocumentResponseEntityStatus struct for AnalyzeDocumentResponseEntityStatus
type AnalyzeDocumentResponseEntityStatus struct {
	OverallStatus *float32 `json:"overall_status,omitempty"`
	DocumentImages *string `json:"document_images,omitempty"`
	Text *string `json:"text,omitempty"`
	DocumentType *string `json:"document_type,omitempty"`
	Expiry *string `json:"expiry,omitempty"`
}

// NewAnalyzeDocumentResponseEntityStatus instantiates a new AnalyzeDocumentResponseEntityStatus object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAnalyzeDocumentResponseEntityStatus() *AnalyzeDocumentResponseEntityStatus {
	this := AnalyzeDocumentResponseEntityStatus{}
	return &this
}

// NewAnalyzeDocumentResponseEntityStatusWithDefaults instantiates a new AnalyzeDocumentResponseEntityStatus object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAnalyzeDocumentResponseEntityStatusWithDefaults() *AnalyzeDocumentResponseEntityStatus {
	this := AnalyzeDocumentResponseEntityStatus{}
	return &this
}

// GetOverallStatus returns the OverallStatus field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntityStatus) GetOverallStatus() float32 {
	if o == nil || isNil(o.OverallStatus) {
		var ret float32
		return ret
	}
	return *o.OverallStatus
}

// GetOverallStatusOk returns a tuple with the OverallStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntityStatus) GetOverallStatusOk() (*float32, bool) {
	if o == nil || isNil(o.OverallStatus) {
    return nil, false
	}
	return o.OverallStatus, true
}

// HasOverallStatus returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntityStatus) HasOverallStatus() bool {
	if o != nil && !isNil(o.OverallStatus) {
		return true
	}

	return false
}

// SetOverallStatus gets a reference to the given float32 and assigns it to the OverallStatus field.
func (o *AnalyzeDocumentResponseEntityStatus) SetOverallStatus(v float32) {
	o.OverallStatus = &v
}

// GetDocumentImages returns the DocumentImages field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntityStatus) GetDocumentImages() string {
	if o == nil || isNil(o.DocumentImages) {
		var ret string
		return ret
	}
	return *o.DocumentImages
}

// GetDocumentImagesOk returns a tuple with the DocumentImages field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntityStatus) GetDocumentImagesOk() (*string, bool) {
	if o == nil || isNil(o.DocumentImages) {
    return nil, false
	}
	return o.DocumentImages, true
}

// HasDocumentImages returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntityStatus) HasDocumentImages() bool {
	if o != nil && !isNil(o.DocumentImages) {
		return true
	}

	return false
}

// SetDocumentImages gets a reference to the given string and assigns it to the DocumentImages field.
func (o *AnalyzeDocumentResponseEntityStatus) SetDocumentImages(v string) {
	o.DocumentImages = &v
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntityStatus) GetText() string {
	if o == nil || isNil(o.Text) {
		var ret string
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntityStatus) GetTextOk() (*string, bool) {
	if o == nil || isNil(o.Text) {
    return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntityStatus) HasText() bool {
	if o != nil && !isNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given string and assigns it to the Text field.
func (o *AnalyzeDocumentResponseEntityStatus) SetText(v string) {
	o.Text = &v
}

// GetDocumentType returns the DocumentType field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntityStatus) GetDocumentType() string {
	if o == nil || isNil(o.DocumentType) {
		var ret string
		return ret
	}
	return *o.DocumentType
}

// GetDocumentTypeOk returns a tuple with the DocumentType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntityStatus) GetDocumentTypeOk() (*string, bool) {
	if o == nil || isNil(o.DocumentType) {
    return nil, false
	}
	return o.DocumentType, true
}

// HasDocumentType returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntityStatus) HasDocumentType() bool {
	if o != nil && !isNil(o.DocumentType) {
		return true
	}

	return false
}

// SetDocumentType gets a reference to the given string and assigns it to the DocumentType field.
func (o *AnalyzeDocumentResponseEntityStatus) SetDocumentType(v string) {
	o.DocumentType = &v
}

// GetExpiry returns the Expiry field value if set, zero value otherwise.
func (o *AnalyzeDocumentResponseEntityStatus) GetExpiry() string {
	if o == nil || isNil(o.Expiry) {
		var ret string
		return ret
	}
	return *o.Expiry
}

// GetExpiryOk returns a tuple with the Expiry field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyzeDocumentResponseEntityStatus) GetExpiryOk() (*string, bool) {
	if o == nil || isNil(o.Expiry) {
    return nil, false
	}
	return o.Expiry, true
}

// HasExpiry returns a boolean if a field has been set.
func (o *AnalyzeDocumentResponseEntityStatus) HasExpiry() bool {
	if o != nil && !isNil(o.Expiry) {
		return true
	}

	return false
}

// SetExpiry gets a reference to the given string and assigns it to the Expiry field.
func (o *AnalyzeDocumentResponseEntityStatus) SetExpiry(v string) {
	o.Expiry = &v
}

func (o AnalyzeDocumentResponseEntityStatus) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.OverallStatus) {
		toSerialize["overall_status"] = o.OverallStatus
	}
	if !isNil(o.DocumentImages) {
		toSerialize["document_images"] = o.DocumentImages
	}
	if !isNil(o.Text) {
		toSerialize["text"] = o.Text
	}
	if !isNil(o.DocumentType) {
		toSerialize["document_type"] = o.DocumentType
	}
	if !isNil(o.Expiry) {
		toSerialize["expiry"] = o.Expiry
	}
	return json.Marshal(toSerialize)
}

type NullableAnalyzeDocumentResponseEntityStatus struct {
	value *AnalyzeDocumentResponseEntityStatus
	isSet bool
}

func (v NullableAnalyzeDocumentResponseEntityStatus) Get() *AnalyzeDocumentResponseEntityStatus {
	return v.value
}

func (v *NullableAnalyzeDocumentResponseEntityStatus) Set(val *AnalyzeDocumentResponseEntityStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableAnalyzeDocumentResponseEntityStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableAnalyzeDocumentResponseEntityStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAnalyzeDocumentResponseEntityStatus(val *AnalyzeDocumentResponseEntityStatus) *NullableAnalyzeDocumentResponseEntityStatus {
	return &NullableAnalyzeDocumentResponseEntityStatus{value: val, isSet: true}
}

func (v NullableAnalyzeDocumentResponseEntityStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAnalyzeDocumentResponseEntityStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

