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

from dojah_client.model.get_phone_number_response import GetPhoneNumberResponse as GetPhoneNumberResponseSchema
from dojah_client.model.get_phone_number404_response import GetPhoneNumber404Response as GetPhoneNumber404ResponseSchema

from dojah_client.type.get_phone_number_response import GetPhoneNumberResponse
from dojah_client.type.get_phone_number404_response import GetPhoneNumber404Response

# Query params
PhoneNumberSchema = schemas.IntSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'phone_number': typing.Union[PhoneNumberSchema, decimal.Decimal, int, ],
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_phone_number = api_client.QueryParameter(
    name="phone_number",
    style=api_client.ParameterStyle.FORM,
    schema=PhoneNumberSchema,
    explode=True,
)
DateSchema = schemas.StrSchema
TransferEncodingSchema = schemas.StrSchema
ConnectionSchema = schemas.StrSchema
AccessControlAllowOriginSchema = schemas.StrSchema
XMoesifTransactionIdSchema = schemas.StrSchema
ServiceSchema = schemas.StrSchema
ProductSchema = schemas.StrSchema
EtagSchema = schemas.StrSchema
VarySchema = schemas.StrSchema
CFCacheStatusSchema = schemas.StrSchema
ExpectCTSchema = schemas.StrSchema
ReportToSchema = schemas.StrSchema
NELSchema = schemas.StrSchema
ServerSchema = schemas.StrSchema
CFRAYSchema = schemas.StrSchema
ContentEncodingSchema = schemas.StrSchema
AltSvcSchema = schemas.StrSchema
SchemaFor200ResponseBodyApplicationJson = GetPhoneNumberResponseSchema
ResponseHeadersFor200 = typing_extensions.TypedDict(
    'ResponseHeadersFor200',
    {
        'Date': DateSchema,
        'Transfer-Encoding': TransferEncodingSchema,
        'Connection': ConnectionSchema,
        'access-control-allow-origin': AccessControlAllowOriginSchema,
        'x-moesif-transaction-id': XMoesifTransactionIdSchema,
        'service': ServiceSchema,
        'product': ProductSchema,
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
    body: GetPhoneNumberResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: GetPhoneNumberResponse


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
        service_parameter,
        product_parameter,
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
DateSchema = schemas.StrSchema
TransferEncodingSchema = schemas.StrSchema
ConnectionSchema = schemas.StrSchema
AccessControlAllowOriginSchema = schemas.StrSchema
XMoesifTransactionIdSchema = schemas.StrSchema
ServiceSchema = schemas.StrSchema
ProductSchema = schemas.StrSchema
EtagSchema = schemas.StrSchema
VarySchema = schemas.StrSchema
CFCacheStatusSchema = schemas.StrSchema
ExpectCTSchema = schemas.StrSchema
ReportToSchema = schemas.StrSchema
NELSchema = schemas.StrSchema
ServerSchema = schemas.StrSchema
CFRAYSchema = schemas.StrSchema
ContentEncodingSchema = schemas.StrSchema
AltSvcSchema = schemas.StrSchema
SchemaFor404ResponseBodyApplicationJson = GetPhoneNumber404ResponseSchema
ResponseHeadersFor404 = typing_extensions.TypedDict(
    'ResponseHeadersFor404',
    {
        'Date': DateSchema,
        'Transfer-Encoding': TransferEncodingSchema,
        'Connection': ConnectionSchema,
        'access-control-allow-origin': AccessControlAllowOriginSchema,
        'x-moesif-transaction-id': XMoesifTransactionIdSchema,
        'service': ServiceSchema,
        'product': ProductSchema,
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
class ApiResponseFor404(api_client.ApiResponse):
    body: GetPhoneNumber404Response


@dataclass
class ApiResponseFor404Async(api_client.AsyncApiResponse):
    body: GetPhoneNumber404Response


_response_for_404 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor404,
    response_cls_async=ApiResponseFor404Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor404ResponseBodyApplicationJson),
    },
    headers=[
        date_parameter,
        transfer_encoding_parameter,
        connection_parameter,
        access_control_allow_origin_parameter,
        x_moesif_transaction_id_parameter,
        service_parameter,
        product_parameter,
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
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _get_phone_number_mapped_args(
        self,
        phone_number: typing.Optional[int] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _query_params = {}
        if phone_number is not None:
            _query_params["phone_number"] = phone_number
        args.query = _query_params
        return args

    async def _aget_phone_number_oapg(
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
        KYC - Lookup Phone Number
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_phone_number,
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


    def _get_phone_number_oapg(
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
        KYC - Lookup Phone Number
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_phone_number,
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


class GetPhoneNumber(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def aget_phone_number(
        self,
        phone_number: typing.Optional[int] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._get_phone_number_mapped_args(
            phone_number=phone_number,
        )
        return await self._aget_phone_number_oapg(
            query_params=args.query,
        )
    
    def get_phone_number(
        self,
        phone_number: typing.Optional[int] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._get_phone_number_mapped_args(
            phone_number=phone_number,
        )
        return self._get_phone_number_oapg(
            query_params=args.query,
        )

class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aget(
        self,
        phone_number: typing.Optional[int] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._get_phone_number_mapped_args(
            phone_number=phone_number,
        )
        return await self._aget_phone_number_oapg(
            query_params=args.query,
        )
    
    def get(
        self,
        phone_number: typing.Optional[int] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._get_phone_number_mapped_args(
            phone_number=phone_number,
        )
        return self._get_phone_number_oapg(
            query_params=args.query,
        )
