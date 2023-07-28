/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Dojah.Net.Client;
using Dojah.Net.Api;
// uncomment below to import models
//using Dojah.Net.Model;

namespace Dojah.Net.Test.Api
{
    /// <summary>
    ///  Class for testing NigeriaKYCApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class NigeriaKYCApiTests : IDisposable
    {
        private NigeriaKYCApi instance;

        public NigeriaKYCApiTests()
        {
            instance = new NigeriaKYCApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of NigeriaKYCApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' NigeriaKYCApi
            //Assert.IsType<NigeriaKYCApi>(instance);
        }

        /// <summary>
        /// Test GetBasicBvn
        /// </summary>
        [Fact]
        public void GetBasicBvnTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? bvn = null;
            //var response = instance.GetBasicBvn(bvn);
            //Assert.IsType<ValidateBvnResponse>(response);
        }

        /// <summary>
        /// Test GetBasicBvn1
        /// </summary>
        [Fact]
        public void GetBasicBvn1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? bvn = null;
            //var response = instance.GetBasicBvn1(bvn);
            //Assert.IsType<GetBasicBvnResponse>(response);
        }

        /// <summary>
        /// Test GetBasicPhoneNumber
        /// </summary>
        [Fact]
        public void GetBasicPhoneNumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? phoneNumber = null;
            //var response = instance.GetBasicPhoneNumber(phoneNumber);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test GetDriversLicense
        /// </summary>
        [Fact]
        public void GetDriversLicenseTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string licenseNumber = null;
            //var response = instance.GetDriversLicense(licenseNumber);
            //Assert.IsType<GetKycDriversLicenseResponse>(response);
        }

        /// <summary>
        /// Test GetNin
        /// </summary>
        [Fact]
        public void GetNinTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? nin = null;
            //var response = instance.GetNin(nin);
            //Assert.IsType<NigeriaKycGetNinResponse>(response);
        }

        /// <summary>
        /// Test GetNormalBvn
        /// </summary>
        [Fact]
        public void GetNormalBvnTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? bvn = null;
            //var response = instance.GetNormalBvn(bvn);
            //Assert.IsType<GetFullBvnResponse>(response);
        }

        /// <summary>
        /// Test GetNuban
        /// </summary>
        [Fact]
        public void GetNubanTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? bankCode = null;
            //int? accountNumber = null;
            //var response = instance.GetNuban(bankCode, accountNumber);
            //Assert.IsType<GetNubanResponse>(response);
        }

        /// <summary>
        /// Test GetPassport
        /// </summary>
        [Fact]
        public void GetPassportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string passportNumber = null;
            //string surname = null;
            //var response = instance.GetPassport(passportNumber, surname);
            //Assert.IsType<GetKycPassportResponse>(response);
        }

        /// <summary>
        /// Test GetPhoneNumber
        /// </summary>
        [Fact]
        public void GetPhoneNumberTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? phoneNumber = null;
            //var response = instance.GetPhoneNumber(phoneNumber);
            //Assert.IsType<GetPhoneNumberResponse>(response);
        }

        /// <summary>
        /// Test GetPremiumBvn
        /// </summary>
        [Fact]
        public void GetPremiumBvnTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? bvn = null;
            //var response = instance.GetPremiumBvn(bvn);
            //Assert.IsType<GetPremiumBvnResponse>(response);
        }

        /// <summary>
        /// Test GetVnin
        /// </summary>
        [Fact]
        public void GetVninTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string vnin = null;
            //var response = instance.GetVnin(vnin);
            //Assert.IsType<GetVninResponse>(response);
        }
    }
}