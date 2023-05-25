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

// May contain unused imports in some cases
// @ts-ignore
import { GetEmailReputationResponseEntityDetails } from './get-email-reputation-response-entity-details';

/**
 * 
 * @export
 * @interface GetEmailReputationResponseEntity
 */
export interface GetEmailReputationResponseEntity {
    /**
     * 
     * @type {string}
     * @memberof GetEmailReputationResponseEntity
     */
    'email'?: string;
    /**
     * 
     * @type {string}
     * @memberof GetEmailReputationResponseEntity
     */
    'reputation'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof GetEmailReputationResponseEntity
     */
    'suspicious'?: boolean;
    /**
     * 
     * @type {number}
     * @memberof GetEmailReputationResponseEntity
     */
    'references'?: number;
    /**
     * 
     * @type {GetEmailReputationResponseEntityDetails}
     * @memberof GetEmailReputationResponseEntity
     */
    'details'?: GetEmailReputationResponseEntityDetails;
}

