# CreditSubwalletResponseEntity

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

### NewCreditSubwalletResponseEntity

`func NewCreditSubwalletResponseEntity() *CreditSubwalletResponseEntity`

NewCreditSubwalletResponseEntity instantiates a new CreditSubwalletResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreditSubwalletResponseEntityWithDefaults

`func NewCreditSubwalletResponseEntityWithDefaults() *CreditSubwalletResponseEntity`

NewCreditSubwalletResponseEntityWithDefaults instantiates a new CreditSubwalletResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWalletId

`func (o *CreditSubwalletResponseEntity) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *CreditSubwalletResponseEntity) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *CreditSubwalletResponseEntity) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.

### HasWalletId

`func (o *CreditSubwalletResponseEntity) HasWalletId() bool`

HasWalletId returns a boolean if a field has been set.

### GetTransactionAmount

`func (o *CreditSubwalletResponseEntity) GetTransactionAmount() float32`

GetTransactionAmount returns the TransactionAmount field if non-nil, zero value otherwise.

### GetTransactionAmountOk

`func (o *CreditSubwalletResponseEntity) GetTransactionAmountOk() (*float32, bool)`

GetTransactionAmountOk returns a tuple with the TransactionAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionAmount

`func (o *CreditSubwalletResponseEntity) SetTransactionAmount(v float32)`

SetTransactionAmount sets TransactionAmount field to given value.

### HasTransactionAmount

`func (o *CreditSubwalletResponseEntity) HasTransactionAmount() bool`

HasTransactionAmount returns a boolean if a field has been set.

### GetTransactionType

`func (o *CreditSubwalletResponseEntity) GetTransactionType() string`

GetTransactionType returns the TransactionType field if non-nil, zero value otherwise.

### GetTransactionTypeOk

`func (o *CreditSubwalletResponseEntity) GetTransactionTypeOk() (*string, bool)`

GetTransactionTypeOk returns a tuple with the TransactionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionType

`func (o *CreditSubwalletResponseEntity) SetTransactionType(v string)`

SetTransactionType sets TransactionType field to given value.

### HasTransactionType

`func (o *CreditSubwalletResponseEntity) HasTransactionType() bool`

HasTransactionType returns a boolean if a field has been set.

### GetRecipientAccountNumber

`func (o *CreditSubwalletResponseEntity) GetRecipientAccountNumber() string`

GetRecipientAccountNumber returns the RecipientAccountNumber field if non-nil, zero value otherwise.

### GetRecipientAccountNumberOk

`func (o *CreditSubwalletResponseEntity) GetRecipientAccountNumberOk() (*string, bool)`

GetRecipientAccountNumberOk returns a tuple with the RecipientAccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientAccountNumber

`func (o *CreditSubwalletResponseEntity) SetRecipientAccountNumber(v string)`

SetRecipientAccountNumber sets RecipientAccountNumber field to given value.

### HasRecipientAccountNumber

`func (o *CreditSubwalletResponseEntity) HasRecipientAccountNumber() bool`

HasRecipientAccountNumber returns a boolean if a field has been set.

### GetSenderAccountNumber

`func (o *CreditSubwalletResponseEntity) GetSenderAccountNumber() string`

GetSenderAccountNumber returns the SenderAccountNumber field if non-nil, zero value otherwise.

### GetSenderAccountNumberOk

`func (o *CreditSubwalletResponseEntity) GetSenderAccountNumberOk() (*string, bool)`

GetSenderAccountNumberOk returns a tuple with the SenderAccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderAccountNumber

`func (o *CreditSubwalletResponseEntity) SetSenderAccountNumber(v string)`

SetSenderAccountNumber sets SenderAccountNumber field to given value.

### HasSenderAccountNumber

`func (o *CreditSubwalletResponseEntity) HasSenderAccountNumber() bool`

HasSenderAccountNumber returns a boolean if a field has been set.

### GetTransactionRemarks

`func (o *CreditSubwalletResponseEntity) GetTransactionRemarks() string`

GetTransactionRemarks returns the TransactionRemarks field if non-nil, zero value otherwise.

### GetTransactionRemarksOk

`func (o *CreditSubwalletResponseEntity) GetTransactionRemarksOk() (*string, bool)`

GetTransactionRemarksOk returns a tuple with the TransactionRemarks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionRemarks

`func (o *CreditSubwalletResponseEntity) SetTransactionRemarks(v string)`

SetTransactionRemarks sets TransactionRemarks field to given value.

### HasTransactionRemarks

`func (o *CreditSubwalletResponseEntity) HasTransactionRemarks() bool`

HasTransactionRemarks returns a boolean if a field has been set.

### GetTransactionReason

`func (o *CreditSubwalletResponseEntity) GetTransactionReason() string`

GetTransactionReason returns the TransactionReason field if non-nil, zero value otherwise.

### GetTransactionReasonOk

`func (o *CreditSubwalletResponseEntity) GetTransactionReasonOk() (*string, bool)`

GetTransactionReasonOk returns a tuple with the TransactionReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionReason

`func (o *CreditSubwalletResponseEntity) SetTransactionReason(v string)`

SetTransactionReason sets TransactionReason field to given value.

### HasTransactionReason

`func (o *CreditSubwalletResponseEntity) HasTransactionReason() bool`

HasTransactionReason returns a boolean if a field has been set.

### SetTransactionReasonNil

`func (o *CreditSubwalletResponseEntity) SetTransactionReasonNil(b bool)`

 SetTransactionReasonNil sets the value for TransactionReason to be an explicit nil

### UnsetTransactionReason
`func (o *CreditSubwalletResponseEntity) UnsetTransactionReason()`

UnsetTransactionReason ensures that no value is present for TransactionReason, not even an explicit nil
### GetTransactionId

`func (o *CreditSubwalletResponseEntity) GetTransactionId() string`

GetTransactionId returns the TransactionId field if non-nil, zero value otherwise.

### GetTransactionIdOk

`func (o *CreditSubwalletResponseEntity) GetTransactionIdOk() (*string, bool)`

GetTransactionIdOk returns a tuple with the TransactionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionId

`func (o *CreditSubwalletResponseEntity) SetTransactionId(v string)`

SetTransactionId sets TransactionId field to given value.

### HasTransactionId

`func (o *CreditSubwalletResponseEntity) HasTransactionId() bool`

HasTransactionId returns a boolean if a field has been set.

### GetTransactionStatus

`func (o *CreditSubwalletResponseEntity) GetTransactionStatus() string`

GetTransactionStatus returns the TransactionStatus field if non-nil, zero value otherwise.

### GetTransactionStatusOk

`func (o *CreditSubwalletResponseEntity) GetTransactionStatusOk() (*string, bool)`

GetTransactionStatusOk returns a tuple with the TransactionStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionStatus

`func (o *CreditSubwalletResponseEntity) SetTransactionStatus(v string)`

SetTransactionStatus sets TransactionStatus field to given value.

### HasTransactionStatus

`func (o *CreditSubwalletResponseEntity) HasTransactionStatus() bool`

HasTransactionStatus returns a boolean if a field has been set.

### GetDateCreated

`func (o *CreditSubwalletResponseEntity) GetDateCreated() string`

GetDateCreated returns the DateCreated field if non-nil, zero value otherwise.

### GetDateCreatedOk

`func (o *CreditSubwalletResponseEntity) GetDateCreatedOk() (*string, bool)`

GetDateCreatedOk returns a tuple with the DateCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateCreated

`func (o *CreditSubwalletResponseEntity) SetDateCreated(v string)`

SetDateCreated sets DateCreated field to given value.

### HasDateCreated

`func (o *CreditSubwalletResponseEntity) HasDateCreated() bool`

HasDateCreated returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


