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


class RequiredRequestSenderIdResponseEntityItem(TypedDict):
    pass

class OptionalRequestSenderIdResponseEntityItem(TypedDict, total=False):
    activated: bool

    createdAt: str

    sender_id: str

class RequestSenderIdResponseEntityItem(RequiredRequestSenderIdResponseEntityItem, OptionalRequestSenderIdResponseEntityItem):
    pass