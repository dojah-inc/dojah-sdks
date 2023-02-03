# GetPassportResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateOfBirth** | Pointer to **string** |  | [optional] 
**ExpiryDate** | Pointer to **string** |  | [optional] 
**FirstName** | Pointer to **string** |  | [optional] 
**Gender** | Pointer to **string** |  | [optional] 
**Id** | Pointer to **string** |  | [optional] 
**IsDateOfBirthMatch** | Pointer to **bool** |  | [optional] 
**IsFirstNameMatch** | Pointer to **bool** |  | [optional] 
**IsLastNameMatch** | Pointer to **bool** |  | [optional] 
**IsMiddleNameMatch** | Pointer to **bool** |  | [optional] 
**IssueDate** | Pointer to **string** |  | [optional] 
**LastName** | Pointer to **string** |  | [optional] 
**MiddleName** | Pointer to **string** |  | [optional] 
**Picture** | Pointer to **string** |  | [optional] 
**PlaceOfBirth** | Pointer to **string** |  | [optional] 
**PlaceOfIssue** | Pointer to **string** |  | [optional] 
**Status** | Pointer to **float32** |  | [optional] 

## Methods

### NewGetPassportResponseEntity

`func NewGetPassportResponseEntity() *GetPassportResponseEntity`

NewGetPassportResponseEntity instantiates a new GetPassportResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPassportResponseEntityWithDefaults

`func NewGetPassportResponseEntityWithDefaults() *GetPassportResponseEntity`

NewGetPassportResponseEntityWithDefaults instantiates a new GetPassportResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDateOfBirth

`func (o *GetPassportResponseEntity) GetDateOfBirth() string`

GetDateOfBirth returns the DateOfBirth field if non-nil, zero value otherwise.

### GetDateOfBirthOk

`func (o *GetPassportResponseEntity) GetDateOfBirthOk() (*string, bool)`

GetDateOfBirthOk returns a tuple with the DateOfBirth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateOfBirth

`func (o *GetPassportResponseEntity) SetDateOfBirth(v string)`

SetDateOfBirth sets DateOfBirth field to given value.

### HasDateOfBirth

`func (o *GetPassportResponseEntity) HasDateOfBirth() bool`

HasDateOfBirth returns a boolean if a field has been set.

### GetExpiryDate

`func (o *GetPassportResponseEntity) GetExpiryDate() string`

GetExpiryDate returns the ExpiryDate field if non-nil, zero value otherwise.

### GetExpiryDateOk

`func (o *GetPassportResponseEntity) GetExpiryDateOk() (*string, bool)`

GetExpiryDateOk returns a tuple with the ExpiryDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiryDate

`func (o *GetPassportResponseEntity) SetExpiryDate(v string)`

SetExpiryDate sets ExpiryDate field to given value.

### HasExpiryDate

`func (o *GetPassportResponseEntity) HasExpiryDate() bool`

HasExpiryDate returns a boolean if a field has been set.

### GetFirstName

`func (o *GetPassportResponseEntity) GetFirstName() string`

GetFirstName returns the FirstName field if non-nil, zero value otherwise.

### GetFirstNameOk

`func (o *GetPassportResponseEntity) GetFirstNameOk() (*string, bool)`

GetFirstNameOk returns a tuple with the FirstName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstName

`func (o *GetPassportResponseEntity) SetFirstName(v string)`

SetFirstName sets FirstName field to given value.

### HasFirstName

`func (o *GetPassportResponseEntity) HasFirstName() bool`

HasFirstName returns a boolean if a field has been set.

### GetGender

`func (o *GetPassportResponseEntity) GetGender() string`

GetGender returns the Gender field if non-nil, zero value otherwise.

### GetGenderOk

`func (o *GetPassportResponseEntity) GetGenderOk() (*string, bool)`

GetGenderOk returns a tuple with the Gender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGender

`func (o *GetPassportResponseEntity) SetGender(v string)`

