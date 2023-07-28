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


class RequiredFraudGetEmailReputationResponseEntityDomainDetails(TypedDict):
    pass

class OptionalFraudGetEmailReputationResponseEntityDomainDetails(TypedDict, total=False):
    domain: str

    tld: str

    registered: bool

    created: str

    updated: str

    expires: str

    registrar_name: str

    registered_to: typing.Optional[str]

    disposable: bool

    free: bool

    custom: bool

    dmarc_enforced: bool

    spf_strict: bool

    valid_mx: bool

    accept_all: bool

    suspicious_tld: bool

    website_exists: bool

class FraudGetEmailReputationResponseEntityDomainDetails(RequiredFraudGetEmailReputationResponseEntityDomainDetails, OptionalFraudGetEmailReputationResponseEntityDomainDetails):
    pass