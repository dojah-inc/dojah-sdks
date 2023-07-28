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

from dojah_client.type.get_basic_bvn_response_entity import GetBasicBvnResponseEntity

class RequiredGetBasicBvnResponse(TypedDict):
    pass

class OptionalGetBasicBvnResponse(TypedDict, total=False):
    entity: GetBasicBvnResponseEntity

class GetBasicBvnResponse(RequiredGetBasicBvnResponse, OptionalGetBasicBvnResponse):
    pass