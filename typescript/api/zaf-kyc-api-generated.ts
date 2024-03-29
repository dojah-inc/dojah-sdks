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
import { ZafKycGetIdResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * ZafKycApi - axios parameter creator
 * @export
 */
export const ZafKycApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary KYC - Lookup ID
         * @param {number} [idNumber] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getId: async (idNumber?: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/za/kyc/id`;
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
            if (idNumber !== undefined) {
                localVarQueryParameter['id_number'] = idNumber;
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
 * ZafKycApi - functional programming interface
 * @export
 */
export const ZafKycApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = ZafKycApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary KYC - Lookup ID
         * @param {ZafKycApiGetIdRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getId(requestParameters: ZafKycApiGetIdRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<ZafKycGetIdResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getId(requestParameters.idNumber, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * ZafKycApi - factory interface
 * @export
 */
export const ZafKycApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = ZafKycApiFp(configuration)
    return {
        /**
         * 
         * @summary KYC - Lookup ID
         * @param {ZafKycApiGetIdRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getId(requestParameters: ZafKycApiGetIdRequest = {}, options?: AxiosRequestConfig): AxiosPromise<ZafKycGetIdResponse> {
            return localVarFp.getId(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getId operation in ZafKycApi.
 * @export
 * @interface ZafKycApiGetIdRequest
 */
export type ZafKycApiGetIdRequest = {
    
    /**
    * 
    * @type {number}
    * @memberof ZafKycApiGetId
    */
    readonly idNumber?: number
    
}

/**
 * ZafKycApiGenerated - object-oriented interface
 * @export
 * @class ZafKycApiGenerated
 * @extends {BaseAPI}
 */
export class ZafKycApiGenerated extends BaseAPI {
    /**
     * 
     * @summary KYC - Lookup ID
     * @param {ZafKycApiGetIdRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ZafKycApiGenerated
     */
    public getId(requestParameters: ZafKycApiGetIdRequest = {}, options?: AxiosRequestConfig) {
        return ZafKycApiFp(this.configuration).getId(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
