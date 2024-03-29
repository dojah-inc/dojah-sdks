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

// GetPassportResponseEntity struct for GetPassportResponseEntity
type GetPassportResponseEntity struct {
	DateOfBirth *string `json:"date_of_birth,omitempty"`
	ExpiryDate *string `json:"expiry_date,omitempty"`
	FirstName *string `json:"first_name,omitempty"`
	Gender *string `json:"gender,omitempty"`
	Id *string `json:"id,omitempty"`
	IsDateOfBirthMatch *bool `json:"is_date_of_birth_match,omitempty"`
	IsFirstNameMatch *bool `json:"is_first_name_match,omitempty"`
	IsLastNameMatch *bool `json:"is_last_name_match,omitempty"`
	IsMiddleNameMatch *bool `json:"is_middle_name_match,omitempty"`
	IssueDate *string `json:"issue_date,omitempty"`
	LastName *string `json:"last_name,omitempty"`
	MiddleName *string `json:"middle_name,omitempty"`
	Picture *string `json:"picture,omitempty"`
	PlaceOfBirth *string `json:"place_of_birth,omitempty"`
	PlaceOfIssue *string `json:"place_of_issue,omitempty"`
	Status *float32 `json:"status,omitempty"`
}

// NewGetPassportResponseEntity instantiates a new GetPassportResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetPassportResponseEntity() *GetPassportResponseEntity {
	this := GetPassportResponseEntity{}
	return &this
}

// NewGetPassportResponseEntityWithDefaults instantiates a new GetPassportResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetPassportResponseEntityWithDefaults() *GetPassportResponseEntity {
	this := GetPassportResponseEntity{}
	return &this
}

// GetDateOfBirth returns the DateOfBirth field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetDateOfBirth() string {
	if o == nil || isNil(o.DateOfBirth) {
		var ret string
		return ret
	}
	return *o.DateOfBirth
}

// GetDateOfBirthOk returns a tuple with the DateOfBirth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetDateOfBirthOk() (*string, bool) {
	if o == nil || isNil(o.DateOfBirth) {
    return nil, false
	}
	return o.DateOfBirth, true
}

// HasDateOfBirth returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasDateOfBirth() bool {
	if o != nil && !isNil(o.DateOfBirth) {
		return true
	}

	return false
}

// SetDateOfBirth gets a reference to the given string and assigns it to the DateOfBirth field.
func (o *GetPassportResponseEntity) SetDateOfBirth(v string) {
	o.DateOfBirth = &v
}

// GetExpiryDate returns the ExpiryDate field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetExpiryDate() string {
	if o == nil || isNil(o.ExpiryDate) {
		var ret string
		return ret
	}
	return *o.ExpiryDate
}

// GetExpiryDateOk returns a tuple with the ExpiryDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetExpiryDateOk() (*string, bool) {
	if o == nil || isNil(o.ExpiryDate) {
    return nil, false
	}
	return o.ExpiryDate, true
}

// HasExpiryDate returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasExpiryDate() bool {
	if o != nil && !isNil(o.ExpiryDate) {
		return true
	}

	return false
}

// SetExpiryDate gets a reference to the given string and assigns it to the ExpiryDate field.
func (o *GetPassportResponseEntity) SetExpiryDate(v string) {
	o.ExpiryDate = &v
}

// GetFirstName returns the FirstName field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetFirstName() string {
	if o == nil || isNil(o.FirstName) {
		var ret string
		return ret
	}
	return *o.FirstName
}

// GetFirstNameOk returns a tuple with the FirstName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetFirstNameOk() (*string, bool) {
	if o == nil || isNil(o.FirstName) {
    return nil, false
	}
	return o.FirstName, true
}

// HasFirstName returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasFirstName() bool {
	if o != nil && !isNil(o.FirstName) {
		return true
	}

	return false
}

// SetFirstName gets a reference to the given string and assigns it to the FirstName field.
func (o *GetPassportResponseEntity) SetFirstName(v string) {
	o.FirstName = &v
}

