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

// GetAccountTransactionsResponseEntity struct for GetAccountTransactionsResponseEntity
type GetAccountTransactionsResponseEntity struct {
	Transactions []GetAccountTransactionsResponseEntityTransactionsInner `json:"transactions,omitempty"`
	Total *float32 `json:"total,omitempty"`
	PreviousPage *string `json:"previous_page,omitempty"`
	NextPage *float32 `json:"next_page,omitempty"`
	TotalPages *float32 `json:"total_pages,omitempty"`
	CurrentPage *float32 `json:"current_page,omitempty"`
}

// NewGetAccountTransactionsResponseEntity instantiates a new GetAccountTransactionsResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetAccountTransactionsResponseEntity() *GetAccountTransactionsResponseEntity {
	this := GetAccountTransactionsResponseEntity{}
	return &this
}

// NewGetAccountTransactionsResponseEntityWithDefaults instantiates a new GetAccountTransactionsResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetAccountTransactionsResponseEntityWithDefaults() *GetAccountTransactionsResponseEntity {
	this := GetAccountTransactionsResponseEntity{}
	return &this
}

// GetTransactions returns the Transactions field value if set, zero value otherwise.
func (o *GetAccountTransactionsResponseEntity) GetTransactions() []GetAccountTransactionsResponseEntityTransactionsInner {
	if o == nil || isNil(o.Transactions) {
		var ret []GetAccountTransactionsResponseEntityTransactionsInner
		return ret
	}
	return o.Transactions
}

// GetTransactionsOk returns a tuple with the Transactions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountTransactionsResponseEntity) GetTransactionsOk() ([]GetAccountTransactionsResponseEntityTransactionsInner, bool) {
	if o == nil || isNil(o.Transactions) {
    return nil, false
	}
	return o.Transactions, true
}

// HasTransactions returns a boolean if a field has been set.
func (o *GetAccountTransactionsResponseEntity) HasTransactions() bool {
	if o != nil && !isNil(o.Transactions) {
		return true
	}

	return false
}

// SetTransactions gets a reference to the given []GetAccountTransactionsResponseEntityTransactionsInner and assigns it to the Transactions field.
func (o *GetAccountTransactionsResponseEntity) SetTransactions(v []GetAccountTransactionsResponseEntityTransactionsInner) {
	o.Transactions = v
}

// GetTotal returns the Total field value if set, zero value otherwise.
func (o *GetAccountTransactionsResponseEntity) GetTotal() float32 {
	if o == nil || isNil(o.Total) {
		var ret float32
		return ret
	}
	return *o.Total
}

// GetTotalOk returns a tuple with the Total field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountTransactionsResponseEntity) GetTotalOk() (*float32, bool) {
	if o == nil || isNil(o.Total) {
    return nil, false
	}
	return o.Total, true
}

// HasTotal returns a boolean if a field has been set.
func (o *GetAccountTransactionsResponseEntity) HasTotal() bool {
	if o != nil && !isNil(o.Total) {
		return true
	}

	return false
}

// SetTotal gets a reference to the given float32 and assigns it to the Total field.
func (o *GetAccountTransactionsResponseEntity) SetTotal(v float32) {
	o.Total = &v
}

// GetPreviousPage returns the PreviousPage field value if set, zero value otherwise.
func (o *GetAccountTransactionsResponseEntity) GetPreviousPage() string {
	if o == nil || isNil(o.PreviousPage) {
		var ret string
		return ret
	}
	return *o.PreviousPage
}

// GetPreviousPageOk returns a tuple with the PreviousPage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountTransactionsResponseEntity) GetPreviousPageOk() (*string, bool) {
	if o == nil || isNil(o.PreviousPage) {
    return nil, false
	}
	return o.PreviousPage, true
}

// HasPreviousPage returns a boolean if a field has been set.
func (o *GetAccountTransactionsResponseEntity) HasPreviousPage() bool {
	if o != nil && !isNil(o.PreviousPage) {
		return true
	}

	return false
}

// SetPreviousPage gets a reference to the given string and assigns it to the PreviousPage field.
func (o *GetAccountTransactionsResponseEntity) SetPreviousPage(v string) {
	o.PreviousPage = &v
}

