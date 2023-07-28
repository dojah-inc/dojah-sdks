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

from dojah_client.type.fraud_get_email_reputation_response_entity_account_details_registered import FraudGetEmailReputationResponseEntityAccountDetailsRegistered
from dojah_client.type.fraud_get_email_reputation_response_entity_breach_details import FraudGetEmailReputationResponseEntityBreachDetails
from dojah_client.type.fraud_get_email_reputation_response_entity_details import FraudGetEmailReputationResponseEntityDetails
from dojah_client.type.fraud_get_email_reputation_response_entity_domain_details import FraudGetEmailReputationResponseEntityDomainDetails

class RequiredFraudGetEmailReputationResponseEntity(TypedDict):
    pass

class OptionalFraudGetEmailReputationResponseEntity(TypedDict, total=False):
    email: str

    reputation: str

    suspicious: bool

    references: typing.Union[int, float]

    details: FraudGetEmailReputationResponseEntityDetails

    score: typing.Union[int, float]

    deliverable: bool

    domain_details: FraudGetEmailReputationResponseEntityDomainDetails

    breach_details: FraudGetEmailReputationResponseEntityBreachDetails

    account_details_registered: FraudGetEmailReputationResponseEntityAccountDetailsRegistered

class FraudGetEmailReputationResponseEntity(RequiredFraudGetEmailReputationResponseEntity, OptionalFraudGetEmailReputationResponseEntity):
    pass