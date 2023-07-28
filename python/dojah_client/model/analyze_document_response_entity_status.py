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


class AnalyzeDocumentResponseEntityStatus(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            document_images = schemas.StrSchema
            document_type = schemas.StrSchema
            expiry = schemas.StrSchema
            overall_status = schemas.NumberSchema
            text = schemas.StrSchema
            __annotations__ = {
                "document_images": document_images,
                "document_type": document_type,
                "expiry": expiry,
                "overall_status": overall_status,
                "text": text,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["document_images"]) -> MetaOapg.properties.document_images: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["document_type"]) -> MetaOapg.properties.document_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["expiry"]) -> MetaOapg.properties.expiry: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["overall_status"]) -> MetaOapg.properties.overall_status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["text"]) -> MetaOapg.properties.text: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["document_images", "document_type", "expiry", "overall_status", "text", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["document_images"]) -> typing.Union[MetaOapg.properties.document_images, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["document_type"]) -> typing.Union[MetaOapg.properties.document_type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["expiry"]) -> typing.Union[MetaOapg.properties.expiry, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["overall_status"]) -> typing.Union[MetaOapg.properties.overall_status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["text"]) -> typing.Union[MetaOapg.properties.text, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["document_images", "document_type", "expiry", "overall_status", "text", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        document_images: typing.Union[MetaOapg.properties.document_images, str, schemas.Unset] = schemas.unset,
        document_type: typing.Union[MetaOapg.properties.document_type, str, schemas.Unset] = schemas.unset,
        expiry: typing.Union[MetaOapg.properties.expiry, str, schemas.Unset] = schemas.unset,
        overall_status: typing.Union[MetaOapg.properties.overall_status, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        text: typing.Union[MetaOapg.properties.text, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'AnalyzeDocumentResponseEntityStatus':
        return super().__new__(
            cls,
            *args,
            document_images=document_images,
            document_type=document_type,
            expiry=expiry,
            overall_status=overall_status,
            text=text,
            _configuration=_configuration,
            **kwargs,
        )
