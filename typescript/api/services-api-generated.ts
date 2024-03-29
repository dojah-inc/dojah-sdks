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
import { GetWalletBalanceResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * ServicesApi - axios parameter creator
 * @export
 */
export const ServicesApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Get Dojah Wallet Balance
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getWalletBalance: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/balance`;
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
    }
};

/**
 * ServicesApi - functional programming interface
 * @export
 */
export const ServicesApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = ServicesApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Get Dojah Wallet Balance
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getWalletBalance(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetWalletBalanceResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getWalletBalance(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * ServicesApi - factory interface
 * @export
 */
export const ServicesApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = ServicesApiFp(configuration)
    return {
        /**
         * 
         * @summary Get Dojah Wallet Balance
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getWalletBalance(options?: AxiosRequestConfig): AxiosPromise<GetWalletBalanceResponse> {
            return localVarFp.getWalletBalance(options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * ServicesApiGenerated - object-oriented interface
 * @export
 * @class ServicesApiGenerated
 * @extends {BaseAPI}
 */
export class ServicesApiGenerated extends BaseAPI {
    /**
     * 
     * @summary Get Dojah Wallet Balance
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ServicesApiGenerated
     */
    public getWalletBalance(options?: AxiosRequestConfig) {
        return ServicesApiFp(this.configuration).getWalletBalance(options).then((request) => request(this.axios, this.basePath));
    }
}