// GetGender returns the Gender field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetGender() string {
	if o == nil || isNil(o.Gender) {
		var ret string
		return ret
	}
	return *o.Gender
}

// GetGenderOk returns a tuple with the Gender field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetGenderOk() (*string, bool) {
	if o == nil || isNil(o.Gender) {
    return nil, false
	}
	return o.Gender, true
}

// HasGender returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasGender() bool {
	if o != nil && !isNil(o.Gender) {
		return true
	}

	return false
}

// SetGender gets a reference to the given string and assigns it to the Gender field.
func (o *GetPassportResponseEntity) SetGender(v string) {
	o.Gender = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetId() string {
	if o == nil || isNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetIdOk() (*string, bool) {
	if o == nil || isNil(o.Id) {
    return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasId() bool {
	if o != nil && !isNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *GetPassportResponseEntity) SetId(v string) {
	o.Id = &v
}

// GetIsDateOfBirthMatch returns the IsDateOfBirthMatch field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetIsDateOfBirthMatch() bool {
	if o == nil || isNil(o.IsDateOfBirthMatch) {
		var ret bool
		return ret
	}
	return *o.IsDateOfBirthMatch
}

// GetIsDateOfBirthMatchOk returns a tuple with the IsDateOfBirthMatch field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetIsDateOfBirthMatchOk() (*bool, bool) {
	if o == nil || isNil(o.IsDateOfBirthMatch) {
    return nil, false
	}
	return o.IsDateOfBirthMatch, true
}

// HasIsDateOfBirthMatch returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasIsDateOfBirthMatch() bool {
	if o != nil && !isNil(o.IsDateOfBirthMatch) {
		return true
	}

	return false
}

// SetIsDateOfBirthMatch gets a reference to the given bool and assigns it to the IsDateOfBirthMatch field.
func (o *GetPassportResponseEntity) SetIsDateOfBirthMatch(v bool) {
	o.IsDateOfBirthMatch = &v
}

// GetIsFirstNameMatch returns the IsFirstNameMatch field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetIsFirstNameMatch() bool {
	if o == nil || isNil(o.IsFirstNameMatch) {
		var ret bool
		return ret
	}
	return *o.IsFirstNameMatch
}

// GetIsFirstNameMatchOk returns a tuple with the IsFirstNameMatch field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetIsFirstNameMatchOk() (*bool, bool) {
	if o == nil || isNil(o.IsFirstNameMatch) {
    return nil, false
	}
	return o.IsFirstNameMatch, true
}

// HasIsFirstNameMatch returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasIsFirstNameMatch() bool {
	if o != nil && !isNil(o.IsFirstNameMatch) {
		return true
	}

	return false
}

// SetIsFirstNameMatch gets a reference to the given bool and assigns it to the IsFirstNameMatch field.
func (o *GetPassportResponseEntity) SetIsFirstNameMatch(v bool) {
	o.IsFirstNameMatch = &v
}

// GetIsLastNameMatch returns the IsLastNameMatch field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetIsLastNameMatch() bool {
	if o == nil || isNil(o.IsLastNameMatch) {
		var ret bool
		return ret
	}
	return *o.IsLastNameMatch
}

// GetIsLastNameMatchOk returns a tuple with the IsLastNameMatch field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetIsLastNameMatchOk() (*bool, bool) {
	if o == nil || isNil(o.IsLastNameMatch) {
    return nil, false
	}
	return o.IsLastNameMatch, true
}

// HasIsLastNameMatch returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasIsLastNameMatch() bool {
	if o != nil && !isNil(o.IsLastNameMatch) {
		return true
	}

	return false
}

// SetIsLastNameMatch gets a reference to the given bool and assigns it to the IsLastNameMatch field.
func (o *GetPassportResponseEntity) SetIsLastNameMatch(v bool) {
	o.IsLastNameMatch = &v
}

