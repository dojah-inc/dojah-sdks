/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using Dojah.Net.Client;

namespace Dojah.Net.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITZKYCApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Lookup TZ NIN
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="mothersLastName"> (optional)</param>
        /// <param name="mothersFirstName"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        Object GetNin(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), string mothersLastName = default(string), string mothersFirstName = default(string), int operationIndex = 0);

        /// <summary>
        /// Lookup TZ NIN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="mothersLastName"> (optional)</param>
        /// <param name="mothersFirstName"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        ApiResponse<Object> GetNinWithHttpInfo(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), string mothersLastName = default(string), string mothersFirstName = default(string), int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITZKYCApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Lookup TZ NIN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="mothersLastName"> (optional)</param>
        /// <param name="mothersFirstName"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        System.Threading.Tasks.Task<Object> GetNinAsync(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), string mothersLastName = default(string), string mothersFirstName = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Lookup TZ NIN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="mothersLastName"> (optional)</param>
        /// <param name="mothersFirstName"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetNinWithHttpInfoAsync(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), string mothersLastName = default(string), string mothersFirstName = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITZKYCApi : ITZKYCApiSync, ITZKYCApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class TZKYCApi : ITZKYCApi
    {
        private Dojah.Net.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="TZKYCApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TZKYCApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TZKYCApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TZKYCApi(string basePath)
        {
            this.Configuration = Dojah.Net.Client.Configuration.MergeConfigurations(
                Dojah.Net.Client.GlobalConfiguration.Instance,
                new Dojah.Net.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Dojah.Net.Client.ApiClient(this.Configuration);
            this.AsynchronousClient = new Dojah.Net.Client.ApiClient(this.Configuration);
            this.ExceptionFactory = Dojah.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TZKYCApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public TZKYCApi(Dojah.Net.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Dojah.Net.Client.Configuration.MergeConfigurations(
                Dojah.Net.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Dojah.Net.Client.ApiClient(this.Configuration);
            this.AsynchronousClient = new Dojah.Net.Client.ApiClient(this.Configuration);
            this.ExceptionFactory = Dojah.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TZKYCApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public TZKYCApi(Dojah.Net.Client.ISynchronousClient client, Dojah.Net.Client.IAsynchronousClient asyncClient, Dojah.Net.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Dojah.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Dojah.Net.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Dojah.Net.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Dojah.Net.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Dojah.Net.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Lookup TZ NIN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="mothersLastName"> (optional)</param>
        /// <param name="mothersFirstName"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        public Object GetNin(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), string mothersLastName = default(string), string mothersFirstName = default(string), int operationIndex = 0)
        {
            Dojah.Net.Client.ApiResponse<Object> localVarResponse = GetNinWithHttpInfo(firstName, lastName, dateOfBirth, mothersLastName, mothersFirstName);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Lookup TZ NIN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="mothersLastName"> (optional)</param>
        /// <param name="mothersFirstName"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        public Dojah.Net.Client.ApiResponse<Object> GetNinWithHttpInfo(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), string mothersLastName = default(string), string mothersFirstName = default(string), int operationIndex = 0)
        {
            Dojah.Net.Client.RequestOptions localVarRequestOptions = new Dojah.Net.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Dojah.Net.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Dojah.Net.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (firstName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "first_name", firstName, ""));
            }
            if (lastName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "last_name", lastName, ""));
            }
            if (dateOfBirth != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "date_of_birth", dateOfBirth, ""));
            }
            if (mothersLastName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "mothers_last_name", mothersLastName, ""));
            }
            if (mothersFirstName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "mothers_first_name", mothersFirstName, ""));
            }

            localVarRequestOptions.Operation = "TZKYCApi.GetNin";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apikeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }
            // authentication (appIdAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("AppId")))
            {
                localVarRequestOptions.HeaderParameters.Add("AppId", this.Configuration.GetApiKeyWithPrefix("AppId"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<Object>("/api/v1/tz/kyc/nin", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetNin", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Lookup TZ NIN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="mothersLastName"> (optional)</param>
        /// <param name="mothersFirstName"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        public async System.Threading.Tasks.Task<Object> GetNinAsync(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), string mothersLastName = default(string), string mothersFirstName = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Dojah.Net.Client.ApiResponse<Object> localVarResponse = await GetNinWithHttpInfoAsync(firstName, lastName, dateOfBirth, mothersLastName, mothersFirstName, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Lookup TZ NIN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="mothersLastName"> (optional)</param>
        /// <param name="mothersFirstName"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        public async System.Threading.Tasks.Task<Dojah.Net.Client.ApiResponse<Object>> GetNinWithHttpInfoAsync(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), string mothersLastName = default(string), string mothersFirstName = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            Dojah.Net.Client.RequestOptions localVarRequestOptions = new Dojah.Net.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Dojah.Net.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Dojah.Net.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (firstName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "first_name", firstName, ""));
            }
            if (lastName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "last_name", lastName, ""));
            }
            if (dateOfBirth != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "date_of_birth", dateOfBirth, ""));
            }
            if (mothersLastName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "mothers_last_name", mothersLastName, ""));
            }
            if (mothersFirstName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "mothers_first_name", mothersFirstName, ""));
            }

            localVarRequestOptions.Operation = "TZKYCApi.GetNin";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apikeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }
            // authentication (appIdAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("AppId")))
            {
                localVarRequestOptions.HeaderParameters.Add("AppId", this.Configuration.GetApiKeyWithPrefix("AppId"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Object>("/api/v1/tz/kyc/nin", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetNin", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
