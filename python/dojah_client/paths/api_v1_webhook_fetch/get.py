# coding: utf-8

"""
    DOJAH Publilc APIs

    Use Dojah to verify, onboard and manage user identity across Africa!

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
from dojah_client.request_before_hook import request_before_hook
import json
from urllib3._collections import HTTPHeaderDict

from dojah_client.api_response import AsyncGeneratorResponse
from dojah_client import api_client, exceptions
from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from dojah_client import schemas  # noqa: F401

from dojah_client.model.get_webhooks_response import GetWebhooksResponse as GetWebhooksResponseSchema

from dojah_client.type.get_webhooks_response import GetWebhooksResponse

from . import path

_auth = [
    'apikeyAuth',
    'appIdAuth',
]
DateSchema = schemas.StrSchema
date_parameter = api_client.HeaderParameter(
    name="Date",
    style=api_client.ParameterStyle.SIMPLE,
    schema=DateSchema,
)
TransferEncodingSchema = schemas.StrSchema
transfer_encoding_parameter = api_client.HeaderParameter(
    name="Transfer-Encoding",
    style=api_client.ParameterStyle.SIMPLE,
    schema=TransferEncodingSchema,
)
ConnectionSchema = schemas.StrSchema
connection_parameter = api_client.HeaderParameter(
    name="Connection",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ConnectionSchema,
)
AccessControlAllowOriginSchema = schemas.StrSchema
access_control_allow_origin_parameter = api_client.HeaderParameter(
    name="access-control-allow-origin",
    style=api_client.ParameterStyle.SIMPLE,
    schema=AccessControlAllowOriginSchema,
)
XMoesifTransactionIdSchema = schemas.StrSchema
x_moesif_transaction_id_parameter = api_client.HeaderParameter(
    name="x-moesif-transaction-id",
    style=api_client.ParameterStyle.SIMPLE,
    schema=XMoesifTransactionIdSchema,
)
EtagSchema = schemas.StrSchema
etag_parameter = api_client.HeaderParameter(
    name="etag",
    style=api_client.ParameterStyle.SIMPLE,
    schema=EtagSchema,
)
VarySchema = schemas.StrSchema
vary_parameter = api_client.HeaderParameter(
    name="vary",
    style=api_client.ParameterStyle.SIMPLE,
    schema=VarySchema,
)
CFCacheStatusSchema = schemas.StrSchema
cf_cache_status_parameter = api_client.HeaderParameter(
    name="CF-Cache-Status",
    style=api_client.ParameterStyle.SIMPLE,
    schema=CFCacheStatusSchema,
)
ExpectCTSchema = schemas.StrSchema
expect_ct_parameter = api_client.HeaderParameter(
    name="Expect-CT",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ExpectCTSchema,
)
ReportToSchema = schemas.StrSchema
report_to_parameter = api_client.HeaderParameter(
    name="Report-To",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ReportToSchema,
)
NELSchema = schemas.StrSchema
nel_parameter = api_client.HeaderParameter(
    name="NEL",
    style=api_client.ParameterStyle.SIMPLE,
    schema=NELSchema,
)
ServerSchema = schemas.StrSchema
server_parameter = api_client.HeaderParameter(
    name="Server",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ServerSchema,
)
CFRAYSchema = schemas.StrSchema
cf_ray_parameter = api_client.HeaderParameter(
    name="CF-RAY",
    style=api_client.ParameterStyle.SIMPLE,
    schema=CFRAYSchema,
)
ContentEncodingSchema = schemas.StrSchema
content_encoding_parameter = api_client.HeaderParameter(
    name="Content-Encoding",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ContentEncodingSchema,
)
AltSvcSchema = schemas.StrSchema
alt_svc_parameter = api_client.HeaderParameter(
    name="alt-svc",
    style=api_client.ParameterStyle.SIMPLE,
    schema=AltSvcSchema,
)
SchemaFor200ResponseBodyApplicationJson = GetWebhooksResponseSchema
ResponseHeadersFor200 = typing_extensions.TypedDict(
    'ResponseHeadersFor200',
    {
        'Date': DateSchema,
        'Transfer-Encoding': TransferEncodingSchema,
        'Connection': ConnectionSchema,
        'access-control-allow-origin': AccessControlAllowOriginSchema,
        'x-moesif-transaction-id': XMoesifTransactionIdSchema,
        'etag': EtagSchema,
        'vary': VarySchema,
        'CF-Cache-Status': CFCacheStatusSchema,
        'Expect-CT': ExpectCTSchema,
        'Report-To': ReportToSchema,
        'NEL': NELSchema,
        'Server': ServerSchema,
        'CF-RAY': CFRAYSchema,
        'Content-Encoding': ContentEncodingSchema,
        'alt-svc': AltSvcSchema,
    }
)


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: GetWebhooksResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: GetWebhooksResponse


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
    headers=[
        date_parameter,
        transfer_encoding_parameter,
        connection_parameter,
        access_control_allow_origin_parameter,
        x_moesif_transaction_id_parameter,
        etag_parameter,
        vary_parameter,
        cf_cache_status_parameter,
        expect_ct_parameter,
        report_to_parameter,
        nel_parameter,
        server_parameter,
        cf_ray_parameter,
        content_encoding_parameter,
        alt_svc_parameter,
    ]
)
_status_code_to_response = {
    '200': _response_for_200,
}
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _get_webhooks_mapped_args(
        self,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        return args

    async def _aget_webhooks_oapg(
        self,
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        Fetch All Webhooks
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
        method = 'get'.upper()
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            auth_settings=_auth,
            headers=_headers,
        )
    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            auth_settings=_auth,
            timeout=timeout,
        )
    
        if stream:
            if not 200 <= response.http_response.status <= 299:
                body = (await response.http_response.content.read()).decode("utf-8")
                raise exceptions.ApiStreamingException(
                    status=response.http_response.status,
                    reason=response.http_response.reason,
                    body=body,
                )
    
            async def stream_iterator():
                """
                iterates over response.http_response.content and closes connection once iteration has finished
                """
                async for line in response.http_response.content:
                    if line == b'\r\n':
                        continue
                    yield line
                response.http_response.close()
                await response.session.close()
            return AsyncGeneratorResponse(
                content=stream_iterator(),
                headers=response.http_response.headers,
                status=response.http_response.status,
                response=response.http_response
            )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = await response_for_status.deserialize_async(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserializationAsync(
                body=await response.http_response.json() if is_json else await response.http_response.text(),
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        # cleanup session / response
        response.http_response.close()
        await response.session.close()
    
        return api_response


    def _get_webhooks_oapg(
        self,
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        Fetch All Webhooks
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
        method = 'get'.upper()
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            auth_settings=_auth,
            headers=_headers,
        )
    
        response = self.api_client.call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            auth_settings=_auth,
            timeout=timeout,
        )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = response_for_status.deserialize(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserialization(
                body=json.loads(response.http_response.data) if is_json else response.http_response.data,
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        return api_response


class GetWebhooks(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def aget_webhooks(
        self,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._get_webhooks_mapped_args(
        )
        return await self._aget_webhooks_oapg(
        )
    
    def get_webhooks(
        self,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._get_webhooks_mapped_args(
        )
        return self._get_webhooks_oapg(
        )

class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aget(
        self,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._get_webhooks_mapped_args(
        )
        return await self._aget_webhooks_oapg(
        )
    
    def get(
        self,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._get_webhooks_mapped_args(
        )
        return self._get_webhooks_oapg(
        )

