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

from dojah_client.type.get_ssnit_response_entity import GetSsnitResponseEntity

class RequiredGetSsnitResponse(TypedDict):
    pass

class OptionalGetSsnitResponse(TypedDict, total=False):
    entity: GetSsnitResponseEntity

class GetSsnitResponse(RequiredGetSsnitResponse, OptionalGetSsnitResponse):
    pass
