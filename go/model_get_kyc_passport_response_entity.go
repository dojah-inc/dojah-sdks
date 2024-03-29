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

// GetKycPassportResponseEntity struct for GetKycPassportResponseEntity
type GetKycPassportResponseEntity struct {
	DateOfBirth *string `json:"date_of_birth,omitempty"`
	DateOfIssue *string `json:"date_of_issue,omitempty"`
	DocumentType *string `json:"document_type,omitempty"`
	ExpiryDate *string `json:"expiry_date,omitempty"`
	FirstName *string `json:"first_name,omitempty"`
	Gender *string `json:"gender,omitempty"`
	IssuePlace *string `json:"issue_place,omitempty"`
	OtherNames *string `json:"other_names,omitempty"`
	PassportNumber *string `json:"passport_number,omitempty"`
	Photo *string `json:"photo,omitempty"`
	Surname *string `json:"surname,omitempty"`
}

// NewGetKycPassportResponseEntity instantiates a new GetKycPassportResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetKycPassportResponseEntity() *GetKycPassportResponseEntity {
	this := GetKycPassportResponseEntity{}
	return &this
}

// NewGetKycPassportResponseEntityWithDefaults instantiates a new GetKycPassportResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetKycPassportResponseEntityWithDefaults() *GetKycPassportResponseEntity {
	this := GetKycPassportResponseEntity{}
	return &this
}

// GetDateOfBirth returns the DateOfBirth field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetDateOfBirth() string {
	if o == nil || isNil(o.DateOfBirth) {
		var ret string
		return ret
	}
	return *o.DateOfBirth
}

// GetDateOfBirthOk returns a tuple with the DateOfBirth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetDateOfBirthOk() (*string, bool) {
	if o == nil || isNil(o.DateOfBirth) {
    return nil, false
	}
	return o.DateOfBirth, true
}

// HasDateOfBirth returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasDateOfBirth() bool {
	if o != nil && !isNil(o.DateOfBirth) {
		return true
	}

	return false
}

// SetDateOfBirth gets a reference to the given string and assigns it to the DateOfBirth field.
func (o *GetKycPassportResponseEntity) SetDateOfBirth(v string) {
	o.DateOfBirth = &v
}

// GetDateOfIssue returns the DateOfIssue field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetDateOfIssue() string {
	if o == nil || isNil(o.DateOfIssue) {
		var ret string
		return ret
	}
	return *o.DateOfIssue
}

// GetDateOfIssueOk returns a tuple with the DateOfIssue field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetDateOfIssueOk() (*string, bool) {
	if o == nil || isNil(o.DateOfIssue) {
    return nil, false
	}
	return o.DateOfIssue, true
}

// HasDateOfIssue returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasDateOfIssue() bool {
	if o != nil && !isNil(o.DateOfIssue) {
		return true
	}

	return false
}

// SetDateOfIssue gets a reference to the given string and assigns it to the DateOfIssue field.
func (o *GetKycPassportResponseEntity) SetDateOfIssue(v string) {
	o.DateOfIssue = &v
}

// GetDocumentType returns the DocumentType field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetDocumentType() string {
	if o == nil || isNil(o.DocumentType) {
		var ret string
		return ret
	}
	return *o.DocumentType
}

// GetDocumentTypeOk returns a tuple with the DocumentType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetDocumentTypeOk() (*string, bool) {
	if o == nil || isNil(o.DocumentType) {
    return nil, false
	}
	return o.DocumentType, true
}

// HasDocumentType returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasDocumentType() bool {
	if o != nil && !isNil(o.DocumentType) {
		return true
	}

	return false
}

// SetDocumentType gets a reference to the given string and assigns it to the DocumentType field.
func (o *GetKycPassportResponseEntity) SetDocumentType(v string) {
	o.DocumentType = &v
}

