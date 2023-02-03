# GetSenderIdResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entity** | Pointer to [**[]GetSenderIdResponseEntityInner**](GetSenderIdResponseEntityInner.md) |  | [optional] 

## Methods

### NewGetSenderIdResponse

`func NewGetSenderIdResponse() *GetSenderIdResponse`

NewGetSenderIdResponse instantiates a new GetSenderIdResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetSenderIdResponseWithDefaults

`func NewGetSenderIdResponseWithDefaults() *GetSenderIdResponse`

NewGetSenderIdResponseWithDefaults instantiates a new GetSenderIdResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntity

`func (o *GetSenderIdResponse) GetEntity() []GetSenderIdResponseEntityInner`

GetEntity returns the Entity field if non-nil, zero value otherwise.

### GetEntityOk

`func (o *GetSenderIdResponse) GetEntityOk() (*[]GetSenderIdResponseEntityInner, bool)`

GetEntityOk returns a tuple with the Entity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntity

`func (o *GetSenderIdResponse) SetEntity(v []GetSenderIdResponseEntityInner)`

SetEntity sets Entity field to given value.

### HasEntity

`func (o *GetSenderIdResponse) HasEntity() bool`

HasEntity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


