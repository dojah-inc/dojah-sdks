# GetVoterResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VoterNumber** | **string** |  | 
**FirstName** | **string** |  | 
**LastName** | **string** |  | 
**Gender** | **string** |  | 
**Village** | **string** |  | 
**District** | **string** |  | 
**Constituency** | **string** |  | 
**SubCounty** | **string** |  | 
**Parish** | **string** |  | 
**PollingStation** | **string** |  | 
**IsFirstNameMatch** | **bool** |  | 
**IsLastNameMatch** | **bool** |  | 

## Methods

### NewGetVoterResponseEntity

`func NewGetVoterResponseEntity(voterNumber string, firstName string, lastName string, gender string, village string, district string, constituency string, subCounty string, parish string, pollingStation string, isFirstNameMatch bool, isLastNameMatch bool, ) *GetVoterResponseEntity`

NewGetVoterResponseEntity instantiates a new GetVoterResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetVoterResponseEntityWithDefaults

`func NewGetVoterResponseEntityWithDefaults() *GetVoterResponseEntity`

NewGetVoterResponseEntityWithDefaults instantiates a new GetVoterResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVoterNumber

`func (o *GetVoterResponseEntity) GetVoterNumber() string`

GetVoterNumber returns the VoterNumber field if non-nil, zero value otherwise.

### GetVoterNumberOk

`func (o *GetVoterResponseEntity) GetVoterNumberOk() (*string, bool)`

GetVoterNumberOk returns a tuple with the VoterNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVoterNumber

`func (o *GetVoterResponseEntity) SetVoterNumber(v string)`

SetVoterNumber sets VoterNumber field to given value.


### GetFirstName

`func (o *GetVoterResponseEntity) GetFirstName() string`

GetFirstName returns the FirstName field if non-nil, zero value otherwise.

### GetFirstNameOk

`func (o *GetVoterResponseEntity) GetFirstNameOk() (*string, bool)`

GetFirstNameOk returns a tuple with the FirstName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstName

`func (o *GetVoterResponseEntity) SetFirstName(v string)`

SetFirstName sets FirstName field to given value.


### GetLastName

`func (o *GetVoterResponseEntity) GetLastName() string`

GetLastName returns the LastName field if non-nil, zero value otherwise.

### GetLastNameOk

`func (o *GetVoterResponseEntity) GetLastNameOk() (*string, bool)`

GetLastNameOk returns a tuple with the LastName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastName

`func (o *GetVoterResponseEntity) SetLastName(v string)`

SetLastName sets LastName field to given value.


### GetGender

`func (o *GetVoterResponseEntity) GetGender() string`

GetGender returns the Gender field if non-nil, zero value otherwise.

### GetGenderOk

`func (o *GetVoterResponseEntity) GetGenderOk() (*string, bool)`

GetGenderOk returns a tuple with the Gender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGender

`func (o *GetVoterResponseEntity) SetGender(v string)`

SetGender sets Gender field to given value.


### GetVillage

`func (o *GetVoterResponseEntity) GetVillage() string`

GetVillage returns the Village field if non-nil, zero value otherwise.

### GetVillageOk

`func (o *GetVoterResponseEntity) GetVillageOk() (*string, bool)`

GetVillageOk returns a tuple with the Village field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVillage

`func (o *GetVoterResponseEntity) SetVillage(v string)`

SetVillage sets Village field to given value.


### GetDistrict

`func (o *GetVoterResponseEntity) GetDistrict() string`

GetDistrict returns the District field if non-nil, zero value otherwise.

### GetDistrictOk

`func (o *GetVoterResponseEntity) GetDistrictOk() (*string, bool)`

GetDistrictOk returns a tuple with the District field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDistrict

`func (o *GetVoterResponseEntity) SetDistrict(v string)`

SetDistrict sets District field to given value.


### GetConstituency

`func (o *GetVoterResponseEntity) GetConstituency() string`

GetConstituency returns the Constituency field if non-nil, zero value otherwise.

### GetConstituencyOk

`func (o *GetVoterResponseEntity) GetConstituencyOk() (*string, bool)`

GetConstituencyOk returns a tuple with the Constituency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConstituency

`func (o *GetVoterResponseEntity) SetConstituency(v string)`

SetConstituency sets Constituency field to given value.


### GetSubCounty

`func (o *GetVoterResponseEntity) GetSubCounty() string`

GetSubCounty returns the SubCounty field if non-nil, zero value otherwise.

### GetSubCountyOk

`func (o *GetVoterResponseEntity) GetSubCountyOk() (*string, bool)`

GetSubCountyOk returns a tuple with the SubCounty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubCounty

`func (o *GetVoterResponseEntity) SetSubCounty(v string)`

SetSubCounty sets SubCounty field to given value.


### GetParish

`func (o *GetVoterResponseEntity) GetParish() string`

GetParish returns the Parish field if non-nil, zero value otherwise.

### GetParishOk

`func (o *GetVoterResponseEntity) GetParishOk() (*string, bool)`

GetParishOk returns a tuple with the Parish field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParish

`func (o *GetVoterResponseEntity) SetParish(v string)`

SetParish sets Parish field to given value.


### GetPollingStation

`func (o *GetVoterResponseEntity) GetPollingStation() string`

GetPollingStation returns the PollingStation field if non-nil, zero value otherwise.

### GetPollingStationOk

`func (o *GetVoterResponseEntity) GetPollingStationOk() (*string, bool)`

GetPollingStationOk returns a tuple with the PollingStation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPollingStation

`func (o *GetVoterResponseEntity) SetPollingStation(v string)`

SetPollingStation sets PollingStation field to given value.


### GetIsFirstNameMatch

`func (o *GetVoterResponseEntity) GetIsFirstNameMatch() bool`

GetIsFirstNameMatch returns the IsFirstNameMatch field if non-nil, zero value otherwise.

### GetIsFirstNameMatchOk

`func (o *GetVoterResponseEntity) GetIsFirstNameMatchOk() (*bool, bool)`

GetIsFirstNameMatchOk returns a tuple with the IsFirstNameMatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFirstNameMatch

`func (o *GetVoterResponseEntity) SetIsFirstNameMatch(v bool)`

SetIsFirstNameMatch sets IsFirstNameMatch field to given value.


### GetIsLastNameMatch

`func (o *GetVoterResponseEntity) GetIsLastNameMatch() bool`

GetIsLastNameMatch returns the IsLastNameMatch field if non-nil, zero value otherwise.

### GetIsLastNameMatchOk

`func (o *GetVoterResponseEntity) GetIsLastNameMatchOk() (*bool, bool)`

GetIsLastNameMatchOk returns a tuple with the IsLastNameMatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLastNameMatch

`func (o *GetVoterResponseEntity) SetIsLastNameMatch(v bool)`

SetIsLastNameMatch sets IsLastNameMatch field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


