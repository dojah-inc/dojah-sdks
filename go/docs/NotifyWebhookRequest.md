# NotifyWebhookRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Subject** | Pointer to **string** |  | [optional] 
**Data** | Pointer to [**NotifyWebhookRequestData**](NotifyWebhookRequestData.md) |  | [optional] 

## Methods

### NewNotifyWebhookRequest

`func NewNotifyWebhookRequest() *NotifyWebhookRequest`

NewNotifyWebhookRequest instantiates a new NotifyWebhookRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNotifyWebhookRequestWithDefaults

`func NewNotifyWebhookRequestWithDefaults() *NotifyWebhookRequest`

NewNotifyWebhookRequestWithDefaults instantiates a new NotifyWebhookRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSubject

`func (o *NotifyWebhookRequest) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *NotifyWebhookRequest) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *NotifyWebhookRequest) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *NotifyWebhookRequest) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetData

`func (o *NotifyWebhookRequest) GetData() NotifyWebhookRequestData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *NotifyWebhookRequest) GetDataOk() (*NotifyWebhookRequestData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *NotifyWebhookRequest) SetData(v NotifyWebhookRequestData)`

SetData sets Data field to given value.

### HasData

`func (o *NotifyWebhookRequest) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


