/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using Xunit;
using Dojah.Net.Client;
using Dojah.Net.Model;

namespace Dojah.Net.Test
{
    /// <remarks>
    /// Boilerplate for writing some simple tests
    /// </remarks>
    public class SimpleTests : IDisposable
    {
        public SimpleTests()
        {
            // Setup
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test Client Initialization
        /// </summary>
        [Fact]
        public void ClientTest()
        {

            DojahClient client = new DojahClient();
            // Configure custom BasePath if desired
            client.SetBasePath("https://api.dojah.io");
            // Configure API key authorization: apikeyAuth
            client.SetAuthorization("YOUR_API_KEY");
            // Configure API key authorization: appIdAuth
            client.SetAppId("YOUR_API_KEY");

            Assert.NotNull(client);
        }
    }
}