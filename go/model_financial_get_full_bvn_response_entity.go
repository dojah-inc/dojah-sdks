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

// FinancialGetFullBvnResponseEntity struct for FinancialGetFullBvnResponseEntity
type FinancialGetFullBvnResponseEntity struct {
	Title *string `json:"title,omitempty"`
	Bvn *string `json:"bvn,omitempty"`
	DateOfBirth *string `json:"date_of_birth,omitempty"`
	Email *string `json:"email,omitempty"`
	EnrollmentBank *string `json:"enrollment_bank,omitempty"`
	EnrollmentBranch *string `json:"enrollment_branch,omitempty"`
	FirstName *string `json:"first_name,omitempty"`
	Gender *string `json:"gender,omitempty"`
	Image *string `json:"image,omitempty"`
	LastName *string `json:"last_name,omitempty"`
	LevelOfAccount *string `json:"level_of_account,omitempty"`
	LgaOfOrigin *string `json:"lga_of_origin,omitempty"`
	LgaOfResidence *string `json:"lga_of_residence,omitempty"`
	MaritalStatus *string `json:"marital_status,omitempty"`
	MiddleName *string `json:"middle_name,omitempty"`
	NameOnCard *string `json:"name_on_card,omitempty"`
	Nationality *string `json:"nationality,omitempty"`
	Nin *string `json:"nin,omitempty"`
	PhoneNumber1 *string `json:"phone_number1,omitempty"`
	PhoneNumber2 *string `json:"phone_number2,omitempty"`
	RegistrationDate *string `json:"registration_date,omitempty"`
	ResidentialAddress *string `json:"residential_address,omitempty"`
	StateOfOrigin *string `json:"state_of_origin,omitempty"`
	StateOfResidence *string `json:"state_of_residence,omitempty"`
	WatchListed *string `json:"watch_listed,omitempty"`
}

// NewFinancialGetFullBvnResponseEntity instantiates a new FinancialGetFullBvnResponseEntity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFinancialGetFullBvnResponseEntity() *FinancialGetFullBvnResponseEntity {
	this := FinancialGetFullBvnResponseEntity{}
	return &this
}

// NewFinancialGetFullBvnResponseEntityWithDefaults instantiates a new FinancialGetFullBvnResponseEntity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFinancialGetFullBvnResponseEntityWithDefaults() *FinancialGetFullBvnResponseEntity {
	this := FinancialGetFullBvnResponseEntity{}
	return &this
}

// GetTitle returns the Title field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetTitle() string {
	if o == nil || isNil(o.Title) {
		var ret string
		return ret
	}
	return *o.Title
}

// GetTitleOk returns a tuple with the Title field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetTitleOk() (*string, bool) {
	if o == nil || isNil(o.Title) {
    return nil, false
	}
	return o.Title, true
}

// HasTitle returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasTitle() bool {
	if o != nil && !isNil(o.Title) {
		return true
	}

	return false
}

// SetTitle gets a reference to the given string and assigns it to the Title field.
func (o *FinancialGetFullBvnResponseEntity) SetTitle(v string) {
	o.Title = &v
}

// GetBvn returns the Bvn field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetBvn() string {
	if o == nil || isNil(o.Bvn) {
		var ret string
		return ret
	}
	return *o.Bvn
}

// GetBvnOk returns a tuple with the Bvn field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetBvnOk() (*string, bool) {
	if o == nil || isNil(o.Bvn) {
    return nil, false
	}
	return o.Bvn, true
}

// HasBvn returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasBvn() bool {
	if o != nil && !isNil(o.Bvn) {
		return true
	}

	return false
}

// SetBvn gets a reference to the given string and assigns it to the Bvn field.
func (o *FinancialGetFullBvnResponseEntity) SetBvn(v string) {
	o.Bvn = &v
}

// GetDateOfBirth returns the DateOfBirth field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetDateOfBirth() string {
	if o == nil || isNil(o.DateOfBirth) {
		var ret string
		return ret
	}
	return *o.DateOfBirth
}

// GetDateOfBirthOk returns a tuple with the DateOfBirth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetDateOfBirthOk() (*string, bool) {
	if o == nil || isNil(o.DateOfBirth) {
    return nil, false
	}
	return o.DateOfBirth, true
}

// HasDateOfBirth returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasDateOfBirth() bool {
	if o != nil && !isNil(o.DateOfBirth) {
		return true
	}

	return false
}

