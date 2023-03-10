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

// GetEarningStructureResponseEntity struct for GetEarningStructureResponseEntity
type GetEarningStructureResponseEntity struct {
	AverageMonthlyIncome *float32 `json:"average_monthly_income,omitempty"`
	SalaryEarner *bool `json:"salary_earner,omitempty"`
	Consistent *bool `json:"consistent,omitempty"`
	NumberOfDays *float32 `json:"number_of_days,omitempty"`
}

// NewGetEarningStructureResponseEntity instantiates a new GetEarningStructureResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetEarningStructureResponseEntity() *GetEarningStructureResponseEntity {
	this := GetEarningStructureResponseEntity{}
	return &this
}

// NewGetEarningStructureResponseEntityWithDefaults instantiates a new GetEarningStructureResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetEarningStructureResponseEntityWithDefaults() *GetEarningStructureResponseEntity {
	this := GetEarningStructureResponseEntity{}
	return &this
}

// GetAverageMonthlyIncome returns the AverageMonthlyIncome field value if set, zero value otherwise.
func (o *GetEarningStructureResponseEntity) GetAverageMonthlyIncome() float32 {
	if o == nil || isNil(o.AverageMonthlyIncome) {
		var ret float32
		return ret
	}
	return *o.AverageMonthlyIncome
}

// GetAverageMonthlyIncomeOk returns a tuple with the AverageMonthlyIncome field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetEarningStructureResponseEntity) GetAverageMonthlyIncomeOk() (*float32, bool) {
	if o == nil || isNil(o.AverageMonthlyIncome) {
    return nil, false
	}
	return o.AverageMonthlyIncome, true
}

// HasAverageMonthlyIncome returns a boolean if a field has been set.
func (o *GetEarningStructureResponseEntity) HasAverageMonthlyIncome() bool {
	if o != nil && !isNil(o.AverageMonthlyIncome) {
		return true
	}

	return false
}

// SetAverageMonthlyIncome gets a reference to the given float32 and assigns it to the AverageMonthlyIncome field.
func (o *GetEarningStructureResponseEntity) SetAverageMonthlyIncome(v float32) {
	o.AverageMonthlyIncome = &v
}

// GetSalaryEarner returns the SalaryEarner field value if set, zero value otherwise.
func (o *GetEarningStructureResponseEntity) GetSalaryEarner() bool {
	if o == nil || isNil(o.SalaryEarner) {
		var ret bool
		return ret
	}
	return *o.SalaryEarner
}

// GetSalaryEarnerOk returns a tuple with the SalaryEarner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetEarningStructureResponseEntity) GetSalaryEarnerOk() (*bool, bool) {
	if o == nil || isNil(o.SalaryEarner) {
    return nil, false
	}
	return o.SalaryEarner, true
}

// HasSalaryEarner returns a boolean if a field has been set.
func (o *GetEarningStructureResponseEntity) HasSalaryEarner() bool {
	if o != nil && !isNil(o.SalaryEarner) {
		return true
	}

	return false
}

// SetSalaryEarner gets a reference to the given bool and assigns it to the SalaryEarner field.
func (o *GetEarningStructureResponseEntity) SetSalaryEarner(v bool) {
	o.SalaryEarner = &v
}

// GetConsistent returns the Consistent field value if set, zero value otherwise.
func (o *GetEarningStructureResponseEntity) GetConsistent() bool {
	if o == nil || isNil(o.Consistent) {
		var ret bool
		return ret
	}
	return *o.Consistent
}

// GetConsistentOk returns a tuple with the Consistent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetEarningStructureResponseEntity) GetConsistentOk() (*bool, bool) {
	if o == nil || isNil(o.Consistent) {
    return nil, false
	}
	return o.Consistent, true
}

// HasConsistent returns a boolean if a field has been set.
func (o *GetEarningStructureResponseEntity) HasConsistent() bool {
	if o != nil && !isNil(o.Consistent) {
		return true
	}

	return false
}

// SetConsistent gets a reference to the given bool and assigns it to the Consistent field.
func (o *GetEarningStructureResponseEntity) SetConsistent(v bool) {
	o.Consistent = &v
}

// GetNumberOfDays returns the NumberOfDays field value if set, zero value otherwise.
func (o *GetEarningStructureResponseEntity) GetNumberOfDays() float32 {
	if o == nil || isNil(o.NumberOfDays) {
		var ret float32
		return ret
	}
	return *o.NumberOfDays
}

// GetNumberOfDaysOk returns a tuple with the NumberOfDays field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetEarningStructureResponseEntity) GetNumberOfDaysOk() (*float32, bool) {
	if o == nil || isNil(o.NumberOfDays) {
    return nil, false
	}
	return o.NumberOfDays, true
}

// HasNumberOfDays returns a boolean if a field has been set.
func (o *GetEarningStructureResponseEntity) HasNumberOfDays() bool {
	if o != nil && !isNil(o.NumberOfDays) {
		return true
	}

	return false
}

// SetNumberOfDays gets a reference to the given float32 and assigns it to the NumberOfDays field.
func (o *GetEarningStructureResponseEntity) SetNumberOfDays(v float32) {
	o.NumberOfDays = &v
}

func (o GetEarningStructureResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.AverageMonthlyIncome) {
		toSerialize["average_monthly_income"] = o.AverageMonthlyIncome
	}
	if !isNil(o.SalaryEarner) {
		toSerialize["salary_earner"] = o.SalaryEarner
	}
	if !isNil(o.Consistent) {
		toSerialize["consistent"] = o.Consistent
	}
	if !isNil(o.NumberOfDays) {
		toSerialize["number_of_days"] = o.NumberOfDays
	}
	return json.Marshal(toSerialize)
}

type NullableGetEarningStructureResponseEntity struct {
	value *GetEarningStructureResponseEntity
	isSet bool
}

func (v NullableGetEarningStructureResponseEntity) Get() *GetEarningStructureResponseEntity {
	return v.value
}

func (v *NullableGetEarningStructureResponseEntity) Set(val *GetEarningStructureResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableGetEarningStructureResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableGetEarningStructureResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetEarningStructureResponseEntity(val *GetEarningStructureResponseEntity) *NullableGetEarningStructureResponseEntity {
	return &NullableGetEarningStructureResponseEntity{value: val, isSet: true}
}

func (v NullableGetEarningStructureResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetEarningStructureResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

