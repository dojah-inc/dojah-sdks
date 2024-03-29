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


class KycSubmitAddressResponseEntityData(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
        
            @staticmethod
            def applicant() -> typing.Type['KycSubmitAddressResponseEntityDataApplicant']:
                return KycSubmitAddressResponseEntityDataApplicant
            lattitude = schemas.StrSchema
            longitude = schemas.StrSchema
        
            @staticmethod
            def photos() -> typing.Type['KycSubmitAddressResponseEntityDataPhotos']:
                return KycSubmitAddressResponseEntityDataPhotos
        
            @staticmethod
            def neighbor() -> typing.Type['KycSubmitAddressResponseEntityDataNeighbor']:
                return KycSubmitAddressResponseEntityDataNeighbor
            status = schemas.StrSchema
            city = schemas.StrSchema
            street = schemas.StrSchema
            lga = schemas.StrSchema
            state = schemas.StrSchema
            country = schemas.StrSchema
            __annotations__ = {
                "applicant": applicant,
                "lattitude": lattitude,
                "longitude": longitude,
                "photos": photos,
                "neighbor": neighbor,
                "status": status,
                "city": city,
                "street": street,
                "lga": lga,
                "state": state,
                "country": country,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["applicant"]) -> 'KycSubmitAddressResponseEntityDataApplicant': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lattitude"]) -> MetaOapg.properties.lattitude: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["longitude"]) -> MetaOapg.properties.longitude: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["photos"]) -> 'KycSubmitAddressResponseEntityDataPhotos': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["neighbor"]) -> 'KycSubmitAddressResponseEntityDataNeighbor': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["city"]) -> MetaOapg.properties.city: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["street"]) -> MetaOapg.properties.street: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lga"]) -> MetaOapg.properties.lga: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["state"]) -> MetaOapg.properties.state: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["country"]) -> MetaOapg.properties.country: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["applicant", "lattitude", "longitude", "photos", "neighbor", "status", "city", "street", "lga", "state", "country", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["applicant"]) -> typing.Union['KycSubmitAddressResponseEntityDataApplicant', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lattitude"]) -> typing.Union[MetaOapg.properties.lattitude, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["longitude"]) -> typing.Union[MetaOapg.properties.longitude, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["photos"]) -> typing.Union['KycSubmitAddressResponseEntityDataPhotos', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["neighbor"]) -> typing.Union['KycSubmitAddressResponseEntityDataNeighbor', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> typing.Union[MetaOapg.properties.status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["city"]) -> typing.Union[MetaOapg.properties.city, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["street"]) -> typing.Union[MetaOapg.properties.street, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lga"]) -> typing.Union[MetaOapg.properties.lga, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["state"]) -> typing.Union[MetaOapg.properties.state, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["country"]) -> typing.Union[MetaOapg.properties.country, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["applicant", "lattitude", "longitude", "photos", "neighbor", "status", "city", "street", "lga", "state", "country", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        applicant: typing.Union['KycSubmitAddressResponseEntityDataApplicant', schemas.Unset] = schemas.unset,
        lattitude: typing.Union[MetaOapg.properties.lattitude, str, schemas.Unset] = schemas.unset,
        longitude: typing.Union[MetaOapg.properties.longitude, str, schemas.Unset] = schemas.unset,
        photos: typing.Union['KycSubmitAddressResponseEntityDataPhotos', schemas.Unset] = schemas.unset,
        neighbor: typing.Union['KycSubmitAddressResponseEntityDataNeighbor', schemas.Unset] = schemas.unset,
        status: typing.Union[MetaOapg.properties.status, str, schemas.Unset] = schemas.unset,
        city: typing.Union[MetaOapg.properties.city, str, schemas.Unset] = schemas.unset,
        street: typing.Union[MetaOapg.properties.street, str, schemas.Unset] = schemas.unset,
        lga: typing.Union[MetaOapg.properties.lga, str, schemas.Unset] = schemas.unset,
        state: typing.Union[MetaOapg.properties.state, str, schemas.Unset] = schemas.unset,
        country: typing.Union[MetaOapg.properties.country, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'KycSubmitAddressResponseEntityData':
        return super().__new__(
            cls,
            *args,
            applicant=applicant,
            lattitude=lattitude,
            longitude=longitude,
            photos=photos,
            neighbor=neighbor,
            status=status,
            city=city,
            street=street,
            lga=lga,
            state=state,
            country=country,
            _configuration=_configuration,
            **kwargs,
        )

from dojah_client.model.kyc_submit_address_response_entity_data_applicant import KycSubmitAddressResponseEntityDataApplicant
from dojah_client.model.kyc_submit_address_response_entity_data_neighbor import KycSubmitAddressResponseEntityDataNeighbor
from dojah_client.model.kyc_submit_address_response_entity_data_photos import KycSubmitAddressResponseEntityDataPhotos