// SetDateOfBirth gets a reference to the given string and assigns it to the DateOfBirth field.
func (o *FinancialGetFullBvnResponseEntity) SetDateOfBirth(v string) {
	o.DateOfBirth = &v
}

// GetEmail returns the Email field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetEmail() string {
	if o == nil || isNil(o.Email) {
		var ret string
		return ret
	}
	return *o.Email
}

// GetEmailOk returns a tuple with the Email field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetEmailOk() (*string, bool) {
	if o == nil || isNil(o.Email) {
    return nil, false
	}
	return o.Email, true
}

// HasEmail returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasEmail() bool {
	if o != nil && !isNil(o.Email) {
		return true
	}

	return false
}

// SetEmail gets a reference to the given string and assigns it to the Email field.
func (o *FinancialGetFullBvnResponseEntity) SetEmail(v string) {
	o.Email = &v
}

// GetEnrollmentBank returns the EnrollmentBank field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetEnrollmentBank() string {
	if o == nil || isNil(o.EnrollmentBank) {
		var ret string
		return ret
	}
	return *o.EnrollmentBank
}

// GetEnrollmentBankOk returns a tuple with the EnrollmentBank field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetEnrollmentBankOk() (*string, bool) {
	if o == nil || isNil(o.EnrollmentBank) {
    return nil, false
	}
	return o.EnrollmentBank, true
}

// HasEnrollmentBank returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasEnrollmentBank() bool {
	if o != nil && !isNil(o.EnrollmentBank) {
		return true
	}

	return false
}

// SetEnrollmentBank gets a reference to the given string and assigns it to the EnrollmentBank field.
func (o *FinancialGetFullBvnResponseEntity) SetEnrollmentBank(v string) {
	o.EnrollmentBank = &v
}

// GetEnrollmentBranch returns the EnrollmentBranch field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetEnrollmentBranch() string {
	if o == nil || isNil(o.EnrollmentBranch) {
		var ret string
		return ret
	}
	return *o.EnrollmentBranch
}

// GetEnrollmentBranchOk returns a tuple with the EnrollmentBranch field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetEnrollmentBranchOk() (*string, bool) {
	if o == nil || isNil(o.EnrollmentBranch) {
    return nil, false
	}
	return o.EnrollmentBranch, true
}

// HasEnrollmentBranch returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasEnrollmentBranch() bool {
	if o != nil && !isNil(o.EnrollmentBranch) {
		return true
	}

	return false
}

// SetEnrollmentBranch gets a reference to the given string and assigns it to the EnrollmentBranch field.
func (o *FinancialGetFullBvnResponseEntity) SetEnrollmentBranch(v string) {
	o.EnrollmentBranch = &v
}

// GetFirstName returns the FirstName field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetFirstName() string {
	if o == nil || isNil(o.FirstName) {
		var ret string
		return ret
	}
	return *o.FirstName
}

// GetFirstNameOk returns a tuple with the FirstName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetFirstNameOk() (*string, bool) {
	if o == nil || isNil(o.FirstName) {
    return nil, false
	}
	return o.FirstName, true
}

// HasFirstName returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasFirstName() bool {
	if o != nil && !isNil(o.FirstName) {
		return true
	}

	return false
}

// SetFirstName gets a reference to the given string and assigns it to the FirstName field.
func (o *FinancialGetFullBvnResponseEntity) SetFirstName(v string) {
	o.FirstName = &v
}

// GetGender returns the Gender field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetGender() string {
	if o == nil || isNil(o.Gender) {
		var ret string
		return ret
	}
	return *o.Gender
}

// GetGenderOk returns a tuple with the Gender field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetGenderOk() (*string, bool) {
	if o == nil || isNil(o.Gender) {
    return nil, false
	}
	return o.Gender, true
}

// HasGender returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasGender() bool {
	if o != nil && !isNil(o.Gender) {
		return true
	}

	return false
}

// SetGender gets a reference to the given string and assigns it to the Gender field.
func (o *FinancialGetFullBvnResponseEntity) SetGender(v string) {
	o.Gender = &v
}

// GetImage returns the Image field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetImage() string {
	if o == nil || isNil(o.Image) {
		var ret string
		return ret
	}
	return *o.Image
}

// GetImageOk returns a tuple with the Image field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetImageOk() (*string, bool) {
	if o == nil || isNil(o.Image) {
    return nil, false
	}
	return o.Image, true
}

