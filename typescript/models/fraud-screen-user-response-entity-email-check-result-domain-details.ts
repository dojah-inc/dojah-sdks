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
 * @interface FraudScreenUserResponseEntityEmailCheckResultDomainDetails
 */
export interface FraudScreenUserResponseEntityEmailCheckResultDomainDetails {
    /**
     * 
     * @type {string}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'domain'?: string;
    /**
     * 
     * @type {string}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'tld'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'registered'?: boolean;
    /**
     * 
     * @type {string}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'created'?: string;
    /**
     * 
     * @type {string}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'updated'?: string;
    /**
     * 
     * @type {string}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'expires'?: string;
    /**
     * 
     * @type {string}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'registrar_name'?: string;
    /**
     * 
     * @type {string}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'registered_to'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'disposable'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'free'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'custom'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'dmarc_enforced'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'spf_strict'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'valid_mx'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'accept_all'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'suspicious_tld'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof FraudScreenUserResponseEntityEmailCheckResultDomainDetails
     */
    'website_exists'?: boolean;
}

