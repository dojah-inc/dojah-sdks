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
import { FraudGetEmailReputationResponse } from '../models';
// @ts-ignore
import { FraudGetIpReputationResponse } from '../models';
// @ts-ignore
import { FraudScreenPhoneResponse } from '../models';
// @ts-ignore
import { FraudScreenUserResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * FraudApi - axios parameter creator
 * @export
 */
export const FraudApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Email Reputation
         * @param {string} [email] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getEmailReputation: async (email?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/kyc/email`;
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
            if (email !== undefined) {
                localVarQueryParameter['email'] = email;
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
         * @summary IP Reputation
         * @param {string} [ipAddress] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getIpReputation: async (ipAddress?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/fraud/ip`;
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
            if (ipAddress !== undefined) {
                localVarQueryParameter['ip_address'] = ipAddress;
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
         * @summary Phone Screening
         * @param {number} [phoneNumber] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        screenPhone: async (phoneNumber?: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/fraud/phone`;
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
            if (phoneNumber !== undefined) {
                localVarQueryParameter['phone_number'] = phoneNumber;
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
         * @summary User Screening
         * @param {string} [firstName] 
         * @param {string} [lastName] 
         * @param {string} [dateOfBirth] 
         * @param {string} [email] 
         * @param {string} [phone] 
         * @param {string} [ipAddress] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        screenUser: async (firstName?: string, lastName?: string, dateOfBirth?: string, email?: string, phone?: string, ipAddress?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/fraud/user`;
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
            if (firstName !== undefined) {
                localVarQueryParameter['first_name'] = firstName;
            }

            if (lastName !== undefined) {
                localVarQueryParameter['last_name'] = lastName;
            }

            if (dateOfBirth !== undefined) {
                localVarQueryParameter['date_of_birth'] = dateOfBirth;
            }

            if (email !== undefined) {
                localVarQueryParameter['email'] = email;
            }

            if (phone !== undefined) {
                localVarQueryParameter['phone'] = phone;
            }

            if (ipAddress !== undefined) {
                localVarQueryParameter['ip_address'] = ipAddress;
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
 * FraudApi - functional programming interface
 * @export
 */
export const FraudApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = FraudApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Email Reputation
         * @param {FraudApiGetEmailReputationRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getEmailReputation(requestParameters: FraudApiGetEmailReputationRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<FraudGetEmailReputationResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getEmailReputation(requestParameters.email, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary IP Reputation
         * @param {FraudApiGetIpReputationRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getIpReputation(requestParameters: FraudApiGetIpReputationRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<FraudGetIpReputationResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getIpReputation(requestParameters.ipAddress, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Phone Screening
         * @param {FraudApiScreenPhoneRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async screenPhone(requestParameters: FraudApiScreenPhoneRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<FraudScreenPhoneResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.screenPhone(requestParameters.phoneNumber, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary User Screening
         * @param {FraudApiScreenUserRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async screenUser(requestParameters: FraudApiScreenUserRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<FraudScreenUserResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.screenUser(requestParameters.firstName, requestParameters.lastName, requestParameters.dateOfBirth, requestParameters.email, requestParameters.phone, requestParameters.ipAddress, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * FraudApi - factory interface
 * @export
 */
export const FraudApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = FraudApiFp(configuration)
    return {
        /**
         * 
         * @summary Email Reputation
         * @param {FraudApiGetEmailReputationRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getEmailReputation(requestParameters: FraudApiGetEmailReputationRequest = {}, options?: AxiosRequestConfig): AxiosPromise<FraudGetEmailReputationResponse> {
            return localVarFp.getEmailReputation(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary IP Reputation
         * @param {FraudApiGetIpReputationRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getIpReputation(requestParameters: FraudApiGetIpReputationRequest = {}, options?: AxiosRequestConfig): AxiosPromise<FraudGetIpReputationResponse> {
            return localVarFp.getIpReputation(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Phone Screening
         * @param {FraudApiScreenPhoneRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        screenPhone(requestParameters: FraudApiScreenPhoneRequest = {}, options?: AxiosRequestConfig): AxiosPromise<FraudScreenPhoneResponse> {
            return localVarFp.screenPhone(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary User Screening
         * @param {FraudApiScreenUserRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        screenUser(requestParameters: FraudApiScreenUserRequest = {}, options?: AxiosRequestConfig): AxiosPromise<FraudScreenUserResponse> {
            return localVarFp.screenUser(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getEmailReputation operation in FraudApi.
 * @export
 * @interface FraudApiGetEmailReputationRequest
 */
export type FraudApiGetEmailReputationRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof FraudApiGetEmailReputation
    */
    readonly email?: string
    
}

/**
 * Request parameters for getIpReputation operation in FraudApi.
 * @export
 * @interface FraudApiGetIpReputationRequest
 */
export type FraudApiGetIpReputationRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof FraudApiGetIpReputation
    */
    readonly ipAddress?: string
    
}

/**
 * Request parameters for screenPhone operation in FraudApi.
 * @export
 * @interface FraudApiScreenPhoneRequest
 */
export type FraudApiScreenPhoneRequest = {
    
    /**
    * 
    * @type {number}
    * @memberof FraudApiScreenPhone
    */
    readonly phoneNumber?: number
    
}

/**
 * Request parameters for screenUser operation in FraudApi.
 * @export
 * @interface FraudApiScreenUserRequest
 */
export type FraudApiScreenUserRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof FraudApiScreenUser
    */
    readonly firstName?: string
    
    /**
    * 
    * @type {string}
    * @memberof FraudApiScreenUser
    */
    readonly lastName?: string
    
    /**
    * 
    * @type {string}
    * @memberof FraudApiScreenUser
    */
    readonly dateOfBirth?: string
    
    /**
    * 
    * @type {string}
    * @memberof FraudApiScreenUser
    */
    readonly email?: string
    
    /**
    * 
    * @type {string}
    * @memberof FraudApiScreenUser
    */
    readonly phone?: string
    
    /**
    * 
    * @type {string}
    * @memberof FraudApiScreenUser
    */
    readonly ipAddress?: string
    
}

/**
 * FraudApiGenerated - object-oriented interface
 * @export
 * @class FraudApiGenerated
 * @extends {BaseAPI}
 */
export class FraudApiGenerated extends BaseAPI {
    /**
     * 
     * @summary Email Reputation
     * @param {FraudApiGetEmailReputationRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FraudApiGenerated
     */
    public getEmailReputation(requestParameters: FraudApiGetEmailReputationRequest = {}, options?: AxiosRequestConfig) {
        return FraudApiFp(this.configuration).getEmailReputation(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary IP Reputation
     * @param {FraudApiGetIpReputationRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FraudApiGenerated
     */
    public getIpReputation(requestParameters: FraudApiGetIpReputationRequest = {}, options?: AxiosRequestConfig) {
        return FraudApiFp(this.configuration).getIpReputation(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Phone Screening
     * @param {FraudApiScreenPhoneRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FraudApiGenerated
     */
    public screenPhone(requestParameters: FraudApiScreenPhoneRequest = {}, options?: AxiosRequestConfig) {
        return FraudApiFp(this.configuration).screenPhone(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary User Screening
     * @param {FraudApiScreenUserRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FraudApiGenerated
     */
    public screenUser(requestParameters: FraudApiScreenUserRequest = {}, options?: AxiosRequestConfig) {
        return FraudApiFp(this.configuration).screenUser(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}