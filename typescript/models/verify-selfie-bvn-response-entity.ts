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

// May contain unused imports in some cases
// @ts-ignore
import { VerifySelfieBvnResponseEntitySelfieVerification } from './verify-selfie-bvn-response-entity-selfie-verification';

/**
 * 
 * @export
 * @interface VerifySelfieBvnResponseEntity
 */
export interface VerifySelfieBvnResponseEntity {
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'bvn'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'date_of_birth'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'email'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'enrollment_bank'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'enrollment_branch'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'first_name'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'gender'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'image'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'last_name'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'level_of_account'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'lga_of_origin'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'lga_of_residence'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'marital_status'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'middle_name'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'name_on_card'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'nin'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'phone_number1'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'phone_number2'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'registration_date'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'residential_address'?: string;
    /**
     * 
     * @type {VerifySelfieBvnResponseEntitySelfieVerification}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'selfie_verification'?: VerifySelfieBvnResponseEntitySelfieVerification;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'state_of_origin'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'state_of_residence'?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifySelfieBvnResponseEntity
     */
    'watch_listed'?: string;
}

