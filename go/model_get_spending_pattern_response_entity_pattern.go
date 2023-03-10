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

// GetSpendingPatternResponseEntityPattern struct for GetSpendingPatternResponseEntityPattern
type GetSpendingPatternResponseEntityPattern struct {
	Others *GetSpendingPatternResponseEntityPatternOthers `json:"Others,omitempty"`
	Food *GetSpendingPatternResponseEntityPatternFood `json:"Food,omitempty"`
	AirtimeData *GetSpendingPatternResponseEntityPatternAirtimeData `json:"Airtime/Data,omitempty"`
	BankTransfer *GetSpendingPatternResponseEntityPatternBankTransfer `json:"Bank Transfer,omitempty"`
	Charges *GetSpendingPatternResponseEntityPatternCharges `json:"Charges,omitempty"`
}

// NewGetSpendingPatternResponseEntityPattern instantiates a new GetSpendingPatternResponseEntityPattern object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetSpendingPatternResponseEntityPattern() *GetSpendingPatternResponseEntityPattern {
	this := GetSpendingPatternResponseEntityPattern{}
	return &this
}

// NewGetSpendingPatternResponseEntityPatternWithDefaults instantiates a new GetSpendingPatternResponseEntityPattern object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetSpendingPatternResponseEntityPatternWithDefaults() *GetSpendingPatternResponseEntityPattern {
	this := GetSpendingPatternResponseEntityPattern{}
	return &this
}

// GetOthers returns the Others field value if set, zero value otherwise.
func (o *GetSpendingPatternResponseEntityPattern) GetOthers() GetSpendingPatternResponseEntityPatternOthers {
	if o == nil || isNil(o.Others) {
		var ret GetSpendingPatternResponseEntityPatternOthers
		return ret
	}
	return *o.Others
}

// GetOthersOk returns a tuple with the Others field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSpendingPatternResponseEntityPattern) GetOthersOk() (*GetSpendingPatternResponseEntityPatternOthers, bool) {
	if o == nil || isNil(o.Others) {
    return nil, false
	}
	return o.Others, true
}

// HasOthers returns a boolean if a field has been set.
func (o *GetSpendingPatternResponseEntityPattern) HasOthers() bool {
	if o != nil && !isNil(o.Others) {
		return true
	}

	return false
}

// SetOthers gets a reference to the given GetSpendingPatternResponseEntityPatternOthers and assigns it to the Others field.
func (o *GetSpendingPatternResponseEntityPattern) SetOthers(v GetSpendingPatternResponseEntityPatternOthers) {
	o.Others = &v
}

// GetFood returns the Food field value if set, zero value otherwise.
func (o *GetSpendingPatternResponseEntityPattern) GetFood() GetSpendingPatternResponseEntityPatternFood {
	if o == nil || isNil(o.Food) {
		var ret GetSpendingPatternResponseEntityPatternFood
		return ret
	}
	return *o.Food
}

// GetFoodOk returns a tuple with the Food field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSpendingPatternResponseEntityPattern) GetFoodOk() (*GetSpendingPatternResponseEntityPatternFood, bool) {
	if o == nil || isNil(o.Food) {
    return nil, false
	}
	return o.Food, true
}

// HasFood returns a boolean if a field has been set.
func (o *GetSpendingPatternResponseEntityPattern) HasFood() bool {
	if o != nil && !isNil(o.Food) {
		return true
	}

	return false
}

// SetFood gets a reference to the given GetSpendingPatternResponseEntityPatternFood and assigns it to the Food field.
func (o *GetSpendingPatternResponseEntityPattern) SetFood(v GetSpendingPatternResponseEntityPatternFood) {
	o.Food = &v
}

// GetAirtimeData returns the AirtimeData field value if set, zero value otherwise.
func (o *GetSpendingPatternResponseEntityPattern) GetAirtimeData() GetSpendingPatternResponseEntityPatternAirtimeData {
	if o == nil || isNil(o.AirtimeData) {
		var ret GetSpendingPatternResponseEntityPatternAirtimeData
		return ret
	}
	return *o.AirtimeData
}

// GetAirtimeDataOk returns a tuple with the AirtimeData field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSpendingPatternResponseEntityPattern) GetAirtimeDataOk() (*GetSpendingPatternResponseEntityPatternAirtimeData, bool) {
	if o == nil || isNil(o.AirtimeData) {
    return nil, false
	}
	return o.AirtimeData, true
}

