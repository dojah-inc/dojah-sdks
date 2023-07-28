# coding: utf-8

"""
    DOJAH Publilc APIs

    Use Dojah to verify, onboard and manage user identity across Africa!

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal


class RequiredGetPremiumBvnResponseEntity(TypedDict):
    pass

class OptionalGetPremiumBvnResponseEntity(TypedDict, total=False):
    title: str

    bvn: str

    date_of_birth: str

    email: str

    enrollment_bank: str

    enrollment_branch: str

    first_name: str

    gender: str

    image: str

    last_name: str

    level_of_account: str

    lga_of_origin: str

    lga_of_residence: str

    marital_status: str

    middle_name: str

    name_on_card: str

    nationality: str

    nin: str

    phone_number1: str

    phone_number2: str

    registration_date: str

    residential_address: str

    state_of_origin: str

    state_of_residence: str

    status: typing.Union[int, float]

    watch_listed: str

class GetPremiumBvnResponseEntity(RequiredGetPremiumBvnResponseEntity, OptionalGetPremiumBvnResponseEntity):
    pass