"""
    DOJAH APIs

    Use Dojah to verify, onboard and manage user identity across Africa!  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""


import re  # noqa: F401
import sys  # noqa: F401

from dojah_client.api_client import ApiClient, Endpoint as _Endpoint
from dojah_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from dojah_client.model.get_document_analysis_request import GetDocumentAnalysisRequest
from dojah_client.model.get_document_analysis_response import GetDocumentAnalysisResponse
from dojah_client.model.get_generic_ocr_text_request import GetGenericOcrTextRequest
from dojah_client.model.get_generic_ocr_text_response import GetGenericOcrTextResponse
from dojah_client.model.get_ocr_text_request import GetOcrTextRequest
from dojah_client.model.get_ocr_text_response import GetOcrTextResponse
from dojah_client.model.verify_photo_id_with_selfie_request import VerifyPhotoIdWithSelfieRequest
from dojah_client.model.verify_photo_id_with_selfie_response import VerifyPhotoIdWithSelfieResponse


class MLApi(object):
    """NOTE: This class is auto generated by Konfig
    Ref: https://konfigthis.com

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_document_analysis_endpoint = _Endpoint(
            settings={
                'response_type': (GetDocumentAnalysisResponse,),
                'auth': [
                    'apikeyAuth',
                    'appIdAuth'
                ],
                'endpoint_path': '/v1/document/analysis/dl',
                'operation_id': 'get_document_analysis',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_document_analysis_request',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_document_analysis_request':
                        (GetDocumentAnalysisRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_document_analysis_request': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client
        )
        self.get_generic_ocr_text_endpoint = _Endpoint(
            settings={
                'response_type': (GetGenericOcrTextResponse,),
                'auth': [
                    'apikeyAuth',
                    'appIdAuth'
                ],
                'endpoint_path': '/v1/ml/ocr/generic',
                'operation_id': 'get_generic_ocr_text',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_generic_ocr_text_request',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_generic_ocr_text_request':
                        (GetGenericOcrTextRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_generic_ocr_text_request': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client
        )
        self.get_ocr_text_endpoint = _Endpoint(
            settings={
                'response_type': (GetOcrTextResponse,),
                'auth': [
                    'apikeyAuth',
                    'appIdAuth'
                ],
                'endpoint_path': '/v1/ml/ocr',
                'operation_id': 'get_ocr_text',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_ocr_text_request',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_ocr_text_request':
                        (GetOcrTextRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_ocr_text_request': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client
        )
        self.verify_photo_id_with_selfie_endpoint = _Endpoint(
            settings={
                'response_type': (VerifyPhotoIdWithSelfieResponse,),
                'auth': [
                    'apikeyAuth',
                    'appIdAuth'
                ],
                'endpoint_path': '/v1/kyc/photoid/verify',
                'operation_id': 'verify_photo_id_with_selfie',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'verify_photo_id_with_selfie_request',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'verify_photo_id_with_selfie_request':
                        (VerifyPhotoIdWithSelfieRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'verify_photo_id_with_selfie_request': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client
        )

    def get_document_analysis(
        self,
        **kwargs
    ):
        """Document Analysis Drivers License  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_document_analysis(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            get_document_analysis_request (GetDocumentAnalysisRequest): [optional]
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            _request_auths (list): set to override the auth_settings for an a single
                request; this effectively ignores the authentication
                in the spec for a single request.
                Default is None
            async_req (bool): execute request asynchronously

        Returns:
            GetDocumentAnalysisResponse
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['_request_auths'] = kwargs.get('_request_auths', None)
        return self.get_document_analysis_endpoint.call_with_http_info(**kwargs)

    def get_generic_ocr_text(
        self,
        **kwargs
    ):
        """Generic OCR Service  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_generic_ocr_text(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            get_generic_ocr_text_request (GetGenericOcrTextRequest): [optional]
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            _request_auths (list): set to override the auth_settings for an a single
                request; this effectively ignores the authentication
                in the spec for a single request.
                Default is None
            async_req (bool): execute request asynchronously

        Returns:
            GetGenericOcrTextResponse
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['_request_auths'] = kwargs.get('_request_auths', None)
        return self.get_generic_ocr_text_endpoint.call_with_http_info(**kwargs)

    def get_ocr_text(
        self,
        **kwargs
    ):
        """BVN Ocr  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_ocr_text(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            get_ocr_text_request (GetOcrTextRequest): [optional]
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            _request_auths (list): set to override the auth_settings for an a single
                request; this effectively ignores the authentication
                in the spec for a single request.
                Default is None
            async_req (bool): execute request asynchronously

        Returns:
            GetOcrTextResponse
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['_request_auths'] = kwargs.get('_request_auths', None)
        return self.get_ocr_text_endpoint.call_with_http_info(**kwargs)

    def verify_photo_id_with_selfie(
        self,
        **kwargs
    ):
        """KYC - Selfie Photo ID Verification  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.verify_photo_id_with_selfie(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            verify_photo_id_with_selfie_request (VerifyPhotoIdWithSelfieRequest): [optional]
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            _request_auths (list): set to override the auth_settings for an a single
                request; this effectively ignores the authentication
                in the spec for a single request.
                Default is None
            async_req (bool): execute request asynchronously

        Returns:
            VerifyPhotoIdWithSelfieResponse
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['_request_auths'] = kwargs.get('_request_auths', None)
        return self.verify_photo_id_with_selfie_endpoint.call_with_http_info(**kwargs)

