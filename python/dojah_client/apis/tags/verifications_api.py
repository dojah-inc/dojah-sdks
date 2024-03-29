# coding: utf-8

"""
    DOJAH Publilc APIs

    Use Dojah to verify, onboard and manage user identity across Africa!

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from dojah_client.paths.v1_kyc_bvn.get import ValidateBvn
from dojah_client.paths.v1_kyc_age_verification.get import VerifyAge
from dojah_client.paths.v1_kyc_bvn_verify.post import VerifySelfieBvn
from dojah_client.paths.api_v1_kyc_nin_verify.post import VerifySelfieNin
from dojah_client.paths.api_v1_kyc_vnin_verify.post import VerifySelfieVnin


class VerificationsApi(
    ValidateBvn,
    VerifyAge,
    VerifySelfieBvn,
    VerifySelfieNin,
    VerifySelfieVnin,
):
    """NOTE:
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    pass
