# coding: utf-8

"""
    DOJAH APIs

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


class SendSmsRequest(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            destination = schemas.StrSchema
            message = schemas.StrSchema
            channel = schemas.StrSchema
            sender_id = schemas.StrSchema
            __annotations__ = {
                "destination": destination,
                "message": message,
                "channel": channel,
                "sender_id": sender_id,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["destination"]) -> MetaOapg.properties.destination: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["message"]) -> MetaOapg.properties.message: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["channel"]) -> MetaOapg.properties.channel: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sender_id"]) -> MetaOapg.properties.sender_id: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["destination", "message", "channel", "sender_id", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["destination"]) -> typing.Union[MetaOapg.properties.destination, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["message"]) -> typing.Union[MetaOapg.properties.message, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["channel"]) -> typing.Union[MetaOapg.properties.channel, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sender_id"]) -> typing.Union[MetaOapg.properties.sender_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["destination", "message", "channel", "sender_id", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        destination: typing.Union[MetaOapg.properties.destination, str, schemas.Unset] = schemas.unset,
        message: typing.Union[MetaOapg.properties.message, str, schemas.Unset] = schemas.unset,
        channel: typing.Union[MetaOapg.properties.channel, str, schemas.Unset] = schemas.unset,
        sender_id: typing.Union[MetaOapg.properties.sender_id, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'SendSmsRequest':
        return super().__new__(
            cls,
            *args,
            destination=destination,
            message=message,
            channel=channel,
            sender_id=sender_id,
            _configuration=_configuration,
            **kwargs,
        )
