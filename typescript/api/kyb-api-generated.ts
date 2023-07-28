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
import { KybGetCacResponse } from '../models';
// @ts-ignore
import { KybGetTinResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * KybApi - axios parameter creator
 * @export
 */
export const KybApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Business Detail
         * @param {string} [internationalNumber] 
         * @param {string} [countryCode] 
         * @param {boolean} [full] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        businessDetail: async (internationalNumber?: string, countryCode?: string, full?: boolean, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/kyb/business/detail`;
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
            if (internationalNumber !== undefined) {
                localVarQueryParameter['international_number'] = internationalNumber;
            }

            if (countryCode !== undefined) {
                localVarQueryParameter['country_code'] = countryCode;
            }

            if (full !== undefined) {
                localVarQueryParameter['full'] = full;
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
         * @summary Business Search
         * @param {string} [countryCode] 
         * @param {number} [company] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        businessSearch: async (countryCode?: string, company?: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/kyb/business/search`;
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
            if (countryCode !== undefined) {
                localVarQueryParameter['country_code'] = countryCode;
            }

            if (company !== undefined) {
                localVarQueryParameter['company'] = company;
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
         * @summary KYC - Get CAC 
         * @param {number} [rcNumber] 
         * @param {string} [companyName] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCac: async (rcNumber?: number, companyName?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/kyc/cac`;
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
            if (rcNumber !== undefined) {
                localVarQueryParameter['rc_number'] = rcNumber;
            }

            if (companyName !== undefined) {
                localVarQueryParameter['company_name'] = companyName;
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
         * @summary KYC - Fetch Tin
         * @param {string} [tin] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTin: async (tin?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/kyc/tin`;
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
            if (tin !== undefined) {
                localVarQueryParameter['tin'] = tin;
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
 * KybApi - functional programming interface
 * @export
 */
export const KybApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = KybApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Business Detail
         * @param {KybApiBusinessDetailRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async businessDetail(requestParameters: KybApiBusinessDetailRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<object>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.businessDetail(requestParameters.internationalNumber, requestParameters.countryCode, requestParameters.full, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Business Search
         * @param {KybApiBusinessSearchRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async businessSearch(requestParameters: KybApiBusinessSearchRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<object>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.businessSearch(requestParameters.countryCode, requestParameters.company, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary KYC - Get CAC 
         * @param {KybApiGetCacRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCac(requestParameters: KybApiGetCacRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<KybGetCacResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getCac(requestParameters.rcNumber, requestParameters.companyName, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary KYC - Fetch Tin
         * @param {KybApiGetTinRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getTin(requestParameters: KybApiGetTinRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<KybGetTinResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getTin(requestParameters.tin, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * KybApi - factory interface
 * @export
 */
export const KybApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = KybApiFp(configuration)
    return {
        /**
         * 
         * @summary Business Detail
         * @param {KybApiBusinessDetailRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        businessDetail(requestParameters: KybApiBusinessDetailRequest = {}, options?: AxiosRequestConfig): AxiosPromise<object> {
            return localVarFp.businessDetail(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Business Search
         * @param {KybApiBusinessSearchRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        businessSearch(requestParameters: KybApiBusinessSearchRequest = {}, options?: AxiosRequestConfig): AxiosPromise<object> {
            return localVarFp.businessSearch(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary KYC - Get CAC 
         * @param {KybApiGetCacRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCac(requestParameters: KybApiGetCacRequest = {}, options?: AxiosRequestConfig): AxiosPromise<KybGetCacResponse> {
            return localVarFp.getCac(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary KYC - Fetch Tin
         * @param {KybApiGetTinRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getTin(requestParameters: KybApiGetTinRequest = {}, options?: AxiosRequestConfig): AxiosPromise<KybGetTinResponse> {
            return localVarFp.getTin(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for businessDetail operation in KybApi.
 * @export
 * @interface KybApiBusinessDetailRequest
 */
export type KybApiBusinessDetailRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof KybApiBusinessDetail
    */
    readonly internationalNumber?: string
    
    /**
    * 
    * @type {string}
    * @memberof KybApiBusinessDetail
    */
    readonly countryCode?: string
    
    /**
    * 
    * @type {boolean}
    * @memberof KybApiBusinessDetail
    */
    readonly full?: boolean
    
}

/**
 * Request parameters for businessSearch operation in KybApi.
 * @export
 * @interface KybApiBusinessSearchRequest
 */
export type KybApiBusinessSearchRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof KybApiBusinessSearch
    */
    readonly countryCode?: string
    
    /**
    * 
    * @type {number}
    * @memberof KybApiBusinessSearch
    */
    readonly company?: number
    
}

/**
 * Request parameters for getCac operation in KybApi.
 * @export
 * @interface KybApiGetCacRequest
 */
export type KybApiGetCacRequest = {
    
    /**
    * 
    * @type {number}
    * @memberof KybApiGetCac
    */
    readonly rcNumber?: number
    
    /**
    * 
    * @type {string}
    * @memberof KybApiGetCac
    */
    readonly companyName?: string
    
}

/**
 * Request parameters for getTin operation in KybApi.
 * @export
 * @interface KybApiGetTinRequest
 */
export type KybApiGetTinRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof KybApiGetTin
    */
    readonly tin?: string
    
}

/**
 * KybApiGenerated - object-oriented interface
 * @export
 * @class KybApiGenerated
 * @extends {BaseAPI}
 */
export class KybApiGenerated extends BaseAPI {
    /**
     * 
     * @summary Business Detail
     * @param {KybApiBusinessDetailRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof KybApiGenerated
     */
    public businessDetail(requestParameters: KybApiBusinessDetailRequest = {}, options?: AxiosRequestConfig) {
        return KybApiFp(this.configuration).businessDetail(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Business Search
     * @param {KybApiBusinessSearchRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof KybApiGenerated
     */
    public businessSearch(requestParameters: KybApiBusinessSearchRequest = {}, options?: AxiosRequestConfig) {
        return KybApiFp(this.configuration).businessSearch(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary KYC - Get CAC 
     * @param {KybApiGetCacRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof KybApiGenerated
     */
    public getCac(requestParameters: KybApiGetCacRequest = {}, options?: AxiosRequestConfig) {
        return KybApiFp(this.configuration).getCac(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary KYC - Fetch Tin
     * @param {KybApiGetTinRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof KybApiGenerated
     */
    public getTin(requestParameters: KybApiGetTinRequest = {}, options?: AxiosRequestConfig) {
        return KybApiFp(this.configuration).getTin(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
