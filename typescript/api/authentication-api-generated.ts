/* tslint:disable */
/* eslint-disable */
/**
 * DOJAH Publilc APIs
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */

import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction, isBrowser } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { AuthenticationSendOtpRequest } from '../models';
// @ts-ignore
import { AuthenticationSendOtpResponse } from '../models';
// @ts-ignore
import { AuthenticationValidateOtpResponse } from '../models';
// @ts-ignore
import { GetSenderIdResponse } from '../models';
// @ts-ignore
import { GetSmsStatusResponse } from '../models';
// @ts-ignore
import { RequestSenderIdRequest } from '../models';
// @ts-ignore
import { RequestSenderIdResponse } from '../models';
// @ts-ignore
import { SendSmsRequest } from '../models';
// @ts-ignore
import { SendSmsResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * AuthenticationApi - axios parameter creator
 * @export
 */
export const AuthenticationApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Messaging - Get Sender IDs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSenderId: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/messaging/sender_ids`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication apikeyAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "Authorization", configuration })
            // authentication appIdAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "AppId", configuration })

    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Messaging - Get SMS Status
         * @param {string} [messageId] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSmsStatus: async (messageId?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/v1/messaging/sms/get_status`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication apikeyAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "Authorization", configuration })
            // authentication appIdAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "AppId", configuration })
            if (messageId !== undefined) {
                localVarQueryParameter['message_id'] = messageId;
            }


    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Messaging - Request Sender ID
         * @param {RequestSenderIdRequest} requestSenderIdRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        requestSenderId: async (requestSenderIdRequest: RequestSenderIdRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'requestSenderIdRequest' is not null or undefined
            assertParamExists('requestSenderId', 'requestSenderIdRequest', requestSenderIdRequest)
            const localVarPath = `/api/v1/messaging/sender_id`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication apikeyAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "Authorization", configuration })
            // authentication appIdAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "AppId", configuration })

    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: requestSenderIdRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(requestSenderIdRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Messaging - Send OTP
         * @param {AuthenticationSendOtpRequest} authenticationSendOtpRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        sendOtp: async (authenticationSendOtpRequest: AuthenticationSendOtpRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'authenticationSendOtpRequest' is not null or undefined
            assertParamExists('sendOtp', 'authenticationSendOtpRequest', authenticationSendOtpRequest)
            const localVarPath = `/api/v1/messaging/otp`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication apikeyAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "Authorization", configuration })
            // authentication appIdAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "AppId", configuration })

    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: authenticationSendOtpRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(authenticationSendOtpRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Messaging - Send SMS
         * @param {SendSmsRequest} sendSmsRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        sendSms: async (sendSmsRequest: SendSmsRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'sendSmsRequest' is not null or undefined
            assertParamExists('sendSms', 'sendSmsRequest', sendSmsRequest)
            const localVarPath = `/api/v1/messaging/sms`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication apikeyAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "Authorization", configuration })
            // authentication appIdAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "AppId", configuration })

    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: sendSmsRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(sendSmsRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Messaging - Validate OTP
         * @param {string} [referenceId] 
         * @param {number} [code] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        validateOtp: async (referenceId?: string, code?: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/messaging/otp/validate`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication apikeyAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "Authorization", configuration })
            // authentication appIdAuth required
            await setApiKeyToObject({ object: localVarHeaderParameter, keyParamName: "AppId", configuration })
            if (referenceId !== undefined) {
                localVarQueryParameter['reference_id'] = referenceId;
            }

            if (code !== undefined) {
                localVarQueryParameter['code'] = code;
            }


    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * AuthenticationApi - functional programming interface
 * @export
 */
export const AuthenticationApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = AuthenticationApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Messaging - Get Sender IDs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getSenderId(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetSenderIdResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getSenderId(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Messaging - Get SMS Status
         * @param {AuthenticationApiGetSmsStatusRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getSmsStatus(requestParameters: AuthenticationApiGetSmsStatusRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetSmsStatusResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getSmsStatus(requestParameters.messageId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Messaging - Request Sender ID
         * @param {AuthenticationApiRequestSenderIdRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async requestSenderId(requestParameters: AuthenticationApiRequestSenderIdRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<RequestSenderIdResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.requestSenderId(requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Messaging - Send OTP
         * @param {AuthenticationApiSendOtpRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async sendOtp(requestParameters: AuthenticationApiSendOtpRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<AuthenticationSendOtpResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.sendOtp(requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Messaging - Send SMS
         * @param {AuthenticationApiSendSmsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async sendSms(requestParameters: AuthenticationApiSendSmsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<SendSmsResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.sendSms(requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Messaging - Validate OTP
         * @param {AuthenticationApiValidateOtpRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async validateOtp(requestParameters: AuthenticationApiValidateOtpRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<AuthenticationValidateOtpResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.validateOtp(requestParameters.referenceId, requestParameters.code, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * AuthenticationApi - factory interface
 * @export
 */
export const AuthenticationApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = AuthenticationApiFp(configuration)
    return {
        /**
         * 
         * @summary Messaging - Get Sender IDs
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSenderId(options?: AxiosRequestConfig): AxiosPromise<GetSenderIdResponse> {
            return localVarFp.getSenderId(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Messaging - Get SMS Status
         * @param {AuthenticationApiGetSmsStatusRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSmsStatus(requestParameters: AuthenticationApiGetSmsStatusRequest = {}, options?: AxiosRequestConfig): AxiosPromise<GetSmsStatusResponse> {
            return localVarFp.getSmsStatus(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Messaging - Request Sender ID
         * @param {AuthenticationApiRequestSenderIdRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        requestSenderId(requestParameters: AuthenticationApiRequestSenderIdRequest, options?: AxiosRequestConfig): AxiosPromise<RequestSenderIdResponse> {
            return localVarFp.requestSenderId(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Messaging - Send OTP
         * @param {AuthenticationApiSendOtpRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        sendOtp(requestParameters: AuthenticationApiSendOtpRequest, options?: AxiosRequestConfig): AxiosPromise<AuthenticationSendOtpResponse> {
            return localVarFp.sendOtp(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Messaging - Send SMS
         * @param {AuthenticationApiSendSmsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        sendSms(requestParameters: AuthenticationApiSendSmsRequest, options?: AxiosRequestConfig): AxiosPromise<SendSmsResponse> {
            return localVarFp.sendSms(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Messaging - Validate OTP
         * @param {AuthenticationApiValidateOtpRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        validateOtp(requestParameters: AuthenticationApiValidateOtpRequest = {}, options?: AxiosRequestConfig): AxiosPromise<AuthenticationValidateOtpResponse> {
            return localVarFp.validateOtp(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getSmsStatus operation in AuthenticationApi.
 * @export
 * @interface AuthenticationApiGetSmsStatusRequest
 */
export type AuthenticationApiGetSmsStatusRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof AuthenticationApiGetSmsStatus
    */
    readonly messageId?: string
    
}

/**
 * Request parameters for requestSenderId operation in AuthenticationApi.
 * @export
 * @interface AuthenticationApiRequestSenderIdRequest
 */
export type AuthenticationApiRequestSenderIdRequest = {
    
} & RequestSenderIdRequest

/**
 * Request parameters for sendOtp operation in AuthenticationApi.
 * @export
 * @interface AuthenticationApiSendOtpRequest
 */
export type AuthenticationApiSendOtpRequest = {
    
} & AuthenticationSendOtpRequest

/**
 * Request parameters for sendSms operation in AuthenticationApi.
 * @export
 * @interface AuthenticationApiSendSmsRequest
 */
export type AuthenticationApiSendSmsRequest = {
    
} & SendSmsRequest

/**
 * Request parameters for validateOtp operation in AuthenticationApi.
 * @export
 * @interface AuthenticationApiValidateOtpRequest
 */
export type AuthenticationApiValidateOtpRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof AuthenticationApiValidateOtp
    */
    readonly referenceId?: string
    
    /**
    * 
    * @type {number}
    * @memberof AuthenticationApiValidateOtp
    */
    readonly code?: number
    
}

/**
 * AuthenticationApiGenerated - object-oriented interface
 * @export
 * @class AuthenticationApiGenerated
 * @extends {BaseAPI}
 */
export class AuthenticationApiGenerated extends BaseAPI {
    /**
     * 
     * @summary Messaging - Get Sender IDs
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthenticationApiGenerated
     */
    public getSenderId(options?: AxiosRequestConfig) {
        return AuthenticationApiFp(this.configuration).getSenderId(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Messaging - Get SMS Status
     * @param {AuthenticationApiGetSmsStatusRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthenticationApiGenerated
     */
    public getSmsStatus(requestParameters: AuthenticationApiGetSmsStatusRequest = {}, options?: AxiosRequestConfig) {
        return AuthenticationApiFp(this.configuration).getSmsStatus(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Messaging - Request Sender ID
     * @param {AuthenticationApiRequestSenderIdRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthenticationApiGenerated
     */
    public requestSenderId(requestParameters: AuthenticationApiRequestSenderIdRequest, options?: AxiosRequestConfig) {
        return AuthenticationApiFp(this.configuration).requestSenderId(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Messaging - Send OTP
     * @param {AuthenticationApiSendOtpRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthenticationApiGenerated
     */
    public sendOtp(requestParameters: AuthenticationApiSendOtpRequest, options?: AxiosRequestConfig) {
        return AuthenticationApiFp(this.configuration).sendOtp(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Messaging - Send SMS
     * @param {AuthenticationApiSendSmsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthenticationApiGenerated
     */
    public sendSms(requestParameters: AuthenticationApiSendSmsRequest, options?: AxiosRequestConfig) {
        return AuthenticationApiFp(this.configuration).sendSms(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Messaging - Validate OTP
     * @param {AuthenticationApiValidateOtpRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthenticationApiGenerated
     */
    public validateOtp(requestParameters: AuthenticationApiValidateOtpRequest = {}, options?: AxiosRequestConfig) {
        return AuthenticationApiFp(this.configuration).validateOtp(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
