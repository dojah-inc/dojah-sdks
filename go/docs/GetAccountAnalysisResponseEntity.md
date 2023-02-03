# GetAccountAnalysisResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountBreakdown** | Pointer to [**GetAccountAnalysisResponseEntityAccountBreakdown**](GetAccountAnalysisResponseEntityAccountBreakdown.md) |  | [optional] 
**ExpenseBreakdown** | Pointer to [**GetAccountAnalysisResponseEntityExpenseBreakdown**](GetAccountAnalysisResponseEntityExpenseBreakdown.md) |  | [optional] 
**FundsManagement** | Pointer to [**GetAccountAnalysisResponseEntityFundsManagement**](GetAccountAnalysisResponseEntityFundsManagement.md) |  | [optional] 
**InflowBreakdown** | Pointer to [**GetAccountAnalysisResponseEntityInflowBreakdown**](GetAccountAnalysisResponseEntityInflowBreakdown.md) |  | [optional] 
**TransactionRoutineBreakdown** | Pointer to [**GetAccountAnalysisResponseEntityTransactionRoutineBreakdown**](GetAccountAnalysisResponseEntityTransactionRoutineBreakdown.md) |  | [optional] 
**Status** | Pointer to **float32** |  | [optional] 

## Methods

### NewGetAccountAnalysisResponseEntity

`func NewGetAccountAnalysisResponseEntity() *GetAccountAnalysisResponseEntity`

NewGetAccountAnalysisResponseEntity instantiates a new GetAccountAnalysisResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetAccountAnalysisResponseEntityWithDefaults

`func NewGetAccountAnalysisResponseEntityWithDefaults() *GetAccountAnalysisResponseEntity`

NewGetAccountAnalysisResponseEntityWithDefaults instantiates a new GetAccountAnalysisResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccountBreakdown

`func (o *GetAccountAnalysisResponseEntity) GetAccountBreakdown() GetAccountAnalysisResponseEntityAccountBreakdown`

GetAccountBreakdown returns the AccountBreakdown field if non-nil, zero value otherwise.

### GetAccountBreakdownOk

`func (o *GetAccountAnalysisResponseEntity) GetAccountBreakdownOk() (*GetAccountAnalysisResponseEntityAccountBreakdown, bool)`

GetAccountBreakdownOk returns a tuple with the AccountBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountBreakdown

`func (o *GetAccountAnalysisResponseEntity) SetAccountBreakdown(v GetAccountAnalysisResponseEntityAccountBreakdown)`

SetAccountBreakdown sets AccountBreakdown field to given value.

### HasAccountBreakdown

`func (o *GetAccountAnalysisResponseEntity) HasAccountBreakdown() bool`

HasAccountBreakdown returns a boolean if a field has been set.

### GetExpenseBreakdown

`func (o *GetAccountAnalysisResponseEntity) GetExpenseBreakdown() GetAccountAnalysisResponseEntityExpenseBreakdown`

GetExpenseBreakdown returns the ExpenseBreakdown field if non-nil, zero value otherwise.

### GetExpenseBreakdownOk

`func (o *GetAccountAnalysisResponseEntity) GetExpenseBreakdownOk() (*GetAccountAnalysisResponseEntityExpenseBreakdown, bool)`

GetExpenseBreakdownOk returns a tuple with the ExpenseBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpenseBreakdown

`func (o *GetAccountAnalysisResponseEntity) SetExpenseBreakdown(v GetAccountAnalysisResponseEntityExpenseBreakdown)`

SetExpenseBreakdown sets ExpenseBreakdown field to given value.

### HasExpenseBreakdown

`func (o *GetAccountAnalysisResponseEntity) HasExpenseBreakdown() bool`

HasExpenseBreakdown returns a boolean if a field has been set.

### GetFundsManagement

`func (o *GetAccountAnalysisResponseEntity) GetFundsManagement() GetAccountAnalysisResponseEntityFundsManagement`

GetFundsManagement returns the FundsManagement field if non-nil, zero value otherwise.

### GetFundsManagementOk

`func (o *GetAccountAnalysisResponseEntity) GetFundsManagementOk() (*GetAccountAnalysisResponseEntityFundsManagement, bool)`

GetFundsManagementOk returns a tuple with the FundsManagement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFundsManagement

`func (o *GetAccountAnalysisResponseEntity) SetFundsManagement(v GetAccountAnalysisResponseEntityFundsManagement)`

SetFundsManagement sets FundsManagement field to given value.

### HasFundsManagement

`func (o *GetAccountAnalysisResponseEntity) HasFundsManagement() bool`

HasFundsManagement returns a boolean if a field has been set.

### GetInflowBreakdown

`func (o *GetAccountAnalysisResponseEntity) GetInflowBreakdown() GetAccountAnalysisResponseEntityInflowBreakdown`

GetInflowBreakdown returns the InflowBreakdown field if non-nil, zero value otherwise.

### GetInflowBreakdownOk

`func (o *GetAccountAnalysisResponseEntity) GetInflowBreakdownOk() (*GetAccountAnalysisResponseEntityInflowBreakdown, bool)`

GetInflowBreakdownOk returns a tuple with the InflowBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInflowBreakdown

`func (o *GetAccountAnalysisResponseEntity) SetInflowBreakdown(v GetAccountAnalysisResponseEntityInflowBreakdown)`

SetInflowBreakdown sets InflowBreakdown field to given value.

### HasInflowBreakdown

`func (o *GetAccountAnalysisResponseEntity) HasInflowBreakdown() bool`

HasInflowBreakdown returns a boolean if a field has been set.

### GetTransactionRoutineBreakdown

`func (o *GetAccountAnalysisResponseEntity) GetTransactionRoutineBreakdown() GetAccountAnalysisResponseEntityTransactionRoutineBreakdown`

GetTransactionRoutineBreakdown returns the TransactionRoutineBreakdown field if non-nil, zero value otherwise.

### GetTransactionRoutineBreakdownOk

`func (o *GetAccountAnalysisResponseEntity) GetTransactionRoutineBreakdownOk() (*GetAccountAnalysisResponseEntityTransactionRoutineBreakdown, bool)`

GetTransactionRoutineBreakdownOk returns a tuple with the TransactionRoutineBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionRoutineBreakdown

`func (o *GetAccountAnalysisResponseEntity) SetTransactionRoutineBreakdown(v GetAccountAnalysisResponseEntityTransactionRoutineBreakdown)`

SetTransactionRoutineBreakdown sets TransactionRoutineBreakdown field to given value.

### HasTransactionRoutineBreakdown

`func (o *GetAccountAnalysisResponseEntity) HasTransactionRoutineBreakdown() bool`

HasTransactionRoutineBreakdown returns a boolean if a field has been set.

### GetStatus

`func (o *GetAccountAnalysisResponseEntity) GetStatus() float32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetAccountAnalysisResponseEntity) GetStatusOk() (*float32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetAccountAnalysisResponseEntity) SetStatus(v float32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetAccountAnalysisResponseEntity) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


