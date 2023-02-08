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
    ///  Class for testing ServicesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ServicesApiTests : IDisposable
    {
        private ServicesApi instance;

        public ServicesApiTests()
        {
            instance = new ServicesApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ServicesApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ServicesApi
            //Assert.IsType<ServicesApi>(instance);
        }

        /// <summary>
        /// Test CategorizeTransactions
        /// </summary>
        [Fact]
        public void CategorizeTransactionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CategorizeTransactionsRequest categorizeTransactionsRequest = null;
            //var response = instance.CategorizeTransactions(categorizeTransactionsRequest);
            //Assert.IsType<CategorizeTransactionsResponse>(response);
        }
    }
}
