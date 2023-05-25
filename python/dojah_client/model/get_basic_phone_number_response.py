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


class GetBasicPhoneNumberResponse(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            
            
            class entity(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    
                    class properties:
                        msisdn = schemas.StrSchema
                        firstName = schemas.StrSchema
                        lastName = schemas.StrSchema
                        email = schemas.StrSchema
                        encryptedPan = schemas.StrSchema
                        dateOfBirth = schemas.StrSchema
                        bvn = schemas.StrSchema
                        address = schemas.StrSchema
                        address_city = schemas.StrSchema
                        address_state = schemas.StrSchema
                        account_number = schemas.StrSchema
                        bank_code = schemas.StrSchema
                        gender = schemas.StrSchema
                        __annotations__ = {
                            "msisdn": msisdn,
                            "firstName": firstName,
                            "lastName": lastName,
                            "email": email,
                            "encryptedPan": encryptedPan,
                            "dateOfBirth": dateOfBirth,
                            "bvn": bvn,
                            "address": address,
                            "address_city": address_city,
                            "address_state": address_state,
                            "account_number": account_number,
                            "bank_code": bank_code,
                            "gender": gender,
                        }
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["msisdn"]) -> MetaOapg.properties.msisdn: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["firstName"]) -> MetaOapg.properties.firstName: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["lastName"]) -> MetaOapg.properties.lastName: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["email"]) -> MetaOapg.properties.email: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["encryptedPan"]) -> MetaOapg.properties.encryptedPan: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["dateOfBirth"]) -> MetaOapg.properties.dateOfBirth: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["bvn"]) -> MetaOapg.properties.bvn: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["address"]) -> MetaOapg.properties.address: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["address_city"]) -> MetaOapg.properties.address_city: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["address_state"]) -> MetaOapg.properties.address_state: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["account_number"]) -> MetaOapg.properties.account_number: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["bank_code"]) -> MetaOapg.properties.bank_code: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["gender"]) -> MetaOapg.properties.gender: ...
                
                @typing.overload
                def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
                
                def __getitem__(self, name: typing.Union[typing_extensions.Literal["msisdn", "firstName", "lastName", "email", "encryptedPan", "dateOfBirth", "bvn", "address", "address_city", "address_state", "account_number", "bank_code", "gender", ], str]):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["msisdn"]) -> typing.Union[MetaOapg.properties.msisdn, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["firstName"]) -> typing.Union[MetaOapg.properties.firstName, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["lastName"]) -> typing.Union[MetaOapg.properties.lastName, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["email"]) -> typing.Union[MetaOapg.properties.email, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["encryptedPan"]) -> typing.Union[MetaOapg.properties.encryptedPan, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["dateOfBirth"]) -> typing.Union[MetaOapg.properties.dateOfBirth, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["bvn"]) -> typing.Union[MetaOapg.properties.bvn, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["address"]) -> typing.Union[MetaOapg.properties.address, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["address_city"]) -> typing.Union[MetaOapg.properties.address_city, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["address_state"]) -> typing.Union[MetaOapg.properties.address_state, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["account_number"]) -> typing.Union[MetaOapg.properties.account_number, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["bank_code"]) -> typing.Union[MetaOapg.properties.bank_code, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["gender"]) -> typing.Union[MetaOapg.properties.gender, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
                
                def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["msisdn", "firstName", "lastName", "email", "encryptedPan", "dateOfBirth", "bvn", "address", "address_city", "address_state", "account_number", "bank_code", "gender", ], str]):
                    return super().get_item_oapg(name)
                
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    msisdn: typing.Union[MetaOapg.properties.msisdn, str, schemas.Unset] = schemas.unset,
                    firstName: typing.Union[MetaOapg.properties.firstName, str, schemas.Unset] = schemas.unset,
                    lastName: typing.Union[MetaOapg.properties.lastName, str, schemas.Unset] = schemas.unset,
                    email: typing.Union[MetaOapg.properties.email, str, schemas.Unset] = schemas.unset,
                    encryptedPan: typing.Union[MetaOapg.properties.encryptedPan, str, schemas.Unset] = schemas.unset,
                    dateOfBirth: typing.Union[MetaOapg.properties.dateOfBirth, str, schemas.Unset] = schemas.unset,
                    bvn: typing.Union[MetaOapg.properties.bvn, str, schemas.Unset] = schemas.unset,
                    address: typing.Union[MetaOapg.properties.address, str, schemas.Unset] = schemas.unset,
                    address_city: typing.Union[MetaOapg.properties.address_city, str, schemas.Unset] = schemas.unset,
                    address_state: typing.Union[MetaOapg.properties.address_state, str, schemas.Unset] = schemas.unset,
                    account_number: typing.Union[MetaOapg.properties.account_number, str, schemas.Unset] = schemas.unset,
                    bank_code: typing.Union[MetaOapg.properties.bank_code, str, schemas.Unset] = schemas.unset,
                    gender: typing.Union[MetaOapg.properties.gender, str, schemas.Unset] = schemas.unset,
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'entity':
                    return super().__new__(
                        cls,
                        *args,
                        msisdn=msisdn,
                        firstName=firstName,
                        lastName=lastName,
                        email=email,
                        encryptedPan=encryptedPan,
                        dateOfBirth=dateOfBirth,
                        bvn=bvn,
                        address=address,
                        address_city=address_city,
                        address_state=address_state,
                        account_number=account_number,
                        bank_code=bank_code,
                        gender=gender,
                        _configuration=_configuration,
                        **kwargs,
                    )
            __annotations__ = {
                "entity": entity,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["entity"]) -> MetaOapg.properties.entity: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["entity", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["entity"]) -> typing.Union[MetaOapg.properties.entity, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["entity", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        entity: typing.Union[MetaOapg.properties.entity, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'GetBasicPhoneNumberResponse':
        return super().__new__(
            cls,
            *args,
            entity=entity,
            _configuration=_configuration,
            **kwargs,
        )