SetGender sets Gender field to given value.

### HasGender

`func (o *GetPassportResponseEntity) HasGender() bool`

HasGender returns a boolean if a field has been set.

### GetId

`func (o *GetPassportResponseEntity) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GetPassportResponseEntity) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GetPassportResponseEntity) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *GetPassportResponseEntity) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIsDateOfBirthMatch

`func (o *GetPassportResponseEntity) GetIsDateOfBirthMatch() bool`

GetIsDateOfBirthMatch returns the IsDateOfBirthMatch field if non-nil, zero value otherwise.

### GetIsDateOfBirthMatchOk

`func (o *GetPassportResponseEntity) GetIsDateOfBirthMatchOk() (*bool, bool)`

GetIsDateOfBirthMatchOk returns a tuple with the IsDateOfBirthMatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDateOfBirthMatch

`func (o *GetPassportResponseEntity) SetIsDateOfBirthMatch(v bool)`

SetIsDateOfBirthMatch sets IsDateOfBirthMatch field to given value.

### HasIsDateOfBirthMatch

`func (o *GetPassportResponseEntity) HasIsDateOfBirthMatch() bool`

HasIsDateOfBirthMatch returns a boolean if a field has been set.

### GetIsFirstNameMatch

`func (o *GetPassportResponseEntity) GetIsFirstNameMatch() bool`

GetIsFirstNameMatch returns the IsFirstNameMatch field if non-nil, zero value otherwise.

### GetIsFirstNameMatchOk

`func (o *GetPassportResponseEntity) GetIsFirstNameMatchOk() (*bool, bool)`

GetIsFirstNameMatchOk returns a tuple with the IsFirstNameMatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFirstNameMatch

`func (o *GetPassportResponseEntity) SetIsFirstNameMatch(v bool)`

SetIsFirstNameMatch sets IsFirstNameMatch field to given value.

### HasIsFirstNameMatch

`func (o *GetPassportResponseEntity) HasIsFirstNameMatch() bool`

HasIsFirstNameMatch returns a boolean if a field has been set.

### GetIsLastNameMatch

`func (o *GetPassportResponseEntity) GetIsLastNameMatch() bool`

GetIsLastNameMatch returns the IsLastNameMatch field if non-nil, zero value otherwise.

### GetIsLastNameMatchOk

`func (o *GetPassportResponseEntity) GetIsLastNameMatchOk() (*bool, bool)`

GetIsLastNameMatchOk returns a tuple with the IsLastNameMatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLastNameMatch

`func (o *GetPassportResponseEntity) SetIsLastNameMatch(v bool)`

SetIsLastNameMatch sets IsLastNameMatch field to given value.

### HasIsLastNameMatch

`func (o *GetPassportResponseEntity) HasIsLastNameMatch() bool`

HasIsLastNameMatch returns a boolean if a field has been set.

### GetIsMiddleNameMatch

`func (o *GetPassportResponseEntity) GetIsMiddleNameMatch() bool`

GetIsMiddleNameMatch returns the IsMiddleNameMatch field if non-nil, zero value otherwise.

### GetIsMiddleNameMatchOk

`func (o *GetPassportResponseEntity) GetIsMiddleNameMatchOk() (*bool, bool)`

GetIsMiddleNameMatchOk returns a tuple with the IsMiddleNameMatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMiddleNameMatch

`func (o *GetPassportResponseEntity) SetIsMiddleNameMatch(v bool)`

SetIsMiddleNameMatch sets IsMiddleNameMatch field to given value.

### HasIsMiddleNameMatch

`func (o *GetPassportResponseEntity) HasIsMiddleNameMatch() bool`

HasIsMiddleNameMatch returns a boolean if a field has been set.

### GetIssueDate

`func (o *GetPassportResponseEntity) GetIssueDate() string`

GetIssueDate returns the IssueDate field if non-nil, zero value otherwise.

### GetIssueDateOk

`func (o *GetPassportResponseEntity) GetIssueDateOk() (*string, bool)`

GetIssueDateOk returns a tuple with the IssueDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssueDate

`func (o *GetPassportResponseEntity) SetIssueDate(v string)`

SetIssueDate sets IssueDate field to given value.

### HasIssueDate

`func (o *GetPassportResponseEntity) HasIssueDate() bool`

HasIssueDate returns a boolean if a field has been set.

### GetLastName

`func (o *GetPassportResponseEntity) GetLastName() string`

GetLastName returns the LastName field if non-nil, zero value otherwise.

### GetLastNameOk

`func (o *GetPassportResponseEntity) GetLastNameOk() (*string, bool)`

GetLastNameOk returns a tuple with the LastName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastName

`func (o *GetPassportResponseEntity) SetLastName(v string)`

SetLastName sets LastName field to given value.

### HasLastName

`func (o *GetPassportResponseEntity) HasLastName() bool`

HasLastName returns a boolean if a field has been set.

### GetMiddleName

`func (o *GetPassportResponseEntity) GetMiddleName() string`

GetMiddleName returns the MiddleName field if non-nil, zero value otherwise.

### GetMiddleNameOk

`func (o *GetPassportResponseEntity) GetMiddleNameOk() (*string, bool)`

GetMiddleNameOk returns a tuple with the MiddleName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiddleName

`func (o *GetPassportResponseEntity) SetMiddleName(v string)`

SetMiddleName sets MiddleName field to given value.

### HasMiddleName

`func (o *GetPassportResponseEntity) HasMiddleName() bool`

HasMiddleName returns a boolean if a field has been set.

### GetPicture

`func (o *GetPassportResponseEntity) GetPicture() string`

GetPicture returns the Picture field if non-nil, zero value otherwise.

### GetPictureOk

`func (o *GetPassportResponseEntity) GetPictureOk() (*string, bool)`

GetPictureOk returns a tuple with the Picture field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPicture

`func (o *GetPassportResponseEntity) SetPicture(v string)`

SetPicture sets Picture field to given value.

### HasPicture

`func (o *GetPassportResponseEntity) HasPicture() bool`

HasPicture returns a boolean if a field has been set.

### GetPlaceOfBirth

`func (o *GetPassportResponseEntity) GetPlaceOfBirth() string`

GetPlaceOfBirth returns the PlaceOfBirth field if non-nil, zero value otherwise.

### GetPlaceOfBirthOk

`func (o *GetPassportResponseEntity) GetPlaceOfBirthOk() (*string, bool)`

GetPlaceOfBirthOk returns a tuple with the PlaceOfBirth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlaceOfBirth

`func (o *GetPassportResponseEntity) SetPlaceOfBirth(v string)`

SetPlaceOfBirth sets PlaceOfBirth field to given value.

### HasPlaceOfBirth

`func (o *GetPassportResponseEntity) HasPlaceOfBirth() bool`

HasPlaceOfBirth returns a boolean if a field has been set.

### GetPlaceOfIssue

`func (o *GetPassportResponseEntity) GetPlaceOfIssue() string`

GetPlaceOfIssue returns the PlaceOfIssue field if non-nil, zero value otherwise.

### GetPlaceOfIssueOk

`func (o *GetPassportResponseEntity) GetPlaceOfIssueOk() (*string, bool)`

GetPlaceOfIssueOk returns a tuple with the PlaceOfIssue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlaceOfIssue

`func (o *GetPassportResponseEntity) SetPlaceOfIssue(v string)`

SetPlaceOfIssue sets PlaceOfIssue field to given value.

### HasPlaceOfIssue

`func (o *GetPassportResponseEntity) HasPlaceOfIssue() bool`

HasPlaceOfIssue returns a boolean if a field has been set.

### GetStatus

`func (o *GetPassportResponseEntity) GetStatus() float32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetPassportResponseEntity) GetStatusOk() (*float32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetPassportResponseEntity) SetStatus(v float32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetPassportResponseEntity) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


