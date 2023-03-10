/*
 * DOJAH APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// GetWalletsResponseEntity
    /// </summary>
    [DataContract(Name = "GetWalletsResponse_entity")]
    public partial class GetWalletsResponseEntity : IEquatable<GetWalletsResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetWalletsResponseEntity" /> class.
        /// </summary>
        /// <param name="appId">appId.</param>
        /// <param name="totalAmount">totalAmount.</param>
        /// <param name="clientWallets">clientWallets.</param>
        public GetWalletsResponseEntity(string appId = default(string), decimal totalAmount = default(decimal), List<GetWalletResponseEntity> clientWallets = default(List<GetWalletResponseEntity>))
        {
            this.AppId = appId;
            this.TotalAmount = totalAmount;
            this.ClientWallets = clientWallets;
        }

        /// <summary>
        /// Gets or Sets AppId
        /// </summary>
        [DataMember(Name = "app_id", EmitDefaultValue = false)]
        public string AppId { get; set; }

        /// <summary>
        /// Gets or Sets TotalAmount
        /// </summary>
        [DataMember(Name = "total_amount", EmitDefaultValue = false)]
        public decimal TotalAmount { get; set; }

        /// <summary>
        /// Gets or Sets ClientWallets
        /// </summary>
        [DataMember(Name = "client_wallets", EmitDefaultValue = false)]
        public List<GetWalletResponseEntity> ClientWallets { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetWalletsResponseEntity {\n");
            sb.Append("  AppId: ").Append(AppId).Append("\n");
            sb.Append("  TotalAmount: ").Append(TotalAmount).Append("\n");
            sb.Append("  ClientWallets: ").Append(ClientWallets).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GetWalletsResponseEntity);
        }

        /// <summary>
        /// Returns true if GetWalletsResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of GetWalletsResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetWalletsResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AppId == input.AppId ||
                    (this.AppId != null &&
                    this.AppId.Equals(input.AppId))
                ) && 
                (
                    this.TotalAmount == input.TotalAmount ||
                    this.TotalAmount.Equals(input.TotalAmount)
                ) && 
                (
                    this.ClientWallets == input.ClientWallets ||
                    this.ClientWallets != null &&
                    input.ClientWallets != null &&
                    this.ClientWallets.SequenceEqual(input.ClientWallets)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AppId != null)
                {
                    hashCode = (hashCode * 59) + this.AppId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TotalAmount.GetHashCode();
                if (this.ClientWallets != null)
                {
                    hashCode = (hashCode * 59) + this.ClientWallets.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
