# KycSubmitAddressResponseEntityData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Applicant** | Pointer to [**KycSubmitAddressResponseEntityDataApplicant**](KycSubmitAddressResponseEntityDataApplicant.md) |  | [optional] 
**Lattitude** | Pointer to **string** |  | [optional] 
**Longitude** | Pointer to **string** |  | [optional] 
**Photos** | Pointer to **[]string** |  | [optional] 
**Neighbor** | Pointer to [**KycSubmitAddressResponseEntityDataNeighbor**](KycSubmitAddressResponseEntityDataNeighbor.md) |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 
**City** | Pointer to **string** |  | [optional] 
**Street** | Pointer to **string** |  | [optional] 
**Lga** | Pointer to **string** |  | [optional] 
**State** | Pointer to **string** |  | [optional] 
**Country** | Pointer to **string** |  | [optional] 

## Methods

### NewKycSubmitAddressResponseEntityData

`func NewKycSubmitAddressResponseEntityData() *KycSubmitAddressResponseEntityData`

NewKycSubmitAddressResponseEntityData instantiates a new KycSubmitAddressResponseEntityData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKycSubmitAddressResponseEntityDataWithDefaults

`func NewKycSubmitAddressResponseEntityDataWithDefaults() *KycSubmitAddressResponseEntityData`

NewKycSubmitAddressResponseEntityDataWithDefaults instantiates a new KycSubmitAddressResponseEntityData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApplicant

`func (o *KycSubmitAddressResponseEntityData) GetApplicant() KycSubmitAddressResponseEntityDataApplicant`

GetApplicant returns the Applicant field if non-nil, zero value otherwise.

### GetApplicantOk

`func (o *KycSubmitAddressResponseEntityData) GetApplicantOk() (*KycSubmitAddressResponseEntityDataApplicant, bool)`

GetApplicantOk returns a tuple with the Applicant field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApplicant

`func (o *KycSubmitAddressResponseEntityData) SetApplicant(v KycSubmitAddressResponseEntityDataApplicant)`

SetApplicant sets Applicant field to given value.

### HasApplicant

`func (o *KycSubmitAddressResponseEntityData) HasApplicant() bool`

HasApplicant returns a boolean if a field has been set.

### GetLattitude

`func (o *KycSubmitAddressResponseEntityData) GetLattitude() string`

GetLattitude returns the Lattitude field if non-nil, zero value otherwise.

### GetLattitudeOk

`func (o *KycSubmitAddressResponseEntityData) GetLattitudeOk() (*string, bool)`

GetLattitudeOk returns a tuple with the Lattitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLattitude

`func (o *KycSubmitAddressResponseEntityData) SetLattitude(v string)`

SetLattitude sets Lattitude field to given value.

### HasLattitude

`func (o *KycSubmitAddressResponseEntityData) HasLattitude() bool`

HasLattitude returns a boolean if a field has been set.

### GetLongitude

`func (o *KycSubmitAddressResponseEntityData) GetLongitude() string`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *KycSubmitAddressResponseEntityData) GetLongitudeOk() (*string, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *KycSubmitAddressResponseEntityData) SetLongitude(v string)`

SetLongitude sets Longitude field to given value.

### HasLongitude

`func (o *KycSubmitAddressResponseEntityData) HasLongitude() bool`

HasLongitude returns a boolean if a field has been set.

### GetPhotos

`func (o *KycSubmitAddressResponseEntityData) GetPhotos() []string`

GetPhotos returns the Photos field if non-nil, zero value otherwise.

### GetPhotosOk

`func (o *KycSubmitAddressResponseEntityData) GetPhotosOk() (*[]string, bool)`

GetPhotosOk returns a tuple with the Photos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhotos

`func (o *KycSubmitAddressResponseEntityData) SetPhotos(v []string)`

SetPhotos sets Photos field to given value.

### HasPhotos

`func (o *KycSubmitAddressResponseEntityData) HasPhotos() bool`

HasPhotos returns a boolean if a field has been set.

### GetNeighbor

`func (o *KycSubmitAddressResponseEntityData) GetNeighbor() KycSubmitAddressResponseEntityDataNeighbor`

GetNeighbor returns the Neighbor field if non-nil, zero value otherwise.

### GetNeighborOk

`func (o *KycSubmitAddressResponseEntityData) GetNeighborOk() (*KycSubmitAddressResponseEntityDataNeighbor, bool)`

GetNeighborOk returns a tuple with the Neighbor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeighbor

`func (o *KycSubmitAddressResponseEntityData) SetNeighbor(v KycSubmitAddressResponseEntityDataNeighbor)`

SetNeighbor sets Neighbor field to given value.

### HasNeighbor

`func (o *KycSubmitAddressResponseEntityData) HasNeighbor() bool`

HasNeighbor returns a boolean if a field has been set.

### GetStatus

`func (o *KycSubmitAddressResponseEntityData) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *KycSubmitAddressResponseEntityData) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *KycSubmitAddressResponseEntityData) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *KycSubmitAddressResponseEntityData) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCity

`func (o *KycSubmitAddressResponseEntityData) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *KycSubmitAddressResponseEntityData) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *KycSubmitAddressResponseEntityData) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *KycSubmitAddressResponseEntityData) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetStreet

`func (o *KycSubmitAddressResponseEntityData) GetStreet() string`

GetStreet returns the Street field if non-nil, zero value otherwise.

### GetStreetOk

`func (o *KycSubmitAddressResponseEntityData) GetStreetOk() (*string, bool)`

GetStreetOk returns a tuple with the Street field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreet

`func (o *KycSubmitAddressResponseEntityData) SetStreet(v string)`

SetStreet sets Street field to given value.

### HasStreet

`func (o *KycSubmitAddressResponseEntityData) HasStreet() bool`

HasStreet returns a boolean if a field has been set.

### GetLga

`func (o *KycSubmitAddressResponseEntityData) GetLga() string`

GetLga returns the Lga field if non-nil, zero value otherwise.

### GetLgaOk

`func (o *KycSubmitAddressResponseEntityData) GetLgaOk() (*string, bool)`

GetLgaOk returns a tuple with the Lga field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLga

`func (o *KycSubmitAddressResponseEntityData) SetLga(v string)`

SetLga sets Lga field to given value.

### HasLga

`func (o *KycSubmitAddressResponseEntityData) HasLga() bool`

HasLga returns a boolean if a field has been set.

### GetState

`func (o *KycSubmitAddressResponseEntityData) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *KycSubmitAddressResponseEntityData) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *KycSubmitAddressResponseEntityData) SetState(v string)`

SetState sets State field to given value.

### HasState

`func (o *KycSubmitAddressResponseEntityData) HasState() bool`

HasState returns a boolean if a field has been set.

### GetCountry

`func (o *KycSubmitAddressResponseEntityData) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *KycSubmitAddressResponseEntityData) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *KycSubmitAddressResponseEntityData) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *KycSubmitAddressResponseEntityData) HasCountry() bool`

HasCountry returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


