/*
 * DOJAH APIs
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
using Dojah.Net.Model;

namespace Dojah.Net.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IKEKYCApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// KYC - National ID
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"> (optional)</param>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="middleName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="gender"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetNationalIdResponse</returns>
        GetNationalIdResponse GetNationalId(int? id = default(int?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string dateOfBirth = default(string), string gender = default(string), int operationIndex = 0);

        /// <summary>
        /// KYC - National ID
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"> (optional)</param>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="middleName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="gender"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetNationalIdResponse</returns>
        ApiResponse<GetNationalIdResponse> GetNationalIdWithHttpInfo(int? id = default(int?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string dateOfBirth = default(string), string gender = default(string), int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IKEKYCApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// KYC - National ID
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"> (optional)</param>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="middleName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="gender"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetNationalIdResponse</returns>
        System.Threading.Tasks.Task<GetNationalIdResponse> GetNationalIdAsync(int? id = default(int?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string dateOfBirth = default(string), string gender = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// KYC - National ID
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"> (optional)</param>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="middleName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="gender"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetNationalIdResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<GetNationalIdResponse>> GetNationalIdWithHttpInfoAsync(int? id = default(int?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string dateOfBirth = default(string), string gender = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IKEKYCApi : IKEKYCApiSync, IKEKYCApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class KEKYCApi : IKEKYCApi
    {
        private Dojah.Net.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="KEKYCApi"/> class.
        /// </summary>
        /// <returns></returns>
        public KEKYCApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="KEKYCApi"/> class.
        /// </summary>
        /// <returns></returns>
        public KEKYCApi(string basePath)
        {
            this.Configuration = Dojah.Net.Client.Configuration.MergeConfigurations(
                Dojah.Net.Client.GlobalConfiguration.Instance,
                new Dojah.Net.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Dojah.Net.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Dojah.Net.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Dojah.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="KEKYCApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public KEKYCApi(Dojah.Net.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Dojah.Net.Client.Configuration.MergeConfigurations(
                Dojah.Net.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Dojah.Net.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Dojah.Net.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Dojah.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="KEKYCApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public KEKYCApi(Dojah.Net.Client.ISynchronousClient client, Dojah.Net.Client.IAsynchronousClient asyncClient, Dojah.Net.Client.IReadableConfiguration configuration)
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
        /// KYC - National ID 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"> (optional)</param>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="middleName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="gender"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetNationalIdResponse</returns>
        public GetNationalIdResponse GetNationalId(int? id = default(int?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string dateOfBirth = default(string), string gender = default(string), int operationIndex = 0)
        {
            Dojah.Net.Client.ApiResponse<GetNationalIdResponse> localVarResponse = GetNationalIdWithHttpInfo(id, firstName, lastName, middleName, dateOfBirth, gender);
            return localVarResponse.Data;
        }

        /// <summary>
        /// KYC - National ID 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"> (optional)</param>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="middleName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="gender"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetNationalIdResponse</returns>
        public Dojah.Net.Client.ApiResponse<GetNationalIdResponse> GetNationalIdWithHttpInfo(int? id = default(int?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string dateOfBirth = default(string), string gender = default(string), int operationIndex = 0)
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

            if (id != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "id", id));
            }
            if (firstName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "first_name", firstName));
            }
            if (lastName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "last_name", lastName));
            }
            if (middleName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "middle_name", middleName));
            }
            if (dateOfBirth != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "date_of_birth", dateOfBirth));
            }
            if (gender != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "gender", gender));
            }

            localVarRequestOptions.Operation = "KEKYCApi.GetNationalId";
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
            var localVarResponse = this.Client.Get<GetNationalIdResponse>("/api/v1/ke/kyc/id", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetNationalId", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// KYC - National ID 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"> (optional)</param>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="middleName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="gender"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetNationalIdResponse</returns>
        public async System.Threading.Tasks.Task<GetNationalIdResponse> GetNationalIdAsync(int? id = default(int?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string dateOfBirth = default(string), string gender = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Dojah.Net.Client.ApiResponse<GetNationalIdResponse> localVarResponse = await GetNationalIdWithHttpInfoAsync(id, firstName, lastName, middleName, dateOfBirth, gender, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// KYC - National ID 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"> (optional)</param>
        /// <param name="firstName"> (optional)</param>
        /// <param name="lastName"> (optional)</param>
        /// <param name="middleName"> (optional)</param>
        /// <param name="dateOfBirth"> (optional)</param>
        /// <param name="gender"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetNationalIdResponse)</returns>
        public async System.Threading.Tasks.Task<Dojah.Net.Client.ApiResponse<GetNationalIdResponse>> GetNationalIdWithHttpInfoAsync(int? id = default(int?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string dateOfBirth = default(string), string gender = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
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

            if (id != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "id", id));
            }
            if (firstName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "first_name", firstName));
            }
            if (lastName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "last_name", lastName));
            }
            if (middleName != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "middle_name", middleName));
            }
            if (dateOfBirth != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "date_of_birth", dateOfBirth));
            }
            if (gender != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "gender", gender));
            }

            localVarRequestOptions.Operation = "KEKYCApi.GetNationalId";
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
            var localVarResponse = await this.AsynchronousClient.GetAsync<GetNationalIdResponse>("/api/v1/ke/kyc/id", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetNationalId", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}