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

// GetTransactionResponseEntity struct for GetTransactionResponseEntity
type GetTransactionResponseEntity struct {
	WalletId *string `json:"wallet_id,omitempty"`
	TransactionAmount *float32 `json:"transaction_amount,omitempty"`
	TransactionType *string `json:"transaction_type,omitempty"`
	RecipientAccountNumber *string `json:"recipient_account_number,omitempty"`
	SenderAccountNumber *string `json:"sender_account_number,omitempty"`
	TransactionRemarks *string `json:"transaction_remarks,omitempty"`
	TransactionReason NullableString `json:"transaction_reason,omitempty"`
	TransactionId *string `json:"transaction_id,omitempty"`
	TransactionStatus *string `json:"transaction_status,omitempty"`
	DateCreated *string `json:"date_created,omitempty"`
}

// NewGetTransactionResponseEntity instantiates a new GetTransactionResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetTransactionResponseEntity() *GetTransactionResponseEntity {
	this := GetTransactionResponseEntity{}
	return &this
}

// NewGetTransactionResponseEntityWithDefaults instantiates a new GetTransactionResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetTransactionResponseEntityWithDefaults() *GetTransactionResponseEntity {
	this := GetTransactionResponseEntity{}
	return &this
}

// GetWalletId returns the WalletId field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetWalletId() string {
	if o == nil || isNil(o.WalletId) {
		var ret string
		return ret
	}
	return *o.WalletId
}

// GetWalletIdOk returns a tuple with the WalletId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetWalletIdOk() (*string, bool) {
	if o == nil || isNil(o.WalletId) {
    return nil, false
	}
	return o.WalletId, true
}

// HasWalletId returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasWalletId() bool {
	if o != nil && !isNil(o.WalletId) {
		return true
	}

	return false
}

// SetWalletId gets a reference to the given string and assigns it to the WalletId field.
func (o *GetTransactionResponseEntity) SetWalletId(v string) {
	o.WalletId = &v
}

// GetTransactionAmount returns the TransactionAmount field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetTransactionAmount() float32 {
	if o == nil || isNil(o.TransactionAmount) {
		var ret float32
		return ret
	}
	return *o.TransactionAmount
}

// GetTransactionAmountOk returns a tuple with the TransactionAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetTransactionAmountOk() (*float32, bool) {
	if o == nil || isNil(o.TransactionAmount) {
    return nil, false
	}
	return o.TransactionAmount, true
}

// HasTransactionAmount returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasTransactionAmount() bool {
	if o != nil && !isNil(o.TransactionAmount) {
		return true
	}

	return false
}

// SetTransactionAmount gets a reference to the given float32 and assigns it to the TransactionAmount field.
func (o *GetTransactionResponseEntity) SetTransactionAmount(v float32) {
	o.TransactionAmount = &v
}

// GetTransactionType returns the TransactionType field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetTransactionType() string {
	if o == nil || isNil(o.TransactionType) {
		var ret string
		return ret
	}
	return *o.TransactionType
}

// GetTransactionTypeOk returns a tuple with the TransactionType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetTransactionTypeOk() (*string, bool) {
	if o == nil || isNil(o.TransactionType) {
    return nil, false
	}
	return o.TransactionType, true
}

// HasTransactionType returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasTransactionType() bool {
	if o != nil && !isNil(o.TransactionType) {
		return true
	}

	return false
}

// SetTransactionType gets a reference to the given string and assigns it to the TransactionType field.
func (o *GetTransactionResponseEntity) SetTransactionType(v string) {
	o.TransactionType = &v
}

// GetRecipientAccountNumber returns the RecipientAccountNumber field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetRecipientAccountNumber() string {
	if o == nil || isNil(o.RecipientAccountNumber) {
		var ret string
		return ret
	}
	return *o.RecipientAccountNumber
}

// GetRecipientAccountNumberOk returns a tuple with the RecipientAccountNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetRecipientAccountNumberOk() (*string, bool) {
	if o == nil || isNil(o.RecipientAccountNumber) {
    return nil, false
	}
	return o.RecipientAccountNumber, true
}

