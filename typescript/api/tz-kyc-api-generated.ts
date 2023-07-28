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
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * TzKycApi - axios parameter creator
 * @export
 */
export const TzKycApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Lookup TZ NIN
         * @param {string} [firstName] 
         * @param {string} [lastName] 
         * @param {string} [dateOfBirth] 
         * @param {string} [mothersLastName] 
         * @param {string} [mothersFirstName] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getNin: async (firstName?: string, lastName?: string, dateOfBirth?: string, mothersLastName?: string, mothersFirstName?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/tz/kyc/nin`;
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

            if (mothersLastName !== undefined) {
                localVarQueryParameter['mothers_last_name'] = mothersLastName;
            }

            if (mothersFirstName !== undefined) {
                localVarQueryParameter['mothers_first_name'] = mothersFirstName;
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
 * TzKycApi - functional programming interface
 * @export
 */
export const TzKycApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = TzKycApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Lookup TZ NIN
         * @param {TzKycApiGetNinRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getNin(requestParameters: TzKycApiGetNinRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<object>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getNin(requestParameters.firstName, requestParameters.lastName, requestParameters.dateOfBirth, requestParameters.mothersLastName, requestParameters.mothersFirstName, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * TzKycApi - factory interface
 * @export
 */
export const TzKycApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = TzKycApiFp(configuration)
    return {
        /**
         * 
         * @summary Lookup TZ NIN
         * @param {TzKycApiGetNinRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getNin(requestParameters: TzKycApiGetNinRequest = {}, options?: AxiosRequestConfig): AxiosPromise<object> {
            return localVarFp.getNin(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getNin operation in TzKycApi.
 * @export
 * @interface TzKycApiGetNinRequest
 */
export type TzKycApiGetNinRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof TzKycApiGetNin
    */
    readonly firstName?: string
    
    /**
    * 
    * @type {string}
    * @memberof TzKycApiGetNin
    */
    readonly lastName?: string
    
    /**
    * 
    * @type {string}
    * @memberof TzKycApiGetNin
    */
    readonly dateOfBirth?: string
    
    /**
    * 
    * @type {string}
    * @memberof TzKycApiGetNin
    */
    readonly mothersLastName?: string
    
    /**
    * 
    * @type {string}
    * @memberof TzKycApiGetNin
    */
    readonly mothersFirstName?: string
    
}

/**
 * TzKycApiGenerated - object-oriented interface
 * @export
 * @class TzKycApiGenerated
 * @extends {BaseAPI}
 */
export class TzKycApiGenerated extends BaseAPI {
    /**
     * 
     * @summary Lookup TZ NIN
     * @param {TzKycApiGetNinRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TzKycApiGenerated
     */
    public getNin(requestParameters: TzKycApiGetNinRequest = {}, options?: AxiosRequestConfig) {
        return TzKycApiFp(this.configuration).getNin(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
