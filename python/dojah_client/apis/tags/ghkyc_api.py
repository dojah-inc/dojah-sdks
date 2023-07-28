# coding: utf-8

"""
    DOJAH Publilc APIs

    Use Dojah to verify, onboard and manage user identity across Africa!

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from dojah_client.paths.api_v1_gh_kyc_dl.get import GetDriversLicense
from dojah_client.paths.api_v1_gh_kyc_passport.get import GetPassport
from dojah_client.paths.api_v1_gh_kyc_ssnit.get import GetSsnit
from dojah_client.paths.api_v1_gh_kyc_voter.get import GetVoter


class GHKYCApi(
    GetDriversLicense,
    GetPassport,
    GetSsnit,
    GetVoter,
):
    """NOTE:
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    pass