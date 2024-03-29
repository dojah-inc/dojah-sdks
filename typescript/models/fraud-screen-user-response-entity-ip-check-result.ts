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
import { FraudScreenUserResponseEntityIpCheckResultAnonymity } from './fraud-screen-user-response-entity-ip-check-result-anonymity';
// May contain unused imports in some cases
// @ts-ignore
import { FraudScreenUserResponseEntityIpCheckResultBlacklists } from './fraud-screen-user-response-entity-ip-check-result-blacklists';
// May contain unused imports in some cases
// @ts-ignore
import { FraudScreenUserResponseEntityIpCheckResultIpDetails } from './fraud-screen-user-response-entity-ip-check-result-ip-details';
// May contain unused imports in some cases
// @ts-ignore
import { FraudScreenUserResponseEntityIpCheckResultRiskScore } from './fraud-screen-user-response-entity-ip-check-result-risk-score';

/**
 * 
 * @export
 * @interface FraudScreenUserResponseEntityIpCheckResult
 */
export interface FraudScreenUserResponseEntityIpCheckResult {
    /**
     * 
     * @type {string}
     * @memberof FraudScreenUserResponseEntityIpCheckResult
     */
    'ip'?: string;
    /**
     * 
     * @type {FraudScreenUserResponseEntityIpCheckResultBlacklists}
     * @memberof FraudScreenUserResponseEntityIpCheckResult
     */
    'blacklists'?: FraudScreenUserResponseEntityIpCheckResultBlacklists;
    /**
     * 
     * @type {FraudScreenUserResponseEntityIpCheckResultAnonymity}
     * @memberof FraudScreenUserResponseEntityIpCheckResult
     */
    'anonymity'?: FraudScreenUserResponseEntityIpCheckResultAnonymity;
    /**
     * 
     * @type {FraudScreenUserResponseEntityIpCheckResultRiskScore}
     * @memberof FraudScreenUserResponseEntityIpCheckResult
     */
    'risk_score'?: FraudScreenUserResponseEntityIpCheckResultRiskScore;
    /**
     * 
     * @type {FraudScreenUserResponseEntityIpCheckResultIpDetails}
     * @memberof FraudScreenUserResponseEntityIpCheckResult
     */
    'ip_details'?: FraudScreenUserResponseEntityIpCheckResultIpDetails;
}

