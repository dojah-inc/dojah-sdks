# TransferFundsResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WalletId** | Pointer to **string** |  | [optional] 
**TransactionAmount** | Pointer to **float32** |  | [optional] 
**TransactionType** | Pointer to **string** |  | [optional] 
**RecipientAccountNumber** | Pointer to **string** |  | [optional] 
**SenderAccountNumber** | Pointer to **string** |  | [optional] 
**TransactionRemarks** | Pointer to **string** |  | [optional] 
**TransactionReason** | Pointer to **NullableString** |  | [optional] 
**TransactionId** | Pointer to **string** |  | [optional] 
**TransactionStatus** | Pointer to **string** |  | [optional] 
**DateCreated** | Pointer to **string** |  | [optional] 

## Methods

### NewTransferFundsResponseEntity

`func NewTransferFundsResponseEntity() *TransferFundsResponseEntity`

NewTransferFundsResponseEntity instantiates a new TransferFundsResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTransferFundsResponseEntityWithDefaults

`func NewTransferFundsResponseEntityWithDefaults() *TransferFundsResponseEntity`

NewTransferFundsResponseEntityWithDefaults instantiates a new TransferFundsResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWalletId

`func (o *TransferFundsResponseEntity) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *TransferFundsResponseEntity) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *TransferFundsResponseEntity) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.

### HasWalletId

`func (o *TransferFundsResponseEntity) HasWalletId() bool`

HasWalletId returns a boolean if a field has been set.

### GetTransactionAmount

`func (o *TransferFundsResponseEntity) GetTransactionAmount() float32`

GetTransactionAmount returns the TransactionAmount field if non-nil, zero value otherwise.

### GetTransactionAmountOk

`func (o *TransferFundsResponseEntity) GetTransactionAmountOk() (*float32, bool)`

GetTransactionAmountOk returns a tuple with the TransactionAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionAmount

`func (o *TransferFundsResponseEntity) SetTransactionAmount(v float32)`

SetTransactionAmount sets TransactionAmount field to given value.

### HasTransactionAmount

`func (o *TransferFundsResponseEntity) HasTransactionAmount() bool`

HasTransactionAmount returns a boolean if a field has been set.

### GetTransactionType

`func (o *TransferFundsResponseEntity) GetTransactionType() string`

GetTransactionType returns the TransactionType field if non-nil, zero value otherwise.

### GetTransactionTypeOk

`func (o *TransferFundsResponseEntity) GetTransactionTypeOk() (*string, bool)`

GetTransactionTypeOk returns a tuple with the TransactionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionType

`func (o *TransferFundsResponseEntity) SetTransactionType(v string)`

SetTransactionType sets TransactionType field to given value.

### HasTransactionType

`func (o *TransferFundsResponseEntity) HasTransactionType() bool`

HasTransactionType returns a boolean if a field has been set.

### GetRecipientAccountNumber

`func (o *TransferFundsResponseEntity) GetRecipientAccountNumber() string`

GetRecipientAccountNumber returns the RecipientAccountNumber field if non-nil, zero value otherwise.

### GetRecipientAccountNumberOk

`func (o *TransferFundsResponseEntity) GetRecipientAccountNumberOk() (*string, bool)`

GetRecipientAccountNumberOk returns a tuple with the RecipientAccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientAccountNumber

`func (o *TransferFundsResponseEntity) SetRecipientAccountNumber(v string)`

SetRecipientAccountNumber sets RecipientAccountNumber field to given value.

### HasRecipientAccountNumber

`func (o *TransferFundsResponseEntity) HasRecipientAccountNumber() bool`

HasRecipientAccountNumber returns a boolean if a field has been set.

### GetSenderAccountNumber

`func (o *TransferFundsResponseEntity) GetSenderAccountNumber() string`

GetSenderAccountNumber returns the SenderAccountNumber field if non-nil, zero value otherwise.

### GetSenderAccountNumberOk

`func (o *TransferFundsResponseEntity) GetSenderAccountNumberOk() (*string, bool)`

GetSenderAccountNumberOk returns a tuple with the SenderAccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderAccountNumber

`func (o *TransferFundsResponseEntity) SetSenderAccountNumber(v string)`

SetSenderAccountNumber sets SenderAccountNumber field to given value.

### HasSenderAccountNumber

`func (o *TransferFundsResponseEntity) HasSenderAccountNumber() bool`

HasSenderAccountNumber returns a boolean if a field has been set.

### GetTransactionRemarks

`func (o *TransferFundsResponseEntity) GetTransactionRemarks() string`

GetTransactionRemarks returns the TransactionRemarks field if non-nil, zero value otherwise.

### GetTransactionRemarksOk

`func (o *TransferFundsResponseEntity) GetTransactionRemarksOk() (*string, bool)`

GetTransactionRemarksOk returns a tuple with the TransactionRemarks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionRemarks

`func (o *TransferFundsResponseEntity) SetTransactionRemarks(v string)`

SetTransactionRemarks sets TransactionRemarks field to given value.

### HasTransactionRemarks

`func (o *TransferFundsResponseEntity) HasTransactionRemarks() bool`

HasTransactionRemarks returns a boolean if a field has been set.

### GetTransactionReason

`func (o *TransferFundsResponseEntity) GetTransactionReason() string`

GetTransactionReason returns the TransactionReason field if non-nil, zero value otherwise.

### GetTransactionReasonOk

`func (o *TransferFundsResponseEntity) GetTransactionReasonOk() (*string, bool)`

GetTransactionReasonOk returns a tuple with the TransactionReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionReason

`func (o *TransferFundsResponseEntity) SetTransactionReason(v string)`

SetTransactionReason sets TransactionReason field to given value.

### HasTransactionReason

`func (o *TransferFundsResponseEntity) HasTransactionReason() bool`

HasTransactionReason returns a boolean if a field has been set.

### SetTransactionReasonNil

`func (o *TransferFundsResponseEntity) SetTransactionReasonNil(b bool)`

 SetTransactionReasonNil sets the value for TransactionReason to be an explicit nil

### UnsetTransactionReason
`func (o *TransferFundsResponseEntity) UnsetTransactionReason()`

UnsetTransactionReason ensures that no value is present for TransactionReason, not even an explicit nil
### GetTransactionId

`func (o *TransferFundsResponseEntity) GetTransactionId() string`

GetTransactionId returns the TransactionId field if non-nil, zero value otherwise.

### GetTransactionIdOk

`func (o *TransferFundsResponseEntity) GetTransactionIdOk() (*string, bool)`

GetTransactionIdOk returns a tuple with the TransactionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionId

`func (o *TransferFundsResponseEntity) SetTransactionId(v string)`

SetTransactionId sets TransactionId field to given value.

### HasTransactionId

`func (o *TransferFundsResponseEntity) HasTransactionId() bool`

HasTransactionId returns a boolean if a field has been set.

### GetTransactionStatus

`func (o *TransferFundsResponseEntity) GetTransactionStatus() string`

GetTransactionStatus returns the TransactionStatus field if non-nil, zero value otherwise.

### GetTransactionStatusOk

`func (o *TransferFundsResponseEntity) GetTransactionStatusOk() (*string, bool)`

GetTransactionStatusOk returns a tuple with the TransactionStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionStatus

`func (o *TransferFundsResponseEntity) SetTransactionStatus(v string)`

SetTransactionStatus sets TransactionStatus field to given value.

### HasTransactionStatus

`func (o *TransferFundsResponseEntity) HasTransactionStatus() bool`

HasTransactionStatus returns a boolean if a field has been set.

### GetDateCreated

`func (o *TransferFundsResponseEntity) GetDateCreated() string`

GetDateCreated returns the DateCreated field if non-nil, zero value otherwise.

### GetDateCreatedOk

`func (o *TransferFundsResponseEntity) GetDateCreatedOk() (*string, bool)`

GetDateCreatedOk returns a tuple with the DateCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateCreated

`func (o *TransferFundsResponseEntity) SetDateCreated(v string)`

SetDateCreated sets DateCreated field to given value.

### HasDateCreated

`func (o *TransferFundsResponseEntity) HasDateCreated() bool`

HasDateCreated returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


