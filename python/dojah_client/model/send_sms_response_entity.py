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


class SendSmsResponseEntity(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            status = schemas.BoolSchema
            mobile = schemas.StrSchema
            message_id = schemas.StrSchema
            batch_id = schemas.StrSchema
            __annotations__ = {
                "status": status,
                "mobile": mobile,
                "message_id": message_id,
                "batch_id": batch_id,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["mobile"]) -> MetaOapg.properties.mobile: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["message_id"]) -> MetaOapg.properties.message_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["batch_id"]) -> MetaOapg.properties.batch_id: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["status", "mobile", "message_id", "batch_id", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> typing.Union[MetaOapg.properties.status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["mobile"]) -> typing.Union[MetaOapg.properties.mobile, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["message_id"]) -> typing.Union[MetaOapg.properties.message_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["batch_id"]) -> typing.Union[MetaOapg.properties.batch_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["status", "mobile", "message_id", "batch_id", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        status: typing.Union[MetaOapg.properties.status, bool, schemas.Unset] = schemas.unset,
        mobile: typing.Union[MetaOapg.properties.mobile, str, schemas.Unset] = schemas.unset,
        message_id: typing.Union[MetaOapg.properties.message_id, str, schemas.Unset] = schemas.unset,
        batch_id: typing.Union[MetaOapg.properties.batch_id, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'SendSmsResponseEntity':
        return super().__new__(
            cls,
            *args,
            status=status,
            mobile=mobile,
            message_id=message_id,
            batch_id=batch_id,
            _configuration=_configuration,
            **kwargs,
        )
