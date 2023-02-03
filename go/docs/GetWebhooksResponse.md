# GetWebhooksResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entity** | Pointer to [**[]GetWebhooksResponseEntityInner**](GetWebhooksResponseEntityInner.md) |  | [optional] 

## Methods

### NewGetWebhooksResponse

`func NewGetWebhooksResponse() *GetWebhooksResponse`

NewGetWebhooksResponse instantiates a new GetWebhooksResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetWebhooksResponseWithDefaults

`func NewGetWebhooksResponseWithDefaults() *GetWebhooksResponse`

NewGetWebhooksResponseWithDefaults instantiates a new GetWebhooksResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntity

`func (o *GetWebhooksResponse) GetEntity() []GetWebhooksResponseEntityInner`

GetEntity returns the Entity field if non-nil, zero value otherwise.

### GetEntityOk

`func (o *GetWebhooksResponse) GetEntityOk() (*[]GetWebhooksResponseEntityInner, bool)`

GetEntityOk returns a tuple with the Entity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntity

`func (o *GetWebhooksResponse) SetEntity(v []GetWebhooksResponseEntityInner)`

SetEntity sets Entity field to given value.

### HasEntity

`func (o *GetWebhooksResponse) HasEntity() bool`

HasEntity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


