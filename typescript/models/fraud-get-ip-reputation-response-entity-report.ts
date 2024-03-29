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
import { FraudGetIpReputationResponseEntityReportAnonymity } from './fraud-get-ip-reputation-response-entity-report-anonymity';
// May contain unused imports in some cases
// @ts-ignore
import { FraudGetIpReputationResponseEntityReportBlacklists } from './fraud-get-ip-reputation-response-entity-report-blacklists';
// May contain unused imports in some cases
// @ts-ignore
import { FraudGetIpReputationResponseEntityReportInformation } from './fraud-get-ip-reputation-response-entity-report-information';
// May contain unused imports in some cases
// @ts-ignore
import { FraudGetIpReputationResponseEntityReportRiskScore } from './fraud-get-ip-reputation-response-entity-report-risk-score';

/**
 * 
 * @export
 * @interface FraudGetIpReputationResponseEntityReport
 */
export interface FraudGetIpReputationResponseEntityReport {
    /**
     * 
     * @type {string}
     * @memberof FraudGetIpReputationResponseEntityReport
     */
    'ip'?: string;
    /**
     * 
     * @type {FraudGetIpReputationResponseEntityReportBlacklists}
     * @memberof FraudGetIpReputationResponseEntityReport
     */
    'blacklists'?: FraudGetIpReputationResponseEntityReportBlacklists;
    /**
     * 
     * @type {FraudGetIpReputationResponseEntityReportInformation}
     * @memberof FraudGetIpReputationResponseEntityReport
     */
    'information'?: FraudGetIpReputationResponseEntityReportInformation;
    /**
     * 
     * @type {FraudGetIpReputationResponseEntityReportAnonymity}
     * @memberof FraudGetIpReputationResponseEntityReport
     */
    'anonymity'?: FraudGetIpReputationResponseEntityReportAnonymity;
    /**
     * 
     * @type {FraudGetIpReputationResponseEntityReportRiskScore}
     * @memberof FraudGetIpReputationResponseEntityReport
     */
    'risk_score'?: FraudGetIpReputationResponseEntityReportRiskScore;
}

