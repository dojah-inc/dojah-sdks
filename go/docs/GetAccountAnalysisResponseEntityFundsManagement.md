# GetAccountAnalysisResponseEntityFundsManagement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountActivity** | Pointer to **float32** |  | [optional] 
**AccountSweep** | Pointer to **string** |  | [optional] 
**AverageMonthlyLoanAmount** | Pointer to **float32** |  | [optional] 
**AverageMonthlyLoanRepaymentAmount** | Pointer to **float32** |  | [optional] 
**GamblingRate** | Pointer to **float32** |  | [optional] 
**GamblingStatus** | Pointer to **string** |  | [optional] 
**LoanInflowAmount** | Pointer to **NullableString** |  | [optional] 
**LoanRepaymentToInflowAmount** | Pointer to **float32** |  | [optional] 
**MonthToMonthInflowToOutflowAmount** | Pointer to **string** |  | [optional] 
**NumberOfCreditLoanTransactions** | Pointer to **NullableString** |  | [optional] 
**NumberOfDebitRepaymentTransactions** | Pointer to **NullableString** |  | [optional] 
**OverallInflowToOutflowAmount** | Pointer to **string** |  | [optional] 
**PercentOfInflowIrregularity** | Pointer to **float32** |  | [optional] 
**TotalLoanAmount** | Pointer to **float32** |  | [optional] 
**TotalLoanRepaymentAmount** | Pointer to **float32** |  | [optional] 

## Methods

### NewGetAccountAnalysisResponseEntityFundsManagement

`func NewGetAccountAnalysisResponseEntityFundsManagement() *GetAccountAnalysisResponseEntityFundsManagement`

NewGetAccountAnalysisResponseEntityFundsManagement instantiates a new GetAccountAnalysisResponseEntityFundsManagement object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetAccountAnalysisResponseEntityFundsManagementWithDefaults

`func NewGetAccountAnalysisResponseEntityFundsManagementWithDefaults() *GetAccountAnalysisResponseEntityFundsManagement`

NewGetAccountAnalysisResponseEntityFundsManagementWithDefaults instantiates a new GetAccountAnalysisResponseEntityFundsManagement object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccountActivity

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAccountActivity() float32`

GetAccountActivity returns the AccountActivity field if non-nil, zero value otherwise.

### GetAccountActivityOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAccountActivityOk() (*float32, bool)`

GetAccountActivityOk returns a tuple with the AccountActivity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountActivity

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetAccountActivity(v float32)`

SetAccountActivity sets AccountActivity field to given value.

### HasAccountActivity

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasAccountActivity() bool`

HasAccountActivity returns a boolean if a field has been set.

### GetAccountSweep

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAccountSweep() string`

GetAccountSweep returns the AccountSweep field if non-nil, zero value otherwise.

### GetAccountSweepOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAccountSweepOk() (*string, bool)`

GetAccountSweepOk returns a tuple with the AccountSweep field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountSweep

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetAccountSweep(v string)`

SetAccountSweep sets AccountSweep field to given value.

### HasAccountSweep

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasAccountSweep() bool`

HasAccountSweep returns a boolean if a field has been set.

### GetAverageMonthlyLoanAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAverageMonthlyLoanAmount() float32`

GetAverageMonthlyLoanAmount returns the AverageMonthlyLoanAmount field if non-nil, zero value otherwise.

### GetAverageMonthlyLoanAmountOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAverageMonthlyLoanAmountOk() (*float32, bool)`

GetAverageMonthlyLoanAmountOk returns a tuple with the AverageMonthlyLoanAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAverageMonthlyLoanAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetAverageMonthlyLoanAmount(v float32)`

SetAverageMonthlyLoanAmount sets AverageMonthlyLoanAmount field to given value.

### HasAverageMonthlyLoanAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasAverageMonthlyLoanAmount() bool`

HasAverageMonthlyLoanAmount returns a boolean if a field has been set.

### GetAverageMonthlyLoanRepaymentAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAverageMonthlyLoanRepaymentAmount() float32`

GetAverageMonthlyLoanRepaymentAmount returns the AverageMonthlyLoanRepaymentAmount field if non-nil, zero value otherwise.

### GetAverageMonthlyLoanRepaymentAmountOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAverageMonthlyLoanRepaymentAmountOk() (*float32, bool)`

GetAverageMonthlyLoanRepaymentAmountOk returns a tuple with the AverageMonthlyLoanRepaymentAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAverageMonthlyLoanRepaymentAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetAverageMonthlyLoanRepaymentAmount(v float32)`

SetAverageMonthlyLoanRepaymentAmount sets AverageMonthlyLoanRepaymentAmount field to given value.

### HasAverageMonthlyLoanRepaymentAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasAverageMonthlyLoanRepaymentAmount() bool`

HasAverageMonthlyLoanRepaymentAmount returns a boolean if a field has been set.

