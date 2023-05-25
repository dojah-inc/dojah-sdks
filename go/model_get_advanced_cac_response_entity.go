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

// GetAdvancedCacResponseEntity struct for GetAdvancedCacResponseEntity
type GetAdvancedCacResponseEntity struct {
	RcNumber *string `json:"rc_number,omitempty"`
	CompanyName *string `json:"company_name,omitempty"`
	Address *string `json:"address,omitempty"`
	DateOfRegistration *string `json:"date_of_registration,omitempty"`
	TypeOfCompany *string `json:"type_of_company,omitempty"`
}

// NewGetAdvancedCacResponseEntity instantiates a new GetAdvancedCacResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetAdvancedCacResponseEntity() *GetAdvancedCacResponseEntity {
	this := GetAdvancedCacResponseEntity{}
	return &this
}

// NewGetAdvancedCacResponseEntityWithDefaults instantiates a new GetAdvancedCacResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetAdvancedCacResponseEntityWithDefaults() *GetAdvancedCacResponseEntity {
	this := GetAdvancedCacResponseEntity{}
	return &this
}

// GetRcNumber returns the RcNumber field value if set, zero value otherwise.
func (o *GetAdvancedCacResponseEntity) GetRcNumber() string {
	if o == nil || isNil(o.RcNumber) {
		var ret string
		return ret
	}
	return *o.RcNumber
}

// GetRcNumberOk returns a tuple with the RcNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAdvancedCacResponseEntity) GetRcNumberOk() (*string, bool) {
	if o == nil || isNil(o.RcNumber) {
    return nil, false
	}
	return o.RcNumber, true
}

// HasRcNumber returns a boolean if a field has been set.
func (o *GetAdvancedCacResponseEntity) HasRcNumber() bool {
	if o != nil && !isNil(o.RcNumber) {
		return true
	}

	return false
}

// SetRcNumber gets a reference to the given string and assigns it to the RcNumber field.
func (o *GetAdvancedCacResponseEntity) SetRcNumber(v string) {
	o.RcNumber = &v
}

// GetCompanyName returns the CompanyName field value if set, zero value otherwise.
func (o *GetAdvancedCacResponseEntity) GetCompanyName() string {
	if o == nil || isNil(o.CompanyName) {
		var ret string
		return ret
	}
	return *o.CompanyName
}

// GetCompanyNameOk returns a tuple with the CompanyName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAdvancedCacResponseEntity) GetCompanyNameOk() (*string, bool) {
	if o == nil || isNil(o.CompanyName) {
    return nil, false
	}
	return o.CompanyName, true
}

// HasCompanyName returns a boolean if a field has been set.
func (o *GetAdvancedCacResponseEntity) HasCompanyName() bool {
	if o != nil && !isNil(o.CompanyName) {
		return true
	}

	return false
}

// SetCompanyName gets a reference to the given string and assigns it to the CompanyName field.
func (o *GetAdvancedCacResponseEntity) SetCompanyName(v string) {
	o.CompanyName = &v
}

// GetAddress returns the Address field value if set, zero value otherwise.
func (o *GetAdvancedCacResponseEntity) GetAddress() string {
	if o == nil || isNil(o.Address) {
		var ret string
		return ret
	}
	return *o.Address
}

// GetAddressOk returns a tuple with the Address field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAdvancedCacResponseEntity) GetAddressOk() (*string, bool) {
	if o == nil || isNil(o.Address) {
    return nil, false
	}
	return o.Address, true
}

// HasAddress returns a boolean if a field has been set.
func (o *GetAdvancedCacResponseEntity) HasAddress() bool {
	if o != nil && !isNil(o.Address) {
		return true
	}

	return false
}

// SetAddress gets a reference to the given string and assigns it to the Address field.
func (o *GetAdvancedCacResponseEntity) SetAddress(v string) {
	o.Address = &v
}

// GetDateOfRegistration returns the DateOfRegistration field value if set, zero value otherwise.
func (o *GetAdvancedCacResponseEntity) GetDateOfRegistration() string {
	if o == nil || isNil(o.DateOfRegistration) {
		var ret string
		return ret
	}
	return *o.DateOfRegistration
}

// GetDateOfRegistrationOk returns a tuple with the DateOfRegistration field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAdvancedCacResponseEntity) GetDateOfRegistrationOk() (*string, bool) {
	if o == nil || isNil(o.DateOfRegistration) {
    return nil, false
	}
	return o.DateOfRegistration, true
}

// HasDateOfRegistration returns a boolean if a field has been set.
func (o *GetAdvancedCacResponseEntity) HasDateOfRegistration() bool {
	if o != nil && !isNil(o.DateOfRegistration) {
		return true
	}

	return false
}

// SetDateOfRegistration gets a reference to the given string and assigns it to the DateOfRegistration field.
func (o *GetAdvancedCacResponseEntity) SetDateOfRegistration(v string) {
	o.DateOfRegistration = &v
}

// GetTypeOfCompany returns the TypeOfCompany field value if set, zero value otherwise.
func (o *GetAdvancedCacResponseEntity) GetTypeOfCompany() string {
	if o == nil || isNil(o.TypeOfCompany) {
		var ret string
		return ret
	}
	return *o.TypeOfCompany
}

// GetTypeOfCompanyOk returns a tuple with the TypeOfCompany field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAdvancedCacResponseEntity) GetTypeOfCompanyOk() (*string, bool) {
	if o == nil || isNil(o.TypeOfCompany) {
    return nil, false
	}
	return o.TypeOfCompany, true
}

// HasTypeOfCompany returns a boolean if a field has been set.
func (o *GetAdvancedCacResponseEntity) HasTypeOfCompany() bool {
	if o != nil && !isNil(o.TypeOfCompany) {
		return true
	}

	return false
}

// SetTypeOfCompany gets a reference to the given string and assigns it to the TypeOfCompany field.
func (o *GetAdvancedCacResponseEntity) SetTypeOfCompany(v string) {
	o.TypeOfCompany = &v
}

func (o GetAdvancedCacResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.RcNumber) {
		toSerialize["rc_number"] = o.RcNumber
	}
	if !isNil(o.CompanyName) {
		toSerialize["company_name"] = o.CompanyName
	}
	if !isNil(o.Address) {
		toSerialize["address"] = o.Address
	}
	if !isNil(o.DateOfRegistration) {
		toSerialize["date_of_registration"] = o.DateOfRegistration
	}
	if !isNil(o.TypeOfCompany) {
		toSerialize["type_of_company"] = o.TypeOfCompany
	}
	return json.Marshal(toSerialize)
}

type NullableGetAdvancedCacResponseEntity struct {
	value *GetAdvancedCacResponseEntity
	isSet bool
}

func (v NullableGetAdvancedCacResponseEntity) Get() *GetAdvancedCacResponseEntity {
	return v.value
}

func (v *NullableGetAdvancedCacResponseEntity) Set(val *GetAdvancedCacResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableGetAdvancedCacResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableGetAdvancedCacResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetAdvancedCacResponseEntity(val *GetAdvancedCacResponseEntity) *NullableGetAdvancedCacResponseEntity {
	return &NullableGetAdvancedCacResponseEntity{value: val, isSet: true}
}

func (v NullableGetAdvancedCacResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetAdvancedCacResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


