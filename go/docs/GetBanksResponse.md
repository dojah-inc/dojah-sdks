# GetBanksResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entity** | Pointer to [**[]GetBanksResponseEntityInner**](GetBanksResponseEntityInner.md) |  | [optional] 

## Methods

### NewGetBanksResponse

`func NewGetBanksResponse() *GetBanksResponse`

NewGetBanksResponse instantiates a new GetBanksResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBanksResponseWithDefaults

`func NewGetBanksResponseWithDefaults() *GetBanksResponse`

NewGetBanksResponseWithDefaults instantiates a new GetBanksResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntity

`func (o *GetBanksResponse) GetEntity() []GetBanksResponseEntityInner`

GetEntity returns the Entity field if non-nil, zero value otherwise.

### GetEntityOk

`func (o *GetBanksResponse) GetEntityOk() (*[]GetBanksResponseEntityInner, bool)`

GetEntityOk returns a tuple with the Entity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntity

`func (o *GetBanksResponse) SetEntity(v []GetBanksResponseEntityInner)`

SetEntity sets Entity field to given value.

### HasEntity

`func (o *GetBanksResponse) HasEntity() bool`

HasEntity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