### GetGamblingRate

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetGamblingRate() float32`

GetGamblingRate returns the GamblingRate field if non-nil, zero value otherwise.

### GetGamblingRateOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetGamblingRateOk() (*float32, bool)`

GetGamblingRateOk returns a tuple with the GamblingRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGamblingRate

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetGamblingRate(v float32)`

SetGamblingRate sets GamblingRate field to given value.

### HasGamblingRate

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasGamblingRate() bool`

HasGamblingRate returns a boolean if a field has been set.

### GetGamblingStatus

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetGamblingStatus() string`

GetGamblingStatus returns the GamblingStatus field if non-nil, zero value otherwise.

### GetGamblingStatusOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetGamblingStatusOk() (*string, bool)`

GetGamblingStatusOk returns a tuple with the GamblingStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGamblingStatus

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetGamblingStatus(v string)`

SetGamblingStatus sets GamblingStatus field to given value.

### HasGamblingStatus

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasGamblingStatus() bool`

HasGamblingStatus returns a boolean if a field has been set.

### GetLoanInflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetLoanInflowAmount() string`

GetLoanInflowAmount returns the LoanInflowAmount field if non-nil, zero value otherwise.

### GetLoanInflowAmountOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetLoanInflowAmountOk() (*string, bool)`

GetLoanInflowAmountOk returns a tuple with the LoanInflowAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoanInflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetLoanInflowAmount(v string)`

SetLoanInflowAmount sets LoanInflowAmount field to given value.

### HasLoanInflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasLoanInflowAmount() bool`

HasLoanInflowAmount returns a boolean if a field has been set.

### SetLoanInflowAmountNil

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetLoanInflowAmountNil(b bool)`

 SetLoanInflowAmountNil sets the value for LoanInflowAmount to be an explicit nil

### UnsetLoanInflowAmount
`func (o *GetAccountAnalysisResponseEntityFundsManagement) UnsetLoanInflowAmount()`

UnsetLoanInflowAmount ensures that no value is present for LoanInflowAmount, not even an explicit nil
### GetLoanRepaymentToInflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetLoanRepaymentToInflowAmount() float32`

GetLoanRepaymentToInflowAmount returns the LoanRepaymentToInflowAmount field if non-nil, zero value otherwise.

### GetLoanRepaymentToInflowAmountOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetLoanRepaymentToInflowAmountOk() (*float32, bool)`

GetLoanRepaymentToInflowAmountOk returns a tuple with the LoanRepaymentToInflowAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoanRepaymentToInflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetLoanRepaymentToInflowAmount(v float32)`

SetLoanRepaymentToInflowAmount sets LoanRepaymentToInflowAmount field to given value.

### HasLoanRepaymentToInflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasLoanRepaymentToInflowAmount() bool`

HasLoanRepaymentToInflowAmount returns a boolean if a field has been set.

### GetMonthToMonthInflowToOutflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetMonthToMonthInflowToOutflowAmount() string`

GetMonthToMonthInflowToOutflowAmount returns the MonthToMonthInflowToOutflowAmount field if non-nil, zero value otherwise.

### GetMonthToMonthInflowToOutflowAmountOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetMonthToMonthInflowToOutflowAmountOk() (*string, bool)`

GetMonthToMonthInflowToOutflowAmountOk returns a tuple with the MonthToMonthInflowToOutflowAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonthToMonthInflowToOutflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetMonthToMonthInflowToOutflowAmount(v string)`

SetMonthToMonthInflowToOutflowAmount sets MonthToMonthInflowToOutflowAmount field to given value.

### HasMonthToMonthInflowToOutflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasMonthToMonthInflowToOutflowAmount() bool`

HasMonthToMonthInflowToOutflowAmount returns a boolean if a field has been set.

### GetNumberOfCreditLoanTransactions

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetNumberOfCreditLoanTransactions() string`

GetNumberOfCreditLoanTransactions returns the NumberOfCreditLoanTransactions field if non-nil, zero value otherwise.

### GetNumberOfCreditLoanTransactionsOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetNumberOfCreditLoanTransactionsOk() (*string, bool)`

GetNumberOfCreditLoanTransactionsOk returns a tuple with the NumberOfCreditLoanTransactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfCreditLoanTransactions

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetNumberOfCreditLoanTransactions(v string)`

SetNumberOfCreditLoanTransactions sets NumberOfCreditLoanTransactions field to given value.

### HasNumberOfCreditLoanTransactions

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasNumberOfCreditLoanTransactions() bool`

HasNumberOfCreditLoanTransactions returns a boolean if a field has been set.

