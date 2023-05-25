/* tslint:disable */
/* eslint-disable */
/**
 * DOJAH APIs
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * https://konfigthis.com
 * Do not edit the class manually.
 */

import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { GetVoterResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { UgKycApiCustom } from "./ug-kyc-api-custom";
/**
 * UgKycApi - axios parameter creator
 * @export
 */
export const UgKycApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Voters ID
         * @param {number} [id] 
         * @param {string} [firstName] 
         * @param {string} [lastName] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVoter: async (id?: number, firstName?: string, lastName?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/ug/kyc/voter`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration ? { "User-Agent": configuration.userAgent } : {} as any;
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
 * UgKycApi - functional programming interface
 * @export
 */
export const UgKycApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = UgKycApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Voters ID
         * @param {UgKycApiGetVoterRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getVoter(requestParameters: UgKycApiGetVoterRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetVoterResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getVoter(requestParameters.id, requestParameters.firstName, requestParameters.lastName, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * UgKycApi - factory interface
 * @export
 */
export const UgKycApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = UgKycApiFp(configuration)
    return {
        /**
         * 
         * @summary Voters ID
         * @param {UgKycApiGetVoterRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVoter(requestParameters: UgKycApiGetVoterRequest = {}, options?: AxiosRequestConfig): AxiosPromise<GetVoterResponse> {
            return localVarFp.getVoter(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getVoter operation in UgKycApi.
 * @export
 * @interface UgKycApiGetVoterRequest
 */
export type UgKycApiGetVoterRequest = {
    
    /**
    * 
    * @type {number}
    * @memberof UgKycApiGetVoter
    */
    readonly id?: number
    
    /**
    * 
    * @type {string}
    * @memberof UgKycApiGetVoter
    */
    readonly firstName?: string
    
    /**
    * 
    * @type {string}
    * @memberof UgKycApiGetVoter
    */
    readonly lastName?: string
    
}

/**
 * UgKycApi - object-oriented interface
 * @export
 * @class UgKycApi
 * @extends {BaseAPI}
 */
export class UgKycApi extends UgKycApiCustom {
    /**
     * 
     * @summary Voters ID
     * @param {UgKycApiGetVoterRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UgKycApi
     */
    public getVoter(requestParameters: UgKycApiGetVoterRequest = {}, options?: AxiosRequestConfig) {
        return UgKycApiFp(this.configuration).getVoter(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
