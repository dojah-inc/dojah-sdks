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


class FraudScreenUserResponseEntityPhoneCheckResult(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            number = schemas.NumberSchema
            valid = schemas.BoolSchema
            disposable = schemas.BoolSchema
            type = schemas.StrSchema
            country = schemas.StrSchema
            carrier = schemas.StrSchema
            score = schemas.NumberSchema
        
            @staticmethod
            def account_details_registered() -> typing.Type['FraudScreenUserResponseEntityPhoneCheckResultAccountDetailsRegistered']:
                return FraudScreenUserResponseEntityPhoneCheckResultAccountDetailsRegistered
            __annotations__ = {
                "number": number,
                "valid": valid,
                "disposable": disposable,
                "type": type,
                "country": country,
                "carrier": carrier,
                "score": score,
                "account_details_registered": account_details_registered,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> MetaOapg.properties.number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["valid"]) -> MetaOapg.properties.valid: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["disposable"]) -> MetaOapg.properties.disposable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["country"]) -> MetaOapg.properties.country: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["carrier"]) -> MetaOapg.properties.carrier: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["score"]) -> MetaOapg.properties.score: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account_details_registered"]) -> 'FraudScreenUserResponseEntityPhoneCheckResultAccountDetailsRegistered': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["number", "valid", "disposable", "type", "country", "carrier", "score", "account_details_registered", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number"]) -> typing.Union[MetaOapg.properties.number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["valid"]) -> typing.Union[MetaOapg.properties.valid, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["disposable"]) -> typing.Union[MetaOapg.properties.disposable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> typing.Union[MetaOapg.properties.type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["country"]) -> typing.Union[MetaOapg.properties.country, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["carrier"]) -> typing.Union[MetaOapg.properties.carrier, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["score"]) -> typing.Union[MetaOapg.properties.score, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account_details_registered"]) -> typing.Union['FraudScreenUserResponseEntityPhoneCheckResultAccountDetailsRegistered', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["number", "valid", "disposable", "type", "country", "carrier", "score", "account_details_registered", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        number: typing.Union[MetaOapg.properties.number, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        valid: typing.Union[MetaOapg.properties.valid, bool, schemas.Unset] = schemas.unset,
        disposable: typing.Union[MetaOapg.properties.disposable, bool, schemas.Unset] = schemas.unset,
        type: typing.Union[MetaOapg.properties.type, str, schemas.Unset] = schemas.unset,
        country: typing.Union[MetaOapg.properties.country, str, schemas.Unset] = schemas.unset,
        carrier: typing.Union[MetaOapg.properties.carrier, str, schemas.Unset] = schemas.unset,
        score: typing.Union[MetaOapg.properties.score, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        account_details_registered: typing.Union['FraudScreenUserResponseEntityPhoneCheckResultAccountDetailsRegistered', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'FraudScreenUserResponseEntityPhoneCheckResult':
        return super().__new__(
            cls,
            *args,
            number=number,
            valid=valid,
            disposable=disposable,
            type=type,
            country=country,
            carrier=carrier,
            score=score,
            account_details_registered=account_details_registered,
            _configuration=_configuration,
            **kwargs,
        )

from dojah_client.model.fraud_screen_user_response_entity_phone_check_result_account_details_registered import FraudScreenUserResponseEntityPhoneCheckResultAccountDetailsRegistered