// GetExpiryDate returns the ExpiryDate field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetExpiryDate() string {
	if o == nil || isNil(o.ExpiryDate) {
		var ret string
		return ret
	}
	return *o.ExpiryDate
}

// GetExpiryDateOk returns a tuple with the ExpiryDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetExpiryDateOk() (*string, bool) {
	if o == nil || isNil(o.ExpiryDate) {
    return nil, false
	}
	return o.ExpiryDate, true
}

// HasExpiryDate returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasExpiryDate() bool {
	if o != nil && !isNil(o.ExpiryDate) {
		return true
	}

	return false
}

// SetExpiryDate gets a reference to the given string and assigns it to the ExpiryDate field.
func (o *GetKycPassportResponseEntity) SetExpiryDate(v string) {
	o.ExpiryDate = &v
}

// GetFirstName returns the FirstName field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetFirstName() string {
	if o == nil || isNil(o.FirstName) {
		var ret string
		return ret
	}
	return *o.FirstName
}

// GetFirstNameOk returns a tuple with the FirstName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetFirstNameOk() (*string, bool) {
	if o == nil || isNil(o.FirstName) {
    return nil, false
	}
	return o.FirstName, true
}

// HasFirstName returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasFirstName() bool {
	if o != nil && !isNil(o.FirstName) {
		return true
	}

	return false
}

// SetFirstName gets a reference to the given string and assigns it to the FirstName field.
func (o *GetKycPassportResponseEntity) SetFirstName(v string) {
	o.FirstName = &v
}

// GetGender returns the Gender field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetGender() string {
	if o == nil || isNil(o.Gender) {
		var ret string
		return ret
	}
	return *o.Gender
}

// GetGenderOk returns a tuple with the Gender field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetGenderOk() (*string, bool) {
	if o == nil || isNil(o.Gender) {
    return nil, false
	}
	return o.Gender, true
}

// HasGender returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasGender() bool {
	if o != nil && !isNil(o.Gender) {
		return true
	}

	return false
}

// SetGender gets a reference to the given string and assigns it to the Gender field.
func (o *GetKycPassportResponseEntity) SetGender(v string) {
	o.Gender = &v
}

// GetIssuePlace returns the IssuePlace field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetIssuePlace() string {
	if o == nil || isNil(o.IssuePlace) {
		var ret string
		return ret
	}
	return *o.IssuePlace
}

// GetIssuePlaceOk returns a tuple with the IssuePlace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetIssuePlaceOk() (*string, bool) {
	if o == nil || isNil(o.IssuePlace) {
    return nil, false
	}
	return o.IssuePlace, true
}

// HasIssuePlace returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasIssuePlace() bool {
	if o != nil && !isNil(o.IssuePlace) {
		return true
	}

	return false
}

// SetIssuePlace gets a reference to the given string and assigns it to the IssuePlace field.
func (o *GetKycPassportResponseEntity) SetIssuePlace(v string) {
	o.IssuePlace = &v
}

// GetOtherNames returns the OtherNames field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetOtherNames() string {
	if o == nil || isNil(o.OtherNames) {
		var ret string
		return ret
	}
	return *o.OtherNames
}

// GetOtherNamesOk returns a tuple with the OtherNames field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetOtherNamesOk() (*string, bool) {
	if o == nil || isNil(o.OtherNames) {
    return nil, false
	}
	return o.OtherNames, true
}

// HasOtherNames returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasOtherNames() bool {
	if o != nil && !isNil(o.OtherNames) {
		return true
	}

	return false
}

// SetOtherNames gets a reference to the given string and assigns it to the OtherNames field.
func (o *GetKycPassportResponseEntity) SetOtherNames(v string) {
	o.OtherNames = &v
}

// GetPassportNumber returns the PassportNumber field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetPassportNumber() string {
	if o == nil || isNil(o.PassportNumber) {
		var ret string
		return ret
	}
	return *o.PassportNumber
}

