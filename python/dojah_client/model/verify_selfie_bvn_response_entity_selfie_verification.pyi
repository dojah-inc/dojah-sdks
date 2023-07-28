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


class VerifySelfieBvnResponseEntitySelfieVerification(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            confidence_value = schemas.NumberSchema
            match = schemas.BoolSchema
            __annotations__ = {
                "confidence_value": confidence_value,
                "match": match,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["confidence_value"]) -> MetaOapg.properties.confidence_value: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["match"]) -> MetaOapg.properties.match: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["confidence_value", "match", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["confidence_value"]) -> typing.Union[MetaOapg.properties.confidence_value, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["match"]) -> typing.Union[MetaOapg.properties.match, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["confidence_value", "match", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        confidence_value: typing.Union[MetaOapg.properties.confidence_value, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        match: typing.Union[MetaOapg.properties.match, bool, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'VerifySelfieBvnResponseEntitySelfieVerification':
        return super().__new__(
            cls,
            *args,
            confidence_value=confidence_value,
            match=match,
            _configuration=_configuration,
            **kwargs,
        )