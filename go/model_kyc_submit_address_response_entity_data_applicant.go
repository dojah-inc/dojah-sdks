/*
DOJAH Publilc APIs

Use Dojah to verify, onboard and manage user identity across Africa!

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package dojah

import (
	"encoding/json"
)

// KycSubmitAddressResponseEntityDataApplicant struct for KycSubmitAddressResponseEntityDataApplicant
type KycSubmitAddressResponseEntityDataApplicant struct {
	Firstname *string `json:"firstname,omitempty"`
	Lastname *string `json:"lastname,omitempty"`
	Phone *string `json:"phone,omitempty"`
	Middlename *string `json:"middlename,omitempty"`
	Photo *string `json:"photo,omitempty"`
	Gender *string `json:"gender,omitempty"`
	Birthdate *string `json:"birthdate,omitempty"`
}

// NewKycSubmitAddressResponseEntityDataApplicant instantiates a new KycSubmitAddressResponseEntityDataApplicant object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewKycSubmitAddressResponseEntityDataApplicant() *KycSubmitAddressResponseEntityDataApplicant {
	this := KycSubmitAddressResponseEntityDataApplicant{}
	return &this
}

// NewKycSubmitAddressResponseEntityDataApplicantWithDefaults instantiates a new KycSubmitAddressResponseEntityDataApplicant object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewKycSubmitAddressResponseEntityDataApplicantWithDefaults() *KycSubmitAddressResponseEntityDataApplicant {
	this := KycSubmitAddressResponseEntityDataApplicant{}
	return &this
}

// GetFirstname returns the Firstname field value if set, zero value otherwise.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetFirstname() string {
	if o == nil || isNil(o.Firstname) {
		var ret string
		return ret
	}
	return *o.Firstname
}

// GetFirstnameOk returns a tuple with the Firstname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetFirstnameOk() (*string, bool) {
	if o == nil || isNil(o.Firstname) {
    return nil, false
	}
	return o.Firstname, true
}

// HasFirstname returns a boolean if a field has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) HasFirstname() bool {
	if o != nil && !isNil(o.Firstname) {
		return true
	}

	return false
}

// SetFirstname gets a reference to the given string and assigns it to the Firstname field.
func (o *KycSubmitAddressResponseEntityDataApplicant) SetFirstname(v string) {
	o.Firstname = &v
}

// GetLastname returns the Lastname field value if set, zero value otherwise.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetLastname() string {
	if o == nil || isNil(o.Lastname) {
		var ret string
		return ret
	}
	return *o.Lastname
}

// GetLastnameOk returns a tuple with the Lastname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetLastnameOk() (*string, bool) {
	if o == nil || isNil(o.Lastname) {
    return nil, false
	}
	return o.Lastname, true
}

// HasLastname returns a boolean if a field has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) HasLastname() bool {
	if o != nil && !isNil(o.Lastname) {
		return true
	}

	return false
}

// SetLastname gets a reference to the given string and assigns it to the Lastname field.
func (o *KycSubmitAddressResponseEntityDataApplicant) SetLastname(v string) {
	o.Lastname = &v
}

// GetPhone returns the Phone field value if set, zero value otherwise.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetPhone() string {
	if o == nil || isNil(o.Phone) {
		var ret string
		return ret
	}
	return *o.Phone
}

// GetPhoneOk returns a tuple with the Phone field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetPhoneOk() (*string, bool) {
	if o == nil || isNil(o.Phone) {
    return nil, false
	}
	return o.Phone, true
}

// HasPhone returns a boolean if a field has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) HasPhone() bool {
	if o != nil && !isNil(o.Phone) {
		return true
	}

	return false
}

// SetPhone gets a reference to the given string and assigns it to the Phone field.
func (o *KycSubmitAddressResponseEntityDataApplicant) SetPhone(v string) {
	o.Phone = &v
}

// GetMiddlename returns the Middlename field value if set, zero value otherwise.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetMiddlename() string {
	if o == nil || isNil(o.Middlename) {
		var ret string
		return ret
	}
	return *o.Middlename
}

// GetMiddlenameOk returns a tuple with the Middlename field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetMiddlenameOk() (*string, bool) {
	if o == nil || isNil(o.Middlename) {
    return nil, false
	}
	return o.Middlename, true
}

// HasMiddlename returns a boolean if a field has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) HasMiddlename() bool {
	if o != nil && !isNil(o.Middlename) {
		return true
	}

	return false
}

// SetMiddlename gets a reference to the given string and assigns it to the Middlename field.
func (o *KycSubmitAddressResponseEntityDataApplicant) SetMiddlename(v string) {
	o.Middlename = &v
}

// GetPhoto returns the Photo field value if set, zero value otherwise.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetPhoto() string {
	if o == nil || isNil(o.Photo) {
		var ret string
		return ret
	}
	return *o.Photo
}

// GetPhotoOk returns a tuple with the Photo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetPhotoOk() (*string, bool) {
	if o == nil || isNil(o.Photo) {
    return nil, false
	}
	return o.Photo, true
}

// HasPhoto returns a boolean if a field has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) HasPhoto() bool {
	if o != nil && !isNil(o.Photo) {
		return true
	}

	return false
}

// SetPhoto gets a reference to the given string and assigns it to the Photo field.
func (o *KycSubmitAddressResponseEntityDataApplicant) SetPhoto(v string) {
	o.Photo = &v
}

// GetGender returns the Gender field value if set, zero value otherwise.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetGender() string {
	if o == nil || isNil(o.Gender) {
		var ret string
		return ret
	}
	return *o.Gender
}

// GetGenderOk returns a tuple with the Gender field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetGenderOk() (*string, bool) {
	if o == nil || isNil(o.Gender) {
    return nil, false
	}
	return o.Gender, true
}

// HasGender returns a boolean if a field has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) HasGender() bool {
	if o != nil && !isNil(o.Gender) {
		return true
	}

	return false
}

// SetGender gets a reference to the given string and assigns it to the Gender field.
func (o *KycSubmitAddressResponseEntityDataApplicant) SetGender(v string) {
	o.Gender = &v
}

// GetBirthdate returns the Birthdate field value if set, zero value otherwise.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetBirthdate() string {
	if o == nil || isNil(o.Birthdate) {
		var ret string
		return ret
	}
	return *o.Birthdate
}

// GetBirthdateOk returns a tuple with the Birthdate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) GetBirthdateOk() (*string, bool) {
	if o == nil || isNil(o.Birthdate) {
    return nil, false
	}
	return o.Birthdate, true
}

// HasBirthdate returns a boolean if a field has been set.
func (o *KycSubmitAddressResponseEntityDataApplicant) HasBirthdate() bool {
	if o != nil && !isNil(o.Birthdate) {
		return true
	}

	return false
}

// SetBirthdate gets a reference to the given string and assigns it to the Birthdate field.
func (o *KycSubmitAddressResponseEntityDataApplicant) SetBirthdate(v string) {
	o.Birthdate = &v
}

func (o KycSubmitAddressResponseEntityDataApplicant) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Firstname) {
		toSerialize["firstname"] = o.Firstname
	}
	if !isNil(o.Lastname) {
		toSerialize["lastname"] = o.Lastname
	}
	if !isNil(o.Phone) {
		toSerialize["phone"] = o.Phone
	}
	if !isNil(o.Middlename) {
		toSerialize["middlename"] = o.Middlename
	}
	if !isNil(o.Photo) {
		toSerialize["photo"] = o.Photo
	}
	if !isNil(o.Gender) {
		toSerialize["gender"] = o.Gender
	}
	if !isNil(o.Birthdate) {
		toSerialize["birthdate"] = o.Birthdate
	}
	return json.Marshal(toSerialize)
}

type NullableKycSubmitAddressResponseEntityDataApplicant struct {
	value *KycSubmitAddressResponseEntityDataApplicant
	isSet bool
}

func (v NullableKycSubmitAddressResponseEntityDataApplicant) Get() *KycSubmitAddressResponseEntityDataApplicant {
	return v.value
}

func (v *NullableKycSubmitAddressResponseEntityDataApplicant) Set(val *KycSubmitAddressResponseEntityDataApplicant) {
	v.value = val
	v.isSet = true
}

func (v NullableKycSubmitAddressResponseEntityDataApplicant) IsSet() bool {
	return v.isSet
}

func (v *NullableKycSubmitAddressResponseEntityDataApplicant) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableKycSubmitAddressResponseEntityDataApplicant(val *KycSubmitAddressResponseEntityDataApplicant) *NullableKycSubmitAddressResponseEntityDataApplicant {
	return &NullableKycSubmitAddressResponseEntityDataApplicant{value: val, isSet: true}
}

func (v NullableKycSubmitAddressResponseEntityDataApplicant) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableKycSubmitAddressResponseEntityDataApplicant) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

