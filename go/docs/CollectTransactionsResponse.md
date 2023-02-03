# CollectTransactionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | Pointer to **string** |  | [optional] 
**Entity** | Pointer to [**CollectTransactionsResponseEntity**](CollectTransactionsResponseEntity.md) |  | [optional] 

## Methods

### NewCollectTransactionsResponse

`func NewCollectTransactionsResponse() *CollectTransactionsResponse`

NewCollectTransactionsResponse instantiates a new CollectTransactionsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCollectTransactionsResponseWithDefaults

`func NewCollectTransactionsResponseWithDefaults() *CollectTransactionsResponse`

NewCollectTransactionsResponseWithDefaults instantiates a new CollectTransactionsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *CollectTransactionsResponse) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CollectTransactionsResponse) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CollectTransactionsResponse) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *CollectTransactionsResponse) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetEntity

`func (o *CollectTransactionsResponse) GetEntity() CollectTransactionsResponseEntity`

GetEntity returns the Entity field if non-nil, zero value otherwise.

### GetEntityOk

`func (o *CollectTransactionsResponse) GetEntityOk() (*CollectTransactionsResponseEntity, bool)`

GetEntityOk returns a tuple with the Entity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntity

`func (o *CollectTransactionsResponse) SetEntity(v CollectTransactionsResponseEntity)`

SetEntity sets Entity field to given value.

### HasEntity

`func (o *CollectTransactionsResponse) HasEntity() bool`

HasEntity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