// GetIsMiddleNameMatch returns the IsMiddleNameMatch field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetIsMiddleNameMatch() bool {
	if o == nil || isNil(o.IsMiddleNameMatch) {
		var ret bool
		return ret
	}
	return *o.IsMiddleNameMatch
}

// GetIsMiddleNameMatchOk returns a tuple with the IsMiddleNameMatch field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetIsMiddleNameMatchOk() (*bool, bool) {
	if o == nil || isNil(o.IsMiddleNameMatch) {
    return nil, false
	}
	return o.IsMiddleNameMatch, true
}

// HasIsMiddleNameMatch returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasIsMiddleNameMatch() bool {
	if o != nil && !isNil(o.IsMiddleNameMatch) {
		return true
	}

	return false
}

// SetIsMiddleNameMatch gets a reference to the given bool and assigns it to the IsMiddleNameMatch field.
func (o *GetPassportResponseEntity) SetIsMiddleNameMatch(v bool) {
	o.IsMiddleNameMatch = &v
}

// GetIssueDate returns the IssueDate field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetIssueDate() string {
	if o == nil || isNil(o.IssueDate) {
		var ret string
		return ret
	}
	return *o.IssueDate
}

// GetIssueDateOk returns a tuple with the IssueDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetIssueDateOk() (*string, bool) {
	if o == nil || isNil(o.IssueDate) {
    return nil, false
	}
	return o.IssueDate, true
}

// HasIssueDate returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasIssueDate() bool {
	if o != nil && !isNil(o.IssueDate) {
		return true
	}

	return false
}

// SetIssueDate gets a reference to the given string and assigns it to the IssueDate field.
func (o *GetPassportResponseEntity) SetIssueDate(v string) {
	o.IssueDate = &v
}

// GetLastName returns the LastName field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetLastName() string {
	if o == nil || isNil(o.LastName) {
		var ret string
		return ret
	}
	return *o.LastName
}

// GetLastNameOk returns a tuple with the LastName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetLastNameOk() (*string, bool) {
	if o == nil || isNil(o.LastName) {
    return nil, false
	}
	return o.LastName, true
}

// HasLastName returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasLastName() bool {
	if o != nil && !isNil(o.LastName) {
		return true
	}

	return false
}

// SetLastName gets a reference to the given string and assigns it to the LastName field.
func (o *GetPassportResponseEntity) SetLastName(v string) {
	o.LastName = &v
}

// GetMiddleName returns the MiddleName field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetMiddleName() string {
	if o == nil || isNil(o.MiddleName) {
		var ret string
		return ret
	}
	return *o.MiddleName
}

// GetMiddleNameOk returns a tuple with the MiddleName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetMiddleNameOk() (*string, bool) {
	if o == nil || isNil(o.MiddleName) {
    return nil, false
	}
	return o.MiddleName, true
}

// HasMiddleName returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasMiddleName() bool {
	if o != nil && !isNil(o.MiddleName) {
		return true
	}

	return false
}

// SetMiddleName gets a reference to the given string and assigns it to the MiddleName field.
func (o *GetPassportResponseEntity) SetMiddleName(v string) {
	o.MiddleName = &v
}

// GetPicture returns the Picture field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetPicture() string {
	if o == nil || isNil(o.Picture) {
		var ret string
		return ret
	}
	return *o.Picture
}

// GetPictureOk returns a tuple with the Picture field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetPictureOk() (*string, bool) {
	if o == nil || isNil(o.Picture) {
    return nil, false
	}
	return o.Picture, true
}

// HasPicture returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasPicture() bool {
	if o != nil && !isNil(o.Picture) {
		return true
	}

	return false
}

// SetPicture gets a reference to the given string and assigns it to the Picture field.
func (o *GetPassportResponseEntity) SetPicture(v string) {
	o.Picture = &v
}

// GetPlaceOfBirth returns the PlaceOfBirth field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetPlaceOfBirth() string {
	if o == nil || isNil(o.PlaceOfBirth) {
		var ret string
		return ret
	}
	return *o.PlaceOfBirth
}

