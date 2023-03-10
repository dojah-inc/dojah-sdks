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
    /// TransferFundsRequest
    /// </summary>
    [DataContract(Name = "TransferFundsRequest")]
    public partial class TransferFundsRequest : IEquatable<TransferFundsRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TransferFundsRequest" /> class.
        /// </summary>
        /// <param name="amount">amount.</param>
        /// <param name="recipientBankCode">recipientBankCode.</param>
        /// <param name="recipientAccountNumber">recipientAccountNumber.</param>
        /// <param name="walletId">walletId.</param>
        public TransferFundsRequest(string amount = default(string), string recipientBankCode = default(string), string recipientAccountNumber = default(string), string walletId = default(string))
        {
            this.Amount = amount;
            this.RecipientBankCode = recipientBankCode;
            this.RecipientAccountNumber = recipientAccountNumber;
            this.WalletId = walletId;
        }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "amount", EmitDefaultValue = false)]
        public string Amount { get; set; }

        /// <summary>
        /// Gets or Sets RecipientBankCode
        /// </summary>
        [DataMember(Name = "recipient_bank_code", EmitDefaultValue = false)]
        public string RecipientBankCode { get; set; }

        /// <summary>
        /// Gets or Sets RecipientAccountNumber
        /// </summary>
        [DataMember(Name = "recipient_account_number", EmitDefaultValue = false)]
        public string RecipientAccountNumber { get; set; }

        /// <summary>
        /// Gets or Sets WalletId
        /// </summary>
        [DataMember(Name = "wallet_id", EmitDefaultValue = false)]
        public string WalletId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TransferFundsRequest {\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  RecipientBankCode: ").Append(RecipientBankCode).Append("\n");
            sb.Append("  RecipientAccountNumber: ").Append(RecipientAccountNumber).Append("\n");
            sb.Append("  WalletId: ").Append(WalletId).Append("\n");
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
            return this.Equals(input as TransferFundsRequest);
        }

        /// <summary>
        /// Returns true if TransferFundsRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of TransferFundsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TransferFundsRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.RecipientBankCode == input.RecipientBankCode ||
                    (this.RecipientBankCode != null &&
                    this.RecipientBankCode.Equals(input.RecipientBankCode))
                ) && 
                (
                    this.RecipientAccountNumber == input.RecipientAccountNumber ||
                    (this.RecipientAccountNumber != null &&
                    this.RecipientAccountNumber.Equals(input.RecipientAccountNumber))
                ) && 
                (
                    this.WalletId == input.WalletId ||
                    (this.WalletId != null &&
                    this.WalletId.Equals(input.WalletId))
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
                if (this.Amount != null)
                {
                    hashCode = (hashCode * 59) + this.Amount.GetHashCode();
                }
                if (this.RecipientBankCode != null)
                {
                    hashCode = (hashCode * 59) + this.RecipientBankCode.GetHashCode();
                }
                if (this.RecipientAccountNumber != null)
                {
                    hashCode = (hashCode * 59) + this.RecipientAccountNumber.GetHashCode();
                }
                if (this.WalletId != null)
                {
                    hashCode = (hashCode * 59) + this.WalletId.GetHashCode();
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