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


class RequiredGetNubanResponseEntity(TypedDict):
    pass

class OptionalGetNubanResponseEntity(TypedDict, total=False):
    account_currency: str

    account_name: str

    account_number: str

    account_type: str

    address_1: str

    address_2: str

    city: str

    country_code: str

    country_of_birth: str

    country_of_issue: str

    dob: str

    expiry_date: str

    first_name: str

    identity_number: str

    identity_type: str

    last_name: str

    nationality: str

    other_names: str

    phone: str

    postal_code: str

    reference: str

    state_code: str

class GetNubanResponseEntity(RequiredGetNubanResponseEntity, OptionalGetNubanResponseEntity):
    pass