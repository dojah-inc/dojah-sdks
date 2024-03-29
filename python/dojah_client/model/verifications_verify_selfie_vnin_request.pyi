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


class VerificationsVerifySelfieVninRequest(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            vnin = schemas.StrSchema
            selfie_image = schemas.StrSchema
            __annotations__ = {
                "vnin": vnin,
                "selfie_image": selfie_image,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["vnin"]) -> MetaOapg.properties.vnin: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["selfie_image"]) -> MetaOapg.properties.selfie_image: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["vnin", "selfie_image", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["vnin"]) -> typing.Union[MetaOapg.properties.vnin, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["selfie_image"]) -> typing.Union[MetaOapg.properties.selfie_image, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["vnin", "selfie_image", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        vnin: typing.Union[MetaOapg.properties.vnin, str, schemas.Unset] = schemas.unset,
        selfie_image: typing.Union[MetaOapg.properties.selfie_image, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'VerificationsVerifySelfieVninRequest':
        return super().__new__(
            cls,
            *args,
            vnin=vnin,
            selfie_image=selfie_image,
            _configuration=_configuration,
            **kwargs,
        )
