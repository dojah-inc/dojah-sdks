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
import { GetDriversLicenseResponse } from '../models';
// @ts-ignore
import { GetPassportResponse } from '../models';
// @ts-ignore
import { GetSsnitResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * GhKycApi - axios parameter creator
 * @export
 */
export const GhKycApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Driver\'s License
         * @param {string} [id] 
         * @param {string} [fullName] 
         * @param {string} [dateOfBirth] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriversLicense: async (id?: string, fullName?: string, dateOfBirth?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/gh/kyc/dl`;
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
            if (id !== undefined) {
                localVarQueryParameter['id'] = id;
            }

            if (fullName !== undefined) {
                localVarQueryParameter['full_name'] = fullName;
            }

            if (dateOfBirth !== undefined) {
                localVarQueryParameter['date_of_birth'] = dateOfBirth;
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
         * @summary Passport
         * @param {string} [id] 
         * @param {string} [firstName] 
         * @param {string} [lastName] 
         * @param {string} [middleName] 
         * @param {string} [dateOfBirth] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPassport: async (id?: string, firstName?: string, lastName?: string, middleName?: string, dateOfBirth?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/gh/kyc/passport`;
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
            if (id !== undefined) {
                localVarQueryParameter['id'] = id;
            }

            if (firstName !== undefined) {
                localVarQueryParameter['first_name'] = firstName;
            }

            if (lastName !== undefined) {
                localVarQueryParameter['last_name'] = lastName;
            }

            if (middleName !== undefined) {
                localVarQueryParameter['middle_name'] = middleName;
            }

            if (dateOfBirth !== undefined) {
                localVarQueryParameter['date_of_birth'] = dateOfBirth;
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
         * @summary SSNIT
         * @param {string} [id] 
         * @param {string} [fullName] 
         * @param {string} [dateOfBirth] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSsnit: async (id?: string, fullName?: string, dateOfBirth?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/gh/kyc/ssnit`;
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
            if (id !== undefined) {
                localVarQueryParameter['id'] = id;
            }

            if (fullName !== undefined) {
                localVarQueryParameter['full_name'] = fullName;
            }

            if (dateOfBirth !== undefined) {
                localVarQueryParameter['date_of_birth'] = dateOfBirth;
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
         * @summary Voter ID Lookup
         * @param {number} [id] 
         * @param {string} [fullName] 
         * @param {boolean} [isNewId] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVoter: async (id?: number, fullName?: string, isNewId?: boolean, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/gh/kyc/voter`;
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
            if (id !== undefined) {
                localVarQueryParameter['id'] = id;
            }

            if (fullName !== undefined) {
                localVarQueryParameter['full_name'] = fullName;
            }

            if (isNewId !== undefined) {
                localVarQueryParameter['is_new_id'] = isNewId;
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
 * GhKycApi - functional programming interface
 * @export
 */
export const GhKycApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = GhKycApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Driver\'s License
         * @param {GhKycApiGetDriversLicenseRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDriversLicense(requestParameters: GhKycApiGetDriversLicenseRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetDriversLicenseResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDriversLicense(requestParameters.id, requestParameters.fullName, requestParameters.dateOfBirth, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Passport
         * @param {GhKycApiGetPassportRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getPassport(requestParameters: GhKycApiGetPassportRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetPassportResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getPassport(requestParameters.id, requestParameters.firstName, requestParameters.lastName, requestParameters.middleName, requestParameters.dateOfBirth, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary SSNIT
         * @param {GhKycApiGetSsnitRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getSsnit(requestParameters: GhKycApiGetSsnitRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetSsnitResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getSsnit(requestParameters.id, requestParameters.fullName, requestParameters.dateOfBirth, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Voter ID Lookup
         * @param {GhKycApiGetVoterRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getVoter(requestParameters: GhKycApiGetVoterRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<object>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getVoter(requestParameters.id, requestParameters.fullName, requestParameters.isNewId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * GhKycApi - factory interface
 * @export
 */
export const GhKycApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = GhKycApiFp(configuration)
    return {
        /**
         * 
         * @summary Driver\'s License
         * @param {GhKycApiGetDriversLicenseRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDriversLicense(requestParameters: GhKycApiGetDriversLicenseRequest = {}, options?: AxiosRequestConfig): AxiosPromise<GetDriversLicenseResponse> {
            return localVarFp.getDriversLicense(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Passport
         * @param {GhKycApiGetPassportRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPassport(requestParameters: GhKycApiGetPassportRequest = {}, options?: AxiosRequestConfig): AxiosPromise<GetPassportResponse> {
            return localVarFp.getPassport(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary SSNIT
         * @param {GhKycApiGetSsnitRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getSsnit(requestParameters: GhKycApiGetSsnitRequest = {}, options?: AxiosRequestConfig): AxiosPromise<GetSsnitResponse> {
            return localVarFp.getSsnit(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Voter ID Lookup
         * @param {GhKycApiGetVoterRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVoter(requestParameters: GhKycApiGetVoterRequest = {}, options?: AxiosRequestConfig): AxiosPromise<object> {
            return localVarFp.getVoter(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getDriversLicense operation in GhKycApi.
 * @export
 * @interface GhKycApiGetDriversLicenseRequest
 */
export type GhKycApiGetDriversLicenseRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetDriversLicense
    */
    readonly id?: string
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetDriversLicense
    */
    readonly fullName?: string
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetDriversLicense
    */
    readonly dateOfBirth?: string
    
}

/**
 * Request parameters for getPassport operation in GhKycApi.
 * @export
 * @interface GhKycApiGetPassportRequest
 */
export type GhKycApiGetPassportRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetPassport
    */
    readonly id?: string
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetPassport
    */
    readonly firstName?: string
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetPassport
    */
    readonly lastName?: string
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetPassport
    */
    readonly middleName?: string
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetPassport
    */
    readonly dateOfBirth?: string
    
}

/**
 * Request parameters for getSsnit operation in GhKycApi.
 * @export
 * @interface GhKycApiGetSsnitRequest
 */
export type GhKycApiGetSsnitRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetSsnit
    */
    readonly id?: string
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetSsnit
    */
    readonly fullName?: string
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetSsnit
    */
    readonly dateOfBirth?: string
    
}

/**
 * Request parameters for getVoter operation in GhKycApi.
 * @export
 * @interface GhKycApiGetVoterRequest
 */
export type GhKycApiGetVoterRequest = {
    
    /**
    * 
    * @type {number}
    * @memberof GhKycApiGetVoter
    */
    readonly id?: number
    
    /**
    * 
    * @type {string}
    * @memberof GhKycApiGetVoter
    */
    readonly fullName?: string
    
    /**
    * 
    * @type {boolean}
    * @memberof GhKycApiGetVoter
    */
    readonly isNewId?: boolean
    
}

/**
 * GhKycApiGenerated - object-oriented interface
 * @export
 * @class GhKycApiGenerated
 * @extends {BaseAPI}
 */
export class GhKycApiGenerated extends BaseAPI {
    /**
     * 
     * @summary Driver\'s License
     * @param {GhKycApiGetDriversLicenseRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof GhKycApiGenerated
     */
    public getDriversLicense(requestParameters: GhKycApiGetDriversLicenseRequest = {}, options?: AxiosRequestConfig) {
        return GhKycApiFp(this.configuration).getDriversLicense(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Passport
     * @param {GhKycApiGetPassportRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof GhKycApiGenerated
     */
    public getPassport(requestParameters: GhKycApiGetPassportRequest = {}, options?: AxiosRequestConfig) {
        return GhKycApiFp(this.configuration).getPassport(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary SSNIT
     * @param {GhKycApiGetSsnitRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof GhKycApiGenerated
     */
    public getSsnit(requestParameters: GhKycApiGetSsnitRequest = {}, options?: AxiosRequestConfig) {
        return GhKycApiFp(this.configuration).getSsnit(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Voter ID Lookup
     * @param {GhKycApiGetVoterRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof GhKycApiGenerated
     */
    public getVoter(requestParameters: GhKycApiGetVoterRequest = {}, options?: AxiosRequestConfig) {
        return GhKycApiFp(this.configuration).getVoter(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
