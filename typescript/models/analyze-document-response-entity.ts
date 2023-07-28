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
import { AnalyzeDocumentResponseEntityDocumentImages } from './analyze-document-response-entity-document-images';
// May contain unused imports in some cases
// @ts-ignore
import { AnalyzeDocumentResponseEntityDocumentType } from './analyze-document-response-entity-document-type';
// May contain unused imports in some cases
// @ts-ignore
import { AnalyzeDocumentResponseEntityStatus } from './analyze-document-response-entity-status';
// May contain unused imports in some cases
// @ts-ignore
import { AnalyzeDocumentResponseEntityTextDataInner } from './analyze-document-response-entity-text-data-inner';

/**
 * 
 * @export
 * @interface AnalyzeDocumentResponseEntity
 */
export interface AnalyzeDocumentResponseEntity {
    /**
     * 
     * @type {AnalyzeDocumentResponseEntityDocumentImages}
     * @memberof AnalyzeDocumentResponseEntity
     */
    'document_images'?: AnalyzeDocumentResponseEntityDocumentImages;
    /**
     * 
     * @type {AnalyzeDocumentResponseEntityDocumentType}
     * @memberof AnalyzeDocumentResponseEntity
     */
    'document_type'?: AnalyzeDocumentResponseEntityDocumentType;
    /**
     * 
     * @type {AnalyzeDocumentResponseEntityStatus}
     * @memberof AnalyzeDocumentResponseEntity
     */
    'status'?: AnalyzeDocumentResponseEntityStatus;
    /**
     * 
     * @type {Array<AnalyzeDocumentResponseEntityTextDataInner>}
     * @memberof AnalyzeDocumentResponseEntity
     */
    'text_data'?: Array<AnalyzeDocumentResponseEntityTextDataInner>;
}

