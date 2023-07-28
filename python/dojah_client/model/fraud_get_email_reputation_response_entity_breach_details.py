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


class FraudGetEmailReputationResponseEntityBreachDetails(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            haveibeenpwned_listed = schemas.BoolSchema
            number_of_breaches = schemas.NumberSchema
            
            
            class first_breach(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'first_breach':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def breaches() -> typing.Type['FraudGetEmailReputationResponseEntityBreachDetailsBreaches']:
                return FraudGetEmailReputationResponseEntityBreachDetailsBreaches
            __annotations__ = {
                "haveibeenpwned_listed": haveibeenpwned_listed,
                "number_of_breaches": number_of_breaches,
                "first_breach": first_breach,
                "breaches": breaches,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["haveibeenpwned_listed"]) -> MetaOapg.properties.haveibeenpwned_listed: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_of_breaches"]) -> MetaOapg.properties.number_of_breaches: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["first_breach"]) -> MetaOapg.properties.first_breach: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["breaches"]) -> 'FraudGetEmailReputationResponseEntityBreachDetailsBreaches': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["haveibeenpwned_listed", "number_of_breaches", "first_breach", "breaches", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["haveibeenpwned_listed"]) -> typing.Union[MetaOapg.properties.haveibeenpwned_listed, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number_of_breaches"]) -> typing.Union[MetaOapg.properties.number_of_breaches, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["first_breach"]) -> typing.Union[MetaOapg.properties.first_breach, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["breaches"]) -> typing.Union['FraudGetEmailReputationResponseEntityBreachDetailsBreaches', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["haveibeenpwned_listed", "number_of_breaches", "first_breach", "breaches", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        haveibeenpwned_listed: typing.Union[MetaOapg.properties.haveibeenpwned_listed, bool, schemas.Unset] = schemas.unset,
        number_of_breaches: typing.Union[MetaOapg.properties.number_of_breaches, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        first_breach: typing.Union[MetaOapg.properties.first_breach, None, str, schemas.Unset] = schemas.unset,
        breaches: typing.Union['FraudGetEmailReputationResponseEntityBreachDetailsBreaches', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'FraudGetEmailReputationResponseEntityBreachDetails':
        return super().__new__(
            cls,
            *args,
            haveibeenpwned_listed=haveibeenpwned_listed,
            number_of_breaches=number_of_breaches,
            first_breach=first_breach,
            breaches=breaches,
            _configuration=_configuration,
            **kwargs,
        )

from dojah_client.model.fraud_get_email_reputation_response_entity_breach_details_breaches import FraudGetEmailReputationResponseEntityBreachDetailsBreaches