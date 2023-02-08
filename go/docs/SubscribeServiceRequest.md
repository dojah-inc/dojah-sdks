# SubscribeServiceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Webhook** | Pointer to **string** |  | [optional] 
**Service** | Pointer to **string** |  | [optional] 

## Methods

### NewSubscribeServiceRequest

`func NewSubscribeServiceRequest() *SubscribeServiceRequest`

NewSubscribeServiceRequest instantiates a new SubscribeServiceRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSubscribeServiceRequestWithDefaults

`func NewSubscribeServiceRequestWithDefaults() *SubscribeServiceRequest`

NewSubscribeServiceRequestWithDefaults instantiates a new SubscribeServiceRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWebhook

`func (o *SubscribeServiceRequest) GetWebhook() string`

GetWebhook returns the Webhook field if non-nil, zero value otherwise.

### GetWebhookOk

`func (o *SubscribeServiceRequest) GetWebhookOk() (*string, bool)`

GetWebhookOk returns a tuple with the Webhook field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebhook

`func (o *SubscribeServiceRequest) SetWebhook(v string)`

SetWebhook sets Webhook field to given value.

### HasWebhook

`func (o *SubscribeServiceRequest) HasWebhook() bool`

HasWebhook returns a boolean if a field has been set.

### GetService

`func (o *SubscribeServiceRequest) GetService() string`

GetService returns the Service field if non-nil, zero value otherwise.

### GetServiceOk

`func (o *SubscribeServiceRequest) GetServiceOk() (*string, bool)`

GetServiceOk returns a tuple with the Service field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetService

`func (o *SubscribeServiceRequest) SetService(v string)`

SetService sets Service field to given value.

### HasService

`func (o *SubscribeServiceRequest) HasService() bool`

HasService returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


