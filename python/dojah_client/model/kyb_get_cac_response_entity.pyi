# coding: utf-8

"""
    DOJAH Publilc APIs

    Use Dojah to verify, onboard and manage user identity across Africa!

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

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


class KybGetCacResponseEntity(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            rc_number = schemas.StrSchema
            company_name = schemas.StrSchema
            address = schemas.StrSchema
            date_of_registration = schemas.StrSchema
            __annotations__ = {
                "rc_number": rc_number,
                "company_name": company_name,
                "address": address,
                "date_of_registration": date_of_registration,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["rc_number"]) -> MetaOapg.properties.rc_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["company_name"]) -> MetaOapg.properties.company_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["address"]) -> MetaOapg.properties.address: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_of_registration"]) -> MetaOapg.properties.date_of_registration: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["rc_number", "company_name", "address", "date_of_registration", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["rc_number"]) -> typing.Union[MetaOapg.properties.rc_number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["company_name"]) -> typing.Union[MetaOapg.properties.company_name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["address"]) -> typing.Union[MetaOapg.properties.address, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_of_registration"]) -> typing.Union[MetaOapg.properties.date_of_registration, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["rc_number", "company_name", "address", "date_of_registration", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        rc_number: typing.Union[MetaOapg.properties.rc_number, str, schemas.Unset] = schemas.unset,
        company_name: typing.Union[MetaOapg.properties.company_name, str, schemas.Unset] = schemas.unset,
        address: typing.Union[MetaOapg.properties.address, str, schemas.Unset] = schemas.unset,
        date_of_registration: typing.Union[MetaOapg.properties.date_of_registration, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'KybGetCacResponseEntity':
        return super().__new__(
            cls,
            *args,
            rc_number=rc_number,
            company_name=company_name,
            address=address,
            date_of_registration=date_of_registration,
            _configuration=_configuration,
            **kwargs,
        )
