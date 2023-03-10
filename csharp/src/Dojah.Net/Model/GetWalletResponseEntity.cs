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
    /// GetWalletResponseEntity
    /// </summary>
    [DataContract(Name = "GetWalletResponse_entity")]
    public partial class GetWalletResponseEntity : IEquatable<GetWalletResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetWalletResponseEntity" /> class.
        /// </summary>
        /// <param name="walletId">walletId.</param>
        /// <param name="walletAmount">walletAmount.</param>
        /// <param name="accountNumber">accountNumber.</param>
        /// <param name="phoneNumber">phoneNumber.</param>
        /// <param name="bankName">bankName.</param>
        public GetWalletResponseEntity(string walletId = default(string), decimal walletAmount = default(decimal), string accountNumber = default(string), string phoneNumber = default(string), string bankName = default(string))
        {
            this.WalletId = walletId;
            this.WalletAmount = walletAmount;
            this.AccountNumber = accountNumber;
            this.PhoneNumber = phoneNumber;
            this.BankName = bankName;
        }

        /// <summary>
        /// Gets or Sets WalletId
        /// </summary>
        [DataMember(Name = "wallet_id", EmitDefaultValue = false)]
        public string WalletId { get; set; }

        /// <summary>
        /// Gets or Sets WalletAmount
        /// </summary>
        [DataMember(Name = "wallet_amount", EmitDefaultValue = false)]
        public decimal WalletAmount { get; set; }

        /// <summary>
        /// Gets or Sets AccountNumber
        /// </summary>
        [DataMember(Name = "account_number", EmitDefaultValue = false)]
        public string AccountNumber { get; set; }

        /// <summary>
        /// Gets or Sets PhoneNumber
        /// </summary>
        [DataMember(Name = "phone_number", EmitDefaultValue = false)]
        public string PhoneNumber { get; set; }

        /// <summary>
        /// Gets or Sets BankName
        /// </summary>
        [DataMember(Name = "bank_name", EmitDefaultValue = false)]
        public string BankName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetWalletResponseEntity {\n");
            sb.Append("  WalletId: ").Append(WalletId).Append("\n");
            sb.Append("  WalletAmount: ").Append(WalletAmount).Append("\n");
            sb.Append("  AccountNumber: ").Append(AccountNumber).Append("\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  BankName: ").Append(BankName).Append("\n");
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
            return this.Equals(input as GetWalletResponseEntity);
        }

        /// <summary>
        /// Returns true if GetWalletResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of GetWalletResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetWalletResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.WalletId == input.WalletId ||
                    (this.WalletId != null &&
                    this.WalletId.Equals(input.WalletId))
                ) && 
                (
                    this.WalletAmount == input.WalletAmount ||
                    this.WalletAmount.Equals(input.WalletAmount)
                ) && 
                (
                    this.AccountNumber == input.AccountNumber ||
                    (this.AccountNumber != null &&
                    this.AccountNumber.Equals(input.AccountNumber))
                ) && 
                (
                    this.PhoneNumber == input.PhoneNumber ||
                    (this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(input.PhoneNumber))
                ) && 
                (
                    this.BankName == input.BankName ||
                    (this.BankName != null &&
                    this.BankName.Equals(input.BankName))
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
                if (this.WalletId != null)
                {
                    hashCode = (hashCode * 59) + this.WalletId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.WalletAmount.GetHashCode();
                if (this.AccountNumber != null)
                {
                    hashCode = (hashCode * 59) + this.AccountNumber.GetHashCode();
                }
                if (this.PhoneNumber != null)
                {
                    hashCode = (hashCode * 59) + this.PhoneNumber.GetHashCode();
                }
                if (this.BankName != null)
                {
                    hashCode = (hashCode * 59) + this.BankName.GetHashCode();
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