// HasAirtimeData returns a boolean if a field has been set.
func (o *GetSpendingPatternResponseEntityPattern) HasAirtimeData() bool {
	if o != nil && !isNil(o.AirtimeData) {
		return true
	}

	return false
}

// SetAirtimeData gets a reference to the given GetSpendingPatternResponseEntityPatternAirtimeData and assigns it to the AirtimeData field.
func (o *GetSpendingPatternResponseEntityPattern) SetAirtimeData(v GetSpendingPatternResponseEntityPatternAirtimeData) {
	o.AirtimeData = &v
}

// GetBankTransfer returns the BankTransfer field value if set, zero value otherwise.
func (o *GetSpendingPatternResponseEntityPattern) GetBankTransfer() GetSpendingPatternResponseEntityPatternBankTransfer {
	if o == nil || isNil(o.BankTransfer) {
		var ret GetSpendingPatternResponseEntityPatternBankTransfer
		return ret
	}
	return *o.BankTransfer
}

// GetBankTransferOk returns a tuple with the BankTransfer field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSpendingPatternResponseEntityPattern) GetBankTransferOk() (*GetSpendingPatternResponseEntityPatternBankTransfer, bool) {
	if o == nil || isNil(o.BankTransfer) {
    return nil, false
	}
	return o.BankTransfer, true
}

// HasBankTransfer returns a boolean if a field has been set.
func (o *GetSpendingPatternResponseEntityPattern) HasBankTransfer() bool {
	if o != nil && !isNil(o.BankTransfer) {
		return true
	}

	return false
}

// SetBankTransfer gets a reference to the given GetSpendingPatternResponseEntityPatternBankTransfer and assigns it to the BankTransfer field.
func (o *GetSpendingPatternResponseEntityPattern) SetBankTransfer(v GetSpendingPatternResponseEntityPatternBankTransfer) {
	o.BankTransfer = &v
}

// GetCharges returns the Charges field value if set, zero value otherwise.
func (o *GetSpendingPatternResponseEntityPattern) GetCharges() GetSpendingPatternResponseEntityPatternCharges {
	if o == nil || isNil(o.Charges) {
		var ret GetSpendingPatternResponseEntityPatternCharges
		return ret
	}
	return *o.Charges
}

// GetChargesOk returns a tuple with the Charges field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetSpendingPatternResponseEntityPattern) GetChargesOk() (*GetSpendingPatternResponseEntityPatternCharges, bool) {
	if o == nil || isNil(o.Charges) {
    return nil, false
	}
	return o.Charges, true
}

// HasCharges returns a boolean if a field has been set.
func (o *GetSpendingPatternResponseEntityPattern) HasCharges() bool {
	if o != nil && !isNil(o.Charges) {
		return true
	}

	return false
}

// SetCharges gets a reference to the given GetSpendingPatternResponseEntityPatternCharges and assigns it to the Charges field.
func (o *GetSpendingPatternResponseEntityPattern) SetCharges(v GetSpendingPatternResponseEntityPatternCharges) {
	o.Charges = &v
}

func (o GetSpendingPatternResponseEntityPattern) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Others) {
		toSerialize["Others"] = o.Others
	}
	if !isNil(o.Food) {
		toSerialize["Food"] = o.Food
	}
	if !isNil(o.AirtimeData) {
		toSerialize["Airtime/Data"] = o.AirtimeData
	}
	if !isNil(o.BankTransfer) {
		toSerialize["Bank Transfer"] = o.BankTransfer
	}
	if !isNil(o.Charges) {
		toSerialize["Charges"] = o.Charges
	}
	return json.Marshal(toSerialize)
}

type NullableGetSpendingPatternResponseEntityPattern struct {
	value *GetSpendingPatternResponseEntityPattern
	isSet bool
}

func (v NullableGetSpendingPatternResponseEntityPattern) Get() *GetSpendingPatternResponseEntityPattern {
	return v.value
}

func (v *NullableGetSpendingPatternResponseEntityPattern) Set(val *GetSpendingPatternResponseEntityPattern) {
	v.value = val
	v.isSet = true
}

func (v NullableGetSpendingPatternResponseEntityPattern) IsSet() bool {
	return v.isSet
}

func (v *NullableGetSpendingPatternResponseEntityPattern) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetSpendingPatternResponseEntityPattern(val *GetSpendingPatternResponseEntityPattern) *NullableGetSpendingPatternResponseEntityPattern {
	return &NullableGetSpendingPatternResponseEntityPattern{value: val, isSet: true}
}

func (v NullableGetSpendingPatternResponseEntityPattern) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetSpendingPatternResponseEntityPattern) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


