/*
 * DOJAH APIs
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
    ///  Class for testing GeneralApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class GeneralApiTests : IDisposable
    {
        private GeneralApi instance;

        public GeneralApiTests()
        {
            instance = new GeneralApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of GeneralApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' GeneralApi
            //Assert.IsType<GeneralApi>(instance);
        }

        /// <summary>
        /// Test GetBanks
        /// </summary>
        [Fact]
        public void GetBanksTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetBanks();
            //Assert.IsType<GetBanksResponse>(response);
        }

        /// <summary>
        /// Test GetBin
        /// </summary>
        [Fact]
        public void GetBinTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? cardBin = null;
            //var response = instance.GetBin(cardBin);
            //Assert.IsType<GetBinResponse>(response);
        }

        /// <summary>
        /// Test GetDataPlans
        /// </summary>
        [Fact]
        public void GetDataPlansTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetDataPlans();
            //Assert.IsType<GetDataPlansResponse>(response);
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
            //Assert.IsType<GeneralGetNubanResponse>(response);
        }

        /// <summary>
        /// Test GetWalletBalance
        /// </summary>
        [Fact]
        public void GetWalletBalanceTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetWalletBalance();
            //Assert.IsType<GetWalletBalanceResponse>(response);
        }

        /// <summary>
        /// Test PurchaseAirtime
        /// </summary>
        [Fact]
        public void PurchaseAirtimeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //PurchaseAirtimeRequest purchaseAirtimeRequest = null;
            //var response = instance.PurchaseAirtime(purchaseAirtimeRequest);
            //Assert.IsType<PurchaseAirtimeResponse>(response);
        }

        /// <summary>
        /// Test PurchaseData
        /// </summary>
        [Fact]
        public void PurchaseDataTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //PurchaseDataRequest purchaseDataRequest = null;
            //var response = instance.PurchaseData(purchaseDataRequest);
            //Assert.IsType<PurchaseDataResponse>(response);
        }
    }
}
