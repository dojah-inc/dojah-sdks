# SendOtpRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Destination** | Pointer to **string** |  | [optional] 
**Length** | Pointer to **float32** |  | [optional] 
**Channel** | Pointer to **string** |  | [optional] 
**SenderId** | Pointer to **string** |  | [optional] 
**Priority** | Pointer to **bool** |  | [optional] 

## Methods

### NewSendOtpRequest

`func NewSendOtpRequest() *SendOtpRequest`

NewSendOtpRequest instantiates a new SendOtpRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSendOtpRequestWithDefaults

`func NewSendOtpRequestWithDefaults() *SendOtpRequest`

NewSendOtpRequestWithDefaults instantiates a new SendOtpRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDestination

`func (o *SendOtpRequest) GetDestination() string`

GetDestination returns the Destination field if non-nil, zero value otherwise.

### GetDestinationOk

`func (o *SendOtpRequest) GetDestinationOk() (*string, bool)`

GetDestinationOk returns a tuple with the Destination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestination

`func (o *SendOtpRequest) SetDestination(v string)`

SetDestination sets Destination field to given value.

### HasDestination

`func (o *SendOtpRequest) HasDestination() bool`

HasDestination returns a boolean if a field has been set.

### GetLength

`func (o *SendOtpRequest) GetLength() float32`

GetLength returns the Length field if non-nil, zero value otherwise.

### GetLengthOk

`func (o *SendOtpRequest) GetLengthOk() (*float32, bool)`

GetLengthOk returns a tuple with the Length field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLength

`func (o *SendOtpRequest) SetLength(v float32)`

SetLength sets Length field to given value.

### HasLength

`func (o *SendOtpRequest) HasLength() bool`

HasLength returns a boolean if a field has been set.

### GetChannel

`func (o *SendOtpRequest) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *SendOtpRequest) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *SendOtpRequest) SetChannel(v string)`

SetChannel sets Channel field to given value.

### HasChannel

`func (o *SendOtpRequest) HasChannel() bool`

HasChannel returns a boolean if a field has been set.

### GetSenderId

`func (o *SendOtpRequest) GetSenderId() string`

GetSenderId returns the SenderId field if non-nil, zero value otherwise.

### GetSenderIdOk

`func (o *SendOtpRequest) GetSenderIdOk() (*string, bool)`

GetSenderIdOk returns a tuple with the SenderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderId

`func (o *SendOtpRequest) SetSenderId(v string)`

SetSenderId sets SenderId field to given value.

### HasSenderId

`func (o *SendOtpRequest) HasSenderId() bool`

HasSenderId returns a boolean if a field has been set.

### GetPriority

`func (o *SendOtpRequest) GetPriority() bool`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *SendOtpRequest) GetPriorityOk() (*bool, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *SendOtpRequest) SetPriority(v bool)`

SetPriority sets Priority field to given value.

### HasPriority

`func (o *SendOtpRequest) HasPriority() bool`

HasPriority returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


