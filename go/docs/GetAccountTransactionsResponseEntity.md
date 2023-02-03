# GetAccountTransactionsResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Transactions** | Pointer to [**[]GetAccountTransactionsResponseEntityTransactionsInner**](GetAccountTransactionsResponseEntityTransactionsInner.md) |  | [optional] 
**Total** | Pointer to **float32** |  | [optional] 
**PreviousPage** | Pointer to **string** |  | [optional] 
**NextPage** | Pointer to **float32** |  | [optional] 
**TotalPages** | Pointer to **float32** |  | [optional] 
**CurrentPage** | Pointer to **float32** |  | [optional] 

## Methods

### NewGetAccountTransactionsResponseEntity

`func NewGetAccountTransactionsResponseEntity() *GetAccountTransactionsResponseEntity`

NewGetAccountTransactionsResponseEntity instantiates a new GetAccountTransactionsResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetAccountTransactionsResponseEntityWithDefaults

`func NewGetAccountTransactionsResponseEntityWithDefaults() *GetAccountTransactionsResponseEntity`

NewGetAccountTransactionsResponseEntityWithDefaults instantiates a new GetAccountTransactionsResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTransactions

`func (o *GetAccountTransactionsResponseEntity) GetTransactions() []GetAccountTransactionsResponseEntityTransactionsInner`

GetTransactions returns the Transactions field if non-nil, zero value otherwise.

### GetTransactionsOk

`func (o *GetAccountTransactionsResponseEntity) GetTransactionsOk() (*[]GetAccountTransactionsResponseEntityTransactionsInner, bool)`

GetTransactionsOk returns a tuple with the Transactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactions

`func (o *GetAccountTransactionsResponseEntity) SetTransactions(v []GetAccountTransactionsResponseEntityTransactionsInner)`

SetTransactions sets Transactions field to given value.

### HasTransactions

`func (o *GetAccountTransactionsResponseEntity) HasTransactions() bool`

HasTransactions returns a boolean if a field has been set.

### GetTotal

`func (o *GetAccountTransactionsResponseEntity) GetTotal() float32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *GetAccountTransactionsResponseEntity) GetTotalOk() (*float32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *GetAccountTransactionsResponseEntity) SetTotal(v float32)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *GetAccountTransactionsResponseEntity) HasTotal() bool`

HasTotal returns a boolean if a field has been set.

### GetPreviousPage

`func (o *GetAccountTransactionsResponseEntity) GetPreviousPage() string`

GetPreviousPage returns the PreviousPage field if non-nil, zero value otherwise.

### GetPreviousPageOk

`func (o *GetAccountTransactionsResponseEntity) GetPreviousPageOk() (*string, bool)`

GetPreviousPageOk returns a tuple with the PreviousPage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousPage

`func (o *GetAccountTransactionsResponseEntity) SetPreviousPage(v string)`

SetPreviousPage sets PreviousPage field to given value.

### HasPreviousPage

`func (o *GetAccountTransactionsResponseEntity) HasPreviousPage() bool`

HasPreviousPage returns a boolean if a field has been set.

### GetNextPage

`func (o *GetAccountTransactionsResponseEntity) GetNextPage() float32`

GetNextPage returns the NextPage field if non-nil, zero value otherwise.

### GetNextPageOk

`func (o *GetAccountTransactionsResponseEntity) GetNextPageOk() (*float32, bool)`

GetNextPageOk returns a tuple with the NextPage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextPage

`func (o *GetAccountTransactionsResponseEntity) SetNextPage(v float32)`

SetNextPage sets NextPage field to given value.

### HasNextPage

`func (o *GetAccountTransactionsResponseEntity) HasNextPage() bool`

HasNextPage returns a boolean if a field has been set.

### GetTotalPages

`func (o *GetAccountTransactionsResponseEntity) GetTotalPages() float32`

GetTotalPages returns the TotalPages field if non-nil, zero value otherwise.

### GetTotalPagesOk

`func (o *GetAccountTransactionsResponseEntity) GetTotalPagesOk() (*float32, bool)`

GetTotalPagesOk returns a tuple with the TotalPages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalPages

`func (o *GetAccountTransactionsResponseEntity) SetTotalPages(v float32)`

SetTotalPages sets TotalPages field to given value.

### HasTotalPages

`func (o *GetAccountTransactionsResponseEntity) HasTotalPages() bool`

HasTotalPages returns a boolean if a field has been set.

### GetCurrentPage

`func (o *GetAccountTransactionsResponseEntity) GetCurrentPage() float32`

GetCurrentPage returns the CurrentPage field if non-nil, zero value otherwise.

### GetCurrentPageOk

`func (o *GetAccountTransactionsResponseEntity) GetCurrentPageOk() (*float32, bool)`

GetCurrentPageOk returns a tuple with the CurrentPage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentPage

`func (o *GetAccountTransactionsResponseEntity) SetCurrentPage(v float32)`

SetCurrentPage sets CurrentPage field to given value.

### HasCurrentPage

`func (o *GetAccountTransactionsResponseEntity) HasCurrentPage() bool`

HasCurrentPage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


