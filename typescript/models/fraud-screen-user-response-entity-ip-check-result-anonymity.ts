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
 * @interface FraudScreenUserResponseEntityIpCheckResultAnonymity
 */
export interface FraudScreenUserResponseEntityIpCheckResultAnonymity {
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityIpCheckResultAnonymity
     */
    'is_proxy'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityIpCheckResultAnonymity
     */
    'is_webproxy'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityIpCheckResultAnonymity
     */
    'is_vpn'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityIpCheckResultAnonymity
     */
    'is_hosting'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityIpCheckResultAnonymity
     */
    'is_tor'?: boolean;
}

