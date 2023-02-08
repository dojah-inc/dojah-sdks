# SendSmsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Destination** | Pointer to **string** |  | [optional] 
**Message** | Pointer to **string** |  | [optional] 
**Channel** | Pointer to **string** |  | [optional] 
**SenderId** | Pointer to **string** |  | [optional] 

## Methods

### NewSendSmsRequest

`func NewSendSmsRequest() *SendSmsRequest`

NewSendSmsRequest instantiates a new SendSmsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSendSmsRequestWithDefaults

`func NewSendSmsRequestWithDefaults() *SendSmsRequest`

NewSendSmsRequestWithDefaults instantiates a new SendSmsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDestination

`func (o *SendSmsRequest) GetDestination() string`

GetDestination returns the Destination field if non-nil, zero value otherwise.

### GetDestinationOk

`func (o *SendSmsRequest) GetDestinationOk() (*string, bool)`

GetDestinationOk returns a tuple with the Destination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestination

`func (o *SendSmsRequest) SetDestination(v string)`

SetDestination sets Destination field to given value.

### HasDestination

`func (o *SendSmsRequest) HasDestination() bool`

HasDestination returns a boolean if a field has been set.

### GetMessage

`func (o *SendSmsRequest) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *SendSmsRequest) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *SendSmsRequest) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *SendSmsRequest) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetChannel

`func (o *SendSmsRequest) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *SendSmsRequest) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *SendSmsRequest) SetChannel(v string)`

SetChannel sets Channel field to given value.

### HasChannel

`func (o *SendSmsRequest) HasChannel() bool`

HasChannel returns a boolean if a field has been set.

### GetSenderId

`func (o *SendSmsRequest) GetSenderId() string`

GetSenderId returns the SenderId field if non-nil, zero value otherwise.

### GetSenderIdOk

`func (o *SendSmsRequest) GetSenderIdOk() (*string, bool)`

GetSenderIdOk returns a tuple with the SenderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderId

`func (o *SendSmsRequest) SetSenderId(v string)`

SetSenderId sets SenderId field to given value.

### HasSenderId

`func (o *SendSmsRequest) HasSenderId() bool`

HasSenderId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


