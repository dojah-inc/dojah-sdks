# CollectTransactionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Transactions** | Pointer to [**[]CollectTransactionsRequestTransactionsInner**](CollectTransactionsRequestTransactionsInner.md) |  | [optional] 
**AppId** | Pointer to **string** |  | [optional] 

## Methods

### NewCollectTransactionsRequest

`func NewCollectTransactionsRequest() *CollectTransactionsRequest`

NewCollectTransactionsRequest instantiates a new CollectTransactionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCollectTransactionsRequestWithDefaults

`func NewCollectTransactionsRequestWithDefaults() *CollectTransactionsRequest`

NewCollectTransactionsRequestWithDefaults instantiates a new CollectTransactionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTransactions

`func (o *CollectTransactionsRequest) GetTransactions() []CollectTransactionsRequestTransactionsInner`

GetTransactions returns the Transactions field if non-nil, zero value otherwise.

### GetTransactionsOk

`func (o *CollectTransactionsRequest) GetTransactionsOk() (*[]CollectTransactionsRequestTransactionsInner, bool)`

GetTransactionsOk returns a tuple with the Transactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactions

`func (o *CollectTransactionsRequest) SetTransactions(v []CollectTransactionsRequestTransactionsInner)`

SetTransactions sets Transactions field to given value.

### HasTransactions

`func (o *CollectTransactionsRequest) HasTransactions() bool`

HasTransactions returns a boolean if a field has been set.

### GetAppId

`func (o *CollectTransactionsRequest) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *CollectTransactionsRequest) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *CollectTransactionsRequest) SetAppId(v string)`

SetAppId sets AppId field to given value.

### HasAppId

`func (o *CollectTransactionsRequest) HasAppId() bool`

HasAppId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


