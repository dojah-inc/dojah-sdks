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

// CreateWalletRequest struct for CreateWalletRequest
type CreateWalletRequest struct {
	LastName *string `json:"last_name,omitempty"`
	FirstName *string `json:"first_name,omitempty"`
	PhoneNumber *string `json:"phone_number,omitempty"`
	Dob *string `json:"dob,omitempty"`
	Route *string `json:"route,omitempty"`
}

// NewCreateWalletRequest instantiates a new CreateWalletRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateWalletRequest() *CreateWalletRequest {
	this := CreateWalletRequest{}
	return &this
}

// NewCreateWalletRequestWithDefaults instantiates a new CreateWalletRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateWalletRequestWithDefaults() *CreateWalletRequest {
	this := CreateWalletRequest{}
	return &this
}

// GetLastName returns the LastName field value if set, zero value otherwise.
func (o *CreateWalletRequest) GetLastName() string {
	if o == nil || isNil(o.LastName) {
		var ret string
		return ret
	}
	return *o.LastName
}

// GetLastNameOk returns a tuple with the LastName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateWalletRequest) GetLastNameOk() (*string, bool) {
	if o == nil || isNil(o.LastName) {
    return nil, false
	}
	return o.LastName, true
}

// HasLastName returns a boolean if a field has been set.
func (o *CreateWalletRequest) HasLastName() bool {
	if o != nil && !isNil(o.LastName) {
		return true
	}

	return false
}

// SetLastName gets a reference to the given string and assigns it to the LastName field.
func (o *CreateWalletRequest) SetLastName(v string) {
	o.LastName = &v
}

// GetFirstName returns the FirstName field value if set, zero value otherwise.
func (o *CreateWalletRequest) GetFirstName() string {
	if o == nil || isNil(o.FirstName) {
		var ret string
		return ret
	}
	return *o.FirstName
}

// GetFirstNameOk returns a tuple with the FirstName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateWalletRequest) GetFirstNameOk() (*string, bool) {
	if o == nil || isNil(o.FirstName) {
    return nil, false
	}
	return o.FirstName, true
}

// HasFirstName returns a boolean if a field has been set.
func (o *CreateWalletRequest) HasFirstName() bool {
	if o != nil && !isNil(o.FirstName) {
		return true
	}

	return false
}

// SetFirstName gets a reference to the given string and assigns it to the FirstName field.
func (o *CreateWalletRequest) SetFirstName(v string) {
	o.FirstName = &v
}

// GetPhoneNumber returns the PhoneNumber field value if set, zero value otherwise.
func (o *CreateWalletRequest) GetPhoneNumber() string {
	if o == nil || isNil(o.PhoneNumber) {
		var ret string
		return ret
	}
	return *o.PhoneNumber
}

// GetPhoneNumberOk returns a tuple with the PhoneNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateWalletRequest) GetPhoneNumberOk() (*string, bool) {
	if o == nil || isNil(o.PhoneNumber) {
    return nil, false
	}
	return o.PhoneNumber, true
}

// HasPhoneNumber returns a boolean if a field has been set.
func (o *CreateWalletRequest) HasPhoneNumber() bool {
	if o != nil && !isNil(o.PhoneNumber) {
		return true
	}

	return false
}

// SetPhoneNumber gets a reference to the given string and assigns it to the PhoneNumber field.
func (o *CreateWalletRequest) SetPhoneNumber(v string) {
	o.PhoneNumber = &v
}

// GetDob returns the Dob field value if set, zero value otherwise.
func (o *CreateWalletRequest) GetDob() string {
	if o == nil || isNil(o.Dob) {
		var ret string
		return ret
	}
	return *o.Dob
}

// GetDobOk returns a tuple with the Dob field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateWalletRequest) GetDobOk() (*string, bool) {
	if o == nil || isNil(o.Dob) {
    return nil, false
	}
	return o.Dob, true
}

// HasDob returns a boolean if a field has been set.
func (o *CreateWalletRequest) HasDob() bool {
	if o != nil && !isNil(o.Dob) {
		return true
	}

	return false
}

// SetDob gets a reference to the given string and assigns it to the Dob field.
func (o *CreateWalletRequest) SetDob(v string) {
	o.Dob = &v
}

// GetRoute returns the Route field value if set, zero value otherwise.
func (o *CreateWalletRequest) GetRoute() string {
	if o == nil || isNil(o.Route) {
		var ret string
		return ret
	}
	return *o.Route
}

// GetRouteOk returns a tuple with the Route field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateWalletRequest) GetRouteOk() (*string, bool) {
	if o == nil || isNil(o.Route) {
    return nil, false
	}
	return o.Route, true
}

// HasRoute returns a boolean if a field has been set.
func (o *CreateWalletRequest) HasRoute() bool {
	if o != nil && !isNil(o.Route) {
		return true
	}

	return false
}

// SetRoute gets a reference to the given string and assigns it to the Route field.
func (o *CreateWalletRequest) SetRoute(v string) {
	o.Route = &v
}

func (o CreateWalletRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.LastName) {
		toSerialize["last_name"] = o.LastName
	}
	if !isNil(o.FirstName) {
		toSerialize["first_name"] = o.FirstName
	}
	if !isNil(o.PhoneNumber) {
		toSerialize["phone_number"] = o.PhoneNumber
	}
	if !isNil(o.Dob) {
		toSerialize["dob"] = o.Dob
	}
	if !isNil(o.Route) {
		toSerialize["route"] = o.Route
	}
	return json.Marshal(toSerialize)
}

type NullableCreateWalletRequest struct {
	value *CreateWalletRequest
	isSet bool
}

func (v NullableCreateWalletRequest) Get() *CreateWalletRequest {
	return v.value
}

func (v *NullableCreateWalletRequest) Set(val *CreateWalletRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateWalletRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateWalletRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateWalletRequest(val *CreateWalletRequest) *NullableCreateWalletRequest {
	return &NullableCreateWalletRequest{value: val, isSet: true}
}

func (v NullableCreateWalletRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateWalletRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

