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
using Dojah.Net.Model;

namespace Dojah.Net.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGeneralApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// General - Get Banks
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetBanksResponse</returns>
        GetBanksResponse GetBanks(int operationIndex = 0);

        /// <summary>
        /// General - Get Banks
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetBanksResponse</returns>
        ApiResponse<GetBanksResponse> GetBanksWithHttpInfo(int operationIndex = 0);
        /// <summary>
        /// General Resolve BIN
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cardBin"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetBinResponse</returns>
        GetBinResponse GetBin(int? cardBin = default(int?), int operationIndex = 0);

        /// <summary>
        /// General Resolve BIN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cardBin"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetBinResponse</returns>
        ApiResponse<GetBinResponse> GetBinWithHttpInfo(int? cardBin = default(int?), int operationIndex = 0);
        /// <summary>
        /// General Resolve NUBAN
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bankCode"> (optional)</param>
        /// <param name="accountNumber"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GeneralGetNubanResponse</returns>
        GeneralGetNubanResponse GetNuban(int? bankCode = default(int?), int? accountNumber = default(int?), int operationIndex = 0);

        /// <summary>
        /// General Resolve NUBAN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bankCode"> (optional)</param>
        /// <param name="accountNumber"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GeneralGetNubanResponse</returns>
        ApiResponse<GeneralGetNubanResponse> GetNubanWithHttpInfo(int? bankCode = default(int?), int? accountNumber = default(int?), int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGeneralApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// General - Get Banks
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetBanksResponse</returns>
        System.Threading.Tasks.Task<GetBanksResponse> GetBanksAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// General - Get Banks
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetBanksResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<GetBanksResponse>> GetBanksWithHttpInfoAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// General Resolve BIN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cardBin"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetBinResponse</returns>
        System.Threading.Tasks.Task<GetBinResponse> GetBinAsync(int? cardBin = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// General Resolve BIN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cardBin"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetBinResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<GetBinResponse>> GetBinWithHttpInfoAsync(int? cardBin = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// General Resolve NUBAN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bankCode"> (optional)</param>
        /// <param name="accountNumber"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GeneralGetNubanResponse</returns>
        System.Threading.Tasks.Task<GeneralGetNubanResponse> GetNubanAsync(int? bankCode = default(int?), int? accountNumber = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// General Resolve NUBAN
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bankCode"> (optional)</param>
        /// <param name="accountNumber"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GeneralGetNubanResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<GeneralGetNubanResponse>> GetNubanWithHttpInfoAsync(int? bankCode = default(int?), int? accountNumber = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGeneralApi : IGeneralApiSync, IGeneralApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class GeneralApi : IGeneralApi
    {
        private Dojah.Net.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="GeneralApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GeneralApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GeneralApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GeneralApi(string basePath)
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
        /// Initializes a new instance of the <see cref="GeneralApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public GeneralApi(Dojah.Net.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="GeneralApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public GeneralApi(Dojah.Net.Client.ISynchronousClient client, Dojah.Net.Client.IAsynchronousClient asyncClient, Dojah.Net.Client.IReadableConfiguration configuration)
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
        /// General - Get Banks 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetBanksResponse</returns>
        public GetBanksResponse GetBanks(int operationIndex = 0)
        {
            Dojah.Net.Client.ApiResponse<GetBanksResponse> localVarResponse = GetBanksWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        /// General - Get Banks 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetBanksResponse</returns>
        public Dojah.Net.Client.ApiResponse<GetBanksResponse> GetBanksWithHttpInfo(int operationIndex = 0)
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


            localVarRequestOptions.Operation = "GeneralApi.GetBanks";
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
            var localVarResponse = this.Client.Get<GetBanksResponse>("/v1/general/banks", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBanks", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// General - Get Banks 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetBanksResponse</returns>
        public async System.Threading.Tasks.Task<GetBanksResponse> GetBanksAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Dojah.Net.Client.ApiResponse<GetBanksResponse> localVarResponse = await GetBanksWithHttpInfoAsync(operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// General - Get Banks 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetBanksResponse)</returns>
        public async System.Threading.Tasks.Task<Dojah.Net.Client.ApiResponse<GetBanksResponse>> GetBanksWithHttpInfoAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
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


            localVarRequestOptions.Operation = "GeneralApi.GetBanks";
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
            var localVarResponse = await this.AsynchronousClient.GetAsync<GetBanksResponse>("/v1/general/banks", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBanks", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// General Resolve BIN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cardBin"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetBinResponse</returns>
        public GetBinResponse GetBin(int? cardBin = default(int?), int operationIndex = 0)
        {
            Dojah.Net.Client.ApiResponse<GetBinResponse> localVarResponse = GetBinWithHttpInfo(cardBin);
            return localVarResponse.Data;
        }

        /// <summary>
        /// General Resolve BIN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cardBin"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetBinResponse</returns>
        public Dojah.Net.Client.ApiResponse<GetBinResponse> GetBinWithHttpInfo(int? cardBin = default(int?), int operationIndex = 0)
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

            if (cardBin != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "card_bin", cardBin, ""));
            }

            localVarRequestOptions.Operation = "GeneralApi.GetBin";
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
            var localVarResponse = this.Client.Get<GetBinResponse>("/v1/general/bin", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBin", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// General Resolve BIN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cardBin"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetBinResponse</returns>
        public async System.Threading.Tasks.Task<GetBinResponse> GetBinAsync(int? cardBin = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Dojah.Net.Client.ApiResponse<GetBinResponse> localVarResponse = await GetBinWithHttpInfoAsync(cardBin, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// General Resolve BIN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cardBin"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetBinResponse)</returns>
        public async System.Threading.Tasks.Task<Dojah.Net.Client.ApiResponse<GetBinResponse>> GetBinWithHttpInfoAsync(int? cardBin = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
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

            if (cardBin != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "card_bin", cardBin, ""));
            }

            localVarRequestOptions.Operation = "GeneralApi.GetBin";
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
            var localVarResponse = await this.AsynchronousClient.GetAsync<GetBinResponse>("/v1/general/bin", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBin", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// General Resolve NUBAN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bankCode"> (optional)</param>
        /// <param name="accountNumber"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GeneralGetNubanResponse</returns>
        public GeneralGetNubanResponse GetNuban(int? bankCode = default(int?), int? accountNumber = default(int?), int operationIndex = 0)
        {
            Dojah.Net.Client.ApiResponse<GeneralGetNubanResponse> localVarResponse = GetNubanWithHttpInfo(bankCode, accountNumber);
            return localVarResponse.Data;
        }

        /// <summary>
        /// General Resolve NUBAN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bankCode"> (optional)</param>
        /// <param name="accountNumber"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GeneralGetNubanResponse</returns>
        public Dojah.Net.Client.ApiResponse<GeneralGetNubanResponse> GetNubanWithHttpInfo(int? bankCode = default(int?), int? accountNumber = default(int?), int operationIndex = 0)
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

            if (bankCode != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "bank_code", bankCode, ""));
            }
            if (accountNumber != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "account_number", accountNumber, ""));
            }

            localVarRequestOptions.Operation = "GeneralApi.GetNuban";
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
            var localVarResponse = this.Client.Get<GeneralGetNubanResponse>("/api/v1/general/account", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetNuban", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// General Resolve NUBAN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bankCode"> (optional)</param>
        /// <param name="accountNumber"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GeneralGetNubanResponse</returns>
        public async System.Threading.Tasks.Task<GeneralGetNubanResponse> GetNubanAsync(int? bankCode = default(int?), int? accountNumber = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Dojah.Net.Client.ApiResponse<GeneralGetNubanResponse> localVarResponse = await GetNubanWithHttpInfoAsync(bankCode, accountNumber, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// General Resolve NUBAN 
        /// </summary>
        /// <exception cref="Dojah.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bankCode"> (optional)</param>
        /// <param name="accountNumber"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GeneralGetNubanResponse)</returns>
        public async System.Threading.Tasks.Task<Dojah.Net.Client.ApiResponse<GeneralGetNubanResponse>> GetNubanWithHttpInfoAsync(int? bankCode = default(int?), int? accountNumber = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
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

            if (bankCode != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "bank_code", bankCode, ""));
            }
            if (accountNumber != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dojah.Net.Client.ClientUtils.ParameterToMultiMap("", "account_number", accountNumber, ""));
            }

            localVarRequestOptions.Operation = "GeneralApi.GetNuban";
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
            var localVarResponse = await this.AsynchronousClient.GetAsync<GeneralGetNubanResponse>("/api/v1/general/account", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetNuban", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