// HasImage returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasImage() bool {
	if o != nil && !isNil(o.Image) {
		return true
	}

	return false
}

// SetImage gets a reference to the given string and assigns it to the Image field.
func (o *FinancialGetFullBvnResponseEntity) SetImage(v string) {
	o.Image = &v
}

// GetLastName returns the LastName field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetLastName() string {
	if o == nil || isNil(o.LastName) {
		var ret string
		return ret
	}
	return *o.LastName
}

// GetLastNameOk returns a tuple with the LastName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetLastNameOk() (*string, bool) {
	if o == nil || isNil(o.LastName) {
    return nil, false
	}
	return o.LastName, true
}

// HasLastName returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasLastName() bool {
	if o != nil && !isNil(o.LastName) {
		return true
	}

	return false
}

// SetLastName gets a reference to the given string and assigns it to the LastName field.
func (o *FinancialGetFullBvnResponseEntity) SetLastName(v string) {
	o.LastName = &v
}

// GetLevelOfAccount returns the LevelOfAccount field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetLevelOfAccount() string {
	if o == nil || isNil(o.LevelOfAccount) {
		var ret string
		return ret
	}
	return *o.LevelOfAccount
}

// GetLevelOfAccountOk returns a tuple with the LevelOfAccount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetLevelOfAccountOk() (*string, bool) {
	if o == nil || isNil(o.LevelOfAccount) {
    return nil, false
	}
	return o.LevelOfAccount, true
}

// HasLevelOfAccount returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasLevelOfAccount() bool {
	if o != nil && !isNil(o.LevelOfAccount) {
		return true
	}

	return false
}

// SetLevelOfAccount gets a reference to the given string and assigns it to the LevelOfAccount field.
func (o *FinancialGetFullBvnResponseEntity) SetLevelOfAccount(v string) {
	o.LevelOfAccount = &v
}

// GetLgaOfOrigin returns the LgaOfOrigin field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetLgaOfOrigin() string {
	if o == nil || isNil(o.LgaOfOrigin) {
		var ret string
		return ret
	}
	return *o.LgaOfOrigin
}

// GetLgaOfOriginOk returns a tuple with the LgaOfOrigin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetLgaOfOriginOk() (*string, bool) {
	if o == nil || isNil(o.LgaOfOrigin) {
    return nil, false
	}
	return o.LgaOfOrigin, true
}

// HasLgaOfOrigin returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasLgaOfOrigin() bool {
	if o != nil && !isNil(o.LgaOfOrigin) {
		return true
	}

	return false
}

// SetLgaOfOrigin gets a reference to the given string and assigns it to the LgaOfOrigin field.
func (o *FinancialGetFullBvnResponseEntity) SetLgaOfOrigin(v string) {
	o.LgaOfOrigin = &v
}

// GetLgaOfResidence returns the LgaOfResidence field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetLgaOfResidence() string {
	if o == nil || isNil(o.LgaOfResidence) {
		var ret string
		return ret
	}
	return *o.LgaOfResidence
}

// GetLgaOfResidenceOk returns a tuple with the LgaOfResidence field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetLgaOfResidenceOk() (*string, bool) {
	if o == nil || isNil(o.LgaOfResidence) {
    return nil, false
	}
	return o.LgaOfResidence, true
}

// HasLgaOfResidence returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasLgaOfResidence() bool {
	if o != nil && !isNil(o.LgaOfResidence) {
		return true
	}

	return false
}

// SetLgaOfResidence gets a reference to the given string and assigns it to the LgaOfResidence field.
func (o *FinancialGetFullBvnResponseEntity) SetLgaOfResidence(v string) {
	o.LgaOfResidence = &v
}

// GetMaritalStatus returns the MaritalStatus field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetMaritalStatus() string {
	if o == nil || isNil(o.MaritalStatus) {
		var ret string
		return ret
	}
	return *o.MaritalStatus
}

// GetMaritalStatusOk returns a tuple with the MaritalStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetMaritalStatusOk() (*string, bool) {
	if o == nil || isNil(o.MaritalStatus) {
    return nil, false
	}
	return o.MaritalStatus, true
}

// HasMaritalStatus returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasMaritalStatus() bool {
	if o != nil && !isNil(o.MaritalStatus) {
		return true
	}

	return false
}

