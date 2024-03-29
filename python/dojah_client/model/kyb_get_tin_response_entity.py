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


class KybGetTinResponseEntity(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            Search = schemas.StrSchema
            Taxpayer_Name = schemas.StrSchema
            CAC_Reg_No = schemas.StrSchema
            FIRSTIN = schemas.StrSchema
            JITTIN = schemas.StrSchema
            Tax_Office = schemas.StrSchema
            Phone_No = schemas.StrSchema
            Email = schemas.StrSchema
            __annotations__ = {
                "Search": Search,
                "Taxpayer_Name": Taxpayer_Name,
                "CAC_Reg_No": CAC_Reg_No,
                "FIRSTIN": FIRSTIN,
                "JITTIN": JITTIN,
                "Tax_Office": Tax_Office,
                "Phone_No": Phone_No,
                "Email": Email,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Search"]) -> MetaOapg.properties.Search: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Taxpayer_Name"]) -> MetaOapg.properties.Taxpayer_Name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["CAC_Reg_No"]) -> MetaOapg.properties.CAC_Reg_No: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["FIRSTIN"]) -> MetaOapg.properties.FIRSTIN: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["JITTIN"]) -> MetaOapg.properties.JITTIN: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Tax_Office"]) -> MetaOapg.properties.Tax_Office: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Phone_No"]) -> MetaOapg.properties.Phone_No: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Email"]) -> MetaOapg.properties.Email: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["Search", "Taxpayer_Name", "CAC_Reg_No", "FIRSTIN", "JITTIN", "Tax_Office", "Phone_No", "Email", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Search"]) -> typing.Union[MetaOapg.properties.Search, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Taxpayer_Name"]) -> typing.Union[MetaOapg.properties.Taxpayer_Name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["CAC_Reg_No"]) -> typing.Union[MetaOapg.properties.CAC_Reg_No, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["FIRSTIN"]) -> typing.Union[MetaOapg.properties.FIRSTIN, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["JITTIN"]) -> typing.Union[MetaOapg.properties.JITTIN, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Tax_Office"]) -> typing.Union[MetaOapg.properties.Tax_Office, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Phone_No"]) -> typing.Union[MetaOapg.properties.Phone_No, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Email"]) -> typing.Union[MetaOapg.properties.Email, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["Search", "Taxpayer_Name", "CAC_Reg_No", "FIRSTIN", "JITTIN", "Tax_Office", "Phone_No", "Email", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        Search: typing.Union[MetaOapg.properties.Search, str, schemas.Unset] = schemas.unset,
        Taxpayer_Name: typing.Union[MetaOapg.properties.Taxpayer_Name, str, schemas.Unset] = schemas.unset,
        CAC_Reg_No: typing.Union[MetaOapg.properties.CAC_Reg_No, str, schemas.Unset] = schemas.unset,
        FIRSTIN: typing.Union[MetaOapg.properties.FIRSTIN, str, schemas.Unset] = schemas.unset,
        JITTIN: typing.Union[MetaOapg.properties.JITTIN, str, schemas.Unset] = schemas.unset,
        Tax_Office: typing.Union[MetaOapg.properties.Tax_Office, str, schemas.Unset] = schemas.unset,
        Phone_No: typing.Union[MetaOapg.properties.Phone_No, str, schemas.Unset] = schemas.unset,
        Email: typing.Union[MetaOapg.properties.Email, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'KybGetTinResponseEntity':
        return super().__new__(
            cls,
            *args,
            Search=Search,
            Taxpayer_Name=Taxpayer_Name,
            CAC_Reg_No=CAC_Reg_No,
            FIRSTIN=FIRSTIN,
            JITTIN=JITTIN,
            Tax_Office=Tax_Office,
            Phone_No=Phone_No,
            Email=Email,
            _configuration=_configuration,
            **kwargs,
        )
