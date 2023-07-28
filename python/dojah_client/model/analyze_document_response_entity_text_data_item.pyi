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


class AnalyzeDocumentResponseEntityTextDataItem(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            field_name = schemas.StrSchema
            field_type = schemas.NumberSchema
            status = schemas.NumberSchema
            value = schemas.StrSchema
            __annotations__ = {
                "field_name": field_name,
                "field_type": field_type,
                "status": status,
                "value": value,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["field_name"]) -> MetaOapg.properties.field_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["field_type"]) -> MetaOapg.properties.field_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["value"]) -> MetaOapg.properties.value: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["field_name", "field_type", "status", "value", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["field_name"]) -> typing.Union[MetaOapg.properties.field_name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["field_type"]) -> typing.Union[MetaOapg.properties.field_type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> typing.Union[MetaOapg.properties.status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["value"]) -> typing.Union[MetaOapg.properties.value, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["field_name", "field_type", "status", "value", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        field_name: typing.Union[MetaOapg.properties.field_name, str, schemas.Unset] = schemas.unset,
        field_type: typing.Union[MetaOapg.properties.field_type, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        status: typing.Union[MetaOapg.properties.status, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        value: typing.Union[MetaOapg.properties.value, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'AnalyzeDocumentResponseEntityTextDataItem':
        return super().__new__(
            cls,
            *args,
            field_name=field_name,
            field_type=field_type,
            status=status,
            value=value,
            _configuration=_configuration,
            **kwargs,
        )