// SetMaritalStatus gets a reference to the given string and assigns it to the MaritalStatus field.
func (o *FinancialGetFullBvnResponseEntity) SetMaritalStatus(v string) {
	o.MaritalStatus = &v
}

// GetMiddleName returns the MiddleName field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetMiddleName() string {
	if o == nil || isNil(o.MiddleName) {
		var ret string
		return ret
	}
	return *o.MiddleName
}

// GetMiddleNameOk returns a tuple with the MiddleName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetMiddleNameOk() (*string, bool) {
	if o == nil || isNil(o.MiddleName) {
    return nil, false
	}
	return o.MiddleName, true
}

// HasMiddleName returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasMiddleName() bool {
	if o != nil && !isNil(o.MiddleName) {
		return true
	}

	return false
}

// SetMiddleName gets a reference to the given string and assigns it to the MiddleName field.
func (o *FinancialGetFullBvnResponseEntity) SetMiddleName(v string) {
	o.MiddleName = &v
}

// GetNameOnCard returns the NameOnCard field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetNameOnCard() string {
	if o == nil || isNil(o.NameOnCard) {
		var ret string
		return ret
	}
	return *o.NameOnCard
}

// GetNameOnCardOk returns a tuple with the NameOnCard field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetNameOnCardOk() (*string, bool) {
	if o == nil || isNil(o.NameOnCard) {
    return nil, false
	}
	return o.NameOnCard, true
}

// HasNameOnCard returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasNameOnCard() bool {
	if o != nil && !isNil(o.NameOnCard) {
		return true
	}

	return false
}

// SetNameOnCard gets a reference to the given string and assigns it to the NameOnCard field.
func (o *FinancialGetFullBvnResponseEntity) SetNameOnCard(v string) {
	o.NameOnCard = &v
}

// GetNationality returns the Nationality field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetNationality() string {
	if o == nil || isNil(o.Nationality) {
		var ret string
		return ret
	}
	return *o.Nationality
}

// GetNationalityOk returns a tuple with the Nationality field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetNationalityOk() (*string, bool) {
	if o == nil || isNil(o.Nationality) {
    return nil, false
	}
	return o.Nationality, true
}

// HasNationality returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasNationality() bool {
	if o != nil && !isNil(o.Nationality) {
		return true
	}

	return false
}

// SetNationality gets a reference to the given string and assigns it to the Nationality field.
func (o *FinancialGetFullBvnResponseEntity) SetNationality(v string) {
	o.Nationality = &v
}

// GetNin returns the Nin field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetNin() string {
	if o == nil || isNil(o.Nin) {
		var ret string
		return ret
	}
	return *o.Nin
}

// GetNinOk returns a tuple with the Nin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetNinOk() (*string, bool) {
	if o == nil || isNil(o.Nin) {
    return nil, false
	}
	return o.Nin, true
}

// HasNin returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasNin() bool {
	if o != nil && !isNil(o.Nin) {
		return true
	}

	return false
}

// SetNin gets a reference to the given string and assigns it to the Nin field.
func (o *FinancialGetFullBvnResponseEntity) SetNin(v string) {
	o.Nin = &v
}

// GetPhoneNumber1 returns the PhoneNumber1 field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetPhoneNumber1() string {
	if o == nil || isNil(o.PhoneNumber1) {
		var ret string
		return ret
	}
	return *o.PhoneNumber1
}

// GetPhoneNumber1Ok returns a tuple with the PhoneNumber1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetPhoneNumber1Ok() (*string, bool) {
	if o == nil || isNil(o.PhoneNumber1) {
    return nil, false
	}
	return o.PhoneNumber1, true
}

// HasPhoneNumber1 returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasPhoneNumber1() bool {
	if o != nil && !isNil(o.PhoneNumber1) {
		return true
	}

	return false
}

// SetPhoneNumber1 gets a reference to the given string and assigns it to the PhoneNumber1 field.
func (o *FinancialGetFullBvnResponseEntity) SetPhoneNumber1(v string) {
	o.PhoneNumber1 = &v
}

// GetPhoneNumber2 returns the PhoneNumber2 field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetPhoneNumber2() string {
	if o == nil || isNil(o.PhoneNumber2) {
		var ret string
		return ret
	}
	return *o.PhoneNumber2
}

