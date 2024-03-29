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


class RequiredValidateBvnResponseEntityFirstName(TypedDict):
    pass

class OptionalValidateBvnResponseEntityFirstName(TypedDict, total=False):
    confidence_value: typing.Union[int, float]

    status: bool

class ValidateBvnResponseEntityFirstName(RequiredValidateBvnResponseEntityFirstName, OptionalValidateBvnResponseEntityFirstName):
    pass
