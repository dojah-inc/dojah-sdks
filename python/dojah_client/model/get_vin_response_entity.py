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


class GetVinResponseEntity(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            full_name = schemas.StrSchema
            voter_identification_number = schemas.StrSchema
            gender = schemas.StrSchema
            occupation = schemas.StrSchema
            time_of_registration = schemas.StrSchema
            state = schemas.StrSchema
            local_government = schemas.StrSchema
            registration_area_ward = schemas.StrSchema
            polling_unit = schemas.StrSchema
            polling_unit_code = schemas.StrSchema
            __annotations__ = {
                "full_name": full_name,
                "voter_identification_number:": voter_identification_number,
                "gender:": gender,
                "occupation:": occupation,
                "time_of_registration:": time_of_registration,
                "state:": state,
                "local_government:": local_government,
                "registration_area_ward:": registration_area_ward,
                "polling_unit:": polling_unit,
                "polling_unit_code": polling_unit_code,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["full_name"]) -> MetaOapg.properties.full_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["voter_identification_number:"]) -> MetaOapg.properties.voter_identification_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["gender:"]) -> MetaOapg.properties.gender: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["occupation:"]) -> MetaOapg.properties.occupation: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["time_of_registration:"]) -> MetaOapg.properties.time_of_registration: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["state:"]) -> MetaOapg.properties.state: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["local_government:"]) -> MetaOapg.properties.local_government: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["registration_area_ward:"]) -> MetaOapg.properties.registration_area_ward: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["polling_unit:"]) -> MetaOapg.properties.polling_unit: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["polling_unit_code"]) -> MetaOapg.properties.polling_unit_code: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["full_name", "voter_identification_number:", "gender:", "occupation:", "time_of_registration:", "state:", "local_government:", "registration_area_ward:", "polling_unit:", "polling_unit_code", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["full_name"]) -> typing.Union[MetaOapg.properties.full_name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["voter_identification_number:"]) -> typing.Union[MetaOapg.properties.voter_identification_number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["gender:"]) -> typing.Union[MetaOapg.properties.gender, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["occupation:"]) -> typing.Union[MetaOapg.properties.occupation, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["time_of_registration:"]) -> typing.Union[MetaOapg.properties.time_of_registration, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["state:"]) -> typing.Union[MetaOapg.properties.state, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["local_government:"]) -> typing.Union[MetaOapg.properties.local_government, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["registration_area_ward:"]) -> typing.Union[MetaOapg.properties.registration_area_ward, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["polling_unit:"]) -> typing.Union[MetaOapg.properties.polling_unit, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["polling_unit_code"]) -> typing.Union[MetaOapg.properties.polling_unit_code, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["full_name", "voter_identification_number:", "gender:", "occupation:", "time_of_registration:", "state:", "local_government:", "registration_area_ward:", "polling_unit:", "polling_unit_code", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        full_name: typing.Union[MetaOapg.properties.full_name, str, schemas.Unset] = schemas.unset,
        polling_unit_code: typing.Union[MetaOapg.properties.polling_unit_code, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'GetVinResponseEntity':
        return super().__new__(
            cls,
            *args,
            full_name=full_name,
            polling_unit_code=polling_unit_code,
            _configuration=_configuration,
            **kwargs,
        )
