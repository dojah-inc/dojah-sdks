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


class GetNubanResponseEntity(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            account_currency = schemas.StrSchema
            account_name = schemas.StrSchema
            account_number = schemas.StrSchema
            account_type = schemas.StrSchema
            address_1 = schemas.StrSchema
            address_2 = schemas.StrSchema
            city = schemas.StrSchema
            country_code = schemas.StrSchema
            country_of_birth = schemas.StrSchema
            country_of_issue = schemas.StrSchema
            dob = schemas.StrSchema
            expiry_date = schemas.StrSchema
            first_name = schemas.StrSchema
            identity_number = schemas.StrSchema
            identity_type = schemas.StrSchema
            last_name = schemas.StrSchema
            nationality = schemas.StrSchema
            other_names = schemas.StrSchema
            phone = schemas.StrSchema
            postal_code = schemas.StrSchema
            reference = schemas.StrSchema
            state_code = schemas.StrSchema
            __annotations__ = {
                "account_currency": account_currency,
                "account_name": account_name,
                "account_number": account_number,
                "account_type": account_type,
                "address_1": address_1,
                "address_2": address_2,
                "city": city,
                "country_code": country_code,
                "country_of_birth": country_of_birth,
                "country_of_issue": country_of_issue,
                "dob": dob,
                "expiry_date": expiry_date,
                "first_name": first_name,
                "identity_number": identity_number,
                "identity_type": identity_type,
                "last_name": last_name,
                "nationality": nationality,
                "other_names": other_names,
                "phone": phone,
                "postal_code": postal_code,
                "reference": reference,
                "state_code": state_code,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account_currency"]) -> MetaOapg.properties.account_currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account_name"]) -> MetaOapg.properties.account_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account_number"]) -> MetaOapg.properties.account_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account_type"]) -> MetaOapg.properties.account_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["address_1"]) -> MetaOapg.properties.address_1: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["address_2"]) -> MetaOapg.properties.address_2: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["city"]) -> MetaOapg.properties.city: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["country_code"]) -> MetaOapg.properties.country_code: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["country_of_birth"]) -> MetaOapg.properties.country_of_birth: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["country_of_issue"]) -> MetaOapg.properties.country_of_issue: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dob"]) -> MetaOapg.properties.dob: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["expiry_date"]) -> MetaOapg.properties.expiry_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["first_name"]) -> MetaOapg.properties.first_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["identity_number"]) -> MetaOapg.properties.identity_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["identity_type"]) -> MetaOapg.properties.identity_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_name"]) -> MetaOapg.properties.last_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["nationality"]) -> MetaOapg.properties.nationality: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["other_names"]) -> MetaOapg.properties.other_names: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phone"]) -> MetaOapg.properties.phone: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["postal_code"]) -> MetaOapg.properties.postal_code: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["reference"]) -> MetaOapg.properties.reference: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["state_code"]) -> MetaOapg.properties.state_code: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["account_currency", "account_name", "account_number", "account_type", "address_1", "address_2", "city", "country_code", "country_of_birth", "country_of_issue", "dob", "expiry_date", "first_name", "identity_number", "identity_type", "last_name", "nationality", "other_names", "phone", "postal_code", "reference", "state_code", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account_currency"]) -> typing.Union[MetaOapg.properties.account_currency, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account_name"]) -> typing.Union[MetaOapg.properties.account_name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account_number"]) -> typing.Union[MetaOapg.properties.account_number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account_type"]) -> typing.Union[MetaOapg.properties.account_type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["address_1"]) -> typing.Union[MetaOapg.properties.address_1, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["address_2"]) -> typing.Union[MetaOapg.properties.address_2, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["city"]) -> typing.Union[MetaOapg.properties.city, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["country_code"]) -> typing.Union[MetaOapg.properties.country_code, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["country_of_birth"]) -> typing.Union[MetaOapg.properties.country_of_birth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["country_of_issue"]) -> typing.Union[MetaOapg.properties.country_of_issue, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["dob"]) -> typing.Union[MetaOapg.properties.dob, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["expiry_date"]) -> typing.Union[MetaOapg.properties.expiry_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["first_name"]) -> typing.Union[MetaOapg.properties.first_name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["identity_number"]) -> typing.Union[MetaOapg.properties.identity_number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["identity_type"]) -> typing.Union[MetaOapg.properties.identity_type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_name"]) -> typing.Union[MetaOapg.properties.last_name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["nationality"]) -> typing.Union[MetaOapg.properties.nationality, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["other_names"]) -> typing.Union[MetaOapg.properties.other_names, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["phone"]) -> typing.Union[MetaOapg.properties.phone, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["postal_code"]) -> typing.Union[MetaOapg.properties.postal_code, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["reference"]) -> typing.Union[MetaOapg.properties.reference, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["state_code"]) -> typing.Union[MetaOapg.properties.state_code, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["account_currency", "account_name", "account_number", "account_type", "address_1", "address_2", "city", "country_code", "country_of_birth", "country_of_issue", "dob", "expiry_date", "first_name", "identity_number", "identity_type", "last_name", "nationality", "other_names", "phone", "postal_code", "reference", "state_code", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        account_currency: typing.Union[MetaOapg.properties.account_currency, str, schemas.Unset] = schemas.unset,
        account_name: typing.Union[MetaOapg.properties.account_name, str, schemas.Unset] = schemas.unset,
        account_number: typing.Union[MetaOapg.properties.account_number, str, schemas.Unset] = schemas.unset,
        account_type: typing.Union[MetaOapg.properties.account_type, str, schemas.Unset] = schemas.unset,
        address_1: typing.Union[MetaOapg.properties.address_1, str, schemas.Unset] = schemas.unset,
        address_2: typing.Union[MetaOapg.properties.address_2, str, schemas.Unset] = schemas.unset,
        city: typing.Union[MetaOapg.properties.city, str, schemas.Unset] = schemas.unset,
        country_code: typing.Union[MetaOapg.properties.country_code, str, schemas.Unset] = schemas.unset,
        country_of_birth: typing.Union[MetaOapg.properties.country_of_birth, str, schemas.Unset] = schemas.unset,
        country_of_issue: typing.Union[MetaOapg.properties.country_of_issue, str, schemas.Unset] = schemas.unset,
        dob: typing.Union[MetaOapg.properties.dob, str, schemas.Unset] = schemas.unset,
        expiry_date: typing.Union[MetaOapg.properties.expiry_date, str, schemas.Unset] = schemas.unset,
        first_name: typing.Union[MetaOapg.properties.first_name, str, schemas.Unset] = schemas.unset,
        identity_number: typing.Union[MetaOapg.properties.identity_number, str, schemas.Unset] = schemas.unset,
        identity_type: typing.Union[MetaOapg.properties.identity_type, str, schemas.Unset] = schemas.unset,
        last_name: typing.Union[MetaOapg.properties.last_name, str, schemas.Unset] = schemas.unset,
        nationality: typing.Union[MetaOapg.properties.nationality, str, schemas.Unset] = schemas.unset,
        other_names: typing.Union[MetaOapg.properties.other_names, str, schemas.Unset] = schemas.unset,
        phone: typing.Union[MetaOapg.properties.phone, str, schemas.Unset] = schemas.unset,
        postal_code: typing.Union[MetaOapg.properties.postal_code, str, schemas.Unset] = schemas.unset,
        reference: typing.Union[MetaOapg.properties.reference, str, schemas.Unset] = schemas.unset,
        state_code: typing.Union[MetaOapg.properties.state_code, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'GetNubanResponseEntity':
        return super().__new__(
            cls,
            *args,
            account_currency=account_currency,
            account_name=account_name,
            account_number=account_number,
            account_type=account_type,
            address_1=address_1,
            address_2=address_2,
            city=city,
            country_code=country_code,
            country_of_birth=country_of_birth,
            country_of_issue=country_of_issue,
            dob=dob,
            expiry_date=expiry_date,
            first_name=first_name,
            identity_number=identity_number,
            identity_type=identity_type,
            last_name=last_name,
            nationality=nationality,
            other_names=other_names,
            phone=phone,
            postal_code=postal_code,
            reference=reference,
            state_code=state_code,
            _configuration=_configuration,
            **kwargs,
        )