// GetPhoneNumber2Ok returns a tuple with the PhoneNumber2 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetPhoneNumber2Ok() (*string, bool) {
	if o == nil || isNil(o.PhoneNumber2) {
    return nil, false
	}
	return o.PhoneNumber2, true
}

// HasPhoneNumber2 returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasPhoneNumber2() bool {
	if o != nil && !isNil(o.PhoneNumber2) {
		return true
	}

	return false
}

// SetPhoneNumber2 gets a reference to the given string and assigns it to the PhoneNumber2 field.
func (o *FinancialGetFullBvnResponseEntity) SetPhoneNumber2(v string) {
	o.PhoneNumber2 = &v
}

// GetRegistrationDate returns the RegistrationDate field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetRegistrationDate() string {
	if o == nil || isNil(o.RegistrationDate) {
		var ret string
		return ret
	}
	return *o.RegistrationDate
}

// GetRegistrationDateOk returns a tuple with the RegistrationDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetRegistrationDateOk() (*string, bool) {
	if o == nil || isNil(o.RegistrationDate) {
    return nil, false
	}
	return o.RegistrationDate, true
}

// HasRegistrationDate returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasRegistrationDate() bool {
	if o != nil && !isNil(o.RegistrationDate) {
		return true
	}

	return false
}

// SetRegistrationDate gets a reference to the given string and assigns it to the RegistrationDate field.
func (o *FinancialGetFullBvnResponseEntity) SetRegistrationDate(v string) {
	o.RegistrationDate = &v
}

// GetResidentialAddress returns the ResidentialAddress field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetResidentialAddress() string {
	if o == nil || isNil(o.ResidentialAddress) {
		var ret string
		return ret
	}
	return *o.ResidentialAddress
}

// GetResidentialAddressOk returns a tuple with the ResidentialAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetResidentialAddressOk() (*string, bool) {
	if o == nil || isNil(o.ResidentialAddress) {
    return nil, false
	}
	return o.ResidentialAddress, true
}

// HasResidentialAddress returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasResidentialAddress() bool {
	if o != nil && !isNil(o.ResidentialAddress) {
		return true
	}

	return false
}

// SetResidentialAddress gets a reference to the given string and assigns it to the ResidentialAddress field.
func (o *FinancialGetFullBvnResponseEntity) SetResidentialAddress(v string) {
	o.ResidentialAddress = &v
}

// GetStateOfOrigin returns the StateOfOrigin field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetStateOfOrigin() string {
	if o == nil || isNil(o.StateOfOrigin) {
		var ret string
		return ret
	}
	return *o.StateOfOrigin
}

// GetStateOfOriginOk returns a tuple with the StateOfOrigin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetStateOfOriginOk() (*string, bool) {
	if o == nil || isNil(o.StateOfOrigin) {
    return nil, false
	}
	return o.StateOfOrigin, true
}

// HasStateOfOrigin returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasStateOfOrigin() bool {
	if o != nil && !isNil(o.StateOfOrigin) {
		return true
	}

	return false
}

// SetStateOfOrigin gets a reference to the given string and assigns it to the StateOfOrigin field.
func (o *FinancialGetFullBvnResponseEntity) SetStateOfOrigin(v string) {
	o.StateOfOrigin = &v
}

// GetStateOfResidence returns the StateOfResidence field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetStateOfResidence() string {
	if o == nil || isNil(o.StateOfResidence) {
		var ret string
		return ret
	}
	return *o.StateOfResidence
}

// GetStateOfResidenceOk returns a tuple with the StateOfResidence field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetStateOfResidenceOk() (*string, bool) {
	if o == nil || isNil(o.StateOfResidence) {
    return nil, false
	}
	return o.StateOfResidence, true
}

// HasStateOfResidence returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasStateOfResidence() bool {
	if o != nil && !isNil(o.StateOfResidence) {
		return true
	}

	return false
}

// SetStateOfResidence gets a reference to the given string and assigns it to the StateOfResidence field.
func (o *FinancialGetFullBvnResponseEntity) SetStateOfResidence(v string) {
	o.StateOfResidence = &v
}

// GetWatchListed returns the WatchListed field value if set, zero value otherwise.
func (o *FinancialGetFullBvnResponseEntity) GetWatchListed() string {
	if o == nil || isNil(o.WatchListed) {
		var ret string
		return ret
	}
	return *o.WatchListed
}

