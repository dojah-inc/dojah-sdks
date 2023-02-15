# CollectStatusFromPdfRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Statement** | Pointer to ***os.File** |  | [optional] 
**BankCode** | Pointer to **int32** |  | [optional] 

## Methods

### NewCollectStatusFromPdfRequest

`func NewCollectStatusFromPdfRequest() *CollectStatusFromPdfRequest`

NewCollectStatusFromPdfRequest instantiates a new CollectStatusFromPdfRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCollectStatusFromPdfRequestWithDefaults

`func NewCollectStatusFromPdfRequestWithDefaults() *CollectStatusFromPdfRequest`

NewCollectStatusFromPdfRequestWithDefaults instantiates a new CollectStatusFromPdfRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatement

`func (o *CollectStatusFromPdfRequest) GetStatement() *os.File`

GetStatement returns the Statement field if non-nil, zero value otherwise.

### GetStatementOk

`func (o *CollectStatusFromPdfRequest) GetStatementOk() (**os.File, bool)`

GetStatementOk returns a tuple with the Statement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatement

`func (o *CollectStatusFromPdfRequest) SetStatement(v *os.File)`

SetStatement sets Statement field to given value.

### HasStatement

`func (o *CollectStatusFromPdfRequest) HasStatement() bool`

HasStatement returns a boolean if a field has been set.

### GetBankCode

`func (o *CollectStatusFromPdfRequest) GetBankCode() int32`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *CollectStatusFromPdfRequest) GetBankCodeOk() (*int32, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *CollectStatusFromPdfRequest) SetBankCode(v int32)`

SetBankCode sets BankCode field to given value.

### HasBankCode

`func (o *CollectStatusFromPdfRequest) HasBankCode() bool`

HasBankCode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


