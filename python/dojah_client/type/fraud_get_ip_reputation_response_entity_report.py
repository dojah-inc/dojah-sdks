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

from dojah_client.type.fraud_get_ip_reputation_response_entity_report_anonymity import FraudGetIpReputationResponseEntityReportAnonymity
from dojah_client.type.fraud_get_ip_reputation_response_entity_report_blacklists import FraudGetIpReputationResponseEntityReportBlacklists
from dojah_client.type.fraud_get_ip_reputation_response_entity_report_information import FraudGetIpReputationResponseEntityReportInformation
from dojah_client.type.fraud_get_ip_reputation_response_entity_report_risk_score import FraudGetIpReputationResponseEntityReportRiskScore

class RequiredFraudGetIpReputationResponseEntityReport(TypedDict):
    pass

class OptionalFraudGetIpReputationResponseEntityReport(TypedDict, total=False):
    ip: str

    blacklists: FraudGetIpReputationResponseEntityReportBlacklists

    information: FraudGetIpReputationResponseEntityReportInformation

    anonymity: FraudGetIpReputationResponseEntityReportAnonymity

    risk_score: FraudGetIpReputationResponseEntityReportRiskScore

class FraudGetIpReputationResponseEntityReport(RequiredFraudGetIpReputationResponseEntityReport, OptionalFraudGetIpReputationResponseEntityReport):
    pass