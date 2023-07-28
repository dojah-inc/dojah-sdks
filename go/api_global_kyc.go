/*
DOJAH Publilc APIs

Use Dojah to verify, onboard and manage user identity across Africa!

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package dojah

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
)


// GlobalKYCApiService GlobalKYCApi service
type GlobalKYCApiService service

type GlobalKYCApiCaEkycRequest struct {
	ctx context.Context
	ApiService *GlobalKYCApiService
	country *string
	firstName *string
	lastName *string
	streetName *string
	dateOfBirth *string
	houseNumber *int32
	postCode *int32
}

func (r GlobalKYCApiCaEkycRequest) Country(country string) GlobalKYCApiCaEkycRequest {
	r.country = &country
	return r
}

func (r GlobalKYCApiCaEkycRequest) FirstName(firstName string) GlobalKYCApiCaEkycRequest {
	r.firstName = &firstName
	return r
}

func (r GlobalKYCApiCaEkycRequest) LastName(lastName string) GlobalKYCApiCaEkycRequest {
	r.lastName = &lastName
	return r
}

func (r GlobalKYCApiCaEkycRequest) StreetName(streetName string) GlobalKYCApiCaEkycRequest {
	r.streetName = &streetName
	return r
}

func (r GlobalKYCApiCaEkycRequest) DateOfBirth(dateOfBirth string) GlobalKYCApiCaEkycRequest {
	r.dateOfBirth = &dateOfBirth
	return r
}

func (r GlobalKYCApiCaEkycRequest) HouseNumber(houseNumber int32) GlobalKYCApiCaEkycRequest {
	r.houseNumber = &houseNumber
	return r
}

func (r GlobalKYCApiCaEkycRequest) PostCode(postCode int32) GlobalKYCApiCaEkycRequest {
	r.postCode = &postCode
	return r
}

func (r GlobalKYCApiCaEkycRequest) Execute() (map[string]interface{}, *http.Response, error) {
	return r.ApiService.CaEkycExecute(r)
}

/*
CaEkyc Canada Ekyc

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return GlobalKYCApiCaEkycRequest
*/
func (a *GlobalKYCApiService) CaEkyc() GlobalKYCApiCaEkycRequest {
	return GlobalKYCApiCaEkycRequest{
		ApiService: a,
		ctx: a.client.cfg.Context,
	}
}