// GetWatchListedOk returns a tuple with the WatchListed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FinancialGetFullBvnResponseEntity) GetWatchListedOk() (*string, bool) {
	if o == nil || isNil(o.WatchListed) {
    return nil, false
	}
	return o.WatchListed, true
}

// HasWatchListed returns a boolean if a field has been set.
func (o *FinancialGetFullBvnResponseEntity) HasWatchListed() bool {
	if o != nil && !isNil(o.WatchListed) {
		return true
	}

	return false
}

// SetWatchListed gets a reference to the given string and assigns it to the WatchListed field.
func (o *FinancialGetFullBvnResponseEntity) SetWatchListed(v string) {
	o.WatchListed = &v
}

func (o FinancialGetFullBvnResponseEntity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Title) {
		toSerialize["title"] = o.Title
	}
	if !isNil(o.Bvn) {
		toSerialize["bvn"] = o.Bvn
	}
	if !isNil(o.DateOfBirth) {
		toSerialize["date_of_birth"] = o.DateOfBirth
	}
	if !isNil(o.Email) {
		toSerialize["email"] = o.Email
	}
	if !isNil(o.EnrollmentBank) {
		toSerialize["enrollment_bank"] = o.EnrollmentBank
	}
	if !isNil(o.EnrollmentBranch) {
		toSerialize["enrollment_branch"] = o.EnrollmentBranch
	}
	if !isNil(o.FirstName) {
		toSerialize["first_name"] = o.FirstName
	}
	if !isNil(o.Gender) {
		toSerialize["gender"] = o.Gender
	}
	if !isNil(o.Image) {
		toSerialize["image"] = o.Image
	}
	if !isNil(o.LastName) {
		toSerialize["last_name"] = o.LastName
	}
	if !isNil(o.LevelOfAccount) {
		toSerialize["level_of_account"] = o.LevelOfAccount
	}
	if !isNil(o.LgaOfOrigin) {
		toSerialize["lga_of_origin"] = o.LgaOfOrigin
	}
	if !isNil(o.LgaOfResidence) {
		toSerialize["lga_of_residence"] = o.LgaOfResidence
	}
	if !isNil(o.MaritalStatus) {
		toSerialize["marital_status"] = o.MaritalStatus
	}
	if !isNil(o.MiddleName) {
		toSerialize["middle_name"] = o.MiddleName
	}
	if !isNil(o.NameOnCard) {
		toSerialize["name_on_card"] = o.NameOnCard
	}
	if !isNil(o.Nationality) {
		toSerialize["nationality"] = o.Nationality
	}
	if !isNil(o.Nin) {
		toSerialize["nin"] = o.Nin
	}
	if !isNil(o.PhoneNumber1) {
		toSerialize["phone_number1"] = o.PhoneNumber1
	}
	if !isNil(o.PhoneNumber2) {
		toSerialize["phone_number2"] = o.PhoneNumber2
	}
	if !isNil(o.RegistrationDate) {
		toSerialize["registration_date"] = o.RegistrationDate
	}
	if !isNil(o.ResidentialAddress) {
		toSerialize["residential_address"] = o.ResidentialAddress
	}
	if !isNil(o.StateOfOrigin) {
		toSerialize["state_of_origin"] = o.StateOfOrigin
	}
	if !isNil(o.StateOfResidence) {
		toSerialize["state_of_residence"] = o.StateOfResidence
	}
	if !isNil(o.WatchListed) {
		toSerialize["watch_listed"] = o.WatchListed
	}
	return json.Marshal(toSerialize)
}

type NullableFinancialGetFullBvnResponseEntity struct {
	value *FinancialGetFullBvnResponseEntity
	isSet bool
}

func (v NullableFinancialGetFullBvnResponseEntity) Get() *FinancialGetFullBvnResponseEntity {
	return v.value
}

func (v *NullableFinancialGetFullBvnResponseEntity) Set(val *FinancialGetFullBvnResponseEntity) {
	v.value = val
	v.isSet = true
}

func (v NullableFinancialGetFullBvnResponseEntity) IsSet() bool {
	return v.isSet
}

func (v *NullableFinancialGetFullBvnResponseEntity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFinancialGetFullBvnResponseEntity(val *FinancialGetFullBvnResponseEntity) *NullableFinancialGetFullBvnResponseEntity {
	return &NullableFinancialGetFullBvnResponseEntity{value: val, isSet: true}
}

func (v NullableFinancialGetFullBvnResponseEntity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFinancialGetFullBvnResponseEntity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

