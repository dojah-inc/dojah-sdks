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


class AnalyzeDocumentResponseEntity(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
        
            @staticmethod
            def document_images() -> typing.Type['AnalyzeDocumentResponseEntityDocumentImages']:
                return AnalyzeDocumentResponseEntityDocumentImages
        
            @staticmethod
            def document_type() -> typing.Type['AnalyzeDocumentResponseEntityDocumentType']:
                return AnalyzeDocumentResponseEntityDocumentType
        
            @staticmethod
            def status() -> typing.Type['AnalyzeDocumentResponseEntityStatus']:
                return AnalyzeDocumentResponseEntityStatus
        
            @staticmethod
            def text_data() -> typing.Type['AnalyzeDocumentResponseEntityTextData']:
                return AnalyzeDocumentResponseEntityTextData
            __annotations__ = {
                "document_images": document_images,
                "document_type": document_type,
                "status": status,
                "text_data": text_data,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["document_images"]) -> 'AnalyzeDocumentResponseEntityDocumentImages': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["document_type"]) -> 'AnalyzeDocumentResponseEntityDocumentType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> 'AnalyzeDocumentResponseEntityStatus': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["text_data"]) -> 'AnalyzeDocumentResponseEntityTextData': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["document_images", "document_type", "status", "text_data", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["document_images"]) -> typing.Union['AnalyzeDocumentResponseEntityDocumentImages', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["document_type"]) -> typing.Union['AnalyzeDocumentResponseEntityDocumentType', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> typing.Union['AnalyzeDocumentResponseEntityStatus', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["text_data"]) -> typing.Union['AnalyzeDocumentResponseEntityTextData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["document_images", "document_type", "status", "text_data", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        document_images: typing.Union['AnalyzeDocumentResponseEntityDocumentImages', schemas.Unset] = schemas.unset,
        document_type: typing.Union['AnalyzeDocumentResponseEntityDocumentType', schemas.Unset] = schemas.unset,
        status: typing.Union['AnalyzeDocumentResponseEntityStatus', schemas.Unset] = schemas.unset,
        text_data: typing.Union['AnalyzeDocumentResponseEntityTextData', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'AnalyzeDocumentResponseEntity':
        return super().__new__(
            cls,
            *args,
            document_images=document_images,
            document_type=document_type,
            status=status,
            text_data=text_data,
            _configuration=_configuration,
            **kwargs,
        )

from dojah_client.model.analyze_document_response_entity_document_images import AnalyzeDocumentResponseEntityDocumentImages
from dojah_client.model.analyze_document_response_entity_document_type import AnalyzeDocumentResponseEntityDocumentType
from dojah_client.model.analyze_document_response_entity_status import AnalyzeDocumentResponseEntityStatus
from dojah_client.model.analyze_document_response_entity_text_data import AnalyzeDocumentResponseEntityTextData