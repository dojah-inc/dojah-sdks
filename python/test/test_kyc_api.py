"""
    DOJAH APIs

    Use Dojah to verify, onboard and manage user identity across Africa!  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""


import unittest

import dojah_client
from dojah_client.api.kyc_api import KYCApi  # noqa: E501


class TestKYCApi(unittest.TestCase):
    """KYCApi unit test stubs"""

    def setUp(self):
        self.api = KYCApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_analyze_document(self):
        """Test case for analyze_document

        KYC - Document Analysis  # noqa: E501
        """
        pass

    def test_get_basic_bvn(self):
        """Test case for get_basic_bvn

        KYC - Get Basic BVN Info  # noqa: E501
        """
        pass

    def test_get_basic_phone_number(self):
        """Test case for get_basic_phone_number

        KYC Lookup Phone Number Basic  # noqa: E501
        """
        pass

    def test_get_drivers_license(self):
        """Test case for get_drivers_license

        KYC - Get Drivers License Info  # noqa: E501
        """
        pass

    def test_get_email_reputation(self):
        """Test case for get_email_reputation

        KYC - Get Email Reputation  # noqa: E501
        """
        pass

    def test_get_full_bvn(self):
        """Test case for get_full_bvn

        KYC - Lookup BVN Basic  # noqa: E501
        """
        pass

    def test_get_nuban(self):
        """Test case for get_nuban

        KYC - Get NUBAN Information  # noqa: E501
        """
        pass

    def test_get_passport(self):
        """Test case for get_passport

        KYC - Passport  # noqa: E501
        """
        pass

    def test_get_phone_number(self):
        """Test case for get_phone_number

        KYC - Lookup Phone Number  # noqa: E501
        """
        pass

    def test_get_premium_bvn(self):
        """Test case for get_premium_bvn

        KYC - Lookup BVN Premium  # noqa: E501
        """
        pass

    def test_get_vin(self):
        """Test case for get_vin

        KYC - Get VIN  # noqa: E501
        """
        pass

    def test_get_vnin(self):
        """Test case for get_vnin

        Lookup VNIN  # noqa: E501
        """
        pass

    def test_validate_bvn(self):
        """Test case for validate_bvn

        KYC - Validate BVN  # noqa: E501
        """
        pass

    def test_verify_age(self):
        """Test case for verify_age

        KYC - Age Verification  # noqa: E501
        """
        pass

    def test_verify_selfie_bvn(self):
        """Test case for verify_selfie_bvn

        KYC - Selfie BVN Verificatoin  # noqa: E501
        """
        pass

    def test_verify_selfie_nin(self):
        """Test case for verify_selfie_nin

        KYC - Selfie NIN Verification  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()