// Execute executes the request
//  @return map[string]interface{}
func (a *GlobalKYCApiService) CaEkycExecute(r GlobalKYCApiCaEkycRequest) (map[string]interface{}, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  map[string]interface{}
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalKYCApiService.CaEkyc")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/ca/kyc"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.country != nil {
		localVarQueryParams.Add("country", parameterToString(*r.country, ""))
	}
	if r.firstName != nil {
		localVarQueryParams.Add("first_name", parameterToString(*r.firstName, ""))
	}
	if r.lastName != nil {
		localVarQueryParams.Add("last_name", parameterToString(*r.lastName, ""))
	}
	if r.streetName != nil {
		localVarQueryParams.Add("street_name", parameterToString(*r.streetName, ""))
	}
	if r.dateOfBirth != nil {
		localVarQueryParams.Add("date_of_birth", parameterToString(*r.dateOfBirth, ""))
	}
	if r.houseNumber != nil {
		localVarQueryParams.Add("house_number", parameterToString(*r.houseNumber, ""))
	}
	if r.postCode != nil {
		localVarQueryParams.Add("post_code", parameterToString(*r.postCode, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apikeyAuth"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["appIdAuth"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["AppId"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type GlobalKYCApiGetUsSsnRequest struct {
	ctx context.Context
	ApiService *GlobalKYCApiService
	country *string
	firstName *string
	lastName *string
	streetName *string
	dateOfBirth *string
	houseNumber *int32
	postCode *int32
}

func (r GlobalKYCApiGetUsSsnRequest) Country(country string) GlobalKYCApiGetUsSsnRequest {
	r.country = &country
	return r
}

func (r GlobalKYCApiGetUsSsnRequest) FirstName(firstName string) GlobalKYCApiGetUsSsnRequest {
	r.firstName = &firstName
	return r
}

func (r GlobalKYCApiGetUsSsnRequest) LastName(lastName string) GlobalKYCApiGetUsSsnRequest {
	r.lastName = &lastName
	return r
}

func (r GlobalKYCApiGetUsSsnRequest) StreetName(streetName string) GlobalKYCApiGetUsSsnRequest {
	r.streetName = &streetName
	return r
}

func (r GlobalKYCApiGetUsSsnRequest) DateOfBirth(dateOfBirth string) GlobalKYCApiGetUsSsnRequest {
	r.dateOfBirth = &dateOfBirth
	return r
}

func (r GlobalKYCApiGetUsSsnRequest) HouseNumber(houseNumber int32) GlobalKYCApiGetUsSsnRequest {
	r.houseNumber = &houseNumber
	return r
}

func (r GlobalKYCApiGetUsSsnRequest) PostCode(postCode int32) GlobalKYCApiGetUsSsnRequest {
	r.postCode = &postCode
	return r
}

func (r GlobalKYCApiGetUsSsnRequest) Execute() (map[string]interface{}, *http.Response, error) {
	return r.ApiService.GetUsSsnExecute(r)
}

/*
GetUsSsn US SSN

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return GlobalKYCApiGetUsSsnRequest
*/
func (a *GlobalKYCApiService) GetUsSsn() GlobalKYCApiGetUsSsnRequest {
	return GlobalKYCApiGetUsSsnRequest{
		ApiService: a,
		ctx: a.client.cfg.Context,
	}
}

// Execute executes the request
//  @return map[string]interface{}
func (a *GlobalKYCApiService) GetUsSsnExecute(r GlobalKYCApiGetUsSsnRequest) (map[string]interface{}, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  map[string]interface{}
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalKYCApiService.GetUsSsn")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/us/kyc"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.country != nil {
		localVarQueryParams.Add("country", parameterToString(*r.country, ""))
	}
	if r.firstName != nil {
		localVarQueryParams.Add("first_name", parameterToString(*r.firstName, ""))
	}
	if r.lastName != nil {
		localVarQueryParams.Add("last_name", parameterToString(*r.lastName, ""))
	}
	if r.streetName != nil {
		localVarQueryParams.Add("street_name", parameterToString(*r.streetName, ""))
	}
	if r.dateOfBirth != nil {
		localVarQueryParams.Add("date_of_birth", parameterToString(*r.dateOfBirth, ""))
	}
	if r.houseNumber != nil {
		localVarQueryParams.Add("house_number", parameterToString(*r.houseNumber, ""))
	}
	if r.postCode != nil {
		localVarQueryParams.Add("post_code", parameterToString(*r.postCode, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apikeyAuth"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["appIdAuth"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["AppId"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type GlobalKYCApiUkTwoPlusTwoRequest struct {
	ctx context.Context
	ApiService *GlobalKYCApiService
	country *string
	firstName *string
	lastName *string
	streetName *string
	dateOfBirth *string
	houseNumber *int32
	postCode *int32
}

func (r GlobalKYCApiUkTwoPlusTwoRequest) Country(country string) GlobalKYCApiUkTwoPlusTwoRequest {
	r.country = &country
	return r
}

func (r GlobalKYCApiUkTwoPlusTwoRequest) FirstName(firstName string) GlobalKYCApiUkTwoPlusTwoRequest {
	r.firstName = &firstName
	return r
}

func (r GlobalKYCApiUkTwoPlusTwoRequest) LastName(lastName string) GlobalKYCApiUkTwoPlusTwoRequest {
	r.lastName = &lastName
	return r
}

func (r GlobalKYCApiUkTwoPlusTwoRequest) StreetName(streetName string) GlobalKYCApiUkTwoPlusTwoRequest {
	r.streetName = &streetName
	return r
}

func (r GlobalKYCApiUkTwoPlusTwoRequest) DateOfBirth(dateOfBirth string) GlobalKYCApiUkTwoPlusTwoRequest {
	r.dateOfBirth = &dateOfBirth
	return r
}

func (r GlobalKYCApiUkTwoPlusTwoRequest) HouseNumber(houseNumber int32) GlobalKYCApiUkTwoPlusTwoRequest {
	r.houseNumber = &houseNumber
	return r
}

func (r GlobalKYCApiUkTwoPlusTwoRequest) PostCode(postCode int32) GlobalKYCApiUkTwoPlusTwoRequest {
	r.postCode = &postCode
	return r
}

func (r GlobalKYCApiUkTwoPlusTwoRequest) Execute() (map[string]interface{}, *http.Response, error) {
	return r.ApiService.UkTwoPlusTwoExecute(r)
}

/*
UkTwoPlusTwo UK 2+2

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return GlobalKYCApiUkTwoPlusTwoRequest
*/
func (a *GlobalKYCApiService) UkTwoPlusTwo() GlobalKYCApiUkTwoPlusTwoRequest {
	return GlobalKYCApiUkTwoPlusTwoRequest{
		ApiService: a,
		ctx: a.client.cfg.Context,
	}
}

// Execute executes the request
//  @return map[string]interface{}
func (a *GlobalKYCApiService) UkTwoPlusTwoExecute(r GlobalKYCApiUkTwoPlusTwoRequest) (map[string]interface{}, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  map[string]interface{}
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "GlobalKYCApiService.UkTwoPlusTwo")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/uk/kyc"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.country != nil {
		localVarQueryParams.Add("country", parameterToString(*r.country, ""))
	}
	if r.firstName != nil {
		localVarQueryParams.Add("first_name", parameterToString(*r.firstName, ""))
	}
	if r.lastName != nil {
		localVarQueryParams.Add("last_name", parameterToString(*r.lastName, ""))
	}
	if r.streetName != nil {
		localVarQueryParams.Add("street_name", parameterToString(*r.streetName, ""))
	}
	if r.dateOfBirth != nil {
		localVarQueryParams.Add("date_of_birth", parameterToString(*r.dateOfBirth, ""))
	}
	if r.houseNumber != nil {
		localVarQueryParams.Add("house_number", parameterToString(*r.houseNumber, ""))
	}
	if r.postCode != nil {
		localVarQueryParams.Add("post_code", parameterToString(*r.postCode, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["apikeyAuth"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["appIdAuth"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["AppId"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}