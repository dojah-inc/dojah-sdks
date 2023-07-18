# FraudGetIpReputationResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Report** | Pointer to [**FraudGetIpReputationResponseEntityReport**](FraudGetIpReputationResponseEntityReport.md) |  | [optional] 
**Success** | Pointer to **bool** |  | [optional] 

## Methods

### NewFraudGetIpReputationResponseEntity

`func NewFraudGetIpReputationResponseEntity() *FraudGetIpReputationResponseEntity`

NewFraudGetIpReputationResponseEntity instantiates a new FraudGetIpReputationResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFraudGetIpReputationResponseEntityWithDefaults

`func NewFraudGetIpReputationResponseEntityWithDefaults() *FraudGetIpReputationResponseEntity`

NewFraudGetIpReputationResponseEntityWithDefaults instantiates a new FraudGetIpReputationResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReport

`func (o *FraudGetIpReputationResponseEntity) GetReport() FraudGetIpReputationResponseEntityReport`

GetReport returns the Report field if non-nil, zero value otherwise.

### GetReportOk

`func (o *FraudGetIpReputationResponseEntity) GetReportOk() (*FraudGetIpReputationResponseEntityReport, bool)`

GetReportOk returns a tuple with the Report field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReport

`func (o *FraudGetIpReputationResponseEntity) SetReport(v FraudGetIpReputationResponseEntityReport)`

SetReport sets Report field to given value.

### HasReport

`func (o *FraudGetIpReputationResponseEntity) HasReport() bool`

HasReport returns a boolean if a field has been set.

### GetSuccess

`func (o *FraudGetIpReputationResponseEntity) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *FraudGetIpReputationResponseEntity) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *FraudGetIpReputationResponseEntity) SetSuccess(v bool)`

SetSuccess sets Success field to given value.

### HasSuccess

`func (o *FraudGetIpReputationResponseEntity) HasSuccess() bool`

HasSuccess returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


