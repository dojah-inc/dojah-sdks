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

// GetVninResponseEntity struct for GetVninResponseEntity
type GetVninResponseEntity struct {
	Vnin *string `json:"vnin,omitempty"`
	Firstname *string `json:"firstname,omitempty"`
	Middlename *string `json:"middlename,omitempty"`
	Surname *string `json:"surname,omitempty"`
	UserId *string `json:"user_id,omitempty"`
	Gender *string `json:"gender,omitempty"`
	Mobile *string `json:"mobile,omitempty"`
	DateOfBirth *string `json:"dateOfBirth,omitempty"`
	Photo *string `json:"photo,omitempty"`
}

// NewGetVninResponseEntity instantiates a new GetVninResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetVninResponseEntity() *GetVninResponseEntity {
	this := GetVninResponseEntity{}
	return &this
}

// NewGetVninResponseEntityWithDefaults instantiates a new GetVninResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetVninResponseEntityWithDefaults() *GetVninResponseEntity {
	this := GetVninResponseEntity{}
	return &this
}

// GetVnin returns the Vnin field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetVnin() string {
	if o == nil || isNil(o.Vnin) {
		var ret string
		return ret
	}
	return *o.Vnin
}

// GetVninOk returns a tuple with the Vnin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetVninOk() (*string, bool) {
	if o == nil || isNil(o.Vnin) {
    return nil, false
	}
	return o.Vnin, true
}

// HasVnin returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasVnin() bool {
	if o != nil && !isNil(o.Vnin) {
		return true
	}

	return false
}

// SetVnin gets a reference to the given string and assigns it to the Vnin field.
func (o *GetVninResponseEntity) SetVnin(v string) {
	o.Vnin = &v
}

// GetFirstname returns the Firstname field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetFirstname() string {
	if o == nil || isNil(o.Firstname) {
		var ret string
		return ret
	}
	return *o.Firstname
}

// GetFirstnameOk returns a tuple with the Firstname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetFirstnameOk() (*string, bool) {
	if o == nil || isNil(o.Firstname) {
    return nil, false
	}
	return o.Firstname, true
}

// HasFirstname returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasFirstname() bool {
	if o != nil && !isNil(o.Firstname) {
		return true
	}

	return false
}

// SetFirstname gets a reference to the given string and assigns it to the Firstname field.
func (o *GetVninResponseEntity) SetFirstname(v string) {
	o.Firstname = &v
}

// GetMiddlename returns the Middlename field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetMiddlename() string {
	if o == nil || isNil(o.Middlename) {
		var ret string
		return ret
	}
	return *o.Middlename
}

// GetMiddlenameOk returns a tuple with the Middlename field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetMiddlenameOk() (*string, bool) {
	if o == nil || isNil(o.Middlename) {
    return nil, false
	}
	return o.Middlename, true
}

// HasMiddlename returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasMiddlename() bool {
	if o != nil && !isNil(o.Middlename) {
		return true
	}

	return false
}

// SetMiddlename gets a reference to the given string and assigns it to the Middlename field.
func (o *GetVninResponseEntity) SetMiddlename(v string) {
	o.Middlename = &v
}

// GetSurname returns the Surname field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetSurname() string {
	if o == nil || isNil(o.Surname) {
		var ret string
		return ret
	}
	return *o.Surname
}

// GetSurnameOk returns a tuple with the Surname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetSurnameOk() (*string, bool) {
	if o == nil || isNil(o.Surname) {
    return nil, false
	}
	return o.Surname, true
}

// HasSurname returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasSurname() bool {
	if o != nil && !isNil(o.Surname) {
		return true
	}

	return false
}

// SetSurname gets a reference to the given string and assigns it to the Surname field.
func (o *GetVninResponseEntity) SetSurname(v string) {
	o.Surname = &v
}

// GetUserId returns the UserId field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetUserId() string {
	if o == nil || isNil(o.UserId) {
		var ret string
		return ret
	}
	return *o.UserId
}

// GetUserIdOk returns a tuple with the UserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetUserIdOk() (*string, bool) {
	if o == nil || isNil(o.UserId) {
    return nil, false
	}
	return o.UserId, true
}

// HasUserId returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasUserId() bool {
	if o != nil && !isNil(o.UserId) {
		return true
	}

	return false
}

// SetUserId gets a reference to the given string and assigns it to the UserId field.
func (o *GetVninResponseEntity) SetUserId(v string) {
	o.UserId = &v
}

