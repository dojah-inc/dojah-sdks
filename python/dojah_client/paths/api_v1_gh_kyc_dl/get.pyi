# coding: utf-8

"""
    DOJAH APIs

    Use Dojah to verify, onboard and manage user identity across Africa!

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
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

from dojah_client.model.get_drivers_license_response import GetDriversLicenseResponse as GetDriversLicenseResponseSchema

from dojah_client.type.get_drivers_license_response import GetDriversLicenseResponse

# Query params
IdSchema = schemas.StrSchema
FullNameSchema = schemas.StrSchema
DateOfBirthSchema = schemas.StrSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'id': typing.Union[IdSchema, str, ],
        'full_name': typing.Union[FullNameSchema, str, ],
        'date_of_birth': typing.Union[DateOfBirthSchema, str, ],
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_id = api_client.QueryParameter(
    name="id",
    style=api_client.ParameterStyle.FORM,
    schema=IdSchema,
    explode=True,
)
request_query_full_name = api_client.QueryParameter(
    name="full_name",
    style=api_client.ParameterStyle.FORM,
    schema=FullNameSchema,
    explode=True,
)
request_query_date_of_birth = api_client.QueryParameter(
    name="date_of_birth",
    style=api_client.ParameterStyle.FORM,
    schema=DateOfBirthSchema,
    explode=True,
)
AccessControlAllowOriginSchema = schemas.StrSchema
XMoesifTransactionIdSchema = schemas.StrSchema
ServiceSchema = schemas.StrSchema
ProductSchema = schemas.StrSchema
ETagSchema = schemas.StrSchema
VarySchema = schemas.StrSchema
ContentEncodingSchema = schemas.StrSchema
DateSchema = schemas.StrSchema
ConnectionSchema = schemas.StrSchema
KeepAliveSchema = schemas.StrSchema
TransferEncodingSchema = schemas.StrSchema
SchemaFor200ResponseBodyApplicationJson = GetDriversLicenseResponseSchema
ResponseHeadersFor200 = typing_extensions.TypedDict(
    'ResponseHeadersFor200',
    {
        'Access-Control-Allow-Origin': AccessControlAllowOriginSchema,
        'x-moesif-transaction-id': XMoesifTransactionIdSchema,
        'service': ServiceSchema,
        'product': ProductSchema,
        'ETag': ETagSchema,
        'Vary': VarySchema,
        'Content-Encoding': ContentEncodingSchema,
        'Date': DateSchema,
        'Connection': ConnectionSchema,
        'Keep-Alive': KeepAliveSchema,
        'Transfer-Encoding': TransferEncodingSchema,
    }
)


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: GetDriversLicenseResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: GetDriversLicenseResponse


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
    headers=[
        access_control_allow_origin_parameter,
        x_moesif_transaction_id_parameter,
        service_parameter,
        product_parameter,
        e_tag_parameter,
        vary_parameter,
        content_encoding_parameter,
        date_parameter,
        connection_parameter,
        keep_alive_parameter,
        transfer_encoding_parameter,
    ]
)
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _get_drivers_license_mapped_args(
        self,
        id: typing.Optional[str] = None,
        full_name: typing.Optional[str] = None,
        date_of_birth: typing.Optional[str] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _query_params = {}
        if id is not None:
            _query_params["id"] = id
        if full_name is not None:
            _query_params["full_name"] = full_name
        if date_of_birth is not None:
            _query_params["date_of_birth"] = date_of_birth
        args.query = _query_params
        return args

    async def _aget_drivers_license_oapg(
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
        Driver&#x27;s License
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_id,
            request_query_full_name,
            request_query_date_of_birth,
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
    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method='get'.upper(),
            headers=_headers,
            auth_settings=_auth,
            prefix_separator_iterator=prefix_separator_iterator,
            timeout=timeout,
        )
        
        if stream:
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

    def _get_drivers_license_oapg(
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
        Driver&#x27;s License
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_id,
            request_query_full_name,
            request_query_date_of_birth,
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
    
        response = self.api_client.call_api(
            resource_path=used_path,
            method='get'.upper(),
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

class GetDriversLicense(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def aget_drivers_license(
        self,
        id: typing.Optional[str] = None,
        full_name: typing.Optional[str] = None,
        date_of_birth: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._get_drivers_license_mapped_args(
            id=id,
            full_name=full_name,
            date_of_birth=date_of_birth,
        )
        return await self._aget_drivers_license_oapg(
            query_params=args.query,
        )
    
    def get_drivers_license(
        self,
        id: typing.Optional[str] = None,
        full_name: typing.Optional[str] = None,
        date_of_birth: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._get_drivers_license_mapped_args(
            id=id,
            full_name=full_name,
            date_of_birth=date_of_birth,
        )
        return self._get_drivers_license_oapg(
            query_params=args.query,
        )

class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aget(
        self,
        id: typing.Optional[str] = None,
        full_name: typing.Optional[str] = None,
        date_of_birth: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._get_drivers_license_mapped_args(
            id=id,
            full_name=full_name,
            date_of_birth=date_of_birth,
        )
        return await self._aget_drivers_license_oapg(
            query_params=args.query,
        )
    
    def get(
        self,
        id: typing.Optional[str] = None,
        full_name: typing.Optional[str] = None,
        date_of_birth: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._get_drivers_license_mapped_args(
            id=id,
            full_name=full_name,
            date_of_birth=date_of_birth,
        )
        return self._get_drivers_license_oapg(
            query_params=args.query,
        )

