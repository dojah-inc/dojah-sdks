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

from dojah_client.model.fraud_get_ip_reputation_response import FraudGetIpReputationResponse as FraudGetIpReputationResponseSchema

from dojah_client.type.fraud_get_ip_reputation_response import FraudGetIpReputationResponse

from . import path

# Query params
IpAddressSchema = schemas.StrSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'ip_address': typing.Union[IpAddressSchema, str, ],
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_ip_address = api_client.QueryParameter(
    name="ip_address",
    style=api_client.ParameterStyle.FORM,
    schema=IpAddressSchema,
    explode=True,
)
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
    name="Access-Control-Allow-Origin",
    style=api_client.ParameterStyle.SIMPLE,
    schema=AccessControlAllowOriginSchema,
)
UuidSchema = schemas.StrSchema
uuid_parameter = api_client.HeaderParameter(
    name="uuid",
    style=api_client.ParameterStyle.SIMPLE,
    schema=UuidSchema,
)
XMoesifTransactionIdSchema = schemas.StrSchema
x_moesif_transaction_id_parameter = api_client.HeaderParameter(
    name="x-moesif-transaction-id",
    style=api_client.ParameterStyle.SIMPLE,
    schema=XMoesifTransactionIdSchema,
)
RateLimitLimitSchema = schemas.IntSchema
rate_limit_limit_parameter = api_client.HeaderParameter(
    name="RateLimit-Limit",
    style=api_client.ParameterStyle.SIMPLE,
    schema=RateLimitLimitSchema,
)
RateLimitRemainingSchema = schemas.IntSchema
rate_limit_remaining_parameter = api_client.HeaderParameter(
    name="RateLimit-Remaining",
    style=api_client.ParameterStyle.SIMPLE,
    schema=RateLimitRemainingSchema,
)
RateLimitResetSchema = schemas.IntSchema
rate_limit_reset_parameter = api_client.HeaderParameter(
    name="RateLimit-Reset",
    style=api_client.ParameterStyle.SIMPLE,
    schema=RateLimitResetSchema,
)
ServiceSchema = schemas.StrSchema
service_parameter = api_client.HeaderParameter(
    name="service",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ServiceSchema,
)
ProductSchema = schemas.StrSchema
product_parameter = api_client.HeaderParameter(
    name="product",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ProductSchema,
)
ETagSchema = schemas.StrSchema
e_tag_parameter = api_client.HeaderParameter(
    name="ETag",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ETagSchema,
)
VarySchema = schemas.StrSchema
vary_parameter = api_client.HeaderParameter(
    name="Vary",
    style=api_client.ParameterStyle.SIMPLE,
    schema=VarySchema,
)
CFCacheStatusSchema = schemas.StrSchema
cf_cache_status_parameter = api_client.HeaderParameter(
    name="CF-Cache-Status",
    style=api_client.ParameterStyle.SIMPLE,
    schema=CFCacheStatusSchema,
)
ServerTimingSchema = schemas.StrSchema
server_timing_parameter = api_client.HeaderParameter(
    name="Server-Timing",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ServerTimingSchema,
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
SchemaFor200ResponseBodyApplicationJson = FraudGetIpReputationResponseSchema
ResponseHeadersFor200 = typing_extensions.TypedDict(
    'ResponseHeadersFor200',
    {
        'Date': DateSchema,
        'Transfer-Encoding': TransferEncodingSchema,
        'Connection': ConnectionSchema,
        'Access-Control-Allow-Origin': AccessControlAllowOriginSchema,
        'uuid': UuidSchema,
        'x-moesif-transaction-id': XMoesifTransactionIdSchema,
        'RateLimit-Limit': RateLimitLimitSchema,
        'RateLimit-Remaining': RateLimitRemainingSchema,
        'RateLimit-Reset': RateLimitResetSchema,
        'service': ServiceSchema,
        'product': ProductSchema,
        'ETag': ETagSchema,
        'Vary': VarySchema,
        'CF-Cache-Status': CFCacheStatusSchema,
        'Server-Timing': ServerTimingSchema,
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
    body: FraudGetIpReputationResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: FraudGetIpReputationResponse


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
        uuid_parameter,
        x_moesif_transaction_id_parameter,
        rate_limit_limit_parameter,
        rate_limit_remaining_parameter,
        rate_limit_reset_parameter,
        service_parameter,
        product_parameter,
        e_tag_parameter,
        vary_parameter,
        cf_cache_status_parameter,
        server_timing_parameter,
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

    def _get_ip_reputation_mapped_args(
        self,
        ip_address: typing.Optional[str] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _query_params = {}
        if ip_address is not None:
            _query_params["ip_address"] = ip_address
        args.query = _query_params
        return args

    async def _aget_ip_reputation_oapg(
        self,
            query_params: typing.Optional[dict] = {},
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
        IP Reputation
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_ip_address,
        ):
            parameter_data = query_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            if prefix_separator_iterator is None:
                prefix_separator_iterator = parameter.get_prefix_separator_iterator()
            serialized_data = parameter.serialize(parameter_data, prefix_separator_iterator)
            for serialized_value in serialized_data.values():
                used_path += serialized_value
    
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
            prefix_separator_iterator=prefix_separator_iterator,
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


    def _get_ip_reputation_oapg(
        self,
            query_params: typing.Optional[dict] = {},
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        IP Reputation
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_ip_address,
        ):
            parameter_data = query_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            if prefix_separator_iterator is None:
                prefix_separator_iterator = parameter.get_prefix_separator_iterator()
            serialized_data = parameter.serialize(parameter_data, prefix_separator_iterator)
            for serialized_value in serialized_data.values():
                used_path += serialized_value
    
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
            prefix_separator_iterator=prefix_separator_iterator,
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


class GetIpReputation(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def aget_ip_reputation(
        self,
        ip_address: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._get_ip_reputation_mapped_args(
            ip_address=ip_address,
        )
        return await self._aget_ip_reputation_oapg(
            query_params=args.query,
        )
    
    def get_ip_reputation(
        self,
        ip_address: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._get_ip_reputation_mapped_args(
            ip_address=ip_address,
        )
        return self._get_ip_reputation_oapg(
            query_params=args.query,
        )

class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aget(
        self,
        ip_address: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._get_ip_reputation_mapped_args(
            ip_address=ip_address,
        )
        return await self._aget_ip_reputation_oapg(
            query_params=args.query,
        )
    
    def get(
        self,
        ip_address: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._get_ip_reputation_mapped_args(
            ip_address=ip_address,
        )
        return self._get_ip_reputation_oapg(
            query_params=args.query,
        )

