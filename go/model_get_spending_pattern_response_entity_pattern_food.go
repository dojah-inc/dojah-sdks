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

// GetSpendingPatternResponseEntityPatternFood struct for GetSpendingPatternResponseEntityPatternFood
type GetSpendingPatternResponseEntityPatternFood struct {
	Sum *float32 `json:"sum,omitempty"`
	Count *float32 `json:"count,omitempty"`
	Percentage *float32 `json:"percentage,omitempty"`
}

// NewGetSpendingPatternResponseEntityPatternFood instantiates a new GetSpendingPatternResponseEntityPatternFood object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetSpendingPatternResponseEntityPatternFood() *GetSpendingPatternResponseEntityPatternFood {
	this := GetSpendingPatternResponseEntityPatternFood{}
	return &this
}

// NewGetSpendingPatternResponseEntityPatternFoodWithDefaults instantiates a new GetSpendingPatternResponseEntityPatternFood object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetSpendingPatternResponseEntityPatternFoodWithDefaults() *GetSpendingPatternResponseEntityPatternFood {
	this := GetSpendingPatternResponseEntityPatternFood{}
	return &this
}

// GetSum returns the Sum field value if set, zero value otherwise.
func (o *GetSpendingPatternResponseEntityPatternFood) GetSum() float32 {
	if o == nil || isNil(o.Sum) {
		var ret float32
		return ret
	}
	return *o.Sum
}

// GetSumOk returns a tuple with the Sum field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSpendingPatternResponseEntityPatternFood) GetSumOk() (*float32, bool) {
	if o == nil || isNil(o.Sum) {
    return nil, false
	}
	return o.Sum, true
}

// HasSum returns a boolean if a field has been set.
func (o *GetSpendingPatternResponseEntityPatternFood) HasSum() bool {
	if o != nil && !isNil(o.Sum) {
		return true
	}

	return false
}

// SetSum gets a reference to the given float32 and assigns it to the Sum field.
func (o *GetSpendingPatternResponseEntityPatternFood) SetSum(v float32) {
	o.Sum = &v
}

// GetCount returns the Count field value if set, zero value otherwise.
func (o *GetSpendingPatternResponseEntityPatternFood) GetCount() float32 {
	if o == nil || isNil(o.Count) {
		var ret float32
		return ret
	}
	return *o.Count
}

// GetCountOk returns a tuple with the Count field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSpendingPatternResponseEntityPatternFood) GetCountOk() (*float32, bool) {
	if o == nil || isNil(o.Count) {
    return nil, false
	}
	return o.Count, true
}

// HasCount returns a boolean if a field has been set.
func (o *GetSpendingPatternResponseEntityPatternFood) HasCount() bool {
	if o != nil && !isNil(o.Count) {
		return true
	}

	return false
}

// SetCount gets a reference to the given float32 and assigns it to the Count field.
func (o *GetSpendingPatternResponseEntityPatternFood) SetCount(v float32) {
	o.Count = &v
}

// GetPercentage returns the Percentage field value if set, zero value otherwise.
func (o *GetSpendingPatternResponseEntityPatternFood) GetPercentage() float32 {
	if o == nil || isNil(o.Percentage) {
		var ret float32
		return ret
	}
	return *o.Percentage
}

// GetPercentageOk returns a tuple with the Percentage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSpendingPatternResponseEntityPatternFood) GetPercentageOk() (*float32, bool) {
	if o == nil || isNil(o.Percentage) {
    return nil, false
	}
	return o.Percentage, true
}

// HasPercentage returns a boolean if a field has been set.
func (o *GetSpendingPatternResponseEntityPatternFood) HasPercentage() bool {
	if o != nil && !isNil(o.Percentage) {
		return true
	}

	return false
}

// SetPercentage gets a reference to the given float32 and assigns it to the Percentage field.
func (o *GetSpendingPatternResponseEntityPatternFood) SetPercentage(v float32) {
	o.Percentage = &v
}

func (o GetSpendingPatternResponseEntityPatternFood) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Sum) {
		toSerialize["sum"] = o.Sum
	}
	if !isNil(o.Count) {
		toSerialize["count"] = o.Count
	}
	if !isNil(o.Percentage) {
		toSerialize["percentage"] = o.Percentage
	}
	return json.Marshal(toSerialize)
}

type NullableGetSpendingPatternResponseEntityPatternFood struct {
	value *GetSpendingPatternResponseEntityPatternFood
	isSet bool
}

func (v NullableGetSpendingPatternResponseEntityPatternFood) Get() *GetSpendingPatternResponseEntityPatternFood {
	return v.value
}

func (v *NullableGetSpendingPatternResponseEntityPatternFood) Set(val *GetSpendingPatternResponseEntityPatternFood) {
	v.value = val
	v.isSet = true
}

func (v NullableGetSpendingPatternResponseEntityPatternFood) IsSet() bool {
	return v.isSet
}

func (v *NullableGetSpendingPatternResponseEntityPatternFood) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetSpendingPatternResponseEntityPatternFood(val *GetSpendingPatternResponseEntityPatternFood) *NullableGetSpendingPatternResponseEntityPatternFood {
	return &NullableGetSpendingPatternResponseEntityPatternFood{value: val, isSet: true}
}

func (v NullableGetSpendingPatternResponseEntityPatternFood) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetSpendingPatternResponseEntityPatternFood) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