// HasRecipientAccountNumber returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasRecipientAccountNumber() bool {
	if o != nil && !isNil(o.RecipientAccountNumber) {
		return true
	}

	return false
}

// SetRecipientAccountNumber gets a reference to the given string and assigns it to the RecipientAccountNumber field.
func (o *GetTransactionResponseEntity) SetRecipientAccountNumber(v string) {
	o.RecipientAccountNumber = &v
}

// GetSenderAccountNumber returns the SenderAccountNumber field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetSenderAccountNumber() string {
	if o == nil || isNil(o.SenderAccountNumber) {
		var ret string
		return ret
	}
	return *o.SenderAccountNumber
}

// GetSenderAccountNumberOk returns a tuple with the SenderAccountNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetSenderAccountNumberOk() (*string, bool) {
	if o == nil || isNil(o.SenderAccountNumber) {
    return nil, false
	}
	return o.SenderAccountNumber, true
}

// HasSenderAccountNumber returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasSenderAccountNumber() bool {
	if o != nil && !isNil(o.SenderAccountNumber) {
		return true
	}

	return false
}

// SetSenderAccountNumber gets a reference to the given string and assigns it to the SenderAccountNumber field.
func (o *GetTransactionResponseEntity) SetSenderAccountNumber(v string) {
	o.SenderAccountNumber = &v
}

// GetTransactionRemarks returns the TransactionRemarks field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetTransactionRemarks() string {
	if o == nil || isNil(o.TransactionRemarks) {
		var ret string
		return ret
	}
	return *o.TransactionRemarks
}

// GetTransactionRemarksOk returns a tuple with the TransactionRemarks field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetTransactionRemarksOk() (*string, bool) {
	if o == nil || isNil(o.TransactionRemarks) {
    return nil, false
	}
	return o.TransactionRemarks, true
}

// HasTransactionRemarks returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasTransactionRemarks() bool {
	if o != nil && !isNil(o.TransactionRemarks) {
		return true
	}

	return false
}

// SetTransactionRemarks gets a reference to the given string and assigns it to the TransactionRemarks field.
func (o *GetTransactionResponseEntity) SetTransactionRemarks(v string) {
	o.TransactionRemarks = &v
}

// GetTransactionReason returns the TransactionReason field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *GetTransactionResponseEntity) GetTransactionReason() string {
	if o == nil || isNil(o.TransactionReason.Get()) {
		var ret string
		return ret
	}
	return *o.TransactionReason.Get()
}

// GetTransactionReasonOk returns a tuple with the TransactionReason field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *GetTransactionResponseEntity) GetTransactionReasonOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TransactionReason.Get(), o.TransactionReason.IsSet()
}

// HasTransactionReason returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasTransactionReason() bool {
	if o != nil && o.TransactionReason.IsSet() {
		return true
	}

	return false
}

// SetTransactionReason gets a reference to the given NullableString and assigns it to the TransactionReason field.
func (o *GetTransactionResponseEntity) SetTransactionReason(v string) {
	o.TransactionReason.Set(&v)
}
// SetTransactionReasonNil sets the value for TransactionReason to be an explicit nil
func (o *GetTransactionResponseEntity) SetTransactionReasonNil() {
	o.TransactionReason.Set(nil)
}

// UnsetTransactionReason ensures that no value is present for TransactionReason, not even an explicit nil
func (o *GetTransactionResponseEntity) UnsetTransactionReason() {
	o.TransactionReason.Unset()
}

// GetTransactionId returns the TransactionId field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetTransactionId() string {
	if o == nil || isNil(o.TransactionId) {
		var ret string
		return ret
	}
	return *o.TransactionId
}

// GetTransactionIdOk returns a tuple with the TransactionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetTransactionIdOk() (*string, bool) {
	if o == nil || isNil(o.TransactionId) {
    return nil, false
	}
	return o.TransactionId, true
}