// GetGender returns the Gender field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetGender() string {
	if o == nil || isNil(o.Gender) {
		var ret string
		return ret
	}
	return *o.Gender
}

// GetGenderOk returns a tuple with the Gender field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetGenderOk() (*string, bool) {
	if o == nil || isNil(o.Gender) {
    return nil, false
	}
	return o.Gender, true
}

// HasGender returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasGender() bool {
	if o != nil && !isNil(o.Gender) {
		return true
	}

	return false
}

// SetGender gets a reference to the given string and assigns it to the Gender field.
func (o *GetVninResponseEntity) SetGender(v string) {
	o.Gender = &v
}

// GetMobile returns the Mobile field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetMobile() string {
	if o == nil || isNil(o.Mobile) {
		var ret string
		return ret
	}
	return *o.Mobile
}

// GetMobileOk returns a tuple with the Mobile field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetMobileOk() (*string, bool) {
	if o == nil || isNil(o.Mobile) {
    return nil, false
	}
	return o.Mobile, true
}

// HasMobile returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasMobile() bool {
	if o != nil && !isNil(o.Mobile) {
		return true
	}

	return false
}

// SetMobile gets a reference to the given string and assigns it to the Mobile field.
func (o *GetVninResponseEntity) SetMobile(v string) {
	o.Mobile = &v
}

// GetDateOfBirth returns the DateOfBirth field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetDateOfBirth() string {
	if o == nil || isNil(o.DateOfBirth) {
		var ret string
		return ret
	}
	return *o.DateOfBirth
}

// GetDateOfBirthOk returns a tuple with the DateOfBirth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetDateOfBirthOk() (*string, bool) {
	if o == nil || isNil(o.DateOfBirth) {
    return nil, false
	}
	return o.DateOfBirth, true
}

// HasDateOfBirth returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasDateOfBirth() bool {
	if o != nil && !isNil(o.DateOfBirth) {
		return true
	}

	return false
}

// SetDateOfBirth gets a reference to the given string and assigns it to the DateOfBirth field.
func (o *GetVninResponseEntity) SetDateOfBirth(v string) {
	o.DateOfBirth = &v
}

// GetPhoto returns the Photo field value if set, zero value otherwise.
func (o *GetVninResponseEntity) GetPhoto() string {
	if o == nil || isNil(o.Photo) {
		var ret string
		return ret
	}
	return *o.Photo
}

// GetPhotoOk returns a tuple with the Photo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetVninResponseEntity) GetPhotoOk() (*string, bool) {
	if o == nil || isNil(o.Photo) {
    return nil, false
	}
	return o.Photo, true
}

// HasPhoto returns a boolean if a field has been set.
func (o *GetVninResponseEntity) HasPhoto() bool {
	if o != nil && !isNil(o.Photo) {
		return true
	}

	return false
}

// SetPhoto gets a reference to the given string and assigns it to the Photo field.
func (o *GetVninResponseEntity) SetPhoto(v string) {
	o.Photo = &v
}

func (o GetVninResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Vnin) {
		toSerialize["vnin"] = o.Vnin
	}
	if !isNil(o.Firstname) {
		toSerialize["firstname"] = o.Firstname
	}
	if !isNil(o.Middlename) {
		toSerialize["middlename"] = o.Middlename
	}
	if !isNil(o.Surname) {
		toSerialize["surname"] = o.Surname
	}
	if !isNil(o.UserId) {
		toSerialize["user_id"] = o.UserId
	}
	if !isNil(o.Gender) {
		toSerialize["gender"] = o.Gender
	}
	if !isNil(o.Mobile) {
		toSerialize["mobile"] = o.Mobile
	}
	if !isNil(o.DateOfBirth) {
		toSerialize["dateOfBirth"] = o.DateOfBirth
	}
	if !isNil(o.Photo) {
		toSerialize["photo"] = o.Photo
	}
	return json.Marshal(toSerialize)
}

type NullableGetVninResponseEntity struct {
	value *GetVninResponseEntity
	isSet bool
}

func (v NullableGetVninResponseEntity) Get() *GetVninResponseEntity {
	return v.value
}

func (v *NullableGetVninResponseEntity) Set(val *GetVninResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableGetVninResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableGetVninResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetVninResponseEntity(val *GetVninResponseEntity) *NullableGetVninResponseEntity {
	return &NullableGetVninResponseEntity{value: val, isSet: true}
}

func (v NullableGetVninResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetVninResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

