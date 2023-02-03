# SendOtpResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entity** | Pointer to [**[]SendOtpResponseEntityInner**](SendOtpResponseEntityInner.md) |  | [optional] 

## Methods

### NewSendOtpResponse

`func NewSendOtpResponse() *SendOtpResponse`

NewSendOtpResponse instantiates a new SendOtpResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSendOtpResponseWithDefaults

`func NewSendOtpResponseWithDefaults() *SendOtpResponse`

NewSendOtpResponseWithDefaults instantiates a new SendOtpResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntity

`func (o *SendOtpResponse) GetEntity() []SendOtpResponseEntityInner`

GetEntity returns the Entity field if non-nil, zero value otherwise.

### GetEntityOk

`func (o *SendOtpResponse) GetEntityOk() (*[]SendOtpResponseEntityInner, bool)`

GetEntityOk returns a tuple with the Entity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntity

`func (o *SendOtpResponse) SetEntity(v []SendOtpResponseEntityInner)`

SetEntity sets Entity field to given value.

### HasEntity

`func (o *SendOtpResponse) HasEntity() bool`

HasEntity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