// HasTransactionId returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasTransactionId() bool {
	if o != nil && !isNil(o.TransactionId) {
		return true
	}

	return false
}

// SetTransactionId gets a reference to the given string and assigns it to the TransactionId field.
func (o *GetTransactionResponseEntity) SetTransactionId(v string) {
	o.TransactionId = &v
}

// GetTransactionStatus returns the TransactionStatus field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetTransactionStatus() string {
	if o == nil || isNil(o.TransactionStatus) {
		var ret string
		return ret
	}
	return *o.TransactionStatus
}

// GetTransactionStatusOk returns a tuple with the TransactionStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetTransactionStatusOk() (*string, bool) {
	if o == nil || isNil(o.TransactionStatus) {
    return nil, false
	}
	return o.TransactionStatus, true
}

// HasTransactionStatus returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasTransactionStatus() bool {
	if o != nil && !isNil(o.TransactionStatus) {
		return true
	}

	return false
}

// SetTransactionStatus gets a reference to the given string and assigns it to the TransactionStatus field.
func (o *GetTransactionResponseEntity) SetTransactionStatus(v string) {
	o.TransactionStatus = &v
}

// GetDateCreated returns the DateCreated field value if set, zero value otherwise.
func (o *GetTransactionResponseEntity) GetDateCreated() string {
	if o == nil || isNil(o.DateCreated) {
		var ret string
		return ret
	}
	return *o.DateCreated
}

// GetDateCreatedOk returns a tuple with the DateCreated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetTransactionResponseEntity) GetDateCreatedOk() (*string, bool) {
	if o == nil || isNil(o.DateCreated) {
    return nil, false
	}
	return o.DateCreated, true
}

// HasDateCreated returns a boolean if a field has been set.
func (o *GetTransactionResponseEntity) HasDateCreated() bool {
	if o != nil && !isNil(o.DateCreated) {
		return true
	}

	return false
}

// SetDateCreated gets a reference to the given string and assigns it to the DateCreated field.
func (o *GetTransactionResponseEntity) SetDateCreated(v string) {
	o.DateCreated = &v
}

func (o GetTransactionResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.WalletId) {
		toSerialize["wallet_id"] = o.WalletId
	}
	if !isNil(o.TransactionAmount) {
		toSerialize["transaction_amount"] = o.TransactionAmount
	}
	if !isNil(o.TransactionType) {
		toSerialize["transaction_type"] = o.TransactionType
	}
	if !isNil(o.RecipientAccountNumber) {
		toSerialize["recipient_account_number"] = o.RecipientAccountNumber
	}
	if !isNil(o.SenderAccountNumber) {
		toSerialize["sender_account_number"] = o.SenderAccountNumber
	}
	if !isNil(o.TransactionRemarks) {
		toSerialize["transaction_remarks"] = o.TransactionRemarks
	}
	if o.TransactionReason.IsSet() {
		toSerialize["transaction_reason"] = o.TransactionReason.Get()
	}
	if !isNil(o.TransactionId) {
		toSerialize["transaction_id"] = o.TransactionId
	}
	if !isNil(o.TransactionStatus) {
		toSerialize["transaction_status"] = o.TransactionStatus
	}
	if !isNil(o.DateCreated) {
		toSerialize["date_created"] = o.DateCreated
	}
	return json.Marshal(toSerialize)
}

type NullableGetTransactionResponseEntity struct {
	value *GetTransactionResponseEntity
	isSet bool
}

func (v NullableGetTransactionResponseEntity) Get() *GetTransactionResponseEntity {
	return v.value
}

func (v *NullableGetTransactionResponseEntity) Set(val *GetTransactionResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableGetTransactionResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableGetTransactionResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetTransactionResponseEntity(val *GetTransactionResponseEntity) *NullableGetTransactionResponseEntity {
	return &NullableGetTransactionResponseEntity{value: val, isSet: true}
}

func (v NullableGetTransactionResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetTransactionResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

