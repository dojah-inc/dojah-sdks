# AnalyzeDocumentResponseEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**AnalyzeDocumentResponseEntityStatus**](AnalyzeDocumentResponseEntityStatus.md) |  | [optional] 
**DocumentType** | Pointer to [**AnalyzeDocumentResponseEntityDocumentType**](AnalyzeDocumentResponseEntityDocumentType.md) |  | [optional] 
**DocumentImages** | Pointer to [**AnalyzeDocumentResponseEntityDocumentImages**](AnalyzeDocumentResponseEntityDocumentImages.md) |  | [optional] 
**TextData** | Pointer to [**[]AnalyzeDocumentResponseEntityTextDataInner**](AnalyzeDocumentResponseEntityTextDataInner.md) |  | [optional] 

## Methods

### NewAnalyzeDocumentResponseEntity

`func NewAnalyzeDocumentResponseEntity() *AnalyzeDocumentResponseEntity`

NewAnalyzeDocumentResponseEntity instantiates a new AnalyzeDocumentResponseEntity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAnalyzeDocumentResponseEntityWithDefaults

`func NewAnalyzeDocumentResponseEntityWithDefaults() *AnalyzeDocumentResponseEntity`

NewAnalyzeDocumentResponseEntityWithDefaults instantiates a new AnalyzeDocumentResponseEntity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *AnalyzeDocumentResponseEntity) GetStatus() AnalyzeDocumentResponseEntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AnalyzeDocumentResponseEntity) GetStatusOk() (*AnalyzeDocumentResponseEntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AnalyzeDocumentResponseEntity) SetStatus(v AnalyzeDocumentResponseEntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AnalyzeDocumentResponseEntity) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetDocumentType

`func (o *AnalyzeDocumentResponseEntity) GetDocumentType() AnalyzeDocumentResponseEntityDocumentType`

GetDocumentType returns the DocumentType field if non-nil, zero value otherwise.

### GetDocumentTypeOk

`func (o *AnalyzeDocumentResponseEntity) GetDocumentTypeOk() (*AnalyzeDocumentResponseEntityDocumentType, bool)`

GetDocumentTypeOk returns a tuple with the DocumentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentType

`func (o *AnalyzeDocumentResponseEntity) SetDocumentType(v AnalyzeDocumentResponseEntityDocumentType)`

SetDocumentType sets DocumentType field to given value.

### HasDocumentType

`func (o *AnalyzeDocumentResponseEntity) HasDocumentType() bool`

HasDocumentType returns a boolean if a field has been set.

### GetDocumentImages

`func (o *AnalyzeDocumentResponseEntity) GetDocumentImages() AnalyzeDocumentResponseEntityDocumentImages`

GetDocumentImages returns the DocumentImages field if non-nil, zero value otherwise.

### GetDocumentImagesOk

`func (o *AnalyzeDocumentResponseEntity) GetDocumentImagesOk() (*AnalyzeDocumentResponseEntityDocumentImages, bool)`

GetDocumentImagesOk returns a tuple with the DocumentImages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentImages

`func (o *AnalyzeDocumentResponseEntity) SetDocumentImages(v AnalyzeDocumentResponseEntityDocumentImages)`

SetDocumentImages sets DocumentImages field to given value.

### HasDocumentImages

`func (o *AnalyzeDocumentResponseEntity) HasDocumentImages() bool`

HasDocumentImages returns a boolean if a field has been set.

### GetTextData

`func (o *AnalyzeDocumentResponseEntity) GetTextData() []AnalyzeDocumentResponseEntityTextDataInner`

GetTextData returns the TextData field if non-nil, zero value otherwise.

### GetTextDataOk

`func (o *AnalyzeDocumentResponseEntity) GetTextDataOk() (*[]AnalyzeDocumentResponseEntityTextDataInner, bool)`

GetTextDataOk returns a tuple with the TextData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTextData

`func (o *AnalyzeDocumentResponseEntity) SetTextData(v []AnalyzeDocumentResponseEntityTextDataInner)`

SetTextData sets TextData field to given value.

### HasTextData

`func (o *AnalyzeDocumentResponseEntity) HasTextData() bool`

HasTextData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