// GetNextPage returns the NextPage field value if set, zero value otherwise.
func (o *GetAccountTransactionsResponseEntity) GetNextPage() float32 {
	if o == nil || isNil(o.NextPage) {
		var ret float32
		return ret
	}
	return *o.NextPage
}

// GetNextPageOk returns a tuple with the NextPage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountTransactionsResponseEntity) GetNextPageOk() (*float32, bool) {
	if o == nil || isNil(o.NextPage) {
    return nil, false
	}
	return o.NextPage, true
}

// HasNextPage returns a boolean if a field has been set.
func (o *GetAccountTransactionsResponseEntity) HasNextPage() bool {
	if o != nil && !isNil(o.NextPage) {
		return true
	}

	return false
}

// SetNextPage gets a reference to the given float32 and assigns it to the NextPage field.
func (o *GetAccountTransactionsResponseEntity) SetNextPage(v float32) {
	o.NextPage = &v
}

// GetTotalPages returns the TotalPages field value if set, zero value otherwise.
func (o *GetAccountTransactionsResponseEntity) GetTotalPages() float32 {
	if o == nil || isNil(o.TotalPages) {
		var ret float32
		return ret
	}
	return *o.TotalPages
}

// GetTotalPagesOk returns a tuple with the TotalPages field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountTransactionsResponseEntity) GetTotalPagesOk() (*float32, bool) {
	if o == nil || isNil(o.TotalPages) {
    return nil, false
	}
	return o.TotalPages, true
}

// HasTotalPages returns a boolean if a field has been set.
func (o *GetAccountTransactionsResponseEntity) HasTotalPages() bool {
	if o != nil && !isNil(o.TotalPages) {
		return true
	}

	return false
}

// SetTotalPages gets a reference to the given float32 and assigns it to the TotalPages field.
func (o *GetAccountTransactionsResponseEntity) SetTotalPages(v float32) {
	o.TotalPages = &v
}

// GetCurrentPage returns the CurrentPage field value if set, zero value otherwise.
func (o *GetAccountTransactionsResponseEntity) GetCurrentPage() float32 {
	if o == nil || isNil(o.CurrentPage) {
		var ret float32
		return ret
	}
	return *o.CurrentPage
}

// GetCurrentPageOk returns a tuple with the CurrentPage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountTransactionsResponseEntity) GetCurrentPageOk() (*float32, bool) {
	if o == nil || isNil(o.CurrentPage) {
    return nil, false
	}
	return o.CurrentPage, true
}

// HasCurrentPage returns a boolean if a field has been set.
func (o *GetAccountTransactionsResponseEntity) HasCurrentPage() bool {
	if o != nil && !isNil(o.CurrentPage) {
		return true
	}

	return false
}

// SetCurrentPage gets a reference to the given float32 and assigns it to the CurrentPage field.
func (o *GetAccountTransactionsResponseEntity) SetCurrentPage(v float32) {
	o.CurrentPage = &v
}

func (o GetAccountTransactionsResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Transactions) {
		toSerialize["transactions"] = o.Transactions
	}
	if !isNil(o.Total) {
		toSerialize["total"] = o.Total
	}
	if !isNil(o.PreviousPage) {
		toSerialize["previous_page"] = o.PreviousPage
	}
	if !isNil(o.NextPage) {
		toSerialize["next_page"] = o.NextPage
	}
	if !isNil(o.TotalPages) {
		toSerialize["total_pages"] = o.TotalPages
	}
	if !isNil(o.CurrentPage) {
		toSerialize["current_page"] = o.CurrentPage
	}
	return json.Marshal(toSerialize)
}

type NullableGetAccountTransactionsResponseEntity struct {
	value *GetAccountTransactionsResponseEntity
	isSet bool
}

func (v NullableGetAccountTransactionsResponseEntity) Get() *GetAccountTransactionsResponseEntity {
	return v.value
}

func (v *NullableGetAccountTransactionsResponseEntity) Set(val *GetAccountTransactionsResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableGetAccountTransactionsResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableGetAccountTransactionsResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetAccountTransactionsResponseEntity(val *GetAccountTransactionsResponseEntity) *NullableGetAccountTransactionsResponseEntity {
	return &NullableGetAccountTransactionsResponseEntity{value: val, isSet: true}
}

func (v NullableGetAccountTransactionsResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetAccountTransactionsResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

