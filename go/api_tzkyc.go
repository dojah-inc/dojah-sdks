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


// TZKYCApiService TZKYCApi service
type TZKYCApiService service

type TZKYCApiGetNinRequest struct {
	ctx context.Context
	ApiService *TZKYCApiService
	firstName *string
	lastName *string
	dateOfBirth *string
	mothersLastName *string
	mothersFirstName *string
}

func (r TZKYCApiGetNinRequest) FirstName(firstName string) TZKYCApiGetNinRequest {
	r.firstName = &firstName
	return r
}

func (r TZKYCApiGetNinRequest) LastName(lastName string) TZKYCApiGetNinRequest {
	r.lastName = &lastName
	return r
}

func (r TZKYCApiGetNinRequest) DateOfBirth(dateOfBirth string) TZKYCApiGetNinRequest {
	r.dateOfBirth = &dateOfBirth
	return r
}

func (r TZKYCApiGetNinRequest) MothersLastName(mothersLastName string) TZKYCApiGetNinRequest {
	r.mothersLastName = &mothersLastName
	return r
}

func (r TZKYCApiGetNinRequest) MothersFirstName(mothersFirstName string) TZKYCApiGetNinRequest {
	r.mothersFirstName = &mothersFirstName
	return r
}

func (r TZKYCApiGetNinRequest) Execute() (map[string]interface{}, *http.Response, error) {
	return r.ApiService.GetNinExecute(r)
}

/*
GetNin Lookup TZ NIN

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return TZKYCApiGetNinRequest
*/
func (a *TZKYCApiService) GetNin() TZKYCApiGetNinRequest {
	return TZKYCApiGetNinRequest{
		ApiService: a,
		ctx: a.client.cfg.Context,
	}
}

// Execute executes the request
//  @return map[string]interface{}
func (a *TZKYCApiService) GetNinExecute(r TZKYCApiGetNinRequest) (map[string]interface{}, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  map[string]interface{}
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "TZKYCApiService.GetNin")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/tz/kyc/nin"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.firstName != nil {
		localVarQueryParams.Add("first_name", parameterToString(*r.firstName, ""))
	}
	if r.lastName != nil {
		localVarQueryParams.Add("last_name", parameterToString(*r.lastName, ""))
	}
	if r.dateOfBirth != nil {
		localVarQueryParams.Add("date_of_birth", parameterToString(*r.dateOfBirth, ""))
	}
	if r.mothersLastName != nil {
		localVarQueryParams.Add("mothers_last_name", parameterToString(*r.mothersLastName, ""))
	}
	if r.mothersFirstName != nil {
		localVarQueryParams.Add("mothers_first_name", parameterToString(*r.mothersFirstName, ""))
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
