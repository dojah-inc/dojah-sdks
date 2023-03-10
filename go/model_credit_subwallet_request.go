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

// CreditSubwalletRequest struct for CreditSubwalletRequest
type CreditSubwalletRequest struct {
	Amount *string `json:"amount,omitempty"`
	WalletId *string `json:"wallet_id,omitempty"`
}

// NewCreditSubwalletRequest instantiates a new CreditSubwalletRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreditSubwalletRequest() *CreditSubwalletRequest {
	this := CreditSubwalletRequest{}
	return &this
}

// NewCreditSubwalletRequestWithDefaults instantiates a new CreditSubwalletRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreditSubwalletRequestWithDefaults() *CreditSubwalletRequest {
	this := CreditSubwalletRequest{}
	return &this
}

// GetAmount returns the Amount field value if set, zero value otherwise.
func (o *CreditSubwalletRequest) GetAmount() string {
	if o == nil || isNil(o.Amount) {
		var ret string
		return ret
	}
	return *o.Amount
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreditSubwalletRequest) GetAmountOk() (*string, bool) {
	if o == nil || isNil(o.Amount) {
    return nil, false
	}
	return o.Amount, true
}

// HasAmount returns a boolean if a field has been set.
func (o *CreditSubwalletRequest) HasAmount() bool {
	if o != nil && !isNil(o.Amount) {
		return true
	}

	return false
}

// SetAmount gets a reference to the given string and assigns it to the Amount field.
func (o *CreditSubwalletRequest) SetAmount(v string) {
	o.Amount = &v
}

// GetWalletId returns the WalletId field value if set, zero value otherwise.
func (o *CreditSubwalletRequest) GetWalletId() string {
	if o == nil || isNil(o.WalletId) {
		var ret string
		return ret
	}
	return *o.WalletId
}

// GetWalletIdOk returns a tuple with the WalletId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreditSubwalletRequest) GetWalletIdOk() (*string, bool) {
	if o == nil || isNil(o.WalletId) {
    return nil, false
	}
	return o.WalletId, true
}

// HasWalletId returns a boolean if a field has been set.
func (o *CreditSubwalletRequest) HasWalletId() bool {
	if o != nil && !isNil(o.WalletId) {
		return true
	}

	return false
}

// SetWalletId gets a reference to the given string and assigns it to the WalletId field.
func (o *CreditSubwalletRequest) SetWalletId(v string) {
	o.WalletId = &v
}

func (o CreditSubwalletRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Amount) {
		toSerialize["amount"] = o.Amount
	}
	if !isNil(o.WalletId) {
		toSerialize["wallet_id"] = o.WalletId
	}
	return json.Marshal(toSerialize)
}

type NullableCreditSubwalletRequest struct {
	value *CreditSubwalletRequest
	isSet bool
}

func (v NullableCreditSubwalletRequest) Get() *CreditSubwalletRequest {
	return v.value
}

func (v *NullableCreditSubwalletRequest) Set(val *CreditSubwalletRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreditSubwalletRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreditSubwalletRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreditSubwalletRequest(val *CreditSubwalletRequest) *NullableCreditSubwalletRequest {
	return &NullableCreditSubwalletRequest{value: val, isSet: true}
}

func (v NullableCreditSubwalletRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreditSubwalletRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

