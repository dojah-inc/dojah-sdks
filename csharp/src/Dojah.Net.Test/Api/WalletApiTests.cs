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
    ///  Class for testing WalletApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class WalletApiTests : IDisposable
    {
        private WalletApi instance;

        public WalletApiTests()
        {
            instance = new WalletApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of WalletApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' WalletApi
            //Assert.IsType<WalletApi>(instance);
        }

        /// <summary>
        /// Test CreateWallet
        /// </summary>
        [Fact]
        public void CreateWalletTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateWalletRequest createWalletRequest = null;
            //var response = instance.CreateWallet(createWalletRequest);
            //Assert.IsType<CreateWalletResponse>(response);
        }

        /// <summary>
        /// Test CreditSubwallet
        /// </summary>
        [Fact]
        public void CreditSubwalletTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreditSubwalletRequest creditSubwalletRequest = null;
            //var response = instance.CreditSubwallet(creditSubwalletRequest);
            //Assert.IsType<CreditSubwalletResponse>(response);
        }

        /// <summary>
        /// Test GetTransaction
        /// </summary>
        [Fact]
        public void GetTransactionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string transactionId = null;
            //var response = instance.GetTransaction(transactionId);
            //Assert.IsType<GetTransactionResponse>(response);
        }

        /// <summary>
        /// Test GetWallet
        /// </summary>
        [Fact]
        public void GetWalletTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string walletId = null;
            //var response = instance.GetWallet(walletId);
            //Assert.IsType<GetWalletResponse>(response);
        }

        /// <summary>
        /// Test GetWallets
        /// </summary>
        [Fact]
        public void GetWalletsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string appId = null;
            //var response = instance.GetWallets(appId);
            //Assert.IsType<GetWalletsResponse>(response);
        }

        /// <summary>
        /// Test TransferFunds
        /// </summary>
        [Fact]
        public void TransferFundsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TransferFundsRequest transferFundsRequest = null;
            //var response = instance.TransferFunds(transferFundsRequest);
            //Assert.IsType<TransferFundsResponse>(response);
        }
    }
}