// GetPlaceOfBirthOk returns a tuple with the PlaceOfBirth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetPlaceOfBirthOk() (*string, bool) {
	if o == nil || isNil(o.PlaceOfBirth) {
    return nil, false
	}
	return o.PlaceOfBirth, true
}

// HasPlaceOfBirth returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasPlaceOfBirth() bool {
	if o != nil && !isNil(o.PlaceOfBirth) {
		return true
	}

	return false
}

// SetPlaceOfBirth gets a reference to the given string and assigns it to the PlaceOfBirth field.
func (o *GetPassportResponseEntity) SetPlaceOfBirth(v string) {
	o.PlaceOfBirth = &v
}

// GetPlaceOfIssue returns the PlaceOfIssue field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetPlaceOfIssue() string {
	if o == nil || isNil(o.PlaceOfIssue) {
		var ret string
		return ret
	}
	return *o.PlaceOfIssue
}

// GetPlaceOfIssueOk returns a tuple with the PlaceOfIssue field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetPlaceOfIssueOk() (*string, bool) {
	if o == nil || isNil(o.PlaceOfIssue) {
    return nil, false
	}
	return o.PlaceOfIssue, true
}

// HasPlaceOfIssue returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasPlaceOfIssue() bool {
	if o != nil && !isNil(o.PlaceOfIssue) {
		return true
	}

	return false
}

// SetPlaceOfIssue gets a reference to the given string and assigns it to the PlaceOfIssue field.
func (o *GetPassportResponseEntity) SetPlaceOfIssue(v string) {
	o.PlaceOfIssue = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *GetPassportResponseEntity) GetStatus() float32 {
	if o == nil || isNil(o.Status) {
		var ret float32
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetPassportResponseEntity) GetStatusOk() (*float32, bool) {
	if o == nil || isNil(o.Status) {
    return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *GetPassportResponseEntity) HasStatus() bool {
	if o != nil && !isNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given float32 and assigns it to the Status field.
func (o *GetPassportResponseEntity) SetStatus(v float32) {
	o.Status = &v
}

func (o GetPassportResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.DateOfBirth) {
		toSerialize["date_of_birth"] = o.DateOfBirth
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
	if !isNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.IsDateOfBirthMatch) {
		toSerialize["is_date_of_birth_match"] = o.IsDateOfBirthMatch
	}
	if !isNil(o.IsFirstNameMatch) {
		toSerialize["is_first_name_match"] = o.IsFirstNameMatch
	}
	if !isNil(o.IsLastNameMatch) {
		toSerialize["is_last_name_match"] = o.IsLastNameMatch
	}
	if !isNil(o.IsMiddleNameMatch) {
		toSerialize["is_middle_name_match"] = o.IsMiddleNameMatch
	}
	if !isNil(o.IssueDate) {
		toSerialize["issue_date"] = o.IssueDate
	}
	if !isNil(o.LastName) {
		toSerialize["last_name"] = o.LastName
	}
	if !isNil(o.MiddleName) {
		toSerialize["middle_name"] = o.MiddleName
	}
	if !isNil(o.Picture) {
		toSerialize["picture"] = o.Picture
	}
	if !isNil(o.PlaceOfBirth) {
		toSerialize["place_of_birth"] = o.PlaceOfBirth
	}
	if !isNil(o.PlaceOfIssue) {
		toSerialize["place_of_issue"] = o.PlaceOfIssue
	}
	if !isNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullableGetPassportResponseEntity struct {
	value *GetPassportResponseEntity
	isSet bool
}

func (v NullableGetPassportResponseEntity) Get() *GetPassportResponseEntity {
	return v.value
}

func (v *NullableGetPassportResponseEntity) Set(val *GetPassportResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableGetPassportResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableGetPassportResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetPassportResponseEntity(val *GetPassportResponseEntity) *NullableGetPassportResponseEntity {
	return &NullableGetPassportResponseEntity{value: val, isSet: true}
}

func (v NullableGetPassportResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetPassportResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


