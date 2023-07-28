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
import { MlVerifyPhotoIdWithSelfieRequest } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * MlApi - axios parameter creator
 * @export
 */
export const MlApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary KYC - Selfie Photo ID Verification
         * @param {MlVerifyPhotoIdWithSelfieRequest} mlVerifyPhotoIdWithSelfieRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        verifyPhotoIdWithSelfie: async (mlVerifyPhotoIdWithSelfieRequest: MlVerifyPhotoIdWithSelfieRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'mlVerifyPhotoIdWithSelfieRequest' is not null or undefined
            assertParamExists('verifyPhotoIdWithSelfie', 'mlVerifyPhotoIdWithSelfieRequest', mlVerifyPhotoIdWithSelfieRequest)
            const localVarPath = `/api/v1/kyc/photoid/verify`;
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
                requestBody: mlVerifyPhotoIdWithSelfieRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(mlVerifyPhotoIdWithSelfieRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * MlApi - functional programming interface
 * @export
 */
export const MlApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = MlApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary KYC - Selfie Photo ID Verification
         * @param {MlApiVerifyPhotoIdWithSelfieRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async verifyPhotoIdWithSelfie(requestParameters: MlApiVerifyPhotoIdWithSelfieRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<object>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.verifyPhotoIdWithSelfie(requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * MlApi - factory interface
 * @export
 */
export const MlApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = MlApiFp(configuration)
    return {
        /**
         * 
         * @summary KYC - Selfie Photo ID Verification
         * @param {MlApiVerifyPhotoIdWithSelfieRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        verifyPhotoIdWithSelfie(requestParameters: MlApiVerifyPhotoIdWithSelfieRequest, options?: AxiosRequestConfig): AxiosPromise<object> {
            return localVarFp.verifyPhotoIdWithSelfie(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for verifyPhotoIdWithSelfie operation in MlApi.
 * @export
 * @interface MlApiVerifyPhotoIdWithSelfieRequest
 */
export type MlApiVerifyPhotoIdWithSelfieRequest = {
    
} & MlVerifyPhotoIdWithSelfieRequest

/**
 * MlApiGenerated - object-oriented interface
 * @export
 * @class MlApiGenerated
 * @extends {BaseAPI}
 */
export class MlApiGenerated extends BaseAPI {
    /**
     * 
     * @summary KYC - Selfie Photo ID Verification
     * @param {MlApiVerifyPhotoIdWithSelfieRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MlApiGenerated
     */
    public verifyPhotoIdWithSelfie(requestParameters: MlApiVerifyPhotoIdWithSelfieRequest, options?: AxiosRequestConfig) {
        return MlApiFp(this.configuration).verifyPhotoIdWithSelfie(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}