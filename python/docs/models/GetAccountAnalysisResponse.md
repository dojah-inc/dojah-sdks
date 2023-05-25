# dojah_client.model.get_account_analysis_response.GetAccountAnalysisResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[entity](#entity)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# entity

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[accountBreakdown](#accountBreakdown)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[expenseBreakdown](#expenseBreakdown)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[fundsManagement](#fundsManagement)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[inflowBreakdown](#inflowBreakdown)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[transactionRoutineBreakdown](#transactionRoutineBreakdown)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**status** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# accountBreakdown

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**TotalCreditEntry** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**TotalDebitMade** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyBalance** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyCredits** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyDebits** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageWeeklyBalance** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageWeeklyCredits** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageWeeklyDebits** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**closingBalance** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**firstDateInStatement** | str,  | str,  |  | [optional] 
**lastDateInStatement** | str,  | str,  |  | [optional] 
**numberOfTransactingMonths** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**periodInStatement** | str,  | str,  |  | [optional] 
**yearInStatement** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# expenseBreakdown

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**MaximumExpense** | str,  | str,  |  | [optional] 
**[atmLocations](#atmLocations)** | list, tuple,  | tuple,  |  | [optional] 
**averageMonthlyExpenseOnAirtimeandData** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnAtmAndPOS** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnChargesAndStampDuty** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnEntertainment** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnGambling** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnHealth** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnHospitalityandFood** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnInsurance** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnInternationalTransactions** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnOnlineandWeb** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnRent** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnSavingsAndInvestments** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnTransfer** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnTransportation** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnUSSD** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseOnUtilities** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyExpenseonTravel** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyRecurringExpenses** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyTotalExpenses** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**minimumSalary** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**monthWithmaximumExpense** | str,  | str,  |  | [optional] 
**mostFrequentExpense** | str,  | str,  |  | [optional] 
**mostFrequentExpenseCategory** | str,  | str,  |  | [optional] 
**totalExpenseOnAirtimeAndData** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseOnInternationalTransactions** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseOnSavingsAndInvestments** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseOnTransfer** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseOnTransportation** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseOnTravel** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseOnUSSD** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseOnUtilities** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseonChargesAndStampDuty** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseonEntertainment** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseonGambling** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseonHealth** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseonHospitalityandFood** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseonInsurance** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalExpenseonOnlineandWeb** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalMonthlyExpenses** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalRecurringExpenses** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# atmLocations

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# fundsManagement

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**accountActivity** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**accountSweep** | str,  | str,  |  | [optional] 
**averageMonthlyLoanAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageMonthlyLoanRepaymentAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**gamblingRate** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**gamblingStatus** | str,  | str,  |  | [optional] 
**loanInflowAmount** | None, str,  | NoneClass, str,  |  | [optional] 
**loanRepaymentToInflowAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**monthToMonthInflowToOutflowAmount** | str,  | str,  |  | [optional] 
**numberOfCreditLoanTransactions** | None, str,  | NoneClass, str,  |  | [optional] 
**numberOfDebitRepaymentTransactions** | None, str,  | NoneClass, str,  |  | [optional] 
**overallInflowToOutflowAmount** | str,  | str,  |  | [optional] 
**percentOfInflowIrregularity** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalLoanAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalLoanRepaymentAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# inflowBreakdown

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**AdditionalIncome** | str,  | str,  |  | [optional] 
**RecurringSalaryPayments** | None, str,  | NoneClass, str,  |  | [optional] 
**aSalaryEarner** | str,  | str,  |  | [optional] 
**averageAdditionalIncome** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**averageGuaranteedSalary** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**estimatedSalaryPaymentDay** | None, str,  | NoneClass, str,  |  | [optional] 
**lastDateOfSalaryPayment** | None, str,  | NoneClass, str,  |  | [optional] 
**minimumSalary** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**netAverageMonthlySalary** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**numberOfAdditionalIncomePayments** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalnumberOfSalaryPayments** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# transactionRoutineBreakdown

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**MaximumExpense** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**lastCreditReceived** | str,  | str,  |  | [optional] 
**lastDebitMade** | str,  | str,  |  | [optional] 
**mostFrequentBalanceRange** | str,  | str,  |  | [optional] 
**mostFrequentTransactionRange** | str,  | str,  |  | [optional] 
**numberOfCardRequests** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentNumberOfDaysBalanceWasLessThan10ThousandNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentNumberOfDaysTransactionsWasLessThan10ThousandNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfBalancesBetween100ThousandTo500ThousandNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfBalancesBetween10ThousandTo100ThousandNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfBalancesBetween500ThousandToOneMillionNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfBalancesGreaterThanOneMillionNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfBalancesLessThan10ThousandNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfTransactionsBetween100ThousandTo500ThousandNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfTransactionsBetween10ThousandTo100ThousandNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfTransactionsBetween500ThousandToOneMillionNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfTransactionsGreaterThanOneMillionNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentOfTransactionsLessThan10ThousandNaira** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentofCreditTransactions** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**percentofDebitTransactions** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**totalAmountOfTransactions** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

