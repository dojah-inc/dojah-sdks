# GetWalletsResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | Pointer to **string** |  | [optional] 
**TotalAmount** | Pointer to **float32** |  | [optional] 
**ClientWallets** | Pointer to [**[]GetWalletResponseEntity**](GetWalletResponseEntity.md) |  | [optional] 

## Methods

### NewGetWalletsResponseEntity

`func NewGetWalletsResponseEntity() *GetWalletsResponseEntity`

NewGetWalletsResponseEntity instantiates a new GetWalletsResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetWalletsResponseEntityWithDefaults

`func NewGetWalletsResponseEntityWithDefaults() *GetWalletsResponseEntity`

NewGetWalletsResponseEntityWithDefaults instantiates a new GetWalletsResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *GetWalletsResponseEntity) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *GetWalletsResponseEntity) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *GetWalletsResponseEntity) SetAppId(v string)`

SetAppId sets AppId field to given value.

### HasAppId

`func (o *GetWalletsResponseEntity) HasAppId() bool`

HasAppId returns a boolean if a field has been set.

### GetTotalAmount

`func (o *GetWalletsResponseEntity) GetTotalAmount() float32`

GetTotalAmount returns the TotalAmount field if non-nil, zero value otherwise.

### GetTotalAmountOk

`func (o *GetWalletsResponseEntity) GetTotalAmountOk() (*float32, bool)`

GetTotalAmountOk returns a tuple with the TotalAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalAmount

`func (o *GetWalletsResponseEntity) SetTotalAmount(v float32)`

SetTotalAmount sets TotalAmount field to given value.

### HasTotalAmount

`func (o *GetWalletsResponseEntity) HasTotalAmount() bool`

HasTotalAmount returns a boolean if a field has been set.

### GetClientWallets

`func (o *GetWalletsResponseEntity) GetClientWallets() []GetWalletResponseEntity`

GetClientWallets returns the ClientWallets field if non-nil, zero value otherwise.

### GetClientWalletsOk

`func (o *GetWalletsResponseEntity) GetClientWalletsOk() (*[]GetWalletResponseEntity, bool)`

GetClientWalletsOk returns a tuple with the ClientWallets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientWallets

`func (o *GetWalletsResponseEntity) SetClientWallets(v []GetWalletResponseEntity)`

SetClientWallets sets ClientWallets field to given value.

### HasClientWallets

`func (o *GetWalletsResponseEntity) HasClientWallets() bool`

HasClientWallets returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


