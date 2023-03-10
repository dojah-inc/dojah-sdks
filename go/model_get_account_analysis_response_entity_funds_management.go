/*
DOJAH APIs

Use Dojah to verify, onboard and manage user identity across Africa!

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package dojah

import (
	"encoding/json"
)

// GetAccountAnalysisResponseEntityFundsManagement struct for GetAccountAnalysisResponseEntityFundsManagement
type GetAccountAnalysisResponseEntityFundsManagement struct {
	AccountActivity *float32 `json:"accountActivity,omitempty"`
	AccountSweep *string `json:"accountSweep,omitempty"`
	AverageMonthlyLoanAmount *float32 `json:"averageMonthlyLoanAmount,omitempty"`
	AverageMonthlyLoanRepaymentAmount *float32 `json:"averageMonthlyLoanRepaymentAmount,omitempty"`
	GamblingRate *float32 `json:"gamblingRate,omitempty"`
	GamblingStatus *string `json:"gamblingStatus,omitempty"`
	LoanInflowAmount NullableString `json:"loanInflowAmount,omitempty"`
	LoanRepaymentToInflowAmount *float32 `json:"loanRepaymentToInflowAmount,omitempty"`
	MonthToMonthInflowToOutflowAmount *string `json:"monthToMonthInflowToOutflowAmount,omitempty"`
	NumberOfCreditLoanTransactions NullableString `json:"numberOfCreditLoanTransactions,omitempty"`
	NumberOfDebitRepaymentTransactions NullableString `json:"numberOfDebitRepaymentTransactions,omitempty"`
	OverallInflowToOutflowAmount *string `json:"overallInflowToOutflowAmount,omitempty"`
	PercentOfInflowIrregularity *float32 `json:"percentOfInflowIrregularity,omitempty"`
	TotalLoanAmount *float32 `json:"totalLoanAmount,omitempty"`
	TotalLoanRepaymentAmount *float32 `json:"totalLoanRepaymentAmount,omitempty"`
}

// NewGetAccountAnalysisResponseEntityFundsManagement instantiates a new GetAccountAnalysisResponseEntityFundsManagement object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetAccountAnalysisResponseEntityFundsManagement() *GetAccountAnalysisResponseEntityFundsManagement {
	this := GetAccountAnalysisResponseEntityFundsManagement{}
	return &this
}

// NewGetAccountAnalysisResponseEntityFundsManagementWithDefaults instantiates a new GetAccountAnalysisResponseEntityFundsManagement object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetAccountAnalysisResponseEntityFundsManagementWithDefaults() *GetAccountAnalysisResponseEntityFundsManagement {
	this := GetAccountAnalysisResponseEntityFundsManagement{}
	return &this
}

// GetAccountActivity returns the AccountActivity field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAccountActivity() float32 {
	if o == nil || isNil(o.AccountActivity) {
		var ret float32
		return ret
	}
	return *o.AccountActivity
}

// GetAccountActivityOk returns a tuple with the AccountActivity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAccountActivityOk() (*float32, bool) {
	if o == nil || isNil(o.AccountActivity) {
    return nil, false
	}
	return o.AccountActivity, true
}

// HasAccountActivity returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasAccountActivity() bool {
	if o != nil && !isNil(o.AccountActivity) {
		return true
	}

	return false
}

// SetAccountActivity gets a reference to the given float32 and assigns it to the AccountActivity field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetAccountActivity(v float32) {
	o.AccountActivity = &v
}

// GetAccountSweep returns the AccountSweep field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAccountSweep() string {
	if o == nil || isNil(o.AccountSweep) {
		var ret string
		return ret
	}
	return *o.AccountSweep
}

// GetAccountSweepOk returns a tuple with the AccountSweep field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAccountSweepOk() (*string, bool) {
	if o == nil || isNil(o.AccountSweep) {
    return nil, false
	}
	return o.AccountSweep, true
}

// HasAccountSweep returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasAccountSweep() bool {
	if o != nil && !isNil(o.AccountSweep) {
		return true
	}

	return false
}

// SetAccountSweep gets a reference to the given string and assigns it to the AccountSweep field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetAccountSweep(v string) {
	o.AccountSweep = &v
}

// GetAverageMonthlyLoanAmount returns the AverageMonthlyLoanAmount field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAverageMonthlyLoanAmount() float32 {
	if o == nil || isNil(o.AverageMonthlyLoanAmount) {
		var ret float32
		return ret
	}
	return *o.AverageMonthlyLoanAmount
}

// GetAverageMonthlyLoanAmountOk returns a tuple with the AverageMonthlyLoanAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAverageMonthlyLoanAmountOk() (*float32, bool) {
	if o == nil || isNil(o.AverageMonthlyLoanAmount) {
    return nil, false
	}
	return o.AverageMonthlyLoanAmount, true
}

// HasAverageMonthlyLoanAmount returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasAverageMonthlyLoanAmount() bool {
	if o != nil && !isNil(o.AverageMonthlyLoanAmount) {
		return true
	}

	return false
}

// SetAverageMonthlyLoanAmount gets a reference to the given float32 and assigns it to the AverageMonthlyLoanAmount field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetAverageMonthlyLoanAmount(v float32) {
	o.AverageMonthlyLoanAmount = &v
}

// GetAverageMonthlyLoanRepaymentAmount returns the AverageMonthlyLoanRepaymentAmount field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAverageMonthlyLoanRepaymentAmount() float32 {
	if o == nil || isNil(o.AverageMonthlyLoanRepaymentAmount) {
		var ret float32
		return ret
	}
	return *o.AverageMonthlyLoanRepaymentAmount
}

// GetAverageMonthlyLoanRepaymentAmountOk returns a tuple with the AverageMonthlyLoanRepaymentAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetAverageMonthlyLoanRepaymentAmountOk() (*float32, bool) {
	if o == nil || isNil(o.AverageMonthlyLoanRepaymentAmount) {
    return nil, false
	}
	return o.AverageMonthlyLoanRepaymentAmount, true
}

// HasAverageMonthlyLoanRepaymentAmount returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasAverageMonthlyLoanRepaymentAmount() bool {
	if o != nil && !isNil(o.AverageMonthlyLoanRepaymentAmount) {
		return true
	}

	return false
}

// SetAverageMonthlyLoanRepaymentAmount gets a reference to the given float32 and assigns it to the AverageMonthlyLoanRepaymentAmount field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetAverageMonthlyLoanRepaymentAmount(v float32) {
	o.AverageMonthlyLoanRepaymentAmount = &v
}

// GetGamblingRate returns the GamblingRate field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetGamblingRate() float32 {
	if o == nil || isNil(o.GamblingRate) {
		var ret float32
		return ret
	}
	return *o.GamblingRate
}

// GetGamblingRateOk returns a tuple with the GamblingRate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetGamblingRateOk() (*float32, bool) {
	if o == nil || isNil(o.GamblingRate) {
    return nil, false
	}
	return o.GamblingRate, true
}

// HasGamblingRate returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasGamblingRate() bool {
	if o != nil && !isNil(o.GamblingRate) {
		return true
	}

	return false
}

// SetGamblingRate gets a reference to the given float32 and assigns it to the GamblingRate field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetGamblingRate(v float32) {
	o.GamblingRate = &v
}

// GetGamblingStatus returns the GamblingStatus field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetGamblingStatus() string {
	if o == nil || isNil(o.GamblingStatus) {
		var ret string
		return ret
	}
	return *o.GamblingStatus
}

// GetGamblingStatusOk returns a tuple with the GamblingStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetGamblingStatusOk() (*string, bool) {
	if o == nil || isNil(o.GamblingStatus) {
    return nil, false
	}
	return o.GamblingStatus, true
}

// HasGamblingStatus returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasGamblingStatus() bool {
	if o != nil && !isNil(o.GamblingStatus) {
		return true
	}

	return false
}

// SetGamblingStatus gets a reference to the given string and assigns it to the GamblingStatus field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetGamblingStatus(v string) {
	o.GamblingStatus = &v
}

// GetLoanInflowAmount returns the LoanInflowAmount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetLoanInflowAmount() string {
	if o == nil || isNil(o.LoanInflowAmount.Get()) {
		var ret string
		return ret
	}
	return *o.LoanInflowAmount.Get()
}

// GetLoanInflowAmountOk returns a tuple with the LoanInflowAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetLoanInflowAmountOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.LoanInflowAmount.Get(), o.LoanInflowAmount.IsSet()
}

// HasLoanInflowAmount returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasLoanInflowAmount() bool {
	if o != nil && o.LoanInflowAmount.IsSet() {
		return true
	}

	return false
}

// SetLoanInflowAmount gets a reference to the given NullableString and assigns it to the LoanInflowAmount field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetLoanInflowAmount(v string) {
	o.LoanInflowAmount.Set(&v)
}
// SetLoanInflowAmountNil sets the value for LoanInflowAmount to be an explicit nil
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetLoanInflowAmountNil() {
	o.LoanInflowAmount.Set(nil)
}

// UnsetLoanInflowAmount ensures that no value is present for LoanInflowAmount, not even an explicit nil
func (o *GetAccountAnalysisResponseEntityFundsManagement) UnsetLoanInflowAmount() {
	o.LoanInflowAmount.Unset()
}

// GetLoanRepaymentToInflowAmount returns the LoanRepaymentToInflowAmount field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetLoanRepaymentToInflowAmount() float32 {
	if o == nil || isNil(o.LoanRepaymentToInflowAmount) {
		var ret float32
		return ret
	}
	return *o.LoanRepaymentToInflowAmount
}

// GetLoanRepaymentToInflowAmountOk returns a tuple with the LoanRepaymentToInflowAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetLoanRepaymentToInflowAmountOk() (*float32, bool) {
	if o == nil || isNil(o.LoanRepaymentToInflowAmount) {
    return nil, false
	}
	return o.LoanRepaymentToInflowAmount, true
}

// HasLoanRepaymentToInflowAmount returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasLoanRepaymentToInflowAmount() bool {
	if o != nil && !isNil(o.LoanRepaymentToInflowAmount) {
		return true
	}

	return false
}

// SetLoanRepaymentToInflowAmount gets a reference to the given float32 and assigns it to the LoanRepaymentToInflowAmount field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetLoanRepaymentToInflowAmount(v float32) {
	o.LoanRepaymentToInflowAmount = &v
}

// GetMonthToMonthInflowToOutflowAmount returns the MonthToMonthInflowToOutflowAmount field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetMonthToMonthInflowToOutflowAmount() string {
	if o == nil || isNil(o.MonthToMonthInflowToOutflowAmount) {
		var ret string
		return ret
	}
	return *o.MonthToMonthInflowToOutflowAmount
}

// GetMonthToMonthInflowToOutflowAmountOk returns a tuple with the MonthToMonthInflowToOutflowAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetMonthToMonthInflowToOutflowAmountOk() (*string, bool) {
	if o == nil || isNil(o.MonthToMonthInflowToOutflowAmount) {
    return nil, false
	}
	return o.MonthToMonthInflowToOutflowAmount, true
}

// HasMonthToMonthInflowToOutflowAmount returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasMonthToMonthInflowToOutflowAmount() bool {
	if o != nil && !isNil(o.MonthToMonthInflowToOutflowAmount) {
		return true
	}

	return false
}

// SetMonthToMonthInflowToOutflowAmount gets a reference to the given string and assigns it to the MonthToMonthInflowToOutflowAmount field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetMonthToMonthInflowToOutflowAmount(v string) {
	o.MonthToMonthInflowToOutflowAmount = &v
}

// GetNumberOfCreditLoanTransactions returns the NumberOfCreditLoanTransactions field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetNumberOfCreditLoanTransactions() string {
	if o == nil || isNil(o.NumberOfCreditLoanTransactions.Get()) {
		var ret string
		return ret
	}
	return *o.NumberOfCreditLoanTransactions.Get()
}

// GetNumberOfCreditLoanTransactionsOk returns a tuple with the NumberOfCreditLoanTransactions field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetNumberOfCreditLoanTransactionsOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.NumberOfCreditLoanTransactions.Get(), o.NumberOfCreditLoanTransactions.IsSet()
}

// HasNumberOfCreditLoanTransactions returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasNumberOfCreditLoanTransactions() bool {
	if o != nil && o.NumberOfCreditLoanTransactions.IsSet() {
		return true
	}

	return false
}

// SetNumberOfCreditLoanTransactions gets a reference to the given NullableString and assigns it to the NumberOfCreditLoanTransactions field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetNumberOfCreditLoanTransactions(v string) {
	o.NumberOfCreditLoanTransactions.Set(&v)
}
// SetNumberOfCreditLoanTransactionsNil sets the value for NumberOfCreditLoanTransactions to be an explicit nil
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetNumberOfCreditLoanTransactionsNil() {
	o.NumberOfCreditLoanTransactions.Set(nil)
}

// UnsetNumberOfCreditLoanTransactions ensures that no value is present for NumberOfCreditLoanTransactions, not even an explicit nil
func (o *GetAccountAnalysisResponseEntityFundsManagement) UnsetNumberOfCreditLoanTransactions() {
	o.NumberOfCreditLoanTransactions.Unset()
}

// GetNumberOfDebitRepaymentTransactions returns the NumberOfDebitRepaymentTransactions field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetNumberOfDebitRepaymentTransactions() string {
	if o == nil || isNil(o.NumberOfDebitRepaymentTransactions.Get()) {
		var ret string
		return ret
	}
	return *o.NumberOfDebitRepaymentTransactions.Get()
}

// GetNumberOfDebitRepaymentTransactionsOk returns a tuple with the NumberOfDebitRepaymentTransactions field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetNumberOfDebitRepaymentTransactionsOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.NumberOfDebitRepaymentTransactions.Get(), o.NumberOfDebitRepaymentTransactions.IsSet()
}

// HasNumberOfDebitRepaymentTransactions returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasNumberOfDebitRepaymentTransactions() bool {
	if o != nil && o.NumberOfDebitRepaymentTransactions.IsSet() {
		return true
	}

	return false
}

// SetNumberOfDebitRepaymentTransactions gets a reference to the given NullableString and assigns it to the NumberOfDebitRepaymentTransactions field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetNumberOfDebitRepaymentTransactions(v string) {
	o.NumberOfDebitRepaymentTransactions.Set(&v)
}
// SetNumberOfDebitRepaymentTransactionsNil sets the value for NumberOfDebitRepaymentTransactions to be an explicit nil
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetNumberOfDebitRepaymentTransactionsNil() {
	o.NumberOfDebitRepaymentTransactions.Set(nil)
}

// UnsetNumberOfDebitRepaymentTransactions ensures that no value is present for NumberOfDebitRepaymentTransactions, not even an explicit nil
func (o *GetAccountAnalysisResponseEntityFundsManagement) UnsetNumberOfDebitRepaymentTransactions() {
	o.NumberOfDebitRepaymentTransactions.Unset()
}

// GetOverallInflowToOutflowAmount returns the OverallInflowToOutflowAmount field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetOverallInflowToOutflowAmount() string {
	if o == nil || isNil(o.OverallInflowToOutflowAmount) {
		var ret string
		return ret
	}
	return *o.OverallInflowToOutflowAmount
}

// GetOverallInflowToOutflowAmountOk returns a tuple with the OverallInflowToOutflowAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetOverallInflowToOutflowAmountOk() (*string, bool) {
	if o == nil || isNil(o.OverallInflowToOutflowAmount) {
    return nil, false
	}
	return o.OverallInflowToOutflowAmount, true
}

// HasOverallInflowToOutflowAmount returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasOverallInflowToOutflowAmount() bool {
	if o != nil && !isNil(o.OverallInflowToOutflowAmount) {
		return true
	}

	return false
}

// SetOverallInflowToOutflowAmount gets a reference to the given string and assigns it to the OverallInflowToOutflowAmount field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetOverallInflowToOutflowAmount(v string) {
	o.OverallInflowToOutflowAmount = &v
}

// GetPercentOfInflowIrregularity returns the PercentOfInflowIrregularity field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetPercentOfInflowIrregularity() float32 {
	if o == nil || isNil(o.PercentOfInflowIrregularity) {
		var ret float32
		return ret
	}
	return *o.PercentOfInflowIrregularity
}

// GetPercentOfInflowIrregularityOk returns a tuple with the PercentOfInflowIrregularity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetPercentOfInflowIrregularityOk() (*float32, bool) {
	if o == nil || isNil(o.PercentOfInflowIrregularity) {
    return nil, false
	}
	return o.PercentOfInflowIrregularity, true
}

// HasPercentOfInflowIrregularity returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasPercentOfInflowIrregularity() bool {
	if o != nil && !isNil(o.PercentOfInflowIrregularity) {
		return true
	}

	return false
}

// SetPercentOfInflowIrregularity gets a reference to the given float32 and assigns it to the PercentOfInflowIrregularity field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetPercentOfInflowIrregularity(v float32) {
	o.PercentOfInflowIrregularity = &v
}

// GetTotalLoanAmount returns the TotalLoanAmount field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetTotalLoanAmount() float32 {
	if o == nil || isNil(o.TotalLoanAmount) {
		var ret float32
		return ret
	}
	return *o.TotalLoanAmount
}

// GetTotalLoanAmountOk returns a tuple with the TotalLoanAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetTotalLoanAmountOk() (*float32, bool) {
	if o == nil || isNil(o.TotalLoanAmount) {
    return nil, false
	}
	return o.TotalLoanAmount, true
}

// HasTotalLoanAmount returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasTotalLoanAmount() bool {
	if o != nil && !isNil(o.TotalLoanAmount) {
		return true
	}

	return false
}

// SetTotalLoanAmount gets a reference to the given float32 and assigns it to the TotalLoanAmount field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetTotalLoanAmount(v float32) {
	o.TotalLoanAmount = &v
}

// GetTotalLoanRepaymentAmount returns the TotalLoanRepaymentAmount field value if set, zero value otherwise.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetTotalLoanRepaymentAmount() float32 {
	if o == nil || isNil(o.TotalLoanRepaymentAmount) {
		var ret float32
		return ret
	}
	return *o.TotalLoanRepaymentAmount
}

// GetTotalLoanRepaymentAmountOk returns a tuple with the TotalLoanRepaymentAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) GetTotalLoanRepaymentAmountOk() (*float32, bool) {
	if o == nil || isNil(o.TotalLoanRepaymentAmount) {
    return nil, false
	}
	return o.TotalLoanRepaymentAmount, true
}

// HasTotalLoanRepaymentAmount returns a boolean if a field has been set.
func (o *GetAccountAnalysisResponseEntityFundsManagement) HasTotalLoanRepaymentAmount() bool {
	if o != nil && !isNil(o.TotalLoanRepaymentAmount) {
		return true
	}

	return false
}

// SetTotalLoanRepaymentAmount gets a reference to the given float32 and assigns it to the TotalLoanRepaymentAmount field.
func (o *GetAccountAnalysisResponseEntityFundsManagement) SetTotalLoanRepaymentAmount(v float32) {
	o.TotalLoanRepaymentAmount = &v
}

func (o GetAccountAnalysisResponseEntityFundsManagement) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.AccountActivity) {
		toSerialize["accountActivity"] = o.AccountActivity
	}
	if !isNil(o.AccountSweep) {
		toSerialize["accountSweep"] = o.AccountSweep
	}
	if !isNil(o.AverageMonthlyLoanAmount) {
		toSerialize["averageMonthlyLoanAmount"] = o.AverageMonthlyLoanAmount
	}
	if !isNil(o.AverageMonthlyLoanRepaymentAmount) {
		toSerialize["averageMonthlyLoanRepaymentAmount"] = o.AverageMonthlyLoanRepaymentAmount
	}
	if !isNil(o.GamblingRate) {
		toSerialize["gamblingRate"] = o.GamblingRate
	}
	if !isNil(o.GamblingStatus) {
		toSerialize["gamblingStatus"] = o.GamblingStatus
	}
	if o.LoanInflowAmount.IsSet() {
		toSerialize["loanInflowAmount"] = o.LoanInflowAmount.Get()
	}
	if !isNil(o.LoanRepaymentToInflowAmount) {
		toSerialize["loanRepaymentToInflowAmount"] = o.LoanRepaymentToInflowAmount
	}
	if !isNil(o.MonthToMonthInflowToOutflowAmount) {
		toSerialize["monthToMonthInflowToOutflowAmount"] = o.MonthToMonthInflowToOutflowAmount
	}
	if o.NumberOfCreditLoanTransactions.IsSet() {
		toSerialize["numberOfCreditLoanTransactions"] = o.NumberOfCreditLoanTransactions.Get()
	}
	if o.NumberOfDebitRepaymentTransactions.IsSet() {
		toSerialize["numberOfDebitRepaymentTransactions"] = o.NumberOfDebitRepaymentTransactions.Get()
	}
	if !isNil(o.OverallInflowToOutflowAmount) {
		toSerialize["overallInflowToOutflowAmount"] = o.OverallInflowToOutflowAmount
	}
	if !isNil(o.PercentOfInflowIrregularity) {
		toSerialize["percentOfInflowIrregularity"] = o.PercentOfInflowIrregularity
	}
	if !isNil(o.TotalLoanAmount) {
		toSerialize["totalLoanAmount"] = o.TotalLoanAmount
	}
	if !isNil(o.TotalLoanRepaymentAmount) {
		toSerialize["totalLoanRepaymentAmount"] = o.TotalLoanRepaymentAmount
	}
	return json.Marshal(toSerialize)
}

type NullableGetAccountAnalysisResponseEntityFundsManagement struct {
	value *GetAccountAnalysisResponseEntityFundsManagement
	isSet bool
}

func (v NullableGetAccountAnalysisResponseEntityFundsManagement) Get() *GetAccountAnalysisResponseEntityFundsManagement {
	return v.value
}

func (v *NullableGetAccountAnalysisResponseEntityFundsManagement) Set(val *GetAccountAnalysisResponseEntityFundsManagement) {
	v.value = val
	v.isSet = true
}

func (v NullableGetAccountAnalysisResponseEntityFundsManagement) IsSet() bool {
	return v.isSet
}

func (v *NullableGetAccountAnalysisResponseEntityFundsManagement) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetAccountAnalysisResponseEntityFundsManagement(val *GetAccountAnalysisResponseEntityFundsManagement) *NullableGetAccountAnalysisResponseEntityFundsManagement {
	return &NullableGetAccountAnalysisResponseEntityFundsManagement{value: val, isSet: true}
}

func (v NullableGetAccountAnalysisResponseEntityFundsManagement) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetAccountAnalysisResponseEntityFundsManagement) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


