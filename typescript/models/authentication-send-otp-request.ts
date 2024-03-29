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


/**
 * 
 * @export
 * @interface AuthenticationSendOtpRequest
 */
export interface AuthenticationSendOtpRequest {
    /**
     * 
     * @type {string}
     * @memberof AuthenticationSendOtpRequest
     */
    'destination'?: string;
    /**
     * 
     * @type {number}
     * @memberof AuthenticationSendOtpRequest
     */
    'length'?: number;
    /**
     * 
     * @type {string}
     * @memberof AuthenticationSendOtpRequest
     */
    'channel'?: string;
    /**
     * 
     * @type {string}
     * @memberof AuthenticationSendOtpRequest
     */
    'sender_id'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof AuthenticationSendOtpRequest
     */
    'priority'?: boolean;
}

