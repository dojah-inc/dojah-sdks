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
import { DeleteWebhookResponse } from '../models';
// @ts-ignore
import { GetWebhooksResponse } from '../models';
// @ts-ignore
import { NotifyWebhookRequest } from '../models';
// @ts-ignore
import { NotifyWebhookRequestData } from '../models';
// @ts-ignore
import { NotifyWebhookResponse } from '../models';
// @ts-ignore
import { SubscribeServiceRequest } from '../models';
// @ts-ignore
import { SubscribeServiceResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * WebhooksApi - axios parameter creator
 * @export
 */
export const WebhooksApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Delete Webhook
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteWebhook: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/webhook/delete`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'DELETE', ...baseOptions, ...options};
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
         * @summary Fetch All Webhooks
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getWebhooks: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/v1/webhook/fetch`;
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
         * @summary Post Hook
         * @param {NotifyWebhookRequest} notifyWebhookRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        notifyWebhook: async (notifyWebhookRequest: NotifyWebhookRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'notifyWebhookRequest' is not null or undefined
            assertParamExists('notifyWebhook', 'notifyWebhookRequest', notifyWebhookRequest)
            const localVarPath = `/api/v1/webhook/notify`;
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
                requestBody: notifyWebhookRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(notifyWebhookRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Subscribe to service
         * @param {SubscribeServiceRequest} subscribeServiceRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        subscribeService: async (subscribeServiceRequest: SubscribeServiceRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'subscribeServiceRequest' is not null or undefined
            assertParamExists('subscribeService', 'subscribeServiceRequest', subscribeServiceRequest)
            const localVarPath = `/api/v1/webhook/subscribe`;
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
                requestBody: subscribeServiceRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(subscribeServiceRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * WebhooksApi - functional programming interface
 * @export
 */
export const WebhooksApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = WebhooksApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Delete Webhook
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async deleteWebhook(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<DeleteWebhookResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.deleteWebhook(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Fetch All Webhooks
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getWebhooks(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetWebhooksResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getWebhooks(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Post Hook
         * @param {WebhooksApiNotifyWebhookRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async notifyWebhook(requestParameters: WebhooksApiNotifyWebhookRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<NotifyWebhookResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.notifyWebhook(requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Subscribe to service
         * @param {WebhooksApiSubscribeServiceRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async subscribeService(requestParameters: WebhooksApiSubscribeServiceRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<SubscribeServiceResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.subscribeService(requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * WebhooksApi - factory interface
 * @export
 */
export const WebhooksApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = WebhooksApiFp(configuration)
    return {
        /**
         * 
         * @summary Delete Webhook
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteWebhook(options?: AxiosRequestConfig): AxiosPromise<DeleteWebhookResponse> {
            return localVarFp.deleteWebhook(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Fetch All Webhooks
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getWebhooks(options?: AxiosRequestConfig): AxiosPromise<GetWebhooksResponse> {
            return localVarFp.getWebhooks(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Post Hook
         * @param {WebhooksApiNotifyWebhookRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        notifyWebhook(requestParameters: WebhooksApiNotifyWebhookRequest, options?: AxiosRequestConfig): AxiosPromise<NotifyWebhookResponse> {
            return localVarFp.notifyWebhook(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Subscribe to service
         * @param {WebhooksApiSubscribeServiceRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        subscribeService(requestParameters: WebhooksApiSubscribeServiceRequest, options?: AxiosRequestConfig): AxiosPromise<SubscribeServiceResponse> {
            return localVarFp.subscribeService(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for notifyWebhook operation in WebhooksApi.
 * @export
 * @interface WebhooksApiNotifyWebhookRequest
 */
export type WebhooksApiNotifyWebhookRequest = {
    
} & NotifyWebhookRequest

/**
 * Request parameters for subscribeService operation in WebhooksApi.
 * @export
 * @interface WebhooksApiSubscribeServiceRequest
 */
export type WebhooksApiSubscribeServiceRequest = {
    
} & SubscribeServiceRequest

/**
 * WebhooksApiGenerated - object-oriented interface
 * @export
 * @class WebhooksApiGenerated
 * @extends {BaseAPI}
 */
export class WebhooksApiGenerated extends BaseAPI {
    /**
     * 
     * @summary Delete Webhook
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebhooksApiGenerated
     */
    public deleteWebhook(options?: AxiosRequestConfig) {
        return WebhooksApiFp(this.configuration).deleteWebhook(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Fetch All Webhooks
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebhooksApiGenerated
     */
    public getWebhooks(options?: AxiosRequestConfig) {
        return WebhooksApiFp(this.configuration).getWebhooks(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Post Hook
     * @param {WebhooksApiNotifyWebhookRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebhooksApiGenerated
     */
    public notifyWebhook(requestParameters: WebhooksApiNotifyWebhookRequest, options?: AxiosRequestConfig) {
        return WebhooksApiFp(this.configuration).notifyWebhook(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Subscribe to service
     * @param {WebhooksApiSubscribeServiceRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebhooksApiGenerated
     */
    public subscribeService(requestParameters: WebhooksApiSubscribeServiceRequest, options?: AxiosRequestConfig) {
        return WebhooksApiFp(this.configuration).subscribeService(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