// GetPassportNumberOk returns a tuple with the PassportNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetPassportNumberOk() (*string, bool) {
	if o == nil || isNil(o.PassportNumber) {
    return nil, false
	}
	return o.PassportNumber, true
}

// HasPassportNumber returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasPassportNumber() bool {
	if o != nil && !isNil(o.PassportNumber) {
		return true
	}

	return false
}

// SetPassportNumber gets a reference to the given string and assigns it to the PassportNumber field.
func (o *GetKycPassportResponseEntity) SetPassportNumber(v string) {
	o.PassportNumber = &v
}

// GetPhoto returns the Photo field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetPhoto() string {
	if o == nil || isNil(o.Photo) {
		var ret string
		return ret
	}
	return *o.Photo
}

// GetPhotoOk returns a tuple with the Photo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetPhotoOk() (*string, bool) {
	if o == nil || isNil(o.Photo) {
    return nil, false
	}
	return o.Photo, true
}

// HasPhoto returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasPhoto() bool {
	if o != nil && !isNil(o.Photo) {
		return true
	}

	return false
}

// SetPhoto gets a reference to the given string and assigns it to the Photo field.
func (o *GetKycPassportResponseEntity) SetPhoto(v string) {
	o.Photo = &v
}

// GetSurname returns the Surname field value if set, zero value otherwise.
func (o *GetKycPassportResponseEntity) GetSurname() string {
	if o == nil || isNil(o.Surname) {
		var ret string
		return ret
	}
	return *o.Surname
}

// GetSurnameOk returns a tuple with the Surname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetKycPassportResponseEntity) GetSurnameOk() (*string, bool) {
	if o == nil || isNil(o.Surname) {
    return nil, false
	}
	return o.Surname, true
}

// HasSurname returns a boolean if a field has been set.
func (o *GetKycPassportResponseEntity) HasSurname() bool {
	if o != nil && !isNil(o.Surname) {
		return true
	}

	return false
}

// SetSurname gets a reference to the given string and assigns it to the Surname field.
func (o *GetKycPassportResponseEntity) SetSurname(v string) {
	o.Surname = &v
}

func (o GetKycPassportResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.DateOfBirth) {
		toSerialize["date_of_birth"] = o.DateOfBirth
	}
	if !isNil(o.DateOfIssue) {
		toSerialize["date_of_issue"] = o.DateOfIssue
	}
	if !isNil(o.DocumentType) {
		toSerialize["document_type"] = o.DocumentType
	}
	if !isNil(o.ExpiryDate) {
		toSerialize["expiry_date"] = o.ExpiryDate
	}
	if !isNil(o.FirstName) {
		toSerialize["first_name"] = o.FirstName
	}
	if !isNil(o.Gender) {
		toSerialize["gender"] = o.Gender
	}
	if !isNil(o.IssuePlace) {
		toSerialize["issue_place"] = o.IssuePlace
	}
	if !isNil(o.OtherNames) {
		toSerialize["other_names"] = o.OtherNames
	}
	if !isNil(o.PassportNumber) {
		toSerialize["passport_number"] = o.PassportNumber
	}
	if !isNil(o.Photo) {
		toSerialize["photo"] = o.Photo
	}
	if !isNil(o.Surname) {
		toSerialize["surname"] = o.Surname
	}
	return json.Marshal(toSerialize)
}

type NullableGetKycPassportResponseEntity struct {
	value *GetKycPassportResponseEntity
	isSet bool
}

func (v NullableGetKycPassportResponseEntity) Get() *GetKycPassportResponseEntity {
	return v.value
}

func (v *NullableGetKycPassportResponseEntity) Set(val *GetKycPassportResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableGetKycPassportResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableGetKycPassportResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetKycPassportResponseEntity(val *GetKycPassportResponseEntity) *NullableGetKycPassportResponseEntity {
	return &NullableGetKycPassportResponseEntity{value: val, isSet: true}
}

func (v NullableGetKycPassportResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetKycPassportResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