### SetNumberOfCreditLoanTransactionsNil

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetNumberOfCreditLoanTransactionsNil(b bool)`

 SetNumberOfCreditLoanTransactionsNil sets the value for NumberOfCreditLoanTransactions to be an explicit nil

### UnsetNumberOfCreditLoanTransactions
`func (o *GetAccountAnalysisResponseEntityFundsManagement) UnsetNumberOfCreditLoanTransactions()`

UnsetNumberOfCreditLoanTransactions ensures that no value is present for NumberOfCreditLoanTransactions, not even an explicit nil
### GetNumberOfDebitRepaymentTransactions

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetNumberOfDebitRepaymentTransactions() string`

GetNumberOfDebitRepaymentTransactions returns the NumberOfDebitRepaymentTransactions field if non-nil, zero value otherwise.

### GetNumberOfDebitRepaymentTransactionsOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetNumberOfDebitRepaymentTransactionsOk() (*string, bool)`

GetNumberOfDebitRepaymentTransactionsOk returns a tuple with the NumberOfDebitRepaymentTransactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfDebitRepaymentTransactions

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetNumberOfDebitRepaymentTransactions(v string)`

SetNumberOfDebitRepaymentTransactions sets NumberOfDebitRepaymentTransactions field to given value.

### HasNumberOfDebitRepaymentTransactions

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasNumberOfDebitRepaymentTransactions() bool`

HasNumberOfDebitRepaymentTransactions returns a boolean if a field has been set.

### SetNumberOfDebitRepaymentTransactionsNil

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetNumberOfDebitRepaymentTransactionsNil(b bool)`

 SetNumberOfDebitRepaymentTransactionsNil sets the value for NumberOfDebitRepaymentTransactions to be an explicit nil

### UnsetNumberOfDebitRepaymentTransactions
`func (o *GetAccountAnalysisResponseEntityFundsManagement) UnsetNumberOfDebitRepaymentTransactions()`

UnsetNumberOfDebitRepaymentTransactions ensures that no value is present for NumberOfDebitRepaymentTransactions, not even an explicit nil
### GetOverallInflowToOutflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetOverallInflowToOutflowAmount() string`

GetOverallInflowToOutflowAmount returns the OverallInflowToOutflowAmount field if non-nil, zero value otherwise.

### GetOverallInflowToOutflowAmountOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetOverallInflowToOutflowAmountOk() (*string, bool)`

GetOverallInflowToOutflowAmountOk returns a tuple with the OverallInflowToOutflowAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverallInflowToOutflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetOverallInflowToOutflowAmount(v string)`

SetOverallInflowToOutflowAmount sets OverallInflowToOutflowAmount field to given value.

### HasOverallInflowToOutflowAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasOverallInflowToOutflowAmount() bool`

HasOverallInflowToOutflowAmount returns a boolean if a field has been set.

### GetPercentOfInflowIrregularity

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetPercentOfInflowIrregularity() float32`

GetPercentOfInflowIrregularity returns the PercentOfInflowIrregularity field if non-nil, zero value otherwise.

### GetPercentOfInflowIrregularityOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetPercentOfInflowIrregularityOk() (*float32, bool)`

GetPercentOfInflowIrregularityOk returns a tuple with the PercentOfInflowIrregularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercentOfInflowIrregularity

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetPercentOfInflowIrregularity(v float32)`

SetPercentOfInflowIrregularity sets PercentOfInflowIrregularity field to given value.

### HasPercentOfInflowIrregularity

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasPercentOfInflowIrregularity() bool`

HasPercentOfInflowIrregularity returns a boolean if a field has been set.

### GetTotalLoanAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetTotalLoanAmount() float32`

GetTotalLoanAmount returns the TotalLoanAmount field if non-nil, zero value otherwise.

### GetTotalLoanAmountOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetTotalLoanAmountOk() (*float32, bool)`

GetTotalLoanAmountOk returns a tuple with the TotalLoanAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalLoanAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetTotalLoanAmount(v float32)`

SetTotalLoanAmount sets TotalLoanAmount field to given value.

### HasTotalLoanAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasTotalLoanAmount() bool`

HasTotalLoanAmount returns a boolean if a field has been set.

### GetTotalLoanRepaymentAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetTotalLoanRepaymentAmount() float32`

GetTotalLoanRepaymentAmount returns the TotalLoanRepaymentAmount field if non-nil, zero value otherwise.

### GetTotalLoanRepaymentAmountOk

`func (o *GetAccountAnalysisResponseEntityFundsManagement) GetTotalLoanRepaymentAmountOk() (*float32, bool)`

GetTotalLoanRepaymentAmountOk returns a tuple with the TotalLoanRepaymentAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalLoanRepaymentAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) SetTotalLoanRepaymentAmount(v float32)`

SetTotalLoanRepaymentAmount sets TotalLoanRepaymentAmount field to given value.

### HasTotalLoanRepaymentAmount

`func (o *GetAccountAnalysisResponseEntityFundsManagement) HasTotalLoanRepaymentAmount() bool`

HasTotalLoanRepaymentAmount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


