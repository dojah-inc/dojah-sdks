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


class RequiredFraudGetIpReputationResponseEntityReportInformation(TypedDict):
    pass

class OptionalFraudGetIpReputationResponseEntityReportInformation(TypedDict, total=False):
    reverse_dns: str

    continent_code: str

    continent_name: str

    country_code: str

    country_name: str

    country_currency: str

    country_calling_code: str

    region_name: str

    city_name: str

    latitude: typing.Union[int, float]

    longitude: typing.Union[int, float]

    isp: str

    asn: str

class FraudGetIpReputationResponseEntityReportInformation(RequiredFraudGetIpReputationResponseEntityReportInformation, OptionalFraudGetIpReputationResponseEntityReportInformation):
    pass